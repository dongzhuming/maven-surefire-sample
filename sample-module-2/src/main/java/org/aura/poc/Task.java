package org.aura.poc;

/**
 * Created by DongZhuming on 2017/7/31.
 */
public class Task {
    private String name;

    public boolean executable() {
        return name != null;
    }

    public Task() {

    }

    public Task(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
