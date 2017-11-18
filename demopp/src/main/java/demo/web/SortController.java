package demo.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import demo.bean.Sort;
import demo.dao.SortDao;

/**
 * ·ÖÀà
 * @author wangkaijun
 *
 */

@Controller
public class SortController {

	@Autowired
	private SortDao sort;
	
	@RequestMapping("/classify")
	public ModelAndView  list() {
		ModelAndView mv = new ModelAndView();
		String hql = " select s from Sort s where 1=1 ";
		mv.addObject("sortlist", sort.find(hql));
		mv.setViewName("/classify");
		return mv;
	}
	
	@RequestMapping("/toaddclassify")
	public ModelAndView  toadd() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("/addclass");
		return mv;
	}
	
	@RequestMapping("/addclassify")
	public ModelAndView  add(Sort st) {
		ModelAndView mv = new ModelAndView();
		String lujing = "/shop/images/"+st.getsPhoto();
		st.setsPhoto(lujing);
		sort.add(st);
		mv.setViewName("redirect:/classify.sw");
		return mv;
	}
	
	@RequestMapping("/delclass")
	public ModelAndView  del(@RequestParam(name="sid") Integer id) {
		ModelAndView mv = new ModelAndView();
		Sort st = (Sort)sort.load(Sort.class, id);
	System.out.println("St"+st);
		st.setSstate(0);
		sort.update(st);
		mv.setViewName("redirect:/classify.sw");
		return mv;
	}
	
	@RequestMapping("/sclass")
	public ModelAndView  sjia(@RequestParam(name="sid") Integer id) {
		ModelAndView mv = new ModelAndView();
		Sort st = (Sort)sort.load(Sort.class, id);
	System.out.println("St"+st);
		st.setSstate(1);
		sort.update(st);
		mv.setViewName("redirect:/classify.sw");
		return mv;
	}

}
