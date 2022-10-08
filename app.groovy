@Grab("thymeleaf-spring5")

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

    @RequestMapping("/thymeleaf")
    @ResponseBody
    def home2(ModelAndView mav) {
        mav.setViewName("home")
        mav.addObject("msg", "Hello! this is sample page.")
        mav
    }

    @RequestMapping(value="/formTest", method=RequestMethod.GET)
    @ResponseBody
    def form1(ModelAndView mav) {
        mav.setViewName("home")
        mav.addObject("msg", "please write your name.")
        mav
    }

    @RequestMapping(value="/send", method=RequestMethod.POST)
    @ResponseBody
    def form1(@RequestParam("text1")String str, ModelAndView mav) {
        mav.setViewName("home")
        mav.addObject("msg", "Hello!" + str + "!!")
        mav.addObject("value", str)
        mav
    }
}