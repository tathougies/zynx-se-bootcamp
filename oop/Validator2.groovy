class Validator2 {

    void inList(Closure message, Object[] list, Object obj) throws Exception {
        if (!(list.contains(obj))) {
            throw new Exception(message(obj))
        }
    }

    void isPositive(Float number, String message) throws Exception {
        if(number <= 0) {
            throw new Exception(message)
        }
    }

}
