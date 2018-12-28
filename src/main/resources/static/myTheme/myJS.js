window.onscroll=function(){minimize()};
window.onresize=function(){resize()};

function minimize() {

	if (document.body.scrollTop>40 || document.documentElement.scrollTop>40) {
		document.getElementById("header1").style.height="0px";
		document.getElementById("header1").style.padding="0px";
		document.getElementById("header2").style.margin="0px";
		document.getElementById("header1").style.visibility="hidden";
		document.getElementById("header2").style.top="-1px";
		document.getElementById("dis").style.visibility="visible";
		document.getElementById("logo2").style.visibility="visible";

		
	}
	else{
		document.getElementById("header1").style.visibility="visible";
		document.getElementById("header1").style.height="49px";
		document.getElementById("header2").style.top="0px";
		document.getElementById("dis").style.visibility="hidden";
		document.getElementById("logo2").style.visibility="hidden";

	}
}
function resize(){
	if (window.innerWidth<1000) {
		document.getElementById("toz").style.width="300px";
		document.getElementById("topsrch").style.width="300px";
		document.getElementById("topsrch").style.margin="0px";
	}
	if (window.innerWidth>1000) {
		document.getElementById("topsrch").style.margin="300px";
		document.getElementById("toz").style.width="500px";
		document.getElementById("topsrch").style.margin="300px";
	}
}