package com.mycompany.java2022_w3_hw2;

public class Java2022_W3_Hw2 {

    public static void main(String[] args) {
        jl_45();
    }
    
    public static void jl_33(){ //Contains jl_34 too
        Product product = new Product(1, "Laptop", "Lenovo", 10000, 10, "Black");
        product.setId(1);
        product.setName("Laptop");
        product.setDescription("Lenovo");
        product.setPrice(100000);
        product.setStockAmount(10);
        product.setColor("Black");
        
        ProductManager productManager = new ProductManager();
        productManager.add(product);
        System.out.println(product.getCode());
    }
    
    public static void jl_35(){
        BasicCalculator basicCalculator = new BasicCalculator();
        System.out.println(basicCalculator.sum(1, 3));
    }
    
    public static void jl_36(){
        Customer customer = new Customer();
        Employee employee = new Employee();
        
        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
        EmployeeManager employeeManager = new EmployeeManager();
        
        employeeManager.EmployeeOfTheMonth();
        customerManager.List();
        customerManager.Add();
        customerManager.add();  //From jl_43 
    }
    
    public static void jl_37(){
        CreditUI creditUI = new CreditUI();
        creditUI.CreditCalculate(new TeacherCreditManager());
        creditUI.CreditCalculate(new MilitaryCreditManager());
        
    }
    
    public static void jl_38(){     
        /*
        BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConsoleLogger()};
        for(BaseLogger logger : loggers){
            logger.log("Log message");
        }
        */
        
       // CustomerManagerPolymorphism customerManager = new CustomerManagerPolymorphism(new DatabaseLogger());
       // customerManager.add();
        
        CustomerManagerPolymorphism customerManager = new CustomerManagerPolymorphism(new FileLogger());
        customerManager.add();
    }
    
    public static void jl_39(){
        BaseCreditManagerOverriding[] creditManagers = new BaseCreditManagerOverriding[]{new TeacherCreditManagerOverriding(), new AgriculturalCreditManagerOverriding(), new StudentCreditManagerOverride()};
        
        for(BaseCreditManagerOverriding creditManager : creditManagers){
            System.out.println(creditManager.calculate(1000));
        }
    }
    
    public static void jl_40(){
        /*
        GameCalculator gameCalculator = new GameCalculator();  //Abstract classes can't be used like this
        
        GameCalculator gameCalculator = new GameCalculator(){  //They can be used like this but it is bad coding highly unadvised
            @Override
            public void calculate(){
            }
        };
        */
        
        GameCalculator gameCalculator = new FemaleCharacterGameCalculator();  //This is where abstract is useful
        GameCalculator gameCalculator1 = new ElderCharacterGameCalculator();
        
        gameCalculator.calculate();
        gameCalculator1.calculate();
    }
    
    public static void jl_41(){
        CustomerManagerAbstractDemo customerManager = new CustomerManagerAbstractDemo();
        customerManager.databaseManager = new OracleDatabaseManagerAbstractDemo();
        //customerManager.databaseManager = new SqlServerDatabaseManagerAbstractDemo();
        customerManager.getCustomers();
    }
    
    public static void jl_42(){
        //ICustomerDal customerDal = new ICustomerDal();  //This code will give an error Interfaces can't have a new
        ICustomerDal customerDal = new OracleCustomerDal();  
        customerDal.add();
    }
    
    public static void jl_43(){
        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
        CustomerManager customerManager2 = new CustomerManager(new MySqlCustomerDal());
        /*
        customerManager.customerDal = new MySqlCustomerDal();  //These codes won't work because the private in the CustomerManager
        customerManager.customerDal = new OracleCustomerDal();
        */
        customerManager.add();
        customerManager2.add();
    }
    
    public static void jl_44(){
        IWorkable outsourceWorker = new OutsourceWorker();
        outsourceWorker.work();
        
        Worker worker = new Worker();
        worker.work();
        worker.eat();
        worker.pay();
        
        Robot robot = new Robot();
        robot.work();
        robot.maintenance();
    }
    
    public static void jl_45(){
        ProductManager productManager = new ProductManager();
        Product product = new Product();
        
        product.setPrice(5000);
        product.setId(1);
        product.setName("Lenovo");
        
        productManager.add(product);
        
        /*
        ProductValidator productValidator = new ProductValidator();  //Non static constructers need new in order to work
        productValidator.something();
        */
        
        DatabaseHelper.Crud.update();
        DatabaseHelper.Crud.delete();
        DatabaseHelper.Connection.createConnection();
    }
}
