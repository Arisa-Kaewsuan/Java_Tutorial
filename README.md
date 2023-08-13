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
    - สร้างตัวแปรอาเรย์/ประกาศตัวแปรชนิดอาเรย์  &nbsp;:&nbsp; ทำได้ 2 แบบคือ แบบไม่ระบุค่าประกาศอาเรย์ว่างๆไว้ รอเอาค่ามาใส่ ```String[] cars;``` กับแบบระบุค่า ใช้เครื่องหมายปีกกา {} ```String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};```
    - Access Array ```cars[0];```
    - Edit Array ```cars[0] = "Opel";```
    - ขนาดของ Array ```cars.length;```
    - Array 2 มิติ ```int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };```
   
  - &nbsp; ArrayList &nbsp;:&nbsp; ```import java.util.ArrayList;```
    - สร้างตัวแปรอาเรย์/ประกาศตัวแปร  &nbsp;:&nbsp; ```ArrayList<String> cars = new ArrayList<String>();``` 
    - Access ArrayList ```cars.get(0);```
    - เพิ่มข้อมูล ```cars.add("Mazda");```
    - ลดข้อมูล ```cars.remove(0);```
    - Edit ArrayList ```cars.set(0, "Opel");```
    - ขนาดของ ArrayList ```cars.size();```
   
  - &nbsp; Linked List &nbsp;:&nbsp; ```import java.util.LinkedList;```
    - สร้างตัวแปรอาเรย์/ประกาศตัวแปร  &nbsp;:&nbsp; ```LinkedList<String> cars = new LinkedList<String>();``` 
    - Access Linked List ```cars.get(0);```
    - เพิ่มข้อมูล ```cars.add("Mazda");```
    - ลบข้อมูล ```cars.remove(0);```
    - Edit Linked List ```cars.set(0, "Opel");```
    - ขนาดของ Linked List ```cars.size();```
    
  - &nbsp; String &nbsp;:&nbsp;
    - ดึงตัวอักษรในสตริงตำแหน่งที่ 0 ```str.charAt(0)```
    - ตัด whitespace หัว-ท้าย ```str.trim()```
    - ความยาวข้องข้อความ นับทุกตัวอักษรรวมเว้นวรรคด้วย ```str.length()```
    - เช็คว่ามีค่ามั้ย ```str.isEmpty()```
    - เช็คว่าสตริงสองตัวเท่ากันมั้ย ```str1.equals(str2)``` 
    
  - &nbsp; Math &nbsp;:&nbsp; ```Math.min(5, 10);``` &nbsp;&nbsp; ```Math.max(5, 10);``` &nbsp;&nbsp; ```Math.sqrt(64);``` &nbsp;&nbsp; ```Math.abs(-4.7);``` &nbsp;&nbsp; ```Math.random();``` &nbsp;&nbsp; ```Math.pow(x, y)``` 
 
  - &nbsp; [Hashmap](https://www.w3schools.com/java/java_hashmap.asp) &nbsp;:&nbsp; ```import java.util.HashMap;```
    - สร้างตัวแปรอาเรย์/ประกาศตัวแปร  &nbsp;:&nbsp; ```HashMap<String, String> capitalCities = new HashMap<String, String>();```
    - เพิ่มข้อมูล ```capitalCities.put("England", "London");```
    - Access ดึงข้อมูล ```capitalCities.get("England");```
    - ลบข้อมูล ```capitalCities.remove("England");```
    - ขนาดของ Hashmap ```capitalCities.size();```
    - Hashmap - foreach loop ```for (String i : capitalCities.keySet()) { System.out.println(i); }``` หรือ ```for (String i : capitalCities.values()) {System.out.println(i); }```
    
  - &nbsp; [Stack](https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html) &nbsp;:&nbsp;
    - สร้างตัวแปรอาเรย์/ประกาศตัวแปร  &nbsp;:&nbsp; ```Stack<Integer> stack = new Stack<Integer>();
    - เพิ่มข้อมูลลงแสต็ก ```stack_push(stack);```
    - ดึงข้อมูลมาดู และลบ ในแสต็ก```stack_pop(stack);```
    - ดึงมาดู ไม่ลบ ```stack_peek(stack);```
    - ค้นหา ```stack_search(stack, 2);``` 
 
  - &nbsp; [Queue](https://docs.oracle.com/javase/8/docs/api/java/util/Queue.html)

  - &nbsp; [Thread](https://expert-programming-tutor.com/tutorial/java/13_thread.php) &nbsp;:&nbsp;

                  เป็นคลาสที่ทำให้โปรแกรมของเรา ทำงานแบบ multi-tasking ได้ ซึ่งจะไม่ได้ใช้พื้นที่เยอะเหมือนโปรเซส (processes)
           เพราะ Thread มี stack, program counter และ local variable เป็นของตัวเอง แต่ใช้ทรัพยากรอื่นร่วมกันกับเธรด
           ตัวอื่นที่มีอยู่ในโปรเซสเดียวกัน เช่น memory, file handlers และ pre‐process state อื่น ๆ ก็เลยเรียกโปรเซสว่า
           “ heavyweight process” และเรียก Thread ว่าเป็น “lightweight process ” มีให้ใช้ 2 แบบ คือ

    - &nbsp; แบบ extends Thread &nbsp;:&nbsp; สร้างคลาส extends Thread  &nbsp;&nbsp;>>&nbsp;&nbsp;  สร้าง method run (Override) มาใช้ เขียนโค้ดกำหนดสิ่งที่อยากทำ &nbsp;&nbsp;>>&nbsp;&nbsp; แล้วเรียกใช้คลาส(new class) &nbsp;&nbsp;>>&nbsp;&nbsp; เรียกใช้เมธอด start มันก็จะวิ่งไปทำคำสั่งที่อยู่ใน method run
   
    - &nbsp; แบบ implements Runnable / anonymous class (คือคลาสย่อยในอีกคลาส) &nbsp;:&nbsp; ใช้การ new class thread  &nbsp;&nbsp;>>&nbsp;&nbsp;  แล้ว Anonymousclass run (Override) มาใช้ เขียนโค้ดกำหนดสิ่งที่อยากทำในบล็อก catch  และระบุการหยุดทำงาน ในบล็อก try ```Thread.sleep(50);```  50 millisec &nbsp;&nbsp;>>&nbsp;&nbsp;  เรียกใช้เมธอด start
       > นิยมใช้แบบนี้ทำ muti-Thread คือ สร้างการทำงานหลายๆอย่าง 1 งาน = 1 Thread แล้วเรียงการทำงานด้วยการสั่ง start เรียงกัน  แต่ถ้าเรากำหนด sleep ให้อันไหนน้อยกว่า แปลว่ามันหยุดพักน้อยกว่า มันก็จะทำงานได้มากกว่า 

<br/>

### 2. &nbsp; **JAVA OOP** &nbsp;🧠
  - &nbsp; concept  OOP &nbsp;:&nbsp;

           class  >>  class = object = คอนเซ็ปของ OOP คือมองฟีเจอร์ของโปรแกรมเป็นก้อนๆ ทำให้แยกเขียน แยกเทสได้
                      อ่านง่ายกว่าการเขียนแบบ  Procedural ที่เขียนเรียงๆมารันทีละบรรทัด การเขียนแบบ OOP เป็นมาตรฐาน
                      ที่ใช้ในการทำงานจริง โค้ดจะไม่รันไล่ทีละบรรทัด แต่จะรันจาก method main class/method ที่สร้างไว้
                      ก็จะถูกเรียกใช้ใน main
    
                         syntax ของ class  :  modifierบางทีก็ไม่ระบุ  ชื่อclass()
                         example  :  public  Person()
                            - modifier คือ ตัวบอกว่าใครใช้คลาสเราได้บ้าง ใช้ keyword public / private / protected
                              การระบุ modifier ให้ class/method/ตัวแปร  คือการ Encapsulation
    
    
                  >>  ในคลาสมี method (ทำอะไรได้) + variable (รับค่าอะไรบ้าง)
    
                         syntax ของ method  :  modifier  return-type ชื่อmethod(parameter)
                         example  :  public static void Employee(string name)
                            - return-type คือ บอกว่าค่าที่ส่งออกไปมีชนิดข้อมูลเป็นอะไร ถ้าไม่ส่งค่าออกออกใช้ void
    
    
                  >>  อยากใช้ method และ ตัวแปร ของคลาสอื่น ขี้เกียจเขียนใหม่ คือการ Inheritance
                      (คลาสลูก extends คลาสแม่ : การสืบทอด) เอามาใช้เลย
    
                  >>  อยากใช้ method ที่มีอยู่แล้ว แต่อยากเปลี่ยน parameter ที่รับเข้ามาใหม่ คือการ Polymophism
                      (Overloading : เมธอดที่ชื่อเหมือน แต่ parameter ต่าง) สร้าง method ใหม่ชื่อเดิม
                      แต่เปลี่ยน parameter

                  >>  อยากใช้ method ที่รับ parameter นั้นๆ แต่อยากให้มันทำงานต่างไปจากเดิม คือการ Overriding
                      (Overriding : เมธอดที่ชื่อเหมือน แต่ parameter เหมือน  แต่ทำงานต่างจากเดิม)
                      ใช้ @Override 

    
  - &nbsp; method &nbsp;:&nbsp;
    - การสร้างเมธอด &nbsp;:&nbsp;  เมธอด void ไม่ต้อง return ค่าไปยังจุดเรียกใช้ ```static void myMethod() {...}``` &nbsp;&nbsp; <br/> เมธอด return ค่าเป็น int ```static int plusMethodInt(int x, int y) {..}``` 
      
    - การเรียกใช้เมธอด แค่ระบุ argument ให้ตรง ถ้าไม่มีก็ไม่ต้องใส่ &nbsp;&nbsp; ```myMethod()``` &nbsp;&nbsp; ```myMethod(int x , int y)```
      > [ Note &nbsp;:&nbsp; parameter คือ การระบุ input/ตัวแปรที่รับเข้ามา ตอน &nbsp;&nbsp;" สร้าง "&nbsp;&nbsp; เมธอด  ส่วน argument  คือ การระบุ input/ตัวแปรที่รับเข้ามา ตอน &nbsp;&nbsp;" เรียกใช้ "&nbsp;&nbsp; เมธอด ](https://medium.com/odds-team/%E0%B9%84%E0%B8%A1%E0%B9%88%E0%B8%95%E0%B9%89%E0%B8%AD%E0%B8%87%E0%B8%A3%E0%B8%B9%E0%B9%89%E0%B8%81%E0%B9%87%E0%B9%84%E0%B8%94%E0%B9%89-argument-vs-parameter-%E0%B8%95%E0%B9%88%E0%B8%B2%E0%B8%87%E0%B8%81%E0%B8%B1%E0%B8%99%E0%B8%A2%E0%B8%B1%E0%B8%87%E0%B9%84%E0%B8%87-58107240d202)
      
    - recursive method (method = function อาจะเรียกต่างกันในแต่ละภาษา) คือ การเรียกใช้ function ตัวมันเองตรง return (general case) ทำให้เกิดลูป ดังนั้นต้องใช้ if-else มาสร้างเงื่อนไข (base case) ให้มันหลุดลูปด้วย 
    
  - &nbsp; class &nbsp;:&nbsp;
    - การสร้างคลาส &nbsp;:&nbsp; ```public class Cars {...}```
      
    - การระบุ constructor &nbsp;:&nbsp; คือ method ที่ชื่อเหมือนคลาส ถูกเรียกใช้ครั้งเดียวตอน new class ใช้ในการระบุ ค่าเริ่มต้น(initial value) ให้คลาส  &nbsp; &nbsp; #&nbsp; คล้ายๆการระบุ parameter ให้ method
      
    - การเรียกใช้คลาส &nbsp;:&nbsp; ต้อง new class ก่อน ```Person obj = new Person();``` แล้วเรียกใช้ method ผ่าน instance object ของคลาส ```obj.employee```
      > Note &nbsp;:&nbsp; class คือ object/ต้นแบบ ตอนเรา new class (เหมือน copy) ไปใช้สิ่งที่ได้เราจะเรียกว่า instance ของคลาส หรือ instance object / ตัว copy
    
  - &nbsp; [inheritance](https://www.w3schools.com/java/java_inheritance.asp) &nbsp;:&nbsp; ```class Car extends Vehicle {...}```
    
  - &nbsp; [polymorphism](https://www.w3schools.com/java/java_polymorphism.asp) &nbsp;:&nbsp; คือการเอา method ที่มีอยู่แล้วมาใช้ รับ parameter เหมือนเดิม แต่แก้โครงสร้างภายในให้มันทำงานต่างจากเดิม
 
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

  
