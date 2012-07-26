validator = new Validator2()
//String message(String foodName) {
//    println "Sorry, we don'the have ${foodName} here."
//}
message =  { foodName ->  return "Sorry, we don'the have ${foodName} here." }
badClosure = { thing1, thing2 -> return "hello" }
inListCheck = validator.&inList.curry(message)
name = "Bob"
names = ["Mary", "Joe", "Sue"]
try {
inListCheck(name, names)
}
catch (Exception e) {
    println e.getMessage()
}

badInListCheck = validator.&inList.curry(badClosure)
name = "Bob"
names = ["Mary", "Joe", "Sue"]
try {
    badInListCheck(name, names)
}
catch (Exception e) {
    println e.getMessage()
}

void makeParts(Closure makePart) {
    // Prepare materials
    println "Preparing materials..."

    // Prepare workshop
    println "Setting up workshop..."

    makePart()

    // Take down workshop
    println "Cleaning up workshop..."

    // Dispose waste
    println "Throwing away the waste..."
}

