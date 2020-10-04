# Designing Data | Criteria A

### Part One | Need For Solution
<p>Listening to music is fun. There are more than 278 million people with an active subscription to music services. Additionally, music streaming as an industry hit more than 11.4 billion U.S. dollars in revenue worldwide. That's a lot of money and there are many people happy to pay $10 a month for unlimited streaming - but imagine if there was an alternative. If there was a beautiful, well-crafted and well-designed application to listen to millions of songs for free for life. That is where my solutution comes in. As someone who enjoys listening to music, I can empathize with those whose parents may not have an active family subscription or if you just don't feel like spending the money. While $10 a month doesn't seem like much, 78% of workers in the U.S. are living paycheck to paycheck and saving a few hundred extra bucks a year could come in handy. </p>
<p>In this case, the client is myself as I will be using this. When creating this, it must live up to my own expectations and be something that I would use myself. The taget demographic is, as I touched on above, anyone who doesn't want to pay the $10 music streaming fee.</p>

### Part Two | Research Plan
<p>Enter, "EonSound" - the revolutionary new music streaming service. To build an app like this, I will need to learn or have learned the following technologies on top of basic fundamentals such as HTML, CSS, and JavaScript:</p>

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
  - <a href=""> Content APIs</a>
    - <a href="https://developer.spotify.com/documentation/web-api/"> Spotify</a> - Spotify API will be necessary for providing song IDs and linking users to songs via search and user generated playlists.
      - <a href="https://developer.spotify.com/documentation/general/guides/authorization-guide/"> Auth flow</a> - An important part of the Spotify API to ensure all requestes are authenticated and secure.
      - <a href="https://developer.spotify.com/console/"> Get a track, album, playlist, artist, etc</a> - For general track details to fill up space and provide song info.
      - <a href="https://developer.spotify.com/console/get-search-item/"> Search songs</a> - Will be useful to provide songs to user.
    - <a href=""> YouTube</a>
      - <a href="https://www.npmjs.com/package/yt-search">Search & filter </a> - Search through song results and finding a relevant audio video.
      - <a href="https://www.npmjs.com/package/ytdl-core">Download</a> - Download top search result and save it.
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


<br>


<p>I am somewhat familiar with these technologies but in order to create a good user-experience, I will need to learn each of those more in-depth and practice them more.</p>

### Part Three | Product Examination

<p><b>Spotify</b> is likely the most popular streaming service and can be useful to be knowledgable in the "spotify experience" when building this app.</p>

![](assets/screenshots/2020-09-27-17-57-07.png)
| Spotify Pros  | Spotify Cons |
| ------------- | ------------- |
| Well-known and secure| UI could be improved |
| Large library of music | Shows ads or $10/mo |
| Shows music from friends | |
| Music recommendations | |
| Desktop, Mobile, TV, etc | |

<p><b>Apple Music</b> is another good option when it comes to music streaming. They came after spotify but have a good product to learn from.</p>

![](assets/screenshots/2020-09-27-17-54-16.png)
| Apple Music Pros | Apple Music Cons |
| --- | --- |
| Legendary UI | Only available on Apple devices |
| Music recommendations | Has less of a social aspect|
| Large library of music | Costs $10/mo to use |
| Fun features such as live lyrics | No free-tier with ads |
| Very easy to use | |

<p><b>YouTube</b> is primarily a video platform but many people use it for music as well. They have a dedicated music app which nobody uses, but do have a lot of content on regular YouTube.</p>

![](assets/screenshots/2020-09-27-18-04-14.png)

| YouTube Pros | YouTube Cons |
| -- | -- |
| Music videos + music | Ads without premium|
| Very large library | Slow compared to others |
| Material Design | No official desktop app |
| Popular and well-made | |


### Part Four | Design Brief

<center>Code samples are in the <a href="https://github.com/r0hin/eonsound">EonSound Repo</a>.</center>

#### 01
<p><b>Firebase Authentication Listener</b> to distinguise whether users are signed in or out. This will also be used to show user different views depending on their account status. For example, a login page when they are not signed in.</p>

```javascript
firebase.auth().onAuthStateChanged(function (user) {
  if (user) {
    // User is signed in.
  } else {
    // User is signed out.
  }
});
```

#### 02
<p><b>Spotify API Auth</b> is relevant to ensure all API requests go to spotify authenticated. Spotify has a very complex auth flow system so it was important to make sure the code worked before proceeding. I've put code comments to show what the code is doing.</p>

