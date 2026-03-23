package com.example.Trang.buoi1.repository;

import com.example.Trang.buoi1.entity.SinhVien;
import com.example.Trang.buoi1.util.HibernateConfig;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class SinhVienRepository {
    private Session session = null;

    public SinhVienRepository() {
        session = HibernateConfig.getFACTORY().openSession();
    }

    public List<SinhVien> getAll() {
        return session.createQuery("from SinhVien sv").list();
    }

    public void themSV(SinhVien sv) {
        try {
            session.getTransaction().begin();
            session.save(sv);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
    }

    public  SinhVien FindByID(Integer id) {
        return session.find(SinhVien.class,id);
    }
    public void xoaSV(Integer id) {
        try {
            session.getTransaction().begin();
            session.delete(this.FindByID(id));
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
    }
    public void suaSV(SinhVien sv) {
        try {
            session.getTransaction().begin();
            session.save(sv);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
    }
     public List<SinhVien> phantrang(int page, int pageSize){
         Query query = session.createQuery("from SinhVien sv");
         query.setFirstResult((page * pageSize));
         query.setMaxResults(pageSize);
         return query.list();
     }
}
