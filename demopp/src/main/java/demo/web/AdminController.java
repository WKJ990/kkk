package demo.web;


import java.util.List;


import javax.servlet.http.HttpServletRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import demo.bean.Admin;
import demo.service.BaseService;

@Controller
public class AdminController {
      @Autowired
      private BaseService service;
      
      @RequestMapping(value="/login",method={RequestMethod.POST})
      @ResponseBody
      public Object admin(HttpServletRequest request) {
        String hql ="select a from Admin a";
    	String username =request.getParameter("logname");
    	String password = request.getParameter("logpass");
    	String login = null;
        System.out.println(hql);
        List<Admin>   list = service.find(hql);
        if (username!=null&&!"".equals(username)&&password!=null&&!"".equals(password)) {
        	for (Admin user : list) {
        		
        			if (username.equals(user.getUsername())&&password.equals(user.getPassword())) {       				
						if(user.getPermissions()==1) {
							login ="OK";
							break;
						}else{
		        			login ="WU";//没有权限
		        		}        									 
						}
    				else{
    					login ="ERR";//用户名或密码错误！
    				    }				
        		
        			
        		
    		}
		}else{
			login ="NULL";//用户名或密码不能为空！
		}
        
  	     return login;
	}


}
