package com.example.examproject.servlet;

import com.example.examproject.dao.EmployeeDAO;
import com.example.examproject.dao.impl.EmployeeImpl;
import com.example.examproject.entity.EmployeeEntity;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@WebServlet({
        "/employeeServlet",
        "/employeeServlet/list"
})
@MultipartConfig

public class EmployeeServlet extends HttpServlet {
    private EmployeeDAO employeeDAO;
    public void init(){
        employeeDAO = new EmployeeImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String url=req.getRequestURL().toString();
        req.setCharacterEncoding("utf-8");
        if (url.contains("list")){
        List<EmployeeEntity> employeeEntityList=employeeDAO.getAllEmployee();
        req.setAttribute("employees", employeeEntityList);
        req.getRequestDispatcher("/list.jsp").forward(req,resp);

    }
        req.getRequestDispatcher("/employee.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fullname = req.getParameter("fullname");
        String address = req.getParameter("address");
        String birthdayStr = req.getParameter("birthday");
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date birthday = null;
        try {
            birthday = formatter.parse(birthdayStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String position = req.getParameter("position");
        String department = req.getParameter("department");
        EmployeeEntity newEmployee = new EmployeeEntity(fullname,address,birthday,position,department);
        employeeDAO.create(newEmployee);
        resp.sendRedirect("employeeServlet");
    }
}
