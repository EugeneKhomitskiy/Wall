package ru.netology

import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add_Test() {
        val post = Post(
            id = 4,
            ownerId = 1,
            fromId = 2,
            createdBy = 3,
            date = 2222,
            text = " ",
            replyOwnerId = 4,
            replyPostId = 5,
            friendsOnly = true,
            comments = Post.Comments(),
            copyright = Post.Copyright(),
            likes = Post.Likes(),
            reposts = Post.Reposts(),
            views = Post.Views(),
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
        val service = WallService()

        val actual = service.add(post)
        val expected = post.copy(id = 0)

        assertEquals(expected, actual)
    }

    @Test
    fun updateExistingTrue() {
        val post = Post(
            id = 0,
            ownerId = 1,
            fromId = 2,
            createdBy = 3,
            date = 2222,
            text = "Hello",
            replyOwnerId = 4,
            replyPostId = 5,
            friendsOnly = true,
            comments = Post.Comments(),
            copyright = Post.Copyright(),
            likes = Post.Likes(),
            reposts = Post.Reposts(),
            views = Post.Views(),
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

        val post1 = Post(
            id = 0,
            ownerId = 1,
            fromId = 2,
            createdBy = 3,
            date = 2222,
            text = " ",
            replyOwnerId = 4,
            replyPostId = 5,
            friendsOnly = true,
            comments = Post.Comments(),
            copyright = Post.Copyright(),
            likes = Post.Likes(),
            reposts = Post.Reposts(),
            views = Post.Views(),
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
        val service = WallService()

        service.add(post)
        val expected = service.update(post1)

        assertTrue(expected)
    }

    @Test
    fun updateExistingFalse() {
        val post = Post(
            id = 0,
            ownerId = 1,
            fromId = 2,
            createdBy = 3,
            date = 2222,
            text = "Hello",
            replyOwnerId = 4,
            replyPostId = 5,
            friendsOnly = true,
            comments = Post.Comments(),
            copyright = Post.Copyright(),
            likes = Post.Likes(),
            reposts = Post.Reposts(),
            views = Post.Views(),
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

        val post1 = Post(
            id = 1,
            ownerId = 1,
            fromId = 2,
            createdBy = 3,
            date = 2222,
            text = " ",
            replyOwnerId = 4,
            replyPostId = 5,
            friendsOnly = true,
            comments = Post.Comments(),
            copyright = Post.Copyright(),
            likes = Post.Likes(),
            reposts = Post.Reposts(),
            views = Post.Views(),
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
        val service = WallService()

        service.add(post)
        val expected = service.update(post1)

        assertFalse(expected)
    }
}