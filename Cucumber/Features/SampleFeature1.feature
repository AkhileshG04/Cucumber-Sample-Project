#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@GoogleRun
Feature: Title of your feature
  I want to use this template for my feature file

  @GoogleRun
  Scenario Outline: Search with Google
  	Given Get Data from Json
    Given I want to get Data from json "<jsonFile>"
    When I want to search google with the data present in file

    Examples: 
      | jsonFile |
      | testData |
