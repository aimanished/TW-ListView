package com.myapplicationdev.android.tw_listview;

public class Modules {
    private String modulesCode;
    private boolean programming;

    public Modules(String modulesCode, boolean programming) {
        this.modulesCode = modulesCode;
        this.programming = programming;
    }

    public String getModulesCode() {
        return modulesCode;
    }

    public void setModulesCode(String modulesCode) {
        this.modulesCode = modulesCode;
    }

    public boolean isProgramming() {
        return programming;
    }

    public void setProgramming(boolean programming) {
        this.programming = programming;
    }

}
