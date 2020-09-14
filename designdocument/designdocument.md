# FeedApp

## Use Cases

![Use Cases](assets/usecases.png)

* **Vote public polls:** Anyone can vote on public polls via the public polls screen.
* **Register:** Everyone can register as a user
* **Login:** Registered users are able to log in
* **Create polls:** Only registered users who are logged in can create polls.
* **Close polls:** Logged in users who has created a poll, are able to close their poll.
* **Vote private polls:** Only users who are registered and logged in can vote on private polls.
* **Manage users:** The administrators are the only ones who can manage users by deleting, adding or editing them.

## Domain model

![Domain Model](assets/domainmodel.png)

## Application Flow

![Application Flow](assets/applicationflowdiagram.png)

The application consists of seven screens. The home screen is the `Public polls screen` where the user can chose to vote on a public poll, join a poll by a code or log in on the `Login screen`. When the user is logged in, they have more possibilities, and are able to create both public and private polls, which there are separate screens for.
If the user who is logged is an admin, they are able to manage the users.

## User Screens

### Public polls screen

![Public polls screen](assets/public-polls-screen.png)
Here the user has the option to choose from available polls and vote on them. On the bottom right there is a button for a popup, where the user can enter a poll code and it will get added to the list.

### Login screen

![Login screen](assets/login-screen.png)
On the bottom right is the login button, which redirects to a login screen. Here the user can enter their credentials in order to log in.

### Join poll screen

![Join poll screen](assets/join-poll-screen.png)
When tapping the button for joining a poll, the user gets a popup where they can enter the code for a poll in order to vote on it.

### Navigation screen

![Navigation Screen](assets/navigation-screen.png)
In the sidebar menu, the user has the possibility to view their public and private polls, through which they can create new polls.
This is an admin's view of the sidebar, which includes the ability to manage users.

### Manage users screen

![Users screen](assets/users-screen.png)
Here is the screen the admin is able to view for managing the users. Here they can add, edit or delete existing users, as well as creating new admins.

## Architectural Diagram

![Architectural Diagram](assets/architecturaldiagram.png)
