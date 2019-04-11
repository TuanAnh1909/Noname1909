import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class DocGhiFile {
	public void ghiDanhSachTinhThanh(DanhSachTinhThanh list,String name) {
		try(FileOutputStream fos = new FileOutputStream(new File(name))) {
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(list);
		} catch (Exception e) {
			System.out.println("Error");
		}
	}
	public void ghiDanhSachSinnhVien(ArrayList list,String name) {
		try(FileOutputStream fos = new FileOutputStream(new File(name))) {
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(list);
		} catch (Exception e) {
			System.out.println("Error");
		}
	}

	public ArrayList docDanhSachTinhThanh(String name) {
		ArrayList list = new ArrayList<Object>();
		try (FileInputStream fis = new FileInputStream(new File(name))) {
			ObjectInputStream ois = new ObjectInputStream(fis);
			list = (ArrayList) ois.readObject();

		} catch (Exception e) {
			System.out.println("Error");
		}
		return list;

	}

	public ArrayList docDanhSachThiSinh(String name) {
		ArrayList<Object> list = new ArrayList<>();
		try (FileInputStream fis = new FileInputStream(new File(name))) {
			ObjectInputStream ois = new ObjectInputStream(fis);
			list = (ArrayList) ois.readObject();

		} catch (Exception e) {
			System.out.println("Error");
		}
		return list;
	}

	public static void main(String[] args) {
		DocGhiFile file = new DocGhiFile();
		ArrayList list;
		ArrayList<ThiSinh> list1 = new ArrayList<ThiSinh>();
		list.add(new TinhThanh("Ha Noi",1));
		list.add(new TinhThanh("Hai Phong",2));
		file.ghiDanhSachTinhThanh(list,"quequan.txt");
		list = file.docDanhSachTinhThanh("quequan.txt");
		for (TinhThanh t1 : list) {
			System.out.println(t1.getTenTinh() + ";" + t1.getMaTinh());
		}
		list1.add(new ThiSinh(10001,"Nguyen Trong Phuc", 1,"02/10/1976", true, 7, 5, 6));
		list1.add(new ThiSinh(10002,"Nguyen Thị Hương", 2,"03/12/1979", false, 7, 9, 8));
		file.ghiDanhSachSinnhVien(list1, "thisinh.txt");
		list1 = file.docDanhSachTinhThanh("thisinh.txt");
		for (ThiSinh t1 : list1) {
			System.out.println(t1.getMaThiSinh() +","+ t1.getDiemHoa());
		}

	}

}
