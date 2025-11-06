package lk.jiat.hp.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lk.jiat.hp.entity.Student;
import lk.jiat.hp.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.io.IOException;

public class StudentController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try (Session session = HibernateUtil.getSessionFactory().openSession()){

            Query<Student> query=  session.createNamedQuery("Student.getByEmail",Student.class)
                    .setParameter("email","sahan@gmail.com");
            Student student = query.getSingleResult();

            System.out.println(student.getName());

       }catch (Exception e){
            e.printStackTrace();
        }
    }
}
