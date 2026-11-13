# 🥊 Fighter 3D

Game fighting 3D pure code — tanpa game engine. Dibangun dengan **Three.js (WebGL)** + **Android WebView**.

## 🎮 Kontrol

**Mobile (Touch):**
- **Joystick kiri** → gerak kiri/kanan
- **PUNCH** (merah) → pukulan cepat
- **KICK** (biru) → tendangan kuat
- **BLOCK** (hijau) → tahan untuk defense
- **ULTI** (kuning) → serangan spesial (butuh charge 100%)

**Desktop (Keyboard):**
- `A` / `D` → gerak
- `J` → Punch | `K` → Kick | `L` → Block | `U` → Ultimate

## 🚀 Cara Build APK via GitHub

1. **Fork / Push repo ini ke GitHub**
2. Buka tab **Actions** di repo GitHub kamu
3. Pilih workflow **"Build APK"** → klik **Run workflow**
4. Tunggu 3-5 menit, download APK di tab **Artifacts**
5. Install di Android (izinkan "Unknown Sources")

## 📦 Build Lokal

```bash
./gradlew assembleDebug
# APK ada di: app/build/outputs/apk/debug/app-debug.apk
```

## 🎯 Fitur

- Rendering 3D real-time (WebGL/Three.js)
- 2 fighter dengan AI
- Sistem HP, timer, knockback
- Efek hit particle
- Dynamic camera follow
- Ultimate move dengan charge meter
- Arena dengan lighting dinamis
- Touch control optimized untuk mobile

## 🧱 Teknologi

- HTML5 + CSS3 + JavaScript
- Three.js r155 (WebGL)
- Android Kotlin + WebView
- GitHub Actions CI/CD
