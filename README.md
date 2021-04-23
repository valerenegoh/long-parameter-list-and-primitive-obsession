# Long Parameter List and Primitive Obsession

## Trainer Guide

* Fork this repository to Trainee's GitLab group
* Remove the trainer's refactor reference branch
* Delete this section of the README

## Trainee Guide

For this exercise, you are looking to refactor TWO code smells:
* Long Parameter List
* Primitive Obsession

Research the code smell and fix it in the code.
Present it back to the team by explaining:
* What are the code smells?
* What is the effect? Why is it bad to leave them?
* How did you fix it? Show us the before and after.

##### Clone the project
```shell
git clone git@gitlab.freewheelers.bike:mcalder/dojos.git
```

##### Checkout and update the master
```shell
git pull -r
```

##### Create a new branch with TWU Number, Team Number and Pair Name, example:
```shell
git checkout -b refactoring-techniques-<TWU_NUMBER>-<TEAM_NUMBER>-<PAIR_NAME>
```

##### After finishing the exercise, submit your changes
```shell
git fetch origin master && \
git add . && \
git commit -m "WIP - Refactoring Techniques Session" && \
git push origin refactoring-techniques-<TWU_NUMBER>-<TEAM_NUMBER>-<PAIR_NAME> --no-verify
```
## About this Application

This application contains code snippets for calculating how many odd, even, positive or negative numbers are in a range of numbers.
Scenarios can be reviewed and executed from the tests.