package pl.carb.client;

import java.util.List;

public final class CarbModules {
    private CarbModules() {}

    // UI/demo toggles only. They do not implement gameplay automation or attacks.
    public static final List<CarbModule> ALL = List.of(
        new CarbModule("X-Ray (placeholder)"),
        new CarbModule("ESP (placeholder)"),
        new CarbModule("FullBright (placeholder)"),
        new CarbModule("Fly (placeholder)"),
        new CarbModule("Speed (placeholder)"),
        new CarbModule("Best Aura (placeholder)"),
        new CarbModule("Auto Rod (placeholder)"),
        new CarbModule("Auto Trap (placeholder)"),
        new CarbModule("Auto Cobweb (placeholder)"),
        new CarbModule("Auto Drip (placeholder)"),
        new CarbModule("Anti-Knockback (placeholder)"),
        new CarbModule("Anti-Cobweb (placeholder)"),
        new CarbModule("Lyrics 3D (placeholder)"),
        new CarbModule("Freecam (placeholder)"),
        new CarbModule("Lag Simulator (local test only)")
    );
}
