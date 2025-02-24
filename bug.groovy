```groovy
def myMethod(param) {
  if (param == null) {
    return "Null value"
  } else if (param instanceof String) {
    return param.toUpperCase()
  } else if (param instanceof Integer) {
    return param * 2
  } else {
    return "Unsupported type"
  }
}

println myMethod(null) // Output: Null value
println myMethod("hello") // Output: HELLO
println myMethod(5) // Output: 10
println myMethod([1,2,3]) // Output: Unsupported type
```