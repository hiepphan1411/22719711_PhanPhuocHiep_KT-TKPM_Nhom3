package iuh.fit.component.ui.manager;

public class TextBox implements UIComponent {
    private String placeholder;
    public TextBox(String placeholder) { this.placeholder = placeholder; }

    @Override
    public void render(String indent) {
        System.out.println(indent + "[TextBox: " + placeholder + "]");
    }
}