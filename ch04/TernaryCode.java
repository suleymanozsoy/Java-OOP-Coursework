
public class TernaryCode {
	/*
	 * cardInfo.setIdNo(cardInfo.getTcCitizen()
	 * ?(formUtils.isNullOrEmptyString(verifyOtpWSResponse.getTckn()) ?
	 * registrationForm.getTckn() : verifyOtpWSResponse.getTckn()):
	 * (formUtils.isNullOrEmptyString(verifyOtpWSResponse.getCustno())) ?
	 * registrationForm.getTckn(): verifyOtpWSResponse.getCustno());
	 */
	public static void main(String[] args) {
		// I couldn't turned the ternary code above to if-else code
		// The right answer at below

		/* 
		 
		 String idNo = "";

		if (cardInfo.getTcCitizen()) {
			if (formUtils.isNullOrEmptyString(verifyOtpWSResponse.getTckn())) {
				idNo = registrationForm.getTckn();
			} else {
				idNo = verifyOtpWSResponse.getTckn();
			}
		} else {
			if (formUtils.isNullOrEmptyString(verifyOtpWSResponse.getCustno())) {
				idNo = registrationForm.getTckn();
			} else {
				idNo = verifyOtpWSResponse.getCustno();
			}
		}

		cardInfo.setIdNo(idNo); 
		
		*/

	}
}
