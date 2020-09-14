import java.util.Scanner;

/*
 * Mục đích: quản lý các nghiệp vụ lq đến sv
 * Người tạo: CyberSoft
 * Ngày tạo: 27/08/2020
 * Version: 1.0
 */
public class SinhVien {
	// 1. Attributes
	private String tenSV;
	private int maSV;
	private float diemToan;
	private float diemLy;
	private float diemHoa;
	private float diemTB;
	private String xepLoai;

	// 2. Get, set methods
	public String getTenSV() {
		return tenSV;
	}

	public void setTenSV(String tenSV) {
		this.tenSV = tenSV;
	}

	public int getMaSV() {
		return maSV;
	}

	public void setMaSV(int maSV) {
		this.maSV = maSV;
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

	public float getDiemTB() {
		return diemTB;
	}

	public String getXepLoai() {
		return xepLoai;
	}

	// 3. Constructors methods
	public SinhVien() {
	}
	
	public SinhVien(String tenSV, int maSV, float diemToan, float diemLy, float diemHoa) {
		this.tenSV = tenSV;
		this.maSV = maSV;
		this.diemToan = diemToan;
		this.diemLy = diemLy;
		this.diemHoa = diemHoa;
	}

	// 4. Input/output methods
	public void nhap(Scanner scan) {
		System.out.print("Enter name: ");
		this.tenSV = scan.nextLine();

		System.out.print("Enter student code: ");
		this.maSV = Integer.parseInt(scan.nextLine());

		System.out.print("Enter Math grade: ");
		this.diemToan = Float.parseFloat(scan.nextLine());

		System.out.print("Enter Physis grade: ");
		this.diemLy = Float.parseFloat(scan.nextLine());

		System.out.print("Enter Chemistry grade : ");
		this.diemHoa = Float.parseFloat(scan.nextLine());
	}
		
	public void xuat() {
		System.out.println("Student-code: " + this.maSV + "\t Name: " + this.tenSV 
											+ "\t Math: " + this.diemToan 
											+ "\t Physis: " + this.diemLy
											+ "\t Chemistry: " + this.diemHoa
											+ "\t Average grade: " + this.diemTB
											+ "\t Equivalent : " + this.xepLoai);
													
	}
	// 5. Business methods
	public void tinhDTB() {
		this.diemTB = (this.diemToan + this.diemLy + this.diemHoa )/3;
	}
	
	public void xepLoai() {
		if (this.diemTB >= 9) {this.xepLoai = "Excellent";}
		else if (this.diemTB>=8) {this.xepLoai = "Very good";}
		else if (this.diemTB>=7) {this.xepLoai = "Good";}
		else if (this.diemTB>=6) {this.xepLoai = "Fairly good";}
		else if (this.diemTB>=5) {this.xepLoai = "Average";}
		else {this.xepLoai="Weak";}
		
	}
}
