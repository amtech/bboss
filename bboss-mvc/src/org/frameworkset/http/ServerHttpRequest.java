/*
 *  Copyright 2008-2010 biaoping.yin
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
package org.frameworkset.http;

import java.net.InetSocketAddress;
import java.net.URI;
import java.security.Principal;

import org.frameworkset.util.annotations.HttpMethod;

 

/**
 * <p>Title: ServerHttpRequest.java</p> 
 * <p>Description: </p>
 * <p>bboss workgroup</p>
 * <p>Copyright (c) 2008</p>
 * @Date 2010-11-22
 * @author biaoping.yin
 * @version 1.0
 */
public interface ServerHttpRequest  extends HttpRequest,  HttpInputMessage {

	public static final String JSONPCALLBACK_PARAM_NAME = "jsonp_callback";
	/**
	 * Return the HTTP method of the request.
	 * @return the HTTP method as an HttpMethod enum value
	 */
	HttpMethod getMethod();

	/**
	 * Return the URI of the request.
	 * @return the URI of the request
	 */
	URI getURI();
	/**
	 * Return a {@link java.security.Principal} instance containing the name of the
	 * authenticated user. If the user has not been authenticated, the method returns
	 * <code>null</code>.
	 */
	Principal getPrincipal();
	

	/**
	 * Return the address on which the request was received.
	 */
	InetSocketAddress getLocalAddress();

	/**
	 * Return the address of the remote client.
	 */
	InetSocketAddress getRemoteAddress();

	/**
	 * Return a control that allows putting the request in asynchronous mode so the
	 * response remains open until closed explicitly from the current or another thread.
	 */
	ServerHttpAsyncRequestControl getAsyncRequestControl(ServerHttpResponse response);

}
