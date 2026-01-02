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
                  val squareFootage: Double, //From 600
                  val bedrooms: Int,
                  val houseType: String, //Detached, Semi
                  val bathrooms: Int,
                  val hasGarden: Boolean,
                  val houseSqm: Double,
                  val gardenSize: Double,
                  val hasDoubleGarage: Boolean,
                  val hasLoft: Boolean,
                  val hasUtilityRoom: Boolean,
                  val hasBasement: Boolean,
                  val isCornerPlot: Boolean,
                  val kitchenIslandMaterial: String, //Luxury Marble, Marble or wood
                  val floorType: String, //Tile, Laminate, wood
                  val heatingType: String, //Underfloor, radiators,
                  val hasPlayroom: Boolean,
                  val plotNumber: Int,
                  val familyName: String,
                  val ecoChoices: List[String]  //Solar panels, Ev charger, rainwater system in garden
                ) {

  // Building on one plot only
  val address = "Newyear Estate, Partridge Lane"

  // Chapter 6: Precondition checking, checks that enforce business rules to create a ModernHome
  require(bedrooms > 0, "At least 1 bedroom must be selected")
  require(bathrooms > 0, "At least 1 bathroom must be selected")
  require(gardenSize >= 0, "Garden size must be positive")
  require (kitchenIslandMaterial.nonEmpty, "Must choose kitchen island material")

  /** BASE SPEC HOUSE
   * The base home is a small house with 1 bedroom, 1 bathroom, 55 sqm with no garden = £250,000
   * Everything else is an upgrade
         * Additional bedroom £25,000
         * Additional bathroom £12,000
         * Garden (per m²)£100
         * Double garage £35,000
         * Loft conversion £15,000
         * Utility room £8,000
         * Corner plot £20,000
         * Extra square footage £50 per sq ft
         * Kitchen upgrades: Marble £12,000 or Quartz £8,000 or Wood £5,000
         * Flooring upgrades: Hardwood / Tile+£6k / £3k
         * Energy Rating A or B+£10,000 / £5,000
   */
  //base spec house
  //The base home is a small house with 1 bedroom, 1 bathroom, 55 sqm with no garden = £250000
  //Everything else is an upgrade

  val basicSpecPrice = 250000


  // Add Chapter 6: Override toString

  //Add chapter 5 Arithmatic operators

  //Add chapter 5 Relational operators

  //Dynamic pricing

  //Factory Obj

  // Comparison house

  //Twin design home

  //Create homes for different families on different plots  val PetersFamily = new ModernHome (
}