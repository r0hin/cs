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
  - <a href="https://firebase.google.com/docs/firestore"> Cloud Firestore</a> - Store user data (forum posts, etc).
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

| Pros | Cons |
| -- | -- |
| - Many active users | - Users must be on Reddit |
| - Very easy to find | - Unorganized |
| - Daily discussions | - Performance is not optimized|
| | - Cannot play music |

<b>The Music Banter</b> is another very popular music forum which labels itself as "The Internet's Top Music Community". It also has thousands to hundreds of thousands of posts in each topic.

![](assets/screenshots/2021-02-17-12-38-08.png)

| Pros | Cons |
| -- | -- |
| - Many active users | - Very bad design |
| - High on Google | - Cannot play music |
| - Lots of topics | |
| - Good performance ||

<b>Google Sites</b> is a website-creation platform designed by Google. Although unrelated to music in general, it does have stunning components.

![](assets/screenshots/2021-02-17-12-37-34.png)

| Pros | Cons |
| -- | -- |
| - Very high ranking on Google | - Unrelated to music |
| - Material Design system | |
| - Consistent and fluid ripple effect  | |
| - Good performance ||
| - Frequent Updates ||

### Part Four | Design Brief

#### 01
<p>During the research of this project, I learned many things about the technical and developmental side of creating an application like this. There were many technical challenges such as being able to distinguise whether users are signed in or out. This will also be used to show user different views depending on their account status. For example, a login page when they are not signed in. Here is a code snippet to demonstrate:</p>

```javascript
firebase.auth().onAuthStateChanged(function (user) {
  if (user) {
    // User is signed in.
  } else {
    // User is signed out.
  }
});
```
<p>Another thing I learned during via classes and other resources is arrow functions. There a more concise way of using functions. For example, the old function notation is something like this:</p>

```javascript
callbackFunction(function(params) {
  //
})
```

<p>And the new function notation is something like this:</p>

```javascript
callbackFunction((params) => {
  //
})
```

<p>After learning more about the development, I decided to choose a platform. Since I had already created EonSound in the previous project, I decided to add this part as an extension of it! Specific technologies mentioned are NodeJS, Firebase, and Electron. As a consequence of my research, I learned more about electron-packager, a way to finalize apps with an icon, installer files and other QoL features for the user. I also generally learned about a lot of optimizations to enhance performance and improve design thinking.</p>

```javascript
async function() {
  // One line to call firebase
  data = await firebase.firestore().collection('app').doc('music').get()
}
```

<p>Shown above is another trick I learned (async/await) to lower code footprint and make everything more readable. In conclusion, I learned a lot about how to work with electron, Firebase and NodeJS and this will be very useful when working on my forums platform.</p>

<center>
Thanks for reading! 🌴
</center>