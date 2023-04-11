import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.ArrayList; 
public class Main {
  public static void Them(float tien , String ma , String ten, String ngay , ArrayList<The> card) {
    for (The i : card) {
      if (i.HoTen == ten && i.MaThe == ma) {
        i = i.Mua(tien, ngay);
      } 
    }
  }

  public static void KiemTra(ArrayList<The> card) {
    for (The i : card) {
      i.KiemTra();
    }
  }
  public static void main(String[] args) {
    ArrayList<The> card = new ArrayList<The>();
    Them(250,"nguyen x","t0084","12/4/2003",card);
    KiemTra(card);
  }
}
