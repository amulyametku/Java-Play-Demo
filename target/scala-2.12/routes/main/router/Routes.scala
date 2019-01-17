// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/ametku/Documents/1213-AmulyaM/play-java-starter-example/conf/routes
// @DATE:Fri Dec 28 14:36:52 IST 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  DemoController_2: controllers.DemoController,
  // @LINE:11
  BooksController_3: controllers.BooksController,
  // @LINE:20
  HomeController_1: controllers.HomeController,
  // @LINE:22
  CountController_0: controllers.CountController,
  // @LINE:24
  AsyncController_4: controllers.AsyncController,
  // @LINE:27
  Assets_5: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    DemoController_2: controllers.DemoController,
    // @LINE:11
    BooksController_3: controllers.BooksController,
    // @LINE:20
    HomeController_1: controllers.HomeController,
    // @LINE:22
    CountController_0: controllers.CountController,
    // @LINE:24
    AsyncController_4: controllers.AsyncController,
    // @LINE:27
    Assets_5: controllers.Assets
  ) = this(errorHandler, DemoController_2, BooksController_3, HomeController_1, CountController_0, AsyncController_4, Assets_5, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, DemoController_2, BooksController_3, HomeController_1, CountController_0, AsyncController_4, Assets_5, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """helloWorld""", """controllers.DemoController.helloWorld()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """namePrint/""" + "$" + """name<[^/]+>""", """controllers.DemoController.namePrint(name:String, count:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """greet""", """controllers.DemoController.greet()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books""", """controllers.BooksController.createBook()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books/""" + "$" + """id<[^/]+>""", """controllers.BooksController.getBookById(id:Integer)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books/""" + "$" + """id<[^/]+>""", """controllers.BooksController.updateBookById(id:Integer)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books/""" + "$" + """id<[^/]+>""", """controllers.BooksController.deleteBookById(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books""", """controllers.BooksController.getAllBooks()"""),
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_DemoController_helloWorld0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("helloWorld")))
  )
  private[this] lazy val controllers_DemoController_helloWorld0_invoker = createInvoker(
    DemoController_2.helloWorld(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DemoController",
      "helloWorld",
      Nil,
      "GET",
      this.prefix + """helloWorld""",
      """""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_DemoController_namePrint1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("namePrint/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DemoController_namePrint1_invoker = createInvoker(
    DemoController_2.namePrint(fakeValue[String], fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DemoController",
      "namePrint",
      Seq(classOf[String], classOf[Integer]),
      "GET",
      this.prefix + """namePrint/""" + "$" + """name<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_DemoController_greet2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("greet")))
  )
  private[this] lazy val controllers_DemoController_greet2_invoker = createInvoker(
    DemoController_2.greet(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DemoController",
      "greet",
      Nil,
      "POST",
      this.prefix + """greet""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_BooksController_createBook3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books")))
  )
  private[this] lazy val controllers_BooksController_createBook3_invoker = createInvoker(
    BooksController_3.createBook(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BooksController",
      "createBook",
      Nil,
      "POST",
      this.prefix + """books""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_BooksController_getBookById4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BooksController_getBookById4_invoker = createInvoker(
    BooksController_3.getBookById(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BooksController",
      "getBookById",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """books/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_BooksController_updateBookById5_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BooksController_updateBookById5_invoker = createInvoker(
    BooksController_3.updateBookById(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BooksController",
      "updateBookById",
      Seq(classOf[Integer]),
      "PUT",
      this.prefix + """books/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_BooksController_deleteBookById6_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BooksController_deleteBookById6_invoker = createInvoker(
    BooksController_3.deleteBookById(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BooksController",
      "deleteBookById",
      Seq(classOf[Integer]),
      "DELETE",
      this.prefix + """books/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_BooksController_getAllBooks7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books")))
  )
  private[this] lazy val controllers_BooksController_getAllBooks7_invoker = createInvoker(
    BooksController_3.getAllBooks(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BooksController",
      "getAllBooks",
      Nil,
      "GET",
      this.prefix + """books""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_HomeController_index8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index8_invoker = createInvoker(
    HomeController_1.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_CountController_count9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count9_invoker = createInvoker(
    CountController_0.count,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      this.prefix + """count""",
      """ An example controller showing how to use dependency injection""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_AsyncController_message10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message10_invoker = createInvoker(
    AsyncController_4.message,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      this.prefix + """message""",
      """ An example controller showing how to write asynchronous code""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_Assets_versioned11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned11_invoker = createInvoker(
    Assets_5.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_DemoController_helloWorld0_route(params@_) =>
      call { 
        controllers_DemoController_helloWorld0_invoker.call(DemoController_2.helloWorld())
      }
  
    // @LINE:7
    case controllers_DemoController_namePrint1_route(params@_) =>
      call(params.fromPath[String]("name", None), params.fromQuery[Integer]("count", None)) { (name, count) =>
        controllers_DemoController_namePrint1_invoker.call(DemoController_2.namePrint(name, count))
      }
  
    // @LINE:8
    case controllers_DemoController_greet2_route(params@_) =>
      call { 
        controllers_DemoController_greet2_invoker.call(DemoController_2.greet())
      }
  
    // @LINE:11
    case controllers_BooksController_createBook3_route(params@_) =>
      call { 
        controllers_BooksController_createBook3_invoker.call(BooksController_3.createBook())
      }
  
    // @LINE:12
    case controllers_BooksController_getBookById4_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_BooksController_getBookById4_invoker.call(BooksController_3.getBookById(id))
      }
  
    // @LINE:13
    case controllers_BooksController_updateBookById5_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_BooksController_updateBookById5_invoker.call(BooksController_3.updateBookById(id))
      }
  
    // @LINE:14
    case controllers_BooksController_deleteBookById6_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_BooksController_deleteBookById6_invoker.call(BooksController_3.deleteBookById(id))
      }
  
    // @LINE:15
    case controllers_BooksController_getAllBooks7_route(params@_) =>
      call { 
        controllers_BooksController_getAllBooks7_invoker.call(BooksController_3.getAllBooks())
      }
  
    // @LINE:20
    case controllers_HomeController_index8_route(params@_) =>
      call { 
        controllers_HomeController_index8_invoker.call(HomeController_1.index)
      }
  
    // @LINE:22
    case controllers_CountController_count9_route(params@_) =>
      call { 
        controllers_CountController_count9_invoker.call(CountController_0.count)
      }
  
    // @LINE:24
    case controllers_AsyncController_message10_route(params@_) =>
      call { 
        controllers_AsyncController_message10_invoker.call(AsyncController_4.message)
      }
  
    // @LINE:27
    case controllers_Assets_versioned11_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned11_invoker.call(Assets_5.versioned(path, file))
      }
  }
}
