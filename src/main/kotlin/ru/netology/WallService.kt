package ru.netology

class WallService {

    private var posts = emptyArray<Post>()
    private var comments = emptyArray<Comment>()

    fun add(post: Post): Post {
        posts += post.copy(id = if (posts.isNotEmpty()) posts.last().id + 1 else 0)
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for ((index) in posts.withIndex()) {
            if (posts[index].id == post.id) {
                posts[index] = post.copy(ownerId = posts[index].ownerId, date = posts[index].date)
                //println(posts[index])
                return true

            }
        }
        return false
    }

    fun createComment(comment: Comment) {
        for ((index) in posts.withIndex()) if (posts[index].id == comment.postId) {
            comments += comment
            return
        }
        throw PostNotFoundException("No post with this id")
    }
}
