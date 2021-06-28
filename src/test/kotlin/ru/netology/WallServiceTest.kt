package ru.netology

import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    private val post = Post(
        id = 4,
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

    @Test
    fun add_Test() {
        val service = WallService()
        val posts = emptyArray<Post>()

        service.add(post)

        val result = posts.last().id

        assertEquals(0, result)
    }

    @Test
    fun update() {
    }
}