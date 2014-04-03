read-xlsx
=========

How to read XLSX files

> So the next time you think "I've built a reusable thing!", stop, and think "how can I find three users, customers, or audiences, to prove that I've built something reusable?" instead. -Jeff Atwood, at <http://www.codinghorror.com/blog/2013/07/rule-of-three.html>



Desde la pagina web:
* Abriendo el archivo:
	* Con Java applet
	* Con Javascript:
		* XLSX.js (http://blog.innovatejs.com/?tag=xlsx-js
					http://blog.innovatejs.com/?p=24
					https://github.com/stephen-hardy/xlsx.js,
					Licencia Microsoft Office Extensible File License: solo se puede usar en Windows y que el sw no realice principalmente las mismas funciones generales que Excel)
					Hecho como proyecto personal de empleado de Microsoft
		* https://www.google.com/search?hl=en&q=javascript+read+xlsx
		* usar la jvm que esta implementada en javascript + POI

Desde Excel
* con un plugin/addon que envie los datos (quiza iniciando la actualizacion?)

Híbrido
* Copiando y pegando los datos.

Desde el servidor:
* con POI
* cargando el archivo y enviarlo a un proceso externo con memoria fija que lo abra y regrese los datos
	* mapeandolo a memoria - por ejempo: http://javarevisited.blogspot.mx/2012/01/memorymapped-file-and-io-in-java.html


Otras referencias para investigar:

* http://blog.innovatejs.com/?page_id=7
* https://github.com/stephen-hardy/xlsx.js
* https://github.com/stephen-hardy/xlsx.js/issues/8
* https://github.com/Niggler/js-xlsx
* http://niggler.github.io/js-xlsx/
* https://github.com/Niggler/js-xls/issues/1#issuecomment-13852286
* http://stackoverflow.com/questions/8238407/how-to-parse-excel-file-in-javascript-html5
* http://msdn.microsoft.com/en-us/library/office/apps/fp160953.aspx