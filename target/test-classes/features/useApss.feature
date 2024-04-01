Feature: Financial records

  @Financial_records
  Scenario: Financial records, to record daily finances
    Given : user launch apps and on Transaction dashboard
#    Add day one, 1 April
    When user tap add button
    And user on Page Create Transaction
    And user tap income
    And user tap date income
    And user select date one
    And user tap OK
    And user tap Category income
    And user tap Category One
    And user tap Amount and input Ammount "400000"
    And user input Note "Freelance"
    And tap save button
    When user tap add button
    And user on Page Create Transaction
    And user tap Expense
    And user tap date expence
    And user select date one
    And user tap OK
    And user tap Category expence
    And user tap Category two
    And user tap Amount and input Ammount "200000"
    And user input Note "Broke"
    And tap save button
#    Add day two, 2 April
    When user tap add button
    And user on Page Create Transaction
    And user tap Expense
    And user tap date expence
    And user select date three
    And user tap OK
    And user tap Category expence
    And user tap Category two
    And user tap Amount and input Ammount "300000"
    And user input Note "Daily Expense"
    And tap save button
    #    Add day Three, 3 April
    When user tap add button
    And user on Page Create Transaction
    And user tap income
    And user tap date income
    And user select date fourth
    And user tap OK
    And user tap Category income
    And user tap Category fourth
    And user tap Amount and input Ammount "700000"
    And user input Note "Play And Win"
    And tap save button
    When user tap add button
    And user on Page Create Transaction
    And user tap Expense
    And user tap date expence
    And user select date five
    And user tap OK
    And user tap Category expence
    And user tap Category five
    And user tap Amount and input Ammount "500000"
    And user input Note "Daily Expense"
    And tap save button
#    for analys, view for 3 days activity
    And user tap other on top corner
    And user select Chart
    And user on page chart
    And user select view option
    And user select Overview
    Then user get inform summary of income and expence
    #    Add day four, 4 April
    When from chart back to homepage
    And user tap add button
    And user on Page Create Transaction
    And user tap Expense
    And user tap date expence
    And user select date six
    And user tap OK
    And user tap Category expence
    And user tap Category five
    And user tap Amount and input Ammount "300000"
    And user input Note "Daily Expense"
    And tap save button
    #    delete day two, 2 April
    When user tap day two result
    And user tap transaction selected
    And user on Page Create Transaction
    And user can delete transaction
    And user select YES
    And user back to home
    And : user launch apps and on Transaction dashboard

    #    for analys, view analysis after delete day 2
    And user tap other on top corner
    And user select Chart
    And user on page chart
    And user select view option
    And user select Overview
    And user get inform summary of income and expence
    And from chart back to homepage
    Then : user launch apps and on Transaction dashboard







