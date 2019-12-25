package dev.eternalbox.eternaljukebox.data.spotify

import com.fasterxml.jackson.annotation.JsonProperty
import dev.eternalbox.ytmusicapi.UnknownJsonObj

data class SpotifyTrackLink(
    @JsonProperty("external_urls") val externalUrls: UnknownJsonObj,
    val href: String,
    val id: String,
    val type: String,
    val uri: String
)