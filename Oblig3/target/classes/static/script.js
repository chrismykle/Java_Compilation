
document.querySelector("button").addEventListener("click", function (event){
    event.preventDefault();
},false)

function sjekk() {
    let filmTest = document.getElementById("velgFilm").value;
    let antallTest = document.getElementById("antallFeil").value;
    let fornavnTest = document.getElementById("fornavnFeil").value;
    let etternavnTest = document.getElementById("etternavnFeil").value;
    let mobTest = document.getElementById("mobFeil").value;
    let emailTest = document.getElementById("emailFeil").value;

    const bilettReg = {
        film: document.getElementById("velgFilm").value,
        antall: document.getElementById("antallFeil").value,
        fornavn: document.getElementById("fornavnFeil").value,
        etternavn: document.getElementById("etternavnFeil").value,
        mob: document.getElementById("mobFeil").value,
        email: document.getElementById("emailFeil").value
    };

    let validtaion = false

    /* Tester for korrekt informasjon i feltene */

    if (filmTest === "Velg film her" || filmTest === null) {
        document.getElementById("returnFilm").innerHTML = "Velg Film *";
        validtaion = true
    }
    else if (antallTest === "" || antallTest === null) {
        document.getElementById("antallVal").innerHTML = "Skriv inn antall biletter *";
        validtaion = true
    }
    else if (fornavnTest === "" || fornavnTest === null) {
        document.getElementById("returnFornavn").innerHTML = "Skriv inn fornavn *";
        validtaion = true
    }
    else if (etternavnTest === "" || etternavnTest === null) {
        document.getElementById("returnEtternavn").innerHTML = "Skriv inn etternavn *";
        validtaion = true
    }
    else if (mobTest === "" || mobTest === null) {
        document.getElementById("returnMob").innerHTML = "Skriv inn telefonnummer *";
        validtaion = true
    }
    else if (emailTest === "" || emailTest === null) {
        document.getElementById("returnEmail").innerHTML = "Skriv inn emailadressen din *";
        validtaion = true
    }
    else if (validtaion === false){
        $.post("/lagre", bilettReg, function (){
          hentAlle();
        });
        $("#velgFilm").val("Velg film her"); // Empties input field
        $("#antallFeil").val("");
        $("#fornavnFeil").val("");
        $("#etternavnFeil").val("");
        $("#mobFeil").val("");
        $("#emailFeil").val("");
    }

    function hentAlle(){
        $.get("/hentAlle", function (data){
            formaterData(data)
        })
    }

    function formaterData(Kunder){

        let ut = "<table><tr><td>Film</td><td>Antall</td><td>Fornavn</td><td>Etternavn</td><td>Telefonnr</td><td>Email</td></tr></table>";
        for (const bilettReg of Kunder) {
            ut += "<tr><td> " + bilettReg.film + " </td><td>" + bilettReg.antall + " </td><td>" + bilettReg.fornavn + " </td><td>" + bilettReg.etternavn + " </td><td>" + bilettReg.mob + " </td><td>" + bilettReg.email + "<br>" + "</td></tr>"
        }
        ut += "</table>";

        $("#bilettListe").html(ut)


    }

}


/*
function clearArray (){
    $.get("/clearArray", function() {
        hentAlle();
    })
}
*/


