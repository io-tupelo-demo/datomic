(defproject io.tupelo.demo/datomic "20.01.19"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [; libs are in groups or priority order, since in Lein "first one wins"

                 ; High-priority libs
                 [com.datomic/datomic-free "0.9.5703.21"]
                 [org.clojure/clojure "1.10.1"]

                 ; Normal-priority libs
                 [io.tupelo/datomic "20.01.19" ]
                 [prismatic/schema "1.1.12"]
                 [tupelo "0.9.188"]
                 ]
  :resource-paths ["resources/" ]
  :global-vars { *warn-on-reflection* false }

  :update :daily ;  :always

  :target-path "target/%s"
  :clean-targets [ "target" ]

  :jvm-opts ["-Xms500m" "-Xmx2g"
            ]
)
