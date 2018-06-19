function loadservants(){
		$.getJSON("/servant/restservices/servants", function(data){
			$.each(data, function(i, product){
				$("#servants").append("<div class=w3-quarter>" +
						"<img src=/w3images/sandwich.jpg alt=Sandwich style=width:100%>" +
						" <h3>"+servant.name+"</h3>" +
						" <p>Just some random text, lorem ipsum text praesent tincidunt ipsum lipsum.</p></div>"
);
			});

	});
} 
loadservants();