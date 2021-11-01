package com.yiibai;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

/**
 * Created by Jack Yao on 2021/10/28 10:13 下午
 */
public class TutorialFieldSetMapper implements FieldSetMapper<Tutorial> {

    @Override
    public Tutorial mapFieldSet(FieldSet fieldSet) throws BindException {
        // instantiating the Tutorial class
        Tutorial tutorial = new Tutorial();

        // Setting the fields from XML
        tutorial.setTutorial_id(fieldSet.readInt(0));
        tutorial.setTutorial_title(fieldSet.readString(1));
        tutorial.setTutorial_author(fieldSet.readString(2));
        tutorial.setTutorial_icon(fieldSet.readString(3));
        tutorial.setTutorial_description(fieldSet.readString(4));
        return tutorial;
    }
}
