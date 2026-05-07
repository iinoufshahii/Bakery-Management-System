# Bakery Management System

Bakery Management System is a Java Swing desktop application built in NetBeans for managing a bakery business. It supports separate workflows for customers, cashiers, bakers, and managers, with MySQL used as the backend database.

## Overview

The application appears to be centered around the bakery brand name **Homely Treats**. It starts with a splash screen, then opens a login screen where users choose a role and sign in. Customers can register through the signup screen, while staff users log in through the shared authentication flow.

The project is organized as a modular desktop system with role-based dashboards and database-driven forms for common bakery operations such as products, carts, orders, inventory, recipes, equipment, discounts, finance, and feedback.

## Screenshots

The screenshots below are ordered to match the main user flow through the application, using images extracted from the assignment document included in the workspace.

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

## Main Features

- Splash screen with loading progress
- Login and customer signup flow
- Role-based navigation for:
  - Customer
  - Cashier
  - Baker
  - Manager
- Product browsing and cart management for customers
- Order tracking and personal information management for customers
- Point-of-sale and reporting features for cashiers
- Discount management for cashiers
- Recipe, inventory, equipment, and production tracking for bakers
- User, order, finance, inventory, and feedback management for managers

## Project Structure

- `src/bakerymanagementsystem/` - splash screen, login, and signup
- `src/Customer/` - customer dashboard and customer-facing modules
- `src/Cashier/` - cashier dashboard, POS, products, discounts, and reporting
- `src/Baker/` - baker dashboard, recipes, inventory checks, equipment, and production records
- `src/Manager/` - manager dashboard and management screens
- `src/Images/` - image assets used by the UI
- `screenshots/` - sample UI screenshots extracted from the assignment document
- `build.xml` - Apache Ant build script used by NetBeans
- `manifest.mf` - application manifest

## Technology Stack

- Java
- Swing / AWT for the desktop UI
- NetBeans GUI Builder generated forms
- MySQL database
- MySQL Connector/J JDBC driver

## Database Setup

The source code currently connects to a local MySQL database using these hardcoded values:

- Host: `localhost`
- Port: `3306`
- Database: `homely_treats`
- User: `root`
- Password: `1234`

The application uses the MySQL driver class `com.mysql.cj.jdbc.Driver`.

If you want to run the project on another machine or with different credentials, update the JDBC connection strings in the Java files that open database connections.

## Requirements

- JDK installed and configured in NetBeans
- Apache NetBeans or another IDE that can open Ant-based Java projects
- MySQL Server
- MySQL Connector/J added to the project libraries

If you are reopening the project in NetBeans, place the external JARs in `lib/` or update the project libraries to match your environment.

## How To Run

1. Open the project in NetBeans.
2. Restore or create the MySQL database named `homely_treats`.
3. Make sure the tables used by the application exist in that database.
4. Add the MySQL Connector/J library if it is not already included.
5. Run the project from NetBeans.

The main application flow starts from the splash screen and then opens the login window.

## Application Flow

1. `Splash` shows a loading screen.
2. `Login` allows the user to sign in by role.
3. Customers can create an account from `SignUp`.
4. After login, the user is redirected to the appropriate dashboard:
   - Customer dashboard
   - Cashier main page
   - Baker dashboard
   - Manager dashboard

## Role Summary

### Customer

- Browse products
- Manage cart and orders
- View and update personal information
- Track order status

### Cashier

- Access POS
- View products
- Manage discounts
- Generate reports

### Baker

- Manage recipes
- Check inventory
- Track production records
- Manage equipment

### Manager

- Manage users
- Manage orders
- Review finance data
- Manage inventory
- Review feedback

## Notes

- The project is built as a desktop application, not a web app.
- Several screens connect directly to MySQL, so the database must be available before running the app.
- The current credentials and schema assumptions are development-focused and should be secured before production use.

## Suggested Improvements

- Move database credentials into a configuration file or environment variables
- Add a database initialization script
- Replace hardcoded paths and repeated connection code with a shared utility class
- Add validation and password security improvements
- Add a README section with screenshots once the UI is finalized

## License

No license information was provided in the project files.