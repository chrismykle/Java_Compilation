function regPakke() {
    const sending = {
        fornavn: $("#fornavn").val(),
        etternavn: $("#etternavn").val(),
        adresse: $("#adresse").val(),
        postnr: $("#postnr").val(),
        telefonnr: $("#telefonnr").val(),
        epost: $("#epost").val(),
        volum: $("#volum").val(),
        vekt: $("#vekt").val()
    };
    if (validerOK()) {
        $.post("/lagre", sending, function () {
            $("#feil").html("Utøver lagret!");
        })
            .fail(function (jqXHR) {
                const json = $.parseJSON(jqXHR.responseText);
                $("#feil").html(json.message);
            });

        function sjekkPostnr() {

            const postNr = {
                postnr: $("#postnr").val()
            }

            $.Post("/postnr", postNr, function () {

            })
        }
    }
}
