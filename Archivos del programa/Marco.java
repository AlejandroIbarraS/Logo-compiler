/*
Proyecto: Mini-Logo
Integrantes: 
   -Ibarra Soto Alejandro
   -Mendoza Sánchez Marco Antonio
Materia: 
   Compiladores
Grupo:
   3CM7
Fecha:
   Junio 2020
*/
class Marco {
	Simbolo s;
	int retpc;//Dirección de retorno
	int argn;//n ele pila
	int nargs;//Cantidad de argumento
	Marco(Simbolo s, int retpc, int argn, int nargs){
		this.s=s;
		this.retpc=retpc;
		this.argn=argn;
		this.nargs=nargs;
	}
}