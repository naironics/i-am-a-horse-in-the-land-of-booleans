(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (= x true) true (if (= x nil) false (if (= x false) false true))))

(defn abs [x]
  (if (> x 0) x (- x)))

(defn divides? [divisor n]
  (if (= 0 (mod n divisor)) true false))

(defn fizzbuzz [n]
  (cond 
    (divides? 3 n) (cond (divides? 5 n) "gotcha!" :else "fizz") 
    (divides? 5 n) "buzz"
    :else        ""))

(defn teen? [age]
  (if (<= 13 age 19) true false))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
    (number? x) (* 2 x)
    (empty? x) nil
    (list? x) (* 2 (count x))
    (vector? x) (* 2 (count x))
    :else true))

(defn leap-year? [year]
  (cond 
    (divides? 400 year) true
    (divides? 100 year) false
    (divides? 4 year) true
    :else false ))

; '_______'
