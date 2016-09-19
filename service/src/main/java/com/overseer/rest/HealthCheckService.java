package com.overseer.rest;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import com.overseer.device.BrowserInformation;
import com.overseer.device.BrowserMimeTypeInformation;
import com.overseer.device.BrowserPluginInformation;
import com.overseer.device.DeviceInformation;
import com.overseer.device.DeviceInformationDao;
import com.overseer.device.DeviceType;
import com.overseer.device.IDeviceInformationDao;
import com.overseer.model.requests.UserRegistrationRequest;
import com.overseer.util.HibernateUtil;

@Path("/health")
public class HealthCheckService {

	@Autowired
	private ApplicationContext appContext;

	@GET
	@Path("helloworld")
	@Produces(MediaType.APPLICATION_JSON)
	public DeviceInformation helloWorld()  {
	
		DeviceInformation deviceInfo = new DeviceInformation();
		BrowserInformation browserInfo = new BrowserInformation();
		Set<BrowserInformation> browsers = new HashSet<BrowserInformation>();
		Set<BrowserPluginInformation> plugins = new HashSet<BrowserPluginInformation>();
		Set<BrowserMimeTypeInformation> mimeTypes = new HashSet<BrowserMimeTypeInformation>();
		
		BrowserPluginInformation plugin1 = new BrowserPluginInformation();
		//plugin1.setBrowserInformation(browserInfo);
		plugin1.setName("Plugin 1");
		plugin1.setVersion("12.34");
		
		BrowserPluginInformation plugin2 = new BrowserPluginInformation();
		//plugin2.setBrowserInformation(browserInfo);
		plugin2.setName("Plugin 2");
		plugin2.setVersion("12.45");
		
		plugins.add(plugin1);
		plugins.add(plugin2);
		
		BrowserMimeTypeInformation mime1 = new BrowserMimeTypeInformation();
		//mime1.setBrowserInformation(browserInfo);
		mime1.setName("Mime 1");
		mime1.setDescription("Dont Have Any");
		
		BrowserMimeTypeInformation mime2 = new BrowserMimeTypeInformation();
		//mime2.setBrowserInformation(browserInfo);
		mime2.setName("Mime 2");
		mime2.setSuffixListPipeSeperated("ax|bt|ht");
		
		mimeTypes.add(mime1);
		mimeTypes.add(mime2);
		
		Date date = new Date();
		
		deviceInfo.setDeviceId(UUID.randomUUID().toString());
		deviceInfo.setDeviceType(DeviceType.DESKTOP);
		deviceInfo.setCreatedTimestamp(date);
		
		browserInfo.setBrowserId(UUID.randomUUID().toString());
		browserInfo.setCanvasFingerprint("abcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcde1234");
		browserInfo.setName("Chrome");
		browserInfo.setMajorVersion(14);
		browserInfo.setMinorVersion(34);
		browserInfo.setEcmaScriptVersion(12);
		browserInfo.setPlugins(plugins);
		browserInfo.setMimeTypes(mimeTypes);
		//browserInfo.setDeviceId(deviceInfo.getDeviceId());
		//browserInfo.setDeviceInformation(deviceInfo);
		
		browsers.add(browserInfo);
		deviceInfo.setBrowsers(browsers);
		
		//SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		System.out.println("Session created");
		//start transaction
		//Transaction tx = session.beginTransaction();
		
		//Save the Model objects
		//session.save(deviceInfo);
		//session.save(browserInfo);
		//session.save(plugin1);
		//session.save(plugin2);
		//session.save(mime1);
		//session.save(mime2);
		
		//Commit transaction
		//tx.commit();
		IDeviceInformationDao deviceInformationDao = (IDeviceInformationDao)appContext.getBean("deviceInformationDao");
		deviceInformationDao.insertDeviceInformation(deviceInfo);
		DeviceInformation result = deviceInformationDao.getDeviceInformationByDeviceId(deviceInfo.getDeviceId());
		UserRegistrationRequest request = new UserRegistrationRequest();
		request.setEmailId("kratos.chaitanya@gmail.com");
		request.setPhoneNumber("9967345953");
		return result;
	}

}
