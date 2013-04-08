;;;;; Prctica 2B IAIC ;;;;;

;;; definicion de plantillas (deftemplates)

(deftemplate persona
	(slot nombre        (type SYMBOL) (default ""))
	(slot sexo          (type SYMBOL) (allowed-values hombre mujer))
	(slot edad          (type NUMBER) (default 18))
	(slot altura        (type NUMBER))
	(slot peso          (type NUMBER))
	(slot cuestaHablar  (type SYMBOL) (allowed-values TRUE FALSE))
	(slot gustaSalir    (type SYMBOL) (allowed-values TRUE FALSE))
	(slot numAmigos     (type NUMBER) (default 0))
	(slot religion      (type SYMBOL) (default ateo))
	(slot twitter       (type SYMBOL) (allowed-values TRUE FALSE))
	(slot facebook      (type SYMBOL) (allowed-values TRUE FALSE))
	(slot timido        (type SYMBOL) (default FALSE) (allowed-values TRUE FALSE))
	(slot sociable      (type SYMBOL) (default FALSE) (allowed-values TRUE FALSE))
	(slot caracter      (type SYMBOL) (default noClasificable) (allowed-values extrovertido introvertido noClasificable))
	(slot muchosAmigos  (type SYMBOL) (default FALSE) (allowed-values TRUE FALSE))
)

(deftemplate emparejamiento
	(slot nombre1)
	(slot nombre2)
	(slot afinidad (type NUMBER) (default 0))
	(slot tipoCita (type SYMBOL) (default sinCita) (allowed-values sinCita citaNormal citaMagica))
)



;;; definicion de hechos iniciales (deffacts)

