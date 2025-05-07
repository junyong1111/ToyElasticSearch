package com.searcproject.demo.domain;

import java.util.List;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@Document(indexName = "concepts")
public class Concept {
    @Id
    private String keyword;

    @Field(type = FieldType.Keyword)
    private String topic;

    @Field(type = FieldType.Text, analyzer = "nori")     // 한글 분석 예시
    private String concept;

    @Field(type = FieldType.Text, analyzer = "nori")
    private String intermediate;

    @Field(type = FieldType.Text, analyzer = "nori")
    private String advanced;

    @Field(type = FieldType.Nested)
    private Map<String, String> level;

    @Field(type = FieldType.Keyword)
    private List<String> sources;


}
