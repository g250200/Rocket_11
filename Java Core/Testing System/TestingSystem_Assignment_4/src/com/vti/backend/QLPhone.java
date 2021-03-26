package com.vti.backend;

import com.vti.entity.Abstraction.Phone.Phone;
import com.vti.entity.Abstraction.Phone.VietnamesePhone;

public class QLPhone {
	public void question1() {
		Phone phone = new VietnamesePhone();
		phone.insertContact("Giang", "0123456789");
		phone.removeContact("Giang");
		phone.updateContact("Giang", "0123456789");
		phone.searchContact("Giang");
	}

}
