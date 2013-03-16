(ns clamm.core-test
  (:use clojure.test
        clamm.core))

(deftest digit-generation
  (testing "digit is generated properly"
    (is (= 4 (generate [5 7 2])))))

(defn gen-message [payload]
  (let [check (generate payload)]
    (conj payload check)))


(deftest verification
  (testing "checkdigit verification"
    (let [msg (gen-message [5 7 2])]
      (is (verify msg) "Check digit is ok"))))

;(deftest batch
;  (testing "batch generation"
;    (while 

