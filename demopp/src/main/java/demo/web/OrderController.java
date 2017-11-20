package demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import demo.bean.Orders;
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
	
	@RequestMapping("/toindent")
	public ModelAndView  tolist() {
		ModelAndView mv = new ModelAndView();
		System.out.println("AAAA");
		mv.addObject("orlist", order.find("from Orders"));
		mv.setViewName("/toindent");
		return mv;
	}
	
	@RequestMapping("/upindent")
	public ModelAndView  uplist(Orders orders) {
		ModelAndView mv = new ModelAndView();
		System.out.println("¶©µ¥ÐÞ¸Ä");
		Orders o = (Orders)order.load(Orders.class, orders.getOid());
		o.setState(orders.getState());
		order.update(o);
		mv.setViewName("redirect:/indent.sw");
		return mv;
	}
	
}
