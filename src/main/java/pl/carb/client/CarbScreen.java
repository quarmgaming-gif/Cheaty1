package pl.carb.client;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;

public final class CarbScreen extends Screen {
    private int scroll;

    public CarbScreen() {
        super(Text.literal("Carb Client - ALL"));
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        this.renderBackground(context, mouseX, mouseY, delta);

        int left = this.width / 2 - 180;
        int top = this.height / 2 - 120;

        context.fill(left, top, left + 360, top + 240, 0xEE12091F);
        context.fill(left, top, left + 360, top + 30, 0xFF5D16B5);
        context.drawText(this.textRenderer, "CARB CLIENT  |  ALL", left + 12, top + 10, 0xFFFFFFFF, false);

        int y = top + 42;
        for (int i = scroll; i < Math.min(CarbModules.ALL.size(), scroll + 8); i++) {
            CarbModule module = CarbModules.ALL.get(i);
            String line = (module.isEnabled() ? "[ON]  " : "[OFF] ") + module.getName();
            context.drawText(this.textRenderer, line, left + 14, y, 0xFFE8D7FF, false);
            y += 20;
        }

        context.drawText(this.textRenderer, "Kliknij moduł, aby przełączyć. ESC - zamknij.", left + 12, top + 218, 0xFFBCA6D8, false);
        super.render(context, mouseX, mouseY, delta);
    }

    @Override
    public boolean mouseClicked(double mouseX, double mouseY, int button) {
        int left = this.width / 2 - 180;
        int top = this.height / 2 - 120;
        if (button == 0 && mouseX >= left && mouseX <= left + 360
                && mouseY >= top + 38 && mouseY < top + 198) {
            int index = scroll + (int)((mouseY - (top + 38)) / 20);
            if (index >= 0 && index < CarbModules.ALL.size()) {
                CarbModules.ALL.get(index).toggle();
                return true;
            }
        }
        return super.mouseClicked(mouseX, mouseY, button);
    }

    @Override
    public boolean mouseScrolled(double mouseX, double mouseY, double horizontalAmount, double verticalAmount) {
        int max = Math.max(0, CarbModules.ALL.size() - 8);
        scroll = Math.max(0, Math.min(max, scroll - (int)Math.signum(verticalAmount)));
        return true;
    }

    @Override
    public boolean shouldPause() { return false; }
}
