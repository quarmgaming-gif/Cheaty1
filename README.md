# Carb Client — Minecraft 1.21.4 / Fabric

## Build
1. Install JDK 21.
2. Open this folder in IntelliJ IDEA (or use Gradle from a terminal).
3. Run `gradle build` (or `./gradlew build` after generating the Gradle wrapper).
4. Put the resulting JAR from `build/libs/` into the Minecraft `mods` folder alongside Fabric API.

## Controls
- Right Shift: open the ALL menu.
- Click a listed item: toggle its demo state.
- Mouse wheel: scroll the list.
- Escape: close the menu.

## Important scope
This is a starter project and GUI prototype, not a finished cheat client. The listed modules are placeholders: toggling them changes only their UI state. It does not implement X-Ray, ESP, combat automation, movement exploits, or interaction with other players. The Lag Simulator entry is only a placeholder for a future local-only network-condition test; do not use it to flood or disrupt another player's connection.

The earlier generated Carb Client image is a visual mockup, not a screenshot of a running mod.
