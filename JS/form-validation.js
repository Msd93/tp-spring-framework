window.onload = function () {   // ce code est exécuter une fois que toute la page est téléchargée par le navigateur
    // voir plus : https://www.w3schools.com/js/js_htmldom.asp
    console.log("DOM ready!");


    document.querySelector("form").addEventListener("submit", function (event) {
        event.preventDefault();
        console.log("form submitted!");
        validation()
    });


};

var myModal = new bootstrap.Modal(document.getElementById('myModal'));
var ok = document.getElementById("closeModal");
var valider = document.getElementById("valider");
myModal.hide();

function validation() {
    var nom = document.getElementById("nom").value;
    var prenom = document.getElementById("prenom").value;
    var adresse = document.getElementById("adresse").value;
    var ddn = document.getElementById("date").value;
    var mail = document.getElementById("email").value;

    document.querySelector(".modal-body").innerHTML = "";


    if (nom.length == 0 || prenom.length == 0 || adresse.length == 0 || ddn.length == 0 || mail.length == 0) {
        document.querySelector(".modal-title").style.color = "red";
        if (nom.length == 0) {
            document.querySelector(".modal-body").innerHTML += "Veuillez entrer un nom<br>";
        }
        if (prenom.length == 0) {
            document.querySelector(".modal-body").innerHTML += "Veuillez entrer un prenom<br>";
        }
        if (adresse.length == 0) {
            document.querySelector(".modal-body").innerHTML += "Veuillez entrer une adresse<br>";
        }
        if (ddn.length == 0) {
            document.querySelector(".modal-body").innerHTML += "Veuillez entrer une date de naissance<br>";
        }
        if (mail.length == 0) {
            document.querySelector(".modal-body").innerHTML += "Veuillez entrer un mail<br>";
        }
        myModal.show();
        return false;
    } else {
        if (isValideDate(ddn) == false) {
            document.querySelector(".modal-title").style.color = "red";
            document.querySelector(".modal-body").innerHTML = "Veuillez entrer une date de naissance valide<br>";
            myModal.show();
            return false;
        }
        if (isValideEmail(mail) == false) {
            document.querySelector(".modal-title").style.color = "red";
            document.querySelector(".modal-body").innerHTML = "Veuillez entrer un mail valide<br>";
            myModal.show();
            return false;
        }

        document.querySelector(".modal-title").style.color = "green";
        document.querySelector(".modal-title").innerHTML = "Formulaire valide<br>";
        document.querySelector(".modal-body").innerHTML += "Vous avez enregistre avec succes l'utilisateur: <br>";
        document.querySelector(".modal-body").innerHTML += "Nom : " + nom + "<br>";
        document.querySelector(".modal-body").innerHTML += "Prenom : " + prenom + "<br>";
        document.querySelector(".modal-body").innerHTML += "Date NS : " + ddn + "<br>";
        document.querySelector(".modal-body").innerHTML += "Adresse : " + adresse + "<br>";
        document.querySelector(".modal-body").innerHTML += "Mail : " + mail + "<br>";
        myModal.show();
    }

}

function isValideEmail(email) {
    const re = /^(([^<>()[\]\\.,;:\s@"]+(\.[^<>()[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
    return re.test(String(email).toLowerCase());
}

function isValideDate(date) {
    let today = new Date();
    let dateNaissance = new Date(date); // https://developer.mozilla.org/fr/docs/Web/JavaScript/Reference/Global_Objects/Date/Date#syntaxe
    let dateNaissanceTimestamp = dateNaissance.getTime();
    let todayTimestamp = today.getTime();
    return (dateNaissanceTimestamp < todayTimestamp)
}
const openModal = function (e) {
    e.preventDefault
    const target = document.querySelector(e.target.getAttribute(href))
    target.style.display = null;
    target.removeAttribute('aria-hidden')
}
document.querySelectorAll('js-modal').forEach(a => {
    a.addEventListener('click', openModal)

})
/** Fermer le modal */
ok.addEventListener('click', function () {
    myModal.hide();
})