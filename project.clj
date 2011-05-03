(defproject 
  compojure-example "0.1.1" 
  :description "Example Compojure project for emacs/slime users" 
  :dependencies [[org.clojure/clojure "1.2.0"] 
		 [compojure "0.6.2"]
		 [hiccup "0.3.4"]]
  :dev-dependencies [[lein-search "0.3.4"]
		     ;; [lein-ring "0.3.2"]
		     [ring-serve "0.1.1"]
		     [swank-clojure "1.3.0"]
		     [lein-js "0.1.1-SNAPSHOT"]
		     [lein-beanstalk "0.2.0"]]

  :clobber ["*.war", "lib/*.jar", "lib/dev/*.jar"]
  :ring {:handler compojure.example.routes/app}
  :aws {:access-key "secret1"
	:secret-key "secret2"})

