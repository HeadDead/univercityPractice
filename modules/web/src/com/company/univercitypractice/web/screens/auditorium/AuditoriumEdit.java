package com.company.univercitypractice.web.screens.auditorium;

import com.haulmont.cuba.gui.screen.*;
import com.company.univercitypractice.entity.Auditorium;

@UiController("univercitypractice_Auditorium.edit")
@UiDescriptor("auditorium-edit.xml")
@EditedEntityContainer("auditoriumDc")
@LoadDataBeforeShow
public class AuditoriumEdit extends StandardEditor<Auditorium> {
}