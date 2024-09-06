package J04015_TinhThuNhapGiaoVien;

public class GiaoVien {
    private String id, name;
    private int salary;

    GiaoVien(String maNgach, String ten, int luong){
        id = maNgach;
        name = ten;
        salary = luong;
    }
    public void tinhThuNhap(){
        String chucVu = "";
        for (int i = 0; i < 2; i++) chucVu += id.charAt(i);
        String bacLuong = "";
        for (int i = 2; i < 4; i++) bacLuong += id.charAt(i);
        int phuCap;
        if (chucVu.equals("HT")) phuCap = 2000000;
        else if (chucVu.equals("HP")) phuCap = 900000;
        else phuCap = 500000;
        int thuNhap = salary * Integer.parseInt(bacLuong) + phuCap;

        System.out.println(id + " " + name + " " + Integer.parseInt(bacLuong) + " " + phuCap + " " + thuNhap);
    }
}
