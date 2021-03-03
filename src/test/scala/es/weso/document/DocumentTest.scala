package es.weso.document
import org.scalatest._
import funspec.AnyFunSpec
import matchers.should._
import java.io.StringWriter

class DocumentTest extends AnyFunSpec with Matchers {

  describe(s"Document") {
    it(s"Combine 2 null documents") {
      val w: StringWriter = new StringWriter 
      (DocNil :: DocNil).format(1,w)
      w.toString should (be(""))
    }
  }
}