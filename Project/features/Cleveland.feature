Feature: Schedule an appointment on Cleveland Clinic website
<<<<<<< HEAD

Background:
    Given the User has launched the browser and navigated to "https://my.clevelandclinic.org/" maximized the browser window

@appointment
Scenario Outline: User schedules an appointment
=======
 
Background:
    Given the User has launched the browser and navigated to "https://my.clevelandclinic.org/" maximized the browser window
 
@appointment
Scenario Outline: TestCase 03 - Schedule Appointment
>>>>>>> 941cef31d563fddeec24c18082170405827c723d
    When the User Clicks on the Schedule now button under the Appointments section
    And the User Clicks on the Request an Appointment button
    And the User Clicks on the Get Started button
    And the User Clicks on the Me option
    And the User Clicks on the Not sure option
    When the User enters the personal information "<First Name>" "<Last Name>""<Gender>""<Status>""<Date of Birth>"
    And the User Clicks on the Next button
    When the User enters the contact information "<Address>""<City>""<State>""<Zip Code>" "<Email>" "<Phone number>"
    When the User enters the appointment reason "<Reason>"
    And the User Clicks on the Next button
<<<<<<< HEAD

Examples:
    | First Name | Last Name | Gender | Status | Date of Birth | Address         | City | State | Zip Code | Email            | Phone number  | Reason |
    | Rajesh     | Kumar     | Male | Single | 09/07/1997    | 22 Merry Street | COIMBATORE | OH | 43210    | mjd000@gmail.com | 614.466.2000  | Fever  |

@doctor
Scenario: User searches for a doctor and applies filters
    When the user clicks on the Find a Doctor under Our Doctors Section
    When the user searches for "Heart"
    And the user applies location, department, and language filters "English"
    Then the filtered search results should be displayed
=======
 
Examples:
    | First Name | Last Name | Gender | Status | Date of Birth | Address         | City | State | Zip Code | Email            | Phone number  | Reason |
    | Rajesh     | Kumar     | Male | Single | 09/07/1997    | 22 Merry Street | COIMBATORE | OH | 43210    | mjd000@gmail.com | 614.466.2000  | Fever  |
 
@doctor
Scenario: TestCase 05 - Find a Doctor
    When the user clicks on the Find a Doctor under Our Doctors Section
    When the user searches for "Heart"
    And the user applies location, department, and language filters "English"
    Then the filtered search results should be displayed
>>>>>>> 941cef31d563fddeec24c18082170405827c723d
