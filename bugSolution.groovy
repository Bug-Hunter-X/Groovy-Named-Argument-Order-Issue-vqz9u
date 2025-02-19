```groovy
def myMethod(String a, Integer b = 10) {
    println "a: $a, b: $b"
}

myMethod(a: 'hello', b: 5) // Correct way to use named arguments consistently
myMethod('hello', 5)       // Correct positional arguments
myMethod('hello')           // Using default value for b
```