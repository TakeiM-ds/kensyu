package jb13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class HandyPhoneTest extends HandyPhone {

	@Test
	@DisplayName("HandyPhoneクラスの呼び出し確認")
	void test() {
		HandyPhone handyPhone = new HandyPhone();
		handyPhone.mailAddress = "test@tes";
		Assertions.assertEquals("test@tesからtesへメールしました。", handyPhone.mail("tes"));
	}

	@Test
	@DisplayName("Phoneクラスの継承確認")
	void test1() {
		HandyPhone handyPhone = new HandyPhone();
		handyPhone.no = "テスト";
		Assertions.assertEquals("テストからtesへ電話しました。", handyPhone.tel("tes"));
	}

}
