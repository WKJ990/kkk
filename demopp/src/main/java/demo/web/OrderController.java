package demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import demo.service.OrderService;
/**
 * ¶©µ¥
 * @author wangkaijun
 *
 */
@Controller
public class OrderController {

	@Autowired
	private OrderService order;
	
	@RequestMapping("/indent")
	public ModelAndView  list() {
		ModelAndView mv = new ModelAndView();
		System.out.println("AAAA");
		mv.addObject("orlist", order.find("from Orders"));
		mv.setViewName("/indent");
		return mv;
	}
	
	
	
}
