package com.blog.demo.repository;


import com.blog.demo.entity.AppUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser,Long> {
    AppUser findByUserName(String userName);
//    @Autowired
//    private EntityManager entityManager;
//
//    public AppUser findUserAccount(String userName) {
//        try {
//            String sql = "Select e from " + AppUser.class.getName() + " e " //
//                    + " Where e.userName = :userName ";
//
//            Query query = entityManager.createQuery(sql, AppUser.class);
//            query.setParameter("userName", userName);
//
//            return (AppUser) query.getSingleResult();
//        } catch (NoResultException e) {
//            return null;
//        }
//    }

}
