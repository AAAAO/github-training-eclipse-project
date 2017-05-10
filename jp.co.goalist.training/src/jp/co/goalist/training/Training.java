package jp.co.goalist.training;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Training {
	public static void main(String args[]){

		Calendar c = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("MM月dd日");

		System.out.println("今日は"+sdf.format(c.getTime()) + "です");
	}
}
