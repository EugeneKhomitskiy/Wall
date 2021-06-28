package ru.netology

import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add_Test() {
        val post = Post(
            id = 4,
            owner_id = 1,
            from_id = 2,
            created_by = 3,
            date = 2222,
            text = " ",
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
        val service = WallService()

        val actual = service.add(post)
        val expected = post.copy(id = 0)

        assertEquals(expected, actual)
    }

    @Test
    fun updateExistingTrue() {
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

        val post1 = Post(
            id = 0,
            owner_id = 1,
            from_id = 2,
            created_by = 3,
            date = 2222,
            text = " ",
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
        val service = WallService()

        service.add(post)
        val expected = service.update(post1)

        assertTrue(expected)
    }

    @Test
    fun updateExistingFalse() {
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

        val post1 = Post(
            id = 1,
            owner_id = 1,
            from_id = 2,
            created_by = 3,
            date = 2222,
            text = " ",
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
        val service = WallService()

        service.add(post)
        val expected = service.update(post1)

        assertFalse(expected)
    }
}