package zynxblog

class Commentator {

    static belongsTo = Comment

    String name
    String url
    String email
    Comment comment

    static constraints = {
    }
}
