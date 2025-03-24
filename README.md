# Zonar - Skill-Based Locator & Communication Platform 🌍

Reflekt empowers users to discover professionals, creatives, and experts (like developers, artists, athletes, etc.) in any geographic area and connect with them seamlessly. Built with modern Android technologies and best UX practices.

[![Kotlin](https://img.shields.io/badge/Kotlin-1.9.20-blue.svg)](https://kotlinlang.org/)
[![Jetpack Compose](https://img.shields.io/badge/Jetpack%20Compose-1.7.0-brightgreen)](https://developer.android.com/jetpack/compose)
[![Firebase](https://img.shields.io/badge/Firebase-32.7.0-orange)](https://firebase.google.com/)

<img src="screenshots/app_demo.gif" width="300" alt="App Demo"> *(Replace with your own GIF/screenshots)*

---

## 🚀 Key Features

### **Skill-Based Discovery**
- Search professionals by skill (Android Dev, Video Editor, Musician, Footballer, etc.).
- Filter by location and radius using **Google Maps** and **GeoFire**.
- Real-time updates of nearby talent.

### **Interactive Map Integration**
- Visualize search results on **Google Maps** with custom markers.
- View detailed profiles with skills, availability, and ratings.

### **Seamless Communication**
- In-app chat with support for **text, links, files, and media**.
- Real-time messaging powered by **Firebase Firestore**.
- Push notifications for new messages.

### **Advanced Search**
- Use **Google Places API** for autocomplete location searches.
- Dynamic radius adjustment (1km to 50km).

### **User Profiles**
- Skill verification system.
- Portfolio/experience display.
- Rating and review system.

---

## 🛠 Tech Stack

- **Language**: Kotlin
- **UI Framework**: Jetpack Compose
- **Database**: 
  - Local: Room Database
  - Cloud: Firebase Firestore & Realtime Database
- **Authentication**: Firebase Auth
- **Location Services**: Google Maps SDK, GeoFire, Places API
- **Networking**: Retrofit (for future API integrations)
- **Dependency Injection**: Hilt
- **Image Loading**: Coil
- **Permissions**: Accompanist Permissions

---

## 📸 Screenshots *(Add your own)*

| Search Screen | Map View | Chat |
|---------------|----------|------|
| <img src="https://github.com/user-attachments/assets/3dce6bb0-15df-4d98-a654-907f63d07ca2" width="200"> | <img src="screenshots/map.png" width="200"> | <img src="screenshots/chat.png" width="200"> |
![WhatsApp Image 2025-03-25 at 04 18 21_1bd450b9](https://github.com/user-attachments/assets/3dce6bb0-15df-4d98-a654-907f63d07ca2)

---![WhatsApp Image 2025-03-25 at 04 18 21_911e81c4](https://github.com/user-attachments/assets/d0e147b1-f950-421e-8dd7-0acbbaab908e)

![WhatsApp Image 2025-03-25 at 04 18 22_0ba4e5ff](https://github.com/user-attachments/assets/59e62ac2-9ead-4033-b50d-20904e69a690)

## ⚙️ Installation

1. **Clone the repository**:
   ```bash
   git clone https://github.com/yourusername/Reflekt.git
