
$(document).ready(function () {

    $("#search-form").submit(function (event) {

        //stop submit the form, we will post it manually using AJAX.
        event.preventDefault();

        fire_ajax_submit();

    });

});

function fire_ajax_submit() {

	
	//Get
	//var bla = $('#txt_name').val();

	
	
	var input = {};
	input.rcode = document.getElementById("rcode").value;
	
    $("#btn-search").prop("disabled", true);

    $.ajax({
        type: "POST",
        contentType: "application/json",
        url: "http://localhost:9090/process",
        data:JSON.stringify(input),
        dataType: 'json',  
        cache: false,
        timeout: 600000,
        success: function (data) {

        	
            var json = "<h4>Displaying the json string returned</h4>&lt;pre&gt;"
                + JSON.stringify(data) + "&lt;/pre&gt;";
            $('#feedback').html(json);
         
            
            console.log("SUCCESS : ", data);
            $("#btn-search").prop("disabled", false);
            

        },
        error: function (e) {

            var json = "<h4>Error Displaying the json string</h4>&lt;pre&gt;"
                + e.responseText + "&lt;/pre&gt;";
            $('#feedback').html(json);

            console.log("ERROR : ", e);
            $("#btn-search").prop("disabled", false);

        }
    });

}
