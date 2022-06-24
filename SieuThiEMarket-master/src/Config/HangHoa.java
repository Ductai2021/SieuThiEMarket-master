package Config;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Model.StoredFiles;

public class HangHoa {
    private static StoredFiles HangHoa = new StoredFiles("HangHoa.json");
    String loai;
    int maHang;
    String ten;
    double gia;
    int soLuong;
    Date ngayNhapKho;
    HangHoa next;
    static Scanner nhap = new Scanner(System.in);
    SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");
    public String tenHH;

    //hàm tạo
    HangHoa(){

    }
    HangHoa(String l, int id, String name, double money, int amount, String nn){
        loai = l;
        maHang = id;
        ten = name;
        gia = money;
        soLuong = amount;
        try {
            ngayNhapKho = date.parse(nn);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    //hàm nhập thông tin
    public void inThongTin(){
        System.out.println("__________________________________");
        System.out.println("Loại: "+loai);
        System.out.println("Mã hàng: "+maHang);
        System.out.println("Nhập Tên hàng hoá: "+ten);
        System.out.printf(" Nhập Giá bán: %.1f đồng \n", gia);
        System.out.println("Số lượng tồn kho: "+soLuong);
        System.out.println("ngày nhập: "+ date.format(ngayNhapKho));
        System.out.println("__________________________________");
    }
    public void nhapThongTin() throws ParseException{
        System.out.println("__________________________________");
        System.out.print("+ Nhập loại hàng hoá: ");
        loai = nhap.nextLine();
        System.out.print("+ Nhập mã hàng hoá: ");
        maHang = nhap.nextInt();
        System.out.print("+ Nhập tên hàng hoá: ");
        nhap.nextLine();
        ten = nhap.nextLine();
        System.out.print("+ Nhập giá bán: ");
        gia = nhap.nextDouble();
        System.out.print("+ Nhập số lượng: ");
        soLuong = nhap.nextInt();
        nhap.nextLine();
        System.out.print("+ Nhập ngày nhập hàng: ");
        ngayNhapKho = date.parse(nhap.nextLine());
    }
    public void sapXepTangDanTheoGia() {
    }
    public void them() {
    }
    public void sapXepGiamDanTheoGia() {
    }
    public void sapXepGiamDanTheoGiaVaLoai() {
    }
    public void sapXepTangDanTheoNgay() {
    }
    public void sapXepTangDanTheoNgayVaLoai() {
    }
    public void sapXepGiamDanTheoNgay() {
    }
    public void sapXepGiamDanTheoNgayVaLoai() {
    }
    public void xoaTheoMa(int ma) {
    }
    public void xoaTheoTen(String ten2) {
    }
    public void suaTheoMa(int ma) {
    }
    public void suaTheoTen(String ten2) {
    }
    public void ketQuaTimTheoLoai(String loai2) {
    }
    public void ketQuaTimTheoGia(double gia2) {
    }
    public void ketQuaTimTheoKhoangGia(double giaDau, double giaSau) {
    }
    public void ketQuaTimTheoNgay(Date chuyenChuoiSangNgay) {
    }
    public void ketQuaTimTheoKhoangNgay(Date chuyenChuoiSangNgay, Date chuyenChuoiSangNgay2) {
    }
    public void thongKe() {
    } 
    
}
