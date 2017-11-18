package demo.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import demo.bean.Photo;
import demo.bean.Product;
import demo.service.ProService;
import demo.service.SortService;
/**
 * 商品信息
 * @author wangkaijun
 *
 */
@Controller
public class ProController {
	@Autowired
	private ProService pro;
	@Autowired
	private SortService sort;

	@RequestMapping("/message")
	public ModelAndView  list(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		
		String pname = request.getParameter("pname");
		String introduce = request.getParameter("introduce");
		String sid = request.getParameter("sid");
		//System.err.println("商品名稱:"+pname+"描述"+introduce);
		String hql = " select p from Product p where 1=1 ";
		if(pname!=null&&!"".equals(pname)) {
			hql += " and p.pname like '%"+pname+"%'" ;
		}
		if(introduce!=null&&!"".equals(introduce)) {
			hql += " and p.introduce like '%"+introduce+"%'";
		}
		if(sid!=null&&!"0".equals(sid)) {
			hql += " and p.sid ="+sid;
		}
		System.out.println("hql"+hql);
		mv.addObject("solist", sort.find("from Sort"));
		mv.addObject("prolist", pro.find(hql));
		mv.setViewName("/message");
		return mv;
	}
	
	@RequestMapping("/toaddmessage")
	public ModelAndView  toadd() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("solist", sort.find("from Sort"));
		mv.setViewName("/addmessage");
		return mv;
	}
	
	@RequestMapping("/addmassage")
	public ModelAndView  add(Product product,Photo ph) {
		ModelAndView mv = new ModelAndView();
		pro.add(product);
		ph.setPid(product.getPid());
		pro.add(ph);
		mv.setViewName("redirect:/message.sw");
		return mv;
	}
	
	@RequestMapping("/toupme")
	public ModelAndView  toup(@RequestParam(name="pid") Integer pid) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("prolist",pro.load(Product.class, pid) );
		mv.addObject("solist", sort.find("from Sort"));
		mv.setViewName("/upme");
		return mv;
	}
	
	@RequestMapping("/upme")
	public ModelAndView  up(Product product,Photo photo) {
		ModelAndView mv = new ModelAndView();
		System.out.println("ID："+product.getPid());
		Product old = (Product)pro.load(Product.class, product.getPid());
		Photo ph = (Photo)pro.load(Photo.class, product.getPid());
		old.setSaleprice(product.getSaleprice());
		old.setImage(product.getImage());
		old.setIntroduce(product.getIntroduce());
		old.setPname(product.getPname());
		old.setPrice(product.getPrice());
		old.setSaleCount(product.getSaleCount());
		
		pro.update(old);
		
		ph.setPphoto1(photo.getPphoto1());
		ph.setPphoto2(photo.getPphoto2());
		ph.setPphoto3(photo.getPphoto3());
		ph.setPphoto4(photo.getPphoto4());
		
		pro.update(ph);
		mv.setViewName("redirect:/message.sw");
		return mv;
	}
	
}
