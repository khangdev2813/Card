import java.util.ArrayList;

public abstract class The {
    String MaThe;
    String HoTen;
    int LoaiThe;
    float TongTien;
    ArrayList<String> NgayMua = new ArrayList<String>();
    public The () {
        MaThe="";
        HoTen="";
        LoaiThe=0;
        TongTien=0;
    }
    public The (String MaThe, String HoTen , int LoaiThe, float TongTien) {
        this.MaThe = MaThe;
        this.HoTen = HoTen; 
        this.LoaiThe = LoaiThe;
        this.TongTien = TongTien;
    }
    public void ThemNgayMua(String ngay) {
        NgayMua.add(ngay);
    }

    public abstract The Mua(float tien, String ngaymua) ;
    public abstract The KiemTra();
}
