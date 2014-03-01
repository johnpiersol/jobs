/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.callfire.mobile.jobs.rest;

import com.callfire.mobile.jobs.model.CampaignStats;
import com.codename1.components.InfiniteProgress;
import com.codename1.io.ConnectionRequest;
import com.codename1.io.JSONParser;
import com.codename1.io.NetworkManager;
import com.codename1.ui.Dialog;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author johnp
 */
public class CallFireClient {
	private static final String BROADCAST_PATH = "/broadcast.json";
	private static final String BROADCAST_STATS_PATH = "/broadcast/{id}/stats.json";
	
	public void getBroadcasts(int count, CallBack callback) {	
		System.out.println("getBroadcasts");
		sendRequest(new CallFireRequest(BROADCAST_PATH + "?MaxResults" + count, callback, false));
	}
	
	public void getBroadcastStats(List<Long> campaignIds, CallBack callback) {
		System.out.println("getBroadcastStats");
		for (Long campaignId : campaignIds) {
//			CharSequence a = "{id}";
//			CharSequence b = String.valueOf(campaignId);
			String path = BROADCAST_STATS_PATH;
			sendRequest(new CallFireRequest(path, callback, false));
		}
	}
	
	private void sendRequest(ConnectionRequest request) {
		InfiniteProgress progress = new InfiniteProgress();
		Dialog progressDialog = progress.showInifiniteBlocking();
		request.setDisposeOnCompletion(progressDialog);
		NetworkManager.getInstance().addToQueueAndWait(request);
	}
}
