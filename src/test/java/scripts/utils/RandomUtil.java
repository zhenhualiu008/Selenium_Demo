package scripts.utils;

import java.util.Random;

public class RandomUtil {
	
	public static String getRandomServiceIdentifier() {
		//Get random Service Identifier
		Random random = new Random();
		int x = random.nextInt(8999999);
		int y = x+1000000;
		String serviceID = "021" + String.valueOf(y);
		return serviceID;
	}

}
