
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
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

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[models.users.Login],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[models.users.Login], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.64*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Login", user)/*4.21*/{_display_(Seq[Any](format.raw/*4.22*/("""

    """),format.raw/*6.5*/("""<div class ="col-xs-4">
        <h3>Sign in</h3>
        """),_display_(/*8.10*/if(loginForm.hasGlobalErrors)/*8.39*/{_display_(Seq[Any](format.raw/*8.40*/("""
            """),format.raw/*9.13*/("""<p class="alert alert-warning">
                """),_display_(/*10.18*/loginForm/*10.27*/.globalError.message),format.raw/*10.47*/("""
            """),format.raw/*11.13*/("""</p>
        """)))}),format.raw/*12.10*/("""
        """),_display_(/*13.10*/if(flash.containsKey("error"))/*13.40*/{_display_(Seq[Any](format.raw/*13.41*/("""
            """),format.raw/*14.13*/("""<div class="alert alert-warning">
                """),_display_(/*15.18*/flash/*15.23*/.get("loginRequired")),format.raw/*15.44*/("""
            """),format.raw/*16.13*/("""</div>
        """)))}),format.raw/*17.10*/("""

        """),_display_(/*19.10*/helper/*19.16*/.form(action = controllers.routes.LoginController.loginSubmit())/*19.80*/{_display_(Seq[Any](format.raw/*19.81*/("""
            """),format.raw/*20.13*/("""<div class ="form-group">
                """),_display_(/*21.18*/inputText(loginForm("email"), '_label -> "", 'class -> "form-control input-xs", 'placeholder -> "Email")),format.raw/*21.122*/("""
            """),format.raw/*22.13*/("""</div>

            <div class ="form-group">
                """),_display_(/*25.18*/inputPassword(loginForm("password"), '_label -> "", 'class -> "form-control input-xs", 'placeholder -> "Password")),format.raw/*25.132*/("""
            """),format.raw/*26.13*/("""</div>

            <div class ="form-group">
            <input type ="submit" value="Sign In" class ="btn btn-primary">
            </div>

        """)))}),format.raw/*32.10*/(""" """),format.raw/*32.27*/("""
    """),format.raw/*33.5*/("""</div>

""")))}),format.raw/*35.2*/("""
"""))
      }
    }
  }

  def render(loginForm:Form[models.users.Login],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(loginForm,user)

  def f:((Form[models.users.Login],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (loginForm,user) => apply(loginForm,user)

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Tue Dec 13 22:01:05 GMT 2016
                  SOURCE: /home/wdd/webapps/playlab_crud-part5/app/views/login.scala.html
                  HASH: 73d7deccc354e189430243f865d788109d49031d
                  MATRIX: 781->1|953->63|981->83|1009->86|1036->105|1074->106|1108->114|1194->174|1231->203|1269->204|1310->218|1387->268|1405->277|1446->297|1488->311|1534->326|1572->337|1611->367|1650->368|1692->382|1771->434|1785->439|1827->460|1869->474|1917->491|1957->504|1972->510|2045->574|2084->575|2126->589|2197->633|2323->737|2365->751|2458->817|2594->931|2636->945|2824->1102|2853->1119|2886->1125|2927->1136
                  LINES: 27->1|32->1|33->3|34->4|34->4|34->4|36->6|38->8|38->8|38->8|39->9|40->10|40->10|40->10|41->11|42->12|43->13|43->13|43->13|44->14|45->15|45->15|45->15|46->16|47->17|49->19|49->19|49->19|49->19|50->20|51->21|51->21|52->22|55->25|55->25|56->26|62->32|62->32|63->33|65->35
                  -- GENERATED --
              */
          