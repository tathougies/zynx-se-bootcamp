package zynxblog

class Tag implements Comparable{

    static hasMany = [posts:Post]
    static belongsTo = Post

    String tag

    SortedSet posts

    static constraints = {
    }

    int compareTo(obj)
    {
        return tag.compareTo(obj.tag)
    }
}
