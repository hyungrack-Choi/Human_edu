package com.human.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class MainController {
	
	@Autowired
	HttpSession session;
	@Autowired
	private MemberDAO memberdao;
	
	
	@RequestMapping("/") 
	public String main(HttpServletRequest req,Model model) {	
//		session=req.getSession();session 초기화 선언
//		String sess_info=(String) session.getAttribute("gUserid");
//		model.addAttribute("userid",sess_info);
		return "home"; 
	}
	
	@RequestMapping("/login") public String dologin() { return "login"; }

	@RequestMapping("/logout") 
	public String dologout(HttpServletRequest req,Model model) { 
		session=req.getSession();//session 초기화 선언
		String sess_info=(String) session.getAttribute("gUserid"); //데이터 가져오기 getAttribute
		model.addAttribute("userid",sess_info);
		session.invalidate(); //모든 세션변수를 제거
		return "logout"; 
	}
	
	@RequestMapping("/signin") public String dosignin() { return "signin"; }
	
	@RequestMapping("/checkuser")
	public String docheckuser(HttpServletRequest req,Model model) {
		String loginid = req.getParameter("userid");
		String pw = req.getParameter("passcode");
		System.out.println("loginid= "+loginid);
		System.out.println("pw= "+pw);
//		logindao.getMemgetMemberCount(loginid, pw);
		int cnt = memberdao.getMemgetMemberCount(loginid, pw);
		System.out.println(cnt);
		if(cnt > 0) {
			session=req.getSession();//session 초기화 선언
			session.setAttribute("gUserid", loginid); // 데이터 넣기 setAttribute
		}
		return "redirect:/";
//		
//		/* JSON 데이터 받아오는 과정 */
//		StringBuffer sb = new StringBuffer();
//		BufferedReader br = request.getReader();
//        
//		String line = null;
//		
//		while((line = br.readLine()) != null) {
//			sb.append(line);
//		}
//        
//		log.info(sb.toString());
		/* JSON 데이터 받아오는 과정 */
//		if(loginid.equals("sonijoa")){
//			model.addAttribute("uid",loginid);
//			model.addAttribute("pwd",pw);
//			return "loginok";	
//		}else {
//			return "redirect:/login";
//		}
	}
	
	@RequestMapping("/viewuser")
	public String doviewuser(HttpServletRequest req,Model model) {
		String loginid = req.getParameter("userid");
		String pw = req.getParameter("passcode2");
		String name = req.getParameter("name");
		String moblie= req.getParameter("moblie");
		memberdao.insertMember(loginid, pw, name, moblie);
		return "redirect:/login";
	}
}