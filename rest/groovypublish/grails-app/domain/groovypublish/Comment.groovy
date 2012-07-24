package groovypublish

class Comment {

    static belongsTo = Post

    Post post
    String comment
    Commentator who = new Commentator()
    Date dateCreated

    static constraints = {
    }
}
