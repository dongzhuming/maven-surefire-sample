package org.aura.poc;

/**
 * Created by DongZhuming on 2017/7/31.
 */
public class Animal {
    private String name;

    public boolean canFly() {
        return "bird".equals(name);
    }

    public Animal() {

    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
