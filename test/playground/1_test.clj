(ns playground.1_test
  (:require [clojure.test :refer :all]
            [playground.1 :refer :all]))

(deftest is-devisible-by-test
  (testing "10 must be divisible by 1 2 and 5"
    (is (= (is-devisible-by 10 [1 2 5]) true))))

(deftest get-num-of-multiples-in-range-test
  (testing "The sum of the multiples of 3 or 5 below 1000 must be 233168"
    (is (= (get-num-of-multiples-in-range 1000 3 5) 233168))))
