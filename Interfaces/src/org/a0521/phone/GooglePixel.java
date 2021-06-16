package org.a0521.phone;

public class GooglePixel implements Phone{

	@Override
	public String processor() {
		return "SD835";
	}

	@Override
	public String OS() {
		return "Android";
	}

	@Override
	public int spaceInGB() {
		return 64;
	}

}
