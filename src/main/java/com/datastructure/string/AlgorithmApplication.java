package com.datastructure.string;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Comparator;

@SpringBootApplication
public class AlgorithmApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlgorithmApplication.class, args);
        Seller[] sellers = new Seller[]{new Seller("Barry Allen", 18196.0),
                new Seller("Logan", 4255.0),
                new Seller("Maria", 10298.0),
                new Seller("Ana", 26485.0),
                new Seller("Aurora", 19982.0),
                new Seller("Noah", 15820.0),
                new Seller("Leo", 21412.0),
                new Seller("Alex", 12000.0)};
        System.out.println(biggerSellerAmount(sellers));
    }

    public static String biggerSellerAmount(Seller[] sellers) {
        Arrays.sort(sellers, Comparator.reverseOrder());
        return sellers[0].getName();
    }
}

class Seller implements Comparable<Seller>{
    private String name;
    private double amount;

    public Seller(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public int compareTo(Seller seller) {
        return Double.compare(this.getAmount(), seller.getAmount());
    }
}
