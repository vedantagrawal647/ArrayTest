/* Q. Write a Java class, Flower, that has three instance variables of type String, int, and
 float, which respectively represent the name of the flower, its number of petals, and price. Your
  class must include a constructor method that initialises each variable to an appropriate value,
  and your class should include methods for setting the value of each type, and getting the value
  of each type. Create an array of 5 Flower objects and print the value.*/

import java.util.Scanner;
class Flower
{

    String name;
    int num;
    float price;
    Flower( String name,int num,int price)
    {

        this.name=name;
        this.num =num;
        this.price=price;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public int getNum() {
        return num;
    }
}
public class Jack {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Flower obj=new Flower("sunflower",5,30);
        String arr[][]=new String[5][3];

        for(int i=0;i<5;i++)
        {
            System.out.println("enter flower name "+ (i+1) + " , no. of flower , andprice of flower");
            obj.setName(s.next());
            obj.setNum(s.nextInt());
            obj.setPrice(s.nextInt());

            arr[i][0]= obj.getName();
            arr[i][1]=Integer.toString(obj.getNum());
            arr[i][2]=Float.toString(obj.getPrice());


        }

        for(int i=0;i<5;i++)
        {
            System.out.println("Flower name :" + arr[i][0] + " , no. of flower :" + arr[i][1] + " , price of flower :" + arr[i][2] );
        }
    }
}
