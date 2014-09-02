package grails101

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(HelloWorldController)
class HelloWorldControllerSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test index"() {
		when:
		controller.index()
		
		then:
		response.text == "Hello World!"
    }
}
