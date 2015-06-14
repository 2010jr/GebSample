
import geb.Browser

Browser.drive {
	go 'http://google.co.jp'
	$('input[type=text]').value('groovy')
	assert $('input[type=text]').value() == 'groovy'
}