package com.company.univercitypractice.web.screens.employment;

import com.company.univercitypractice.service.ValidationTimeService;
import com.haulmont.cuba.gui.screen.*;
import com.company.univercitypractice.entity.Employment;

import javax.inject.Inject;

@UiController("univercitypractice_Employment.browse")
@UiDescriptor("employment-browse.xml")
@LookupComponent("employmentsTable")
@LoadDataBeforeShow
public class EmploymentBrowse extends StandardLookup<Employment> {

}