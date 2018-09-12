$("#main-menu").load("@{/templates/menu.html}");
$(document).ready(function() {
    $('#main-menu').load('menu.html');
});
$(function(){
    var includes = $('[data-include]');
    jQuery.each(includes, function(){
        var file = 'views/' + $(this).data('include') + '.html';
        $(this).load(file);
    });
});