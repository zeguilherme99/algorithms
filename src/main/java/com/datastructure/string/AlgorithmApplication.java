package com.datastructure.string;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class AlgorithmApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlgorithmApplication.class, args);
        double[] totalSales = totalSales(List.of("8349,14/09/2024,899.9,ESPORTE",
                "4837,17/09/2024,530.0,VESTUARIO",
                "15281,21/09/2024,1253.99,ESPORTE",
                "15344,27/09/2024,1000.9,VESTUARIO",
                "18317,04/10/2024,250.4,VESTUARIO",
                "18972,11/10/2024,385.5,JARDINAGEM"), "VESTUARIO");

        System.out.printf("%.0f VENDAS\nTOTAL = $%.2f", totalSales[1], totalSales[0]);
    }

    public static double[] totalSales(List<String> sales, String department) {

        return totalSalesRecursive(sales, department, 0, 0);
    }

    public static double[] totalSalesRecursive(List<String> sales, String department, double totalSales, double total) {
        if (sales.isEmpty()) {
            return new double[]{totalSales, total};
        }

        String line = sales.get(0);
        String[] lines = line.split(",");
        String departmentLine = lines[3];

        if (departmentLine.equals(department)) {
            total++;
            totalSales += Double.parseDouble(lines[2]);
        }

        List<String> sales2 = sales.subList(1, sales.size());

        return totalSalesRecursive(sales2, department, totalSales, total);
    }
}