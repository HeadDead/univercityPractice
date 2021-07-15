package com.company.univercitypractice.web.screens.employment;

import com.haulmont.cuba.gui.screen.*;
import com.company.univercitypractice.entity.Employment;

@UiController("univercitypractice_Employment.edit")
@UiDescriptor("employment-edit.xml")
@EditedEntityContainer("employmentDc")
@LoadDataBeforeShow
public class EmploymentEdit extends StandardEditor<Employment> {
}