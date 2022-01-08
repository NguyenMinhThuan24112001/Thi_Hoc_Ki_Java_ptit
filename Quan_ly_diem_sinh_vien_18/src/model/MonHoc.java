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
    private String hoten,loaiMonHoc;
    private int sodvht;
    private static int sma=100;
    public MonHoc() {
    }

    public MonHoc(int ma, String hoten, int sodvht, String loaiMonHoc) {
        this.ma = ma;
        this.hoten = hoten;
        this.loaiMonHoc = loaiMonHoc;
        this.sodvht = sodvht;
    }
    public MonHoc(String hoten, int sodvht, String loaiMonHoc) throws TrongException {
        if(hoten.isEmpty()) throw new TrongException();
        this.ma = sma++;
        this.hoten = hoten;
        this.loaiMonHoc = loaiMonHoc;
        this.sodvht = sodvht;
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

    public String getLoaiMonHoc() {
        return loaiMonHoc;
    }

    public void setLoaiMonHoc(String loaiMonHoc) {
        this.loaiMonHoc = loaiMonHoc;
    }

    public int getSodvht() {
        return sodvht;
    }

    public void setSodvht(int sodvht) {
        this.sodvht = sodvht;
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
            ma,hoten,sodvht,loaiMonHoc
        };
    }
}