```javascript
// Check if access token stored in database is valid.

doc = await db
  .collection("users") // Firebase firestore users
  .doc(user.uid) // User doc
  .collection("access") // Access collection
  .doc("spotify") // Spotify doc
  .get();

if (!doc.exists) { 
  // If document does not exist, redirect to reauthenticate.
  window.location.replace("auth.html");
}

// data.access is the refresh token, so exchange it for an actual token
token = doc.data().access;
window.spotifyToken = token;
// Add it to a window variable to use it in the global scope and for troubleshooting.

// Exchange refresh token for a new token
const result = await fetch("https://accounts.spotify.com/api/token", {
  method: "POST",
  headers: {
    "Content-Type": "application/x-www-form-urlencoded",
    Authorization:
      "Basic {}",
  },
  body: `grant_type=refresh_token&refresh_token=${token}`,
});

const data = await result.json();
window.spotifyCode = data.access_token;

// SpotifyCode will be used for subsequent API calls.
```

#### 03

<p><b>Refresh Spotify Code</b> is a code snippet to be used to refresh the auth code after every use. I prefer using async/await instead of promises to keep the code readable instead of something like "and then, and then, and then..."</p>

```javascript
async function refreshCode() {
  const result = await fetch("https://accounts.spotify.com/api/token", {
    method: "POST",
    headers: {
      "Content-Type": "application/x-www-form-urlencoded",
      Authorization:
        "Basic YjJiMGU0MWQwYTNlNDQ2NGIxMmViYTY2NmExZGUzNmQ6Y2MwMWM3OTExYjRjNDE2ODliOTcxMDM0ZmY5NzM1ODc=",
    },
    body: `grant_type=refresh_token&refresh_token=${spotifyToken}`,
  });

  const data = await result.json();
  window.spotifyCode = data.access_token;
} 
```
#### 04
<p><b>Async/Await</b> is relevant in complex functions.</p>

```javascript
async function func() {
  await x;
  // console.log('1')
  await x;
  // console.log('2')
  await x;
  // console.log('3')
}

// This code is much more readable than:

function func() {
  x.then(function(result) {
  // console.log('1')
    x.then(function(result) {
      // console.log('2')
      x.then(function(result) {
        // console.log('3')
      })
    })
  })
}
```

A useful research source is <a target="_blank" href="https://youtu.be/vn3tm0quoqE">This YouTube Video</a>: 
#### 05
<p><b><a href="https://plyr.io/">Plyr</a></b> is a beautiful audio/video player I will be using</p>

```javascript
// Playing songs
const player = new Plyr("audio", {});
$("#player").attr("src", `${song.url}`);

// Add to queue if a song is playing
if (musicActive.none !== "none") {
  Snackbar.show({ text: "Added to queue" });
  buildQueue();
}
```
#### 06
<p><b>Promise</b> is a useful feature in JavaScript which will be used. Relevant code snippets:</p>

```javascript
async function playAlbum(data) {
  for (let i = 0; i < data.length; i++) {
    // Waits for promise resolve returned by play(),
    await play(data[i].external_urls.spotify, data[i].id);
    // This is to ensure queue is in order.
  }
}
```
#### 07
<p><b>Error Handling</b> is relevant in all API calls. The follow code refreshes the token if an error occurs and retries the request. This can happen if there are no requests within an hour and the token times out.</p>

```javascript
const data = await result.json();

if (data.error) {
  if (sessionStorage.getItem("errorAvoid") == "true") {
    // Don't start a loop of errors wasting code use.
    Snackbar.show({ text: "An error occured while searching" });
    return;
  }

  console.log("Error occured. Likely invalid code - request new code and do it again.");
  
  sessionStorage.setItem("errorAvoid", "true");
  refreshCode();
  performSearch(val);
  return;
}
```
#### 08
<p><b>Building Search Results</b>. This is important to do effeciently as potentially hundreds of elements will be built at once:</p>

```javascript
async function buildSearch(data) {
  // Data is an object containing fields: albums, artists, playlists, tracks
  $("#search_albums").empty();
  $("#search_artists").empty();
  $("#search_playlists").empty();
  $("#search_tracks").empty();

  for (let i = 0; i < data.albums.items.length; i++) {
    a = document.createElement("div");
    document.getElementById("search_albums").appendChild(a);
  }

  // Incomplete but the premise is there.

}
```