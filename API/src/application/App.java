package application;
import model.dao.DaoFactory;
import model.dao.SellerDao;

import model.entities.Seller;

public class App {
    //Subir imagem do MYSQL = docker run --name coursejdbc -p 3306:3306 -e MYSQL_ROOT_PASSWORD=123456 -d mariadb:latest
    public static void main(String[] args) throws Exception {
        
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("====== 1º TEST: seller findById ======");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

       
    }
}
