# Flippy Card: Your New Favorite Game?

## Overview
Welcome to your second assignment, where we will continue practicing our Java skills. Our focus will be on building a program that involves multiple classes working together to create the overall functionality.

Don't forget to regularly commit and sync to Github. Your final code will be submitted to Gradescope.

## Flippy Card - The Game Rules

When the Flippy Card game starts, you deal five cards face down. Your goal is to achieve as high a score as possible. Your score only includes cards that are face up. Red cards (hearts and diamonds) award positive points, while black cards (clubs and spades) award negative points. Cards 2-10 have points worth their face value; Jack, Queen and King are 10; and Ace is 11.

The game is played by flipping cards (either from face down to face up or from face up to face down). As you play, you are told your total score (i.e. total of the face up cards) AND the total score of the cards that are face down. You can think of the face down total as the opposite of the face up total (e.g., if you flipped all the face down cards up, and face up cards down, your score would be the face down total). The challenge is that you only get a fixed number of flips and then the game is over.

Here is an example of the output from playing the game. (You play the game by typing in user input to the console.)

```
FACE-DOWN | FACE-DOWN | FACE-DOWN | FACE-DOWN | FACE-DOWN
Face up total: 0
Face down total: -5
Number of flips left: 5
Pick a card to flip between 1 and 5 (-1 to end game): 1
Queen of hearts | FACE-DOWN | FACE-DOWN | FACE-DOWN | FACE-DOWN
Face up total: 10
Face down total: -15
Number of flips left: 4
Pick a card to flip between 1 and 5 (-1 to end game): 2
Queen of hearts | Jack of clubs | FACE-DOWN | FACE-DOWN | FACE-DOWN
Face up total: 0
Face down total: -5
Number of flips left: 3
Pick a card to flip between 1 and 5 (-1 to end game): 2
Queen of hearts | FACE-DOWN | FACE-DOWN | FACE-DOWN | FACE-DOWN
Face up total: 10
Face down total: -15
Number of flips left: 2
Pick a card to flip between 1 and 5 (-1 to end game): 10
10 is not a valid card
Queen of hearts | FACE-DOWN | FACE-DOWN | FACE-DOWN | FACE-DOWN
Face up total: 10
Face down total: -15
Number of flips left: 2
Pick a card to flip between 1 and 5 (-1 to end game): 0
0 is not a valid card
Queen of hearts | FACE-DOWN | FACE-DOWN | FACE-DOWN | FACE-DOWN
Face up total: 10
Face down total: -15
Number of flips left: 2
Pick a card to flip between 1 and 5 (-1 to end game): 5
Queen of hearts | FACE-DOWN | FACE-DOWN | FACE-DOWN | 3 of hearts
Face up total: 13
Face down total: -18
Number of flips left: 1
Pick a card to flip between 1 and 5 (-1 to end game): -1
Queen of hearts | FACE-DOWN | FACE-DOWN | FACE-DOWN | 3 of hearts
----------------------
Your score: 13
Best possible score: 15
```
At each point where the program asks the user to pick a card, the game waits for user input.

## Classes

Here is a quick overview of the different Java files we will use to organize our code for coding the Flippy Card game. 

### Card

A class that represents a playing card with numbers 2-10, Jack, Queen, King, Ace and four suits (hearts, diamonds, clubs, spades). There are two methods you will need to fill in.

### WarmUp

A class where you will practice working with arrays of `Card`s and `double`s. You will need to fill in at least two methods.

### CardDealer

A basic class to handle dealing and shuffling cards from one or more decks of cards. We will use this class as is, but you are still encouraged to look at its code.

### FlippyCards

This is the class that keeps track of the state of the game. Virtually all of the methods that you'll be implementing are here, though you will use the two previous classes
to help you. Make sure you understand what each method is supposed to do.

### FlippyCardGame 

This class is where the game interface is implemented. It gets the data from the user, updates the board, and repeats the process.


## How to proceed

### Warm Up
- Start by reviewing the `Card` class.
- Look into the instance and static variables and think how they have been used to model the playing card.
- Then take a look at the constructor; it not only takes a suit and number but also checks whether the input is valid and if not it assigns a default value. Review the `isValidSuit` and `isValidNumber` methods. Note that equality for objects, such as `String`s, is checked using the `equals` method not the `==` operator, i.e. `obj1.equals(obj2)` instead of `obj1==obj2`.

