
let bilettRegister=[];

document.querySelector("button").addEventListener("click", function (event){
    event.preventDefault();
},false)

function sjekk() {
    let filmTest = document.getElementById("velgFilm")
    let antallTest = document.getElementById("antallFeil").value;
    let fornavnTest = document.getElementById("fornavnFeil").value;
    let etternavnTest = document.getElementById("etternavnFeil").value;
    let mobTest = document.getElementById("mobFeil").value;
    let emailTest = document.getElementById("emailFeil").value;


    const bilettReg = {
        film: document.getElementById("velgFilm").value,
        antall: document.getElementById("antallFeil").value,
        fornavn: document.getElementById("fornavnFeil").value,
        ettternavn: document.getElementById("etternavnFeil").value,
        mob: document.getElementById("mobFeil").value,
        email: document.getElementById("emailFeil").value
    }
    let validtaion = false;

    if (filmTest === "" || filmTest === null) {
        document.getElementById("velgFilm").innerHTML = "Velg Film";
        validtaion = true
    }
    if (antallTest === "" || antallTest === null) {
        document.getElementById("antallFeil").innerHTML = "Skriv inn antall biletter";
        validtaion = true
    }
    if (fornavnTest === "" || fornavnTest === null) {
        document.getElementById("fornavnFeil").innerHTML = "Skriv inn fornavn";
        validtaion = true
    }
    if (etternavnTest === "" || etternavnTest === null) {
        document.getElementById("etternavnFeil").innerHTML = "Skriv inn etternavn";
        validtaion = true
    }
    if (mobTest === "" || mobTest === null) {
        document.getElementById("mobFeil").innerHTML = "Skriv inn telefon-nummer";
        validtaion = true
    }
    if (emailTest === "" || emailTest === null) {
        document.getElementById("emailFeil").innerHTML = "Skriv inn antall biletter";
        validtaion = true
    }
    if (validtaion === false) {
        bilettRegister.push(bilettReg);
        let ut = "<table><tr><td>Film</td><td>Antall</td><td>Fornavn</td><td>Etternavn</td><td>Telefonnr</td><td>Email</td></tr></table>";
        for (let l of bilettRegister) {
            ut += "<tr><td> " + bilettReg.film + " </td><td>" + bilettReg.antall + " </td><td>" + bilettReg.fornavn + " </td><td>" + bilettReg.ettternavn + " </td><td>" + bilettReg.mob + " </td><td>" + bilettReg.email + "<br>" + "</td></tr>"
            l++
        }
        ut += "</table>";
        document.getElementById("bilettListe").innerHTML = ut;
    }
}



function clearArray (){
    filmTest.innerHTML =" ";
    antallTest.innerHTML =" ";
    fornavnTest.innerHTML =" ";
    etternavnTest.innerHTML =" ";
    mobTest.innerHTML =" ";
    emailTest.innerHTML =" ";
}


