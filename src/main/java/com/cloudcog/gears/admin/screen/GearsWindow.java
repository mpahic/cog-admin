package com.cloudcog.gears.admin.screen;

import com.cloudcog.gears.admin.controller.admin.AdminScreenController;
import com.vaadin.ui.CustomComponent;

public abstract class GearsWindow extends CustomComponent {
	private static final long serialVersionUID = 8878740278507190978L;

	public abstract void initialize(AdminScreenController adminScreenController, Object item);

}
