import geb.spock.GebSpec

class SampleTest extends GebSpec {
	def "Caputure Google Screen" () {
		when :
			go 'http://google.co.jp'
			$('input[type=text]').value('groovy')
		
		then:
			report 'GoogleCapture'
			assert $('input[type=text]').value() == 'groovy'
	}
}