# 🎮 Number Guessing Game – Java Console Application

## 📌 Description
This is a simple console-based number guessing game written in Java. The computer randomly selects a number between **0 and 10**, and the player must try to guess it. After each guess, the program provides feedback on whether the guess was **too high**, **too low**, or **correct**. The game continues until the player guesses the correct number.

## 🧑‍💻 Author
**Ryan Hurlstone**  
Version: **1.0**

## 🚀 How to Run

1. Open the project in your favorite Java IDE (e.g., IntelliJ, Eclipse) or a code editor.
2. Make sure the file is named `Main.java` (or update the class name to match the file).
3. Compile and run the program.

```bash
javac Main.java
java Main
```

## 🛠 Features

- Random number generation between **0 and 10**
- User input using `Scanner`
- Feedback for each guess:
  - Too high
  - Too low
  - Correct
- Game loop continues until the correct number is guessed
- Graceful shutdown with a short delay using `Thread.sleep()`

## 📸 Example Output

```
========================================
= Welcome to the number guessing game! =
= This was created by Ryan Hurlstone ! =
========================================
Enter your guess (0 - 10): 5
Your guess is too low!
Enter your guess (0 - 10): 8
Your guess is too high!
Enter your guess (0 - 10): 6
You guessed the number correctly! Well done!
Closing scanner...
Scanner successfully closed

Thanks for playing, have a nice day!
```

## ✅ Concepts Practiced

- `Math.random()`
- Loops (`while`)
- User input (`Scanner`)
- Conditional logic (`if`, `else if`, `else`)
- Exception handling (`try-catch`)
- Thread delays (`Thread.sleep()`)

## 💡 Future Improvements

- Limit the number of guesses
- Add a replay option
- Track number of attempts
- Use a GUI with JavaFX or Swing
