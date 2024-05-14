Feature: Testing all job shearch senarios
  As a jobseeker on NHS jobs website,
  I should be able to search fro jobs with my prefernces

  Background: 
    Given user is on NSH job search page

  Scenario Outline: A jobseeker should be able to search for jobs with Preferences
    Given I typein the job title <jobTitle>
    And I typein the location <location>
    And I select the distance <distance>
    When I click on moreOptions
    And I select the payRange <payRange>
    When I click on Search button
    And I sort by newest date posted
    Then I should see the search result count displayed

    Examples: 
      | jobTitle | location | distance  | payRange           |
      | Nurse    | London   | +10 Miles | £20,000 to £30,000 |
      | Test     | Bristol  | +20 Miles | £50,000 to £60,000 |
