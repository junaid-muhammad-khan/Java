# Java University Coursework

This repository contains Java coursework, practice exercises, labs, and course projects completed during university Java courses.

The content includes a combination of:
- Programming exercises based on textbook examples
- Lecture practice code
- Laboratory assignments
- Course projects
- Java programming concepts explored throughout the course

Some files are adapted from examples provided in course materials/books for learning purposes, while others are original implementations and solutions developed during the course.

## Directory index

| Folder | Contents |
|---|---|
| `Chap1`–`Chap3`, `Chap8`, `Chap9` | Textbook-aligned practice: data types, functions, points/parameters, collections (`Dictionary`, `Words`), and OOP/interfaces (`StaffMember`, `Encryptable`). |
| `Lecture3`–`Lecture9` | In-class practice: file I/O and scanning, arrays and static members, method overloading, searching/sorting algorithms, generics, recursion, and comparators. |
| `Lab2`–`Lab4`, `Lab6` | Graded lab assignments: a movie database, a hotel occupancy report, a survey/random-guess program, and a home-appliance class hierarchy. |
| `Project1` | **Advanced Vehicle Simulation System** — an interactive driving simulator with vehicle selection (hybrid/turbo/EV), route choice, a trip engine, and a generated receipt report. |
| `Project2` | **World Cup Simulator** — a round-robin tournament simulator with teams, players, weather effects, and a referee/scoring system. |

## Highlighted projects

### Project1 — Vehicle Simulation
`SimulationEngine`, `Vehicle`/`VehicleFactory`, `Intersection`, `TripResult`, and `ReceiptGenerator` work together to run a multi-trip driving session and produce a final consumption report.

### Project2 — World Cup Simulator
`Game`, `Person`/`Player`, and `Referee` simulate a round-robin football tournament with randomized weather and match outcomes.

## Topics covered

- Java syntax and fundamentals
- Variables and data types
- Conditional statements and loops
- Methods and functions
- Object-Oriented Programming (classes, encapsulation, inheritance, polymorphism)
- Arrays and data structures
- File handling
- Exception handling
- User input and output
- Sorting/searching algorithms and generics

## Running a file

Most files are self-contained. Compile and run any single-class example with:

```bash
javac Lecture8/GeometricObject.java
java -cp Lecture8 GeometricObject
```

For a project (e.g. Project1), compile all files in its folder together:

```bash
javac Project1/*.java
java -cp Project1 DrivingSimulation_sp26_KhanJ
```

## Note

This repository is for educational purposes. Some examples are based on textbook/course demonstrations.
