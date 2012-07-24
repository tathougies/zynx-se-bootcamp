package groovypublish

class Comment implements Comparable{

    static belongsTo = Post

    Post post
    String comment
    Commentator who = new Commentator()
    Date dateCreated

    static constraints = {
        post(nullable: false, blank: false)
    }

    int compareTo(obj)
    {
        return dateCreated.compareTo(obj.dateCreated)
    }
}
