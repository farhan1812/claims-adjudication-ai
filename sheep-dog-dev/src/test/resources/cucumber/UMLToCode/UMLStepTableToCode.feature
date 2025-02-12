@debug
Feature: UML Step Table To Code

  Scenario: One row, one cell

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is created as follows
          """
          Feature: Process
          
            Scenario: Submit
              Given The Object page is created as follows
                    | h1 |
                    | v1 |
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-cucumber goal is executed
     Then The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file will be present
      And The mbt-transformer plugin, Process.feature file Scenario Steps Data Table section will be created as follows
          | Name   | Step                                        | Row      |
          | Submit | Given The Object page is created as follows | \| h1 \| |
          | Submit | Given The Object page is created as follows | \| v1 \| |

  Scenario: Two rows, two cells

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is created as follows
          """
          Feature: Process
          
            Scenario: Submit
          
              Given The Object page is created as follows
                    | h1 | h2 |
                    | v1 | v2 |
                    | v3 | v4 |
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-cucumber goal is executed
     Then The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file will be present
      And The mbt-transformer plugin, Process.feature file Scenario Steps Data Table section will be created as follows
          | Name   | Step                                        | Row            |
          | Submit | Given The Object page is created as follows | \| h1 \| h2 \| |
          | Submit | Given The Object page is created as follows | \| v1 \| v2 \| |
          | Submit | Given The Object page is created as follows | \| v3 \| v4 \| |

  Scenario: Three rows, three cells

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is created as follows
          """
          Feature: Process
          
            Scenario: Submit
          
              Given The Object page is created as follows
                    | h1 | h2 | h3 |
                    | v1 | v2 | v3 |
                    | v4 | v5 | v6 |
                    | v7 | v8 | v9 |
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-cucumber goal is executed
     Then The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file will be present
      And The mbt-transformer plugin, Process.feature file Scenario Steps Data Table section will be created as follows
          | Name   | Step                                        | Row                  |
          | Submit | Given The Object page is created as follows | \| h1 \| h2 \| h3 \| |
          | Submit | Given The Object page is created as follows | \| v1 \| v2 \| v3 \| |
          | Submit | Given The Object page is created as follows | \| v4 \| v5 \| v6 \| |
          | Submit | Given The Object page is created as follows | \| v7 \| v8 \| v9 \| |

  Scenario: Layer 2

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is created as follows
          """
          Feature: Process
          
            Scenario: Submit
          
              Given The blah application, Object page Top section will be created as follows
                    | h1 | h2 |
                    | v1 | v2 |
                    | v3 | v4 |
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-cucumber goal is executed
     Then The mbt-transformer plugin, src/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file will be present
      And The mbt-transformer plugin, BlahObjectPageSteps.java file Object section will be created as follows
          | Import                          |
          | io.cucumber.datatable.DataTable |
      And The mbt-transformer plugin, BlahObjectPageSteps.java file Fields section will be created as follows
          | Method Name                                                  | Parameter Name | Parameter Type |
          | theBlahApplicationObjectPageTopSectionWillBeCreatedAsFollows | dataTable      | DataTable      |
      And The mbt-transformer plugin, BlahObjectPageSteps.java file Fields section will be created as follows
          | Method Name                                                  | Statement                                                                  |
          | theBlahApplicationObjectPageTopSectionWillBeCreatedAsFollows | BlahFactory.get("ObjectPage").setComponent("blah");                        |
          | theBlahApplicationObjectPageTopSectionWillBeCreatedAsFollows | BlahFactory.get("ObjectPage").setPath("Object");                           |
          | theBlahApplicationObjectPageTopSectionWillBeCreatedAsFollows | BlahFactory.get("ObjectPage").assertInputOutputs(dataTable, "TopSection"); |

  Scenario: Layer 3

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is created as follows
          """
          Feature: Process
          
            Scenario: Submit
          
              Given The blah application, Object page Top section will be created as follows
                    | h1 | h2 |
                    | v1 | v2 |
                    | v3 | v4 |
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-cucumber goal is executed
     Then The mbt-transformer plugin, src/test/java/org/farhan/objects/blah/ObjectPage.java file will be present
      And The mbt-transformer plugin, ObjectPage.java file Object section will be created as follows
          | Interface Name | Package                 |
          | ObjectPage     | org.farhan.objects.blah |
      And The mbt-transformer plugin, ObjectPage.java file Object section will be created as follows
          | Import            |
          | java.util.HashMap |
      And The mbt-transformer plugin, ObjectPage.java file Fields section will be created as follows
          | Method Name        | Visibility | Return Type |
          | assertTopSectionH1 | public     | void        |
          | assertTopSectionH2 | public     | void        |
      And The mbt-transformer plugin, ObjectPage.java file Fields section will be created as follows
          | Method Name        | Parameter Name | Parameter Type         |
          | assertTopSectionH1 | keyMap         | HashMap<String,String> |
          | assertTopSectionH2 | keyMap         | HashMap<String,String> |

  Scenario: Escaped cell data

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is created as follows
          """
          Feature: Process
          
            Scenario: Submit
              Given The Object page is created as follows
                    | h1       |
                    | \| v1 \| |
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-cucumber goal is executed
     Then The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file will be present
      And The mbt-transformer plugin, Process.feature file Scenario Steps Data Table section will be created as follows
          | Name   | Step                                        | Row                |
          | Submit | Given The Object page is created as follows | \| h1 \|           |
          | Submit | Given The Object page is created as follows | \| \\\| v1 \\\| \| |

