package com.example.streamstay.data.models.LiveStreamingInteraction
data class Tip(
    val tipId: String,         // Unique Tip ID
    val senderId: String,      // User sending the tip
    val receiverId: String,    // Creator receiving the tip
    val amount: Double,        // Tip Amount
    val message: String?,      // Optional Message with Tip
    val timestamp: Long = System.currentTimeMillis()  // Time of Tip
)
