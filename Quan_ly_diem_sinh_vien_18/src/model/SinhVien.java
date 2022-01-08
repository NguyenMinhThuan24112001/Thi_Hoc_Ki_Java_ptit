/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import controller.TrongException;
import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class SinhVien implements Serializable{
    private int ma;
    private String hoten,dchi,ngaySinh,lop;
    private static int sma=10000;
    public SinhVien() {
    }
    public SinhVien(int ma, String hoten, String dchi, String ngaySinh, String lop) {
        this.ma = ma;
        this.hoten = hoten;
        this.dchi = dchi;
        this.ngaySinh = ngaySinh;
        this.lop = lop;
    }

     public SinhVien(String hoten, String dchi, String ngaySinh, String lop) throws TrongException {
         if(hoten.isEmpty()) throw new TrongException();
         this.ma = sma++;
        this.hoten = hoten;
        this.dchi = dchi;
        this.ngaySinh = ngaySinh;
        this.lop = lop;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDchi() {
        return dchi;
    }

    public void setDchi(String dchi) {
        this.dchi = dchi;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        SinhVien.sma = sma;
    }
    
    public Object[] toObject(){
        return new Object[]{
            // muốn đưa ra cái gì thì cho vào đây
            ma,hoten,dchi,ngaySinh,lop
        };
    }
    
}
