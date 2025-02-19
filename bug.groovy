```groovy
def myMethod(String a, Integer b = 10) {
    println "a: $a, b: $b"
}

myMethod(b: 5, a: 'hello') // This works fine
myMethod('hello', b: 5)  //This throws MissingMethodException: No signature of method: script1.myMethod() is applicable for argument types: (java.lang.String, java.util.LinkedHashMap) values: [hello, [b:5]]
```