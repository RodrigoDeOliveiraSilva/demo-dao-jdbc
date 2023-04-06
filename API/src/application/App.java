package application;

/*import java.util.Date;
import java.util.List;
import java.util.Scanner;
import model.dao.SellerDao;
import model.entities.Seller;
*/
import model.dao.DepartmentDao;
import model.dao.DaoFactory;

import model.entities.Department;


public class App {
    public static void main(String[] args) throws Exception {
        
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("====== 1º TEST: Department Insert ======");
        Department dep = new Department(null, "PC");
        departmentDao.insert(dep);
        System.out.println(dep);

        System.out.println("\n ====== 2º TEST: Department Update ======");
        Department dep2 = new Department(1,"TV");
        departmentDao.update(dep2);
        System.out.println("Update success.");

        System.out.println("\n ====== 3º TEST: Department DELETE ======");
        departmentDao.deleteById(12);
        System.out.println("Delete success.");

        System.out.println("\n ====== 4º TEST: Department findById ======");
        Department dep3 = departmentDao.findById(2);
        System.out.println(dep3);

        /*System.out.println("====== TEST seller======");
        Scanner sc = new Scanner(System.in);
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

        System.out.println("\n====== 4º TEST: seller insert ======");
        Seller newSeller = new Seller(null,"Fabricio", "fabricio@gmail.com",new Date(),4000.00,department);
        sellerDao.insert(newSeller);
        System.out.println(newSeller);

        System.out.println("\n====== 5º TEST: seller update ======");
        sellerFindById = sellerDao.findById(2);
        sellerFindById.setName("Julia Robert");
        sellerDao.update(sellerFindById);
        System.out.println("Update Completed.");
        
        System.out.println("\n====== 6º TEST: seller delete ======");
        System.out.print("Enter id of seller for delete test: ");
        int id = sc.nextInt();
        sellerDao.deleteById(id);
        System.out.println("Delete Completed.");

        sc.close();
        */
    }
}
