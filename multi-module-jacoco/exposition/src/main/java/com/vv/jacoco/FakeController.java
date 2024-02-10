package com.vv.jacoco;



public class FakeController {

    public Person exposeMyDomainClass() {
        final Person person = new Person();
        person.setName("a name from controller");
        return person;
    }

}
