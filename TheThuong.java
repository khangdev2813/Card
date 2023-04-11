class TheThuong extends The{
    
    public TheThuong (String MaThe, String HoTen , float TongTien) {
        super(MaThe,HoTen,1,TongTien);
    }

    public Vip ConvertToVip() {
       return new Vip(this.MaThe,this.HoTen,this.TongTien);
    }

    @Override
    public The Mua(float tien, String ngaymua) {
        this.ThemNgayMua(ngaymua);
        this.TongTien += tien;
        return (TongTien > 5000) ? this.ConvertToVip() : this ; 
    }

    @Override
    public The KiemTra() {
        String n = this.NgayMua.get(this.NgayMua.size());
        if ((n - ngaymua >= 365)) 
            return new TheThuong(this.MaThe, this.HoTen, 0);
    }
}





