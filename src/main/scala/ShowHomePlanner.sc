/** Chapters 5 (Basic Types and Operations) & 6 (Functional Objects) of the Scala book

 Chapter 5 teaches how to create immutable classes in Scala using a Rational number class as an example.
 -Class parameters that become constructor arguments
 -Immutability where original objects never change
 -Operator methods using +, * etc as method names
 - Method overloading (multiple ones with the same name)
 - Auxiliary constructors for alternative ways to create objects
 - Private fields and methods


 S C A L A   M O D E R N   S H O W   H O M E   P L A N N E R
 */

class ModernHome(
                  val bedrooms: Int,
                  val bathrooms: Int,
                  val hasGarden: Boolean,
                  val gardenSize: Int, //SQM
                  val hasDoubleGarage: Boolean,
                  val hasLoft: Boolean,
                  val hasUtilityRoom: Boolean,
                  val hasBasement: Boolean,
                  val isCornerPlot: Boolean
                ) {

  // Building on one plot only
  val address = "Newyear Estate, Partridge Lane"

  //Add // Chapter 6: Precondition checking

// Add Chapter 6: Override toString


//Add chapter 5 Arithmatic operators

//Add chapter 5 Relational operators

//Factory Obj

//Println some orders