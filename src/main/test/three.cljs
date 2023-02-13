(ns test.three
  (:require
    ["react-native" :as rn]
    [shadow.expo :as expo]))

(defn three []
  [:> rn/View
   [:> rn/Text "Layer three. Change this but don't see the changes reflected :(."]])
