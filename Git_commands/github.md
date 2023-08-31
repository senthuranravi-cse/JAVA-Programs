# GITHUB

## Global config
- >git config --global user.name "senthuranravi-cse "
- >git config --global user.email "senthuran.ravi02@gmail.com"

## Cloning project
- >git clone link

## Check Status
- >git status

## Github modify files
 After cloning .git file is create in directory using this only you can get your files to github

 Working_System -> .git -> Github

 For adding files to git hub you need to move your file staging area from that you need to move your file to .git folder.After that only you can add your file to github

 Github -> git_folder -> working_folder -> Staging_area

Modify -> Add -> commit -> push
- >git add filename
- - To add bulk files
-  - >git add .
- >git commit -m "commit message"
- >git push origin branch

## Get changes made in github
- >git pull

## Add folder in github new repo
 First you need add .git file in newfolder for that you need this commands
- >git init
 After you need add origin link in the folder
-  >git remote add origin link
You need check branch
- >git branch
- >git branch -M branch_name

## Branch in github
#### Branch is used to edit main file and merge it so that multiple user work together and do their work after that you can edit new work with main file

 To get all avaliable branch
- >git branch -a

 Move to particular branch
- >git checkout branch_name

 To find difference between two branch
- >git checkout branch_name1 
- >git diff branch_name2

 To merge branch1 with branch2
- >git merge branch1

 To create newbranch
- >git branch branch_name

## Pull Request
#### Sometimes you can't get direct access to main repo for that you raise pull request to your higher official they check your changes and then allow to merge with main repo. It can't done by cmd using github only you can raise pull request

## Merge Two repo
Let's say you have two repositories: RepoA and RepoB. You want to merge the master branch from RepoB into RepoA.

Clone RepoA to your local machine if you haven't already:
- >git clone <RepoA_URL>
- >cd RepoA

Add RepoB as a remote:
- >git remote add RepoB <RepoB_URL>

Fetch the branches from RepoB:
- >git fetch RepoB

Merge the master branch from RepoB into RepoA:
- >git merge RepoB/master

## Tags
#### In GitHub, tags are used to mark specific points in a repository's history, usually to signify a particular release or version. Tags are often used to create stable reference points for the codebase, allowing you to easily refer back to specific versions of your project. 

## Fork
#### In the context of version control systems like Git and platforms like GitHub, a "fork" refers to the act of creating a copy of a repository, typically someone else's repository, in order to make your own changes or contributions without affecting the original repository. 
