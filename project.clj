(defproject
  boot-project
  "0.0.0-SNAPSHOT"
  :resource-paths
  ["resources"]
  :exclusions
  []
  :source-paths
  ["src/trackers" "src/cljs"]
  :repositories
  [["clojars" {:url "https://repo.clojars.org/"}]
   ["maven-central" {:url "https://repo1.maven.org/maven2"}]]
  :mirrors
  []
  :dependencies
  [[adzerk/boot-cljs "2.1.4" :scope "test"]
   [adzerk/boot-cljs-repl "0.3.3" :scope "test"]
   [adzerk/boot-reload "0.5.1" :scope "test"]
   [pandeiro/boot-http "0.8.3" :scope "test"]
   [com.cemerick/piggieback "0.2.1" :scope "test"]
   [org.clojure/tools.nrepl "0.2.13" :scope "test"]
   [weasel "0.7.0" :scope "test"]
   [org.clojure/clojurescript "1.9.946"]])