import org.scalatra._
import java.net.URL
import scalate.ScalateSupport

class MainFilter extends ScalatraFilter with ScalateSupport {

  get("/") {
    val templatePath = "WEB-INF/scalate/templates/test.jade"
    //val templatePath = "/WEB-INF/scalate/templates/test.jade"
    templateEngine.layout(templatePath)
  }

  notFound {
    // If no route matches, then try to render a Scaml template
    val templateBase = requestPath match {
      case s if s.endsWith("/") => s + "index"
      case s => s
    }
    val templatePath = "/WEB-INF/scalate/templates/" + templateBase + ".scaml"
    servletContext.getResource(templatePath) match {
      case url: URL =>
        contentType = "text/html"
        templateEngine.layout(templatePath)
      case _ =>
        filterChain.doFilter(request, response)
    }
  }
}
