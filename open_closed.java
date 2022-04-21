public interface Shape {

     public Double calculateArea();

}

public class Rectangle implements Shape {

     Double length;
     Double width;

     public double calculateArea() {

           return length * width;
     }
}

public class Circle implements Shape {

     public Double radius;

     public Double calculateArea() {

           return (22 / 7) * radius * radius;
     }
}
