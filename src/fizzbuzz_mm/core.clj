(ns fizzbuzz_mm.core)



(defn dispatch [x]
  (cond
   (= 0 (mod x 15)) :fizzbuzz
   (= 0 (mod x 3)) :fizz
   (= 0 (mod x 5)) :buzz
   (number? x) :number))

(defmulti fizzbuzz dispatch)

(defmethod fizzbuzz :number [x]
  x)

(defmethod fizzbuzz :fizzbuzz [x]
  "fizzbuzz")

(defmethod fizzbuzz :fizz [x]
  "fizz")

(defmethod fizzbuzz :buzz [x]
  "buzz")


	   
  