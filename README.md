Here is a clean, comprehensive, and professional `README.md` file designed for your project based exactly on the code you provided.

---

# Phone Contact Manager

A desktop-based JavaFX application that acts as a simple Phone Contact Manager. This application allows users to store, view, update, and delete contact details (Name, Phone Number, and Email) through an intuitive and clean graphical user interface (GUI).

---

## Features

* **Create (Add):** Add new contacts with Name, Phone, and Email fields. Includes validation to ensure no fields are left blank.
* **Read (Display):** View all added contacts instantly within a structured `TableView`.
* **Update:** Select a contact from the table, modify their details in the input fields, and save the changes dynamically.
* **Delete:** Remove unwanted or obsolete contacts from the database list with a single click.
* **Clear:** Quickly reset the input fields and deselect current rows to start fresh.

---

## Prerequisites

To run this application, ensure you have the following installed on your system:

* **Java Development Kit (JDK):** Version 8 or higher (If using JDK 11+, ensure the JavaFX SDK is explicitly configured).
* **JavaFX SDK:** Required if you are utilizing a newer version of JDK that does not bundle JavaFX.

---

## How it Works

The application architecture relies on three main JavaFX pillars:

1. **UI Layout (`VBox` & `HBox`):** Arranges input fields vertically and alignment buttons horizontally for an organized workflow.
2. **Data Binding (`ObservableList`):** The data model (`Contact`) maps directly into the `TableView` columns using `PropertyValueFactory`. Any additions or deletions dynamically refresh the view.
3. **Event Handling:** Mouse clicks and button triggers manage state transitions (such as populating text fields upon row selection or triggering alert warnings for empty inputs).

---

## Code Architecture Overview

The single file `MainPhonecontactUI.java` encapsulates both the application layout logic and the underlying data model:

```
└── main.phonecontactui
    └── MainPhonecontactUI.java
        ├── MainPhonecontactUI (Extends Application)
        └── Contact (Static Inner Model Class)

```

### Component Breakdown

* **`MainPhonecontactUI`**: Handles the primary window stage creation, button actions (`addBtn`, `updateBtn`, `deleteBtn`, `clearBtn`), text field initialization, and Table view generation.
* **`Contact`**: A static nested class inside the main UI class serving as the data model object. It contains encapsulated string properties for `name`, `phone`, and `email` alongside their respective getter and setter methods.

---

## Running the Project

### Using an IDE (IntelliJ IDEA, Eclipse, or NetBeans)

1. Import the project folder into your favorite IDE.
2. Ensure your project's Build Path includes the **JavaFX libraries**.
3. Run the `MainPhonecontactUI.java` file directly.

### Using Command Line (JDK 8)

Navigate to your project root directory and execute:

```bash
javac main/phonecontactui/MainPhonecontactUI.java
java main.phonecontactui.MainPhonecontactUI

```
