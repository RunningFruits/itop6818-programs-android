package com.topeet.rfidtest;

public class rfid {
	public native int       Open();
    public native int       Close();
    public native int       Ioctl(int num, int en);
    public native int[]     Read();
    public native byte[]    ReadCardNum();
}
