import java.util.Scanner;

// Lớp hàng hóa
class HangHoa {
    String maHang;
    String tenHang;
    String donViTinh;
    double donGia;
    int soLuong;

    // Phương thức nhập thông tin hàng hóa
    void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma hang: ");
        maHang = scanner.nextLine();
        System.out.print("Nhap ten hang: ");
        tenHang = scanner.nextLine();
        System.out.print("Nhap don vi tinh: ");
        donViTinh = scanner.nextLine();
        System.out.print("Nhap don gia: ");
        donGia = scanner.nextDouble();
        System.out.print("Nhap so luong: ");
        soLuong = scanner.nextInt();
    }

    // Phương thức tính thành tiền
    double tinhThanhTien() {
        return donGia * soLuong;
    }
}

// Lớp hàng bán sỉ kế thừa từ lớp hàng hóa
class HangBanSi extends HangHoa {
    double donGiaVanChuyen;

    // Phương thức nhập thông tin hàng bán sỉ
    void nhap() {
        super.nhap();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap don gia van chuyen: ");
        donGiaVanChuyen = scanner.nextDouble();
    }

    // Phương thức tính công vận chuyển
    double tinhCongVanChuyen() {
        return donGiaVanChuyen * soLuong;
    }

    // Phương thức tính thành tiền
    double tinhThanhTien() {
        return super.tinhThanhTien() + tinhCongVanChuyen();
    }
}

// Lớp hàng bán lẻ kế thừa từ lớp hàng hóa
class HangBanLe extends HangHoa {
    double tyGiaBanLe;

    // Phương thức nhập thông tin hàng bán lẻ
    void nhap() {
        super.nhap();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ty gia ban le: ");
        tyGiaBanLe = scanner.nextDouble();
    }

    // Phương thức tính đơn giá bán lẻ
    double tinhDonGiaBanLe() {
        return donGia * tyGiaBanLe;
    }

    // Phương thức tính thành tiền
    double tinhThanhTien() {
        return tinhDonGiaBanLe() * soLuong;
    }
}

// Hàm main sử dụng các lớp hàng hóa, hàng bán sỉ và hàng bán lẻ
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tạo một đối tượng hàng hóa
        HangHoa hangHoa = new HangHoa();
        System.out.println("Nhap thong tin hang hoa:");
        hangHoa.nhap();
        System.out.println("Thanh tien: " + hangHoa.tinhThanhTien());

        // Tạo một đối tượng
