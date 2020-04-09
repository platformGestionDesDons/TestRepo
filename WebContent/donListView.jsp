<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Don List</title>
<link rel="icon" type="image/x-icon" href="favicon.ico" />

<!-- Font -->
<link rel='stylesheet'
	href='http://fonts.googleapis.com/css?family=Arimo:300,400,700,400italic,700italic'
	media="none" onload="if(media!='all')media='all'">
<link href='http://fonts.googleapis.com/css?family=Oswald:400,300,700'
	rel='stylesheet' type='text/css' media="none"
	onload="if(media!='all')media='all'">
<!-- Font Awesome Icons -->
<link href='assets/css/font-awesome.min.css' async rel='stylesheet'
	type='text/css' media="none" onload="if(media!='all')media='all'" />
<!-- Bootstrap core CSS -->
<link href="assets/css/bootstrap.min.css" rel="stylesheet">
<link href="assets/css/bootstrap-datetimepicker.min.css"
	rel="stylesheet">
<link href="assets/css/hover-dropdown-menu.css" rel="stylesheet">
<!-- Icomoon Icons -->
<link href="assets/css/icons.css" rel="stylesheet" media="none"
	onload="if(media!='all')media='all'" />
<!-- Revolution Slider -->
<link href="assets/css/revolution-slider.css" rel="stylesheet" />
<link href="assets/rs-plugin/css/settings.css" rel="stylesheet"
	media="none" onload="if(media!='all')media='all'" />
<!-- Animations -->
<link href="assets/css/animate.min.css" rel="stylesheet">
<!-- Owl Carousel Slider -->
<!-- PrettyPhoto Popup -->
<link href="assets/css/prettyPhoto.css" rel="stylesheet" media="none"
	onload="if(media!='all')media='all'" />

<link rel="stylesheet" type="text/css"
	href="assets/css/cookieconsent.min.css" media="none"
	onload="if(media!='all')media='all'" />
<!-- Custom Style -->
<link href="assets/css/style.css" async rel="stylesheet">
<link href="assets/css/scarlet.css" rel="stylesheet">
<link href="assets/css/menu.css" rel="stylesheet">
<link href="assets/css/bootstrap-social.css" rel="stylesheet"
	media="none" onload="if(media!='all')media='all'" />
<link href="assets/css/responsive.css" rel="stylesheet" />
<!-- token -->
<link href="assets/tokenfield/css/bootstrap-tokenfield.css"
	rel="stylesheet" media="none" onload="if(media!='all')media='all'">
<!-- fancy Select -->
<link href="assets/css/fancySelect.css" rel="stylesheet" media="none"
	onload="if(media!='all')media='all'" />
<link href="assets/select2/css/select2.min.css" rel="stylesheet"
	media="none" onload="if(media!='all')media='all'" />
<!-- fancy Box -->
<link rel="stylesheet" href="assets/fancybox/jquery.fancybox.css"
	type="text/css" media="screen" media="none"
	onload="if(media!='all')media='all'" />
<!-- Color Scheme -->
<link href="assets/css/color.css" rel="stylesheet">
<!-- jQuery.filter -->
<link href="assets/css/jquery.filer.css" type="text/css"
	rel="stylesheet" media="none" onload="if(media!='all')media='all'" />
<link href="assets/css/jquery.filer-dragdropbox-theme.css"
	type="text/css" rel="stylesheet" media="none"
	onload="if(media!='all')media='all'" />

<link href="assets/css/icheck/_all.css" type="text/css" rel="stylesheet" />

<link type="text/css" rel="stylesheet" href="assets/css/jssocials.css" />
<link type="text/css" rel="stylesheet"
	href="assets/css/jssocials-theme-classic.css" />
