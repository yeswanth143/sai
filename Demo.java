
class Demo{
public static void main(String args[]){
 for(int i=0;i<9;i++){
     System.out.print("5");
   }
System.out.println();
for(int j=0;j<9;j++){   
if(j==0||j==8){
    System.out.print("5");
   }
else {
   System.out.print("4");
}
}
System.out.println();
for(int i=0;i<9;i++){
if(i==0){
   System.out.print("54");
}
else if(i==6){
System.out.print("45");
}
else{
 if(i==7||i==8) break;
  System.out.print("3");
}
}
}
}

