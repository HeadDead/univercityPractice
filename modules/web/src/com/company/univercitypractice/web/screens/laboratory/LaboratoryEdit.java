package com.company.univercitypractice.web.screens.laboratory;

import com.haulmont.cuba.gui.screen.*;
import com.company.univercitypractice.entity.Laboratory;

@UiController("univercitypractice_Laboratory.edit")
@UiDescriptor("laboratory-edit.xml")
@EditedEntityContainer("laboratoryDc")
@LoadDataBeforeShow
public class LaboratoryEdit extends StandardEditor<Laboratory> {
}