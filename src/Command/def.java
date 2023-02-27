package Command;

public class def {
    /**
     * In object oriented programming command pattern are behavioural design pattern in which an object is 
     * used to encapsulate all information needed to pers=form an action or trigger an event at a later time
     * 
     * This information includes the method name, object that owns the method and values for method parameters
     * 
     *  
     */

     public static void main(String[] args) {
        // AlexaDevice alexa = new AlexaDevice();
        // System.out.println(alexa);

        AlexaDevice alexa = new AlexaDevice();
        KitchenLights kitchenLights = new KitchenLights();

        alexa.setCommand(new KitchenLightsOnCommand(kitchenLights), new KitchenLightsOffCommand(kitchenLights), 1);

        alexa.ActivateSlot(1);
        alexa.DeActivateSlot(1);
     }
    
}
