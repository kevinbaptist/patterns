
# Adapter Pattern  - Structural Pattern

## Typical use cases:
* Create a middleware between your code and 3rd Party class, legacy class, etc

## TL:DR
* Converts the interface of one object so that another object can understand it
* Changes the interface of an existing objects


###  Round / Square example
* we have -> Round Holes and Round Pegs
* we're adding Square Pegs in Round holes.
    * Solution 1: overload fits method on RoundHole
        * Problem: it would work, but not very scalable
    * Solution 2: create an adapter
    
    
