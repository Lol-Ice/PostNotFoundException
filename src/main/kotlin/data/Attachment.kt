package data

interface Attachment {
    val type: String
}

data class AudioAttachment(
    override val type: String = "audio",
    val audio: Audio = Audio(3, 1, 1, 9)
) : Attachment {
    data class Audio(
        val id: Int,
        val album_id: Int,
        val owner_id: Int,
        val user_id: Int
    )
}

data class DocumentAttachment(
    override val type: String = "document",
    val document: Document = Document(2, 10, 1, 1)
) : Attachment {
    data class Document(
        val id: Int,
        val album_id: Int,
        val owner_id: Int,
        val user_id: Int,
    )
}

data class LinkAttachment(
    override val type: String = "link",
    val link: Link = Link(2, 1, 11, 1)
) : Attachment {
    data class Link(
        val id: Int,
        val album_id: Int,
        val owner_id: Int,
        val user_id: Int,
    )
}

data class NoteAttachment(
    override val type: String = "note",
    val note: Note = Note(5, 2, 1, 1)
) : Attachment {
    data class Note(
        val id: Int,
        val album_id: Int,
        val owner_id: Int,
        val user_id: Int,
    )
}

data class PageAttachment(
    override val type: String = "page",
    val page: Page = Page(3, 1, 1, 1)
) : Attachment {
    data class Page(
        val id: Int,
        val album_id: Int,
        val owner_id: Int,
        val user_id: Int,
    )
}