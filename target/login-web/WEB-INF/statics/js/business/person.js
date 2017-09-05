/**
 @author TonyC
 @date 2017/8/28 16:15
 @email cpy2013@sina.com
 **/


{
    console.log("84645465");
    $("#commitssss").click(function () {

        var name = $("#name").val();
        var age = $("#age").val();
        console.log(name);

        console.log(age);

        var dates= {name:name, age:age};

        var urls = "toPerson";



        // var htmlssd = $.ajax({
        //     type: 'POST',
        //     url: urls,
        //     data: dates,
        //     success: function (da) {
        //         console.log(da);
        //         $(".result").html(da);
        //     },
        //     dataType: 'json'
        // });
        // console.log(htmlssd);
        // console.log(htmlssd.responseText);
        // $(location).attr('href', htmlssd.responseText);

    });


}


