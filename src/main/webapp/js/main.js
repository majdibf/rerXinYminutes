$(document).ready(function(){
	var start = new Date();
	setInterval(function() {
		var time = new Date();
	    $('#currentTime').text(time.toLocaleTimeString());
	}, 1000);
});
