# Designing Data | Criterion B
## Developing Ideas
### Part One | Success Critera

| Request| Critera | Evaluation | Justification |
| - | - | - | - | 
| User Interface | - UI looks very appealing.<br>- Colors are consistent across the UI.<br>- Closely follows Google's Material Design specifications.  | A survey will be given to random users with questions such as, "Is the UI appealing to you?", with Y/N answers. | User interface is very important to a software solution's success. From my own experience, if an app does not have an appealing UI, I am less likely to use it. This mindset is shared with many users and many potential users of this application. |
| Functionality | - Music can be played.<br> - Users can view forum posts.<br>- Users can post comments about specific songs.<br>- Account authentication is secure and functional. | The criteria is measurable and so to evaluate, I will select yes or no for each of the criteria elements and justify. | Good UI is useless when there is no functionality of the app. Since the product is a dedicated music forum and discussion platform, it is important to build functionality around this topic to improve the overall experience. |
| Publication | - The website loads quickly inside of the application similarly to the rest of the pages. <br>- It should work via Electron with a high degree of stability for all platforms. | For load times, it must load on average 3s or less on a stable internet connection (UCC Wi-Fi). Rest of the critera are y/n answers and will be evaluated alongside a justification.| Ensuring that the site is easy to use and able to be run on as many users' computers as possible is important. It will run through the EonSound application which has already been evaluated as successful. |
| User Experience | - Website is easy to use according to users. <br>- Buttons are quite easily understood with icons or context. <br>- Users report a high quality music and library experience. | This will be evaluated via a secondary form with questions such as, "Would you use the forums?", given to at least 5 people.| UX is another important critera for a website's success. To ensure users' are having a good experience using the website, feedback surveys will be conducted. If the user is not having a good experience while using the website, there is obviously no reason to continue using it which is not good. |

### Part Two | Design Ideas
#### Idea One
This idea is very unique in that it shows a design with a large front-facing title. This gives immediate context to the user. Underneath, there is a large search bar to search up a song. After it is selected via a dropdown menu, the search bar and other elements will be removed and the actual forum-related content will be shown. This includes posts, profiles, etc. 


#### Idea Two
This idea is similar to previous sites where all posts are visible across the platform. With this, the songs are included simply via tags and are able to be played on a click. With this idea, it will be more familiar if the user has used any other type of forum software.

#### Idea Three
Similarly to Idea Two, this idea will be build directly into the main app. There will be an option in the song's context menu to open a sidebar containing all the forum-related features there. This will be interesting because the user will not need to go somewhere else to access the forum topics and can instead use the app normally.


### Part Three | Chosen Design
<p>I've chosen <b>Design #1</b> for the inspiration for the solution because of a few reasons.</p>
<p>
Firstly, it's <b>unique</b>. A forum with unlimited topics is not very common and I have never seen it before. Topics are usually standardized and all posts fall into a predefined category. This idea will have millions and millions of categories and topics since each song will have it's own discussion.
</p>
<p>Secondly, it has a high degree of <b>user-experience</b>. ...Or at least, I think it will. I believe it will be much easier to understand a simple "talk about your favourite song" rather than having to understand how all the forums topics work together to create a separate experience. If I were the end-user, i'd rather not get too involved with traditional forum software and instead treat it more of a discussion element.</p>
<p>Finally, it is <b>feasible</b>. Some features of the other designs require a high degree of knowledge. Things like proper post discussion, WYSIWSYG editors, and more are tools beyond the scope of my research. I believe it is important to decide on an idea that I can complete cofidently and thoroughly than a half-baked idea that doesn't work well with the rest of the app and is not very optimized.</p>

### Part Four | Planning Materials

#### 01
I've created a database structure in Firestore of what the posts could look like this. This will be the most scalable as I have recieved guideance from experts from within the field such as a prominent official Firebase developer and community member.
![](assets/screenshots/2021-02-19-00-55-27.png)

#### 02
As shown in the previous section (Inquiry and Analysis), here are some code snippets for async/await and es6 array functions.
```javascript
async function() {
  // One line to call firebase
  data = await firebase.firestore().collection('app').doc('music').get()
}
```
```javascript
callbackFunction((params) => {
  //
})
```

#### 03
Here is the link to a snippet of my demo social media project I created in preparation for this. <a target="_blank" href="https://raw.githubusercontent.com/r0hin/echo/master/app/js/home.js">r0hin/echo/app/js/home.js</a>

It includes code such as 

```javascript
query = await db.collection("timelines")
  .doc(user.uid)
  .collection('posts')
  .orderBy("timestamp", "desc")
  .startAfter(lastVisibleRel)
  .limit(8)
  .get()
```

where the code performs a Firebase Firestore query to gather relevant data in the correct order and format. 




<center>
<br><br><br><br>
End. Thank you for reading. 🌴
</center>