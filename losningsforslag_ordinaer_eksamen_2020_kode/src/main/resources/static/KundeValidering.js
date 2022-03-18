
function validerFornavn(){
    const fornavn = $("#fornavn").val();
    const regexp = /^[A-ZÆØÅa-zæøå]{2,}$/;
    const ok = regexp.test(fornavn);
    if(!ok){
        return false;
    }
    else{
        return true;
    }
}

function validerEtternavn(){
    const etternavn = $("#etternavn").val();
    const regexp = /^[A-ZÆØÅa-zæøå]{2,}$/;
    const ok = regexp.test(etternavn);
    if(!ok){
        return false;
    }
    else{
        return true;
    }
}


function validerPostnr(){
    const postnr = $("#postnr").val();
    const regexp = /^[0-9]{,4}$/;
    const ok = regexp.test(postnr);
    if(!ok){
        return false;
    }
    else{
        return true;
    }
}

function validerOK(){
    if(validerFornavn() && validerEtternavn() && validerPostnr()){
        return true;
    }
    else {
    .fail(function(jqXHR) {
            const json = $.parseJSON(jqXHR.responseText);
            alert(json.message);
        });
        return false;
    }

}