package com.lvlp.stu.spring.allanno.pojo;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class HappyComponent {
    private String componentName;

    private HappyMachine happyMachine;

    private List<String> startList;

    private Set<String>  heros;

    private Map<String,String> Skills;

    public List<String> getStartList() {
        return startList;
    }

    public void setStartList(List<String> startList) {
        this.startList = startList;
    }

    public Set<String> getHeros() {
        return heros;
    }

    public void setHeros(Set<String> heros) {
        this.heros = heros;
    }

    public Map<String, String> getSkills() {
        return Skills;
    }

    public void setSkills(Map<String, String> skills) {
        Skills = skills;
    }

    public HappyMachine getHappyMachine() {
        return happyMachine;
    }

    public void setHappyMachine(HappyMachine happyMachine) {
        this.happyMachine = happyMachine;
    }

    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        System.out.println("componentName 开始赋值了");
        this.componentName = componentName;
    }

    public void doWork() {
        System.out.println("doWork");
    }

    @Override
    public String toString() {
        return "HappyComponent{" +
                "componentName='" + componentName + '\'' +
                ", happyMachine=" + happyMachine +
                ", startList=" + startList +
                ", heros=" + heros +
                ", Skills=" + Skills +
                '}';
    }

}
