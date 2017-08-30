package com.example.controller;

import com.example.mode.Person;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.UrlFilenameViewController;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author TonyC
 * @date 2017/8/22 17:05
 * @version 1.0.0  HomeController
 * @email cpy2013@sina.com
 **/
@Controller
public class HomeController
{

  // 添加日志
  private static final Logger logger = LoggerFactory.getLogger(HomeController.class);


  @RequestMapping(value = "/")
  public String person(Model model) {


    System.out.println("========== person");

    return "person";
  }

  @RequestMapping(value = "/home")
  public String home(Model model)
  {


    System.out.println("========== home");

//    return new ModelAndView("home");

    String date = new SimpleDateFormat("yyyy-MM-dd HH24:mm:ss").format(new Date());
    model.addAttribute("serverTime", date);
    return "home";
  }


  @RequestMapping(value = "/toPerson", method = RequestMethod.POST)
  public String toPerson(HttpServletRequest request ,Model model)
  {
    System.out.println(request.getParameter("name"));
    System.out.println(request.getParameter("age"));
    System.out.println("========== toPerson");
    return "redirect:home";
  }
//
  //
  //  @RequestMapping("/person1")
  //  public String toPerson(Person p)
  //  {
  //    System.out.println("name=" + p.getName() + "  age="+p.getAge());
  //    return "person";
  //  }
  //
  //
  ////the parameter was converted in initBinder
  //  @RequestMapping("/date")
  //  public String date(Date date)
  //  {
  //    System.out.println(date);
  //    return "hello";
  //  }
  //
  //  //At the time of initialization,convert the type "String" to type "date"
  //  @InitBinder
  //  public void initBinder(ServletRequestDataBinder binder)
  //  {
  //    binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
  //  }
  //
  //  @RequestMapping("/show")
  //  public String showPerson(Map<String,Object> map)
  //  {
  //    Person p =new Person();
  //    p.setAge(20); p.setName("jayjay");
  //    map.put("p", p);
  //    return "show";
  //  }
  //
  //  @RequestMapping("/getPerson")
  //  public void getPerson(String name,PrintWriter pw)
  //  {
  //    pw.write("hello,"+name);
  //  }
  //
  //  @RequestMapping("/name")
  //  public String sayHello()
  //  {
  //    return "name";
  //  }
  //
  //  @RequestMapping("/redirect")
  //  public String redirect()
  //  {
  //    return "redirect:hello";
  //  }
  //
  //
  //
  //  @RequestMapping(value="/upload",method=RequestMethod.POST)
  //  public String upload(HttpServletRequest req) throws Exception
  //  {
  //    MultipartHttpServletRequest mreq = (MultipartHttpServletRequest)req;
  //    MultipartFile file = mreq.getFile("file");
  //    String fileName = file.getOriginalFilename();
  //    SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
  //    FileOutputStream fos = new FileOutputStream(req.getSession().getServletContext().getRealPath("/")+ "upload/"+sdf.format(new Date())+fileName.substring(fileName.lastIndexOf('.')));
  //    fos.write(file.getBytes());
  //    fos.flush(); fos.close();
  //    return "hello";
  //  }

}