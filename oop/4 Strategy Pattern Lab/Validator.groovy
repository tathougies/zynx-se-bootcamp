class Validator {

    void inList(Object obj, Object[] list, String message) throws Exception {
        if (!(list.contains(obj))) {
            throw new Exception(message)
        }
    }

    void isPositive(Float number, String message) throws Exception {
        if(number <= 0) {
            throw new Exception(message)
        }
    }

}
