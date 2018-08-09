$(document).ready(function($, mask) {
	$('.js-decimal').mask('00.00');
	$('.data-nascimento').mask('00/00/0000');

	var options = {
		onKeyPress : function(cpf, ev, el, op) {
			var masks = [ '000.000.000-000', '00.000.000/0000-00' ];
			$('.cpf-cnpj').mask((cpf.length > 14) ? masks[1] : masks[0], op);
		}
	}

	$('.cpf-cnpj').mask('000.000.000-000', options);
});

function getEstados() {
	jQuery.support.cors = true;
	$.ajax({
		url : "http://www.geonames.org/childrenJSON?geonameId=3469034",
		type : 'GET',
		async : true,
	}).done(
			function(obj) {
				if (obj != null) {
					var data = obj.geonames;
					var selectbox = $('#estado');
					selectbox.find('option').remove();
					$.each(data, function(i, d) {
						$('<option>').val(d.name).text(d.name).appendTo(
								selectbox);
					});
				}
			}).fail(function(jqXHR, textStatus, msg) {
		alert(msg);
	});
}