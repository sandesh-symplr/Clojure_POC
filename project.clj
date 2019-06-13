(defproject rest-demo "0.1.0-SNAPSHOT"
  :description "An example Clojure REST API Implementation"
  :url "https://medium.com/@functionalhuman/building-a-rest-api-in-clojure-3a1e1ae096e"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 ; Compojure - A basic routing library
                 [compojure "1.6.1"]
                 ; Our Http library for client/server
                 [http-kit "2.3.0"]
                 ; Ring defaults - for query params etc
                 [ring/ring-defaults "0.3.2"]
                 ; Clojure data.JSON library
                 [org.clojure/data.json "0.2.6"]]
  :main ^:skip-aot rest-demo.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
