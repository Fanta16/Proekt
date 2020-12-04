$(document).ready(function (){
    $(".hover").hover(function(){
        $(this).css("color", "#FFDE59");
    }, function(){
        $(this).css("color", "#FFFFFF");
    })
    $("#Login").click(function(){
        $("#Dialog").dialog({
            modal: true,
            closeOnEscape: true,
            buttons:{
                Најави: function (){
                    $(this).dialog("close");
                },
                Откажи: function () {
                    $(this).dialog("close");
                }
            },
            closeText: ""
        });
    })
})