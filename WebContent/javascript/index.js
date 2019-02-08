function loadservants(batch){
	$.getJSON("/servant/restservices/servants?batch="+batch, function(data){
		$.each(data, function(i, servant){
			$("#servants").append("<div style=margin:8px; class=\"w3-quarter w3-card w3-hover-shadow\">" +
					"<a href="+servant.id+".html><img src=imgs/"+servant.id+".png alt=Sandwich style=width:100%></a>" +
					" <h3>"+servant.name+"</h3>" +
					" <p class=descriptiontext>"+servant.shortdesc+"</p></div>"
);
		});

});
} 

var Lst;
