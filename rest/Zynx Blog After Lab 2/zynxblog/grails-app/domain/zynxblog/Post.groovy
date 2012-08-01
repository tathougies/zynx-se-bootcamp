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
    }
}
