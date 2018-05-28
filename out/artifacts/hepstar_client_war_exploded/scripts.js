$(function(){
    $("#cancel-block").hide();

    $("#cancel-policy").click(function(e){
        e.preventDefault();
        $("#cancel-block").show("slow");
    });
});