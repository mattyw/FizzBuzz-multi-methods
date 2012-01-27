(ns fizzbuzz_mm.core)

(defn fizzbuzz [x]
  (cond
   (= 0 (mod x 15)) "fizzbuzz"
   (= 0 (mod x 3)) "fizz"
   (= 0 (mod x 5)) "buzz"
   (number? x) x))