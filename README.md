# Abstract Groups

Groups provides a simple way to look at groups, their elements, and their basic properties. It beats doing so by hand!

## Installation

Clone and  `lein run`.

## Usage

There are three groups we will look at in the initial version. The first is multiplicative groups modulo n, with elements coprime with n; or, U(n). The second are the additive integers modulo n; or, Z_n. Finally, we'll look at p-groups. My generating a group, you will be able to see its elements printed immediately. Next, you can obtain some basic properties: Their order, the order of each element, and whether the group is cyclic.

The starting point is:

    > Hello there! What group or property would you like to look at?

To find see a the group of multiplative units, enter U(n) where n is the terminating value of the group.

    > U(10)
	> (1 3 7 9)

## Group Operations

The following are a list of operations you can run. These include the definition of a group, order of the group, listing of generators, cyclic check, and element orders.

###Define Group

There are two supported groups at the moment. The multiplicative group of integers modulo n, "U(n)". The additive group of integers modulo n, "Z\_n".

    > U(10)
    > (1 3 7 9)

    > Z_4
    > (0 1 2 3)
	
###Order

To find order of a group,

    > order Z_4
    > The order of Z_4 is 4


###Generating Elements

Find the generators of a group

    > generators U(22)
    > (7, 13, 17, 19)

###Nongenerating Elements

Find the non-generating elements

    > non-generators U(22)
    > (1, 3, 5, 9, 15, 21)



## License

Copyright © 2013 Thomas Meier

Distributed under the Eclipse Public License, the same as Clojure.