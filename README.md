# JavaCool303-Library
JavaCool303 Library Project from McGill Software Design Course.
________________________________________________________________________
Intructions: How to Run
-----------------------
Run Cool303Main and select one of the available options in pop-up window:
- Pastel
- Summer
- Vanilla (no Theme)
- All (displays all currently available themes (hardcoded) )
- Cancel (exit application)

How to use import:
------------------ 
- Create a class with a main method in the same workplace as JavaCool303 folder
- import JavaCool303.*
- Create a Cool303Frame and run frame.display() (as shown in Cool303Main)

HandCoded: 
----------
- # roots with a specific theme: 1
- # containers per root: 1
- # components per container: 20
- # title for each container in addBoxes (as user input)

HardCoded:
----------
- title for each container is the same in specific root
- size of root, containers, components
- resize of root depending on number of containers:
 	-> root will take the height and width of # containers available
	-> it is not optimal but it works for test case with 1 container
- each container in root will have the same number of buttons

Design Techniques:
------------------
Abstraction: Theme Class is abstract containing methods that will get Color 
	     objects (implemented in the child classes)

Hierarchy: 1) Theme has 2 children (themes): Pastel and Summer.
              They both extend Theme and instantiate the getters that get the uniqueColor 
              object attributes (also instatiated in the class)
           
           2) - Cool303Components has 2 children: Cool303ComponentsSummer and Cool303ComponentsPastel
                A themed color is applied to the buttons.
                A shape is also applied automatically depending on the theme with the overriden 
                paintComponent() and paintBorder() methods 

Polymorphism: Theme has 2 children allowing to use the subtypes of Theme.
              
Encapsulation: - Methods paintComponent() and paintBorder() in Cool303Components children are 'protected'
                 which restricts their access to the package.
                 
               - All Color object attributes in Themes Summer and Pastel are private and can only be 
                 accessed through getters available
                 
               - All methods other than in Theme and Cool303Components (children) are public as there are
                 no attributes stored. Everything is assembled at runtime.

Overloading: - Cool303Root has addBoxes() and an overloded addBoxes() that accepts a theme.
               These methods are nearly identical but also add a themed color to the root 
                
             - Cool303Containers has addButtons() and an overloaded addButtons() that accepts a theme.
                Similar idea as root, where a themed color is applied to the container



Design Patterns:
----------------
Composite Pattern: - Between Cool303Root and Cool303Containers
                     In each case the both extend JPanel and one Root can have many Containers instantiated inside.
                     Root calls the addButtons() method for each instantiated Container to add Components to it. 

Decorator Pattern: - The overriden paintComponent(), paintBorder(), contains methods allow to change the shape of the buttons
                     depending on the theme: Rectanges (No Theme), Bubbles (Pastel), Stars(Summer).
                     Further, the default color for all roots, containers and components can be updated with the themes.
                    
                   - The overriden addBoxes() and addButtons() for Cool303Root and Cool303Containers (both extending JPanel)
                     allow to input a theme that will modify the color of containers and buttons respectively.


Strategy Pattern: In Cool303Frame, pass Theme object as input when creating a root to apply a specific theme to all 
                  containers and components it holds.


How to add a new Theme:
-----------------------
*If not very obvious, sorry for the inconvenience

1) Create a new theme-class that extends Theme

2) Add attributes/methods/choose colors in the same way as was done for Summer and Pastel

3) Create Cool303ComponentsNewTheme class where you overload paintComponent(), paintBorder() 
   and contains() to create  a unique shape

5) Modify a few lines in addButtons(int, int, Theme) in Cool303Container, add a new condition:
   -> else if (theme.getClass().getSimpleName().equals("newThemeName")) button = new Cool303ComponentsNewTheme();
   
6) In Frame
   - In String[] options, add your new theme
   - Add a new if-statement below if (response == num) 
     where num is the index of your theme in String options[]
   - Hand code a new panel to add to mainFrame (same as previous cases)
   - In addBoxes() add your 'Theme newTheme' as input (follow the example)




