(set-env!
 :resource-paths #{"resources"}
 :dependencies '[[cljsjs/boot-cljsjs "0.4.7"]])

(require '[cljsjs.boot-cljsjs.packaging :refer :all])

(def fastclick-version "1.0.6")

(task-options!
 pom {:project 'dmohs/fastclick-cljs-packaged
      :version fastclick-version
      :description "Polyfill to remove click delays on browsers with touch UIs."
      :url "https://github.com/ftlabs/fastclick"
      :license {"MIT" "https://raw.githubusercontent.com/ftlabs/fastclick/master/LICENSE"}
      :scm {:url "https://github.com/dmohs/fastclick-cljs-packaged"}})

(deftask package []
  (comp
   (download :url (str "https://cdnjs.cloudflare.com/ajax/libs/fastclick/"
                       fastclick-version
                       "/fastclick.min.js"))
   (download :url (str "https://cdnjs.cloudflare.com/ajax/libs/fastclick/"
                       fastclick-version
                       "/fastclick.js"))
   (sift :move {#"^fastclick.js$" "fastclick.inc.js"})
   (sift :move {#"^fastclick.min.js$" "fastclick.min.inc.js"})
   (sift :include #{#"^fastclick\..*\.js"})
   (deps-cljs :name "FastClick")))

;; Install to local repository:
;; boot package pom jar install
