# Guitar Inventory System 🎸

A Java-based system designed to manage a guitar inventory, focusing on Object-Oriented Analysis and Design (OOA&D) principles. This project is inspired by the "Head First OOA&D" methodology.

## 🧠 Design Principles Applied
- **Encapsulation:** Protecting guitar attributes through the `GuitarSpec` class.
- **Low Coupling:** Separating the search logic from the guitar entity.
- **Enums over Strings:** Using Enumerated types for Builders, Woods, and Types to avoid comparison errors and ensure type safety.

## 🛠️ Project Structure
- `model/`: Core entities representing the guitars and their specifications.
- `enums/`: Standardized types for guitar characteristics.
- `service/`: Inventory management and search algorithms.

## 🚀 How to Run
1. Clone the repository:
   ```bash
   git clone [https://github.com/IgorTH89/guitar-inventory-system.git](https://github.com/IgorTH89/guitar-inventory-system.git)
2. Compile and run the main class:
   ```bash
   javac com/igorth/guitars/app/FindGuitarTester.java
   java com.igorth.guitars.app.FindGuitarTester
