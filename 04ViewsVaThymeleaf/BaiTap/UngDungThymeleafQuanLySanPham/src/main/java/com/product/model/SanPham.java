package com.product.model;

public class SanPham {
    private int id;
    private String tenSanPham;
    private String moTa;
    private String noiSanXuat;
    private String hanSuDung;

    public SanPham() {
    }

    public SanPham(int id, String tenSanPham, String moTa, String noiSanXuat, String hanSuDung) {
        this.id = id;
        this.tenSanPham = tenSanPham;
        this.moTa = moTa;
        this.noiSanXuat = noiSanXuat;
        this.hanSuDung = hanSuDung;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getNoiSanXuat() {
        return noiSanXuat;
    }

    public void setNoiSanXuat(String noiSanXuat) {
        this.noiSanXuat = noiSanXuat;
    }

    public String getHanSuDung() {
        return hanSuDung;
    }

    public void setHanSuDung(String hanSuDung) {
        this.hanSuDung = hanSuDung;
    }
}
