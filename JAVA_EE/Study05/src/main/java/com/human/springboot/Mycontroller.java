package com.human.springboot;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class Mycontroller {
	

	@Autowired
	HttpSession session;
	@Autowired
	private MemberDAO mdao;
	@Autowired
	private PostDAO pdao;
	
	@RequestMapping("/")
	public String home(HttpServletRequest req, Model model) {
			HttpSession s =req.getSession();//session 초기화 선언
			ArrayList<PostingDTO> postinglist = pdao.listPosting();
			model.addAttribute("postlist", postinglist);
			model.addAttribute("gUserid", (String) s.getAttribute("gUserid"));
		return "home";	
	}
	@RequestMapping("/signin") public String dosignin() { return "signin"; }
	@RequestMapping("/login") public String dologin() { return "login"; }
	@RequestMapping("/write") public String dowrite() { return "write"; }
	
	@RequestMapping("/checkDup")
	@ResponseBody
	public String doCheckDup(HttpServletRequest req) {
		int n = mdao.checkDup(req.getParameter("loginid"));
		return Integer.valueOf(n).toString();
	}

	@RequestMapping("/checkuser")
	@ResponseBody
	public String docheckuser(HttpServletRequest req) {
		
		String retval="";
		try {
			String loginid = req.getParameter("userid");
			String pw = req.getParameter("passcode");
			System.out.println("loginid= "+loginid);
			System.out.println("pw= "+pw);
	//		logindao.getMemgetMemberCount(loginid, pw);
			int cnt = mdao.getMemgetMemberCount(loginid, pw);
			System.out.println(cnt);
				if(cnt == 1) {
					session=req.getSession();//session 초기화 선언
					session.setAttribute("gUserid", loginid); // 데이터 넣기 setAttribute
					return "ok";
				} else retval="fail";
		} catch(Exception e){
			return "fail";
		}
		return retval;
	}
	@RequestMapping("/viewuser")	
	@ResponseBody
	public String doviewuser(HttpServletRequest req) {
		String retval="";
		try {
		String loginid = req.getParameter("loginid");
		String pw = req.getParameter("passcode1");
		String name = req.getParameter("name");
		String mobile= req.getParameter("mobile");
		System.out.println("loginid"+loginid+"pw"+pw+"name"+name+"mobile"+mobile);
		mdao.insertMember(loginid, pw, name, mobile);
		retval="ok";
		} catch(Exception e) {
			retval="fail";
		}
		return retval;
	}
	@RequestMapping("/logincheck")
	@ResponseBody
	public String doLoginCheck(HttpServletRequest req) {
		String str="";
		HttpSession session= req.getSession();//초기화
		String userid = (String) session.getAttribute("gUserid");
		if(userid==null || userid.equals("")) {
			str="";
		} else {
			str=userid;
		}
		System.out.println("str["+str+"]");
		return str;
	}
	@RequestMapping("/signout")
	@ResponseBody
	public String doSignout(HttpServletRequest req) {
		String retval="";
		try {
			HttpSession session= req.getSession();//초기화
			session.invalidate();
			retval="ok";
			System.out.println("signout retval="+ retval);
		} catch(Exception e) {
			retval="fail";
		}
		return retval;
	}
	@RequestMapping("/insert")
	public String doinsert(HttpServletRequest req) {
		HttpSession session= req.getSession();//초기화
		String userid = (String) session.getAttribute("gUserid");
		if(userid==null) {
			return "redirect:/";
		}
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		System.out.println("title="+title+"content="+content+"userid="+userid);
		pdao.InsertPosting(title, content, userid);
		return "redirect:/";
	}
	@RequestMapping("/view")
	public String doview(HttpServletRequest req,Model model) {
		int post_id = Integer.parseInt(req.getParameter("post_id"));
			System.out.println("post_id"+post_id);
			viewDTO postdata = pdao.getPostview(post_id);
			model.addAttribute("post_id",postdata.getPost_id());
			model.addAttribute("title",postdata.getTitle());
			model.addAttribute("content",postdata.getContent());
			model.addAttribute("writer",postdata.getWriter());
			model.addAttribute("created",postdata.getCreated());
			model.addAttribute("upated",postdata.getUpdated());
		return "view";
	}
	@RequestMapping("/update")
	public String doviewmodit(HttpServletRequest req,Model model) {
		HttpSession session= req.getSession();//초기화
		String userid = (String) session.getAttribute("gUserid");
		if(userid==null) {
			return "redirect:/";
		}
		int post_id = Integer.parseInt(req.getParameter("post_id"));
			System.out.println("post_id"+post_id);
						
			viewDTO postdata = pdao.getPostview(post_id);
			String title = postdata.getTitle();
			String content = postdata.getContent();
			System.out.println("post_id="+post_id+ "title="+title+ "content="+content+"userid="+userid);
			model.addAttribute("post_id",postdata.getPost_id());
			model.addAttribute("title",postdata.getTitle());
			model.addAttribute("content",postdata.getContent());
			model.addAttribute("writer",postdata.getWriter());
			model.addAttribute("created",postdata.getCreated());
			model.addAttribute("upated",postdata.getUpdated());
		return "update";
	}
	@RequestMapping("/updateok")
	public String doviewmoditok(HttpServletRequest req,Model model) {
		HttpSession session= req.getSession();//초기화
		String userid = (String) session.getAttribute("gUserid");
		if(userid==null) {
			return "redirect:/";
		}
		int post_id = Integer.parseInt(req.getParameter("post_id"));
		String title = req.getParameter("title");
		String content = req.getParameter("content");
			System.out.println("post_idu="+post_id+ "titleu="+title+ "contentu="+content+"useridu="+userid);
			pdao.updatePosting(post_id,title,content,userid);
			return "redirect:/";
	}
	@RequestMapping("/delete")
	public String deleteview(HttpServletRequest req, Model model) {
		HttpSession session= req.getSession();//초기화
		String userid = (String) session.getAttribute("gUserid");
		if(userid==null) {
			return "redirect:/";
		}
		int post_id = Integer.parseInt(req.getParameter("post_id"));
		pdao.deleteview(post_id);
		return "redirect:/";
	}
}