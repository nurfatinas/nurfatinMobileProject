package master

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.util.KeywordUtil








public class randomNumber {


	@Keyword
	def static genRandomNumber(String str, int length) {


		Random rand = new Random();

		StringBuilder randNum = new StringBuilder();

		for (int i=0; i<length; i++) {

			randNum.append(rand.nextInt(10));
		}

		KeywordUtil.logInfo('Generated Input: ' +str+randNum)

		return (str+randNum).toString();
	}
}
