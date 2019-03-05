function openNav() {
    if (window.getComputedStyle(document.querySelector("#sidenav")).width !== "300px") {
        document.getElementById("sidenav").style.width = "300px";
        if (window.getComputedStyle(document.querySelector("#body")).direction === "rtl") {
            document.getElementById("contents").style.marginRight = "300px";
            document.getElementById("contents").style.marginLeft = "0px";
        } else {
            document.getElementById("contents").style.marginLeft = "300px";
            document.getElementById("contents").style.marginRight = "0px";
        }
    } else {
        document.getElementById("sidenav").style.width = "0px";
        document.getElementById("contents").style.margin = "0px";
    }
}