# JAVA  &nbsp;PROGRAMMING &nbsp; <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="40" height="40"/> </a> <a href="https://www.python.org" target="_blank" rel="noreferrer"> 

- &nbsp; จะเริ่มเขียนโปรแกรมภาษา java ต้องเตรียม environment ยังไง ?

       1.  ต้องมีตัวแปรภาษาจาวา (compliler)  :  java compliler ชื่อ JDK / JRE java พัฒนาโดยบริษัท sun micro-system
           แต่ปัจจุบันถูกบริษัท Oracle เข้าซื้อ java จึงกลายเป็นของบริษัท Oracle

       2.  ต้องมี editor ที่ใช้ในการเขียน และ debug โค้ด  :  มีหลายโปรแกรมให้เลือก เช่น  netbean , Eclipse , JDeveloper

       3.  เริ่มเขียนโปรแกรมได้เลยโดย  :  เปิดโปรแกรม editor ที่เราโหลดมา >> create java project  >> create class
           ลองเขียนโปรแกรมแรกง่ายๆด้วยภาษา java เป็นการเทส เช่น เขียนโปรแกรมให้ปริ้น Hello World ออกหน้าจอ  >> ลองกด run 
   > [ทาง Oracle มีแนะนำ Editor ไว้ 🔗](https://developer.oracle.com/languages/ide.html)

<br/>

## JAVA &nbsp;SYNTAX
- &nbsp; [**BASIC JAVA**](https://www.w3schools.com/java/java_syntax.asp)
  - &nbsp; syntax พื้นฐานของ java &nbsp;:&nbsp;
    - &nbsp; แบ่งบล็อคคำสั่งด้วยเครื่องหมายปีกกา " {} " และจบ 1 คำสั่งต้องปิดท้ายด้วยเซมิโคลิน " ; "
    - &nbsp; ถ้าใช้ Eclipse เวลาเราใช้ classที่javaมีให้ใช้ หรือก็คือพวกคำสั่งพื้นฐาน(build-in class/method) ต้อง import เข้ามาก่อนถึงจะใช้งานได้ โปรแกรม eclipse จะช่วยเรา import ให้อัติโนมัติ ดังนั้น ไม่จำเป็นต้องจำได้ ให้เห็นผ่านๆ ใช้บ่อยๆ มันจะจำได้ไปเอง
    
  - &nbsp; input &nbsp;:&nbsp;  ``` ``` &nbsp;:&nbsp; ``` ```
    
  - &nbsp; output &nbsp;:&nbsp; ``` ```
 
  - &nbsp; comment &nbsp;:&nbsp; ``` ```
    
  - &nbsp; condition &nbsp;:&nbsp; ``` ``` &nbsp;&nbsp; Ternary Condition ``` ``` &nbsp;&nbsp; Switchcase ``` ```
    
  - &nbsp; loop &nbsp;:&nbsp; While Loop ``` ``` &nbsp;&nbsp; For Loop ``` ``` &nbsp;&nbsp; Infinite Loop ``` ``` &nbsp;&nbsp; Break Loop ``` ``` &nbsp;:&nbsp; Continue Loop ``` ```
    
  - &nbsp; ภาษา java มีชนิดข้อมูล (Data type) อะไรบ้าง &nbsp;:&nbsp;
    - &nbsp; Primitive Data Types &nbsp;:&nbsp; ตัวแปรธรรมดา ```Integer``` ```BigInteger``` ```Float``` ```Double``` ```Char``` ```String``` ```Short``` ```Long``` &nbsp;&nbsp;&nbsp;&nbsp;
      
    - &nbsp; Reference/Object Data Types &nbsp;:&nbsp; ตัวแปรแบบชี้พ้อยเตอร์จะมีโครงสร้างในการเก็บ เก็บเป็นก้อนๆ เก็บได้เยอะ เลยต้องมีพ้อยเตอร์ชี้  สามารถ inplement คือเขียนเป็นคลาสขึ้นมาใช้เองได้เหมือนที่เรียนใน Data Structure แต่ใน java ก็ทำไว้ให้เรียกใช้ได้เหมือนกันเรียก (build-in method) ```Array``` ```ArrayList``` ```Linked List``` ```Hashmap``` ```Stack``` ```Queue``` ```Tree (ต้อง implement เอง)```
    
  - &nbsp; Array &nbsp;:&nbsp; สร้างตัวแปรอาเรย์ ``` ``` &nbsp;&nbsp; Access Array ``` ``` &nbsp;&nbsp; Edit Array ``` ```
    
  - &nbsp; String &nbsp;:&nbsp; ``` ``` &nbsp;&nbsp; ``` ``` &nbsp;&nbsp; ``` ``` &nbsp;&nbsp; ``` ``` &nbsp;&nbsp; ``` ``` &nbsp;&nbsp;
    
  - &nbsp; Math &nbsp;:&nbsp; หา min ``` ``` &nbsp;&nbsp; หา max ``` ``` &nbsp;&nbsp; หาค่าเฉลี่ย ``` ``` &nbsp;&nbsp; ค่าคงที่ PI ``` ``` &nbsp;&nbsp; ``` ``` &nbsp;&nbsp;
 
  - &nbsp; [Hashmap](https://www.w3schools.com/java/java_hashmap.asp) &nbsp;:&nbsp; ``` ``` &nbsp;&nbsp; ``` ``` &nbsp;&nbsp; ``` ```
    
  - &nbsp; [Stack](https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html) &nbsp;:&nbsp; ``` ``` &nbsp;&nbsp; ``` ``` &nbsp;&nbsp; ``` ``` &nbsp;&nbsp; ``` ``` &nbsp;&nbsp; ``` ``` &nbsp;&nbsp;
 
  - &nbsp; [Queue](https://docs.oracle.com/javase/8/docs/api/java/util/Queue.html)

<br/>

- &nbsp; **JAVA OOP**
  - &nbsp; method &nbsp;:&nbsp; การสร้างเมธอด &nbsp; ``` ``` &nbsp;&nbsp; การเรียกใช้เมธอด ``` ```
    
  - &nbsp; class &nbsp;:&nbsp; การสร้างคลาส &nbsp; ``` ``` &nbsp;&nbsp; การระบุ constructor ``` ``` &nbsp;&nbsp; การเรียกใช้คลาส ``` ```
    
  - &nbsp; inheritance &nbsp;:&nbsp; ``` ```
    
  - &nbsp; polymorphism &nbsp;:&nbsp; ``` ```
 
<br/>

- &nbsp; **JAVA DATABASE**
  - &nbsp; MySQL &nbsp;:&nbsp;
 
<br/>

- &nbsp; **JAVA GUI**
  - &nbsp; JFrame คืออะไร ? &nbsp;:&nbsp;
  - &nbsp; JPanel คืออะไร ? &nbsp;:&nbsp;
  - &nbsp; EventListener คืออะไร ? &nbsp;:&nbsp;
  - &nbsp; Graphic g คืออะไร ? &nbsp;:&nbsp;
  - &nbsp; เริ่มทำโปรแกรม GUI ยังไง ? &nbsp;:&nbsp;
  - &nbsp; java awt คืออะไร ? &nbsp;:&nbsp;
 
<br/>

- &nbsp; **JAVA WEB**
  - &nbsp; เริ่มทำ web ด้วย java ยังไง ? &nbsp;:&nbsp;
  - &nbsp; javaEE คืออะไร ? &nbsp;:&nbsp;
  - &nbsp; java swing คืออะไร ? &nbsp;:&nbsp;

 <br/><br/>

## EXERCISES  
- &nbsp; **BEGINNER**
  - &nbsp;  คำถามเหมาะกับการเตรียมตัวสัมภาษณ์งาน &nbsp;:&nbsp; [code-exercises](https://code-exercises.com/) &nbsp;&nbsp; [pythonistaplanet](https://pythonistaplanet.com/java-programming-exercises-with-solutions/) &nbsp;&nbsp; [edabit](https://edabit.com/challenges/java)
    
  - &nbsp;  คำถามเหมาะกับการฝึก java OOP/ Data Structure มีอธิบายโค้ด + flowchart ด้วย &nbsp;:&nbsp; [w3resource](https://www.w3resource.com/java-exercises/index-polymorphism.php)
    
  - &nbsp;  เหมาะใช้ฝึก logic ฝึกให้คุ้นกับ syntax ภาษา java &nbsp;:&nbsp;
    - &nbsp; [javaforaliens](https://www.javaforaliens.com/files/jfa13-exe-1-20-E.pdf) &nbsp;:&nbsp;  เป็นเหมือนหนังสือ workbook มีคำถามเกี่ยวกับ java แล้วก็โจทย์ให้ทำเยอะมาก แล้วยังมีเฉลยด้วย
    - &nbsp; [geeksforgeeks](https://www.geeksforgeeks.org/java-programming-examples/) &nbsp;:&nbsp; เป็นโจทย์ที่ช่วยฝึก logic เป็นโจทย์ที่มักเจอในข้อสอบมหาลัยด้วย
    - &nbsp; [codingbat](https://codingbat.com/java/Map-1)  &nbsp;:&nbsp;  โจทย์ recursion เยอะดี       
    - &nbsp; [www3.ntu.edu.sg](https://www3.ntu.edu.sg/home/ehchua/programming/java/J2a_BasicsExercises.html#zz-14.4) &nbsp;:&nbsp; มีอธิบาย Algorithm sorting (bubble,selection,insertion,quick,merge,heap)
  

  
