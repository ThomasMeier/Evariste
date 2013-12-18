(defproject abstract-groups "0.1.0"
  :description "A program to provide information about finite algebraic groups."
  :url "http://citrine.it/"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/math.numeric-tower "0.0.2"]]
  :main ^:skip-aot groups.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
