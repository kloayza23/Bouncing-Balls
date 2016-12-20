(ns clojurebb.core
  (:gen-class)
)
(defn collidesWithx[x radius x1 x2 xdelta]
	(if 
		(or (<= (- x radius) x1) (>= (+ x radius) x2))
			(- xdelta 1)
			(- xdelta 0)			
	)	
)
(defn collidesWithy[y radius y1 y2 ydelta]	
	(if 
		(or (<= (- y radius) y1) (>= (+ y radius) y2))
			(- ydelta 1)
			(- ydelta 0)
			
	)
)
(defn move [x y radius xdelta ydelta niter x1 y1 x2 y2]	
	(if
		(not= niter 0)
		(println "Ball at (" x "," y ") of velocity (" xdelta "," ydelta ")")
	)
	(if
		(< niter 10)			
			(move (+ x xdelta) (+ y ydelta) radius 	(collidesWithx x radius x1 x2 xdelta) (collidesWithy y radius y1 y2 ydelta) (+ niter 1) x1 y1 x2 y2) 						
	)		
)	
(defn -main
  [& args]    
  (def xdelta (* 10 (Math/cos (Math/toRadians 30))))	
  (def ydelta (* (- 10) (Math/sin (Math/toRadians 30) )))  
  (move 50 50 5 xdelta ydelta 0 0 0 99 99)  
)
;(let [xdelta (if (or (<= (- x radius) x1) (>= (+ x radius) x2))
;		list((- xdelta 1) 0)			
;)
