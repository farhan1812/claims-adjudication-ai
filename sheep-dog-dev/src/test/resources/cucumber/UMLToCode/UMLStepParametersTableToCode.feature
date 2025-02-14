@debug
Feature: UML Step Parameters Table To Code

  Scenario: Three cells

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file is created as follows
          """
          = Feature: Process
          
          == Scenario: Submit
          
          === Given: The blah application, Object page Top section will be created as follows
          
          |===
          | h1
          | v1
          |===
          """
      And The mbt-transformer plugin, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file is created as follows
          """
          = Object: Object page
          
          == Definition: Top section will be created as follows
          
          === Parameters: 1
          
          |===
          | h1
          |===
          
          === Parameters: 2
          
          |===
          | h1 | h2
          |===
          
          === Parameters: 3
          
          |===
          | h1 | h2 | h3
          |===
          """
      And The mbt-transformer plugin, asciidoctor-to-uml goal is executed
     When The mbt-transformer plugin, uml-to-cucumber goal is executed
     Then The mbt-transformer plugin, src/test/java/org/farhan/objects/blah/ObjectPage.java file will be present
      And The mbt-transformer plugin, ObjectPage.java file Fields section will be created as follows
          | Method Name        | Visibility | Return Type | Parameter Name | Parameter Type         |
          | assertTopSectionH1 | public     | void        | keyMap         | HashMap<String,String> |
          | assertTopSectionH2 | public     | void        | keyMap         | HashMap<String,String> |
          | assertTopSectionH3 | public     | void        | keyMap         | HashMap<String,String> |

