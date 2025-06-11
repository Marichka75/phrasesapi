# 📚 Mi Primer Proyecto Spring Boot - API de Frases Inspiradoras

Este proyecto es una API REST creada con Spring Boot que permite gestionar frases motivadoras. Implementa un CRUD completo y está conectada a una base de datos MySQL. Sigue el patrón de arquitectura MVC de tres capas: controlador, servicio y repositorio.

---

## 🧩 Tecnologías utilizadas

- Java 21
- Spring Boot
- Spring Data JPA
- MySQL
- Postman

---

## 📁 Estructura del proyecto

com.springbootproject.phrasesapi
│
├── controller // Controladores REST (PhraseController)
├── service // Interfaces y clases de servicio (PhraseService, PhraseServiceImpl)
├── repository // Acceso a datos con JPA (PhraseRepository)
├── model // Entidad JPA (Phrase)
└── PhrasesapiApplication.java // Clase principal


---

## 🌐 Endpoints disponibles

| Método | URL                        | Descripción                        |
|--------|----------------------------|------------------------------------|
| GET    | `/api/phrases`             | Obtener todas las frases           |
| GET    | `/api/phrases/{id}`        | Obtener una frase por su ID        |
| POST   | `/api/phrases`             | Crear una nueva frase              |
| PUT    | `/api/phrases/{id}`        | Actualizar una frase existente     |
| DELETE | `/api/phrases/{id}`        | Eliminar una frase por su ID       |

---
🧪 Cómo probar la API
Inicia la aplicación desde IntelliJ (ejecuta PhrasesapiApplication).

Abre Postman.

Usa los endpoints para probar el CRUD (GET, POST, PUT, DELETE).

Verifica los cambios en la base de datos phrases_api.

📌 Requisitos funcionales
Cada frase tiene text y author.

Se puede crear, editar, eliminar y ver frases por ID o todas.

¡Gracias por visitar este repositorio! 💬✨

