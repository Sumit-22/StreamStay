package com.example.streamstay.data.models.LiveStreamingInteraction

data class ChatMessage(
    val messageId: String,     // Unique Message ID
    val streamId: String,      // Associated Live Stream
    val senderId: String,      // User who sent the message
    val message: String,       // Message Content
    val timestamp: Long = System.currentTimeMillis()  // Sent Time
)
