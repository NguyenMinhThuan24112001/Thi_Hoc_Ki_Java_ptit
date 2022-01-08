/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class QuanLyDangKy implements Serializable{
     private GiangVien gv;
    private  MonHoc monhoc;
    private int soLop;
    private String thoigian;

    public QuanLyDangKy() {
    }

    public QuanLyDangKy(GiangVien gv, MonHoc monhoc, int soLop, String thoigian) {
        this.gv = gv;
        this.monhoc = monhoc;
        this.soLop = soLop;
        this.thoigian = thoigian;
    }

    

    public GiangVien getGv() {
        return gv;
    }

    public void setGv(GiangVien gv) {
        this.gv = gv;
    }

    public MonHoc getMonhoc() {
        return monhoc;
    }

    public void setMonhoc(MonHoc monhoc) {
        this.monhoc = monhoc;
    }

    public int getSoLop() {
        return soLop;
    }

    public void setSoLop(int soLop) {
        this.soLop = soLop;
    }


    public String getTenMonHoc() {
       return monhoc.getTenmon();
   }

    public String getThoigian() {
        return thoigian;
    }

    public void setThoigian(String thoigian) {
        this.thoigian = thoigian;
    }
    
    
    public Object[] toObject() {
        return new Object[] {
            gv.getMa(), gv.getHoten(), monhoc.getMa(), monhoc.getTenmon(), soLop, thoigian
        };        
    };
}
