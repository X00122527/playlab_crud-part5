
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object about_Scope0 {
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

class about extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""
"""),format.raw/*2.1*/("""<!-- Pass page title and content """),format.raw/*2.34*/("""{"""),format.raw/*2.35*/("""html between braces"""),format.raw/*2.54*/("""}"""),format.raw/*2.55*/(""" """),format.raw/*2.56*/("""to the main view -->
"""),_display_(/*3.2*/main("About", user)/*3.21*/ {_display_(Seq[Any](format.raw/*3.23*/("""
  """),format.raw/*4.3*/("""<!-- HTML content for the index view -->
  <div class="row">
      <div class="col-sm-12">
        <div class="well">
          <h4>Add a new Product</h4>
        </div>
      </div>
  </div>
  <!-- End of content for main -->
""")))}))
      }
    }
  }

  def render(user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


}

/**/
object about extends about_Scope0.about
              /*
                  -- GENERATED --
                  DATE: Tue Dec 13 21:57:48 GMT 2016
                  SOURCE: /home/wdd/webapps/playlab_crud-part5/app/views/about.scala.html
                  HASH: 4e746f7c3473f9858b76ecbd75f5e75b776447a4
                  MATRIX: 756->1|876->26|904->28|964->61|992->62|1038->81|1066->82|1094->83|1142->106|1169->125|1208->127|1238->131
                  LINES: 27->1|32->1|33->2|33->2|33->2|33->2|33->2|33->2|34->3|34->3|34->3|35->4
                  -- GENERATED --
              */
          