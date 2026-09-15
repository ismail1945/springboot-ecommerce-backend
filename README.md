# 🛒 Spring Boot E-Commerce Backend

A powerful RESTful E-Commerce Backend Application built using **Spring Boot**.

---

## 🚀 Features

✅ User Authentication & Authorization  
✅ Product Management  
✅ Add / Update / Delete Products  
✅ REST APIs using Spring Boot  
✅ Spring Security Integration  
✅ MySQL / H2 Database Support  
✅ Layered Architecture  
✅ Maven Project Structure  

---

## 🛠️ Tech Stack

| Technology | Usage |
|------------|-------|
| ☕ Java 17 | Backend Language |
| 🌱 Spring Boot | Backend Framework |
| 🔐 Spring Security | Authentication |
| 🗄️ Spring Data JPA | Database Operations |
| 🐬 MySQL | Database |
| 💾 H2 Database | Testing |
| 📮 Postman | API Testing |
| 🔧 Maven | Build Tool |

---

# 📂 Project Structure

```bash
src
 ┣ 📂 controller
 ┣ 📂 service
 ┣ 📂 repository
 ┣ 📂 entity
 ┣ 📂 dto
 ┣ 📂 exception
 ┣ 📂 config
 ┗ 📜 EcommerceApplication.java

## 📡 Product API (DTO-based)

- `POST /api/products`
  - Request body:
    ```json
    {
      "name": "Laptop",
      "description": "Gaming laptop",
      "price": 1200.0,
      "quantity": 5
    }
    ```
  - Validation:
    - `name` required
    - `price` required and `> 0`
    - `quantity` required and `>= 0`
- `GET /api/products` returns product response DTO list
- `GET /api/products/{id}` returns one product response DTO
