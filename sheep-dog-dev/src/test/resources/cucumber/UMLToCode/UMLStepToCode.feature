@debug
Feature: UML Step To Code

  Background: Create a feature file

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is created as follows
          """
          Feature: Process
          
            Scenario: Submit
          
              Given The blah application, Object page is empty
          """

  Scenario: Convert step keywords

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is created as follows
          """
          Feature: Process
          
            Scenario: Submit
          
              Given The something/Object page is empty
               When The something/Object page is empty
               Then The something/Object page is empty
                And The something/Object page is empty
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-cucumber goal is executed
     Then The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file will be present
      And The mbt-transformer plugin, Process.feature file Scenarios Steps section will be created as follows
          | Name   | Step                                     |
          | Submit | Given The something/Object page is empty |
          | Submit | When The something/Object page is empty  |
          | Submit | Then The something/Object page is empty  |
          | Submit | And The something/Object page is empty   |

  Scenario: Create new java methods for layer 2

     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-cucumber goal is executed
     Then The mbt-transformer plugin, src/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file will be present
      And The mbt-transformer plugin, BlahObjectPageSteps.java file Object section will be created as follows
          | Class Name          | Package                  |
          | BlahObjectPageSteps | org.farhan.stepdefs.blah |
      And The mbt-transformer plugin, BlahObjectPageSteps.java file Object section will be created as follows
          | Import                    |
          | io.cucumber.java.en.Given |
      And The mbt-transformer plugin, BlahObjectPageSteps.java file Fields section will be created as follows
          | Method Name                         | Annotation                                             | Visibility | Return Type |
          | theBlahApplicationObjectPageIsEmpty | @Given("^The blah application, Object page is empty$") | public     | void        |

  Scenario: Create new java methods for layer 2 without DI

     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-cucumber goal is executed
     Then The mbt-transformer plugin, src/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file will be present
      And The mbt-transformer plugin, BlahObjectPageSteps.java file Object section will be created as follows
          | Import                        |
          | org.farhan.common.BlahFactory |
      And The mbt-transformer plugin, BlahObjectPageSteps.java file Fields section will be created as follows
          | Method Name                         | Statement                                               |
          | theBlahApplicationObjectPageIsEmpty | BlahFactory.get("ObjectPage").setComponent("blah");     |
          | theBlahApplicationObjectPageIsEmpty | BlahFactory.get("ObjectPage").setPath("Object");        |
          | theBlahApplicationObjectPageIsEmpty | BlahFactory.get("ObjectPage").setInputOutputs("Empty"); |

  Scenario: Create new java methods for layer 2 with DI

     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-cucumber-spring goal is executed
     Then The mbt-transformer plugin, src/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file will be present
      And The mbt-transformer plugin, BlahObjectPageSteps.java file Object section will be created as follows
          | Extends   |
          | TestSteps |
      And The mbt-transformer plugin, BlahObjectPageSteps.java file Object section will be created as follows
          | Import                             |
          | org.farhan.common.TestSteps        |
          | org.farhan.objects.blah.ObjectPage |
      And The mbt-transformer plugin, BlahObjectPageSteps.java file Object section will be created as follows
          | Constructor Name    | Statement      |
          | BlahObjectPageSteps | super(object); |
      And The mbt-transformer plugin, BlahObjectPageSteps.java file Fields section will be created as follows
          | Method Name                         | Statement                        |
          | theBlahApplicationObjectPageIsEmpty | object.setComponent("blah");     |
          | theBlahApplicationObjectPageIsEmpty | object.setPath("Object");        |
          | theBlahApplicationObjectPageIsEmpty | object.setInputOutputs("Empty"); |

  Scenario: Create new java methods for layer 2 with DI annotation

     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-cucumber-guice goal is executed
     Then The mbt-transformer plugin, src/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file will be present
      And The mbt-transformer plugin, BlahObjectPageSteps.java file Object section will be created as follows
          | Import                           |
          | com.google.inject.Inject         |
          | io.cucumber.guice.ScenarioScoped |
      And The mbt-transformer plugin, BlahObjectPageSteps.java file Object section will be created as follows
          | Class Annotation |
          | ScenarioScoped   |
      And The mbt-transformer plugin, BlahObjectPageSteps.java file Object section will be created as follows
          | Constructor Name    | Constructor Annotation |
          | BlahObjectPageSteps | Inject                 |

  Scenario: Create new java methods for layer 3

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
          | Method Name | Visibility | Return Type |
          | setEmpty    | public     | void        |
      And The mbt-transformer plugin, ObjectPage.java file Fields section will be created as follows
          | Method Name | Parameter Name | Parameter Type         |
          | setEmpty    | keyMap         | HashMap<String,String> |

  Scenario: Preserve existing java methods for layer 2

      And The mbt-transformer plugin, src/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file is created as follows
          """
          package org.farhan.stepdefs.blah;
          
          import io.cucumber.java.en.Given;
          import io.cucumber.datatable.DataTable;
          import org.farhan.common.BlahFactory;
          
          public class BlahObjectPageSteps {
          
              @Given("^The blah application, Object page is invalid$")
              public void theBlahApplicationObjectPageIsInvalid() {
                  BlahFactory.get("ObjectPage").setComponent("blah");
                  BlahFactory.get("ObjectPage").setPath("Object");
                  BlahFactory.get("ObjectPage").setInputOutputs("Invalid");
              }
          }
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-cucumber goal is executed
     Then The mbt-transformer plugin, src/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file will be present
      And The mbt-transformer plugin, BlahObjectPageSteps.java file Fields section will be created as follows
          | Method Name                           |
          | theBlahApplicationObjectPageIsInvalid |
          | theBlahApplicationObjectPageIsEmpty   |

  Scenario: Preserve existing java methods for layer 3

      And The mbt-transformer plugin, src/test/java/org/farhan/objects/blah/ObjectPage.java file is created as follows
          """
          package org.farhan.objects.blah;
          
          import java.util.HashMap;
          
          public interface ObjectPage {
          
              public void assertIsInvalid();
          }
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-cucumber goal is executed
     Then The mbt-transformer plugin, src/test/java/org/farhan/objects/blah/ObjectPage.java file will be present
      And The mbt-transformer plugin, ObjectPage.java file Fields section will be created as follows
          | Method Name     |
          | assertIsInvalid |
          | setEmpty        |

