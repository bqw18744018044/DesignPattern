package com.bqw.Composite;

public class Leaf implements Component{
    private String name;

    public Leaf(String name){
        this.name = name;
    }

    @Override
    public void add(Component c) {
        // Leaf没有子节点，故不实现该功能；
    }

    @Override
    public void remove(Component c) {
        // Leaf没有子节点，故不实现该功能；
    }

    @Override
    public Component getChild(int i) {
        // Leaf没有子节点，故不实现该功能；
        return null;
    }

    @Override
    public void operation() {
        System.out.println("树叶"+name+"：被访问！");
    }
}
