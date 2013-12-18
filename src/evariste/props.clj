; Group Properties
(ns evariste.props
  (:require [evariste.defs :as defs]
            [clojure.math.numeric-tower :as math])
  (use [clojure.set :only (difference)]))

(defn order
  "Number of elements in the group"
  [G]
  (count G))

(defn generators
  "Find the elements that generate the group"
  [G group-operation group-mod]
  (filter
   (fn [g]
     (= G
        (sort
         (vec
          (map (fn [e] (mod e group-mod))
               (take
                (order G)
                (iterate (partial group-operation g) g)))))))
   G))

(defn non-generators
  "Gets elements that are not generators"
  [G generating-elements]
  (vec
   (difference
    (set G)
    (set generating-elements))))

(defn determine-property
  "Determines the property being requested and prints the result"
  [request]
  (let [req-prop (get request 0)
        req-group (defs/make-group (get request 1))
        req-mod (defs/find-mod (get request 1))
        group-operation (if (= (.charAt (get request 1) 0) \Z) + *)]
    (cond
     (= req-prop "order") (println (order req-group))
     (= req-prop "generators") (println (generators
                                         req-group
                                         group-operation
                                         req-mod))
     (= req-prop "non-generators") (println (non-generators
                                             req-group
                                             (generators
                                              req-group
                                              group-operation
                                              req-mod)))
     :else (println "Well, that's no good.\n"))))
