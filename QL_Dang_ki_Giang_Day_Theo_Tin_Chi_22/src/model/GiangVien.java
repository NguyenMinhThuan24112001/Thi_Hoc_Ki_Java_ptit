/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import controller.DienThoaiException;
import controller.TrongException;
import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class GiangVien implements Serializable{
    private int ma;
    private String hoten,dthoai,khoa;
    private static int sma=10000;

    public GiangVien() {
    }

    public GiangVien(int ma, String hoten, String dthoai, String khoa) {
        this.ma = ma;
        this.hoten = hoten;
        this.dthoai = dthoai;
        this.khoa = khoa;
    }
    
    public GiangVien(String hoten, String dthoai,String khoa) 
            throws TrongException, DienThoaiException{
        if(hoten.isEmpty()) throw new TrongException();
        if(!dthoai.matches("\\d+")) throw  new DienThoaiException();
                
        this.ma = sma++;
        this.hoten = hoten;
        this.dthoai = dthoai;
        this.khoa=khoa;
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

    public String getDthoai() {
        return dthoai;
    }

    public void setDthoai(String dthoai) {
        this.dthoai = dthoai;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        GiangVien.sma = sma;
    }
    public Object[] toObject(){
        return new Object[]{
            // muốn đưa ra cái gì thì cho vào đây
            ma,hoten,dthoai,khoa
        };
    }
}
