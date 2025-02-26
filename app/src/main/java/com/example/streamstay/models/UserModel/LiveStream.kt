package com.example.streamstay.models.LiveStreamingInteraction


data class LiveStream(
    val streamId: String,          // Unique Stream ID
    val creatorId: String,         // ID of the Streamer (User ID)
    val propertyId: String?,       // Property being streamed (Optional)
    val title: String,             // Stream Title
    val description: String,       // Short Description
    val viewers: Int = 0,          // Number of Current Viewers
    val startTime: Long,           // Stream Start Timestamp
    val endTime: Long? = null,     // Stream End Timestamp (null if live)
    val streamUrl: String,         // Streaming URL (AWS IVS, Agora, WebRTC)
    val chatEnabled: Boolean = true, // Chat Feature Enabled
    val donationEnabled: Boolean = true, // Donations Allowed
    val tags: List<String> = listOf(), // Tags for Discoverability
    val createdAt: Long = System.currentTimeMillis()  // Timestamp of Creation
)

