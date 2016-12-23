; Author: Kleber Loayza
; Descripcion: Programa que ejecuta Bouncing Balls, que permite que un determinado objetivo 
; cirucle en un rectangulo de 100 x 100, con cierta velocidad determinada por
; xdelta y ydelta.
(ns clojurebb.core
  (:gen-class)
)
; Esta funcion permite verificar si x ha llegado al limite x2, y si es asi, cambia a ydelta por
; su opuesto, de la misma manera con su limite minimo x1, lo cambia si ha llegado al minimo.
(defn collidesWithx[x radius x1 x2 xdelta]
	(if 
		(or (<= (- x radius) x1) (>= (+ x radius) x2))
			(- 0 xdelta)
			(- xdelta 0)			
	)	
)
; Esta funcion permite verificar si y ha llegado al limite y2, y si es asi, cambia a ydelta por
; su opuesto, de la misma manera con su limite minimo y1, lo cambia si ha llegado al minimo.
(defn collidesWithy[y radius y1 y2 ydelta]	
	(if 
		(or (<= (- y radius) y1) (>= (+ y radius) y2))
			(- 0 ydelta)
			(- ydelta 0)
			
	)
)
; Esta funcion permite mover el objeto llegando a sus limites respectivos x2 y y2 como maximos, y 
; x1 y y1, como limites minimos.
(defn move [x y radius xdelta ydelta iiter niter x1 y1 x2 y2]	
	(if
		(not= iiter 0)
		(println "Ball at (" x "," y ") of velocity (" xdelta "," ydelta ")")
	)
	(if
		(< iiter niter)			
				(move (+ x xdelta) (+ y ydelta) radius 	
					(collidesWithx (+ x xdelta) radius x1 x2 xdelta) 
					(collidesWithy (+ y ydelta) radius y1 y2 ydelta) 
					(+ iiter 1) niter x1 y1 x2 y2
				) 				
		(println "End Game")
	)		
)	
(defn -main
  [& args]    
  (def xdelta (* 10 (Math/cos (Math/toRadians 30))))	
  (def ydelta (* (- 10) (Math/sin (Math/toRadians 30))))  
  (def x 50)
  (def y 50)
  (def radius 5)
  (def iiter 0); iiter = indice de iteraciones
  (def niter 100); niter = numero de iteraciones
  (def x1 0)
  (def y1 0)
  (def x2 100)
  (def y2 100)  
; tengo que cambiar el valor del collides, y que se mantenga cambiado hasta que
; llegue otra vez a x2 del otro lado.
  (move x y radius xdelta ydelta iiter niter x1 y1 x2 y2)  
)
