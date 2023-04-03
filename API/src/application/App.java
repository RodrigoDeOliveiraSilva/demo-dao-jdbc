package application;

import model.entities.Department;

public class App {
    public static void main(String[] args) throws Exception {
        Department dp = new Department(1, "Books");
        System.out.println(dp);
    }
}
