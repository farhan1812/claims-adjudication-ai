@debug
Feature: Document Step Parameters Table To UML

  Scenario: One cell

    Given The mbt-transformer plugin, src/test/resources/asciidoc/stepdefs/web application/Object1 page.asciidoc file is created as follows
          """
          = Object: Object1 page
          
          == Definition: is created as follows
          
          Desc line 1
          
          === Parameters: 1
          
          |===
          | h1
          |===
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
     Then The mbt-transformer plugin, uml/pst.uml file will be present
      And The uml/pst.uml file Interaction Annotations section will be created as follows
          | Interaction Name                                               | Annotation Name | Annotation Detail |
          | stepdefs::web application::Object1 page::is created as follows | 1               | 0 -> h1\|         |

  Scenario: Two cells

    Given The mbt-transformer plugin, src/test/resources/asciidoc/stepdefs/web application/Object1 page.asciidoc file is created as follows
          """
          = Object: Object1 page
          
          == Definition: is created as follows
          
          Desc line 1
          
          === Parameters: 1
          
          |===
          | h1 | h2
          |===
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
     Then The mbt-transformer plugin, uml/pst.uml file will be present
      And The uml/pst.uml file Interaction Annotations section will be created as follows
          | Interaction Name                                               | Annotation Name | Annotation Detail |
          | stepdefs::web application::Object1 page::is created as follows | 1               | 0 -> h1\|h2\|     |

  Scenario: Three cells

    Given The mbt-transformer plugin, src/test/resources/asciidoc/stepdefs/web application/Object1 page.asciidoc file is created as follows
          """
          = Object: Object1 page
          
          == Definition: is created as follows
          
          Desc line 1
          
          === Parameters: 1
          
          |===
          | h1 | h2 | h3
          |===
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
     Then The mbt-transformer plugin, uml/pst.uml file will be present
      And The uml/pst.uml file Interaction Annotations section will be created as follows
          | Interaction Name                                               | Annotation Name | Annotation Detail |
          | stepdefs::web application::Object1 page::is created as follows | 1               | 0 -> h1\|h2\|h3\| |

