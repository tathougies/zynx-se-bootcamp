class TestSuites {
    // This takes what is in the standard output and converts it to a string.
    // Then it asserts the standard output is what you expected it to be
    // NOTE: If you use println, be sure to end your expectedOutput strings with \r\n
    def assertOutput(Closure closure, String expectedOutput) {
        def buf = new ByteArrayOutputStream()
        def newOut = new PrintStream(buf)
        def saveOut = System.out

        System.out = newOut
        closure()
        String output = buf.toString()
        System.out = saveOut

        assert output == expectedOutput
    }
}
