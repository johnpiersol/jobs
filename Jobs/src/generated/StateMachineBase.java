/**
 * This class contains generated code from the Codename One Designer, DO NOT MODIFY!
 * This class is designed for subclassing that way the code generator can overwrite it
 * anytime without erasing your changes which should exist in a subclass!
 * For details about this file and how it works please read this blog post:
 * http://codenameone.blogspot.com/2010/10/ui-builder-class-how-to-actually-use.html
*/
package generated;

import com.codename1.ui.*;
import com.codename1.ui.util.*;
import com.codename1.ui.plaf.*;
import java.util.Hashtable;
import com.codename1.ui.events.*;

public abstract class StateMachineBase extends UIBuilder {
    private Container aboutToShowThisContainer;
    /**
     * this method should be used to initialize variables instead of
     * the constructor/class scope to avoid race conditions
     */
    /**
    * @deprecated use the version that accepts a resource as an argument instead
    
**/
    protected void initVars() {}

    protected void initVars(Resources res) {}

    public StateMachineBase(Resources res, String resPath, boolean loadTheme) {
        startApp(res, resPath, loadTheme);
    }

    public Container startApp(Resources res, String resPath, boolean loadTheme) {
        initVars();
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("ComponentGroup", com.codename1.ui.ComponentGroup.class);
        UIBuilder.registerCustomComponent("MapComponent", com.codename1.maps.MapComponent.class);
        UIBuilder.registerCustomComponent("Tabs", com.codename1.ui.Tabs.class);
        UIBuilder.registerCustomComponent("MultiButton", com.codename1.components.MultiButton.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("MultiList", com.codename1.ui.list.MultiList.class);
        UIBuilder.registerCustomComponent("Label", com.codename1.ui.Label.class);
        UIBuilder.registerCustomComponent("Table", com.codename1.ui.table.Table.class);
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        if(loadTheme) {
            if(res == null) {
                try {
                    if(resPath.endsWith(".res")) {
                        res = Resources.open(resPath);
                        System.out.println("Warning: you should construct the state machine without the .res extension to allow theme overlays");
                    } else {
                        res = Resources.openLayered(resPath);
                    }
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        if(res != null) {
            setResourceFilePath(resPath);
            setResourceFile(res);
            initVars(res);
            return showForm(getFirstFormName(), null);
        } else {
            Form f = (Form)createContainer(resPath, getFirstFormName());
            initVars(fetchResourceFile());
            beforeShow(f);
            f.show();
            postShow(f);
            return f;
        }
    }

    protected String getFirstFormName() {
        return "Main";
    }

    public Container createWidget(Resources res, String resPath, boolean loadTheme) {
        initVars();
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("ComponentGroup", com.codename1.ui.ComponentGroup.class);
        UIBuilder.registerCustomComponent("MapComponent", com.codename1.maps.MapComponent.class);
        UIBuilder.registerCustomComponent("Tabs", com.codename1.ui.Tabs.class);
        UIBuilder.registerCustomComponent("MultiButton", com.codename1.components.MultiButton.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("MultiList", com.codename1.ui.list.MultiList.class);
        UIBuilder.registerCustomComponent("Label", com.codename1.ui.Label.class);
        UIBuilder.registerCustomComponent("Table", com.codename1.ui.table.Table.class);
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        if(loadTheme) {
            if(res == null) {
                try {
                    res = Resources.openLayered(resPath);
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        return createContainer(resPath, "Main");
    }

    protected void initTheme(Resources res) {
            String[] themes = res.getThemeResourceNames();
            if(themes != null && themes.length > 0) {
                UIManager.getInstance().setThemeProps(res.getTheme(themes[0]));
            }
    }

    public StateMachineBase() {
    }

    public StateMachineBase(String resPath) {
        this(null, resPath, true);
    }

    public StateMachineBase(Resources res) {
        this(res, null, true);
    }

    public StateMachineBase(String resPath, boolean loadTheme) {
        this(null, resPath, loadTheme);
    }

    public StateMachineBase(Resources res, boolean loadTheme) {
        this(res, null, loadTheme);
    }

    public com.codename1.ui.ComponentGroup findComponentGroup1(Component root) {
        return (com.codename1.ui.ComponentGroup)findByName("ComponentGroup1", root);
    }

    public com.codename1.ui.ComponentGroup findComponentGroup1() {
        com.codename1.ui.ComponentGroup cmp = (com.codename1.ui.ComponentGroup)findByName("ComponentGroup1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.ComponentGroup)findByName("ComponentGroup1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.maps.MapComponent findMapComponent(Component root) {
        return (com.codename1.maps.MapComponent)findByName("MapComponent", root);
    }

    public com.codename1.maps.MapComponent findMapComponent() {
        com.codename1.maps.MapComponent cmp = (com.codename1.maps.MapComponent)findByName("MapComponent", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.maps.MapComponent)findByName("MapComponent", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findMessagesTab(Component root) {
        return (com.codename1.ui.Container)findByName("MessagesTab", root);
    }

    public com.codename1.ui.Container findMessagesTab() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("MessagesTab", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("MessagesTab", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findCampaignsTitle(Component root) {
        return (com.codename1.ui.Label)findByName("CampaignsTitle", root);
    }

    public com.codename1.ui.Label findCampaignsTitle() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("CampaignsTitle", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("CampaignsTitle", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.table.Table findCampaignsTable(Component root) {
        return (com.codename1.ui.table.Table)findByName("CampaignsTable", root);
    }

    public com.codename1.ui.table.Table findCampaignsTable() {
        com.codename1.ui.table.Table cmp = (com.codename1.ui.table.Table)findByName("CampaignsTable", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.table.Table)findByName("CampaignsTable", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Tabs findJobsAppTabs(Component root) {
        return (com.codename1.ui.Tabs)findByName("JobsAppTabs", root);
    }

    public com.codename1.ui.Tabs findJobsAppTabs() {
        com.codename1.ui.Tabs cmp = (com.codename1.ui.Tabs)findByName("JobsAppTabs", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Tabs)findByName("JobsAppTabs", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findNumbersTab(Component root) {
        return (com.codename1.ui.Container)findByName("NumbersTab", root);
    }

    public com.codename1.ui.Container findNumbersTab() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("NumbersTab", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("NumbersTab", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.list.MultiList findCampaignsList(Component root) {
        return (com.codename1.ui.list.MultiList)findByName("CampaignsList", root);
    }

    public com.codename1.ui.list.MultiList findCampaignsList() {
        com.codename1.ui.list.MultiList cmp = (com.codename1.ui.list.MultiList)findByName("CampaignsList", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.list.MultiList)findByName("CampaignsList", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findCampaignsTab(Component root) {
        return (com.codename1.ui.Container)findByName("CampaignsTab", root);
    }

    public com.codename1.ui.Container findCampaignsTab() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("CampaignsTab", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("CampaignsTab", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel11(Component root) {
        return (com.codename1.ui.Label)findByName("Label11", root);
    }

    public com.codename1.ui.Label findLabel11() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label11", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label11", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findButton(Component root) {
        return (com.codename1.ui.Button)findByName("Button", root);
    }

    public com.codename1.ui.Button findButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Button", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Button", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.ComponentGroup findComponentGroup(Component root) {
        return (com.codename1.ui.ComponentGroup)findByName("ComponentGroup", root);
    }

    public com.codename1.ui.ComponentGroup findComponentGroup() {
        com.codename1.ui.ComponentGroup cmp = (com.codename1.ui.ComponentGroup)findByName("ComponentGroup", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.ComponentGroup)findByName("ComponentGroup", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.MultiButton findMultiButton(Component root) {
        return (com.codename1.components.MultiButton)findByName("MultiButton", root);
    }

    public com.codename1.components.MultiButton findMultiButton() {
        com.codename1.components.MultiButton cmp = (com.codename1.components.MultiButton)findByName("MultiButton", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.MultiButton)findByName("MultiButton", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel1(Component root) {
        return (com.codename1.ui.Label)findByName("Label1", root);
    }

    public com.codename1.ui.Label findLabel1() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.MultiButton findMultiButton1(Component root) {
        return (com.codename1.components.MultiButton)findByName("MultiButton1", root);
    }

    public com.codename1.components.MultiButton findMultiButton1() {
        com.codename1.components.MultiButton cmp = (com.codename1.components.MultiButton)findByName("MultiButton1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.MultiButton)findByName("MultiButton1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.MultiButton findMultiButton4(Component root) {
        return (com.codename1.components.MultiButton)findByName("MultiButton4", root);
    }

    public com.codename1.components.MultiButton findMultiButton4() {
        com.codename1.components.MultiButton cmp = (com.codename1.components.MultiButton)findByName("MultiButton4", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.MultiButton)findByName("MultiButton4", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.MultiButton findFirstButton(Component root) {
        return (com.codename1.components.MultiButton)findByName("FirstButton", root);
    }

    public com.codename1.components.MultiButton findFirstButton() {
        com.codename1.components.MultiButton cmp = (com.codename1.components.MultiButton)findByName("FirstButton", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.MultiButton)findByName("FirstButton", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel(Component root) {
        return (com.codename1.ui.Label)findByName("Label", root);
    }

    public com.codename1.ui.Label findLabel() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.MultiButton findMultiButton3(Component root) {
        return (com.codename1.components.MultiButton)findByName("MultiButton3", root);
    }

    public com.codename1.components.MultiButton findMultiButton3() {
        com.codename1.components.MultiButton cmp = (com.codename1.components.MultiButton)findByName("MultiButton3", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.MultiButton)findByName("MultiButton3", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findAccountTab(Component root) {
        return (com.codename1.ui.Container)findByName("AccountTab", root);
    }

    public com.codename1.ui.Container findAccountTab() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("AccountTab", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("AccountTab", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.ComponentGroup findComponentGroup2(Component root) {
        return (com.codename1.ui.ComponentGroup)findByName("ComponentGroup2", root);
    }

    public com.codename1.ui.ComponentGroup findComponentGroup2() {
        com.codename1.ui.ComponentGroup cmp = (com.codename1.ui.ComponentGroup)findByName("ComponentGroup2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.ComponentGroup)findByName("ComponentGroup2", aboutToShowThisContainer);
        }
        return cmp;
    }

    protected void exitForm(Form f) {
        if("Main".equals(f.getName())) {
            exitMain(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void exitMain(Form f) {
    }

    protected void beforeShow(Form f) {
    aboutToShowThisContainer = f;
        if("Main".equals(f.getName())) {
            beforeMain(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void beforeMain(Form f) {
    }

    protected void beforeShowContainer(Container c) {
        aboutToShowThisContainer = c;
        if("Main".equals(c.getName())) {
            beforeContainerMain(c);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void beforeContainerMain(Container c) {
    }

    protected void postShow(Form f) {
        if("Main".equals(f.getName())) {
            postMain(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void postMain(Form f) {
    }

    protected void postShowContainer(Container c) {
        if("Main".equals(c.getName())) {
            postContainerMain(c);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void postContainerMain(Container c) {
    }

    protected void onCreateRoot(String rootName) {
        if("Main".equals(rootName)) {
            onCreateMain();
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void onCreateMain() {
    }

    protected Hashtable getFormState(Form f) {
        Hashtable h = super.getFormState(f);
        if("Main".equals(f.getName())) {
            getStateMain(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

            return h;
    }


    protected void getStateMain(Form f, Hashtable h) {
    }

    protected void setFormState(Form f, Hashtable state) {
        super.setFormState(f, state);
        if("Main".equals(f.getName())) {
            setStateMain(f, state);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void setStateMain(Form f, Hashtable state) {
    }

    protected boolean setListModel(List cmp) {
//        String listName = cmp.getName();
//        if("CampaignsList".equals(listName)) {
//            return initListModelCampaignsList(cmp);
//        }
        return super.setListModel(cmp);
    }

    protected boolean initListModelCampaignsList(List cmp) {
        return false;
    }

    protected void handleComponentAction(Component c, ActionEvent event) {
        Container rootContainerAncestor = getRootAncestor(c);
        if(rootContainerAncestor == null) return;
        String rootContainerName = rootContainerAncestor.getName();
        Container leadParentContainer = c.getParent().getLeadParent();
        if(leadParentContainer != null && leadParentContainer.getClass() != Container.class) {
            c = c.getParent().getLeadParent();
        }
        if(rootContainerName == null) return;
        if(rootContainerName.equals("Main")) {
            if("CampaignsList".equals(c.getName())) {
                onMain_CampaignsListAction(c, event);
                return;
            }
            if("MultiButton".equals(c.getName())) {
                onMain_MultiButtonAction(c, event);
                return;
            }
            if("Button".equals(c.getName())) {
                onMain_ButtonAction(c, event);
                return;
            }
            if("FirstButton".equals(c.getName())) {
                onMain_FirstButtonAction(c, event);
                return;
            }
            if("MultiButton4".equals(c.getName())) {
                onMain_MultiButton4Action(c, event);
                return;
            }
            if("MultiButton1".equals(c.getName())) {
                onMain_MultiButton1Action(c, event);
                return;
            }
            if("MultiButton3".equals(c.getName())) {
                onMain_MultiButton3Action(c, event);
                return;
            }
        }
    }

      protected void onMain_CampaignsListAction(Component c, ActionEvent event) {
      }

      protected void onMain_MultiButtonAction(Component c, ActionEvent event) {
      }

      protected void onMain_ButtonAction(Component c, ActionEvent event) {
      }

      protected void onMain_FirstButtonAction(Component c, ActionEvent event) {
      }

      protected void onMain_MultiButton4Action(Component c, ActionEvent event) {
      }

      protected void onMain_MultiButton1Action(Component c, ActionEvent event) {
      }

      protected void onMain_MultiButton3Action(Component c, ActionEvent event) {
      }

}
