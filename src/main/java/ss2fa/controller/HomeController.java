package ss2fa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping(value = "/")
	public String homepage() {
		return "index.jsp";
	}
	@RequestMapping(value = "/a")
	public String homepagea() {
		return "index.jsp";
	}
}
