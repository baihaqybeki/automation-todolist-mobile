Feature: To Do List

  Scenario: Create New Task
    Given Open apps
    And click new task button
    Then navigated to "New Task" page
    And fill task field with <task>
    And choose repeat option with <repeat> & choose list with <list> 
    And click save button

    Examples: 
      | task  			| repeat		|	list				|
      | "Task Name" | "Other"		|	"Personal"	|
