class Leapyearr{
public static void main (String [] args ){
int year=2997;
if(year%4==0){
if(year%100==0){
if(year%400==0)
{
System.out.println("leap year");
}

else
{
System .out.println("year is  not a leap");
}
}
else
{
System .out.println("leap year");
}
}
else
{
System .out.println("year is  not a leap");
}
}
}