- Look into the `WarmUp` class. Fill in the `countHearts` method that takes an array of Cards as a parameter and counts
how many of the cards have the suit "hearts".

   For example, if we ran the following code:
```
         Card[] cards = new Card[4];
         cards[0] = new Card(1, "clubs");
         cards[1] = new Card(1, "hearts");
         cards[2] = new Card(3, "hearts");
         cards[3] = new Card(2, "diamonds");
         System.out.println(countHearts(cards));
```
   it would print `2`.

- Fill in the `addArraysSameLength` method that takes two arrays of `double`s as parameters. The method should make a new array where the i-th entry in this array represents the sum of
the i-th entries of the two input arrays and return this new array. You may assume that the
arrays have the same length.

   For example, if we ran the following code:
   ```
         double[] array1 = {1, 2, 3, 4, 5};
         double[] answer = addArrays(array1, array1);
         System.out.println(Arrays.toString(answer));
   ```
   it would print `[2.0, 4.0, 6.0, 8.0, 10.0]`.

- `Arrays.toString()` is a particularly helpful method that returns the contents of the array in a string; you can see the full documentation for other static array methods here:  [Arrays](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Arrays.html)

- Write a method called `reverseArray` that takes an array of Strings as a parameter and
reverses the order of the array. It should NOT return a new array. Instead, it should mutate
(i.e. change) the array that was input.

   For example, if we ran the following code:
   ```
         String[] words = {"I", "love", "my", "CS", "classes", "!"};
         System.out.println("Before: " + Arrays.toString(words));
         reverseArray(words);
         System.out.println("After: " + Arrays.toString(words));
   ```
   it would print:
   ```
         Before: [I, love, my, CS, classes, !]
         After: [!, classes, CS, my, love, I]
   ```
### Flippy Game

- Now that we completed the warm-up tasks, we are ready to implement the Flippy Game!

- Start by filling in the two methods in `Card`. Add a `main` method to this class and test them to
make sure they work.

- Read through the two Flippy card classes. Make sure you understand what all of the methods in `FlippyCards` are supposed to do and that you understand how they're used in the
`FlippyCardGame` class.

- Implement methods in `FlippyCards`  incrementally. Write one method and then test it! To test it, again, add a `main` method and write a small test or two to make sure it
behaves like you'd expect. If you try and implement all of the methods and then test it by
simply running `FlippyCardGame`, 
1) it's very unlikely you'll get it perfect the first time and
then 
2) it's going to be very hard to figure out where the problem is.

- Once you have things working, play the game! And don't forget to add comments throughout your code.

## Submitting your work

*Commit* your changes and *Push* them back to Github (see the lab assignment if you can't remember how to do this). When you are done, submit your final code to Gradescope.

## Grading
Your Gradescope submission will be graded based on the following criteria:

| Criterion                                                                                        | Points |
| :----------------------------------------------------------------------------------------------- | :----- |
| `WarmUp`: `countHearts`                                                                              | 1      |
| `WarmUp`: `addArraysSameLength`                                                                      | 2      |
| `WarmUp`: `reverseArray`                                                                             | 2      |
| `Card`                                                                                             | 2      |
| `FlippyCards`: `flipCard`                                                                            | 1      |
| `FlippyCards`: `calculateOptimal`                                                                    | 2      |
| `FlippyCards`: `faceUp`/`downTotal`                                                                    | 2      |
| `FlippyCards`: `toString`                                                                   | 2      |
| Tested code within `main` methods in every class|        1 |
| [Style and formatting](https://github.com/pomonacs622025fa/code/blob/main/style_guide.md)                                                                   | 1      |
| Total | 16| 

Style and Formatting refers to the correct use of Java constructs including booleans, loop constructs, etc. Think of it as good writing style for programs.

For stlye points, we will also be checking your Github commit history to make sure that you are commiting as you go, e.g. as you finish each method, and not one giant commit at the end.

You must comment your code. We will be using the JavaDoc commenting style. To be compliant with JavaDoc, you must have the following:

-  Each comment on a method or class should start with `/**` and end with `**/`. 
   Every line in between should start with a `*` and be appropriately indented. 
   (Comments on variables and constants do NOT have to use this style unless they are public.)

-   A comment describing the class right before the class declaration 
   (i.e. after the `import` statements). This comment should include the `@author` tag 
   after the class description.

-   A comment for each method describing what the method does. 
   This comment should describe the what but not the how.
   `@param`, `@return` and `@throws` tags for each method (when appropriate).