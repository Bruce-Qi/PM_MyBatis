package cn.tf.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import cn.tf.entity.Person;
import cn.tf.mapper.PersonMapper;
import cn.tf.utils.MyBatisUtil;





public class PersonServlet  extends BasicServlet {
	private static final long serialVersionUID = 1L;
     

	SqlSession  session;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String op=request.getParameter("op");
		
		if("findAll".equals(op)){
			findAll(request,response);
		}
		
	}


	private void findAll(HttpServletRequest request, HttpServletResponse response) {

		response.setCharacterEncoding("UTF-8");
		session=MyBatisUtil.getSession();
		PersonMapper personMapper=session.getMapper(PersonMapper.class);
		List<Person>  list=personMapper.findAll();
		this.out(response, list);
		
	}
		

}
