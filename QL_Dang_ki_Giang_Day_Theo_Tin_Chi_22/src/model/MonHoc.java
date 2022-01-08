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
public class MonHoc implements Serializable{
    private int ma;
    private String tenmon;
    private int sotiet;
    private String loaiMonHoc;
    private static int sma=100;

    public MonHoc() {
    }

    public MonHoc(int ma, String tenmon, int sotiet, String loaiMonHoc) {
        this.ma = ma;
        this.tenmon = tenmon;
        this.sotiet = sotiet;
        this.loaiMonHoc = loaiMonHoc;
    }

    
    public MonHoc(String tenmon, int sotiet, String loaiMonHoc) throws TrongException {
        if(tenmon.isEmpty()) throw new TrongException();
        this.ma=sma++;
        this.tenmon = tenmon;
        this.sotiet = sotiet;
        this.loaiMonHoc = loaiMonHoc;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTenmon() {
        return tenmon;
    }

    public void setTenmon(String tenmon) {
        this.tenmon = tenmon;
    }

    public int getSotiet() {
        return sotiet;
    }

    public void setSotiet(int sotiet) {
        this.sotiet = sotiet;
    }

    public String getLoaiMonHoc() {
        return loaiMonHoc;
    }

    public void setLoaiMonHoc(String loaiMonHoc) {
        this.loaiMonHoc = loaiMonHoc;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        MonHoc.sma = sma;
    }
    public Object[] toObject(){
        return new Object[]{
            // muốn đưa ra cái gì thì cho vào đây
            ma,tenmon,sotiet,loaiMonHoc
        };
    }
    
}
