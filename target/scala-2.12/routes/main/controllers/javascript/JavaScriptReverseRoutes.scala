// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/ametku/Documents/1213-AmulyaM/play-java-starter-example/conf/routes
// @DATE:Fri Dec 28 14:36:52 IST 2018

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:27
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:22
  class ReverseCountController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def count: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CountController.count",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "count"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseDemoController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def helloWorld: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DemoController.helloWorld",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "helloWorld"})
        }
      """
    )
  
    // @LINE:7
    def namePrint: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DemoController.namePrint",
      """
        function(name0,count1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "namePrint/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("name", name0)) + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("count", count1)])})
        }
      """
    )
  
    // @LINE:8
    def greet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DemoController.greet",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "greet"})
        }
      """
    )
  
  }

  // @LINE:11
  class ReverseBooksController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def deleteBookById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BooksController.deleteBookById",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "books/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:12
    def getBookById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BooksController.getBookById",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "books/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:15
    def getAllBooks: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BooksController.getAllBooks",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "books"})
        }
      """
    )
  
    // @LINE:13
    def updateBookById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BooksController.updateBookById",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "books/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:11
    def createBook: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BooksController.createBook",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "books"})
        }
      """
    )
  
  }

  // @LINE:20
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:24
  class ReverseAsyncController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def message: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AsyncController.message",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "message"})
        }
      """
    )
  
  }


}
