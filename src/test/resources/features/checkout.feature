@CheckoutScenario
Feature: Checkout Item Voila Website

  Background: Verify User in the Voila HomePage
    Given User already in the Voila website

    @Positive-TC-1-EndToEndCheckout
    Scenario: Multiple Checkout Validation
      And User click sign in from homepage
      When User input "mrzkyprtm69@gmail.com" as email "TestVoila@Rizki123" as password
      Then User click sign in
      And User already on homepage profile as "Muhammad" displayed
      When User navigate to men page
      Then User navigate to men all item category
      When User click sort item by highest price
      And User set filter ready stock item
      And User set filter shoes item
      Then User select filtered first item shoes
      And Verify first item price
      And User select size
      Then User add first item to shopping bag
      When User navigate to brands page
      And User search "balenciaga" brands
      Then User navigate to balenciaga brands item
      When User click sort item by lowest price
      Then User select second item wallet
      And Verify second item price
      Then User add second item to shopping bag
      When User navigate to shopping bag page
      And Verify user already on shopping bag page
      And Verify first item brand as "Christian Dior" and second item brand as "Balenciaga"
      And Verify multiple item sub total price
      Then User click checkout from shopping bag
      And User already on checkout page
      When User click select address
      And User click add address
      When User fill address details
      Then User save new address details
      And User select delivery address
      When User click select shipping service
      And User select shipping service
      Then User confirm shipping service
      When User select BCA VA payment method
      Then User confirm payment method
      And Verify sub total item price
      And Verify total item price with protection fee
      Then User click place order










