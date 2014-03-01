/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.callfire.mobile.jobs.model;

import com.codename1.ui.table.DefaultTableModel;
import java.util.Hashtable;

/**
 *
 * @author johnp
 */
public class CampaignStatsTableModel extends DefaultTableModel {
	
	public CampaignStatsTableModel() {
//		super({"one", "two", "three"}, new Object[0][0]);
		super(null, null);
	}
	
	public Hashtable addCampaignStats(String name, String status, String progress) {
		Hashtable row = new Hashtable();
		row.put("Name", name);
		row.put("Status", status);
		row.put("Progress", progress);
		//addItem(row);
		return row;
	}

}
