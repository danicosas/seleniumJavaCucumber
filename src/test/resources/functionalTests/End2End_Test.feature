Feature: Feature01

    Scenario: Customer place an order by purchasing an item from search
        Given user is on Home Page
        When search for "xiaomi mi 9 se"
        And click at the first item
        And add to cart "2" units
        And go to the cart
        Then check "2" units and total price
