package com.vti.entity.Abstraction;

/**
 * This class is . 
 * 
 * @Description: .
 * @author: TĐGiang
 * @create_date: Mar 29, 2021
 * @version: 1.0
 * @modifer: TĐGiang
 * @modifer_date: Mar 29, 2021
 */
public class ThiSinhKhoiC extends ThiSinh{
	
	public ThiSinhKhoiC() {
		khoi = "C";
		monThi = new String[3];
		monThi[0] = "Văn";
		monThi[1] = "Sử";
		monThi[2] = "Địa";
	}
	
	@Override
	public void NhapThongTinThiSinh() {

		super.NhapThongTinThiSinh();
	}
	
	@Override
	public void GetInfor() {
		super.GetInfor();
		System.out.print("Môn Thi: ");
		for (String string : monThi) {
			System.out.print(string + ", ");
		}
	}
}
