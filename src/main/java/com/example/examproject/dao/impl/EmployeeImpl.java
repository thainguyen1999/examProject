package com.example.examproject.dao.impl;

import com.example.examproject.dao.EmployeeDAO;
import com.example.examproject.entity.EmployeeEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUtil;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class EmployeeImpl implements EmployeeDAO {
    EntityManager entityManager;
    EntityTransaction entityTransaction;
    public EmployeeImpl() {
        entityManager = PersistenceUtil.createEntityManagerFactory().createEntityManager();
        entityTransaction = entityManager.getTransaction();
    }
    @Override
    public List<EmployeeEntity> getAllEmployee() {
        List<EmployeeEntity> employeeEntities= new ArrayList<>();
        try {
            Query query = entityManager.createQuery("select c from EmployeeEntity c");
            return query.getResultList();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return employeeEntities;
    }
    public void create(EmployeeEntity employeeEntity) {
        try {
            entityTransaction.begin();
            entityManager.persist(employeeEntity);
            entityTransaction.commit();
        } catch (Exception ex) {
            System.out.printf(ex.getMessage());
            entityManager.rollback();
        }

    }
    public void delete(EmployeeEntity employeeEntity) {
        EmployeeEntity employee = entityManager.find(EmployeeEntity.class, employeeEntity.getId());
        if (employee!= null) {
            try {
                entityTransaction.begin();
                entityManager.remove(employee);
                entityTransaction.commit();
            } catch (Exception ex) {
                System.out.printf(ex.getMessage());
                entityTransaction.rollback();
            }
        }

    }
}
