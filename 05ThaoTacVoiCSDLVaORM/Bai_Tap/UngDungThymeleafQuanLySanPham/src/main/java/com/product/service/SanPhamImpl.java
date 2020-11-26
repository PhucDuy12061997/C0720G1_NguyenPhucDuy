package com.product.service;

import com.product.model.SanPham;
import com.product.repository.SanPhamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class SanPhamImpl implements SanPhamService {
    @Autowired
    private SanPhamRepository sanPhamRepository;


    @Override
    public List<SanPham> findAll() {
        return this.sanPhamRepository.findAll();
    }

    @Override
    public void Save(SanPham sanPham) {
        this.sanPhamRepository.Save(sanPham);
    }

    @Override
    public SanPham findById(int id) {
        return this.sanPhamRepository.findById(id);
    }

    @Override
    public void update(int id, SanPham sanPham) {
        sanPhamRepository.update(id, sanPham);
    }

    @Override
    public void remove(int id) {
        sanPhamRepository.remove(id);
    }
}
