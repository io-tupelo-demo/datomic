(defproject io.tupelo/datomic-demo "19.12.01"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [
                 [io.tupelo/datomic "19.12.01" ]
                 [org.clojure/clojure "1.10.1"]
                 [prismatic/schema "1.1.12"]
                 [tupelo "0.9.182"]
                 ]
  :resource-paths ["resources/"
                   "resources/datomic-free-0.9.5661-everything.jar"
                  ]
  :global-vars { *warn-on-reflection* false }

  :update :daily ;  :always

  :target-path "target/%s"
  :clean-targets [ "target" ]

  :jvm-opts ["-Xms500m" "-Xmx2g"
            ]
)
