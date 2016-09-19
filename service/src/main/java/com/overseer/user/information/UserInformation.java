package com.overseer.user.information;

import java.util.Date;
import java.util.List;

import com.overseer.device.DeviceInformation;

public class UserInformation {
	private String uuid;
	private String emailAddress;
	private List<PhoneNumber> phoneNumbers;
	private int passwordRejectionCount;
	private UserStatus userStatus;
	private String firstName;
	private String lastName;
	private String middleName;
	private String uniqueIdentifierType;
	private String uniqueIdentifier;
	private Gender gender;
	private List<Address> addresses;
	private Date dateOfBirth;
	private Date registrationTimestamp;
	private Date lastLoginTimestamp;
	private Date lastPasswordUpdateTimestamp;
	private DeviceInformation registrationDevice;

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public List<PhoneNumber> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public int getPasswordRejectionCount() {
		return passwordRejectionCount;
	}

	public void setPasswordRejectionCount(int passwordRejectionCount) {
		this.passwordRejectionCount = passwordRejectionCount;
	}

	public UserStatus getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(UserStatus userStatus) {
		this.userStatus = userStatus;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getUniqueIdentifierType() {
		return uniqueIdentifierType;
	}

	public void setUniqueIdentifierType(String uniqueIdentifierType) {
		this.uniqueIdentifierType = uniqueIdentifierType;
	}

	public String getUniqueIdentifier() {
		return uniqueIdentifier;
	}

	public void setUniqueIdentifier(String uniqueIdentifier) {
		this.uniqueIdentifier = uniqueIdentifier;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Date getRegistrationTimestamp() {
		return registrationTimestamp;
	}

	public void setRegistrationTimestamp(Date registrationTimestamp) {
		this.registrationTimestamp = registrationTimestamp;
	}

	public Date getLastLoginTimestamp() {
		return lastLoginTimestamp;
	}

	public void setLastLoginTimestamp(Date lastLoginTimestamp) {
		this.lastLoginTimestamp = lastLoginTimestamp;
	}

	public Date getLastPasswordUpdateTimestamp() {
		return lastPasswordUpdateTimestamp;
	}

	public void setLastPasswordUpdateTimestamp(Date lastPasswordUpdateTimestamp) {
		this.lastPasswordUpdateTimestamp = lastPasswordUpdateTimestamp;
	}

	public DeviceInformation getRegistrationDevice() {
		return registrationDevice;
	}

	public void setRegistrationDevice(DeviceInformation registrationDevice) {
		this.registrationDevice = registrationDevice;
	}

}
