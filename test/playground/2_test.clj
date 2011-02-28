(ns playground.2_test
  (:require [clojure.test :refer :all]
            [playground.2 :refer :all]))

(deftest sum-even-fib-test
  (testing "The sum of the even-valued fibonacci below 4_000_000 must be 4613732"
    (is (= (sum-even-fib 4000000) 4613732))))

