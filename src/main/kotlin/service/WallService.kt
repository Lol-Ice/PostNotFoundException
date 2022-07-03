package data.service.service

import data.*

object WallService {
    var posts = emptyArray<Post>()
    var comments = emptyArray<Comment>()

    fun add(post: Post): Post {

        posts += post
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for ((index, originalPost) in posts.withIndex()) {
            if (originalPost.id == post.id) {
                posts[index] = post.copy(owner_id = post.owner_id, date = post.date)
                return true
            }
        }
        return false
    }

    fun historyPost(post: Post?) {
        println(post?.copy_history ?: "Нет истории")
    }

    fun createComment(comment: Comment) {

        val count = comments.size
        for (post in posts) {
            if (comment.postId == post.id) {
                comments += comment
            }
        }
        if (comments.size == count) {
            throw PostNotFoundException()
        }
    }
}