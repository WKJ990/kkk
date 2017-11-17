package demo.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
		mv.addObject("sortlist", sort.find("from Sort"));
		mv.setViewName("/classify");
		return mv;
	}
	

}
