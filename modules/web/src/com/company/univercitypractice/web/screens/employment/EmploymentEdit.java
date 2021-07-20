package com.company.univercitypractice.web.screens.employment;

import com.company.univercitypractice.entity.Teacher;
import com.company.univercitypractice.service.TeacherEmploymentService;
import com.company.univercitypractice.service.ValidationTimeService;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.HasValue;
import com.haulmont.cuba.gui.components.PickerField;
import com.haulmont.cuba.gui.screen.*;
import com.company.univercitypractice.entity.Employment;

import javax.inject.Inject;
import java.time.LocalDateTime;

@UiController("univercitypractice_Employment.edit")
@UiDescriptor("employment-edit.xml")
@EditedEntityContainer("employmentDc")
@LoadDataBeforeShow
public class EmploymentEdit extends StandardEditor<Employment> {

    @Subscribe
    public void onInitEntity(InitEntityEvent<Employment> event) {
        event.getEntity().setDuration(90);

    }
}