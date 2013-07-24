/**
 *  Catroid: An on-device visual programming system for Android devices
 *  Copyright (C) 2010-2013 The Catrobat Team
 *  (<http://developer.catrobat.org/credits>)
 *  
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Affero General Public License as
 *  published by the Free Software Foundation, either version 3 of the
 *  License, or (at your option) any later version.
 *  
 *  An additional term exception under section 7 of the GNU Affero
 *  General Public License, version 3, is available at
 *  http://developer.catrobat.org/license_additional_term
 *  
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *  GNU Affero General Public License for more details.
 *  
 *  You should have received a copy of the GNU Affero General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.catrobat.catroid.content;

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class XmlHeader implements Serializable {

	private static final long serialVersionUID = 1L;

	private String programName;
	private String description;

	@XStreamAlias("screenWidth")
	private int virtualScreenWidth;
	@XStreamAlias("screenHeight")
	private int virtualScreenHeight;

	private float catrobatLanguageVersion;

	private String applicationBuildName;
	private int applicationBuildNumber;
	private String applicationName;
	private String applicationVersion;
	private String dateTimeUpload;
	private String deviceName;
	private String mediaLicense;
	private String platform;
	private int platformVersion;
	private String programLicense;
	private String remixOf;
	private String tags;
	private String url;
	private String userHandle;

	public XmlHeader() {
		programName = "";
		description = "";

		virtualScreenWidth = 0;
		virtualScreenHeight = 0;

		catrobatLanguageVersion = (float) 0.8;

		applicationBuildName = "";
		applicationBuildNumber = 0;
		applicationName = "";
		applicationVersion = "";
		dateTimeUpload = "";
		deviceName = "";
		mediaLicense = "";
		platform = "";
		platformVersion = 0;
		programLicense = "";
		remixOf = "";
		tags = "";
		url = "";
		userHandle = "";
	}

	public String getProgramName() {
		return programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getVirtualScreenWidth() {
		return virtualScreenWidth;
	}

	public void setVirtualScreenWidth(int virtualScreenWidth) {
		this.virtualScreenWidth = virtualScreenWidth;
	}

	public int getVirtualScreenHeight() {
		return virtualScreenHeight;
	}

	public void setVirtualScreenHeight(int virtualScreenHeight) {
		this.virtualScreenHeight = virtualScreenHeight;
	}

	public float getCatrobatLanguageVersion() {
		return catrobatLanguageVersion;
	}

	public void setCatrobatLanguageVersion(float catrobatLanguageVersion) {
		this.catrobatLanguageVersion = catrobatLanguageVersion;
	}

	public String getApplicationBuildName() {
		return applicationBuildName;
	}

	public void setApplicationBuildName(String applicationBuildName) {
		this.applicationBuildName = applicationBuildName;
	}

	public int getApplicationBuildNumber() {
		return applicationBuildNumber;
	}

	public void setApplicationBuildNumber(int applicationBuildNumber) {
		this.applicationBuildNumber = applicationBuildNumber;
	}

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public String getApplicationVersion() {
		return applicationVersion;
	}

	public void setApplicationVersion(String applicationVersion) {
		this.applicationVersion = applicationVersion;
	}

	public String getDateTimeUpload() {
		return dateTimeUpload;
	}

	public void setDateTimeUpload(String dateTimeUpload) {
		this.dateTimeUpload = dateTimeUpload;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getMediaLicense() {
		return mediaLicense;
	}

	public void setMediaLicense(String mediaLicense) {
		this.mediaLicense = mediaLicense;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public int getPlatformVersion() {
		return platformVersion;
	}

	public void setPlatformVersion(int platformVersion) {
		this.platformVersion = platformVersion;
	}

	public String getProgramLicense() {
		return programLicense;
	}

	public void setProgramLicense(String programLicense) {
		this.programLicense = programLicense;
	}

	public String getRemixOf() {
		return remixOf;
	}

	public void setRemixOf(String remixOf) {
		this.remixOf = remixOf;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUserHandle() {
		return userHandle;
	}

	public void setUserHandle(String userHandle) {
		this.userHandle = userHandle;
	}

	public boolean equals(XmlHeader arg) {
		return (programName.equals(arg.programName)
				&& description.equals(arg.description)
				&& virtualScreenHeight == arg.virtualScreenHeight
				&& virtualScreenWidth == arg.virtualScreenWidth
				&& catrobatLanguageVersion == arg.catrobatLanguageVersion
				&& applicationBuildName.equals(arg.applicationBuildName)
				&& applicationBuildNumber == arg.applicationBuildNumber
				&& applicationName.equals(arg.applicationName)
				&& applicationVersion.equals(arg.applicationVersion)
				&& dateTimeUpload.equals(arg.dateTimeUpload)
				&& deviceName.equals(arg.deviceName)
				&& mediaLicense.equals(arg.mediaLicense)
				&& platform.equals(arg.platform)
				&& platformVersion == arg.platformVersion
				&& programLicense.equals(arg.programLicense)
				&& remixOf.equals(arg.remixOf) 
				&& tags.equals(arg.tags)
				&& url.equals(arg.url) 
				&& userHandle.equals(arg.userHandle));
	}
}
