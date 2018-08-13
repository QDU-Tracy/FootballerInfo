$(document).ready(function () {
    var search_normal_input;

    $('#search-normal-button').click(function () {
        $('#search-result-modal').modal("show");
        search_normal_input = $('#serach-normal-input').val();
        // var formData = new FormData($('#search-normal-form')[0]);
        $.ajax({
            url: '/getPlayerByName',
            type: 'get',
            data: {
                pName:search_normal_input
            },
            success: function (data) {
                console.log(data);
            }
        });
        console.log(search_normal_input);
    });
});