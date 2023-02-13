(ns test.two
  (:require
    ["react-native" :as rn]
    [test.three :refer [three]]))

(defn two []
  [:> rn/View
   [:> rn/Text "Layer two. Change this and see the changes reflected."]
   [three]])
