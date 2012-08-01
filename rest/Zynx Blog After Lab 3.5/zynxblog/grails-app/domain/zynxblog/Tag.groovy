package zynxblog

class Tag implements Comparable{

    static hasMany = [posts:Post]
    static belongsTo = Post

    String tag

    SortedSet posts

    static constraints = {
        tag(nullable:false, length:0..50)
    }

    int compareTo(obj)
    {
        return tag.compareTo(obj.tag)
    }
}
