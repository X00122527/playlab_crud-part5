
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, user: models.users.User)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.57*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*6.62*/("""
        """),format.raw/*7.9*/("""<title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*10.54*/routes/*10.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*10.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*11.59*/routes/*11.65*/.Assets.versioned("images/favicon.png")),format.raw/*11.104*/("""">
    </head>
    <body>
    <!-- start of nav section -->
    <nav class="navbar navbar-inverse">
            <!-- nav header/ branding -->
            <div class="navbar-header">
                <a class="navbar-brand" href="/">Product Catalogue</a>
            </div>
            <!-- List containing nav links -->
            <ul class="nav navbar-nav">
                <li """),_display_(/*22.22*/if(title == "Home")/*22.41*/{_display_(Seq[Any](format.raw/*22.42*/("""class="active"""")))}),format.raw/*22.57*/("""><a href=""""),_display_(/*22.68*/routes/*22.74*/.HomeController.index()),format.raw/*22.97*/("""">Home</a></li>
                <li """),_display_(/*23.22*/if(title == "About")/*23.42*/{_display_(Seq[Any](format.raw/*23.43*/("""class="active"""")))}),format.raw/*23.58*/("""><a href=""""),_display_(/*23.69*/routes/*23.75*/.HomeController.about()),format.raw/*23.98*/("""">About Us</a></li>
                <li """),_display_(/*24.22*/if(title == "Products")/*24.45*/{_display_(Seq[Any](format.raw/*24.46*/("""class="active"""")))}),format.raw/*24.61*/("""><a href=""""),_display_(/*24.72*/routes/*24.78*/.HomeController.products()),format.raw/*24.104*/("""">Products</a></li>
                <li """),_display_(/*25.22*/if(title == "Login")/*25.42*/{_display_(Seq[Any](format.raw/*25.43*/("""class="active"""")))}),format.raw/*25.58*/(""">
                    """),_display_(/*26.22*/if(user != null)/*26.38*/{_display_(Seq[Any](format.raw/*26.39*/("""
                        """),format.raw/*27.25*/("""<a href=""""),_display_(/*27.35*/routes/*27.41*/.LoginController.logout()),format.raw/*27.66*/("""">Logout """),_display_(/*27.76*/user/*27.80*/.getName()),format.raw/*27.90*/("""</a>
                    """)))}/*28.22*/else/*28.26*/{_display_(Seq[Any](format.raw/*28.27*/("""
                        """),format.raw/*29.25*/("""<a href =""""),_display_(/*29.36*/routes/*29.42*/.LoginController.login()),format.raw/*29.66*/("""">Login</a></li>
                    """)))}),format.raw/*30.22*/("""
            """),format.raw/*31.13*/("""</ul>
    </nav>
    
    <div class="container-fluid">
        """),format.raw/*36.32*/("""
        """),_display_(/*37.10*/content),format.raw/*37.17*/("""
    """),format.raw/*38.5*/("""</div>
    <footer class="container-fluid">
         <p></p>
     </footer>

    </body>
    <!-- Load JavaScript libs last -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src=""""),_display_(/*47.19*/routes/*47.25*/.Assets.versioned("javascripts/hello.js")),format.raw/*47.66*/("""" type="text/javascript"></script>
</html>

"""))
      }
    }
  }

  def render(title:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Tue Dec 13 21:16:59 GMT 2016
                  SOURCE: /home/wdd/webapps/playlab_crud-part5/app/views/main.scala.html
                  HASH: 84a4ad26a29fa7f8815fe3ae2512871b21c173d3
                  MATRIX: 766->1|916->56|946->60|1028->168|1064->178|1098->186|1123->191|1401->442|1416->448|1479->489|1568->551|1583->557|1644->596|2062->987|2090->1006|2129->1007|2175->1022|2213->1033|2228->1039|2272->1062|2337->1100|2366->1120|2405->1121|2451->1136|2489->1147|2504->1153|2548->1176|2617->1218|2649->1241|2688->1242|2734->1257|2772->1268|2787->1274|2835->1300|2904->1342|2933->1362|2972->1363|3018->1378|3069->1402|3094->1418|3133->1419|3187->1445|3224->1455|3239->1461|3285->1486|3322->1496|3335->1500|3366->1510|3412->1537|3425->1541|3464->1542|3518->1568|3556->1579|3571->1585|3616->1609|3686->1648|3728->1662|3824->1821|3862->1832|3890->1839|3923->1845|4294->2189|4309->2195|4371->2236
                  LINES: 27->1|32->1|34->3|37->6|38->7|38->7|38->7|41->10|41->10|41->10|42->11|42->11|42->11|53->22|53->22|53->22|53->22|53->22|53->22|53->22|54->23|54->23|54->23|54->23|54->23|54->23|54->23|55->24|55->24|55->24|55->24|55->24|55->24|55->24|56->25|56->25|56->25|56->25|57->26|57->26|57->26|58->27|58->27|58->27|58->27|58->27|58->27|58->27|59->28|59->28|59->28|60->29|60->29|60->29|60->29|61->30|62->31|66->36|67->37|67->37|68->38|77->47|77->47|77->47
                  -- GENERATED --
              */
          