Feature: Payment process for adactin application
Scenario: Successfull payment process for adactin application with valid credential
When user enter firstname
And user enter lastname
And user enter Billing address
And user enter card number
And user enter card type
And user enter card Expiry Date
And user enter card CVV
Then user verify the payment Details