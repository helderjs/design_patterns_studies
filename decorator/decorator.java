interface SomeInterface {

  public void someMethod();
}

class SomeItem implements SomeInterface {
  
  public void someMethod() {

  }

}

class SomeDecoration implements SomeInterface {
  private SomeInterface decorated;

  public void someMethod() {
    //doSomethingBefore
    decorated.someMethod();
    //MaybeDoSomethingElseAfterToo

  }

}
