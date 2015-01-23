
var somePrototype = function somePrototype() {
    this.someAttr = 1;
    this.someMethod = function() {
      console.log(this.someAttr);
    };

};


function someObject() {
    this.someAttr = 2; 
}


someObject.prototype = new somePrototype();
var someInstance = new someObject();


someInstance.someMethod();


