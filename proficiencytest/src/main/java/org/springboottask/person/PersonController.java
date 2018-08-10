package org.springboottask.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {
   @Autowired
    private PersonService personService;

   @RequestMapping("/people")
   public List<Person> getAllPersons() {
       return personService.getAllPersons();
   }
   @RequestMapping("/person/{id}")
    public Person getPerson(@PathVariable int id){
       return personService.getPerson(id);
   }

   @RequestMapping(method= RequestMethod.POST, value="/addPerson")
    public void addPerson(@RequestBody Person person){
        personService.addPerson(person);
   }
   @RequestMapping(method= RequestMethod.POST, value="/addPeople")
    public void addPerson(@RequestBody Person[] persons){
        personService.addPerson(persons);
   }
   @RequestMapping("/people/byName")
    public List<Person> sortByName() {
        return personService.sortByName();
   }

   //pe krijon njo t'ri, nuk pe update
   @RequestMapping(method= RequestMethod.PUT, value = "/person/{id}")
    public void updatePerson(@RequestBody Person person){
        personService.updatePerson(person);
   }
   @RequestMapping(method= RequestMethod.DELETE, value = "/person/{id}")
    public void deletePerson(@PathVariable int id) {
        personService.deletePerson(id);
   }

}


