package demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import demo.bean.Users;
import demo.service.UserService;

/**
 * �û�
 * @author wangkaijun
 *
 */

@Controller
public class UserController {
	
	@Autowired
	private UserService us;
	
	@RequestMapping("/user")
	public ModelAndView  list() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("userlist", us.find("from Users"));
		mv.setViewName("/user");
		return mv;
	}
	
	@RequestMapping("/toadduser")
	public ModelAndView  toadd() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/toadduser");
		return mv;
	}
	
	@RequestMapping("/adduser")
	public ModelAndView  add(Users user) {
		ModelAndView mv = new ModelAndView();
		us.add(user);
		mv.setViewName("redirect:/user.sw");
		return mv;
	}
	
	@RequestMapping("/toupuser")
	public ModelAndView  toup(@RequestParam(name="uid") Integer uid) {
		ModelAndView mv = new ModelAndView();
		System.out.println("�����޸�");
		mv.addObject("ulist", us.load(Users.class, uid));
		mv.setViewName("/toupuser");
		return mv;
	}
	
	@RequestMapping("/upuser")
	public ModelAndView  update(Users user) {
		ModelAndView mv = new ModelAndView();
		System.out.println("�޸�ID:"+user.getUid());
		Users old = (Users)us.load(Users.class, user.getUid());
		old.setUsername(user.getUsername());
		old.setPassword(user.getPassword());
		old.setRealName(user.getRealName());
		old.setTel(user.getTel());
		old.setAddress(user.getAddress());
		old.setPostcode(user.getPostcode());
		old.setUserPhoto(user.getUserPhoto());
		old.setUserGrade("1");
		us.update(old);
		mv.setViewName("redirect:/user.sw");
		return mv;
	}

}