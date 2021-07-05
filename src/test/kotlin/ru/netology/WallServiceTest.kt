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
        val service = WallService()

        service.add(post)
        val expected = service.update(post1)

        assertFalse(expected)
    }

    @Test
    fun shouldNotThrow() {
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
        val comment = Comment(
            ownerId = 0,
            postId = 0,
            fromGroup = 0,
            message = "Hello",
            replyToComment = 0,
            stickerId = 0,
            guid = " "
        )
        val service = WallService()

        service.add(post)
        service.createComment(comment)

        assert(true)
    }

    @Test(expected = PostNotFoundException::class)
    fun shouldThrow() {
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
        val comment = Comment(
            ownerId = 0,
            postId = 1,
            fromGroup = 0,
            message = "Hello",
            replyToComment = 0,
            stickerId = 0,
            guid = " "
        )

        val service = WallService()

        service.add(post)
        service.createComment(comment)

        assert(true)
    }
}