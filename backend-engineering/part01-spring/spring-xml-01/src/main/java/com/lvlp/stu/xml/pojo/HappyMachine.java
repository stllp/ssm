package com.lvlp.stu.xml.pojo;

public class HappyMachine {
    private String machineName;

    public String getMachineName() {
        return machineName;
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

    @Override
    public String toString() {
        return "HappyMachine{" +
                "machineName='" + machineName + '\'' +
                '}';
    }
}
