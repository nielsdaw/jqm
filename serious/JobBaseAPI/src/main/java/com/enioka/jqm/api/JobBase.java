/**
 * Copyright � 2013 enioka. All rights reserved
 * Authors: Pierre COPPEE (pierre.coppee@enioka.com)
 * Contributors : Marc-Antoine GOUILLART (marc-antoine.gouillart@enioka.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.enioka.jqm.api;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.enioka.jqm.jpamodel.JobInstance;
import com.enioka.jqm.temp.DeliverableStruct;
import com.enioka.jqm.tools.Cryptonite;

/**
 * 
 * @author Pierre COPPEE <pierre.coppee@enioka.com>
 */
public class JobBase {

	protected int parentID;
	protected int canBeRestart;
	protected String applicationName;
	protected String sessionID;
	protected String application;
	protected String module;
	protected String other1;
	protected String other2;
	protected String other3;
	protected Map<String, String> parameters = new HashMap<String, String>();
	protected ArrayList<DeliverableStruct> sha1s = new ArrayList<DeliverableStruct>();

	public void setParams(JobInstance j) {

		// this.parameters = j.getJd().getParameters();
		this.start();
	}

	public void start() {

	}

	public void stop() {

	}

	public void addDeliverable(String path, String fileLabel) {

		try {
			System.out.println("ajout du livrable dans la liste");
			this.sha1s.add(new DeliverableStruct(path, Cryptonite.sha1(path), fileLabel));
		} catch (NoSuchAlgorithmException e) {

			e.printStackTrace();
		}

		System.out.println("size sha1s: " + this.sha1s.size());
	}

	public void sendMsg(String msg) {

	}

	// ---------

	public int getParentID() {

		return parentID;
	}

	public void setParentID(int parentID) {

		this.parentID = parentID;
	}

	public int getCanBeRestart() {

		return canBeRestart;
	}

	public void setCanBeRestart(int canBeRestart) {

		this.canBeRestart = canBeRestart;
	}

	public String getApplicationName() {

		return applicationName;
	}

	public void setApplicationName(String applicationName) {

		this.applicationName = applicationName;
	}

	public String getSessionID() {

		return sessionID;
	}

	public void setSessionID(String sessionID) {

		this.sessionID = sessionID;
	}

	public String getApplication() {

		return application;
	}

	public void setApplication(String application) {

		this.application = application;
	}

	public String getModule() {

		return module;
	}

	public void setModule(String module) {

		this.module = module;
	}

	public String getOther1() {

		return other1;
	}

	public void setOther1(String other1) {

		this.other1 = other1;
	}

	public String getOther2() {

		return other2;
	}

	public void setOther2(String other2) {

		this.other2 = other2;
	}

	public String getOther3() {

		return other3;
	}

	public void setOther3(String other3) {

		this.other3 = other3;
	}

	public Map<String, String> getParameters() {

		return parameters;
	}

	public void setParameters(Map<String, String> parameters) {

		this.parameters = parameters;
	}

	public ArrayList<DeliverableStruct> getSha1s() {

		return sha1s;
	}

	public void setSha1s(ArrayList<DeliverableStruct> sha1s) {

		this.sha1s = sha1s;
	}

}