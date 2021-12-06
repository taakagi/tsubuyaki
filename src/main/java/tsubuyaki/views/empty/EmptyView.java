package tsubuyaki.views.empty;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

@PageTitle("tsubuyaki")
@Route(value = "empty")
@RouteAlias(value = "")
public class EmptyView extends VerticalLayout {
    
    public EmptyView() {
        VerticalLayout tsubuyaki= new VerticalLayout();
        TextField nameField=new TextField("");
        TextField contextField=new TextField("");
        Button button=new Button("Tsubuyaku");
        button.addClickListener(click->{
            add(new Label(nameField.getValue()+":"+contextField.getValue()));
        });
        add(
            new H1("tsubuyaki"),
            tsubuyaki,
            new HorizontalLayout(
                nameField,
                contextField,
                button
            )
        );
    }
}
