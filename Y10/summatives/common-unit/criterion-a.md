# Common Unit | Criterion A
## Inquiry & Analysis
### Part One | Need For Solution
There are very few dedicated places to discuss your favourite music. There are general forums such as Reddit's r/music and other artist-related forums. After consulting friends, more than 50% would use a platform to discuss their favourite songs. Since there is a demand and lack of a proper solution, it created a good opportunity to create a product that does exactly that! The target audience / user will be anyone who has an interest in music. The client is myself as it will be mainly build around my preferences and ideas. In this case, I do not know what users want and so I will base my design and technical choices around external feedback.

### Part Two | Research Plan
The product, "EonSound Forums" will require the following areas of research:

- <a href="https://www.w3schools.com/html/"> HTML</a> - HTML will be the basic building block for the website. HTML defines the elements.
- <a href="https://www.w3schools.com/css/"> CSS</a> - CSS is important for conditional elements and a proper layout. CSS styles the elements defined by the HTML. 
  - <a href="https://css-tricks.com/snippets/css/a-guide-to-flexbox/"> Flex</a> - Flex is the updated layout method to create repsonsive and accessible displays.
  - <a href="https://css-tricks.com/almanac/properties/a/animation/"> CSS3 Animations</a> - Animations are important to ensure the app itself does not look dated.
  - <a href=""> Libraries</a>
    - <a href="https://getboostrap.com/"> Bootstrap</a> - A common CSS framework with grid and a plethora of elements.
    - <a href="http://daemonite.github.io/material/"> Material Design</a> - Material by Daemonite is a library built ontop of bootstrap containing material design components.
    - <a href="https://eastcoastgang.github.io/style/dev/"> East</a> - Additional components built ontop of Mateiral by Daemonite.
- <a href="https://www.w3schools.com/js/"> JavaScript</a> - Javascript is an equally important tool to provide any sort of functionality to the app.
  - <a href="https://www.w3schools.com/js/js_loop_for.asp"> Loops</a> - Loops will be everywhere. For example, loops through search results to build content.
  - <a href="https://www.w3schools.com/js/js_arrays.asp"> Arrays & Objects</a> - Arrays will also be everywhere. For example, user data, API returns, etc.
  - <a href="https://developer.mozilla.org/en-US/docs/Web/API/Fetch_API"> Fetch API</a> - The primary method for gathering external data.
- <a href="https://firebase.google.com"> Firebase</a>
  - <a href="https://firebase.google.com/docs/auth">Authentication</a> - Authenticate users securely.
  - <a href="https://firebase.google.com/docs/firestore"> Cloud Firestore</a> - Store user data (playlists, library, etc).
  - <a href="https://firebase.google.com/docs/storage"> Cloud Storage</a> - Store music from cloud function.
  - <a href="https://firebase.google.com/docs/functions"> Cloud Functions</a> - Allow users to play songs without risking security.
  - <a href="https://firebase.google.com/docs/hosting">Firebase Hosting</a> - Host the app worldwide.
- <a href="https://nodejs.org/en/">NodeJS</a>
  - <a href="http://electronjs.org/">Electron</a> - Provide a native-class desktop app experience for Mac, Windows, and Linux from a single codebase.
    - <a href="https://github.com/electron-userland/electron-builder">Electron Builder</a> - Package the apps in an easy manner for each platform.
  - <a href="https://www.npmjs.com/package/firebase-admin">firebase-admin</a> - Tools for uploading to storage from cloud functions.
  - <a href="https://www.npmjs.com/package/firebase-functions">firebase-functions</a> - Tools for troubleshooting cloud functions.

### Part Three | Product Examination

<b>/r/Music</b> is one of the most popular music discussion forum. It has more than 27 million members.
![](assets/screenshots/2021-02-14-11-28-28.png)

#### Evaluation
| Pros | Cons |
| -- | -- |
| - Many active users | - Users must be on Reddit |
| - Very easy to find | - Unorganized |
| - Daily discussions | - Performance is not optimized|
