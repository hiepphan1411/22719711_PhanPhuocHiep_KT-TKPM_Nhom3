package iuh.fit.file.manager;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> children = new ArrayList<>();

    public Directory(String name) { this.name = name; }

    public void add(FileSystemComponent c) { children.add(c); }
    public void remove(FileSystemComponent c) { children.remove(c); }

    @Override
    public void show(String indent) {
        System.out.println(indent + "File: " + name + " (" + getSize() + " KB)");
        for (FileSystemComponent c : children) {
            c.show(indent + "   ");
        }
    }

    @Override
    public int getSize() {
        return children.stream().mapToInt(FileSystemComponent::getSize).sum();
    }
}
