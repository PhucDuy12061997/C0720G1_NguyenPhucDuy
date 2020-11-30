package com.product.repository.impl;

import com.product.model.SanPham;
import com.product.repository.BaseRepository;
import com.product.repository.SanPhamRepository;
import com.product.service.SanPhamService;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class SanPhamRepositoryimpl implements SanPhamRepository {
    @Override
    public List<SanPham> findAll() {
        TypedQuery<SanPham> typedQuery = BaseRepository.entityManager.createQuery("select s from sanpham s", SanPham.class);
        return typedQuery.getResultList();
    }

    @Override
    public void Save(SanPham sanPham) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.persist(sanPham);
        entityTransaction.commit();
    }

    @Override
    public SanPham findById(int id) {
//        dòng lệnh HQL,selct SanPham có id ... tại vị trí....
//TypedQuery<SanPham>typedQuery=BaseRepository.entityManager
//        .createQuery("select s from sanpham s where s.id=: idsanpham ",SanPham.class);
//        return typedQuery.getSingleResult();
//
        return BaseRepository.entityManager.find(SanPham.class, id);
    }

    @Override
    public void update(int id, SanPham sanPham) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.merge(sanPham);
        entityTransaction.commit();
    }

    @Override
    public void remove(int id) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.remove(findById(id));
        entityTransaction.commit();

    }
}
