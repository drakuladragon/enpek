$('.carousel').carousel({
  interval: 2000
})

$('#datepicker').datepicker({
    weekStart: 1,
    daysOfWeekHighlighted: "6,0",
    autoclose: true,
    todayHighlight: true,
    daysOfWeekDisabled: [0,6,1],
});
$('#datepicker').datepicker("setDate", new Date());