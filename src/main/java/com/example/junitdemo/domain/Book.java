package com.example.junitdemo.domain;

import lombok.Data;

@Data //采用lombok.Data之后，就可以免去写Java的冗长代码。比如其中熟悉就已经实现了setter和getter
public class Book {
    private String name;
    private String description;
}
