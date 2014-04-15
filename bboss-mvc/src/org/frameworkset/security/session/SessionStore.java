/*
 *  Copyright 2008 bbossgroups
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.frameworkset.security.session;

import java.util.Enumeration;

/**
 * <p>Title: SessionStore.java</p> 
 * <p>Description: </p>
 * <p>bboss workgroup</p>
 * <p>Copyright (c) 2008</p>
 * @Date 2014年4月15日
 * @author biaoping.yin
 * @version 3.8.0
 */
public interface SessionStore {

	void destory();

	void livecheck();
	
	Session createSession(Object source);

	Object getAttribute(String sessionID, String attribute);

	Enumeration getAttributeNames(String sessionID);

	void updateLastAccessedTime(String sessionID, long lastAccessedTime);

	long getLastAccessedTime(String sessionID);

	String[] getValueNames(String sessionID);

	void invalidate(String sessionID);

	boolean isNew(String sessionID);

	void removeAttribute(String sessionID, String attribute);

	void addAttribute(String sessionID, String attribute, Object value);
	

}
