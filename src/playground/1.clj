(ns playground.1)


(defn is-devisible-by
  "
  Check whether n is divisible by any numbers in nums"
  [n nums]
  (some true? (map #(zero? (mod n %)) nums)))


(defn get-num-of-multiples-in-range
  "
  From: https://projecteuler.net/problem=1

  If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
  The sum of these multiples is 23. Find the sum of all the multiples of 3 or 5 below x."
  [rang & mults]
  (->>
    (range rang)
    (filter #(is-devisible-by % mults))
    (reduce +))
  )

(println (get-num-of-multiples-in-range 1000 3 5))
