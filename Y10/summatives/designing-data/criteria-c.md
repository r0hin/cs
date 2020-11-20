# Designing Data | Criteria C

### Part One | Plan ⏰

| Date 📅| Prediction ✨ | Progress 📈 |
| - | - | - |
| Sep 18| - Project structure<br>- Setup Firebase and cloud projects<br>- Setup Firebase Hosting | ✔ Setup project, hosting, etc for development |
| Sep 19 - Sep 21 | - Build Basic UI including tabs<br> - Add authentication with Firebase Auth <br>- Basic account details shown in a clean UI |  ✔ Auth<br>✔ Cloud function to manage account creation details
| Sep 22 - Sep 25| - Work on search and library-based items <br> - Build some cloud functions for auth, image management, etc| <br>✔ Search UI<br>✔ Error handling<br>✔ Completely redid code to play songs - should bypass georestrictions|
| Sep 25 - Sep 30| - Complete song download and return url to client <br> - Add more features to the app<br> - Setup Electron| <br>✔ Electron<br>✔ Now playing + animated player<br>✔ Scroll issues fixed|
| Sep 31 - Oct 3| - Work on the playing UI with song history, queue, etc <br>- Use JS Library called PLYR for a better looking audio experience | <br>✔ Context menu<br>✔ Play playlists<br>✔ Set indentation to 2 spaces (big improvement from 4)|
| Oct 4 - Oct 7| - Work on more media types such as playlist, album, track and artist <br>- Create views for each | <br>✔ Added spotify playlists support<br>✔ Improved contexts |
| Oct 8 - Oct 15 | - Add user playlists and general structure for it <br> - Allow adding songs to playlist which keeps the URL for instant playback<br> - Improve media full screen view<br> - Don't accidentally lose a ton of code and basically redesign the whole project| - Lost a ton of code and redesigned the whole project<br>- 🥴 "everything is fine"<br> - 😡|
| Oct 16 - Oct 19 | - Enhance electron app and try to add link previews to open in the app<br> - Improve UI drastically and add animation libraries | ✔ Created music queue and now playing<br>✔ Rebuild context menus to look better  |
| Oct 20 - Oct 24 | - Create queue, music controls, queue list of tracks, library (add track,library,album, etc to library)<br>- Color thief library to grab main colors from image and construct playlist details with those colors Might look cool | ✔ Album to library<br>✔ Song to playlist<br>✔ Album View|
| Oct 25|- Improve all features generally and make it more integrated Things like speed, effeciently, UI improvements and final touches like that | <br>✔ Artist view and context menu<br>✔ Artist to library<br>✔ Redesigned media view for stacking<br>✔ Updated login UI<br>✔ Queue Tab<br>✔ First beta release in production<br>✔ Tracks in library|
| Oct 26 - Nov 3 | - Basically just enhance library, animations, etc| ✔  Built listening parties feature for listening to tracks as a group<br>✔ Switched icon libraries<br>✔ UI Bug Fixes |
| Nov 4 - Nov 7 | - Browse and first-time pages<br> - Add details about the app for new users <br> - Spotify categories options, etc|✔  Browse Page<br>✔ Change User Photo<br>✔ Updated theming system for snackbars, player, etc  |
| Nov 8 - Nov 11 | - Last touches and work on writeup for rest of time | ✔ Cateogry view and updated playlist view<br>✔ Context option to go to album/artist<br>✔ Light theme updates<br>✔ Able to delete playlists <br>✔ Better experience with spotify playlists|
| Nov 12 - Nov 15 | | ✔ Link previews added for albums, artists, playlists and tracks <br>✔ Lots of enhancements to update the library automatically<br>✔ Lots of bug fixes<br>✔ 1.0.0 first beta<br>✔ UI Redesign<br>✔ Redeveloped user playlists<br>✔ Able to rename playlists |
| Nov 17 - Nov 20 | - Final enhancements, push to production, 🎉 1.0.0 release | Way too many changes to fit here. <a target=")blank" href="https://github.com/r0hin/eonsound/commit/3f335a9314c1d3a39ddbe5ffee75f0da86445fa2">1</a> <a target=")blank" href="https://github.com/r0hin/eonsound/commit/11fec89866915e3f3fb01f1f2659826b6d97efc7">2</a> <a target=")blank" href="https://github.com/r0hin/eonsound/commit/cc1c1aec3d519b6e00e6f11423fd5b9cc71f877a">3</a> <a target=")blank" href="https://github.com/r0hin/eonsound/commit/e2075e604a8cfa004c07460964dc3dd1157ac35b">4</a> <a target=")blank" href="https://github.com/r0hin/eonsound/commit/5d99c3c1f76ac2c1bc0accb3d83c8c2dde1838c7">5</a> |

### Part Two | Skill Development 💪
During this project, I have improved and learned many skills. I will briefly talk about a few highlights: problem solving, syntax and experience.

<b>🧠 Problem Solving</b>
<p>I solved many difficult problems during the project. Many were syntactic but many were very deep rooted problems that required lots of rethinking. The biggest problem I faced was how to download audio reliably. The way I had programmed it originally used a Firebase Cloud Function to use the Spotify API and a YouTube Downloader Library to download the track. There ended up being many issues with this. Firstly, it was quite slow. With cold starts, lack of processing power, etc, songs would take a while to download. Secondly, there were geo-restrictions and inconsistencies due to the nature of Google Cloud. My solution was to move everything to a heroku NodeJS web server and run it from there. This then gets called from the cloud function. Now, it works far more reliably (although still not perfect) and is faster (although not the fastest).</p>
<b>📚 Syntax</b>
<p>On top of learning a lot about using syntax to problem solve, I learend a lot about the code itself. I got way more comfortable with async functions, string literals and generally cleaner code throughout this project. For complex functions, I learned the value of code comments first-hand and much more. Overall, my syntactic skill developemtn here was generally along the lines of readability, conciseness and optimization of the code.</p>
<b>✨ Experience</b>
<p>Another important skill I developed was the experience of producing a desktop app from start to finish. I learned a lot about git, GitHub Releases and more tools to deliver products. I also learned about <a href="https://semver.org/" target="_blank">Semantic Versioning</a> and licencing. Finally, since this is a desktop app meant for users, I had to focus a lot on ease of use and making sure the components flowed correctly integrating the code and UI to provide a good user experience. </p>

### Part Three | Video Demonstration 🍿
<p>soon</p>
### Part Four | Product ✨

<a href="https://zoonk.surf/i?s=3bteXhR8gLfbGBfX7f3E/" target="_blank"> Product</a> and <a href="https://github.com/r0hin/eonsound" target="_blank"> Source Code</a> 
