# Java Lexical Analyzer

A custom-built Lexical Analyzer (Lexer) written in Java — designed to tokenize source code and simulate how compilers start interpreting your code.

This project explores the first stage of compilation: **lexical analysis**. It breaks down input into meaningful tokens such as keywords, identifiers, literals, symbols, and operators. Built with a focus on clean design, modular structure, and extendability, it’s an ideal foundation for building a parser, interpreter, or mini-compiler.

---

## 🔍 What It Does

- Reads `.java` or `.txt` source files
- Splits and classifies tokens (keywords, literals, symbols, etc.)
- Supports whitespace and comment handling
- Identifies malformed tokens and logs errors
- Outputs structured, JSON-style tokens for further processing

---

## 📌 Sample 

### 📌 Sample Input

```java
int x = 10;
[
  Token{type='KEYWORD', value='int'},
  Token{type='IDENTIFIER', value='x'},
  Token{type='OPERATOR', value='='},
  Token{type='LITERAL', value='10'},
  Token{type='SYMBOL', value=';'}
]
````

As a third-year Computer Science student passionate about systems and full-stack development, I wanted to deepen my understanding of how compilers work under the hood.  
Inspired by Kunal Kushwaha’s DSA roadmap, I built this lexer to bridge theory with hands-on practice.

## ⚙️ Technologies Used

- **Java (JDK 17+)**
- **Object-Oriented Programming**
- **Regex for token matching**
- **File I/O and CLI execution**




