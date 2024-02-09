package springmcsearch.controller;

import java.net.http.HttpClient.Redirect;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	
	
	@RequestMapping("/home")
	public String home() {
		System.out.println("going to hmoe view...");
		return "home";
	}
	
	
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox") String querySearch) {
		
		String url= "https://www.google.com/search?q=" + querySearch;
		RedirectView redirectView= new RedirectView();
		redirectView.setUrl(url);
		
		return redirectView;
		
	}

}
