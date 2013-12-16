; The Group Definitions
(ns groups.group-definitions
  (:require [clojure.math.numeric-tower :as math]))

(defn unit-mod
  "U(n): Integers under multiplication mod n, relatively prime with n."
  [n]
  (filter
    (fn [i] ( = 1 (math/gcd i n)))
    (range 1 n)))

(defn z-mod
  "Z_n: Integers under addition mod n."
  [n]
  (range 0 n ))

(defn make-group
  "Make a group from string name of group, e.g., U(n) or Z_n"
  [str-group-name]
  (let [N (re-find (re-pattern "\\d+") str-group-name)]
    (if (= (.charAt str-group-name 0) \Z)
      (z-mod N)
      (unit-mod N))))
