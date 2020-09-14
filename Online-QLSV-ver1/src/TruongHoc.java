import java.util.ArrayList;

/*
 * Mục đích: qly toàn bộ nghiệp vụ cho trường học
 * Người tạo: CyberLearn
 * Ngày tạo 28/8/2020
 * Version: 1.0
 */
public class TruongHoc {

	// 1.Attributes
	private DanhSachSinhVien dssvToanTruong;

	// 2. Get, set methods
	public DanhSachSinhVien getDssvToanTruong() {
		return dssvToanTruong;
	}

	public void setDssvToanTruong(DanhSachSinhVien dssvToanTruong) {
		this.dssvToanTruong = dssvToanTruong;
	}

	// 3. Constructors
	public TruongHoc() {
		this.dssvToanTruong = new DanhSachSinhVien();
	}

	// 4.Input/output methods
	public void nhap() {

		SinhVien sv = new SinhVien("Lorry", 1, 9.2f, 9, 9);
		this.dssvToanTruong.themSV(sv);

		sv = new SinhVien("Henry", 2, 4.2f, 5, 5.3f);
		this.dssvToanTruong.themSV(sv);

		sv = new SinhVien("Leo", 3, 7.2f, 4, 9);
		this.dssvToanTruong.themSV(sv);

		sv = new SinhVien("Jannia", 4, 3.2f, 4, 4);
		this.dssvToanTruong.themSV(sv);

		sv = new SinhVien("Thod", 5, 9.2f, 10, 10);
		this.dssvToanTruong.themSV(sv);

		sv = new SinhVien("Hom", 6, 7.2f, 7, 6);
		this.dssvToanTruong.themSV(sv);

		sv = new SinhVien("Linda", 7, 3.2f, 3, 3);
		this.dssvToanTruong.themSV(sv);

		sv = new SinhVien("Trung", 8, 9.2f, 10, 10);
		this.dssvToanTruong.themSV(sv);

		sv = new SinhVien("Quyền", 9, 7.2f, 7, 8);
		this.dssvToanTruong.themSV(sv);

		sv = new SinhVien("Linh", 10, 5.2f, 5, 6);
		this.dssvToanTruong.themSV(sv);

	}

	public void xuat() {
		this.dssvToanTruong.xuat();
	}

	// 5.Business methods
	public void themSinhVien(SinhVien sv) {
		this.dssvToanTruong.themSV(sv);
	}

	public void tinhDTB() {
		this.dssvToanTruong.tinhDTB();
	}

	public void xepLoai() {
		this.dssvToanTruong.xepLoai();
	}

	public ArrayList<SinhVien> timDSSVCoDTBCaoNhat() {
		return this.dssvToanTruong.timDSSVCoDTBCaoNhat();
	}

	public ArrayList<SinhVien> lietkeDSSVYeu() {
		return this.dssvToanTruong.lietKeDSSVYeu();
	}

	public void xuatHelper(ArrayList<SinhVien> list) {
		for (SinhVien sv : list) {
			sv.xuat();
		}
	}

	public ArrayList<SinhVien> timSVTheoTen(String tenSV){
		return dssvToanTruong.timSVTheoTen(tenSV);
	}
	
	public SinhVien timSVTheoMa(int ma) {
		return dssvToanTruong.timSVTheoMa(ma);
	}
	
	public boolean xoaSVTheoMa(int ma) {
		return dssvToanTruong.xoaSVTheoMa(ma);
	}
}
