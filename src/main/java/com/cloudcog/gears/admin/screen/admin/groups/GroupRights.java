package com.cloudcog.gears.admin.screen.admin.groups;

import javax.jcr.RepositoryException;

import com.cloudcog.gears.admin.user.GearsGroup;
import com.vaadin.ui.Panel;

public class GroupRights extends Panel {

	public GroupRights(GearsGroup group) {

		try {
			group.getPermissions();
		} catch (RepositoryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
