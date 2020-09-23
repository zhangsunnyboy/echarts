package com.qfedu.entity;

/**
 * projectName: echarts
 * author: 张宁
 * time: 2020/9/23 20:58
 * description:
 */
public class ScoreResult {
    public int value;
    public String name;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ScoreResult(int value, String name) {
        this.value = value;
        this.name = name;
    }

    @Override
    public String toString() {
        return "ScoreResult{" +
                "value=" + value +
                ", name='" + name + '\'' +
                '}';
    }
}
