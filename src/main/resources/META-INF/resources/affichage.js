var divRes ;
var divMessage ;
window.onload=function(){
	var inputChangeMini = document.getElementById("txtChangeMini");
	var btnGetDevises = document.getElementById("btnGetDevises");
	var btnPostDevise = document.getElementById("btnPostDevise");
	divRes = document.getElementById("divRes");
	
	btnGetDevises.addEventListener("click" , function (){
		var changeMini = inputChangeMini.value;
		makeAjaxGetRequest("./booking-api/public/booking?changeMini="+changeMini ,  cbGererResultat);
	});
	
	btnPostDevise.addEventListener("click" , function (){
		var nouvelleDevise =  {
			code : null,
			name : null,
			change : null
		};
		nouvelleDevise.code = document.getElementById("txtClient").value;
		nouvelleDevise.name = document.getElementById("txtNb").value;
		nouvelleDevise.change = document.getElementById("txtParty").value;
		makeAjaxPostRequest("./booking-api/public/booking/create" , 
				            JSON.stringify(nouvelleDevise), 
				            cbGererResultatPost);
	});
}

function cbGererResultatPost(texteReponse){
	divMessage = document.getElementById("divMessage");
	texteReponse="youhouhou"
	divMessage.innerHTML= texteReponse;
}

function cbGererResultat(texteReponse){
	//divRes.innerHTML = texteReponse;
	var listeDeviseJs = JSON.parse(texteReponse /* au format json string */)
	var htmlListeDevises = "<ul>" ;
	for(i=0; i<listeDeviseJs.length ; i++){
		htmlListeDevises = htmlListeDevises + "<li>" + listeDeviseJs[i].name + " , " 
			                                    + listeDeviseJs[i].change + "</li>";
	}
	htmlListeDevises = htmlListeDevises + "</ul>";
	divRes.innerHTML= htmlListeDevises; 
}

function makeAjaxGetRequest(url,callback) {
	var xhr = new XMLHttpRequest();
	xhr.onreadystatechange = function() {
		if (xhr.readyState == 4 && (xhr.status == 200 || xhr.status == 0)) {
		    callback(xhr.responseText);
		}
	};
	xhr.open("GET", url, true);
	xhr.send(null);
}

function makeAjaxPostRequest(url,jsonData,callback) {
	var xhr = new XMLHttpRequest();
	xhr.onreadystatechange = function() {
		if (xhr.readyState == 4 && (xhr.status == 200 || xhr.status == 0)) {
		    callback(xhr.responseText);
		}
	};
	xhr.open("POST", url, true);
	xhr.setRequestHeader("Content-Type", "application/json");
	xhr.send(jsonData);
}