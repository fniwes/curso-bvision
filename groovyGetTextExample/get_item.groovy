import groovy.json.JsonSlurper

def url = "https://api.mercadolibre.com/items/MLA550035896".toURL()
def strJson = url.getText(requestProperties: [Accept: 'application/json'])
def json = new JsonSlurper().parseText(strJson)
println json.title


def json2 = new JsonSlurper().parse(url, requestProperties: [Accept: 'application/json'])
println json2.title
