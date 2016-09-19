package com.overseer.device;

import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class DeviceInformationDao implements IDeviceInformationDao {

	private HibernateTemplate template;

	public DeviceInformationDao(HibernateTemplate template) {
		this.template = template;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = true, isolation = Isolation.DEFAULT)
	public DeviceInformation getDeviceInformationByDeviceId(String deviceId) {
		DeviceInformation deviceInformation = (DeviceInformation) template.get(DeviceInformation.class, deviceId);
		return deviceInformation;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
	public void insertDeviceInformation(DeviceInformation deviceInformation) {
		template.persist(deviceInformation);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
	public void updateDeviceInformation(DeviceInformation deviceInformation) {
		template.update(deviceInformation);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
	public void deleteDeviceInformation(DeviceInformation deviceInformation) {
		template.delete(deviceInformation);

	}

}
