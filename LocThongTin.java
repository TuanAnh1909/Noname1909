import java.util.Scanner;

public class LocThongTin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ID = sc.nextInt();
		int BirthPlace = sc.nextInt();
		for(ThiSinh t:List1) {
			if(ID == t.getMaThiSinh()) {
				System.out.println(t.getDiemToan() + t.getDiemLy() + t.getDiemHoa());
			}
		}
	}

}