<link href="../vjs.zencdn.net/7.1.0/video-js.css" async rel="stylesheet">
<link href="assets/css/videojs.css" async rel="stylesheet">
</head>
<body>

	<h3>Don List</h3>

	<p style="color: red;">${errorString}</p>

	<table border="1" cellpadding="5" cellspacing="1"
		class="table table-bordered">
		<tr>
			<th>Numero_don</th>
			<th>montant</th>
			<th>mode_reglement</th>
			<th>quantité</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		<c:forEach items="${donList}" var="don">
			<tr>
				<td>${don.numero_don}</td>
				<td>${don.montant}</td>
				<td>${don.mode_reglement}</td>
				<td>${don.quantite}</td>
				<td><a href="editDon?code=${don.numero_don}">Edit</a></td>
				<td><a href="deleteDon?code=${don.numero_don}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>

	<a href="">Create Don</a>







	<script type="text/javascript" src="assets/js/jquery.min.js"></script>
	<script type="text/javascript" src="assets/js/jquery.form.min.js"></script>
	<script type="text/javascript" src="assets/js/bootstrap.min.js"></script>
	<!-- Menu jQuery plugin -->
	<script type="text/javascript" src="assets/js/hover-dropdown-menu.js"></script>
	<!-- Menu jQuery Bootstrap Addon -->
	<script type="text/javascript"
		src="assets/js/jquery.hover-dropdown-menu-addon.js"></script>
	<script type="text/javascript" src="assets/js/moment.js"></script>
	<script type="text/javascript" src="assets/js/moment-with-locales.js"></script>
	<script type="text/javascript"
		src="assets/js/bootstrap-datetimepicker.js"></script>
	<!-- Scroll Top Menu -->
	<script type="text/javascript" src="assets/js/jquery.easing.1.3.js"></script>
	<!-- Sticky Menu -->
	<script type="text/javascript" src="assets/js/jquery.sticky.js"></script>
	<!-- Bootstrap Validation -->
	<script type="text/javascript"
		src="assets/js/bootstrapValidator.min.js"></script>
	<!-- Revolution Slider -->
	<script type="text/javascript"
		src="assets/rs-plugin/js/jquery.themepunch.tools.min.js"></script>
	<script type="text/javascript"
		src="assets/rs-plugin/js/jquery.themepunch.revolution.min.js"></script>
	<script type="text/javascript"
		src="assets/js/revolution-custom6654.js?v1"></script>
	<!-- Portfolio Filter -->
	<script type="text/javascript" src="assets/js/jquery.mixitup.min.js"></script>
	<!-- Animations -->
	<script type="text/javascript" src="assets/js/jquery.appear.js"></script>
	<script type="text/javascript" src="assets/js/effect.js"></script>
	<script type="text/javascript" src="assets/js/facebook.js"></script>
	<!-- Owl Carousel Slider -->
	<!-- Parallax BG -->
	<script type="text/javascript" src="assets/js/jquery.parallax-1.1.3.js"></script>
	<!-- PieChart -->
	<script type="text/javascript"
		src="assets/js/jquery.easypiechart.min.js"></script>
	<script type="text/javascript" src="assets/js/jquery.countTo.js"></script>
	<!-- Background Video -->
	<script type="text/javascript" src="assets/js/jquery.mb.YTPlayer.js"></script>
	<!-- token -->
	<script type="text/javascript"
		src="assets/tokenfield/bootstrap-tokenfield.min.js"></script>
	<!-- Fancy select -->
	<script type="text/javascript" src="assets/js/fancySelect.js"></script>
	<!-- Fancy select -->
	<script type="text/javascript" src="assets/select2/js/select2.min.js"></script>
	<!-- fancy Box -->
	<script type="text/javascript" src="assets/fancybox/jquery.fancybox.js"></script>
	<!-- Scripts -->
	<script type="text/javascript" src="assets/js/clipboard.min.js"></script>
	<!-- jQuery.filter -->
	<script src="assets/js/jquery.filer.min.js"></script>
	<script src="assets/js/icheck.js"></script>
	<!--script src="assets/js/cookieconsent.min.js"></script-->

	<script type="text/javascript" src="assets/js/jssocials.min.js"></script>
	<script type="text/javascript" src="assets/js/jquery.inputmask.min.js"></script>

	<!-- Custom Js Code -->
	<script type="text/javascript" src="assets/js/custom.js"></script>


	<!-- If you'd like to support IE8 (for Video.js versions prior to v7) -->
	<script src="../vjs.zencdn.net/ie8/ie8-version/videojs-ie8.min.js"></script>
	<script src="../vjs.zencdn.net/7.1.0/video.js"></script>
</body>
</html>