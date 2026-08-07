# One-Page Explanation — Abstract Classes, Abstract Methods & Interfaces

**Name:** Albert Cyriac | **Topic:** Java Lab Exercise — Abstract Classes, Abstract Methods, Interfaces

## Why an abstract class was used

In all three tasks, an abstract class (`StudentEvaluation`, `RescueRobot`) was used because every
subtype shares **real, reusable state and behaviour**, not just a common label. `StudentEvaluation`
stores the student's name, ID, course, and marks in every subclass, and `displayStudentDetails()` is
written once and inherited everywhere instead of being retyped in `UGCourseEvaluation`,
`PGCourseEvaluation`, `CertificateCourseEvaluation`, and `DiplomaCourseEvaluation`. Similarly,
`RescueRobot` centralises `robotId`, `battery`, `checkBatteryStatus()`, and `announce()` for every
robot. An abstract class was the right tool here because it lets us mix **concrete, shared code**
with **abstract methods that force each subclass to supply its own logic** (`calculateTotalMarks()`,
`displayGrade()`, `performMission()`) — something a plain interface (pre-Java 8 style) cannot do,
since it cannot hold instance fields or a constructor.

## Why interfaces were used

Interfaces (`WiFiEnabled`, `VoiceControlled`, `MusicPlayer`, `VideoStreaming`, `TemperatureMonitor`
in Task 2; `Flyable`, `Swimmable`, `Climbable` in Task 3) were used because these are **capabilities**,
not a shared identity or shared state. A `SmartThermostat` and a `SmartTV` are not variations of one
"parent" device — they simply happen to both connect to Wi-Fi. Interfaces let unrelated classes opt
into a capability by contract (a method signature) without forcing them into a common class hierarchy
or giving them fields/behaviour they don't need. This also keeps the design open for extension:
`SmartCar` and `DiplomaCourseEvaluation` were added later by simply picking the interfaces/abstract
class they needed, without editing a single line of existing code.

## Where multiple inheritance was required

Java classes cannot extend more than one class, but they can implement several interfaces — this is
exactly where multiple inheritance was needed. In Task 2, `SmartHub` implements four interfaces
(`WiFiEnabled`, `VoiceControlled`, `MusicPlayer`, `TemperatureMonitor`) and `SmartCar` implements four
more (`WiFiEnabled`, `VoiceControlled`, `MusicPlayer`, `VideoStreaming`) — no single device fit into
one category. In Task 3, `AmphibiousRescueRobot` implements both `Swimmable` and `Climbable`
simultaneously, letting one robot cross water and then climb over debris in the same mission, which
a single-inheritance abstract class alone could never express cleanly.

## Could this be implemented using only classes?

Technically yes, but it would be poor design. Without abstract classes, every course/device/robot
class would either duplicate the shared code (`displayStudentDetails`, `checkBatteryStatus`) or
inherit from an unrelated concrete class purely for code reuse, which breaks the "is-a" relationship.
Without interfaces, Java's single-inheritance rule for classes would make it impossible for `SmartHub`
or `AmphibiousRescueRobot` to combine multiple independent capabilities at all — you cannot extend
four classes at once. Using only classes would also break the Open/Closed Principle demonstrated in
each task: adding `SmartCar` or `DiplomaCourseEvaluation` would then require editing existing classes
instead of simply writing a new one. Abstract classes and interfaces together let each task model
**shared identity** (via inheritance) and **independent, combinable capability** (via interfaces)
correctly and extensibly.
