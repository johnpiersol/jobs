/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.callfire.mobile.jobs.rest;

import com.codename1.io.ConnectionRequest;
import com.codename1.io.JSONParser;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Hashtable;

/**
 *
 * @author johnp
 */
public class CallFireRequest extends ConnectionRequest {
	private static final String BASE_URL = "https://www.callfire.com/api/1.1/rest";
//	private static final String CAMPAIGNS_PATH = "/broadcast.json";
	// Seans api access.
	private static final String USER = "f177e92514d1";
	private static final String PASSWORD = "127264b0c6709c68";
	/** Basic username:password with f177e92514d1:127264b0c6709c68 encoded. http://www.base64encode.org/ */
	private static final String BASIC_AUTH = "Basic ZjE3N2U5MjUxNGQxOjEyNzI2NGIwYzY3MDljNjg=";
			
	private Hashtable response;
	private CallBack callback;
			
	public CallFireRequest(String path, final CallBack callback, boolean post) {
		this.callback = callback;
		if (!path.startsWith("/")) {
			path = "/" + path;
		}
		setUrl(BASE_URL + path);
		setPost(post);
		addRequestHeader("Authorization", BASIC_AUTH);
		addResponseListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				System.err.println("ActionPerformed evt: " + evt);
			}
		});
	}
			
	protected void readResponse(InputStream input) throws IOException {
		System.out.println("readResponse");
		JSONParser parser = new JSONParser();
		response = parser.parse(new InputStreamReader(input));
//		XMLParser parser = new XMLParser();
//		response = parser.parse(new InputStreamReader(input));
		//System.out.println("response: " + response);
	}

	protected void postResponse() {
		//System.out.println("postResponse: " + response);
		callback.onEvent(response);
		
//		Hashtable resourceList = (Hashtable) response.get("ResourceList");
//		Vector broadcasts = (Vector) resourceList.get("Broadcast");
//		for (Object element :  broadcasts) {
//			Hashtable broadcast = (Hashtable) element;
//			Object id = broadcast.get("@id");
//			System.err.println("broadcast(" + id + ": " + broadcast);
//		}
//
//		//InputStreamReader reader = new InputStreamReader(input);
//		//Util.copy(input, System.out);
	}
}
