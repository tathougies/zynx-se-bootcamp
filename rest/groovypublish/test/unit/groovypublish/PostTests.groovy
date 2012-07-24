package groovypublish



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Post)
class PostTests {

    void testCrud() {
        Post post = new Post(title:"First Grails Project",
                teaser:"Clearing out the clutter",
                content:"The full content of the article",
                published:false)
        post.save()
        def id = post.id
        Post retrievedPost = Post.get(id)
        assertEquals(
                "First Grails Project",
                retrievedPost.title)
        assertNull(Post.get(10));
        post.published = true
        post.save()
        retrievedPost = Post.get(id)
        assertEquals(true, retrievedPost.published)
        post.delete()
        assertEquals(null, Post.get(id))
    }

    void testTitleIsRequired() {
        Post post = new Post(teaser:"foo",
                content:"bar",
                published:false)
        assertNull(post.save())
        post.title = "my title"
        assertNotNull(post.save())
    }
}
