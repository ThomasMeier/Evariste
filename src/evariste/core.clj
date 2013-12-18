; ## Evariste Abstract Algebra Calculator
; Evariste is a way to look at groups and their properties. It has
; the capability to generate groups and their elements. Right now,
; only two groups are supported. In time, more groups may be supported.
; Additionally, Evariste has ways to look into groups: List their elements
; and properties.
; ## Supported groups
; The two groups Evariste supports right now are
; 1. Group of units modulo n under multiplication, U(n). Higher n causes overflow, however.
; 2. Group of integers modulo n under addition, Z_n
; ## Supported properties
; 1. Order of the group: `order Z_5`
; 2. Generators of the group: `generators U(15)`
; 3. Non-generators of the group: `non-generators U(15)`
(ns evariste.core
  "A way to look inside abstract algebraic groups and their properties."
  (:gen-class)
  (:require [evariste.defs :as defs]
            [evariste.props :as props])
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

(defn -main
  "Initialize working loop"
  [& args]
  (println "Hello there! What group or property would you like to look at?")
  (read-user-request (trim (read-line))))
