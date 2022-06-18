# Designing Data | Criterion D
## Evluating
### Part One | Success Criteria

| Topic | Critera | Evaluation | Justification |
| - | - | - | - | 
| UI / UX | - Colors are consistent and respect the user's theme, (Dark blue background in dark mode, primary color by theme, etc).<br>- Colors are consistent across the UI.<br><br>- Closely follows Google's Material Design specifications which outlines details about specific elements such as buttons, cards, etc.<br><br>- All buttons and icons are easily identifiable and it is easy to tell their purpose.<br><br>- The product is reported as easy to use and good looking from users.  | A survey will be given to random users with questions such as, "Is the UI appealing to you?", with Y/N answers. Users report a high quality music and library experience.| User interface is very important to a software solution's success. From my own experience, if an app does not have an appealing UI, I am less likely to use it. This mindset is shared with many users and many potential users of this application. UX is another important critera for a website's success. To ensure users' are having a good experience using the website, feedback surveys will be conducted. If the user is not having a good experience while using the website, there is obviously no reason to continue using it which is not good.|
| Discovery Functionality | - Search field works and returns data about the song.<br><br> - There are buttons with trending searches in order to provide example searches.<br><br>- Potential resuts include the entirety of the Spotify library.<br><br>- Account authentication is secure and functional so that users cannot search until they are signed in. | This criteria is measurable and so to evaluate, I will select yes or no for each of the criteria elements and justify. | Discovery is important to any application, however, since this product is largely based around user searches, it is especially important that the experience is both possible and high-quality.|
| Commenting Functionality | - Possible to comment in any song's forum.<br><br> - Comments / posts are laid out in sequentially automatically. <br><br>- Comments update immediately to provide a more immersive and reactive experience| This peice of functionality will require that users are actually able to provide their thoughts and read out people's posts about music. This feature will thereby complete the mission of the application itself and could easily be labelled the most important feature. | Similarly to the discoverability functionality criteron, the points listed to the right can be objectively measured which is why I will be evaluating them with a simple yes/no + justification.|

### Part Two | Evaluation

#### UI / UX Evaluation

| Qs| A #1| A #2| A #3 | A #4|
| - | - | - | - | - |
| Is the UI appealing to you? | Yes | Yes | Yes | Yes |
| Would you use the forums? | sometimes maybe | probably yea | I would use it if it was more integrated into the app itself that way i dont need to go to a separate page for it. rn probably not very often | eh i dont really have a need for it but i can see ppl using it|
| Does the product have a good user experience? | Yes | Mostly, yes. | Definitely. Nice animations. | yea its good

<p>Based on the feedback above, it can be seen that the UI is definitely a strong suit of the platform as 4/4 of the survey participants selected yes. Unfortunately, the success does not extend to the second question where the participants were asked if they would use the forum in their own time. Most people were either indeterminate or said some variation of 'no'. I believe that the outcome would change severely if it was integrated into Spotify or an app where more of their friends also used it. I believe that if more people used EonSound as a whole, and the forums were restricted to only show friends' responses, usage would be much higher! Finally, 4/4 people responded as some variation of 'yes' to the user-experience based question which suggests that there is not necessarily a problem with the app itself but instead, there is a problem with it's use-cases and integration. </p>


#### Discoverability Functionality Evaluation

| Qs | As |
| - | - |
| Does the search field work and return deta about the song? | Yes. Upon searching, there is a list of potential results. After the user clicks one, information is returned about the song including art, title, artist and the music itself. |
| Are there buttons with trending searches? | Yes. Before selecting a song, there are buttons with recent searches from other users displayed. |
| - Do potential resuts include the entirety of the Spotify library? | Yes. Since the search results are based on the Spotify API, each song is available.  | 
| Is Authentication functional and secure? | Yes. It relies on Firebase Authentication which is very secure. |

<p>Based on the objective answers above, each functionality point written on the success criteria was built successfully. Users can view forum posts and create them. Music can be played with Firebase Authentication securing everything in the app. As such, the functionality included is a success.</p>

