<div align="center">

# 🚀 **SCM v2.0 – Smart Contact Manager (Modernized Edition)**  
### A Modern, Secure, Modular Contact Management System Built With Spring Boot + Thymeleaf



</div>

---

## 📘 **Project Overview**

**SCM v2.0** (Smart Contact Manager) is a complete rewrite and modernization of the original SCM project.  
This version focuses on clean code architecture, modular folder structure, enhanced security, reusable UI components, and production-ready best practices.

It is built using:
- **Spring Boot**
- **Spring Security**
- **JWT Authentication**
- **JPA / Hibernate**
- **Thymeleaf UI**
- **Bootstrap**

---

## 🎯 **Key Highlights**

✔️ Modern Project Architecture  
✔️ Clean, Scalable Code Structure  
✔️ Fully Secured Authentication (Spring Security + JWT)  
✔️ Thymeleaf UI with Layouts & Components  
✔️ CRUD Operations for Contacts  
✔️ Profile Management  
✔️ Admin-Ready Structure  
✔️ Ready for Cloud Deployment  

---

## 🏗️ **Tech Stack**

### **Backend**
| Technology | Purpose |
|-----------|----------|
| **Java 17+** | Core language |
| **Spring Boot** | Backend framework |
| **Spring MVC** | Controllers & routing |
| **Spring Security** | Authentication & authorization |
| **JWT** | API authentication |
| **Spring Data JPA** | ORM layer |
| **MySQL** | Database |
| **Maven** | Build tool |

### **Frontend**
| Technology | Purpose |
|-----------|----------|
| **Thymeleaf** | Server-side rendering |
| **HTML / CSS** | UI structure |
| **Bootstrap 5** | Styling |
| **Custom Layouts** | Reusable components |

---

## 📁 **Project Folder Structure**

```text
SCM-V2.0
├── src/main/java/com/scm
│   ├── config/               → Security & application configuration
│   ├── controllers/          → Web & REST controllers
│   ├── entities/             → JPA entities
│   ├── exceptions/           → Global exception handling
│   ├── repositories/         → DAO / repository layer
│   ├── services/             → Business logic
│   └── utils/                → Helper utilities
│
├── src/main/resources/
│   ├── templates/            → Thymeleaf views
│   │   ├── layouts/          → base.html, header.html, footer.html
│   │   ├── auth/             → login.html, register.html
│   │   └── pages/            → dashboard.html, contacts.html, profile.html
│   ├── static/               → CSS, JS, Images
│   └── application.properties
│
└── README.md

```

---

## 🔐 **Security Layer Overview**

| Feature                     | Description                |
| --------------------------- | -------------------------- |
| **Spring Security**         | Protects routes & app      |
| **JWT Authentication**      | Token-based login for APIs |
| **Role-Based Access**       | USER / ADMIN               |
| **BCrypt Password Hashing** | Secure password storage    |
| **CSRF Protection**         | Form login safety          |
| **Protected Paths**         | `/user/**`, `/admin/**`    |

---

## 🧩 **System Architecture Diagram**

                   ┌───────────────────────────┐
                   │        CLIENT (UI)        │
                   │  Thymeleaf + Bootstrap    │
                   └─────────────┬─────────────┘
                                 │
                                 ▼
                     ┌──────────────────────┐
                     │   Spring MVC Layer   │
                     │ Controllers          │
                     └─────────────┬────────┘
                                   │
                                   ▼
                     ┌──────────────────────┐
                     │   Service Layer      │
                     │ Business Logic       │
                     └─────────────┬────────┘
                                   │
                                   ▼
                     ┌──────────────────────┐
                     │   Repository Layer   │
                     │ (Spring Data JPA)    │
                     └─────────────┬────────┘
                                   │
                                   ▼
                     ┌──────────────────────┐
                     │     MySQL DB         │
                     └──────────────────────┘

---

## 🔄 **Authentication Flow (JWT + Spring Security)**

```
[User Login] 
      │
      ▼
[AuthenticationController]
      │
      ▼
[Spring Security Auth Manager]
      │
      ▼
[Generate JWT Token]
      │
      ▼
[Client Stores Token]
      │
      ▼
[Send token in Authorization Header]
      │
      ▼
[JWT Filter validates token]
      │
      ▼
[Protected Routes Accessible]
```

---

## ⚙️ **Setup & Installation**

### 1. Clone the repository
```bash
git clone https://github.com/Ajayofficial18/SCM-v.2.0.-.git
cd SCM-v.2.0.-.git
```

### 2. Configure database

Edit application.properties:
```bash
spring.datasource.url=jdbc:mysql://localhost:3306/scm
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
```
### 3. Run the project
```bash
mvn spring-boot:run
```
### 4. Access the application

Web UI: http://localhost:8080

Login Page: /login

Dashboard: /user/dashboard

---

## 🧪 **API Documentation**

JWT-based APIs (for future mobile apps / SPA):

POST /api/auth/login

POST /api/auth/register

GET  /api/user/{id}

---

## 🤝 **Contributions**

We welcome contributions!  

Please read our [CONTRIBUTING.md](CONTRIBUTING.md) for guidelines on how to get started.


## 📄 **License**

This project is open source and available under the MIT License.

---

## 👤 **Author**

Ajay Gour

Backend Developer – Java | Spring Boot

GitHub: https://github.com/Ajayofficial18
