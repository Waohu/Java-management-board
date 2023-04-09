public class Document {
    protected String maTaiLieu;
    protected String tenNXB;
    protected int soBanPhatHanh;
    
    public Document(String maTaiLieu, String tenNXB, int soBanPhatHanh) {
        this.maTaiLieu = maTaiLieu;
        this.tenNXB = tenNXB;
        this.soBanPhatHanh = soBanPhatHanh;
    }
    
    public String getMaTaiLieu() {
        return maTaiLieu;
    }
    
    public void setMaTaiLieu(String maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }
    
    public String getTenNXB() {
        return tenNXB;
    }
    
    public void setTenNXB(String tenNXB) {
        this.tenNXB = tenNXB;
    }
    
    public int getSoBanPhatHanh() {
        return soBanPhatHanh;
    }
    
    public void setSoBanPhatHanh(int soBanPhatHanh) {
        this.soBanPhatHanh = soBanPhatHanh;
    }
}
