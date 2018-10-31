function loadservant(id) {
    $.getJSON("/servant/restservices/servants/" + id, function(servant) {
        document.title = servant.name;
        const {id,name,title,region,gender,servantclass,attack,defense,height,weight,description,appearance,biography} = servant;
        $(".w3-display-container").append(
            `<img src=imgs/${id}.png style=width:100% alt=Avatar>` +
            `<div class=\"w3-display-bottomleft w3-container w3-text-black\" style=color:black;>` +
            `<h2><span style=background-color:rgba(255,255,255,0.5);>${name}</span></h2></div>`
        );
        $("#about").append(
            `<p><i class=\"fas fa-user\" style=font-size:24px></i>&emsp;${title}</p>` +
            `<p><i class=\"fa fa-home\" style=font-size:24px></i>&emsp;${region}</p>` +
            `<p><i class=\"fas fa-male\" style=font-size:24px></i>&emsp;&emsp;${gender}</p>` +
            `<p><i class=\"fas fa-user-md\" style=font-size:24px></i>&emsp;${servantclass}</p><hr>` +
            `<p class=w3-large style=color:goldenrod;><b><i class=\"fas fa-shield-alt\" style=font-size:24px;></i></i>&emsp;Stats</b></p>` +
            `Attack: &emsp;${attack}<br>` +
            `Defense:&nbsp;    ${defense}<br>` +
            `<p class=w3-large w3-text-theme style=color:goldenrod;><b><i class=\"fa fa-heartbeat\" style=font-size:24px></i>&emsp;Medical Info</b></p>` +
            `<p><i class=\"fas fa-arrows-alt-v\" style=font-size:24px></i>&emsp;&emsp;${height}</p>` +
            `<p><i class=\"fas fa-weight\" style=font-size:24px></i>&emsp; ${weight}</p><br>`);

        $("#detail").append(
            `<div id=idapcontainer class=\"w3-container w3-card w3-white w3-margin-bottom\">` +
            `<div class=w3-container>` +
            `<h2 class=w3-text-grey w3-padding-16><i class=\"fas fa-user w3-margin-right w3-xxlarge w3-text-blue\"></i>About ${name}</h2>` +
            `<div class=w3-container><h5 id=identity class=w3-opacity><b style=color:goldenrod;>Identity</b></h5>` +
            `<p>${description}</p><hr></div>` +
            `<div class=w3-container><h5 id=appearance class=w3-opacity><b style=color:goldenrod;>Appearance</b></h5>` +
            `<p>${appearance}</p><hr></div></div></div>` +
            `<div id =biography class=\"w3-container w3-card w3-white\">` +
            `<h2 class=\"w3-text-grey w3-padding-16\"><i class=\"fa fa-certificate fa-fw w3-margin-right w3-xxlarge w3-text-blue\"></i>Biography</h2>` +
            `<div id=biography class=w3-container>` +
            `<p>${biography}</p></div></div></div>`);
    });
}