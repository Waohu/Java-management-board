import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class HocSinh {
    private String hoTen;
    private String ngaySinh;
    private float diemToan;
    private float diemLy;
    private float diemHoa;
    private float diemTrungBinh;

    public HocSinh() {
    }

    public HocSinh(String hoTen, String ngaySinh, float diemToan, float diemLy, float diemHoa) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public float getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(float diemToan) {
        this.diemToan = diemToan;
    }

    public float getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(float diemLy) {
        this.diemLy = diemLy;
    }

    public float getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(float diemHoa) {
        this.diemHoa = diemHoa;
    }

    public float getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(float diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap ngay sinh: ");
        ngaySinh = sc.nextLine();
        System.out.print("Nhap diem toan: ");
        diemToan = Float.parseFloat(sc.nextLine());
        System.out.print("Nhap diem ly: ");
        diemLy = Float.parseFloat(sc.nextLine());
        System.out.print("Nhap diem hoa: ");
        diemHoa = Float.parseFloat(sc.nextLine());
        diemTrungBinh = (diemToan + diemLy + diemHoa) / 3;
    }

    public void in() {
        System.out.printf("%-20s%-15s%-10.2f%-10.2f%-10.2f%-10.2f\n", hoTen, ngaySinh, diemToan, diemLy, diemHoa,
                diemTrungBinh);
    }

}

public class LopHoc {
    private String tenLop;
    private int nienKhoa;
    private ArrayList<HocSinh> danhSachHocSinh;

    public LopHoc() {
        danhSachHocSinh = new ArrayList<HocSinh>();
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten lop: ");
        tenLop = sc.nextLine();
        System.out.print("Nhap nien khoa: ");
        nienKhoa = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap so luong hoc sinh: ");
        int soLuongHocSinh = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < soLuongHocSinh; i++) {
            HocSinh hs = new HocSinh();
            hs.nhap();
            danhSachHocSinh.add(hs);
        }
    }

    public void in() {
        System.out.println("Ten lop: " + tenLop);
        System.out.println("Nien khoa: " + nienKhoa);
        System.out.println("Danh sach hoc sinh:");
        for (int i = 0; i < danhSachHocSinh.size(); i++) {
            System.out.println("Hoc sinh " + (i+1) + ":");
            danhSachHocSinh.get(i).in();
        }
    }

    public void sapXepTang() {
        danhSachHocSinh.sort(new Comparator<HocSinh>() {
            public int compare(HocSinh hs1, HocSinh hs2) {
                if (hs1.tinhDiemTrungBinh() < hs2.tinhDiemTrungBinh()) {
                    return -1;
                } else if (hs1.tinhDiemTrungBinh() > hs2.tinhDiemTrungBinh()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
    }

    public void sapXepGiam() {
        danhSachHocSinh.sort(new Comparator<HocSinh>() {
            public int compare(HocSinh hs1, HocSinh hs2) {
                if (hs1.tinhDiemTrungBinh() > hs2.tinhDiemTrungBinh()) {
                    return -1;
                } else if (hs1.tinhDiemTrungBinh() < hs2.tinhDiemTrungBinh()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
    }

    public static void main(String[] args) {
        LopHoc lopHoc = new LopHoc();
        lopHoc.nhap();
        System.out.println("Danh sach hoc sinh truoc khi sap xep:");
        lopHoc.in();
        lopHoc.sapXepGiam();
        System.out.println("Danh sach hoc sinh sau khi sap xep giam dan theo diem trung binh:");
        lopHoc.in();
    }
}

