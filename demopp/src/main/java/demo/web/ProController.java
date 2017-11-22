package demo.web;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;

import demo.bean.Pro_img;
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
	public ModelAndView  add(Product product,Pro_img ph) {
		ModelAndView mv = new ModelAndView();
		String str = "/shop/images/";
		product.setImage(str+product.getImage());
		pro.add(product);
	  System.err.println("ID"+product.getPid());
	    ph.setPid(product.getPid());
	    ph.setW_img(str+ph.getW_img());
	    ph.setS_img(str+ph.getS_img());
		ph.setA_img(str+ph.getA_img());
		ph.setD_img(str+ph.getD_img());

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
	public ModelAndView  up(Product product) {
		ModelAndView mv = new ModelAndView();
		System.out.println("ID："+product.getPid());
		Product old = (Product)pro.load(Product.class, product.getPid());
		Pro_img ph = (Pro_img)pro.load(Pro_img.class, product.getPid());
		old.setSaleprice(product.getSaleprice());
		old.setImage(product.getImage());
		old.setIntroduce(product.getIntroduce());
		old.setPname(product.getPname());
		old.setPrice(product.getPrice());
		old.setSaleCount(product.getSaleCount());
		
		pro.update(old);
		
		
		mv.setViewName("redirect:/message.sw");
		return mv;
	}
	
	@RequestMapping("/tofutu")
	public ModelAndView  tofutu(@RequestParam(name="pid") Integer pid) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("photolist",pro.load(Pro_img.class, pid) );
		mv.setViewName("/futu");
		return mv;
	}
	
	/**
	 * 添加附图
	 * @param product
	 * @return
	 */
	@RequestMapping("/futu")
	public ModelAndView  futu(Pro_img phs) {
		ModelAndView mv = new ModelAndView();
		//System.out.println("ID："+product.getPid());
		String str = "/shop/images/";
		Pro_img ph = (Pro_img)pro.load(Pro_img.class, phs.getPid());
		
		ph.setW_img(str+phs.getW_img());
		ph.setA_img(str+phs.getA_img());
		ph.setS_img(str+phs.getS_img());
		ph.setD_img(str+phs.getD_img());
		
		pro.update(ph);
		
		mv.setViewName("redirect:/message.sw");
		return mv;
	}
	
}
