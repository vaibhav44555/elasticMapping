package com.moglix.ElasticMapping.document;
import com.moglix.ElasticMapping.helper.Indices;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.Setting;

@Document(indexName = Indices.PERSON_INDEX,shards = 5,replicas = 1 )
public class Person {
    @Id
    @Field(type = FieldType.Keyword)

    private String id;

    @Field(type = FieldType.Text)

    private String name;
}