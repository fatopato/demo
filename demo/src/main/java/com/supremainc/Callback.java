package com.supremainc;


public interface Callback {
	//public void Done(int sum);

	public void OnDeviceFound(long deviceId);
	public void OnDeviceAccepted(long deviceId);
	public void OnDeviceConnected(long deviceId);
	public void OnDeviceDisconnected(long deviceId);
	
	public void OnReadyToScan(long deviceId, long sequence);
	public void OnProgressChanged(long deviceId, long progressPercentage);
	public void OnLogReceived(long deviceId, BS2Event event);
	public void OnAlarmFired(long deviceId, BS2Event event);
	public void OnInputDetected(long deviceId, BS2Event event);
	public void OnConfigChanged(long deviceId, long configMask);
	public void OnVerifyUser(long deviceId, short seq, short isCard, short cardType, byte[] data);
	public void OnIdentifyUser(long deviceId, short seq, short format, byte[] templateData);
	public int IsAcceptableUserID(String uid);
	public void OnSendRootCA(long deviceId, int result);
	public void OnCheckGlobalAPBViolation(long deviceId, short seq, String userID_1, String userID_2, boolean isDualAuth);

	public long PreferMethod(long deviceID);
	public String GetRootCaFilePath(long deviceID);
	public String GetServerCaFilePath(long deviceID);
	public String GetServerPrivateKeyFilePath(long deviceID);
	public String GetPassword(long deviceID);
	public void OnErrorOccured(long deviceID, int errCode);

}