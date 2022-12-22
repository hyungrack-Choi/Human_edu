package com.human.springboot;

import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class Mycontroller {

	@Autowired
	private empDAO emp;
		
	@RequestMapping("/")
	public String dohome(Model model) {
		ArrayList<EmpDTO> edto = emp.list();
		model.addAttribute("worker", edto);
//		for(int i=0; i<edto.size(); i++) {
//			System.out.println(edto.get(i).getEmp_name());
//		}
		return "home";
	}
	
	@RequestMapping("/roomtype")
	public String getList(Model model) {
		ArrayList<RoomtypeDTO> rdto = emp.listRoomType();
		model.addAttribute("rt",rdto);
		return "roomtype";
	}
	@RequestMapping("/depart")
	public String getdepart(Model model) {
		ArrayList<departDTO> dedto = emp.listdepart();
		model.addAttribute("dedto",dedto);
		return "depart";
	}
	@RequestMapping("/insertRT_form")
	public String doAddRoomType() {
		return "insertRT_form";
	}
	@RequestMapping("/insertRT")
	public String doInsertRT(HttpServletRequest req, Model model) {
		String typename = req.getParameter("typename");
		emp.insertRoomType(typename);
		return "redirect:/roomtype";
	}
	@RequestMapping("/insertRI_form")
	public String doAddRoominfo() {
		return "insertRI_form";
	}
	@RequestMapping("/insertRI")
	public String doInsertRI(HttpServletRequest req, Model model) {
		String name = req.getParameter("name");
		String type = req.getParameter("type");
		String howmany = req.getParameter("howmany");
		String howmuch = req.getParameter("howmuch");
		emp.insertRoomInfo(name, Integer.parseInt(type)
				, Integer.parseInt(howmany), Integer.parseInt(howmuch));
		return "redirect:/insertRI_form";
	}

	@RequestMapping("/controllRoomType")
	public String doDeleteType(HttpServletRequest req) {
		if(req.getParameter("optype").equals("delete")) {
			int typenum = Integer.parseInt(req.getParameter("typenum"));
			emp.deleteRoomType(typenum);
		}
		else if (req.getParameter("optype").equals("insert")) {
			String typename = req.getParameter("typename");
			emp.insertRoomType(typename);
		} else if(req.getParameter("optype").equals("update")) {
			String typename = req.getParameter("typename");
			int typenum = Integer.parseInt(req.getParameter("typenum"));
			emp.updateRoomType(typename, typenum);
		}
		
		return "redirect:/roomtype";
	}

	@RequestMapping("/controllRoomInfo")
	public String doControlRoomInfo(HttpServletRequest req) {
		//insert/update/delete ROOM INFO
		if(req.getParameter("optype").equals("delete")) {
			String num = req.getParameter("num");
			emp.deleteRoomInfo(num);
		}
		else if (req.getParameter("optype").equals("insert")) {
			String name = req.getParameter("name");
			int typen = Integer.parseInt(req.getParameter("typen"));
			int howmany = Integer.parseInt(req.getParameter("howmany"));
			int howmuch = Integer.parseInt(req.getParameter("howmuch"));
			System.out.println("name="+name+"typen="+ typen+"howmany="+ howmany + "howmuch="+ howmuch);
			emp.insertRoomInfo(name,typen,howmany,howmuch);
		} else if(req.getParameter("optype").equals("update")) {
			int num = Integer.parseInt(req.getParameter("num"));
			String name = req.getParameter("name");
			int typen = Integer.parseInt(req.getParameter("typen"));
			int howmany = Integer.parseInt(req.getParameter("howmany"));
			int howmuch = Integer.parseInt(req.getParameter("howmuch"));
			emp.updateRoomInfo(num,name,typen,howmany,howmuch);
		}
		return "redirect:/roominfo";
	}
	
//	@RequestMapping("/roominfo")
//	public String geRoomInfo(Model model) {
//		ArrayList<RoomInfoDTO> infodto = emp.listRoomInfo();
//		model.addAttribute("indto",infodto);
//		ArrayList<RoomtypeDTO> rdto = emp.listRoomType();
//		model.addAttribute("rt",rdto);
//		return "roominfo";
//	}
	@RequestMapping("/ajaxtest")
	public String doAjaxTest() {
		return "ajax";
	}
	@RequestMapping("/doPlus")
	@ResponseBody //Ajax사용시 써야한다
	public String doplus(HttpServletRequest req) {
		System.out.println("doPlus called");
		int one = Integer.parseInt(req.getParameter("first"));
		int two = Integer.parseInt(req.getParameter("second"));
		int result = one + two;
		return Integer.valueOf(result).toString();
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping("/getEmpList")
	@ResponseBody
	public String getEmpList() {
		System.out.println("doGetEmpList");
		ArrayList<EmpDTO> edto = emp.list();
		System.out.println("doGetEmpList"+edto.size());
		JSONArray ja = new JSONArray();
		
		for(int i=0; i<edto.size(); i++) {
			JSONObject jo = new JSONObject();
			jo.put("eid",edto.get(i).getEmployee_id());
			jo.put("emp_name",edto.get(i).getEmp_name());
			jo.put("salary",edto.get(i).getSalary());
			jo.put("mname",edto.get(i).getManager_name());
			ja.add(jo);
		}
		return ja.toString();
	}
	@RequestMapping("/emplist")
	public String emplist(){
		
		return "EmpList";
	}

	@RequestMapping("/xroomtype")
	public String viewRoomType(Model model) {
		return "ajax_roomtype";
	}

	@RequestMapping("/getRoomType")
	@ResponseBody
	public String getRoomType() {
		ArrayList<RoomtypeDTO> rdto = emp.listRoomType();
		JSONArray ja = new JSONArray();
		for(int i=0; i<rdto.size(); i++) {
			JSONObject jo = new JSONObject();
			System.out.println(rdto.get(i).getTypenum());
			System.out.println(rdto.get(i).getTypename());
			jo.put("typenum",rdto.get(i).getTypenum());
			jo.put("typename",rdto.get(i).getTypename());
			ja.add(jo);
		}
		return ja.toString();
	}

	@RequestMapping("/cudRoomType")
	@ResponseBody
	public String doCUDRoomType(HttpServletRequest req) {
		if(req.getParameter("optype").equals("delete")) {
			int typenum = Integer.parseInt(req.getParameter("typenum"));
			System.out.println(typenum);
			emp.deleteRoomType(typenum);
		}
		else if (req.getParameter("optype").equals("insert")) {
			String typename = req.getParameter("typename");
			System.out.println(typename);
			emp.insertRoomType(typename);
		} else if(req.getParameter("optype").equals("update")) {
			String typename = req.getParameter("typename");
			int typenum = Integer.parseInt(req.getParameter("typenum"));
			System.out.println(typenum);
			System.out.println(typename);
			emp.updateRoomType(typename, typenum);
		}
		return "OK"; //dummy data;
	}

	@RequestMapping("/roominfo")
	public String roominfo() {
		return "roominfo";
	}
	@RequestMapping("/getRoomInfo")
	@ResponseBody
	public String geRoomInfo() {
		System.out.println("getRoomInfo");
		ArrayList<RoomInfoDTO> indto = emp.listRoomInfo();

		JSONArray ja = new JSONArray();
		for(int i=0; i<indto.size(); i++) {
			JSONObject jo = new JSONObject();
			System.out.println(indto.get(i).getNum());
			System.out.println(indto.get(i).getName());
			jo.put("num",indto.get(i).getNum());
			jo.put("name",indto.get(i).getName());
			jo.put("type",indto.get(i).getType());
			jo.put("howmany",indto.get(i).getHowmany());
			jo.put("howmuch",indto.get(i).getHowmuch());
			ja.add(jo);
		}
		return ja.toString();
	}

	@RequestMapping("/getRoomInfoType")
	@ResponseBody
	public String geRoomInfoType() {
		System.out.println("getRoomInfoType");
		ArrayList<RoomtypeDTO> rtdto = emp.listRoomType();
		JSONArray jt = new JSONArray();
		for(int i=0; i<rtdto.size(); i++) {
			JSONObject jo = new JSONObject();
			System.out.println(rtdto.get(i).getTypenum());
			System.out.println(rtdto.get(i).getTypename());
			jo.put("typenum",rtdto.get(i).getTypenum());
			jo.put("typename",rtdto.get(i).getTypename());
			jt.add(jo);
		}
		return jt.toString();
	}


	@RequestMapping("/cudRoomInfo")
	@ResponseBody
	public String docudRoomInfo(HttpServletRequest req) {
		//insert/update/delete ROOM INFO
		if(req.getParameter("optype").equals("delete")) {
			String num = req.getParameter("num");
			emp.deleteRoomInfo(num);
		}
		else if (req.getParameter("optype").equals("insert")) {
			String name = req.getParameter("name");
			int type = Integer.parseInt(req.getParameter("type"));
			int howmany = Integer.parseInt(req.getParameter("howmany"));
			int howmuch = Integer.parseInt(req.getParameter("howmuch"));
			System.out.println("name="+name+"type="+ type+"howmany="+ howmany + "howmuch="+ howmuch);
			emp.insertRoomInfo(name,type,howmany,howmuch);
		} else if(req.getParameter("optype").equals("update")) {
			int num = Integer.parseInt(req.getParameter("num"));
			String name = req.getParameter("name");
			int type = Integer.parseInt(req.getParameter("type"));
			int howmany = Integer.parseInt(req.getParameter("howmany"));
			int howmuch = Integer.parseInt(req.getParameter("howmuch"));
			emp.updateRoomInfo(num,name,type,howmany,howmuch);
		}
		return "OK";
	}
}