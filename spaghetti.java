import java.util.HashMap;public class spaghetti{static class trueOrFalseObject {
                                                                                                                                                    String trueOrFalse;trueOrFalseObject(String trueOrFalse) {
this.trueOrFalse = trueOrFalse;
                                                                                                                                                                                                                                                                                                                                                                                                                    }
 boolean trueOrFalse() {                                                                                return this.trueOrFalse();
        }boolean convertNumberToBoolean(String trueOrFalse) {if (convertStringToNumber(trueOrFalse) == 0) {return true;} else 
                                                                                                                                                                                                                                                                                                                                                                                            if (convertStringToNumber(trueOrFalse)
                                                                                                                                                                                                                                                                                                                                                                                            
                                                                                                                                                                                                                                                                                                                                                                                            
                                                                                                                                                                                                                                                                                                                                                                                            
                                                                                                                                                                                                                                                           == 1) {
                                                                                                                                                                                                                                                           
                                                                                                                                                                                                                                                           
                                                                                                                                                                                                                                                           
                                                                                                                                                                                                                                                           
                                                                                                                                                                                                                                                           
                                                                                                                                                                                                                                                           
                                                                                                                                                                                                                                                           
                                                                                                                                                                                                                                                           
                                                                                                                                                                                                                                                           
                                                                                                                                                                                                                                                           
                                                                                                                                                                                                                                                           
                                                                                                                                                                                                                                                           
                                                                                                                                                                                                                                                           
                                                                                                                                                                                                                                                           
                                                                                                                                                                                                                                                           
                                                                                                                                                                                                                                                           
                                                                                                                                                                                                                                                           
                                                                                                                                                                                                                                                           
                                                                                                                                                                                                                                                           
                                                                                                                                                                                                                                                           
                                                                                                                                                                                                                                                           
                                                                                                                                                                                                                                                           
                                                                                                                                                                                                                                                           
                                                                                                                                                                                                                                                           
                                                                                                                                return false;
                                                                        }
            // Well... why not retrying
      return 
          
          
          
                                            convertNumberToBoolean(
          
          
          
          
          
          trueOrFalse
      
      )
          
          ;
                                                             
                                                                                                                                                                                        }

        int
            
            
            
            
            
            
            
            
            
            
            
            
            convertStringToNumber(              
                    
                        
                    
                        
                    
                    
                    
                    
            
                                                    String trueOrFalse) {
                                           if (                        trueOrFalse.equals("true")                                  ) {
                                          return 0;
                  } else if (trueOrFalse.equals("false")) {
                               return (
                                   
                                   
                                   
                                   
                                   
                                   
                                   
                                   
                                   
                                   
                                   
                                   
                                   
                                   
                                   
                                   
                                   
                                   booleanToBinaryNumber(
                                       Boolean.
                                                        TRUE
                                                .booleanValue())  *
                                   69 
                                   
                                   -
                                   
                                   1
                                   -
                                   
                                   
                                   booleanToBinaryNumber(
                                       Boolean.TRUE.booleanValue
                                       (                                                                )
                                   ) * 69 * 420 
                                   
                                   - 69 + 2
                               
                               
                               
                               


                                                 ) > 0






                                   
                                   
                                              ? 1 : 0;
                }
            
            
            
//Try again lol
                                                                            return convertStringToNumber(
                                                                                
                                                                                
                                                                                
                                                                                
                                                                                
                                                                                trueOrFalse)
                                                                                
;
        }

        int booleanToBinaryNumber
            
            (boolean 
                                  
                                  
                                  
                                  
                                  iHaveNoIdeaIfThisIsTrueOrFalse) { if (iHaveNoIdeaIfThisIsTrueOrFalse 
                                                                        
                                                                        == 
                                                                        
                                                                        
                                                                        true) 
        
        { return 
            
            
            
            
            
            
            
            
            
            
            
            1;
            
                                                                                                                        } 
                                                                           
                                                                           
                                                                           
                                                                           
                                                                           
                                                                           
                                                                           
                                                                           
                                                                           
                                                                           
                                                                           
                                                                           
                                                                           
                                                                           
                                                                           
                                                                           else {
                if (
                    
                    
                    
                    
                    iHaveNoIdeaIfThisIsTrueOrFalse == false) {
                    
                    
                    return 
                        
                        
                        
                        0;
                }
            }
            //To understand recursion, you first have to understand recursion
            return 
                
                
                
                
                booleanToBinaryNumber(iHaveNoIdeaIfThisIsTrueOrFalse);
        }

        boolean
            
                            isTrueOrFalse() {
            return this.convertNumberToBoolean(trueOrFalse);
        }
    }

    static
            boolean
    checkIfTrueOrFalse
                  (
                    trueOrFalseObject
                            objectToCheckIfTrueOrFalse
                    ,
                    trueOrFalseObject
                            objectWhichWeKnowIsTrue

            )
                                    {
                                        if (objectToCheckIfTrueOrFalse.isTrueOrFalse() == objectWhichWeKnowIsTrue.isTrueOrFalse()) {
                                                        if (Boolean.TRUE.booleanValue())
                                                                return objectWhichWeKnowIsTrue.isTrueOrFalse();
                                                                else if(Boolean.FALSE.booleanValue())
                                                                    return !objectToCheckIfTrueOrFalse.isTrueOrFalse();
                                                                System.out.println(
                                                                    
                                                                    
                                                                    
                                                                    
                                                                    
                                                                    
                                                                    
                                                                    
                                                                    
                                                                    
                                                                    
                                                                    
                                                                    
                                                                        "Successfully checked if the object is true or false. Result: the object is true."
                                                    );      
                                                     // TODO: fix text not console logging
                                            } else {
                                                objectWhichWeKnowIsTrue = new trueOrFalseObject("false");
                                                                              if (objectToCheckIfTrueOrFalse.isTrueOrFalse() == objectWhichWeKnowIsTrue.isTrueOrFalse()) {
                                                                if (Boolean.TRUE.booleanValue())
                                                                    return objectWhichWeKnowIsTrue.isTrueOrFalse();
                                                                           else if(Boolean.FALSE.booleanValue())
                                                                            return !objectToCheckIfTrueOrFalse.isTrueOrFalse();
                                                System.out.println(
                                                        "Successfully checked if the object is true or false. Result: the object is false."
                                                );
                                            // TODO: fix text not console logging
                                        } else {
                                            // something went horribly wrong
                                        }
            return new trueOrFalseObject("true").isTrueOrFalse();
        }
///https://www.youtube.com/watch?v=yHIX7O8wQNQ
                                                    return
                                                        
                                                        
                                                        
                                                        
                                                        checkIfTrueOrFalse(objectToCheckIfTrueOrFalse, objectWhichWeKnowIsTrue);
                        }

                        static boolean
                            
                            
                            returnTrue() {                                                                           trueOrFalseObject
            
            objectWhichWeKnowIsTrue =                    new trueOrFalseObject("true");


        boolean
            
            
            isTrueTrueOrFalse =     
            
            checkIfTrueOrFalse(new        
                               
                               trueOrFalseObject(           "true"      ), objectWhichWeKnowIsTrue);
        boolean isfalseTrueOrFalse =         checkIfTrueOrFalse(new         trueOrFalseObject(      "false"           ), objectWhichWeKnowIsTrue);

        HashMap<Boolean, Boolean>
            
            
                                                            trueOrFalseMap = new HashMap<>();
        trueOrFalseMap.put(Boolean.TRUE.booleanValue(), isTrueTrueOrFalse);trueOrFalseMap.put
                                            (Boolean.FALSE.booleanValue(),
             
             
             
                                        isfalseTrueOrFalse);

        return trueOrFalseMap.get(true);

    }

    public           static                             void                                                                                                                                                                                    main(String[] args){System.out.println(returnTrue(                                                                  ));}
}
