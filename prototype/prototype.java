 interface PrototypicalInterface extends Cloneable {
      
 }

 static class PrototypeA implements PrototypicalInterface {

 }

 static class PrototypeB implements PrototypicalInterface {

 }

 static class Factory {
     private static HashMap prototypes = new HashMap<PrototypicalInterface>();
     static {
        prototypes.put( "A",   new PrototypeA());
        prototypes.put( "B",  new PrototypeB());
     }

     public static PrototypicalInterface makeObject( String s ) {
         return prototypes.get(s).clone();
     }
 }

