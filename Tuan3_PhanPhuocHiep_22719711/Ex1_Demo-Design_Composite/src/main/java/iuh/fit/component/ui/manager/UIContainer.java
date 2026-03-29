package iuh.fit.component.ui.manager;

import java.util.ArrayList;
import java.util.List;

public class UIContainer implements UIComponent {
    private String name;
    private List<UIComponent> children = new ArrayList<>();

    public UIContainer(String name) { this.name = name; }
    public void add(UIComponent c) { children.add(c); }

    @Override
    public void render(String indent) {
        System.out.println(indent + "[ " + name + " ]");
        for (UIComponent c : children) {
            c.render(indent + "   ");
        }
    }
}
