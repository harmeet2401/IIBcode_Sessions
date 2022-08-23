package com.learnjava8.bean;

public class Bicycle {
    private String name;
    private String modelname;

    @Override
    public String toString() {
        return "Bicycle{" +
                "name='" + name + '\'' +
                ", modelname='" + modelname + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModelname() {
        return modelname;
    }

    public void setModelname(String modelname) {
        this.modelname = modelname;
    }
}
