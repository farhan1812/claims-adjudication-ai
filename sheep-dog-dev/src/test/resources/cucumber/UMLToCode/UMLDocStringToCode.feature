@debug
Feature: UML Doc String To Code

  Scenario: One line

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file is created as follows
          """
          = Feature: Process
          
          == Scenario: Submit
          
          === Given: The Object page is created as follows
          
          ----
          text1
          ----
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-cucumber goal is executed
     Then The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file will be present
      And The mbt-transformer plugin, Process.feature file Scenario Steps Doc String section will be created as follows
          | Name   | Step                                        | Content |
          | Submit | Given The Object page is created as follows | text1   |

