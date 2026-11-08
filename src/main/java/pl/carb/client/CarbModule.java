package pl.carb.client;

public final class CarbModule {
    private final String name;
    private boolean enabled;

    public CarbModule(String name) { this.name = name; }
    public String getName() { return name; }
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public void toggle() { enabled = !enabled; }
}
