package com.product.service;

import com.product.model.SanPham;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SanPhamImpl implements SanPhamService {
    private static Map<Integer, SanPham> sanPhams;

    static {
        sanPhams = new HashMap<>();
        sanPhams.put(1, new SanPham(1, "SandWich", "Banh Mi", "Viet Nam", "14 Ngay"));
        sanPhams.put(2, new SanPham(2, "SoCoLa", "Keo Ngot", "Thai Lan", "30 Ngay"));
        sanPhams.put(3, new SanPham(3, "Snack", "Banh Nam", "Viet Nam", "7 Ngay"));
        sanPhams.put(4, new SanPham(4, "Mi Tom", "Do An Nhanh", "Viet Nam", "14 Ngay"));
        sanPhams.put(5, new SanPham(5, "Xuc Xich", "Do An Nhanh", "Duc", "6 Thang"));
    }

    @Override
    public List<SanPham> findAll() {
        return new ArrayList<>(sanPhams.values());
    }

    @Override
    public void Save(SanPham sanPham) {
    sanPhams.put(sanPham.getId(),sanPham);
    }

    @Override
    public SanPham findById(int id) {
        return sanPhams.get(id);
    }

    @Override
    public void update(int id, SanPham sanPham) {
sanPhams.put(id,sanPham);
    }

    @Override
    public void remove(int id) {
sanPhams.remove(id);
    }
}
