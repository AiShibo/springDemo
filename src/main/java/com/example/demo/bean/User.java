package com.example.demo.bean;

import lombok.Data;
import org.springframework.context.annotation.Bean;

@Data
public class User {
    private Integer id; // 对应数据库中的 'id' 字段
    private String name; // 对应数据库中的 'name' 字段

    // 构造函数
    public User() {
    }

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter 和 Setter 方法
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // toString 方法，用于打印对象信息
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

