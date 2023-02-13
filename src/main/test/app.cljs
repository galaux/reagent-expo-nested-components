(ns test.app
  (:require
    ["react-native" :as rn]
    [reagent.core :as r]
    [shadow.expo :as expo]
    [test.one :refer [one]]))

(defn root []
  [one])

(defn start
  {:dev/after-load true}
  []
  (expo/render-root (r/as-element [root {:x (js/Date.now)}])))

(defn init []
  (start))

