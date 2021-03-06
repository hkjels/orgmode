(defproject bnbeckwith/orgmode "0.7.5"
  :description "Org-mode parser"
  :url "http://github.com/bnbeckwith/orgmode"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [hiccup "1.0.4"]
                 [org.apache.commons/commons-lang3 "3.1"]]
  :profiles {:dev {:dependencies [[midje "1.6.3"]]}})
