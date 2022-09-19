@RestController
class App {
    @RequestMapping("/")
    def home() {
        "Hello!!"
    }

    @RequestMapping("/home1")
    def home1() {
        def header = "<html><body>"
        def footer = "</body></html>"
        def content = "<h1>Hello!</h1><p>this is html contents.</p>"

        header + footer + content
    }
}