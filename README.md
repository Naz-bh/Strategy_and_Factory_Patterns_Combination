# Statement of Work
We are calculating monthly interest on different types of bank accounts. We are only dealing
with two account types. Interest will not be applicable to any other types of accounts. Current
accounts paying 2% interest per annum, and savings accounts paying 4% per annum. Interest
will not be applicable to any other types of accounts. Our account types are defined by an
enum.</br></br>
We need to add support for two different money market accounts. A standard money market
account paying 6% per annum, and a special "high-roller" money market account that pays
7.5%, but only if the customer maintains a minimum balance of $100.000,00.</br></br>
Our code gets messier with every set of new requirements that we implement. If we keep on
adding more and more business rules into our calculator, we are going to end up with
something that could become very difficult to maintain.</br></br>
The problem that we have is this:</br>
● We have a single, convoluted, hard-to-maintain method that is trying to deal with a
number of different scenarios. </br>

# Explanation on Utilized Design Patterns
The Strategy pattern allows us to dynamically swop out algorithms (i.e. application logic) at
runtime. In our scenario, we want to change the logic used to calculate interest, based on the
type of account that we are working with.</br></br>
The Factory pattern allows us to create objects without necessarily knowing or caring about
the type of objects that we are creating. This is exactly what our calculator needs
