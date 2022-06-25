package data

data class Comment(
    val postId: Int,
    val id: Int,
    val fromId: Int,
    val date: Int,
    val text: String,
    val donut: Any,
    val replyToUser: Int,
    val replyToComment: Int,
    val attachment: Array<Attachment>,
    val parentsStack: Any,
    val thread: Any
)