(deffacts usuarios
	(persona (nombre "Pedro") (sexo hombre) (edad 22) (altura 175) (peso 65) (cuestaHablar FALSE) (gustaSalir TRUE) (numAmigos 25) (religion ateo) (twitter FALSE) (facebook TRUE))

	(persona (nombre "Lucia") (sexo mujer) (edad 20) (altura 165) (peso 50) (cuestaHablar FALSE) (gustaSalir TRUE) (numAmigos 25) (religion ateo) (twitter TRUE) (facebook FALSE))

	(persona (nombre "Daniel") (sexo hombre) (edad 21) (altura 175) (peso 81) (cuestaHablar FALSE) (gustaSalir TRUE) (numAmigos 2) (religion cristiano) (twitter TRUE) (facebook TRUE))

	(persona (nombre "Paloma") (sexo mujer) (edad 20) (altura 164) (peso 70) (cuestaHablar TRUE) (gustaSalir TRUE) (numAmigos 4) (religion ateo) (twitter TRUE) (facebook TRUE))

	(persona (nombre "Raquel") (sexo mujer) (edad 22) (altura 165) (peso 60) (cuestaHablar FALSE) (gustaSalir TRUE) (numAmigos 65) (religion ateo) (twitter TRUE) (facebook TRUE))

	(persona (nombre "Arturo") (sexo hombre) (edad 24) (altura 170) (peso 70) (cuestaHablar TRUE) (gustaSalir FALSE) (numAmigos 21) (religion cristiano) (twitter TRUE) (facebook TRUE))

	(persona (nombre "Sara") (sexo mujer) (edad 36) (altura 160) (peso 50) (cuestaHablar TRUE) (gustaSalir FALSE) (numAmigos 15) (religion judio) (twitter FALSE) (facebook FALSE))

	(persona (nombre "Hermenegildo") (sexo hombre) (edad 65) (altura 170) (peso 63) (cuestaHablar FALSE) (gustaSalir FALSE) (numAmigos 14) (religion cristiano) (twitter TRUE) (facebook FALSE))

	(persona (nombre "Brunhilda") (sexo mujer) (edad 46) (altura 155) (peso 50) (cuestaHablar TRUE) (gustaSalir FALSE) (numAmigos 2) (religion cristiano) (twitter FALSE) (facebook FALSE))

	(persona (nombre "Pretextato") (sexo hombre) (edad 38) (altura 190) (peso 90) (cuestaHablar FALSE) (gustaSalir TRUE) (numAmigos 60) (religion ateo) (twitter TRUE) (facebook TRUE))

	(persona (nombre "Meridiana") (sexo mujer) (edad 24) (altura 150) (peso 80) (cuestaHablar TRUE) (gustaSalir TRUE) (numAmigos 3) (religion cristiano) (twitter FALSE) (facebook FALSE))

	(persona (nombre "Exuperio") (sexo hombre) (edad 60) (altura 170) (peso 68) (cuestaHablar FALSE) (gustaSalir TRUE) (numAmigos 1) (religion ateo) (twitter FALSE) (facebook FALSE))

	(persona (nombre "Eulalia") (sexo mujer) (edad 80) (altura 189) (peso 50) (cuestaHablar FALSE) (gustaSalir TRUE) (numAmigos 50) (religion judio) (twitter TRUE) (facebook TRUE))

	(persona (nombre "Gervasio") (sexo hombre) (edad 28) (altura 180) (peso 65) (cuestaHablar FALSE) (gustaSalir FALSE) (numAmigos 65) (religion cristiano) (twitter TRUE) (facebook TRUE))

	(persona (nombre "Herminia") (sexo mujer) (edad 30) (altura 180) (peso 80) (cuestaHablar FALSE) (gustaSalir FALSE) (numAmigos 12) (religion ateo) (twitter FALSE) (facebook TRUE))

	(persona (nombre "Wamba") (sexo hombre) (edad 101) (altura 140) (peso 38) (cuestaHablar TRUE) (gustaSalir TRUE) (numAmigos 0) (religion visigodo) (twitter FALSE) (facebook FALSE))

	(persona (nombre "Theodora") (sexo mujer) (edad 19) (altura 167) (peso 58) (cuestaHablar TRUE) (gustaSalir FALSE) (numAmigos 2) (religion cristiano) (twitter FALSE) (facebook TRUE))

	(persona (nombre "Ash") (sexo hombre) (edad 18) (altura 155) (peso 55) (cuestaHablar FALSE) (gustaSalir TRUE) (numAmigos 35) (religion cristiano) (twitter TRUE) (facebook TRUE))

	(persona (nombre "Misty") (sexo mujer) (edad 20) (altura 165) (peso 50) (cuestaHablar FALSE) (gustaSalir TRUE) (numAmigos 25) (religion ateo) (twitter TRUE) (facebook TRUE))

	(persona (nombre "Brock") (sexo hombre) (edad 22) (altura 190) (peso 90) (cuestaHablar TRUE) (gustaSalir TRUE) (numAmigos 21) (religion cristiano) (twitter TRUE) (facebook TRUE))

	(persona (nombre "Hailey") (sexo mujer) (edad 22) (altura 160) (peso 50) (cuestaHablar FALSE) (gustaSalir TRUE) (numAmigos 30) (religion ateo) (twitter TRUE) (facebook TRUE))

	(persona (nombre "Angel") (sexo hombre) (edad 22) (altura 170) (peso 60) (cuestaHablar TRUE) (gustaSalir FALSE) (numAmigos 15) (religion cristiano) (twitter FALSE) (facebook FALSE))

	(persona (nombre "Sasha") (sexo mujer) (edad 25) (altura 168) (peso 50) (cuestaHablar FALSE) (gustaSalir TRUE) (numAmigos 200) (religion ateo) (twitter TRUE) (facebook TRUE))

	(persona (nombre "Nacho") (sexo hombre) (edad 38) (altura 185) (peso 85) (cuestaHablar FALSE) (gustaSalir TRUE) (numAmigos 250) (religion ateo) (twitter TRUE) (facebook TRUE))

	(persona (nombre "Tenia") (sexo mujer) (edad 67) (altura 190) (peso 70) (cuestaHablar TRUE) (gustaSalir FALSE) (numAmigos 1) (religion jehova) (twitter FALSE) (facebook FALSE))

	(persona (nombre "Julio") (sexo hombre) (edad 56) (altura 169) (peso 75) (cuestaHablar TRUE) (gustaSalir FALSE) (numAmigos 3) (religion cristiano) (twitter FALSE) (facebook TRUE))

	(persona (nombre "Maria") (sexo mujer) (edad 30) (altura 165) (peso 60) (cuestaHablar FALSE) (gustaSalir TRUE) (numAmigos 15) (religion ateo) (twitter FALSE) (facebook TRUE))

	(persona (nombre "Junkpilwon") (sexo hombre) (edad 45) (altura 156) (peso 55) (cuestaHablar TRUE) (gustaSalir TRUE) (numAmigos 27) (religion tahoismo) (twitter TRUE) (facebook TRUE))

	(persona (nombre "Minjoo") (sexo mujer) (edad 18) (altura 146) (peso 40) (cuestaHablar FALSE) (gustaSalir FALSE) (numAmigos 50) (religion sintohismo) (twitter TRUE) (facebook TRUE))

	(persona (nombre "Groucho") (sexo hombre) (edad 76) (altura 177) (peso 70) (cuestaHablar FALSE) (gustaSalir FALSE) (numAmigos 75) (religion ateo) (twitter TRUE) (facebook FALSE))

	(persona (nombre "Marta") (sexo mujer) (edad 35) (altura 162) (peso 45) (cuestaHablar TRUE) (gustaSalir TRUE) (numAmigos 10) (religion cristiano) (twitter FALSE) (facebook TRUE))

	(persona (nombre "Antonio") (sexo hombre) (edad 22) (altura 175) (peso 65) (cuestaHablar TRUE) (gustaSalir FALSE) (numAmigos 25) (religion ateo) (twitter FALSE) (facebook FALSE))

	(persona (nombre "Eva") (sexo mujer) (edad 43) (altura 166) (peso 70) (cuestaHablar TRUE) (gustaSalir FALSE) (numAmigos 5) (religion cristiano) (twitter FALSE) (facebook FALSE))

	(persona (nombre "Samuel") (sexo hombre) (edad 22) (altura 177) (peso 70) (cuestaHablar FALSE) (gustaSalir TRUE) (numAmigos 50) (religion ateo) (twitter TRUE) (facebook TRUE))

	(persona (nombre "Ana") (sexo mujer) (edad 22) (altura 165) (peso 55) (cuestaHablar TRUE) (gustaSalir TRUE) (numAmigos 25) (religion ateo) (twitter FALSE) (facebook TRUE))

	(persona (nombre "Javier") (sexo hombre) (edad 47) (altura 175) (peso 70) (cuestaHablar FALSE) (gustaSalir FALSE) (numAmigos 1) (religion cristiano) (twitter FALSE) (facebook FALSE))

	(persona (nombre "Sandra") (sexo mujer) (edad 31) (altura 170) (peso 60) (cuestaHablar TRUE) (gustaSalir TRUE) (numAmigos 23) (religion ateo) (twitter FALSE) (facebook TRUE))

	(persona (nombre "Abel") (sexo hombre) (edad 23) (altura 167) (peso 55) (cuestaHablar FALSE) (gustaSalir TRUE) (numAmigos 15) (religion ateo) (twitter FALSE) (facebook TRUE))

	(persona (nombre "Elena") (sexo mujer) (edad 21) (altura 170) (peso 60) (cuestaHablar FALSE) (gustaSalir TRUE) (numAmigos 45) (religion cristiano) (twitter FALSE) (facebook TRUE))

	(persona (nombre "Mario") (sexo hombre) (edad 45) (altura 165) (peso 70) (cuestaHablar TRUE) (gustaSalir TRUE) (numAmigos 14) (religion cristiano) (twitter FALSE) (facebook FALSE))
)



