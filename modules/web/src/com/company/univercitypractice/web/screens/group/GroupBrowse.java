package com.company.univercitypractice.web.screens.group;

import com.haulmont.cuba.gui.screen.*;
import com.company.univercitypractice.entity.Group;

@UiController("univercitypractice_Group.browse")
@UiDescriptor("group-browse.xml")
@LookupComponent("groupsTable")
@LoadDataBeforeShow
public class GroupBrowse extends StandardLookup<Group> {
}