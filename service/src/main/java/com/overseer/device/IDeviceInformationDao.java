package com.overseer.device;

public interface IDeviceInformationDao {
	public DeviceInformation getDeviceInformationByDeviceId(String deviceId);

	public void insertDeviceInformation(DeviceInformation deviceInformation);

	public void updateDeviceInformation(DeviceInformation deviceInformation);

	public void deleteDeviceInformation(DeviceInformation deviceInformation);

}
