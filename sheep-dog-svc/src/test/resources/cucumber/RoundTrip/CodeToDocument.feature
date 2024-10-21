@debug
Feature: Code To Document

  TODO make test for the specific mappings

  Scenario: Create an adoc file from feature file

    Given The mbt-transformer plugin, src/test/resources/cucumber/app/Process.feature file is created as follows
          """
          @tag1
          Feature: Process
          
            Desc 1
          
            @tag2
            Scenario: Story One
          
              Desc 2
          
              Given The Search application, Login page is valid
               When The Search application, Home page is created as follows
                    | grp | ins |
                    |  10 |   5 |
               Then The Search application, Logout page is valid
          
            @tag3
            Scenario Outline: Story Two
          
              Desc 3
          
              Given The Search application, Login page is invalid
               When The Search application, Home page is created as follows
                    | grp |   ins |
                    |   8 | <ins> |
               Then The Search application, Logout page is invalid
          
              Examples: Some data
          
                    | ins |
                    |   4 |
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed with
          | Tags |
          | tag1 |
      And The mbt-transformer plugin, uml-to-asciidoctor goal is executed
     Then The mbt-transformer plugin, src/test/resources/asciidoc/app/Process.adoc file will be created as follows
          """
          :tags: tag1
          = Process
          
          Desc 1
          
          [tags="tag2"]
          == Story One
          
          Desc 2
          
          === Given The Search application, Login page is valid
          
          === When The Search application, Home page is created as follows
          
          [options="header"]
          |===
          | grp| ins
          | 10| 5
          |===
          
          === Then The Search application, Logout page is valid
          
          [tags="tag3"]
          == Story Two
          
          Desc 3
          
          === Given The Search application, Login page is invalid
          
          === When The Search application, Home page is created as follows
          
          [options="header"]
          |===
          | grp| ins
          | 8| {ins}
          |===
          
          === Then The Search application, Logout page is invalid
          
          [examples="true"]
          === Some data
          
          [options="header"]
          |===
          | ins
          | 4
          |===
          """

