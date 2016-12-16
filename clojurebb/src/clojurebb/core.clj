(ns clojurebb.core
  (:gen-class)
)
(defn ball  [speed direction]	
	(def xdelta (* speed (Math/cos (Math/toRadians direction))))	
	(def ydelta (* (- speed) (Math/sin (Math/toRadians direction) )))			
	(list xdelta ydelta)
)
(defn move [x y xdelta ydelta]
 (def xr (+ x xdelta))
 (def yr (+ y ydelta))    
 (clojure.string/join ", " [xr yr])
)
(defn reflectHorizontal [xdelta]
	(def xdeltar (- xdelta 1))
	(+ xdeltar 0) 
)
(defn reflectVertical [ydelta]
	(def ydeltar (- ydelta 1))	
	(+ ydeltar 0)
)	
(defn Container [x y width heigth]
	(def x2 (+ x (- width 1)))
	(def y2 (+ y (- heigth 1)))
	(list x2 y2)
)
(defn collidesWith[x y radius x1 x2 y1 y2 xdelta ydelta]
	(if 
		(or (<= (- x radius) x1) (>= (+ x radius) x2))
			(reflectHorizontal xdelta)
			(+ 0 0)
	)
	(if 
		(or (<= (- y radius) y1) (>= (+ y radius) y2))
			(reflectVertical ydelta)
			(+ 0 0)
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
  (loop [x 0]
      (when (< x 10)
         
      	(move)


        (recur (+ x 1))
      )
   )


)
