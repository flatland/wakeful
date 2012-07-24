(defproject wakeful "0.3.3"
  :url "https://github.com/flatland/wakeful"
  :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :description "restful routing alternative"
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [useful "0.8.3-alpha8"]
                 [clj-json "0.5.0"]
                 [compojure "1.0.0"]
                 [ring "1.0.1"]
                 [ego "0.1.7"]
                 [hiccup "0.3.8"]
                 [org.clojure/tools.namespace "0.1.1" :exclusions [org.clojure/java.classpath]]
                 [org.clojure/java.classpath "0.2.0"]]
  :aliases {"testall" ["with-profile" "dev,default:dev,1.3,default:dev,1.5,default" "test"]}
  :profiles {:1.3 {:dependencies [[org.clojure/clojure "1.3.0"]]}
             :1.5 {:dependencies [[org.clojure/clojure "1.5.0-master-SNAPSHOT"]]}}
  :repositories {"sonatype-snapshots" {:url "http://oss.sonatype.org/content/repositories/snapshots"
                                       :snapshots true
                                       :releases {:checksum :fail :update :always}}})
