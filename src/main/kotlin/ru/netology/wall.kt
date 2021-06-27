package ru.netology

data class Post(
    var id: Int,
    val owner_id: Int,
    val from_id: Int,
    val created_by: Int,
    val date: Int,
    val text: String,
    val reply_owner_id: Int,
    val reply_post_id: Int,
    val friends_only: Boolean,
    val post_type: String,
    val signer_id: Int,
    val can_pin: Boolean,
    val can_delete: Boolean,
    val can_edit: Boolean,
    val is_pinned: Boolean,
    val marked_as_ads: Boolean,
    val is_favorite: Boolean,
    val postponed_id: Int
)

fun main() {
    val post = Post(
        id = 0,
        owner_id = 1,
        from_id = 2,
        created_by = 3,
        date = 2222,
        text = "Hello",
        reply_owner_id = 4,
        reply_post_id = 5,
        friends_only = true,
        post_type = "post",
        signer_id = 6,
        can_pin = true,
        can_delete = true,
        can_edit = true,
        is_pinned = true,
        marked_as_ads = true,
        is_favorite = true,
        postponed_id = 7
    )
    println(WallService.add(post))

    val post1 = Post(
        id = 0,
        owner_id = 11,
        from_id = 22,
        created_by = 33,
        date = 2222,
        text = "Hello, Kotlin",
        reply_owner_id = 44,
        reply_post_id = 55,
        friends_only = true,
        post_type = "post",
        signer_id = 66,
        can_pin = true,
        can_delete = true,
        can_edit = true,
        is_pinned = true,
        marked_as_ads = true,
        is_favorite = true,
        postponed_id = 77
    )
    println(WallService.add(post1))

    val post2 = Post(
        id = 0,
        owner_id = 111,
        from_id = 222,
        created_by = 333,
        date = 4444,
        text = " ",
        reply_owner_id = 444,
        reply_post_id = 555,
        friends_only = true,
        post_type = "post",
        signer_id = 666,
        can_pin = true,
        can_delete = true,
        can_edit = true,
        is_pinned = true,
        marked_as_ads = true,
        is_favorite = true,
        postponed_id = 777
    )
    println(post2)
    println(WallService.update(post2))
}