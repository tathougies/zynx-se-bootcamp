package zynxblog

class Commentator {

    static belongsTo = Comment

    String name
    String url
    String email
    Comment comment

    static constraints = {
        name(nullable:false, blank:false)
        url(nullable:true, blank:true, url:true)
        email(nullable:true, blank:true, email:true)
    }
}
