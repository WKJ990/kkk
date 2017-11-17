package demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import demo.service.ProService;
/**
 * 商品信息
 * @author wangkaijun
 *
 */
@Controller
public class ProController {
	@Autowired
	private ProService pro;

	@RequestMapping("/message")
	public ModelAndView  list() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("prolist", pro.find("from Product"));
		mv.setViewName("/message");
		return mv;
	}
	
}
