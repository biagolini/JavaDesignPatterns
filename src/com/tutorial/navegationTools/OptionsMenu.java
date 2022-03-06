package com.tutorial.navegationTools;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OptionsMenu {

    private String[] fristMenu = new String[] {"Creational Patterns", "Structural Patterns", "Behavioral Patterns", "Sair"};

    private String[] behavioral  = new String[] {"Chain of Responsibility", "Command", "Iterator", "Mediator", "Memento", "Observer", "State", "Strategy", "Template Method", "Visitor"};

    private String[] creational = new String[] {"Factory Method", "Abstract Factory", "Builder", "Prototype", "Singleton"};

    private String[] structural = new String[] {"Adapter", "Bridge", "Composite", "Decorator", "Facade", "Flyweight", "Proxy"};

}
