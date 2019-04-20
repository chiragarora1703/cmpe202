CRC Cards

| Responsibility                                                                                 | Collaborators    |
|------------------------------------------------------------------------------------------------|------------------|
| Takes information required by the reservation that is name, number and size from the customer. |                  |
| Register the customer with the system                                                          | Waitlist manager |
| Cancellation of the table                                                                      | Waitlist manager |
| Confirmation of the table                                                                      | Waitlist manager |
| Inform customers and (wait for their responses) 

-------------

Waitlist manager

| Responsibility                                | Collaborators |
|-----------------------------------------------|---------------|
| Add new reservation to the internal waitlist  | Reservations  |
| Listen for empty tables event                 |               |
| Remove customer from waitlist                 |               |
| Search for customer with the new empty table. |               |
| Assign table to the customer on confirmation  | Reservations  |

-------
TableManager

| Responsibility                                  | Collaborators    |
|-------------------------------------------------|------------------|
| Manage the tables                               |                  |
| Send empty table event to the wait list manager | WaitList Manager |	


Design patterns:
1)	Chain of responsibility : waitlist manager will responsible for keeping the chain / customers intact and will initiate the search for customer (using the customers chain)
Reservations will lookup that if table is suitable for reservation / customer party or not. If not, table will move to next reservation.
2)	Observer: Whenever table is empty, waitlist manager needs to initiate the lookup and then once the proper match is found, will send the reservation to inform the customers.

