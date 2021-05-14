object Assignment_1 extends App{
  
  //Create the function Convert Fahrenheit
  def Convert_Temp(celcius:Double):Double={
       return celcius*1.8+3.2;
  }
   
   //Create the Volume function 
   def Volume(radius:Double):Double={
      var Pi =3.14;
      return 4/3*Pi*radius*radius*radius;
   }
  //Create the Total Cost
   def Total_cost(price:Double,number_copies:Int):Double={
      var discount = price*(40/100);
      var Total =price - discount; 
      if(number_copies<50){
         Total=Total+3;
      }else{
         Total=(Total+3)+(0.75*(number_copies-50));
       }
     return Total
   }


    println("Convert Fahrenheit : " + Convert_Temp(35));
    println("Volume of The Sphere : " +Volume(5));
    println("Total Cost of Copies : " +Total_cost(24.95,60));}
  

