# Java Multithreading Counter Demo

## Project Description
This project demonstrates **multithreading in Java**, the problems of **race conditions**, and different approaches to **thread-safe counters**.  

It includes **three implementations of a counter**:

### 1. RaceConditionCounter ❌
- A simple implementation using a regular `int`, **not thread-safe**.  
- Threads can overwrite each other’s increments, causing **lost updates**.  
- Used to visually demonstrate **race conditions**.  

### 2. SafeSyncCounter ✅
- Implementation using `synchronized`.  
- Thread-safe because it locks on an internal object.  
- All increments are correct, but locks can **slow down execution** when there are many threads.  

### 3. SafeCounter ✅
- Implementation using `AtomicInteger`.  
- Modern thread-safe approach without explicit locks.  
- Performs increments **correctly and efficiently** in a multithreaded environment.  

---

## Example Output

![Example Output](https://github.com/phyphloran/multithreading/blob/main/result.png)

