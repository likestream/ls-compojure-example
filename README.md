This is a an example Compojure-based web application that demonstrates
a number of basic features of [Ring][1] and
[Compojure][2]. 

This example borrows *heavily* from James Reeves'
[Compojure-Example][6] project.

The example is oriented towards [Emacs/Slime/Swank][8] users.

To play around with this example project, you will first need
[Leiningen][3] installed.

Download the project dependencies with:

    lein deps

Now you can start a development web server with:

    lein swank
    
You should see something like this:

    user=> Connection opened on local port  4005
    #<ServerSocket ServerSocket[addr=localhost/127.0.0.1,port=0,localport=4005]>
    
Then, in emacs:

    M-x slime-connect

Accept the default host and port, you should be connected  to the
running Clojure in your slime-repl window.  Interact with the
Clojure REPL as follows:

    ; SLIME 20100404
    user> (use 'ring.util.serve)
    nil
    user> (use 'compojure.example.routes)
    nil
    user> (serve main-routes)
    Started web server on port 3000

A web browser should get launched pointing to the web server
running the app.  If you prefer to launch the web browser yourself,
call

    (serve-headless main-routes)

instead.

I intend to extend this example with other typical features needed by
a web application, with different feature sets contained in 
seperate branches of this project.

To Do:
------

Explain how to set an breakpoint in the app.

For some reason the second image in this app doesn't work in Safari.
Use FireFox for now!

[1]: https://github.com/mmcgrana/ring
[2]: https://github.com/weavejester/compojure
[3]: https://github.com/technomancy/leiningen
[4]: http://tomcat.apache.org
[5]: http://jetty.codehaus.org/jetty
[6]: https://github.com/weavejester/compojure-example
[7]: https://github.com/weavejester/ring-serve
[8]: https://github.com/technomancy/swank-clojure
