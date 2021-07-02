package ru.netology

class WallService {

    var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        posts += post.copy(id = if (posts.isNotEmpty()) posts.last().id + 1 else 0)
        return posts.last()
    }

    fun update(post: Post) : Boolean {
        for ((index) in posts.withIndex()) {
            if (posts[index].id == post.id) {
                posts[index] = post.copy(ownerId = posts[index].ownerId, date = posts[index].date)
                //println(posts[index])
                return true

            }
        }
        return false
    }

}
