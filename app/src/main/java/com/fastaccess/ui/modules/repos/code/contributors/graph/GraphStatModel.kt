package com.fastaccess.ui.modules.repos.code.contributors.graph

import com.google.gson.annotations.SerializedName

data class GraphStatModel(
    val contributions: List<ContributionStats>
) {
    data class ContributionStats(
        val author: Author,
        val total: Int,
        val weeks: List<Week>
    ) {
        data class Author(
            val login: String,
            val id: Int,
            @SerializedName("node_id")
            val nodeId: String,
            @SerializedName("avatar_url")
            val avatarUrl: String,
            @SerializedName("gravatar_id")
            val gravatarId: String,
            val url: String,
            @SerializedName("html_url")
            val htmlUrl: String,
            @SerializedName("followers_url")
            val followersUrl: String,
            @SerializedName("following_url")
            val followingUrl: String,
            @SerializedName("gists_url")
            val gistsUrl: String,
            @SerializedName("starred_url")
            val starredUrl: String,
            @SerializedName("subscriptions_url")
            val subscriptionsUrl: String,
            @SerializedName("organizations_url")
            val organizationsUrl: String,
            @SerializedName("repos_url")
            val reposUrl: String,
            @SerializedName("events_url")
            val eventsUrl: String,
            @SerializedName("received_events_url")
            val receivedEventsUrl: String,
            val type: String,
            @SerializedName("site_admin")
            val siteAdmin: Boolean
        )
        data class Week(
            @SerializedName("a")
            val additions: Int,
            @SerializedName("c")
            val commits: Int,
            @SerializedName("d")
            val deletions: Int,
            @SerializedName("w")
            val starting_week: Long
        )
    }
}