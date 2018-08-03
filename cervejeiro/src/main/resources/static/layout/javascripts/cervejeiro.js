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