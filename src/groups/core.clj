(ns groups.core
  "A way to play with abstract algebraic groups and their elements"
  (:require [groups.group-properties]
            [groups.element-properties]
            [groups.group-definitions])
  (use '[clojure.string :only (split trim)]))

(def supported-requests
  "Supported requests"
  (hash-map :order 1))

(defn read-user-request
  "This is the loop which will take, evaluate user input and return ouput"
  [request]
  (if (not= request "quit")
    (if (= 1 (count (split request #"\s+")))
      (make-group request))))

(defn -main
  "Initialize working loop"
  [& args]
  (println "Hello there! What group or property would you like to look at?")
  (read-user-request (trim read-line)))
