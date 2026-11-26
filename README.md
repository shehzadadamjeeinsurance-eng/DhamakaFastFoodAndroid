# DHAMAKA FAST FOOD Android App (Website-matched WebView)

This Android wrapper opens the live DHAMAKA FAST FOOD website inside a native Android shell, so the customer UI remains the same as the website and stays updated automatically.

## App behavior
- Loads https://dhamaka-fast-food.hatchable.site/
- Same website UI, menu, prices, cart, account, tracking, checkout and pages
- Android app shell has no browser address bar
- Android back button navigates web history
- Swipe down refresh and top progress bar
- HTTPS-only, internal website stays in app; external links open in browser/app
- Internet required; app contents are hosted online

## Build APK (easy cloud build)
1. Create a GitHub repository and upload this project.
2. Go to Actions and run the workflow **Build Android APK** (or push to main).
3. Download the `DhamakaFastFood-debug-apk` artifact from the workflow run.
4. Transfer the APK to Android phone and install. Allow install from the source you used if Android asks.

## Build locally
Install Android Studio, open this project, let Gradle sync, then Build > Build APK(s).
Debug APK output: `app/build/outputs/apk/debug/app-debug.apk`.

## Notes
- This project is a website wrapper, not a separate redesigned app. Website edits will appear in the app.
- This starter build is unsigned debug APK. Play Store release requires a signed release build and store assets.
