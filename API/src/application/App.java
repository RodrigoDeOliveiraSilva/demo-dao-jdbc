package application;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class App {
    //Subir imagem do MYSQL = docker run --name coursejdbc -p 3306:3306 -e MYSQL_ROOT_PASSWORD=123456 -d mariadb:latest
    public static void main(String[] args) throws Exception {
        
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("====== 1º TEST: seller findById ======");
        Seller sellerFindById = sellerDao.findById(3);
        System.out.println(sellerFindById);

        System.out.println("\n====== 2º TEST: seller findByDepartment ======");
        Department department = new Department(2, null);
        List<Seller> listSellerFindByDepartment = sellerDao.findByDepartment(department);
        listSellerFindByDepartment.forEach(System.out::println);

        System.out.println("\n====== 3º TEST: seller findAll ======");
        List<Seller> listSellerFindAll = sellerDao.findAll();
        listSellerFindAll.forEach(System.out::println);
    }
}
