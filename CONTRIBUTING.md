# 🤝 Contributing to SCM v2.0

Thank you for considering contributing to **SCM v2.0 – Smart Contact Manager (Modernized Edition)**!  
We welcome all contributions — from bug fixes to new features and documentation improvements.

This document explains how to contribute effectively.

---

## 📌 How You Can Contribute

- 🐞 Report bugs  
- 💡 Suggest new features  
- 🔧 Fix issues  
- 🧹 Improve code or folder structure  
- 🎨 Improve UI/UX of Thymeleaf pages  
- 📝 Improve documentation  
- 🔐 Enhance security or best practices  

---

## 📁 Project Structure Overview

Before contributing, please review the folder structure:

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

## 🌿 Branching Strategy

We follow a clean Git branching model:

| Branch | Purpose |
|--------|---------|
| `main` | Production-ready stable code |
| `develop` | Active development branch |
| `feature/<feature-name>` | New features |
| `fix/<issue-name>` | Bug fixes |
| `hotfix/<critical-fix>` | Emergency fixes to main |

### ✔️ Create a new branch before contributing:

```bash
git checkout -b feature/<feature-name>

```

Examples:
```
feature/login-page
feature/jwt-integration
fix/contact-validation
```

---

## 🧑‍💻 Coding Guidelines

Please follow these when writing code:

- Java Code Style

- Use meaningful variable and method names.

- Follow standard Java conventions (CamelCase, PascalCase).

- Keep classes and methods small & single-purpose.

- Avoid long controllers — move logic into services.

- Validate all user inputs.

- Use DTOs for request/response mapping.

- Do not expose sensitive fields (passwords, tokens).

- Spring Boot Guidelines

- Use constructor-based dependency injection.

- Annotate layers properly: @Controller, @RestController, @Service, @Repository

- Keep entity models clean.

- Handle exceptions globally using @ControllerAdvice.

- Use @Valid for validation.

- Thymeleaf Guidelines

- Use fragments for header, footer, layout.

- Avoid inline CSS — keep it in static folder.

- Use ${} and th:each, th:if properly.

- Create reusable templates.

---

## 🧪 Writing Tests (Optional, Recommended)

If contributing to business logic:

Add unit tests using JUnit & Mockito

Ensure tests pass before submitting PR:

```bash
mvn test
```

---

## 📝 Commit Message Guidelines (Conventional Commits)

Use this commit style:

```php-template
<type>: <short message>
```

Types:

  - feat: New feature
  
  - fix: Bug fix
  
  - docs: Documentation update
  
  - style: Formatting (no logic changes)
  
  - refactor: Code restructuring
  
  - test: Test cases
  
  - chore: Build/CI updates

Examples:

```sql
feat: add JWT authentication
fix: resolve null pointer in contact service
docs: update README with installation steps
```

---

## 📥 Pull Request Guidelines

Before submitting a PR:

✔️ Make sure:

- Code compiles successfully

- You tested the application

- You followed project structure

- You added documentation (if needed)

✔️ PR Must Include:

- Clear title

- Description of the change

- Issue number (if relevant)

- Screenshots (optional for UI changes)

## 🔄 PR Process:

- Create feature branch

- Commit changes

- Push to GitHub

- Open PR from feature/... → develop branch

- Wait for review and approval

---

## 🐛 Reporting Bugs

Please include:

  - Clear description
  
  - Steps to reproduce
  
  - Expected vs actual result
  
  - Screenshots (if applicable)

Create a new issue here:

Issues Page: https://github.com/Ajayofficial18/SCM-v.2.0.-.git/issues

---

## 💡 Requesting New Features

When suggesting new features:

Explain the problem

How the feature will solve it

Alternatives considered

---

## 🙌 Code of Conduct

Be respectful and kind to all contributors.
We’re all here to learn and build together.

---

## 📢 Need Help?

- Feel free to ask questions in the discussions or issues section.
- Reach out to the maintainers if you need guidance.
- Your contributions make SCM v2.0 better for everyone.

## 🎉 **Thank you for contributing to SCM v.2.0 !** 🎉

Happy coding! 🚀
