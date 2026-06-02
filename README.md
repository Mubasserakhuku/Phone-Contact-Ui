# 📱 Phone Contact Manager (JavaFX)
A **desktop-based JavaFX application** that works as a simple Phone Contact Manager.  
It allows users to **create, read, update, and delete (CRUD)** contact details (Name, Phone Number, Email).

---

## ✨ Features

- ➕ **Add Contact** – Insert new contact with validation
- 📋 **View Contacts** – Display all contacts in a TableView
- ✏️ **Update Contact** – Edit selected contact dynamically
- ❌ **Delete Contact** – Remove selected contact instantly
- 🧹 **Clear Fields** – Reset input fields and selection
- ⚠️ **Input Validation** – Prevent empty entries with alert system

---

## 🖥️ UI Preview

- <img width="675" height="545" alt="image" src="https://github.com/user-attachments/assets/e0b8314d-4a9e-403e-a69a-2af250eb0a3c" />

---

## ⚙️ How It Works

The application is built using **JavaFX GUI components** and follows a simple structured workflow:

### 1️⃣ UI Layout (VBox & HBox)
- `VBox` → Arranges components vertically
- `HBox` → Arranges buttons horizontally

### 2️⃣ Data Handling (ObservableList)
- Contacts are stored in `ObservableList<Contact>`
- TableView updates automatically when data changes

### 3️⃣ Event Handling
- Button clicks control operations
- Table row selection fills input fields
- Alerts handle validation errors

---

## 🧩 MVC Style

Even though this is a single-file project, it follows **MVC-like separation**:

### 🟢 Model
- `Contact` class
- Stores data: name, phone, email

### 🔵 View
- JavaFX UI (TextFields, Buttons, TableView)

### 🟠 Controller
- Event handlers (Add, Update, Delete, Clear)
- Manages user interaction

---

## ▶️ How to Run

### 🔹 Requirements
- JDK (JDK requires JavaFX SDK)
- JavaFX library installed
- IDE (NetBeans)

---

### 🔹 Run in IDE
1. Import project
2. Add JavaFX SDK if needed
3. Run `MainPhonecontactUI.java`

---

### 🔹 Run via Command Line 

```bash
javac main/phonecontactui/MainPhonecontactUI.java
java main.phonecontactui.MainPhonecontactUI
