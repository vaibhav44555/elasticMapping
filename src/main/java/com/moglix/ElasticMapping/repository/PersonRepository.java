package com.moglix.ElasticMapping.repository;
import com.moglix.ElasticMapping.document.Person;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends ElasticsearchRepository<Person,String> {

}
