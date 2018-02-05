(ns code-splitting-bug-boot-cljs.tracking
  (:require [cljs.loader :as loader]
            [tracker1.script :as t]))

(defn sum [a b c]
  (js/console.log "from lazy-loaded:" (t/sum a b c)))

(loader/set-loaded! :track)
