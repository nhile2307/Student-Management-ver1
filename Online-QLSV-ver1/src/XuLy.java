import java.util.ArrayList;
import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// DanhSachSinhVien ds = new DanhSachSinhVien();
		TruongHoc truong = new TruongHoc();
		truong.nhap();
		doMenu(truong);
	}

	private static void inMenu() {
		System.out.println("Please choose:");
		System.out.println("1. Add Student");
		System.out.println("2. Print out Student list");
		System.out.println("3. List student with high Average grade");
		System.out.println("4. List student below Average");
		System.out.println("5. Find student by name");
		System.out.println("6. Find student by code");
		System.out.println("7. Delete student by code");
		System.out.println("0. Exit");
	}

	private static void doMenu(TruongHoc truong) {
		boolean flag = true;
		Scanner scan = new Scanner(System.in);
		do {
			inMenu();
			System.out.print("Please choose");
			int chon = Integer.parseInt(scan.nextLine());
			switch (chon) {
			case 1:
				SinhVien sv = new SinhVien();
				sv.nhap(scan);
				truong.themSinhVien(sv);
				break;
			case 2:
				truong.tinhDTB();
				truong.xepLoai();
				truong.xuat();
				break;
			case 3:
				ArrayList<SinhVien> list = truong.timDSSVCoDTBCaoNhat();
				truong.xuatHelper(list);
				/*
				 * for (SinhVien sv1: list) { sv1.xuat(); }
				 */
				break;
			case 4:
				ArrayList<SinhVien> listYeu = truong.lietkeDSSVYeu();
				truong.xuatHelper(listYeu);
				/*
				 * for(SinhVien sv1:listYeu) { sv1.xuat(); }
				 */
				break;
			case 5:
				System.out.println("Please give student's name for looking ");
				String ten = scan.nextLine();
				ArrayList<SinhVien> listTen = truong.timSVTheoTen(ten);
				truong.xuatHelper(listTen);
				break;
			case 6:
				System.out.println("Give the student's code for looking");
				int ma = Integer.parseInt(scan.nextLine());
				SinhVien svFound = truong.timSVTheoMa(ma);
				if (svFound != null) {
					svFound.xuat();
				} else {
					System.out.println("There no student with " + ma);
				}
				break;
			case 7:
				System.out.println("Give the student code need to be deleted");
				int maXoa = Integer.parseInt(scan.nextLine());
				boolean deleted = truong.xoaSVTheoMa(maXoa);
				if (deleted) {
					System.out.println("Deleted successfully");
				} else {
					System.out.println("The code is not available");
				}
				break;
			case 0:
				flag = false;
				break;
			}
		} while (flag);
	}

}
