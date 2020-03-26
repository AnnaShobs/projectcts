@cucumberdemocart_Feature
Feature: OpenCart website
@TC01_selectingitem
Scenario: select an item in desktop
Given the user launched the chrome browser
When the user opens the OPenCart homepage
Then the user select desktop
And the user select on the item 
@TC02_shownumber
Scenario: select the number of items to be shown
Given the user launched the chrome 
When the user opens the OPenCart 
Then the user select desktop icon
And the user selects the number
@TC03_sorting
Scenario: sorting the number of elements
Given the user launched the chrome window
When the user opens the OPenCart page
Then the user select desktop iccon
And the user selects the type of sorting
@TC04_storetoexcellsheet
Scenario: storing the details to excell sheet
Given the user launched the chrome page
When the user opens the OPenCart window
Then the user select desktop button
And the user adds the details of items to excelsheet
@TC05_storetowishlist
Scenario: adding to wishlist
Given the user launched the chrome session
When the user opens the OPenCart windowpage
Then the user select desktop buttonclick
And the item to wishlist