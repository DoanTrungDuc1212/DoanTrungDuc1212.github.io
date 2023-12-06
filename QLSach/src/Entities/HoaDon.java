/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import Tools.Doc_List_Tu_File;
import Tools.Ghi_List_Vao_File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author PC
 */
public class HoaDon implements Serializable{
    private String MaHD;
    private String NgayGiaoDich;
    private String TenKH;
    private ArrayList<SachTrongGioHang> SachMua;

    public HoaDon() {
    }

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public String getNgayGiaoDich() {
        return NgayGiaoDich;
    }

    public void setNgayGiaoDich(String NgayGiaoDich) {
        this.NgayGiaoDich = NgayGiaoDich;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
    }

    public ArrayList<SachTrongGioHang> getSachMua() {
        return SachMua;
    }

    public void setSachMua(ArrayList<SachTrongGioHang> SachMua) {
        this.SachMua = SachMua;
    }

    public HoaDon(String MaHD, String NgayGiaoDich, String TenKH, ArrayList<SachTrongGioHang> SachMua) {
        this.MaHD = MaHD;
        this.NgayGiaoDich = NgayGiaoDich;
        this.TenKH = TenKH;
        this.SachMua = SachMua;
    }

    
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<HoaDon> a = Doc_List_Tu_File.Doc_HoaDon_Tu_File();
        for(HoaDon i:a){
            System.out.println(i.toString());
        }
    }
}
