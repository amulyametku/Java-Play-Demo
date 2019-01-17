// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/ametku/Documents/1213-AmulyaM/play-java-starter-example/conf/routes
// @DATE:Fri Dec 28 14:36:52 IST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
