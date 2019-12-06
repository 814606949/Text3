package com.xd.Controller;


import com.xd.bean.Emp;
import com.xd.dao.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class EmpController {

    @Autowired
    private EmpMapper em;

    @RequestMapping("showEmp")
    public String show(Model model){

        List<Emp> emplist = em.selectByAll(null);
        System.out.println(1);
        System.out.println(emplist);
        model.addAttribute("empList",emplist);

        return "showEmp";
    }
}
