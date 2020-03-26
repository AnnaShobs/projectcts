$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/featurefolder/cumberdemocart.feature");
formatter.feature({
  "line": 2,
  "name": "OpenCart website",
  "description": "",
  "id": "opencart-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@cucumberdemocart_Feature"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "select an item in desktop",
  "description": "",
  "id": "opencart-website;select-an-item-in-desktop",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@TC01_selectingitem"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "the user launched the chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "the user opens the OPenCart homepage",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "the user select desktop",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "the user select on the item",
  "keyword": "And "
});
formatter.match({
  "location": "Selectingitem_Stepdefinition.the_user_launched_the_chrome_browser()"
});
formatter.result({
  "duration": 5448183999,
  "status": "passed"
});
formatter.match({
  "location": "Selectingitem_Stepdefinition.the_user_opens_the_OPenCart_homepage()"
});
formatter.result({
  "duration": 5820977500,
  "status": "passed"
});
formatter.match({
  "location": "Selectingitem_Stepdefinition.the_user_select_desktop()"
});
formatter.result({
  "duration": 2904448200,
  "status": "passed"
});
formatter.match({
  "location": "Selectingitem_Stepdefinition.the_user_select_on_the_item()"
});
formatter.result({
  "duration": 10791953499,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "select the number of items to be shown",
  "description": "",
  "id": "opencart-website;select-the-number-of-items-to-be-shown",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@TC02_shownumber"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "the user launched the chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "the user opens the OPenCart",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "the user select desktop icon",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "the user selects the number",
  "keyword": "And "
});
formatter.match({
  "location": "Shownumber_Stepdefinition.the_user_launched_the_chrome()"
});
formatter.result({
  "duration": 3799988100,
  "status": "passed"
});
formatter.match({
  "location": "Shownumber_Stepdefinition.the_user_opens_the_OPenCart()"
});
formatter.result({
  "duration": 4311919100,
  "status": "passed"
});
formatter.match({
  "location": "Shownumber_Stepdefinition.the_user_select_desktop_icon()"
});
formatter.result({
  "duration": 2897164700,
  "status": "passed"
});
formatter.match({
  "location": "Shownumber_Stepdefinition.the_user_selects_the_number()"
});
formatter.result({
  "duration": 7827580601,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "sorting the number of elements",
  "description": "",
  "id": "opencart-website;sorting-the-number-of-elements",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 18,
      "name": "@TC03_sorting"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "the user launched the chrome window",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "the user opens the OPenCart page",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "the user select desktop iccon",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "the user selects the type of sorting",
  "keyword": "And "
});
formatter.match({
  "location": "Sorting_StepDefinition.the_user_launched_the_chrome_window()"
});
formatter.result({
  "duration": 3768720500,
  "status": "passed"
});
formatter.match({
  "location": "Sorting_StepDefinition.the_user_opens_the_OPenCart_page()"
});
formatter.result({
  "duration": 5024777400,
  "status": "passed"
});
formatter.match({
  "location": "Sorting_StepDefinition.the_user_select_desktop_iccon()"
});
formatter.result({
  "duration": 2903508100,
  "status": "passed"
});
formatter.match({
  "location": "Sorting_StepDefinition.the_user_selects_the_type_of_sorting()"
});
formatter.result({
  "duration": 8004346200,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "storing the details to excell sheet",
  "description": "",
  "id": "opencart-website;storing-the-details-to-excell-sheet",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 25,
      "name": "@TC04_storetoexcellsheet"
    }
  ]
});
formatter.step({
  "line": 27,
  "name": "the user launched the chrome page",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "the user opens the OPenCart window",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "the user select desktop button",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "the user adds the details of items to excelsheet",
  "keyword": "And "
});
formatter.match({
  "location": "StoreToExcel_Stepdefinition.the_user_launched_the_chrome_page()"
});
formatter.result({
  "duration": 3797437900,
  "status": "passed"
});
formatter.match({
  "location": "StoreToExcel_Stepdefinition.the_user_opens_the_OPenCart_window()"
});
formatter.result({
  "duration": 9091916400,
  "status": "passed"
});
formatter.match({
  "location": "StoreToExcel_Stepdefinition.the_user_select_desktop_button()"
});
formatter.result({
  "duration": 15230779600,
  "status": "passed"
});
formatter.match({
  "location": "StoreToExcel_Stepdefinition.the_user_adds_the_details_of_items_to_excelsheet()"
});
formatter.result({
  "duration": 6272460899,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "adding to wishlist",
  "description": "",
  "id": "opencart-website;adding-to-wishlist",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 32,
      "name": "@TC05_storetowishlist"
    }
  ]
});
formatter.step({
  "line": 34,
  "name": "the user launched the chrome session",
  "keyword": "Given "
});
formatter.step({
  "line": 35,
  "name": "the user opens the OPenCart windowpage",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "the user select desktop buttonclick",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "the item to wishlist",
  "keyword": "And "
});
formatter.match({
  "location": "Wishlist_Stepdefinition.the_user_launched_the_chrome_session()"
});
formatter.result({
  "duration": 3797332600,
  "status": "passed"
});
formatter.match({
  "location": "Wishlist_Stepdefinition.the_user_opens_the_OPenCart_windowpage()"
});
formatter.result({
  "duration": 5027654700,
  "status": "passed"
});
formatter.match({
  "location": "Wishlist_Stepdefinition.the_user_select_desktop_buttonclick()"
});
formatter.result({
  "duration": 3773671099,
  "status": "passed"
});
formatter.match({
  "location": "Wishlist_Stepdefinition.the_item_to_wishlist()"
});
formatter.result({
  "duration": 12716141200,
  "status": "passed"
});
});