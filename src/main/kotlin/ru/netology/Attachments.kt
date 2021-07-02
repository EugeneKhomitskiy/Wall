package ru.netology

interface Attachment {
    val type: String
}

class Attachments {
    val attachments = emptyArray<Attachment>()
}

class PhotoAttachments(override val type: String, val photo: Photo) : Attachment

class Photo(
    val id: Int,
    val albumId: Int,
    val ownerId: Int,
    val userId: Int,
    val text: String,
    val date: Int,
    val width: Int,
    val height: Int
)

class VideoAttachments(override val type: String, val video: Video) : Attachment

class Video(
    val id: Int,
    val ownerId: Int,
    val title: String,
    val description: String,
    val duration: Int,
    val date: Int,
    val views: Int,
    val comments: Int
)

class AudioAttachments(override val type: String, val audio: Audio) : Attachment

class Audio(
    val id: Int,
    val ownerId: Int,
    val artist: String,
    val title: String,
    val duration: Int,
    val url: String,
    val lyricsId: Int,
    val albumId: Int,
    val genreId: Int,
    val date: Int
)

class DocumentAttachments(override val type: String, val document: Document) : Attachment

class Document(
    val id: Int,
    val ownerId: Int,
    val title: Int,
    val size: String,
    val ext: String,
    val url: String,
    val date: Int,
    val type: Int
)

class PageAttachments(override val type: String, val page: Page) : Attachment

class Page(
    val id: Int,
    val groupId: Int,
    val creatorId: Int,
    val title: String,
    val edited: Int,
    val created: Int,
    val editorId: Int,
    val views: Int
)