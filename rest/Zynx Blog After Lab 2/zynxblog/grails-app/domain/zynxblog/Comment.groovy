package zynxblog

class Comment implements Comparable{

    static belongsTo = Post

    Post post
    String comment
    Commentator commentator = new Commentator()
    Date dateCreated

    static constraints = {
    }

    int compareTo(obj)
    {
        return dateCreated.compareTo(obj.dateCreated)
    }

}
