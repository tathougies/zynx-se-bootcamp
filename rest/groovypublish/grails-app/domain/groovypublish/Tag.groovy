package groovypublish

class Tag implements Comparable {

    static hasMany = [posts:Post]
    static belongsTo = Post

    SortedSet posts
    String tag

    static constraints = {
    }

    int compareTo(obj)
    {
        return tag.compareTo(obj.tag)
    }
}
