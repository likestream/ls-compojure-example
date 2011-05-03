(ns compojure.example.views
  (:use [hiccup core page-helpers]))

(defn index-page []
  (let [x "Clojure "
	y "Rocks!"]
    ; (swank.core/break)
    (html5
     [:head
      [:title "Clojure Rocks!"]
      (include-css "/css/style.css")
      ; (include-js "http://code.jquery.com/jquery-1.5.1.js")
      (include-js "http://ajax.googleapis.com/ajax/libs/jquery/1.5.1/jquery.min.js")
      (include-js "/js/fun.js")]
     [:body
      [:center [:img#myimage {:src "/clojure-icon.gif"}]]
      [:h1#mystring (str x y)]])))

(defn test-page [tagid]
    ; (swank.core/break)
    (html5
     [:head
      [:title "Test Page!"]]
     [:body
       [:h1 (str "Tag ID: " tagid)]]))

