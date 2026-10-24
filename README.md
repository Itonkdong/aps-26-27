# Algorithms and Data Structures — 2026/2027

Classroom exercises, Java examples, and presentations for the course. Each exercise includes starter code, shared data structures, and a runnable `Main`, so you can start solving it without preparing the supporting code or adding libraries.

## Start an exercise

1. Open the repository in IntelliJ IDEA and find the exercise's `starters` package, for example `mk.ukim.finki.aud.aud1.ex1.starters`.
2. Copy and paste the entire package into the same exercise package, giving your copy a new name such as `practice`. When you copy the package through IntelliJ's Project view, IntelliJ updates the package declarations and references for you.
3. Open the exercise class in your copy, such as `ChangeArrays.java`, and implement its unfinished methods.
4. Run your copy of `Main.java` to try the provided examples. Add more cases as you work.

For example, your working copy would be `mk.ukim.finki.aud.aud1.ex1.practice`, stored in `src/mk/ukim/finki/aud/aud1/ex1/practice/`.

If you copy files manually, update their folder paths, `package` declarations, and any imports referring to the copied classes to match the new package. Keep imports from `mk.ukim.finki.dataStructures` pointing to the shared implementations already included in the project.

## Repository layout

All Java packages are under `src/mk/ukim/finki/`. The following example illustrates the layout using placeholder names:

```text
aud/
├── audN/
│   └── exN/
│       ├── starters/      Starting point for your own solution
│       │   ├── Main.java
│       │   └── ExerciseName.java
│       └── solved/        Code developed during class
└── presentations/         Classroom presentations
dataStructures/
└── structure/
    ├── Structure.java
    └── tester/
        └── StructureTester.java
```

Each `audN` package represents a classroom session, with individual exercises in `exN` packages. Within each exercise, `Main` prepares the input and calls the methods in a separate exercise class. The `solved` package starts with the same scaffold and is completed during class.

The `dataStructures` package contains reusable implementations. Each structure has a `tester` subpackage with a runnable example demonstrating its methods.

## Credits

Organized and maintained by **Viktor Kostadinoski (itonkdong)** for the course **Algorithms and Data Structures** course at **FSCE (ФИНКИ)**, 2026/2027. This repository reorganizes the original course exercises and code for easier use during class and independent practice.

The original exercises and code are also available as ZIP files on the course page if you prefer that format.
