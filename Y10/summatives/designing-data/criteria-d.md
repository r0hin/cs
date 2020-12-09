# Designing Data | Criteria D
## Evaluate
### Part One | Testing Methods 🧪
Here is the chart from Criteria B outlining the success criteria, testing methods and details.
| Request| Critera | Evaluation | Justification |
| - | - | - | - |
| User Interface | - UI looks very appealing.<br>- Colors are consistent across the UI.<br>- Closely follows Google's Material Design specifications.  | A survey will be given to random users with questions such as, "Is the UI appealing to you?", with Y/N answers. | User interface is very important to a software solution's success. From my own experience, if an app does not have an appealing UI, I am less likely to use it. This mindset is shared with many users and many potential users of this application. |
| Functionality | - Music can be played.<br> - Users can intuitively search for and find songs.<br>- A flexible library system is provided.<br>- Account authentication is secure and functional. | The criteria is measurable and so to evaluate, I will select yes or no for each of the criteria elements and justify. | Good UI is useless when there is no functionality of the app. Since the app is a dedicated music finder and player, it is important to build functionality around these features to improve the overall experience. |
| Publication | - Application loads quickly. <br>- Application is properly packaged for MacOS, Windows, and Linux via Electron. | For load times, it must load on average 3s or less on a stable internet connection (UCC Wi-Fi) because of <a target="_blank" href="https://www.marketingdive.com/news/google-53-of-mobile-users-abandon-sites-that-take-over-3-seconds-to-load/426070/#:~:text=New%20research%20by%20Google%20has,seconds%20on%20a%204G%20connection.">this article's summary</a>. Rest of the critera are y/n answers and will be evaluated alongside a justification.| Ensuring the app is easy to install and able to be installed on as many users' computers as possible is important as without an easy way to install the app, very few people will actually be using the solution. By building it cross-platform, it will allow the most number of people to use this application. |
| User Experience | - App is easy to use according to users. <br>- Button actions are easily understood with icons or context. <br>- Users report high quality music and library experience. | This will be evaluated via a secondary form with questions such as, "Is the audio of high quality?", given to at least 5 people.| UX is another important critera for an app's success. To ensure users' are having a good experience using the app, feedback surveys will be conducted. If the user is not having a good experience while using the app, there is obviously no reason to continue using it which is not good. |

### Part Two | Evaluation 🤔
 My beta testers are: Xan, Fisher, Hewitt and Jacob.

2.1 <b>User Interface</b>.

| Qs| A #1| A #2| A #3 | A #5|
| - | - | - | - | - |
| Is the EonSound UI appealing to you? | ☑️ "ui is appealing" |☑️ |☑️ "The UI is very clean and appealing." |☑️ "Yes, the EonSound UI is very good, as it is completely interactive but still maintains a minimalistic feel to it." |
| Do the colors look good (both light and dark theme)? |☑️ "themes are good" |☑️ | ☑️ "The light mode is a bit blinding for my taste but it looks like most light modes, but the darkmode looks really good and I like the selection of accent colours." | ☑️ "I think the colours are good, although I think that bright pink is a bit of a strong colour" |
| Are you able to understand what each component does? | ☑️ "understanding is easy"| ☑️ | ☑️ "It looks really good to the eye and makes it very obvious what everything does." | "Yes, EonSound is very straight forward, with only some minor confusions that takes only minutes to get used to (the direct messaging and friend system)" |
| Do you have feedback for the UI? If so, what is it? |  "make listening parties more accessible" | | "My one issue with the UI is the playlists section has like a really big cover and really small songs, you should make the music a higher priority than the songs" | "The only piece of advice I have for the UI would be the title, as I don't think the font matches the minimalistic feel of the entire platform"|

Looking at the feedback given by the users, it is the general consensus that the UI generally looks appealing, minimalistic and user-friendly. This is definitely a positive and successfully clears the first section of criteria. The colors were also popular. This is very good since I changed it multiple times throughout development. As well, as tester #3 points out, the light mode is quite bright but I believe that can be chalked up to personal preference or bias. The one issue pointed out is that features like the friends and messaging system are a bit hard to understand at first which I definitely plan to improve. Finally, the feadback given at the end is very useful and mostly have to do with enhancements and not necessarily usability issues. I will definitely consider these changes for the next few updates. In conclusion, I believe the UI portion of the criteria was a success.

2.2 <b>Functionality</b>.

| Specification | Evaluation | Justification |
| - | - | - |
| Can music be played? | Yes | Music is able to be played with a ~95% success rate per song. Almost all tested songs were able to be played without any issues and the method of playback has been edited to be as efficient and effective as possible.  | 
| Can users easily search and discover songs? | Yes | Searching and discovering songs have been made super easy for the end-user. Two dedicated tabs and a music-based social system allows users to discover popular music quickly.|
| Is the library system flexible and powerful? | Yes | The library system was modelled after Apple Music's and is automatically updated and managed without any user input. Many features are there especially with list-based media such as albums and playlists where you are able to only show the tracks in your library and drag around songs.|
| Is authentication secure and functional? | Yes | Running with Firebase Authentication, authentication is secure and works flawlessly. All spotify tokens are stored and used locally for speed and security. |

2.3 <b>Publication</b>.

| Specification | Evaluation | Justification |
| - | - | - |
| Does the application load in under 3s? | No | The application loads in about 6 seconds on average. The reason why this is actually quite reasonable and not too detrimental is because the article I cited stated that 53% of mobile website visitors will leave if it doesn't load in under three seconds. This applies to websites and exclusively on mobile. In reality, with a desktop app, the reality is very different and the norm for load times for opening desktop apps skyrocket with Apple Music taking 17 seconds or more with my testing. Nevertheless, it did not successfully pass this specification. |
| Is the application properly packaged for all platforms? | Yes | Viewing the GitHub releases page, there are working packages for Windows and Mac. I have not tested the app on Linux however the node package "electron-packager" is very reliable. MacOS is distributed in a DMG file with an easy drag to install. Windows has a dedicated installer and creates the necessary shortcuts.  |

### Part Three | Improvements 📈

working on it

<!-- 3.1 <b>Recommendations Algorithm</b>.
3.2 <b>Listening Parties Enhancements</b>.
3.3 <b>More Performant Playback</b>.
3.4 <b>Improved Error-Handling</b>. -->

### Part Four | Impact 💥

working on it

