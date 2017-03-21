package com.roger.ui;


import com.roger.model.Todo;
import com.vaadin.data.Binder;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.TextField;
import com.vaadin.ui.themes.ValoTheme;

public class TodoItemLayout extends HorizontalLayout {

    private final CheckBox done;
    private final TextField text;
    private final Binder<Todo> binder;

    public TodoItemLayout(Todo todo) {
        done = new CheckBox();
        text = new TextField();
        text.addStyleName(ValoTheme.TEXTFIELD_BORDERLESS);

        addComponents(done, text);
        addComponentsAndExpand(text);
        setDefaultComponentAlignment(Alignment.MIDDLE_RIGHT);

        binder = new Binder<>(Todo.class);
        binder.bindInstanceFields(this);
        binder.setBean(todo);
    }
}
