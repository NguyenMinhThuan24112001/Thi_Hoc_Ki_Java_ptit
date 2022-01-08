package model;

import controller.DienThoaiException;
import controller.TrongException;
import java.io.Serializable;


public class NhanVien implements Serializable{
    
    private int ma;
    private String hoten, dchi, dthoai;
    static int sma=1000;

    public NhanVien() {
    }

    // dung de sua
    public NhanVien(int ma, String hoten, String dchi, String dthoai) {
        this.ma = ma;
        this.hoten = hoten;
        this.dchi = dchi;
        this.dthoai = dthoai;
    }
    
    // dung de them
    public NhanVien(String hoten, String dchi, String dthoai) 
            throws TrongException, DienThoaiException 
    {
        
        if(hoten.isEmpty() || dchi.isEmpty()) throw new TrongException();
        if(!dthoai.matches("\\d+")) throw new DienThoaiException();
        
        this.ma = sma++;
        this.hoten = hoten;
        this.dchi = dchi;
        this.dthoai = dthoai;
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

    public String getDthoai() {
        return dthoai;
    }

    public void setDthoai(String dthoai) {
        this.dthoai = dthoai;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        NhanVien.sma = sma;
    }

    
    
    public Object[] toObject() {
        return new Object[] {
            ma, hoten, dchi, dthoai
        };
    }
}
