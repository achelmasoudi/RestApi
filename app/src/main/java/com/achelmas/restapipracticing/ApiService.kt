package com.achelmas.restapipracticing
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.PATCH
import retrofit2.http.PUT
import retrofit2.http.Path

interface ApiService {

    // ------------ PUT and PATCH requests ------------

    @PUT("posts/{id}")
    fun updatePost(@Path("id") postId: Int, @Body post: Post): Call<Post>
    // Replaces the entire resource with the new data.

    @PATCH("posts/{id}")
    fun updatePost(@Path("id") postId: Int , @Body updates: Map<String , Any>) : Call<Post>
    // Updates only the specified fields.
    /* Ex: we want to change the title of Post
            val data = mapOf(
                "title" = "Great"
            )
            updatePost(1 , data)
    */

}

