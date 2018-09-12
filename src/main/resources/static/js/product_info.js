function zoomIn(event) {
    var zoom = 2;
    var element = document.getElementById("overlay");
    element.style.display = "inline-block";
    var img = document.getElementById("imgZoom");
    var posX = event.offsetX / img.width;
    var posY = event.offsetY / img.height;
    element.style.backgroundSize = (img.width * zoom) + "px " + (img.height * zoom) + "px";
    element.style.backgroundPosition = (posX * 100) + "% " + (posY * 100) + "%";
}

function zoomOut() {
    var element = document.getElementById("overlay");
    element.style.display = "none";
}