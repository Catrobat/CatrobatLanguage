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

	public String programName;
	public String description;

	@XStreamAlias("screenWidth")
	public int virtualScreenWidth = 0;
	@XStreamAlias("screenHeight")
	public int virtualScreenHeight = 0;

	public float catrobatLanguageVersion;

	public String applicationBuildName = "";
	public int applicationBuildNumber = 0;
	public String applicationName = "";
	public String applicationVersion = "";
	public String dateTimeUpload = "";
	public String deviceName = "";
	public String mediaLicense = "";
	public String platform = "";
	public int platformVersion = 0;
	public String programLicense = "";
	public String remixOf = "";
	public String tags = "";
	public String url = "";
	public String userHandle = "";
}
