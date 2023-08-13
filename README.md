# JAVA  &nbsp;PROGRAMMING &nbsp; <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="40" height="40"/> </a> <a href="https://www.python.org" target="_blank" rel="noreferrer"> 

- &nbsp; จะเริ่มเขียนโปรแกรมภาษา java ต้องเตรียม environment ยังไง ?

       1.  ต้องมีตัวแปรภาษาจาวา (compliler)  :  java compliler ชื่อ JDK / JRE java พัฒนาโดยบริษัท
           sun micro-system แต่ปัจจุบันถูกบริษัท Oracle เข้าซื้อ java จึงกลายเป็นของบริษัท Oracle

       2.  ต้องมี editor ที่ใช้ในการเขียน และ debug โค้ด  :  มีหลายโปรแกรมให้เลือก เช่น  netbean ,
           Eclipse , JDeveloper

       3.  เริ่มเขียนโปรแกรมได้เลยโดย  :  เปิดโปรแกรม editor ที่เราโหลดมา >> create java project
           >> create class ลองเขียนโปรแกรมแรกง่ายๆด้วยภาษา java เป็นการเทส เช่น เขียนโปรแกรมให้ปริ้น
           Hello World ออกหน้าจอ  >> ลองกด run 
   > [ทาง Oracle มีแนะนำ Editor ไว้ 🔗](https://developer.oracle.com/languages/ide.html)

<br/><br/><br/>

## JAVA &nbsp;SYNTAX
### [1. &nbsp; **BASIC JAVA**](https://www.w3schools.com/java/java_syntax.asp) &nbsp;🧠
  - &nbsp; syntax พื้นฐานของ java &nbsp;:&nbsp;
    - &nbsp; แบ่งบล็อคคำสั่งด้วยเครื่องหมายปีกกา " {} " และจบ 1 คำสั่งต้องปิดท้ายด้วยเซมิโคลิน " ; "
    - &nbsp; ถ้าใช้ Eclipse เวลาเราใช้ classที่javaมีให้ใช้ หรือก็คือพวกคำสั่งพื้นฐาน(build-in class/method) ต้อง import เข้ามาก่อนถึงจะใช้งานได้ โปรแกรม eclipse จะช่วยเรา import ให้อัติโนมัติ ดังนั้น ไม่จำเป็นต้องจำได้ ให้เห็นผ่านๆ ใช้บ่อยๆ มันจะจำได้ไปเอง
    
  - &nbsp; input &nbsp;:&nbsp;
    - ```import java.util.Scanner;```
    - ```Scanner sc = new Scanner(System.in);```
    - รับ input เป็นสตริง ```String userName = sc.nextLine();```
    - รับ input เป็นเลขจำนวนเต็ม ```int age = sc.nextInt();```
    - รับ input เป็นเลขทศนิยม ```double salary = sc.nextDouble();```
    
  - &nbsp; output &nbsp;:&nbsp;
    - ปริ้นแบบขึ้นบรรทัดใหม่ ```System.out.println("Hello World! ");```
    - ปริ้นแบบมี format เช่น ปริ้นเลขทศนิยม 2 ตำแหน่ง ```System.out.printf(“%.2f”, 12```
 
  - &nbsp; comment &nbsp;:&nbsp; ```/* multiline */``` &nbsp;&nbsp; ```// single line```
    
  - &nbsp; condition &nbsp;:&nbsp;
    - If - else condition ```if() - else if() - else```
    - Ternary Condition ```String result = (time < 18) ? "Good day." : "Good evening.";```
    - Switchcase ```switch (case)```
    
  - &nbsp; loop &nbsp;:&nbsp;
    - While Loop ```ค่าเริ่มต้น while (condition){ เพิ่มค่า/ลดค่า }```
    - For Loop ```for (int i = 0; i < 5; i++) {...}```
    - Foreach Loop  &nbsp;:&nbsp;  ใช้วนลูปอ่านค่าใน array ```for (String i : arr)```
    - Infinite Loop ```while (true) {...}```
    - Break Loop ```break;```
    - Continue Loop ```continue;```
    
  - &nbsp; ภาษา java มีชนิดข้อมูล (Data type) อะไรบ้าง &nbsp;:&nbsp; มี 2 ประเภท
    - &nbsp; Primitive Data Types &nbsp;:&nbsp; ตัวแปรธรรมดา ```Integer``` ```BigInteger``` ```Float``` ```Double``` ```Char``` ```String``` ```Short``` ```Long``` &nbsp;&nbsp;&nbsp;&nbsp;
      
    - &nbsp; Reference/Object Data Types &nbsp;:&nbsp; ตัวแปรแบบชี้พ้อยเตอร์จะมีโครงสร้างในการเก็บ เก็บเป็นก้อนๆ เก็บได้เยอะ เลยต้องมีพ้อยเตอร์ชี้  สามารถ inplement คือเขียนเป็นคลาสขึ้นมาใช้เองได้เหมือนที่เรียนใน Data Structure แต่ใน java ก็ทำไว้ให้เรียกใช้ได้เหมือนกันเรียก (build-in method) ```Array``` ```ArrayList``` ```Linked List``` ```Hashmap``` ```Stack``` ```Queue``` ```Tree (ต้อง implement เอง)```
    
  - &nbsp; Array &nbsp;:&nbsp;
    - สร้างตัวแปรอาเรย์ ``` ```
    - Access Array ``` ```
    - Edit Array ``` ```
    
  - &nbsp; String &nbsp;:&nbsp;
    - ดึงตัวอักษรในสตริงตำแหน่งที่ 0 ```str.charAt(0)```
    - ตัด whitespace หัว-ท้าย ```str.trim()```
    - ความยาวข้องข้อความ นับทุกตัวอักษรรวมเว้นวรรคด้วย ```str.length()```
    - เช็คว่ามีค่ามั้ย ```str.isEmpty()```
    - เช็คว่าสตริงสองตัวเท่ากันมั้ย ```str1.equals(str2)``` 
    
  - &nbsp; Math &nbsp;:&nbsp; ```Math.min(5, 10);``` &nbsp;&nbsp; ```Math.max(5, 10);``` &nbsp;&nbsp; ```Math.sqrt(64);``` &nbsp;&nbsp; ```Math.abs(-4.7);``` &nbsp;&nbsp; ```Math.random();``` &nbsp;&nbsp; ```Math.pow(x, y)``` 
 
  - &nbsp; [Hashmap](https://www.w3schools.com/java/java_hashmap.asp) &nbsp;:&nbsp; ``` ``` &nbsp;&nbsp; ``` ``` &nbsp;&nbsp; ``` ```
    
  - &nbsp; [Stack](https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html) &nbsp;:&nbsp; ``` ``` &nbsp;&nbsp; ``` ``` &nbsp;&nbsp; ``` ``` &nbsp;&nbsp; ``` ``` &nbsp;&nbsp; ``` ``` &nbsp;&nbsp;
 
  - &nbsp; [Queue](https://docs.oracle.com/javase/8/docs/api/java/util/Queue.html)

<br/>

### 2. &nbsp; **JAVA OOP** &nbsp;🧠
  - &nbsp; method &nbsp;:&nbsp; การสร้างเมธอด &nbsp; ``` ``` &nbsp;&nbsp; การเรียกใช้เมธอด ``` ```
    
  - &nbsp; class &nbsp;:&nbsp; การสร้างคลาส &nbsp; ``` ``` &nbsp;&nbsp; การระบุ constructor ``` ``` &nbsp;&nbsp; การเรียกใช้คลาส ``` ```
    
  - &nbsp; inheritance &nbsp;:&nbsp; ``` ```
    
  - &nbsp; polymorphism &nbsp;:&nbsp; ``` ```
 
<br/>

### 3. &nbsp; **JAVA DATABASE** &nbsp;🧠
  - &nbsp; MySQL &nbsp;:&nbsp;
 
<br/>

### 4. &nbsp; **JAVA GUI** &nbsp;🧠
  - &nbsp; JFrame คืออะไร ? &nbsp;:&nbsp;
  - &nbsp; JPanel คืออะไร ? &nbsp;:&nbsp;
  - &nbsp; EventListener คืออะไร ? &nbsp;:&nbsp;
  - &nbsp; Graphic g คืออะไร ? &nbsp;:&nbsp;
  - &nbsp; เริ่มทำโปรแกรม GUI ยังไง ? &nbsp;:&nbsp;
  - &nbsp; java awt คืออะไร ? &nbsp;:&nbsp;
 
<br/>

### 5. &nbsp; **JAVA WEB** &nbsp;🧠
  - &nbsp; เริ่มทำ web ด้วย java ยังไง ? &nbsp;:&nbsp;
  - &nbsp; javaEE คืออะไร ? &nbsp;:&nbsp;
  - &nbsp; java swing คืออะไร ? &nbsp;:&nbsp;

 <br/><br/><br/>

## EXERCISES  
- &nbsp; **BEGINNER**
  - &nbsp;  คำถามเหมาะกับการเตรียมตัวสัมภาษณ์งาน &nbsp;:&nbsp; [code-exercises](https://code-exercises.com/) &nbsp;&nbsp; [pythonistaplanet](https://pythonistaplanet.com/java-programming-exercises-with-solutions/) &nbsp;&nbsp; [edabit](https://edabit.com/challenges/java)
    
  - &nbsp;  คำถามเหมาะกับการฝึก java OOP/ Data Structure มีอธิบายโค้ด + flowchart ด้วย &nbsp;:&nbsp; [w3resource](https://www.w3resource.com/java-exercises/index-polymorphism.php)
    
  - &nbsp;  เหมาะใช้ฝึก logic ฝึกให้คุ้นกับ syntax ภาษา java &nbsp;:&nbsp;
    - &nbsp; [javaforaliens](https://www.javaforaliens.com/files/jfa13-exe-1-20-E.pdf) &nbsp;:&nbsp;  เป็นเหมือนหนังสือ workbook มีคำถามเกี่ยวกับ java แล้วก็โจทย์ให้ทำเยอะมาก แล้วยังมีเฉลยด้วย
    - &nbsp; [geeksforgeeks](https://www.geeksforgeeks.org/java-programming-examples/) &nbsp;:&nbsp; เป็นโจทย์ที่ช่วยฝึก logic เป็นโจทย์ที่มักเจอในข้อสอบมหาลัยด้วย
    - &nbsp; [codingbat](https://codingbat.com/java/Map-1)  &nbsp;:&nbsp;  โจทย์ recursion เยอะดี       
    - &nbsp; [www3.ntu.edu.sg](https://www3.ntu.edu.sg/home/ehchua/programming/java/J2a_BasicsExercises.html#zz-14.4) &nbsp;:&nbsp; มีอธิบาย Algorithm sorting (bubble,selection,insertion,quick,merge,heap)
   
 <br/>

- &nbsp; **INTERMEDIATE** <br/>
  &nbsp; : &nbsp; learnning by doing java project with source code
  
  - &nbsp; มีอธิบาย tech stack ที่ใช้ และสามารถโหลดโค้ดมาลองรัน หรืออ่านทำความเข้าใจได้ &nbsp;:&nbsp; [projectsgeek](https://projectsgeek.com/) &nbsp;&nbsp; [javatpoint](https://www.javatpoint.com/free-java-projects)  &nbsp;&nbsp; [interviewbit](https://www.interviewbit.com/blog/java-projects/) &nbsp;&nbsp; [hackr.io](https://hackr.io/blog/java-projects) &nbsp;&nbsp; [freeprojectz](https://www.freeprojectz.com/java-projects) &nbsp;&nbsp; [projectworlds](https://projectworlds.in/java-projects-with-source-code/) &nbsp;&nbsp; [projectabstracts](https://projectabstracts.com/simple-java-projects-with-source-code-free-download#free) &nbsp;&nbsp; [code-projects](https://code-projects.org/c/languages/project/javaprojects/) &nbsp;&nbsp; [kashipara](https://www.kashipara.com/project/category/download_java-project-source-code_1)

  
