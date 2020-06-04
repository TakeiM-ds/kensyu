package jb13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PhoneTest extends Phone {

	@Test
	@DisplayName("")
	void test() {
		Phone phone = new Phone();
		phone.no = "照";
		Assertions.assertEquals("照からtaへ電話しました。", phone.tel("ta"));
	}

}
