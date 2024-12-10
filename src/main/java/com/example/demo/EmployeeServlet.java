package com.example.demo;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "EmployeeServlet", value = "/employee")
public class EmployeeServlet extends HttpServlet {

    private EmployeeService employeeService;

    @Override
    public void init() throws ServletException {
        employeeService = new EmployeeService();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }

        switch (action) {
            case "add":
                RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/Employee.jsp");
                dispatcher.forward(request, response);
                break;
            default:
                List<Employee> employees = employeeService.getAllEmployee();
                request.setAttribute("employees", employees);
                dispatcher = request.getRequestDispatcher("/WEB-INF/views/Employee.jsp");
                dispatcher.forward(request, response);
                break;
        }
    }
}