# Designing Data | Criterion C
## Creating the Solution
### Part One | Plan

| Date 📅| Prediction ✨ | Progress 📈 |
| - | - | - |
| Jan 22-25 | - Fix up some bugs and QoL features on EonSound to prepare it for more development | - Fixed some bugs. <br> - Added some features like export to JSON|
| Jan 26-28 | - Create the button to move to the forum place. Structure the page with the title and search bar. | - Added link account to google for some reason. <br> - Might be getting distracted! |
| Jan 29-31 | - Get search working similarly to "listening parties". <br>- Be able to play songs directly from forum place. | - Updated app version, readme, and desktop app <br>- Go backwards 10 seconds and forward 10 seconds.<br>-Modified account tab to settings tab and redeveloped some titles.<br>- Fixed some small bugs and minor enhancements. | Feb 1-3 | - Handle forum section where opening a song would change the UI drastically.<br>- Create new post button | |
| Feb 4-6 | - New post logic and display the latest posts relevant to the song. <br> - Finalize database structure for forum system. | - None|
| Feb 7-11 | - Add features like "like" and view comments.<br>- Fullscreen a post and open the details. | - Added like button |
| Feb 12-14 | - Option to send a main-app friend request FROM the forum website. <br>- Add some animations and make it update live when submitting a new post via fb listeners. |  - Added the option to send a friend request |
| Feb 15-19 | - Ensure it looks good and implement the dark mode / light mode system on the page.<br>-  Finish the features and ensure it's production-ready. <br>- Publish it (evluate, etc)|  - Did some last minute changes and published it!  |

### Part Two | Skill Development

Over the course of this project, I developed many fundamental skills that I will use in both the near-future and in the long-term. They are: TypeScript, Social Media Development, and Project Experience. 

<b>TypeScript</b> is a strongly-typed layer on top of JavaScript. Firstly, the TypeScript code was not finalized and is not included as of now. The reason for this is because I used this project as my first time attempting to work with TypeScript. Although, I was doing some fundamental things wrong, I did grasp the general idea and was able to transfer the skills to a secondary React-Native project I completed for my MYP Personal Project. I got familiar with the language in this project and officially used it in the later project.  

<b>Social Media Development</b> is another thing I learned throughout the course of this project. I am currently enrolled in the "WAC Sprint" which is a ~1 month long incubator with a final prize. Our group's target audience is adolescents and our theme is media. This skill will help me in the short term, for example, that incubator where my skills will be transferable to building similar media-related projects. Secondly, the skill is helpful in the long-term because it gives me a fundamental overview on how social media sites are developed internally and the kinds of things that the developers must pay attention to that I would have never thought of. Small micro-interactions, ease-of-use in specific places, etc.

<b>Project Experience</b> is something I mentioned in the previous Y10 design project and I believe with this project, I further expanded my experience relating to project development and coding. I learned a lot about planning because what I actually got done was very different to what I had outlined. This is important because I feel that this is reflecting in real development jobs and it is crucial to be flexible with the outcome so that you are able to keep pace with the plan and modify it as needed. 

### Part Three | Video Submission & Code Segments
Currently uploading the video. I will replace this text with the link once its available.

### Part Four | Changes
There were definitely many changes that had to be made during the process of development. It is extremely difficult to near impossible for a project to go 100% as plan and there were many techincal and project issues that needed to be either resolved or moves away from. I will discuss and explain the database structure redesign, UI changes, and finally, the idea change. 

<b>Database Structure Redesign</b>. I decided to use Firebase Cloud Firestore for the duration of the project. I chose this because I am familiar with the structure and the syntax required. Although, I was limited in experience with optimizing the database for reads and writes. The first major project was conducting the posts structure so it had all the relevant details, but also a way that it would store each user that liked the post and commented. Originally, I had it stored through arrays in the "post" document. I quickly found out that there was a 1mb limit to how big each document could be. I resolved many issues by switching document arrays to their own collections. Although this uses significantly more reads and writes, it will be a lot more scalable in the future. 

<b>UI Changes</b>. With any project, I like to change the UI a lot and settle on a good-looking design that is functional and has a good user experience. I had actually chosen a different design out of the potential designs back in Criteria B. After working on it, and getting comfortable and used to the design, I decided it would be better if I switched designs. I did this because as I was building the original design, I thought it was too complicated and traditional to any other forums website. I wanted to radically change the standard by making it more user-focused and have less of a "2011 chatroom" vibe. I believe I was successful and the new UI looks better and includes more user-focused components. (The old design was #2, the new one is #1).

<b>The Idea Change</b>. This is the biggest change to the design because it fundamental changed the design itself. Originally, my idea was to create a standalone social media with custom components, layout, etc. The reasons why I quickly switched ideas and redid the project are for the timeframe, size, and saturation. Frankly, the project was very big for the time given. I thought it would be a fun side project but I was not sure that I would be able to complete it in less than a few months. Secondly,  the project would be massive and although it would be a legendary learning experience, I believe I needed some more time with Firebase, web development, etc to be able to complete it properly. Finally, there are a plethora of available social medias and if I were to create one, I would prefer if it is unique and useful. I cannot say that many of the current popular social medias are unique nor useful (anymore). I decided to keep the social aspect and merge it with my term one project: the music app. It would make the idea more niche and smaller by limiting the forum / social media to music-related topics and conversations. As for the saturation aspect, I believe there are many music forums out there but very few that integrate the conversations with the actual listening part. This is why I changed the idea in the project but also may be the reason the final product feels incomplete. I am very excited to keep working on it even after this unit is over!


<center>
<br><br><br><br>
End. Thank you for reading. 🌴
</center>