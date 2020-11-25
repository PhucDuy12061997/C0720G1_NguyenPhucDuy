package com.product.service;

import com.product.model.SanPham;

import java.util.List;

public interface SanPhamService {
List<SanPham> findAll();

void Save(SanPham sanPham);
SanPham findById(int id);

void update(int id,SanPham sanPham);

void remove(int id);
}
