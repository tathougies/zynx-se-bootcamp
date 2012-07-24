package groovypublish

class Tag {

    static hasMany = [posts:Post]
    static belongsTo = Post

    List posts
    String tag

    static constraints = {
    }
}
