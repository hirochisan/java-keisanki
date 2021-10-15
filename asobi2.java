import java.util.Scanner;
import java.lang.Math;
import java.util.Random;
class asobi2{
 public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
Random rnd = new Random();	
int m = 1;
while (m == 1)
{System.out.println("1:tasizan_2:hikizan_3:kakezan_4:warizan_5:ruizyou_6:heihoukon_7:rippoukon_8:ransuuseisei");
int q =scanner.nextInt();
switch(q){
case 1:
System.out.println("please write the number you want to add");
double a = scanner.nextFloat();
System.out.println("+");
double b = scanner.nextFloat();
System.out.println("The answer to addition is"+(a +b));
break;
case 2:
System.out.println("Please write the number you want to subtract");
double c = scanner.nextFloat();
System.out.println("-");
double d = scanner.nextFloat();
System.out.println("The answer to subtraction is" + (c - d));
break;
case 3:
System.out.println("Please write the number you want to multiply");
double kakerareru = scanner.nextFloat();
System.out.println("*");
double kakeru = scanner.nextFloat();
System.out.println("The answer to multiplication is"+(kakerareru*kakeru));
break;
case 4:
System.out.println("Please write the number you want to divide");
double warareru = scanner.nextFloat();
System.out.println("/");
double waru = scanner.nextFloat();
System.out.println("warizannokataeha" + (warareru / waru));
break;
case 5:
System.out.println("ruizyousasetaikazuwokaitekudasai");
double ruizyou1 = scanner.nextFloat();
System.out.println("ruizyou");
double ruizyou2 = scanner.nextFloat();
System.out.println(ruizyou1+"no"+ruizyou2+"zyouha"+Math.pow(ruizyou1,ruizyou2));
break;
case 6:
System.out.println("heihoukonnokazuwokaitekudasai");
double heihoukon = scanner.nextFloat();
System.out.println(heihoukon+"noheihoukonha"+Math.sqrt(heihoukon));
break;
case 7:
System.out.println("rippokonnokazuwokaitekudasai");
double rippoukon = scanner.nextFloat();
System.out.println(rippoukon+"norippoukonha"+Math.cbrt(rippoukon));
break;
case 8:
System.out.println("hanniwositeisitekudasai");
int hani1 = scanner.nextInt();
System.out.println("~");
int hani2 = scanner.nextInt();
int hani3 = hani2-hani1;
int random = rnd.nextInt(hani3 + 1)+hani1;
System.out.println(hani1+"kara"+hani2+"noaidanoransuuha"+random);
}
System.out.println("0:tuzukeru_1:owaru");
int l = scanner.nextInt();
if (l == 1)
break;


}}
}

