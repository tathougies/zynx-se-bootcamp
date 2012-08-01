package zynxblog

class Post {

    static hasMany = [comments:Comment, tags:Tag]

    String title
    String teaser
    String content
    Date lastUpdated
    Boolean published = false

    SortedSet comments
    SortedSet tags

    static constraints = {
        title(nullable:false, blank:false, length:1..50)
        teaser(length:0..100)
        content(nullable:false)
        lastUpdated(nullable:true, blank:false)
        published(nullable:false)
    }
}