#### Commenting Functionality Evaluation


| Qs | As | 
| - | - |
| Is it possible to comment on any song's forum. | Yes. The forums are based technically of the song's Spotify API ID which creates a new forum for each song.|
| Are comments from other users displayed automatically? Is it displayed sequentially? | Yes. Each comment is properly displayed automatically. It is formatted sequentially via an ordered array in the database.
| - Do comments update immediately? | Using a combination of Firebase listeners and logic, the live chat should update automatically which provides a place to have real-time conversations.  | 

#### Publication Evaluation
<p>Since the product is an extension of the EonSound application, much of the publication points will be similar.</p>

2.3 <b>Publication</b>.

| Specification | Evaluation | Justification |
| - | - | - |
| Does the website load in under 3s? | Yes | The website loads in about 2.5 seconds on average which is perfect and falls successfully into the criteria. |
| Is the website properly packaged for all platforms? | Yes | Viewing the GitHub releases page, there are working packages for Windows and Mac. I have not tested the app on Linux however the node package "electron-packager" is very reliable. MacOS is distributed in a DMG file with an easy drag to install. Windows has a dedicated installer and creates the necessary shortcuts.  |

<p>The publication was very successful in terms of a music / forum website (/ application). </p>

### Part Three | Verdict & Improvements
<p>My verdict in terms of success level is <b>unsuccessful</b>. I will explain the reasons for this in the improvements section.</p>


#### Improvements

<b>Usage Rate</b>. Although the application / website is technically successful in terms of the feedback given by the beta-testers and objectively, the users make the product - especially with social-based solutions like this one. Since the application does not have enough users to start, and is not necessarily going to be used often, it is not comparable to alternatives. The point of a public forum or discussion is to make it open and accessible enough that users want to use it and <i>will</i> use it in their own time. Since 3/4 of the users did not say they will, it brings up concern for the potential lifecycle of the project. <b>Although the section is not successful yet, there is still potential for it to gain lots of popularity.</b> 

#### My Theory 

<p>As I mentioned briefly before, since users may not use it very often, the app and forums itself need something together that is worth switching to from Spotify, Apple Music or other alternatives. This is a difficult task but some potential technical decisions that could be made to accelerate this are: </p>

- Moving the social aspect directly into the app itself to make it more integrated with the rest of the application. This will also make it more accessible to users already using EonSound. This will boost forum activity exponentially. The reason why it will be exponential is because I believe that if users will use the forum *if* other people use it. <b>As one user noted,</b> "I would use it if it was more integrated into the app itself that way i dont need to go to a separate page for it.". This adequately higlights the need for better integration with the rest of the platform.
<br>
- Include a "recent posts from friends" section to show what your friends are talking about and which song/topic they are speaking on. As of now, you must search for a song to see the active posts on it. This makes it difficult to find what you friends are saying about songs and adds difficulty in finding people you know on the forums.
<br>
- Dramatically reduce playback time (new method needed). The issue of long pre-song loading times still stand because there is no chage to how songs are processed in the forum section of the app. This could be improved and would sement the cement the similarity between this and more funded competitors.

<p>If these technical challenges are met and there exists an initial boost of users, I believe that the userbase and success criteria will be 100% met and the forum can be considered a success. Until then, there are definitely more steps to be taken.</p>


### Part Four | Impact

<p>The impact of the forum on the users and myself is quite interesting. The user now has access to the following suite of features:</p>

- A place to view comments on millions of songs.
- Ability to share their thoughts with other users about musical topics.
- Partake in conversations that update live with any other user or group.

These features were not available before and are included in the impact the product has on the EonSound average user. Next, the experience it has given me cannot be understated. I went into the project thinking it would be a very simple technical build but was surprised at the care and craft needed for true success. It was a technical success but my expectations were increased due to the success of EonSound and I had expected more user and a higher rate of user acquisition based on the success criteria and testing. In conclusion, the impact this project had on me is phenominal and I am very grateful.

<center>
<br><br><br><br>
End. Thank you for reading. 🌴
</center>