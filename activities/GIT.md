### GIT
PART 0:<br/>
Create a git projet<br/>
Create a file Readme.txt and first.txt<br/>
Commit and push it on your repo<br/>

PART 1:<br/>
You have worked hard and the result is beautiful.<br/>
But somehow there's a bug.<br/>

It's late, your partner wants you to go home.<br/>

Hell, maybe a good night sleep (or a good night something else)<br/>
will help you find that stupid bug.<br/>

So you want to go home, but you don't want to leave the work unsaved,<br/>
that would be unprofessional. And you're a pro.<br/>

So, as the code cannot be merged into master yet, you decide to create a branch<br/>

- Create a file second.txt with the text "A B C D F G"<br/>
- Create and checkout a new branch named "second"<br/>
- Commit the current state<br/>
- Push itv<br/>

PART 2:<br/>
Your mind is clear and ready to tackle that nasty bug.<br/>
As you march to your desk like the conquerant you are, your boss stops you.<br/>

There's an urgent fix that needs to go out in prod just. right. now.<br/>

- Checkout the branch master<br/>
- Pull it to get the last version<br/>
- Add a "three" to the file first.txt<br/>
- Commit and push the changes to that new file<br/>

PART 3:<br/>
Now is the time to tackle the problem, let's get back to your work.<br/>

- Checkout the branch second<br/>

PART 4:<br/>
Of couuuuurse !<br/>
You found it, the 'E' is missing between 'D' and 'F'<br/>

After fixing the bug, the awesomeness can be merged into master.<br/>

- Modify the file so that it's beauty is complete<br/>
- Commit the difference<br/>
- Push it<br/>
- Merge it into master<br/>
- Push master<br/>


PART 5:<br/>
You are a good citizen (or at least in this story we assume you are).<br/>
You are not working anymore on the branch file-second<br/>

- Delete the branch fsecond both localy and on github<br/>

PART 6:<br/>
Now, you work on a new evolution.<br/>

- Create a branch "three"<br/>
- Create a file three.txt<br/>
- Commit and push it<br/>
- Create a file four.txt<br/>
- Commit and push it<br/>

PART 7:<br/>
There is a urgent fix (again), we need the file four.txt only on prod<br/>

- Cherry pick this file on master<br/>
- Add the text "G H I J K M"<br/>
- Commit and Push it<br/>

PART 8:<br/>
You have a time to work on the branch three<br/>

- Add "G H I J K L M" on the four.txt<br/>
- Commit and Push it<br/>

PART 9:<br/>
You want to merge the four.txt on your master<br/>

- Merge it<br/>
- if there is some conflict, correct it<br/>
- Commit and Push it<br/>