package com.company.univercitypractice.web.screens.group;

import com.haulmont.cuba.gui.screen.*;
import com.company.univercitypractice.entity.Group;

@UiController("univercitypractice_Group.edit")
@UiDescriptor("group-edit.xml")
@EditedEntityContainer("groupDc")
@LoadDataBeforeShow
public class GroupEdit extends StandardEditor<Group> {
}