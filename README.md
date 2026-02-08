# 🔥 FLAMES Game in Java

This project implements the classic **FLAMES relationship game** using **Java**.  
It takes two names as input, removes common characters, counts the remaining letters, and determines the relationship using the FLAMES logic.

---

## 📌 What is FLAMES?

FLAMES stands for:

- **F** – Friends  
- **L** – Love  
- **A** – Affection  
- **M** – Marriage  
- **E** – Enemies  
- **S** – Siblings  

The relationship is calculated based on the number of non-common characters between two names.

---

## ⚙️ How the Program Works

1. Read two names from the user  
2. Remove all common characters from both names  
3. Count the remaining characters  
4. Use the count to eliminate letters from `"FLAMES"` one by one  
5. The last remaining letter indicates the relationship  

---

## 🧠 Core Logic Used

- String manipulation
- `indexOf()` for character checking
- `substring()` for removing characters
- `while` loop for FLAMES elimination

---

