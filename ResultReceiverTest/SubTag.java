package com.example.com.resultreceivertest_00;

public final class SubTag {

	public static String msg(String subTag) {
		return "+++++ " + subTag + "() +++++";
	}
	
	public static String msg(String subTag, String msg) {
		return subTag + "(): -> " + msg;
	}

	public static String bullet(String subTag) {
		return "->" + subTag;
	}
	public static String bullet(String subTag, String msg) {
		return "->" + subTag + "(): "+ msg;
	}

	public static String subBullet(String subTag) {
		return "->->" + "(): "+ subTag;
	}
	public static String subBullet(String subTag, String msg) {
		return "->->" + subTag + "(): "+ msg;
	}
}