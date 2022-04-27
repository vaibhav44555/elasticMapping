package com.moglix.ElasticMapping.controller;
import com.moglix.ElasticMapping.document.Person;
import com.moglix.ElasticMapping.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
public class PersonController {
    private final PersonService service;
  @Autowired
    public PersonController(PersonService service) {
        this.service = service;
    }

    @PostMapping("/post")
    public void save(@RequestBody final Person person){

    service.save(person);
    }
    @GetMapping("/{id}")
    public Person findById(@PathVariable final String id){
      return service.findById(id);


    }
}
