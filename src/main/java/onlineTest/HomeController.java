package onlineTest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController {
	
	
	@RequestMapping("/OnlineTest/")
	public ModelAndView login () {
		
	ModelAndView mv = new ModelAndView();
	mv.setViewName("index");
	return mv;
  
	}
	
	
	@RequestMapping("/OnlineTest/validation")
	public ModelAndView add(@RequestParam ("email") String s1) {
	
		ModelAndView mv = new ModelAndView();
		System.out.println(s1);
		
		if (s1.equals("admin"))
		{
			mv.setViewName("adminLogin");
		}
		
		else 
		{			
		mv.setViewName("candidateLogin");
		}
		return mv;
		
      }

	
	@RequestMapping("/OnlineTest/register")
	public ModelAndView Register () {
	ModelAndView mv = new ModelAndView();
	mv.setViewName("Register");
	
	return mv;
  }
	
	
	@RequestMapping("/Online/register/Service")
	public ModelAndView RegisterService () {
	ModelAndView mv = new ModelAndView();
	mv.setViewName("registerSucess");
	return mv;
  }
	
	
	
	@RequestMapping("/OnlineTest/valid/spring")
	public ModelAndView SpringTest () {
	ModelAndView mv = new ModelAndView();
	mv.setViewName("springAssement");
	
	return mv;
  }
	
	
	
	@RequestMapping("/OnlineTest/valid/hibernate")
	public ModelAndView HibernateTest () {
	ModelAndView mv = new ModelAndView();
	mv.setViewName("Hibernate");
	
	return mv;
  }
	
	
	
	@RequestMapping("/OnlineTest/admin/allUser")
	public ModelAndView adminAllUser () {
	ModelAndView mv = new ModelAndView();
	mv.setViewName("adminAllUser");
	
	return mv;
	}
	
	
	@RequestMapping("/OnlineTest/admin/allUseResults")
	public ModelAndView adminAllUserResult () {
	ModelAndView mv = new ModelAndView();
	mv.setViewName("adminAllUser");
	
	return mv;
	}
	
}
