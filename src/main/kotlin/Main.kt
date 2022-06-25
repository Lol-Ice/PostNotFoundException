package data.service

import data.*
import data.service.service.WallService

fun Main() {

    var arrayOfAttachment = emptyArray<Attachment>()
    arrayOfAttachment += AudioAttachment("audio")
    arrayOfAttachment += DocumentAttachment("document")
    arrayOfAttachment += LinkAttachment("link")
    arrayOfAttachment += NoteAttachment("note")
    arrayOfAttachment += PageAttachment("page")

    val post1 = Post(
        1, 1, 1, 1, "22.05.2022", "1", 1, 1, true, 1, 1, 1,
        1, 1, "1", 1, true, 1, null, true, true, true, true, true, true, 1, arrayOfAttachment
    )
    WallService.add(post1)
    val post2 = Post(
        2, 1, 1, 1, "22.05.2022", "1", 1, 1, true, 1, 1, 1,
        1, 1, "1", 1, true, 1, null, true, true, true, true, true, true, 1, arrayOfAttachment
    )
    WallService.add(post2)

    val comment = Comment(2, 1, 1, 1, "1", 1, 1, 1, arrayOfAttachment, 1, 1)
    WallService.createComment(comment)

}