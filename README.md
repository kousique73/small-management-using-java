# Waldorf Astoria Hotel Management System

A Desktop-based Hotel Management application developed in Java. The application provides an interactive Graphical User Interface (GUI) built with Java Swing and AWT. It facilitates guest operations such as room browsing, booking, and visual tours, alongside administrative operations like employee tracking, customer records management, and detailed billing generation.

## Technical Stack

* **Programming Language**: Java (JDK 8 or higher)
* **GUI Framework**: Java Swing & AWT (Abstract Window Toolkit)
* **Data Storage**: Text-file-based flat database system (using java.io Reader/Writer classes)
* **Libraries and Dependencies**:
  * `jcalendar-1.4.jar` / `jdatepicker-1.3.4.jar` / `gwt-datepicker-r29.jar` (Date and calendar pickers)
  * `jgoodies-common-1.2.0.jar` / `jgoodies-looks-2.4.1.jar` (UI design looks and components)
  * `junit-4.6.jar` (Unit testing framework)

---

## Key Features

### 1. Welcome and Tours
* **Main Entrance Page**: Serves as the landing hub allowing redirection to Admin Login, Customer Login, Feature Tours, or a Visual Gallery.
* **Tour System**: Interactive slides showcasing the hotel's amenities, categorized into:
  * **Rooms**: View details of Economy and Executive suites.
  * **Dining**: Explore options like the Juice Bar and Cafe Savoury.
  * **Services & Activities**: Galleries for the Swimming Pool, Spa, Gym, Jacuzzi, Billiards room, and Poolside BBQ.
  * **About Us**: Information regarding the hotel's background and branding.

### 2. User Authentication and Roles
* **Admin Role**:
  * Signup records are appended to `info.txt`.
  * Allows credentials ending with `@northsouth.edu` for educational/NSU affiliation classification.
  * Credentials allow access to the Admin Dashboard.
* **Customer Role**:
  * Signup records are appended to `UserInfo.txt`.
  * Authenticated customers gain access to the User Dashboard for bookings.

### 3. Admin Management Panel
* **Employee Management**:
  * **Add Employee**: Registers employee details (Name, ID, Age, Nationality, Designation) to `Employee3.txt`.
  * **Show Employees**: Renders employee lists in a searchable and resettable `JTable`.
  * **Delete Employee**: Deletes an employee by rewriting matching data via a temp file (`Employee4.txt`).
* **Customer Management**:
  * **Add Customer**: Registers customer details (Name, NID, Age, Phone Number, Nationality) to `Customer3.txt`.
  * **Show Customers**: Displays registered customers in a searchable and resettable `JTable`.
  * **Delete Customer**: Removes customer records matching a specific NID.

### 4. Billing and Invoicing
* **Receipt Calculator**: Generates dynamic invoices for hotel guests based on selected services:
  * Room Cost ($800 per unit)
  * Extra Meals ($200 per unit)
  * Transport ($200 per unit)
  * Accommodation Services ($350 per unit)
  * Special Services ($380 per unit)
* **Invoice Generation**: Automatically calculates subtotal, 1% VAT, and final total, rendering a clean text receipt in the GUI.
* **Print Support**: Integrates directly with the system's native printer using Java's Printer API.

### 5. Room Booking (User Dashboard)
* **Direct Room Booking**: Accessible by registered customers to input personal details and secure room reservations. Data is saved in the customer ledger (`Customer3.txt`).

---

## File and Project Structure

### Source Files (`src/MainPackage/`)

* **Start.java**: The main class containing the application entry point (`main` method), initializing all the major JFrames.
* **WelcomePage.java** & **WelcomePage2.java**: GUI structures for the home page and initial navigational tours.
* **LoginFrame.java** & **UserLogin.java**: Authentication screens for Admin and Customer roles.
* **Signuppage.java** & **UserSignup.java**: Registration screens for Admin and Customer roles.
* **NavigationWindow.java**: Directory hub directing clients to different virtual tours of the hotel.
* **Addashboard.java** & **UserDashboard.java**: Dashboard screens for Admin and Customer actions.
* **EM.java** & **CM.java**: Sub-menus under Admin dashboard for managing Employee and Customer databases.
* **Employee.java** & **Customer.java**: Data models representing employees and guests.
* **employeeop.java** / **Insertcus.java** / **Insertcus2.java**: Forms used to insert employee/customer details into records.
* **ShowEmployee.java** & **Showcus.java**: Tables displaying list view, search, and reset features.
* **DeleteEmployee.java** & **DeleteCus.java**: Forms containing logic to delete specific employee or customer files.
* **Billing.java**: The invoice management and generation interface.
* **Aboutus.java** / **OurPreview.java**: Secondary display screens showing informational text and graphical assets.
* **ICustomerOperations.java** & **IEmployeeOperations.java**: Interface definitions detailing abstract CRUD signatures.
* **Amenity/Service Tours**: `gym.java`, `swimming_pool.jpg` references, `cafesavoury.java`, `Juicebar.java`, `PoolsideBBQ.java`, `PoolBilliards.java`, `Spool.java` (Swimming Pool tour), `welDining.java`, `welSpa.java`, `Jacuzzi.java`, `Rooms.java`, `Ecosuite.java`, `Exesuite.java`, `EcoRoombooking.java`.

### Data Files (`src/MainPackage/`)

* **info.txt**: Plaintext file containing registered admin accounts.
* **UserInfo.txt**: Plaintext file containing registered customer accounts.
* **Employee3.txt** / **Employee4.txt**: Live and temporary storage for employee records.
* **Customer3.txt** / **Customer4.txt**: Live and temporary storage for customer records.

---

## Data Model Specifications

### Employee
Stores staff data inside the system. 
* Fields: `Name`, `ID`, `Age`, `Nationality`, `Designation`
* Saved Format (space-separated): `[Name] [ID] [Age] [Nationality] [Designation]`

### Customer
Stores guest data inside the system.
* Fields: `Name`, `NID`, `Age`, `Phone Number`, `Nationality`
* Saved Format (space-separated): `[Name] [NID] [Age] [Phone Number] [Nationality]`

---

## Technical Notes and Considerations

* **Hardcoded Paths**: The current version uses hardcoded absolute paths on the Windows `F:` drive for file reads and writes (e.g., `F://Swing GUI//src//MainPackage/...`). These paths are used to locate data text files (`info.txt`, `Customer3.txt`, etc.) and image assets (such as `Hotel_logo.png`). When deploying the codebase on a different environment, modify these paths in the Java source files or switch them to relative classpath references using `getClass().getResource()`.
* **File Operations**: Delete operations operate by scanning the source file, writing all non-matching records to a secondary temporary file (e.g., `Employee4.txt`), deleting the original file, and restoring data back to the primary location.

---

## Running the Application

### Prerequisites
* Java SE Development Kit (JDK) version 8 or higher.
* IDE (Eclipse, IntelliJ IDEA, NetBeans) or Command Line.

### Option 1: Running from IDE
1. Open the project folder in your IDE.
2. Ensure that the external `.jar` libraries in the root directory are added to your project build path.
3. Update any hardcoded file path strings in the codebase if they do not match your project path structure.
4. Locate `Start.java` within `src/MainPackage/`.
5. Run the file as a Java Application.

### Option 2: Running via Terminal
1. Compile the source code:
   ```bash
   javac -cp ".;*" src/MainPackage/Start.java
   ```
2. Execute the compiled class:
   ```bash
   java -cp "src;*" MainPackage.Start
   ```