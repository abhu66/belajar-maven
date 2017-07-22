package com.khoerul.abu.belajar.java;

import org.joda.time.DateTime;


public class DemoJodatime {
	public static void main(String [] args){
	DateTime skrg = new DateTime();
	DateTime tigaBulanLagi = skrg.plusMonths(3);
	System.out.println("Tiga Bulan Dari Sekarang : "+tigaBulanLagi);
	}
}