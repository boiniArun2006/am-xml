package androidx.core.view.insets;

import android.graphics.drawable.ColorDrawable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class ColorProtection extends Protection {
    private boolean HI;
    private int ck;
    private final ColorDrawable ty;

    @Override // androidx.core.view.insets.Protection
    boolean Uo() {
        return true;
    }

    private void ck(int i2) {
        if (this.ck != i2) {
            this.ck = i2;
            this.ty.setColor(i2);
            xMQ(this.ty);
        }
    }

    @Override // androidx.core.view.insets.Protection
    void n(int i2) {
        if (this.HI) {
            return;
        }
        ck(i2);
    }
}
