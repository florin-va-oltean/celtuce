(load-file ".deps-versions.clj")
(defproject celtuce celtuce-version
  :description "An idiomatic Clojure Redis client wrapping the Java client Lettuce"
  :url "https://github.com/lerouxrgd/celtuce"
  :license {:name "Apache License 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}
  :dependencies [[org.clojure/clojure ~clj-version]
                 [celtuce-core ~celtuce-version]
                 [celtuce-pool ~celtuce-version]
                 [celtuce-manifold ~celtuce-version]]
  :global-vars {*warn-on-reflection* true}
  :repositories [["releases" {
                              :url "https://repo.deps.co/quasar-software-research/releases"
                              :sign-releases false
                              :username :env/deps_key
                              :password :env/deps_secret}]
                 ["snapshots" {
                               :url "https://repo.deps.co/quasar-software-research/snapshots"
                               :sign-releases false
                               :username :env/deps_key
                               :password :env/deps_secret}]])
