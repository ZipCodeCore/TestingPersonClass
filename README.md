# Creating and Testing Person class
## Overview
* **Purpose** - to demonstrate the use of [Java Classes](https://docs.oracle.com/javase/tutorial/java/concepts/class.html).
* **Objective** - to implement a Java Class which encapsulates data about a `Person` object 

## Instructions
* **Ensure Each Test Passes Successfully**
    * Ensure the class `TestPerson` has 100% success rate before continuing.
     
* **Finish Features**
    * Add 5 different fields to the `Person` class.
    * Ensure each of the methods for manipulating and accessing these fields have appropriate testing in the `TestPerson`.

## Some background

In Java, an object is an instance of a class that represents a real-world entity or concept. A class is a blueprint or template that defines the properties and behaviors of an object.

For example, let's say we want to model a car in Java. We can create a Car class that defines the properties and behaviors of a car, such as its make, model, color, and speed. We can then create Car objects that represent individual cars, each with its own set of values for these properties.

Here is an example of a Car class in Java:

```java
public class Car {
    private String make;
    private String model;
    private String color;
    private int speed;

    public Car(String make, String model, String color) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.speed = 0;
    }

    public void accelerate(int amount) {
        speed += amount;
    }

    public void brake(int amount) {
        speed -= amount;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }
}
```

In this example, the Car class has four properties: make, model, color, and speed. The class also has three methods: accelerate(), brake(), and getters for each property. The accelerate() and brake() methods modify the speed property of the Car object.

To create a Car object, we can use the following code:

```java
Car myCar = new Car("Toyota", "Corolla", "Red");
```

This creates a new Car object with the make "Toyota", model "Corolla", and color "Red". The speed property is initialized to 0.

We can then use the methods of the Car class to modify the speed of the car:

```java
myCar.accelerate(10);
myCar.brake(5);
```

This increases the speed of the car by 10 and then decreases it by 5.

Thus objects and classes are fundamental concepts in Java that allow developers to model real-world entities and concepts in their programs. By defining the properties and behaviors of an object in a class, developers can create instances of that object and manipulate them in their programs.
