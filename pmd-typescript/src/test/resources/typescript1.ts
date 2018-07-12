/* @internal */
// comment
namespace ts.JsTyping {
function getGreeting() {
    var name:string = "string"
    return "howdy";
}
class MyGreeter extends Greeter { }

greet("hello");
greet(getGreeting);
greet(new MyGreeter());

}