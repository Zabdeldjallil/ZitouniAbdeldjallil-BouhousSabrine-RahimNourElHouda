
class AbsFactory {
	//use getPlan method to get object of type Plan   
    public applying getPlan(String planType){  
         if(planType == null){  
          return null;  
         }  
       if(planType.equalsIgnoreCase("Standard")) {  
              return new applying();  
            }   
        else if(planType.equalsIgnoreCase("Premium")){  
             return new applying();  
         }   
         
   return null;  
}  
}