;;; variables globales (defglobal)

(defglobal ?*crlf* = "
") ; Esta variables es para poder añadir saltos de linea



;;; definicion de reglas (defrules)
;; 3 modulos: clasificar, compatibilizar, emparejar

;;;;;;;;;;;;;;;;;;;;;;;
;; Módulo Clasificar ;;

(defmodule clasificar) ;indica si es introvertido o extrovertido

(defrule esTimido
	?p <- (persona (cuestaHablar ?ch))
	=>
	(modify ?p (timido ?ch))
)

(defrule tieneMuchosAmigos
	?p <- (persona (numAmigos ?na))
	=>
	(modify ?p (muchosAmigos (> ?na 20)))
)

(defrule muySociable
	?p <- (persona (muchosAmigos TRUE) (twitter TRUE) (facebook TRUE))
	=>
	(modify ?p (sociable TRUE))
)

(defrule caracterExtrovertido
	?p <- (persona (gustaSalir TRUE) (sociable TRUE))
	=>
	(modify ?p (caracter extrovertido))
)

(defrule caracterIntrovertido
	?p <- (persona (timido TRUE) (muchosAmigos FALSE))
	=>
	(modify ?p (caracter introvertido))
)


;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Módulo Compatibilizar ;;

(defmodule compatibilizar) ;indica cuales son compatibles

(defrule compatibles1
	(persona (nombre ?n1) (sexo hombre) (religion ?r) (caracter ?c))
	(persona (nombre ?n2) (sexo mujer) (religion ?r) (caracter ?c))
	=>
	(assert (emparejamiento (nombre1 ?n1) (nombre2 ?n2)))
)

(defrule compatibles2
	(persona (nombre ?n1) (caracter noClasificable) (muchosAmigos TRUE) (sexo hombre) (religion ?r1))
	(persona (nombre ?n2) (caracter noClasificable) (muchosAmigos TRUE) (sexo mujer) (religion ?r2))
	(test (<> ?r1 ?r2))
	=>
	(assert (emparejamiento (nombre1 ?n1) (nombre2 ?n2)))
)
;;;;;;;;;;;;;;;;;;
;; Módulo Citar ;;

(defmodule citar) ;establece citas

(defrule citar1
	?e <- (emparejamiento (nombre1 ?n1) (nombre2 ?n2) (tipoCita sinCita))
	?p1 <- (persona (nombre ?n1) (edad ?edad1))
	?p2 <- (persona (nombre ?n2) (edad ?edad2))
	(test (<= (abs (- ?edad1 ?edad2)) 10))
	=> 
	(modify ?e (tipoCita citaNormal))
)

(defrule citar2
	?e <- (emparejamiento (nombre1 ?n1) (nombre2 ?n2) /*(tipoCita sinCita)*/)
	?p1 <- (persona (nombre ?n1) (edad ?edad1))
	?p2 <- (persona (nombre ?n2) (edad ?edad2))
	(test (> ?edad1 50))
	(test (> ?edad2 50))
	=> 
	(modify ?e (tipoCita citaNormal))
)

(deffunction calcAfin (?e1 ?e2 ?p1 ?p2 ?a1 ?a2 ?t1 ?t2 ?r1 ?r2 ?tw1 ?tw2 ?fb1 ?fb2 ?s1 ?s2 ?na1 ?na2 ?c1 ?c2 ?sb1 ?sb2)
	(+ 
		(- 10 (min 10 (abs (- ?e1 ?e2))))
		(- 10 (min 10 (/ (abs (- ?p1 ?p2)) 2)))
		(- 10 (min 10 (/ (abs (- ?a1 ?a2)) 4)))
		(if (= ?t1 ?t2) then 10 else 0)
		(if (= ?r1 ?r2) then 10 else 0)
		(if (= ?tw1 ?tw2) then 5 else 0)
		(if (= ?fb1 ?fb2) then 5 else 0)
		(if (= ?s1 ?s2) then 10 else 0)
		(- 10 (min 10 (/ (abs (- ?na1 ?na2)) 2.5)))
		(if (= ?c1 ?c2) then 10 else 0)
		(if (= ?sb1 ?sb2) then 10 else 0)
	)
)

(defrule asignarAfinidad
	?e <- (emparejamiento (nombre1 ?n1) (nombre2 ?n2))
	(persona (nombre ?n1) (edad ?e1) (peso ?p1) (altura ?a1) (timido ?t1) (religion ?r1) (twitter ?tw1) (facebook ?fb1) (gustaSalir ?s1) (numAmigos ?na1) (sociable ?sb1) (caracter ?c1))
	(persona (nombre ?n2) (edad ?e2) (peso ?p2) (altura ?a2) (timido ?t2) (religion ?r2) (twitter ?tw2) (facebook ?fb2) (gustaSalir ?s2) (numAmigos ?na2) (sociable ?sb2) (caracter ?c2))
	=>
	(modify ?e (afinidad (calcAfin ?e1 ?e2 ?p1 ?p2 ?a1 ?a2 ?t1 ?t2 ?r1 ?r2 ?tw1 ?tw2 ?fb1 ?fb2 ?s1 ?s2 ?na1 ?na2 ?c1 ?c2 ?sb1 ?sb2)))
)

(defrule superCita
	?e <- (emparejamiento (nombre1 ?n1) (nombre2 ?n2) (afinidad ?a) /*(tipoCita sinCita)*/)
	(test (>= ?a 85))
	=>
	(modify ?e (tipoCita citaMagica))
)

;;;;;;;;;;;;;
;; Mostrar ;;
(defmodule mostrar)

(defrule mostrarCompatibles
	(declare (salience 30))
	?e <- (emparejamiento (nombre1 ?n1) (nombre2 ?n2) (tipoCita sinCita))
	=>
	(printout t "> " ?n1 " y " ?n2 " son compatibles, pero no han sido citados." crlf)
)

(defrule mostrarCitados
	(declare (salience 20))
	?e <- (emparejamiento (nombre1 ?n1) (nombre2 ?n2) (tipoCita citaNormal) (afinidad ?a))
	=>
	(printout t "$ " ?n1 " y " ?n2 " han sido citados (afinidad " ?a "%)" crlf)
)

(defrule mostrarCitadosMagicos
	(declare (salience 10))
	?e <- (emparejamiento (nombre1 ?n1) (nombre2 ?n2) (tipoCita citaMagica) (afinidad ?a))
	=>
	(printout t "@ " ?n1 " y " ?n2 " tienen una Cita Magica (afinidad " ?a "%)" crlf)
)