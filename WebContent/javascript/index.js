function loadservants(batch,row){
	$.getJSON("/servant/restservices/servants?batch="+batch, function(data){
		$.each(data, function(i, servant){
			$("#servants"+row).append("<div class=w3-quarter>" +
					"<a href="+servant.id+".html><img src=imgs/"+servant.id+".png alt=Sandwich style=width:100%></a>" +
					" <h3>"+servant.name+"</h3>" +
					" <p>"+servant.shortdesc+"</p></div>"
);
		});

});
} 

var Lst;

function CngClass(obj) {
    elements = document.getElementsByClassName("active");
    for (var i = 0; i < elements.length; i++) {
        elements[i].className = 'w3-bar-item w3-button w3-hover-black';
    }
    obj.className = '"w3-bar-item w3-black w3-button"';
    Lst = obj;
}