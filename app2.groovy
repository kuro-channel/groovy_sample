@Controller
class App {
    @RequestMapping("/")
    @ResponseBody
    def home2(ModelAndView mav) {
        mav.setViewName("home2")
        mav
    }
}