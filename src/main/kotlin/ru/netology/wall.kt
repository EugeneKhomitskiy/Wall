package ru.netology

data class Post(
    var id: Int,
    val ownerId: Int,
    val fromId: Int,
    val createdBy: Int,
    val date: Int,
    val text: String,
    val replyOwnerId: Int,
    val replyPostId: Int,
    val friendsOnly: Boolean,
    val comments: Comments?,
    val copyright: Copyright?,
    val likes: Likes?,
    val reposts: Reposts?,
    val views: Views?,
    val postType: String,
    val signerId: Int,
    val canPin: Boolean,
    val canDelete: Boolean,
    val canEdit: Boolean,
    val isPinned: Boolean,
    val markedAsAds: Boolean,
    val isFavorite: Boolean,
    val postponedId: Int
)

class Comments {
    val count = Int
    val canPost = Boolean
    val groupsCanPost = Boolean
    val canClose = Boolean
    val canOpen = Boolean
}

data class Comment(
    val ownerId: Int,
    val postId: Int,
    val fromGroup: Int,
    val message: String,
    val replyToComment: Int,
    val stickerId: Int,
    val guid: String
)

class Copyright {
    val id = Int
    val link = String
    val name = String
    val type = String
}

class Likes {
    val count = Int
    val userLikes = Boolean
    val canLike = Boolean
    val canPublish = Boolean
}

class Reposts {
    val count = Int
    val userReposted = Boolean
}

class Views {
    val count = Int
}

val service = WallService()

fun main() {
    val post = Post(
        id = 5,
        ownerId = 1,
        fromId = 2,
        createdBy = 3,
        date = 2222,
        text = "Hello",
        replyOwnerId = 4,
        replyPostId = 5,
        friendsOnly = true,
        comments = Comments(),
        copyright = Copyright(),
        likes = Likes(),
        reposts = Reposts(),
        views = Views(),
        postType = "post",
        signerId = 6,
        canPin = true,
        canDelete = true,
        canEdit = true,
        isPinned = true,
        markedAsAds = true,
        isFavorite = true,
        postponedId = 7
    )
    println(service.add(post))

    val post1 = Post(
        id = 0,
        ownerId = 11,
        fromId = 22,
        createdBy = 33,
        date = 2222,
        text = "Hello, Kotlin",
        replyOwnerId = 44,
        replyPostId = 55,
        friendsOnly = true,
        comments = Comments(),
        copyright = Copyright(),
        likes = Likes(),
        reposts = Reposts(),
        views = Views(),
        postType = "post",
        signerId = 66,
        canPin = true,
        canDelete = true,
        canEdit = true,
        isPinned = true,
        markedAsAds = true,
        isFavorite = true,
        postponedId = 77
    )
    println(service.add(post1))

    val post2 = Post(
        id = 1,
        ownerId = 111,
        fromId = 222,
        createdBy = 333,
        date = 4444,
        text = " ",
        replyOwnerId = 444,
        replyPostId = 555,
        friendsOnly = true,
        comments = Comments(),
        copyright = Copyright(),
        likes = Likes(),
        reposts = Reposts(),
        views = Views(),
        postType = "post",
        signerId = 666,
        canPin = true,
        canDelete = true,
        canEdit = true,
        isPinned = true,
        markedAsAds = true,
        isFavorite = true,
        postponedId = 777
    )
    println(service.update(post2))

    val comment = Comment(
        ownerId = 0,
        postId = 1,
        fromGroup = 0,
        message = "Hello",
        replyToComment = 0,
        stickerId = 0,
        guid = " "
    )
    println(comment)
    service.createComment(comment)
}