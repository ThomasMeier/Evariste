(ns evariste.evariste_test
  (:require [clojure.test :refer :all]
            [evariste.core :refer :all]
            [evariste.defs :as defs]
            [evariste.props :as props]))

;defs tests here for now, needs reorganization
(deftest u-mod-test
  (testing "Unable to calculate elements of U(22)"
    (is (= (list 1 3 5 7 9 13 15 17 19 21)
           (defs/unit-mod 22)))))

(deftest z-mod-test
  (testing "Unable to calculate elements of Z_3"
    (is (= (list 0 1 2)
           (defs/z-mod 3)))))

(deftest make-zgroup-test
  (testing "Unable to make Z_3"
    (is (= (list 0 1 2)
           (defs/make-group "Z_3")))))

(deftest make-ugroup-test
  (testing "Unable to make U(22)"
    (is (= (list 1 3 5 7 9 13 15 17 19 21)
           (defs/make-group "U(22)")))))

(deftest find-zmod
  (testing "Unable to get the modulus for Z_15"
    (is (= 15
           (defs/find-mod "Z_15")))))


;props tests here for now, needs reorganization
(deftest order-test
  (testing "Unable to get order for group [0 1 2 3]"
    (is (= 4
           (props/order [0 1 2 3])))))

(deftest generators-test
  (testing "Unable to get proper generators for U(22)"
    (is (= (list 7 13 17 19)
           (props/generators [1 3 5 7 9 13 15 17 19 21]
                             *
                             22)))))

(deftest non-generators-test
  (testing "Unable to get non-generators for U(22)"
    (is (= [1 3 5 9 15 21]
           (props/non-generators
            [1 3 5 7 9 13 15 17 19 21]
            [7 13 17 19])))))
