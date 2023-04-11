class Vip extends The{
    float SoNamVip;

    public Vip (String MaThe, String HoTen , float TongTien) {
        super(MaThe,HoTen,2,TongTien);
        this.SoNamVip = 1;
    }

    public float Thuong() {
        if (0.05*SoNamVip > 0.2) return 5/100*SoNamVip;
        return 2/10;
    }

    public TheThuong ConvertToThuong() {
        return new TheThuong(this.MaThe, this.HoTen, 0);
    }
    
    @Override
    public The Mua(float tien, String ngaymua) {
        this.ThemNgayMua(ngaymua);
        this.TongTien += tien*Thuong();
    }
    
    @Override
    public The KiemTra() {
        String n = this.NgayMua.get(this.NgayMua.size());
        if ((n - ngaymua >= 365)) return this.ConvertToThuong();
        return this;
    }
}
