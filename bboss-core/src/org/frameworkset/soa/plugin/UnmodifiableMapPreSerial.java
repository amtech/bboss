/*
 *  Copyright 2008 biaoping.yin
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

package org.frameworkset.soa.plugin;

import java.util.Collections;
import java.util.Map;

import org.frameworkset.soa.PreSerial;
import org.frameworkset.util.ClassUtil;
import org.frameworkset.util.ClassUtil.ClassInfo;

/**
 * <p>Title: UnmodifyListPreSerial.java</p> 
 * <p>Description: java.util.Collections$UnmodifiableList serializable</p>
 * <p>bboss workgroup</p>
 * <p>Copyright (c) 2007</p>
 * @Date 2014年8月8日 上午9:55:51
 * @author biaoping.yin
 * @version 1.0
 */
public class UnmodifiableMapPreSerial implements PreSerial<Map> {
	private static final String clazz = "java.util.Collections$UnmodifiableMap";
	private static  ClassInfo unmodify;
	static {
		
		try {
			unmodify = ClassUtil.getClassInfo(Class.forName(clazz));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			unmodify = null;
		}
	}
	public UnmodifiableMapPreSerial() {
		
	}

	public Map prehandle(Map object) {
		
		return (Map)unmodify.getPropertyValue(object, "m");
	}

	public Map posthandle(Map object) {
		if(object == null)
			return null;
		return Collections.unmodifiableMap(object);
	}
	public String getClazz() {
		// TODO Auto-generated method stub
		return this.clazz;
	}

	public String getVClazz() {
		// TODO Auto-generated method stub
		return null;
	}
}
