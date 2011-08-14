package sltc.filter

import org.scalatra._
import java.net.URL
import scalate.ScalateSupport

class MainFilter extends ScalatraFilter with ScalateSupport {

  get("/") {
    templateEngine.layout("/main/index.jade")
  }

  //notFound {
    //filterChain.doFilter(request, response)
  //}
}
