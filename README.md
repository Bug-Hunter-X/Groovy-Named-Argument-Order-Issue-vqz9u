# Groovy Named Argument Order Bug

This example demonstrates a subtle issue with named arguments in Groovy when combining them with positional arguments.  While named arguments provide flexibility, their order relative to positional arguments can lead to `MissingMethodException` errors if not handled carefully.

## Problem

The `myMethod` function accepts a String and an optional Integer argument.  When calling `myMethod` with named arguments, the order matters. The following lines of code demonstrate the issue:

```groovy
myMethod(b: 5, a: 'hello') // Works correctly
myMethod('hello', b: 5)  // Throws MissingMethodException
```

The second call fails because Groovy interprets the arguments as a String and a Map (due to the named argument 'b').

## Solution

Always use named arguments consistently or place named arguments after positional arguments to avoid unexpected behavior.  See bugSolution.groovy for a corrected version.