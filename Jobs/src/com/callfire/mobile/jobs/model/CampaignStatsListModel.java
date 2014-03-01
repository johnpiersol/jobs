/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package com.callfire.mobile.jobs.model;

import com.codename1.ui.list.DefaultListModel;
import java.util.Hashtable;

/**
 *
 * @author johnp
 */
public class CampaignStatsListModel extends DefaultListModel {

	public Hashtable addCampaignStats(String name, String status, String progress) {
		Hashtable row = new Hashtable();
		row.put("Name", name);
		row.put("Status", status);
		row.put("Progress", progress);
		addItem(row);
		return row;
	}
}
