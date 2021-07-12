package com.company.univercitypractice.web.screens.laboratory;

import com.haulmont.cuba.gui.screen.*;
import com.company.univercitypractice.entity.Laboratory;

@UiController("univercitypractice_Laboratory.browse")
@UiDescriptor("laboratory-browse.xml")
@LookupComponent("laboratoriesTable")
@LoadDataBeforeShow
public class LaboratoryBrowse extends StandardLookup<Laboratory> {
}