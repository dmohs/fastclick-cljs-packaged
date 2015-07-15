# fastclick-cljs-packaged
Polyfill to remove click delays on browsers with touch UIs. Packaged for ClojureScript.

## Usage

Add

```clojure
[dmohs/fastclick-cljs-packaged "1.0.6"]
```

to your `project.clj` or `build.boot` file, then import FastClick into your ClojureScript namespace and enable it for the document body:

```clojure
(ns my-app
    (:require FastClick))

(js/FastClick.attach (.-body js/document))
```
