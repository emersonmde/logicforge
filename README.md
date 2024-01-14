# LogicForge

## Overview

LogicForge is a Java-based rules engine that provides a structured and efficient way to define and evaluate complex logic expressions. Its modularity and extensibility make it suitable for applications requiring dynamic rule evaluation, such as business rule engines or decision-making systems.

## Features

- **Modular Design**: LogicForge's design is highly modular, allowing for easy extension and customization.
- **Type-Safe Expressions**: Supports various primitive types and ensures type safety in expressions.
- **Efficient Evaluation**: Optimized for efficient evaluation of complex logic expressions.

## Project Structure

LogicForge is structured with a clear separation of core logic, expression types, and utility functions:

- `logicforge`: Core functionalities of the rules engine.
- `ast`: Abstract Syntax Tree (AST) components, including various expression types and primitives.
- `ast.types`: Implementation of primitive data types like boolean, integer, and string.
- `ast.functions`: Logical functions such as Equals and GreaterThan.

## Getting Started

### Prerequisites

- Java JDK 11 or later
- Gradle 6.0 or later

### Building the Project

LogicForge uses Gradle for easy building and dependency management. To build the project, follow these steps:

```bash
git clone https://github.com/emersonmde/logicforge.git
cd logicforge
./gradlew build
```

This will compile the project, run tests, and generate a JAR file.

## Contributing

Any contributions to the LogicForge project are welcome. Please feel free to submit pull requests or open issues for bugs and feature requests.

## License

LogicForge is licensed under the MIT License. See the [LICENSE](LICENSE) file for more details.
