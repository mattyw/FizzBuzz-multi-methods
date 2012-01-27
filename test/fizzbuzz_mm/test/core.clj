(ns fizzbuzz_mm.test.core
  (:use [fizzbuzz_mm.core])
  (:use [clojure.test]))

(deftest test1
  (is (= 1 (fizzbuzz 1))))

(deftest test2
  (is (= 2 (fizzbuzz 2))))

(deftest test3
  (is (= "fizz" (fizzbuzz 3))))

(deftest test4
  (is (= 4 (fizzbuzz 4))))

(deftest test5
  (is (= "buzz" (fizzbuzz 5))))

(deftest test6
  (is (= "fizz" (fizzbuzz 6))))

(deftest test10
  (is (= "buzz" (fizzbuzz 10))))

(deftest test15
  (is (= "fizzbuzz" (fizzbuzz 15))))

