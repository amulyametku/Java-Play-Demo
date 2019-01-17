// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/ametku/Documents/1213-AmulyaM/play-java-starter-example/conf/routes
// @DATE:Fri Dec 28 14:36:52 IST 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:27
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:22
  class ReverseCountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def count(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "count")
    }
  
  }

  // @LINE:6
  class ReverseDemoController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def helloWorld(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "helloWorld")
    }
  
    // @LINE:7
    def namePrint(name:String, count:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "namePrint/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("name", name)) + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("count", count)))))
    }
  
    // @LINE:8
    def greet(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "greet")
    }
  
  }

  // @LINE:11
  class ReverseBooksController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def deleteBookById(id:Integer): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "books/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:12
    def getBookById(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "books/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:15
    def getAllBooks(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "books")
    }
  
    // @LINE:13
    def updateBookById(id:Integer): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "books/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:11
    def createBook(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "books")
    }
  
  }

  // @LINE:20
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:24
  class ReverseAsyncController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def message(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "message")
    }
  
  }


}
