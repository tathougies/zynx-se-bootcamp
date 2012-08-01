package zynxblog

class Comment implements Comparable{

    static belongsTo = Post

    Post post
    String comment
    Commentator commentator = new Commentator()
    Date dateCreated

    static constraints = {
        post(nullable:false, blank:false)
        comment(nullable:false, blank:false)
        dateCreated(nullable:false, blank:false)
    }

    int compareTo(obj)
    {
        return dateCreated.compareTo(obj.dateCreated)
    }

}
