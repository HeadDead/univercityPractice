package com.company.univercitypractice.web.screens.employment;

import com.haulmont.cuba.gui.screen.*;
import com.company.univercitypractice.entity.Employment;

@UiController("univercitypractice_Employment.browse")
@UiDescriptor("employment-browse.xml")
@LookupComponent("employmentsTable")
@LoadDataBeforeShow
public class EmploymentBrowse extends StandardLookup<Employment> {
}