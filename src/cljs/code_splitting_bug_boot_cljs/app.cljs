(ns code-splitting-bug-boot-cljs.app
  (:require [cljs.loader :as loader]))

;; base module should do this as well
(loader/set-loaded! :cljs-base)

(defn ^:export init []
  (js/console.log "Init loaded")
  ;; loading other modules should be done ONLY after set-loaded! in the current
  ;; module
  (loader/load :track
               (fn [] ((resolve 'code-splitting-bug-boot-cljs.tracking/sum) 1 2 3))))
