package com.wozu.blog.article

import javax.persistence.*

@Entity
@Table(name="articles")
data class Articles (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long,
        var title: String = "",
        var username: String = "",
        var description: String = "",
        var body: String = ""
)
