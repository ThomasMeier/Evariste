(defproject Evariste "0.1.0"
  :description "Evariste is a simple calculator for finite algebraic groups."
  :url "http://citrine.it/"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/math.numeric-tower "0.0.2"]]
  :plugins [[lein-marginalia "0.7.1"]]
  :main ^:skip-aot evariste.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
