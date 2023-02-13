(ns test.one
  (:require
    ["react-native" :as rn]
    [test.two :refer [two]]))

(defn one []
  [:> rn/View
   [:> rn/Text "Layer one. Change this and see the changes reflected."]
   [two]])
