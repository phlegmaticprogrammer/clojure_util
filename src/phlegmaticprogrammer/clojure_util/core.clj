(ns phlegmaticprogrammer.clojure_util.core)

(defn runtime-error [& s] (throw (RuntimeException. (apply str s))))

(defn reduce-indexed [f v coll]
   (let [g (fn [[u index] c] [(f u index c) (+ index 1)])]
     (first (reduce g [v 0] coll))))
 
