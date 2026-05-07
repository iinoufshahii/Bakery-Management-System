# Bakery Management System

A role-based desktop **Bakery Management System** developed as an **Object-Oriented Programming (OOP) university project** using **Java Swing** and **MySQL**.

This system models real bakery operations for the brand **Homely Treats**, including customer ordering, cashier sales, baker production workflows, and manager-level administration.

---

## 1) Project Overview

The application is a multi-module Java desktop solution where each role interacts with dedicated screens and workflows:

- **Customer**: register, browse products, manage cart, place orders, track orders, and submit reviews.
- **Cashier**: run POS operations, manage discounts, and generate sales reports.
- **Baker**: maintain recipes, production records, ingredient checks, and equipment status.
- **Manager**: manage users, orders, inventory, finance metrics, and feedback moderation.

The project demonstrates practical OOP design through modular package structure, class-based UI forms, and database-driven operations with JDBC.

---

## 2) Core Objectives

- Build a complete desktop CRUD system for bakery operations.
- Apply OOP concepts in a real-world business scenario.
- Integrate Java Swing front-end with a relational MySQL database.
- Support role-based access and responsibilities.
- Practice software modularity, maintainability, and UI-event handling.

---

## 3) Technology Stack

- **Language:** Java
- **UI Framework:** Java Swing / AWT
- **IDE/Project Style:** Apache NetBeans (Ant project)
- **Database:** MySQL
- **Database Access:** JDBC with MySQL Connector/J
- **Build Tool:** Apache Ant (`build.xml`)

---

## 4) Project Structure

- `/src/bakerymanagementsystem/`  
  Application entry flow: `Splash`, `Login`, `SignUp`
- `/src/Customer/`  
  Customer dashboard, cart, personal info, order tracking, reviews
- `/src/Cashier/`  
  Cashier main page, POS, product display, discounts, reporting
- `/src/Baker/`  
  Baker dashboard, recipes, inventory checks, production records, equipment
- `/src/Manager/`  
  Manager dashboard, users, orders, inventory, finance, feedback
- `/src/Images/` and `/src/images/`  
  UI image assets
- `/screenshots/`  
  UI previews used in documentation
- `build.xml`  
  Ant build/test/run configuration
- `manifest.mf`  
  JAR manifest

---

## 5) Application Flow

1. `Splash` displays loading sequence.
2. `Login` authenticates credentials and selected role.
3. New customers create accounts through `SignUp`.
4. On successful login, users are redirected to role-specific dashboards:
   - Customer → `CustDashboard`
   - Cashier → `Mainpage`
   - Baker → `BakerDashboard`
   - Manager → `ManagerDashboard`

---

## 6) Functional Modules (Detailed)

### Customer Module
- Product browsing and cart operations
- Order placement and tracking
- Personal profile updates
- Product review submission

### Cashier Module
- POS cart and checkout handling
- Discount management
- Product listing support
- Report generation for sales insights

### Baker Module
- Recipe management (add/update/delete)
- Ingredient/stock checks
- Production record maintenance
- Equipment status management

### Manager Module
- User/staff management
- Order status management
- Inventory management for products and ingredients
- Finance dashboard (orders, revenue, expenses)
- Customer feedback review and moderation

---

## 7) Database Integration

The system uses direct JDBC connections in multiple modules.

### Current configured local connection in source code
- **Driver:** `com.mysql.cj.jdbc.Driver`
- **URL:** `jdbc:mysql://localhost:3306/homely_treats`
- **Username:** `root`
- **Password:** `1234`

### Main tables referenced by the application
- `customer`
- `users`
- `products`
- `ingredients`
- `recipes`
- `production`
- `equipment`
- `orders`
- `order_details`
- `cartmanage`
- `managediscount`
- `transactions`
- `productreview`

---

## 8) OOP Concepts Demonstrated

- **Encapsulation:** module data and logic encapsulated in class-based forms.
- **Abstraction:** role-focused modules hide implementation complexity from end users.
- **Inheritance:** UI classes extend `javax.swing.JFrame` and use Swing component hierarchies.
- **Polymorphism/Event Handling:** action listeners and mouse listeners trigger context-specific runtime behavior.
- **Modularity:** separation by package supports maintainability and code organization.

---

## 9) How to Run

1. Install JDK and MySQL Server.
2. Open the project in Apache NetBeans.
3. Ensure the database `homely_treats` exists.
4. Create/import required tables used by modules.
5. Add MySQL Connector/J to project libraries if missing.
6. Build and run the project from NetBeans.

---

## 10) Build and Test

This is an Ant-based project.

Common commands:

```bash
ant clean
ant compile
ant test
ant run
```

> Note: In this environment, Ant compile/test may fail if local JDK version does not match the target release configured in NetBeans project properties.

---

## 11) Screenshots

### Entry Flow

| Screen | Preview |
| --- | --- |
| Splash | ![Splash screen](screenshots/splash.png) |
| Login | ![Login screen](screenshots/login.png) |
| Sign up | ![Signup screen](screenshots/signup.png) |

### Customer Flow

| Screen | Preview |
| --- | --- |
| Customer dashboard | ![Customer dashboard](screenshots/customer-dashboard.png) |
| Personal information | ![Personal information](screenshots/customer-personal-info.png) |
| Order tracking | ![Order tracking](screenshots/customer-order-tracking.png) |
| Product review | ![Product review](screenshots/customer-product-review.png) |

### Cashier Flow

| Screen | Preview |
| --- | --- |
| Cashier home | ![Cashier home](screenshots/cashier-screen.png) |
| POS | ![POS](screenshots/cashier-pos.png) |
| Product display | ![Product display](screenshots/cashier-product-display.png) |
| Discount management | ![Discount management](screenshots/cashier-discount.png) |
| Reporting | ![Reporting](screenshots/cashier-reporting.png) |

### Baker Flow

| Screen | Preview |
| --- | --- |
| Baker dashboard | ![Baker dashboard](screenshots/baker-dashboard.png) |
| Recipe management | ![Recipe management](screenshots/baker-recipe-management.png) |
| Production records | ![Production records](screenshots/baker-production-records.png) |
| Equipment management | ![Equipment management](screenshots/baker-equipment-management.png) |

### Manager Flow

| Screen | Preview |
| --- | --- |
| Manager dashboard | ![Manager dashboard](screenshots/manager-dashboard.png) |
| User management | ![User management](screenshots/manager-user-management.png) |
| Order management | ![Order management](screenshots/manager-order-management.png) |
| Finance dashboard | ![Finance dashboard](screenshots/manager-finance-dashboard.png) |
| Inventory management - products | ![Inventory products](screenshots/manager-inventory-products.png) |
| Inventory management - ingredients | ![Inventory ingredients](screenshots/manager-inventory-ingredients.png) |
| Feedback management | ![Feedback management](screenshots/manager-feedback.png) |

---

## 12) Known Limitations

- Database credentials are hardcoded in multiple files.
- Database connection logic is repeated across modules.
- Passwords are handled as plain text.
- No SQL initialization/migration script is included.

---

## 13) Future Improvements

- Centralize DB configuration and connection utility class.
- Introduce password hashing and stronger authentication.
- Add input validation and error-handling standardization.
- Implement DAO/service layers to reduce duplication.
- Add automated tests and CI checks.
- Add database setup script for quick deployment.

---

## 14) Academic Note

This project was developed for academic learning to demonstrate OOP, GUI development, and database integration in Java.

---

## 15) License

No explicit license file is currently included in this repository.
