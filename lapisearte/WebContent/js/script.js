function relogio() {
	var data = new Date();
	var horas = data.getHours();
	var minutos = data.getMinutes();
	var segundos = data.getSeconds();

	if (horas < 10) {
		horas = "0" + horas;
	}
	if (minutos < 10) {
		minutos = "0" + minutos;
	}
	if (segundos < 10) {
		segundos = "0" + segundos;
	}
	document.getElementById("relogio").innerHTML = horas + ":" + minutos + ":"
			+ segundos;
}
window.setInterval("relogio()", 1000);

function calendario() {
	var data = new Date();
	var ano = data.getFullYear();
	var dia = data.getDate();
	var mes = data.getMonth();
	var dia_semana = data.getDay();

	var A_mes = new Array("Janeiro", "Fevereiro", "Março", "Abril", "Maio",
			"Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro",
			"Dezembro");
	var A_dia = new Array("Dom","Seg","Ter","Qua","Qui","Sex","Sab");
	
	data.setDate(1);
	calendario = '<table><tr><th colspan="7" >'+ A_mes[mes] + ' de '+ ano;
	calendario += '<tr>';
	for(var i=0; i<7; i++){
		if(dia_semana == i){
			calendario += '<td><b>'+A_dia[i]+'</b></td>';
		}else{
			calendario += '<td>'+A_dia[i]+'</td>';
		}
	}
	calendario += '</tr>';
	for(i=0; i < data.getDay; i++){
		calendario += '<td></td>';
	}
	for(i<0; i < 31; i++){
		if(data.getDate()>i){
			dia_semana = data.getDay();
			if(dia_semana == 0)
				calendario += '<tr>';
			if(dia_semana != 7){
				if(dia == data.getDate())
					calendario += '<td><b>'+(i+1)+'</b></td>';
				else
					calendario += '<td>'+(i+1)+'</td>';
			}
			if(dia_semana == 7)
				calendario += '</tr>';
		}
		data.setDate(data.getDate()+1);
	}
	
	calendario += '</td></tr></table>';
	document.getElementById("calendario").tagName = calendario ;
	alert(calendario);
}

function pesquisa(){
	
	var valor =  document.getElementById("valor").value;
	location.href="alunocontrole.do?acao=buscar&nome="+valor;

}
function matricular(id){

	
	for ( i = 1; i <= 4; i++ ) {  
        checkBox = document.getElementById( "item"+i);  
        if ( checkBox.checked ) {  
        	location.href="matriculaaluno.do?aluno="+id+"&turma="+checkBox.value; 
        }  
    }  
      

	 alert( "Matriculado com sucesso" );  
	
}
