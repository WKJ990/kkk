package demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import demo.bean.Orders;
import demo.service.OrderService;
/**
 * 订单
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
		String hql = "select o from Orders o where o.state < 5";
		mv.addObject("orlist", order.find(hql));
		mv.setViewName("/indent");
		return mv;
	}
	
	@RequestMapping("/toindent")
	public ModelAndView  tolist() {
		ModelAndView mv = new ModelAndView();
		System.out.println("AAAA");
		String hql = "select o from Orders o where o.state < 5";
		mv.addObject("orlist", order.find(hql));
		mv.setViewName("/toindent");
		return mv;
	}
	
	@RequestMapping("/upindent")
	public ModelAndView  uplist(Orders orders) {
		ModelAndView mv = new ModelAndView();
		System.out.println("订单修改");
		Orders o = (Orders)order.load(Orders.class, orders.getOid());
		o.setState(orders.getState());
		order.update(o);
		mv.setViewName("redirect:/indent.sw");
		return mv;
	}
	
	/**
	 * 订单条目，已收货商品
	 * @return
	 */
	@RequestMapping("/take")
	public ModelAndView  take() {
		ModelAndView mv = new ModelAndView();
		System.out.println("AAAA");
		//String hql = "select o from Orders o where o.state < 5";
		
		mv.setViewName("/indent");
		return mv;
	}
	
}
