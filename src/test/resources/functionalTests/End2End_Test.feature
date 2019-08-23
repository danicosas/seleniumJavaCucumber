Feature: Feature01

    Scenario Outline: Customer place an order by purchasing an item from search
        Given user is on Home Page
        When search for "<product>"
        And click at the first item
        And add to cart "<quantity>" units
        And go to the cart
        Then check "<quantity>" units and total price

        Examples:
            | product | quantity |
            | xiaomi mi 9 se | 2 |
            | honor 10 64 | 4 |