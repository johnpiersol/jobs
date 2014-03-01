/**
 * Your application code goes here
 *//**
 * Your application code goes here
 */

package userclasses;

import com.callfire.mobile.jobs.model.CampaignStatsListModel;
import com.callfire.mobile.jobs.rest.CallBack;
import com.callfire.mobile.jobs.rest.CallFireClient;
import generated.StateMachineBase;
import com.codename1.ui.*; 
import com.codename1.ui.events.*;
import com.codename1.ui.table.DefaultTableModel;
import com.codename1.ui.table.Table;
import com.codename1.ui.util.Resources;
import java.util.Hashtable;
import java.util.Vector;

/**
 *
 * @author Your name here
 */
public class StateMachine extends StateMachineBase {
	private CallFireClient callFireClient;
	
    public StateMachine(String resFile) {
        super(resFile);
        // do not modify, write code in initVars and initialize class members there,
        // the constructor might be invoked too late due to race conditions that might occur
    }
    
    /**
     * this method should be used to initialize variables instead of
     * the constructor/class scope to avoid race conditions
     */
    protected void initVars(Resources res) {
		System.out.println("resource: " + res);
//		callFireClient = new CallFireClient();
//		this.findCampaignsList().addPullToRefresh(new Runnable() {
//			@Override public void run() {
//				System.out.println("Twitter pull refresh");
//			}
//		});
    }


//    @Override
//    protected void onMain_MultiButton2Action(Component c, ActionEvent event) {
//		Dialog.show("Testing 1, 3, 5", "Whooo", "OK", null);
//		System.out.println("onMain pressed");
//		TwitterConnectionRequest request = new TwitterConnectionRequest();
//		InfiniteProgress progress = new InfiniteProgress();
//		Dialog progressDialog = progress.showInifiniteBlocking();
//		request.setDisposeOnCompletion(progressDialog);
//		NetworkManager.getInstance().addToQueueAndWait(request);
//    }

    @Override
    protected void beforeMain(Form f) {
    
    }

    @Override
    protected boolean initListModelCampaignsList(List campaignsList) {
		final CampaignStatsListModel model = new CampaignStatsListModel();
		campaignsList.setModel(model);

		callFireClient.getBroadcasts(10, new CallBack() {
			public void onEvent(Hashtable data) {
				Hashtable resourceList = (Hashtable) data.get("ResourceList");
				Vector broadcasts = (Vector) resourceList.get("Broadcast");
				Vector<Long> campaignIds = new Vector<Long>();
				for (Object element :  broadcasts) {
					Hashtable broadcast = (Hashtable) element;
					String name = (String) broadcast.get("Name");
					String status = (String) broadcast.get("Status");
					String type = (String) broadcast.get("Type");
					long id = ((Double) broadcast.get("@id")).longValue();
					campaignIds.add(id);
					//System.err.println("Broadcast id: " + id + ", name: " + name);
					model.addCampaignStats(name, "STATUS", "PROGRESS");
				}
				System.err.println("ids: " + campaignIds);
			}
		});

		return true;
    }

    @Override
    protected void onCreateMain() {
// 		Table campaignsTable = this.findCampaignsTable();
//		if (campaignsTable != null) {
//			String[] names = {"Name", "Status2", "Progress"};
//			Object[][] data = new Object[0][0];
//			campaignsTable.setModel(new DefaultTableModel(names, data));
//		}
    }

    @Override
    protected void postMain(Form f) {
//		System.err.println("postMain");
// 		Table campaignsTable = this.findCampaignsTable();
//		if (campaignsTable != null) {
//			String[] names = {"Name", "Status2", "Progress"};
//			Object[] row1 = {"One", "Two", "Three"};
//			Object[] row2 = {"A", "B", "C"};
//			Object[][] data = { row1, row2 };
//			campaignsTable.setModel(new DefaultTableModel(names, data));
//		}
//		Table campaignsTable = this.findCampaignsTable();
//		
//		String[] names = {"Name", "Status2", "Progress"};
//		Object[][] data = new Object[0][0];
//		campaignsTable.setModel(new DefaultTableModel(names, data));
    }

    @Override
    protected void exitMain(Form f) {
    
    }

//    @Override
//    protected void onCreateJobsApp() {
//    
//    }
//
//    @Override
//    protected void beforeJobsApp(Form f) {
//    
//    }
//
//    @Override
//    protected void exitJobsApp(Form f) {
//    
//    }
//
//    @Override
//    protected void postJobsApp(Form f) {
//    
//    }
}
