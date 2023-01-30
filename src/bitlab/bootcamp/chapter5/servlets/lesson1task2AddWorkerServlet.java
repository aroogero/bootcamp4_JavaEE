package bitlab.bootcamp.chapter5.servlets;

import bitlab.bootcamp.chapter5.db.lesson1task2DBUtil;
import bitlab.bootcamp.chapter5.db.lesson1task2ListWorkers;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value="/add-worker")
public class lesson1task2AddWorkerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("worker_name");
        String surname = request.getParameter("worker_surname");
        String department = request.getParameter("worker_department");
        int salary = Integer.parseInt(request.getParameter("worker_salary"));

        lesson1task2ListWorkers worker = new lesson1task2ListWorkers(); //создали новый объект класса, где прописывали методы, создавали конструкторы
        worker.setName(name);       //Заполняем этот объект данными получая их с помощью гетпараметр, так как мы создавали данные private. - Если создадим в виде public, то добавляем их так - worker.(name);
        worker.setSurname(surname);
        worker.setDepartment(department);
        worker.setSalary(salary);

        lesson1task2DBUtil.addWorker(worker); //метод әдд уоркер берет и закидывает уоркера в эррейлист

        response.sendRedirect("/list_workers"); //redirect to other page. Если мы хотим
    }
}
