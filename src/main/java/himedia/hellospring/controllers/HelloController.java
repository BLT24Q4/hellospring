package himedia.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

//	POJO
@Controller
public class HelloController {
	//	메서드가 /hello 요청에 반응할 수 있도록 URL Mapper 등록
	@RequestMapping("/hello")
	public ModelAndView hello(@RequestParam("name") String name) {
		//	ModeAndView : 모델과 View 정보를 같이 가지고 있는 객체
		ModelAndView mav = new ModelAndView();
		mav.addObject("message", "Hello, " + name); //	모델 설정
		mav.setViewName("/WEB-INF/views/hello.jsp");	//	뷰 정보 설정
		
		return mav;
	}
}
