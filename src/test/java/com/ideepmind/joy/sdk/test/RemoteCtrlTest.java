package com.ideepmind.joy.sdk.test;

import com.ideepmind.joy.sdk.JoyHttpService;

public class RemoteCtrlTest {
	public static void main(String[] args) throws InterruptedException {
		JoyHttpService.getIntance().setBaseUrl("http://www.ideepmind.com/joy2");
		JoyHttpService.getIntance().tryLogin("05C7B932FD7F2BD99912BCDA725C13D0", null);
//		JoyHttpService.getIntance().setBaseUrl("http://localhost:8080");
//		JoyHttpService.getIntance().tryLogin("101", null);
		JoyHttpService.getIntance().rotation("100244", "CameraUp");
//		JoyHttpService.getIntance().rotation("100242", "CameraDown");
		for (int i = 0; i < 2; ++i) {
		JoyHttpService.getIntance().rotation("100242", "TurnLeft");
		Thread.sleep(500);
		}
//		JoyHttpService.getIntance().rotation("100242", "TurnRight");
	}
}
