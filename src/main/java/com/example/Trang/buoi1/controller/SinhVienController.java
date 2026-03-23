package com.example.Trang.buoi1.controller;

import com.example.Trang.buoi1.entity.SinhVien;
import com.example.Trang.buoi1.repository.SinhVienRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "sinhvien", value = {
        "/sinhvien/hienthi",
        "/sinhvien/viewupdate",
        "/sinhvien/them",
        "/sinhvien/sua",
        "/sinhvien/xoa",
        "/sinhvien/phantrang"
})
public class SinhVienController extends HttpServlet {
    SinhVienRepository repo = new SinhVienRepository();
    List<SinhVien> list = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if (uri.contains("hienthi")) {
            hienthi(req, resp);
        } else if(uri.contains("viewupdate")){
            viewupadte(req,resp);
        } else if(uri.contains("xoa")){
            xoaSV(req,resp);
        } else if(uri.contains("phantrang")){
            phantrang(req,resp);
        }
    }

    private void phantrang(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int page = 0;
        int pageSize = 3;
        if(req.getParameter("page") != null){
            page = Integer.valueOf(req.getParameter("id"));
        }
        req.setAttribute("page",page);
        req.setAttribute("list",repo.phantrang(page,pageSize));
        req.getRequestDispatcher("/buoi1/phantrang.jsp").forward(req,resp);
    }

    private void xoaSV(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        repo.xoaSV(id);
        resp.sendRedirect("/sinhvien/hienthi");
    }

    private void viewupadte(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id = Integer.getInteger(req.getParameter("id"));
        req.setAttribute("sv",repo.FindByID(id));
        req.getRequestDispatcher("/buoi1/viewupdate.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if (uri.contains("them")) {
            themSV(req, resp);
        } else if(uri.contains("sua")){
            suaSV(req,resp);
        }
    }

    private void suaSV(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        String ten = req.getParameter("ten");
        Integer tuoi = Integer.valueOf(req.getParameter("tuoi"));
        Boolean gioitinh = Boolean.parseBoolean(req.getParameter("gioitinh"));
        SinhVien sv = new SinhVien(id,ten,tuoi,gioitinh);
        repo.suaSV(sv);
        resp.sendRedirect("hienthi");
    }

    private void themSV(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String ten = req.getParameter("ten");
        Integer tuoi = Integer.valueOf(req.getParameter("tuoi"));
        Boolean gioitinh = Boolean.parseBoolean(req.getParameter("gioitinh"));
        SinhVien sv = new SinhVien(null,ten,tuoi,gioitinh);
        repo.themSV(sv);
        resp.sendRedirect("hienthi");
    }

    private void hienthi(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        list = repo.getAll();
        req.setAttribute("list", list);
        req.getRequestDispatcher("/buoi1/hienthi.jsp").forward(req, resp);
    }
}
