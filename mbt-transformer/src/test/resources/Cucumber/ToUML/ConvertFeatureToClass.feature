Feature: Convert Feature To Class

  Background: Create a feature file
    Given The mbt-transformer plugin, src/test/resources/Cucumber/Process.feature file is as follows
      """
      @tag1 @tag2 @tag3
      Feature: This is a test feature
        This is the description
        This is the second line of the description

      """
    When The mbt-transformer plugin, cucumber-to-uml goal is executed with
      | Tags |
      | tag1 |
    Then The mbt-transformer plugin, target/uml/pst.uml file will be present

  Scenario: Create a class
    And The target/uml/pst.uml file, Class section will be as follows
      | Class Name           | 
      | specs::Process | 
    And The target/uml/pst.uml file, Class Comments section will be as follows
      | Class Name           | Comment                                                             |
      | specs::Process | This is the description\nThis is the second line of the description |
