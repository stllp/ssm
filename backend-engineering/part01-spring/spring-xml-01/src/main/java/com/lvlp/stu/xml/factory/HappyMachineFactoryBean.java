package com.lvlp.stu.xml.factory;

import com.lvlp.stu.xml.pojo.HappyMachine;
import org.springframework.beans.factory.FactoryBean;

public class HappyMachineFactoryBean implements FactoryBean<HappyMachine> {
    private String machineName;

    public String getMachineName() {
        return machineName;
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

    @Override
    public HappyMachine getObject() throws Exception {
        HappyMachine machine = new HappyMachine();
        machine.setMachineName(this.machineName);
        return machine;
    }

    @Override
    public Class<?> getObjectType() {
        return HappyMachine.class;
    }
}
