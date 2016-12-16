(ns clojurebb.core
  (:gen-class)
)
(defn ball  [speed direction]	
	(def xdelta (* speed (Math/cos (Math/toRadians direction))))	
	(def ydelta (* (- speed) (Math/sin (Math/toRadians direction) )))			
)
(defn move [x y xdelta ydelta]
 (def xr (+ x xdelta))
 (def yr (+ y ydelta))   
)
(defn reflectHorizontal [xdelta]
	(def xdelta (- xdelta 1))
)
(defn reflectVertical [ydelta]
	(def ydelta (- ydelta 1))	
)	
(defn Container [x y width heigth]
	(def x2 (+ x (- width 1)))
	(def y2 (+ y (- heigth 1)))
)
(defn collidesWith[x y radius x1 x2 y1 y2 xdelta ydelta]
	(if 
		(or (<= (- x radius) x1) (>= (+ x radius) x2))
			(reflectHorizontal [xdelta] )
	)
	(if 
		(or (<= (- y radius) y1) (>= (+ y radius) y2))
			(reflectVertical [ydelta] )
	)
)	
(defn -main
  [& args]  
  (def x1 0)
  (def x 0)
  (def y 0)
  (def y1 0)
  (def x2 0)
  (def y2 0)
  (def xdelta 0)
  (def ydelta 0)  
  (move 4 5 3 3)  
)