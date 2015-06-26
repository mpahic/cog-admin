package com.cloudcog.gears.admin.screen.admin;

import com.cloudcog.gears.admin.controller.admin.AdminScreenController;
import com.cloudcog.gears.admin.screen.mainPanel.MainPanel;
import com.cloudcog.gears.admin.user.GearsUser;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalSplitPanel;
import com.vaadin.ui.themes.ChameleonTheme;

public class AdminMainScreen extends Panel {
	private static final long serialVersionUID = 3759775199439170610L;

	private VerticalSplitPanel vsp = new VerticalSplitPanel();
	private HorizontalSplitPanel hsp;

	private MainPanel mainPanel;

	public AdminMainScreen(AdminScreenController adminScreenController) {
		init();
		this.mainPanel = new MainPanel(adminScreenController);
	}

	private void init() {
		this.setSizeFull();
		vsp.setSplitPosition(80, Unit.PIXELS);
		vsp.setLocked(true);
		vsp.setStyleName(ChameleonTheme.SPLITPANEL_SMALL);
		this.setContent(vsp);
	}

	public void setHeader(Component panel) {
		vsp.setFirstComponent(panel);

	}

	public void setSideScreen(Component panel) {

		if (hsp == null) {
			hsp = new HorizontalSplitPanel();
			hsp.setSplitPosition(250, Unit.PIXELS);
			hsp.setSecondComponent(this.mainPanel);

			vsp.setSecondComponent(hsp);
		}

		hsp.setFirstComponent(panel);
	}

	public void addPanelScreen(AdminScreenController adminScreenController, Object data) {
		mainPanel.addTab(adminScreenController, data);
	}

	public void addNewPanelScreen(AdminScreenController adminScreenController, Class<GearsUser> objectClass) {
		mainPanel.addNewTab(adminScreenController, objectClass);

	}

}
