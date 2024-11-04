Controllers - Endpoints
    CompanyContoller
        @RequestMapping("/api/companies")
        @GetMapping("/api/companies/{id}")
        @DeleteMapping("/api/companies/{id}")
    CustomerController
        @RequestMapping("/api/customers")
        @GetMapping("/api/customers/{id}")
        @DeleteMapping("/api/products/{id}")
    DeliveryDetailsController
        @RequestMapping("api/orders/{id}/delivery-details")
        @GetMapping("api/orders/{id}/delivery-details")
        @DeleteMapping("api/orders/{id}/delivery-details")
    HubRateController
        @RequestMapping("/api/hub-rates")
        @GetMapping("/api/hub-rates/{id}")
        @DeleteMapping("/api/hub-rates/{id}")
    OrderController
        @RequestMapping("/api/orders")
        @GetMapping("/api/orders/{id}")
        @DeleteMapping("api/orders/{id}")
    PaymentController
        @RequestMapping("/api/orders/{id}/payments")
        @GetMapping("/api/orders/{id}/payments/{id}")
        @PostMapping("/api/orders/{id}/payments/{id}")
        @DeleteMapping("/api/orders/{id}/payments/{id}")
    ProductController
        @RequestMapping("/api/products")
        @GetMapping("/api/products/{id}")
        @DeleteMapping("/api/products/{id}")
    ReviewController
        @RequestMapping("/api/reviews")
        @GetMapping("/api/products/{id}/review/{id}")
        @DeleteMapping("/api/products/{id}/review/{id}")

Entities - Database Schemas
    Company
        @OnetoMany
        @4Join Column(name = product_id)
    Customer
    DeliveryDetails
        @OneToOne
        private Customer customer;
    HubRates
        @ManyToOne
        @JoinColumn(name = "company_id")
        private Company company;
    Order
        @OneToMany(mappedBy = "order")
        private List<Product> product;

        @OneToOne(mappedBy = "customerId")
        private Customer customer;
    Payment
        @JoinColumn(name = "order_id")
        private Order order;
    Product
           @OneToMany
           private List<Review> review;
           @ManyToOne
           @JoinColumn(name = "order_id")
           private Order order;
    Review
        @ManyToOne
        private Product product;
        @JoinColumn(name="customer_id")
        private String author;

Repositories
    CompanyRepository
    CustomerRepository
    DeliveryDetailsRepository
    HubRatesRepository
    OrderRepository
    PaymentRepoistory
    ProductRepository
    ReviewRepository


