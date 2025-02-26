package com.example.streamstay.data.models.UserModel

data class User(
    val userId: String,                // Unique User ID
    val name: String,                  // User Full Name
    val email: String,                 // Email Address
    val profilePic: String,            // Profile Picture URL
    val bio: String? = null,           // User Bio (Optional)
    val followers: List<String> = listOf(),  // List of Follower IDs
    val following: List<String> = listOf(),  // List of Following IDs
    val savedProperties: List<String> = listOf(), // Saved Listings
    val pastBookings: List<String> = listOf(),    // Past Bookings
    val walletBalance: Double = 0.0,   // In-App Wallet Balance
    val createdAt: Long = System.currentTimeMillis()  // Account Creation Timestamp
)
