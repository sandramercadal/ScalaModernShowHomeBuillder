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
                  val houseType: String, //Detached, Semi
                  val bathrooms: Int,
                  val hasGarden: Boolean,
                  val houseSqm: Double, //From 55sqm
                  val gardenSize: Double,
                  val hasDoubleGarage: Boolean,
                  val hasLoft: Boolean,
                  val hasUtilityRoom: Boolean,
                  val kitchenIslandMaterial: String, //Luxury Marble, Marble or wood
                  val floorType: String, //Tile, Laminate, wood
                  val heatingType: String, //Underfloor, radiators,
                  val plotNumber: Int,
                  val familyName: String,
                  val ecoChoices: List[String] //Solar panels, Ev charger, rainwater system in garden
                  //private val basicSpecHome: Double = 250000
                ) {

  // Building on one plot only
  val address = "Newyear Estate, Partridge Lane"

  // Chapter 6: Precondition checking, checks that enforce business rules to create a ModernHome
  require(bedrooms > 0, "At least 1 bedroom must be selected")
  require(bathrooms > 0, "At least 1 bathroom must be selected")
  require(gardenSize >= 0, "Garden size must be positive")
  require(kitchenIslandMaterial.nonEmpty, "Must choose kitchen island material")

  /** BASE SPEC HOUSE
   * The base home is a small house with 1 bedroom, 1 bathroom, 55 sqm with no garden = £250,000
   * Everything else is an upgrade
   * Additional bedroom £25,000
   * Additional bathroom £12,000
   * Garden (per m²) £100
   * Double garage £35,000
   * Loft conversion £25,000
   * Utility room £8,000
   * Extra square footage £50 per sqm
   * Kitchen upgrades: Marble £12,000 or Quartz £8,000 or Wood £5,000
   * Flooring upgrades: Hardwood and Tile £6,000 / Other £3,000
   * Energy Rating A £10,000 or B £5,000
   */

//  def modernHomePriceTotal: Double = {
//    basicSpecHome = 250_000
//
//    basicSpecHome +
//      ((bedrooms - 1) max 0) * 250_00 + // Extra bedrooms
//  }

  //Chapter 6 Auxiliary constructor using "this"
  def this(plotNumber: Int, familyName: String) = {
    this(
      bedrooms = 1,
      houseType = "Semi-Detached",
      bathrooms = 1,
      hasGarden = false,
      houseSqm = 55.0,
      gardenSize = 0.0,
      hasDoubleGarage = false,
      hasLoft = false,
      hasUtilityRoom = false,
      kitchenIslandMaterial = "Wood",
      floorType = "Laminate",
      heatingType = "Radiators",
      plotNumber = plotNumber,
      familyName = familyName,
      ecoChoices = List.empty // No eco upgrades
    )
  }

  // Add Chapter 6: Override toString
  override def toString: String = {
    s"ModernHome(Plot ${plotNumber}, ${familyName} family order, ${bedrooms} bed, ${bathrooms} bath, ${houseSqm} sqm, £${ModernHomePriceTotal.toInt})"
  }
}

object ModernHomeApp extends App {

    val baseSpecHomeOrder = new ModernHome(5, "Jones")
    println(baseSpecHomeOrder)

    val upgradedHomeOrder1 = new ModernHome(
    bedrooms = 3,
    houseType = "Detached",
    bathrooms = 2,
    hasGarden = true,
    houseSqm = 120.0,
    gardenSize = 80.0,
    hasDoubleGarage = true,
    hasLoft = true,
    hasUtilityRoom = true,
    kitchenIslandMaterial = "Marble",
    floorType = "Hardwood",
    heatingType = "Underfloor",
    plotNumber = 7,
    familyName = "Peters",
    ecoChoices = List("Solar Panels", "EV Charger", "Rainwater System")
  )
    println(upgradedHomeOrder1)
}


  //Add chapter 5 Arithmatic operators

  //Add chapter 5 Relational operators

  //Dynamic pricing

  //Factory Obj

  // Comparison house

  //Twin design home

  //Create homes for different families on different plots  val PetersFamily = new ModernHome (
