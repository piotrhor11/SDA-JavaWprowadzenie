package pl.sda.dzien013.day13;

import java.io.*;

/**
 * Created by sp0rk on 12/07/17.
 */
public class BinaryFiles {

    public static void main(String[] args) {
        Car opel = new Car("Opel", 5000);
        writeCarToFile(opel, "car.data");
        readFirstCarFromFile("car.data");
    }

    private static void readFirstCarFromFile(String file) {
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Car car = (Car) ois.readObject();
            ois.close();
            System.out.println("Reading from file: " + file + "\nModel: " + car.getModel() + ", Price: " + car.getPrice());
        } catch (IOException e) {
            System.err.println("IO failed");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.err.println("Object is not a Car");
            e.printStackTrace();
        }
    }

    private static void writeCarToFile(Car opel, String file) {
        try {
            FileOutputStream fous = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fous);
            oos.writeObject(opel);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static class Car implements Serializable {
        private String model;
        private int price;

        public Car(String model, int price) {
            this.model = model;
            this.price = price;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }
    }
}
