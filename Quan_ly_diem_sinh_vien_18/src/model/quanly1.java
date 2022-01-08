/////*
//// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
//// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
//// */
////package model;
////
/////**
//// *
//// * @author Admin
//// */
////public class quanly1 {
////    /*
//// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
//// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
//// */
////package model;
////
/////**
//// *
//// * @author Admin
//// */
////public class thi {
////    //DienThoaiException
//////   public class DienThoaiException extends  Exception{
//////    
//////} 
////    
////    //IOFile
//////    public class IOFile {
//////    
////    public static <T> List<T> doc(String file) {
////        List<T> list = new ArrayList<>();
////        try{
////            ObjectInputStream o=new ObjectInputStream(new FileInputStream(file));
////            list=(List<T>)o.readObject();
////            o.close();
////        } catch(IOException e) {
////            System.out.println(e);
////        } catch(ClassNotFoundException e) {
////            System.out.println(e);
////        }
////        return list;
////    }
////    
////    public static <T> void viet(String file, List<T> arr) {
////        List<T> list = new ArrayList<>();
////        try{
////            ObjectOutputStream o=new ObjectOutputStream(new FileOutputStream(file));
////            o.writeObject(arr);
////            o.close();
////        } catch(IOException e) {
////            System.out.println(e);
////        } 
////    }
//////    
//////}
////    
////    
////    
////    
////    //TrongException
//////    public class TrongException extends Exception {
//////    
//////}
////
////    
////    //GiangVien
//////    public class GiangVien implements Serializable{
////    private int ma;
////    private String hoten,dthoai,khoa;
////    private static int sma=10000;
//////
//////    public GiangVien() {
//////    }
//////
//////    public GiangVien(int ma, String hoten, String dthoai, String khoa) {
//////        this.ma = ma;
//////        this.hoten = hoten;
//////        this.dthoai = dthoai;
//////        this.khoa = khoa;
//////    }
//////    
//////    public GiangVien(String hoten, String dthoai,String khoa) 
//////            throws TrongException, DienThoaiException{
//////        if(hoten.isEmpty()) throw new TrongException();
//////        if(!dthoai.matches("\\d+")) throw  new DienThoaiException();
//////                
//////        this.ma = sma++;
//////        this.hoten = hoten;
//////        this.dthoai = dthoai;
//////        this.khoa=khoa;
//////    }
//////
//////    public int getMa() {
//////        return ma;
//////    }
//////
//////    public void setMa(int ma) {
//////        this.ma = ma;
//////    }
//////
//////    public String getHoten() {
//////        return hoten;
//////    }
//////
//////    public void setHoten(String hoten) {
//////        this.hoten = hoten;
//////    }
//////
//////    public String getDthoai() {
//////        return dthoai;
//////    }
//////
//////    public void setDthoai(String dthoai) {
//////        this.dthoai = dthoai;
//////    }
//////
//////    public String getKhoa() {
//////        return khoa;
//////    }
//////
//////    public void setKhoa(String khoa) {
//////        this.khoa = khoa;
//////    }
//////
//////    public static int getSma() {
//////        return sma;
//////    }
//////
//////    public static void setSma(int sma) {
//////        GiangVien.sma = sma;
//////    }
////    public Object[] toObject(){
////        return new Object[]{
////            // muốn đưa ra cái gì thì cho vào đây
////            ma,hoten,dthoai,khoa
////        };
////    }
//////}
////    
////    
////    //MonHoc
//////    public class MonHoc implements Serializable{
//////    private int ma;
//////    private String tenmon;
//////    private int sotiet;
//////    private String loaiMonHoc;
//////    private static int sma=100;
//////
//////    public MonHoc() {
//////    }
//////
//////    public MonHoc(int ma, String tenmon, int sotiet, String loaiMonHoc) {
//////        this.ma = ma;
//////        this.tenmon = tenmon;
//////        this.sotiet = sotiet;
//////        this.loaiMonHoc = loaiMonHoc;
//////    }
//////
//////    
//////    public MonHoc(String tenmon, int sotiet, String loaiMonHoc) throws TrongException {
//////        if(tenmon.isEmpty()) throw new TrongException();
//////        this.ma=sma++;
//////        this.tenmon = tenmon;
//////        this.sotiet = sotiet;
//////        this.loaiMonHoc = loaiMonHoc;
//////    }
//////
//////    public int getMa() {
//////        return ma;
//////    }
//////
//////    public void setMa(int ma) {
//////        this.ma = ma;
//////    }
//////
//////    public String getTenmon() {
//////        return tenmon;
//////    }
//////
//////    public void setTenmon(String tenmon) {
//////        this.tenmon = tenmon;
//////    }
//////
//////    public int getSotiet() {
//////        return sotiet;
//////    }
//////
//////    public void setSotiet(int sotiet) {
//////        this.sotiet = sotiet;
//////    }
//////
//////    public String getLoaiMonHoc() {
//////        return loaiMonHoc;
//////    }
//////
//////    public void setLoaiMonHoc(String loaiMonHoc) {
//////        this.loaiMonHoc = loaiMonHoc;
//////    }
//////
//////    public static int getSma() {
//////        return sma;
//////    }
//////
//////    public static void setSma(int sma) {
//////        MonHoc.sma = sma;
//////    }
////    public Object[] toObject(){
////        return new Object[]{
////            // muốn đưa ra cái gì thì cho vào đây
////            ma,tenmon,sotiet,loaiMonHoc
////        };
////    }
//////    
//////}
////    
////    //quanlydangki
//////    public class QuanLyDangKy implements Serializable{
//////     private GiangVien gv;
//////    private  MonHoc monhoc;
//////    private int soLop;
//////    private String thoigian;
//////
//////    public QuanLyDangKy() {
//////    }
//////
//////    public QuanLyDangKy(GiangVien gv, MonHoc monhoc, int soLop, String thoigian) {
//////        this.gv = gv;
//////        this.monhoc = monhoc;
//////        this.soLop = soLop;
//////        this.thoigian = thoigian;
//////    }
//////
//////    
//////
//////    public GiangVien getGv() {
//////        return gv;
//////    }
//////
//////    public void setGv(GiangVien gv) {
//////        this.gv = gv;
//////    }
//////
//////    public MonHoc getMonhoc() {
//////        return monhoc;
//////    }
//////
//////    public void setMonhoc(MonHoc monhoc) {
//////        this.monhoc = monhoc;
//////    }
//////
//////    public int getSoLop() {
//////        return soLop;
//////    }
//////
//////    public void setSoLop(int soLop) {
//////        this.soLop = soLop;
//////    }
//////
//////
//////    public String getTenMonHoc() {
//////       return monhoc.getTenmon();
//////   }
//////
//////    public String getThoigian() {
//////        return thoigian;
//////    }
//////
//////    public void setThoigian(String thoigian) {
//////        this.thoigian = thoigian;
//////    }
//////    
//////    
//////    public Object[] toObject() {
//////        return new Object[] {
//////            gv.getMa(), gv.getHoten(), monhoc.getMa(), monhoc.getTenmon(), soLop, thoigian
//////        };        
//////    };
//////}
//////
//////
//////
////    
////    
////    //Main
////    
//public class Main extends javax.swing.JFrame {
//     DefaultTableModel tmMH,tmGV,tmQL;
//    //hai file
//    String fMH,fGV,fQL;
//    List<MonHoc> listMH;
//    List<GiangVien> listGV;
//    List<QuanLyDangKy> listQL;
//    public Main() {
//        initComponents();
//         fMH="src/controller/MH.dat";
//        fGV="src/controller/GV.dat";
//        fQL="src/controller/QLDK.DAT";
//        String[] mh={"ma MH","ten MH","Tong so tiet","Loai Mon"};
//        String[] gv={"ma GV","ho ten GV","Dien Thoai","Khoa"};
//        String[] ql={"ma gv","ten gv","ma monhoc", "ten mon", "so lop", "thoi gian"};
//        tmMH = new DefaultTableModel(mh, 0);//ch?a c� d�ng n�o
//        tmGV = new DefaultTableModel(gv, 0);
//        tmQL = new DefaultTableModel(ql, 0);
//        jTable1.setModel(tmMH);
//        jTable2.setModel(tmGV);
//        jTable3.setModel(tmQL);
//        loadMH();
//        loadGV();
//        loadQL();
//        load2Ma();
//        showMH(listMH);
//        showGV(listGV);
//        showQL(listQL);
//    }
//    
//    private void loadMH(){
//        File f=new File(fMH);
//        //n?u file t?n t?i
//        if(f.exists()){
//            listMH=IOFile.doc(fMH);
//        }else{
//            //n?u ch?a c� th� kh? t?o
//            listMH =new ArrayList<>();
//        }
//    }
//     private void loadGV(){
//        File f=new File(fGV);
//        if(f.exists()){
//            listGV=IOFile.doc(fGV);
//        }else{
//            listGV =new ArrayList<>();
//        }
//    }
//    private void load2Ma() {
//        jComboBox4.removeAllItems();
//        jComboBox5.removeAllItems();
//        
//        for(GiangVien i:listGV)
//            jComboBox4.addItem(i.getMa()+"");
//        
//        for(MonHoc i:listMH)
//            jComboBox5.addItem(i.getMa()+"");           
//    }
//    private void loadQL() {
//        File f=new File(fQL);
//        if(f.exists()) 
//            listQL=IOFile.doc(fQL);
//        else 
//            listQL=new ArrayList<>();
//    }
//     private void showMH(List<MonHoc> list){
//        tmMH.setRowCount(0);
//        for(MonHoc i:list)
//            tmMH.addRow(i.toObject());
//    }
//     private void showGV(List<GiangVien> list){
//        tmGV.setRowCount(0);
//        for(GiangVien i:list)
//            tmGV.addRow(i.toObject());
//    }
//      private void showQL(List<QuanLyDangKy> list) {
//        tmQL.setRowCount(0);
//        for(QuanLyDangKy i:list)
//            tmQL.addRow(i.toObject());
//    }        
//      
//     private void btThemActionPerformed(java.awt.event.ActionEvent evt) {                                       
//        // TODO add your handling code here:
//        int n=listMH.size();
//        //n?u c� r?i
//        if(n>0){
//            MonHoc.setSma(listMH.get(n-1).getMa()+1);
//        }//hi?n th? m�
//        jTextField1.setText(MonHoc.getSma()+"");
//        String tenMH,loaiMH;
//        int stiet;
//        try {
//            tenMH=jTextField2.getText();
////            if(ten.isEmpty()) throw new TrongException();
//            loaiMH=jComboBox1.getSelectedItem().toString();
//            stiet=Integer.parseInt(jTextField3.getText());
//            MonHoc mh=new MonHoc(tenMH, stiet, loaiMH);
//            tmMH.addRow(mh.toObject());
//            listMH.add(mh);
//        } catch (TrongException e) {
//            JOptionPane.showMessageDialog(this, "Khong de trong");
//            return;
//        }catch(NumberFormatException e){
//              JOptionPane.showMessageDialog(this, "Nhap vao mot so");
//            return;
//        }
//    } 
//    private void btSuaActionPerformed(java.awt.event.ActionEvent evt) {                                      
//        // TODO add your handling code here:
//         int r=jTable1.getSelectedRow();
//        if(r>=0 &&r< jTable1.getRowCount()){
//            String ten=jTextField2.getText();
//             int stiet=Integer.parseInt(jTextField3.getText());
//              String loai=jComboBox1.getSelectedItem().toString();
//              tmMH.setValueAt(ten, r, 1);
//              tmMH.setValueAt(loai, r, 3);
//              tmMH.setValueAt(stiet, r, 2);
//              int ma=Integer.parseInt(jTextField1.getText());
//              MonHoc nv=new MonHoc(ma, ten, stiet, loai);
//              listMH.set(r, nv);
//                      
//        }else{
//            JOptionPane.showMessageDialog(this, "Chon dich vu de sua");
//            return;
//        } 
//    }                                     
//
//    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {                                     
//        // TODO add your handling code here:
//         int row=jTable1.getSelectedRow();
//        //ki?m tra xem ng??i d�ng c� ch?n hay ch?a
//        if(row>=0&&row<jTable1.getRowCount()){
//            //show 1 c�i message
//
//            //n?u ch?n r?i
//            jTextField1.setText(tmMH.getValueAt(row, 0).toString());// l?y ? d�ng th? row v� c?t th? ??u ti�n
//            jTextField2.setText(tmMH.getValueAt(row, 1).toString());
//            jTextField3.setText(tmMH.getValueAt(row, 2).toString());
//            
//            String cn=tmMH.getValueAt(row, 3).toString();
//            for(int i=0;i<jComboBox1.getItemCount();i++){
//                if(jComboBox1.getItemAt(i).toString().equals(cn)){
//                    jComboBox1.setSelectedIndex(i);
//                    break;
//                }
//                
//            }
//        }
//    }                                    
//
//    private void btTimActionPerformed(java.awt.event.ActionEvent evt) {                                      
//        // TODO add your handling code here:
//        String key=jTextField7.getText().trim().toLowerCase();
//        List<MonHoc> l=new ArrayList<>();
//        for(MonHoc i: listMH)
//            if(i.getTenmon().toLowerCase().contains(key)||i.getLoaiMonHoc().toLowerCase().contains(key))
//                l.add(i);
//        showMH(l);
//    }                                     
//
//    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {                                      
//        // TODO add your handling code here:
//        int r=jTable1.getSelectedRow();
//        if(r>=0 &&r< jTable1.getRowCount()){
//            tmMH.removeRow(r);
//            listMH.remove(r);
//        }else{
//            JOptionPane.showMessageDialog(this, "Chon dich vu de xoa");
//            return;
//        }
//    }                                     
//
//    private void btLuuActionPerformed(java.awt.event.ActionEvent evt) {                                      
//        // TODO add your handling code here:
//        IOFile.viet(fMH, listMH);
//    }                                     
//
//    private void btThem1ActionPerformed(java.awt.event.ActionEvent evt) {                                        
//        // TODO add your handling code here:
//        int n=listGV.size();
//        //n?u c� r?i
//        if(n>0){
//            GiangVien.setSma(listGV.get(n-1).getMa()+1);
//        }//hi?n th? m�
//        jTextField4.setText(GiangVien.getSma()+"");
//        String tenGV,soDt,khoa;
//        try {
//            tenGV=jTextField5.getText();
////            if(ten.isEmpty()) throw new TrongException();
//            khoa=jComboBox2.getSelectedItem().toString();
//            soDt=jTextField6.getText();
//            GiangVien gv=new GiangVien(tenGV, soDt, khoa) ;
//            tmGV.addRow(gv.toObject());
//            listGV.add(gv);
//        } catch (TrongException e) {
//            JOptionPane.showMessageDialog(this, "Khong de trong");
//            return;
//        }catch(NumberFormatException e){
//              JOptionPane.showMessageDialog(this, "Nhap vao mot so");
//            return;
//        }
//        catch(DienThoaiException e){
//              JOptionPane.showMessageDialog(this, "Dien thoai khong duoc de trong");
//            return;
//        }
//    }                                       
//
//    private void btLuu1ActionPerformed(java.awt.event.ActionEvent evt) {                                       
//        // TODO add your handling code here:
//         IOFile.viet(fGV, listGV);
//    }                                      
//
//    private void btXoa1ActionPerformed(java.awt.event.ActionEvent evt) {                                       
//        // TODO add your handling code here:
//        int r=jTable2.getSelectedRow();
//        if(r>=0 &&r< jTable2.getRowCount()){
//            tmGV.removeRow(r);
//            listGV.remove(r);
//        }else{
//            JOptionPane.showMessageDialog(this, "Chon dich vu de xoa");
//            return;
//        }
//    }                                      
//
//    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {                                     
//        // TODO add your handling code here:
//         int row=jTable2.getSelectedRow();
//        //ki?m tra xem ng??i d�ng c� ch?n hay ch?a
//        if(row>=0&&row<jTable2.getRowCount()){
//            //show 1 c�i message
//
//            //n?u ch?n r?i
//            jTextField4.setText(tmGV.getValueAt(row, 0).toString());// l?y ? d�ng th? row v� c?t th? ??u ti�n
//            jTextField5.setText(tmGV.getValueAt(row, 1).toString());
//            jTextField6.setText(tmGV.getValueAt(row, 2).toString());
//          
//            
//            
//            
//            String cn=tmGV.getValueAt(row, 3).toString();
//            for(int i=0;i<jComboBox2.getItemCount();i++){
//                if(jComboBox2.getItemAt(i).toString().equals(cn)){
//                    jComboBox2.setSelectedIndex(i);
//                    break;
//                }
//                
//            }
//        }
//    }                                    
//
//    private void btSua1ActionPerformed(java.awt.event.ActionEvent evt) {                                       
//        // TODO add your handling code here:
//        int r=jTable2.getSelectedRow();
//        if(r>=0 &&r< jTable2.getRowCount()){
//            String ten=jTextField5.getText();
//            String soDt=jTextField6.getText();
//              String khoa=jComboBox2.getSelectedItem().toString();
//              tmGV.setValueAt(ten, r, 1);
//              tmGV.setValueAt(khoa, r, 3);
//              tmGV.setValueAt(soDt, r, 2);
//              int ma=Integer.parseInt(jTextField4.getText());
//              GiangVien nv=new GiangVien(ma, ten, soDt, khoa);
//              listGV.set(r, nv);
//                      
//        }else{
//            JOptionPane.showMessageDialog(this, "Chon dich vu de sua");
//            return;
//        } 
//    }                                      
//
//    private void btTim1ActionPerformed(java.awt.event.ActionEvent evt) {                                       
//        // TODO add your handling code here:
//        String key=jTextField8.getText().trim().toLowerCase();
//        List<GiangVien> l=new ArrayList<>();
//        for(GiangVien i: listGV)
//            if(i.getHoten().toLowerCase().contains(key)||i.getKhoa().toLowerCase().contains(key))
//                l.add(i);
//        showGV(l);
//    }                                      
//
//    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {                                     
//        // TODO add your handling code here:
//         int row=jTable3.getSelectedRow();
//        //ki?m tra xem ng??i d�ng c� ch?n hay ch?a
//        if(row>=0&&row<jTable3.getRowCount()){
//            //show 1 c�i message
//
//            //n?u ch?n r?i
//            jTextField13.setText(tmQL.getValueAt(row, 4).toString());// l?y ? d�ng th? row v� c?t th? ??u ti�n
//            String cn=tmQL.getValueAt(row, 0).toString();
//            String cn1=tmQL.getValueAt(row, 2).toString();
//            for(int i=0;i<jComboBox4.getItemCount();i++){
//                if(jComboBox4.getItemAt(i).toString().equals(cn)){
//                    jComboBox4.setSelectedIndex(i);
//                    break;
//                }
//            }
//            for(int i=0;i<jComboBox5.getItemCount();i++){
//                if(jComboBox5.getItemAt(i).toString().equals(cn1)){
//                    jComboBox5.setSelectedIndex(i);
//                    break;
//                }
//            }
//        }
//        
//    }                                    
//
//    
//     private GiangVien getGVbyMa(int ma) {
//        for(GiangVien i:listGV)
//            if(i.getMa()==ma)
//                return i;
//        return null;
//    }
//     
//    private MonHoc getMHbyMa(int ma) {
//        for(MonHoc i:listMH)
//            if(i.getMa()==ma)
//                return i;
//        return null;
//    }
//    
//    private boolean trung2Ma(int maGV, int maMH) {
//        for(QuanLyDangKy i:listQL)
//            if(i.getGv().getMa()==maGV && i.getMonhoc().getMa()==maMH)
//                return true;
//        return false;
//    }
//    
//    private boolean  checkGV(int maGV) {
//        int count = 0;
//        for(QuanLyDangKy i:listQL)
//            if(i.getGv().getMa()==maGV)
//                count++;
//        if(count<3) return true;
//        return false;
//    }
//    
//     private boolean  checkMH(int maGV, int solop) {
//        int count = 0;
//        for(QuanLyDangKy i:listQL)
//            if(i.getGv().getMa()==maGV)
//                count+=i.getSoLop();
//        if(count+solop<=6) return true;
//        return false;
//    }
//    private void btThem2ActionPerformed(java.awt.event.ActionEvent evt) {                                        
//        // TODO add your handling code here:
//         try {
//            int maGV=Integer.parseInt(jComboBox4.getSelectedItem().toString());
//            int maMH=Integer.parseInt(jComboBox5.getSelectedItem().toString());
//            if(trung2Ma(maGV, maMH)) {
//                JOptionPane.showMessageDialog(this, "Trung 2 ma!");
//                jComboBox2.requestFocus();
//                return;
//            }
//		// System.out.println(java.time.LocalDateTime.now());
//            int solop=Integer.parseInt(jTextField13.getText());
//            String thoigian = java.time.LocalDateTime.now().toString();
//            
//            GiangVien gv=getGVbyMa(maGV);
//            MonHoc mh=getMHbyMa(maMH);
//            if(gv==null || mh==null) {
//                JOptionPane.showMessageDialog(this, "khong ton tai 1 trong 2 ma");
//                return;
//            }
//            
//            if(!checkGV(maGV)) {
//                JOptionPane.showMessageDialog(this, "gv k the day qua 3 mon");
//                return;
//            }
//            
//            if(!checkMH(maGV, solop)) {
//                JOptionPane.showMessageDialog(this, "gv k the day qua 6 lop");
//                return;
//            }
//            
//            QuanLyDangKy ql = new QuanLyDangKy(gv, mh, solop, thoigian);
//            tmQL.addRow(ql.toObject());
//            listQL.add(ql);
//        } catch (NumberFormatException ex) {
//            JOptionPane.showMessageDialog(this, "so lop phai la so");
//        }
//    }                                       
//
//    private void btSua2ActionPerformed(java.awt.event.ActionEvent evt) {                                       
//        // TODO add your handling code here:
//        
//    }                                      
//
//    private void btXoa2ActionPerformed(java.awt.event.ActionEvent evt) {                                       
//        // TODO add your handling code here:
//         int r=jTable3.getSelectedRow();
//        if(r>=0&&r<jTable3.getRowCount()) {
//            tmQL.removeRow(r);
//            listQL.remove(r);
//        } else
//            JOptionPane.showMessageDialog(this, "chon hang de xoa");
//        
//    }                                      
//
//    private void btLuu2ActionPerformed(java.awt.event.ActionEvent evt) {                                       
//        // TODO add your handling code here:
//        IOFile.viet(fQL, listQL);
//    }                                      
//
//    private void btTim2ActionPerformed(java.awt.event.ActionEvent evt) {                                       
//        // TODO add your handling code here:
//    }                                      
//
//    private void btLamActionPerformed(java.awt.event.ActionEvent evt) {                                      
//        // TODO add your handling code here:
//         load2Ma();
//    }                                     
//
//    /**
//     * @param args the command line arguments
//     */
//     public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Main().setVisible(true);
//            }
//        });
//    }
//}
////}
//
////}
