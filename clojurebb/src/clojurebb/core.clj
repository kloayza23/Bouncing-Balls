(ns clojurebb.core
  (:gen-class)
)

(defn ball  [x y radius speed direction]	
		
)
(defn move [x y xdelta ydelta]
 (def x (+ x xdelta))
 (def y (+ y ydelta)) 
)
(defn reflectHorizontal [xdelta]
	(def xdelta (- xdelta 1))
)
(defn reflectVertical [ydelta]
	(def ydelta (- ydelta 1))	
)	
(defn Container []

)
(defn collidesWith[]

)	
(defn -main
  "I don't do a whole lot ... yet."
  [& args]  
	(print (Math/sin 98))
)

