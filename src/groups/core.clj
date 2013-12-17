(ns groups.core
  "A way to play with abstract algebraic groups and their elements"
  (:gen-class)
  (:require [groups.defs :as defs]
            [groups.props :as props])
  (use [clojure.string :only (split trim)]))

(defn read-user-request
  "This is the loop which will take, evaluate user input and return ouput"
  [request]

  (if (not= request "quit")

    (if (= 1 (count (split request #"\s+")))
      (println (defs/make-group request))
      (props/determine-property (split request #"\s+")))

    (System/exit 0))

  (println "\nAnything else? (type 'quit' to end.)\n")
  (read-user-request (trim (read-line))))

(defn hello
  [x]
  (println (split x #"\s+")))

(defn -main
  "Initialize working loop"
  [& args]
  (println "Hello there! What group or property would you like to look at?")
  (read-user-request (trim (read-line))))
