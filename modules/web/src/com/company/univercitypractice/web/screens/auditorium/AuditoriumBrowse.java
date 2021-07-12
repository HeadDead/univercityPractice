package com.company.univercitypractice.web.screens.auditorium;

import com.haulmont.cuba.gui.screen.*;
import com.company.univercitypractice.entity.Auditorium;

@UiController("univercitypractice_Auditorium.browse")
@UiDescriptor("auditorium-browse.xml")
@LookupComponent("auditoriumsTable")
@LoadDataBeforeShow
public class AuditoriumBrowse extends StandardLookup<Auditorium> {
}