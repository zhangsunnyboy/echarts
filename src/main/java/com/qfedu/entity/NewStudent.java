package com.qfedu.entity;

/**
 * projectName: echarts
 * author: 张宁
 * time: 2020/9/23 20:53
 * description:
 */
public class NewStudent {
    public int id;
    public String name;
    public int score;
    public int subject;
    public int teacherid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getSubject() {
        return subject;
    }

    public void setSubject(int subject) {
        this.subject = subject;
    }

    public int getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(int teacherid) {
        this.teacherid = teacherid;
    }

    @Override
    public String toString() {
        return "NewStudent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                ", subject=" + subject +
                ", teacherid=" + teacherid +
                '}';
    }
}
