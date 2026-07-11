package OLt;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final I28 f7319n = new I28();

    public static final void O(Drawable drawable, Ml ml) {
        if (drawable == null || ml == null) {
            return;
        }
        ml.n(drawable);
    }

    public static final void n(Drawable drawable, Drawable drawable2) {
        if (drawable2 == null || drawable == null || drawable == drawable2) {
            return;
        }
        drawable.setBounds(drawable2.getBounds());
        drawable.setChangingConfigurations(drawable2.getChangingConfigurations());
        drawable.setLevel(drawable2.getLevel());
        drawable.setVisible(drawable2.isVisible(), false);
        drawable.setState(drawable2.getState());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void nr(Drawable drawable, Drawable.Callback callback, Ew ew) {
        if (drawable == 0) {
            return;
        }
        drawable.setCallback(callback);
        Z z2 = drawable instanceof Z ? (Z) drawable : null;
        if (z2 != null) {
            z2.Uo(ew);
        }
    }

    public static final int rl(int i2) {
        int i3 = i2 >>> 24;
        if (i3 != 0) {
            return i3 != 255 ? -3 : -1;
        }
        return -2;
    }

    public static final int t(int i2, int i3) {
        if (i3 == 255) {
            return i2;
        }
        if (i3 == 0) {
            return i2 & 16777215;
        }
        return (i2 & 16777215) | ((((i2 >>> 24) * (i3 + (i3 >> 7))) >> 8) << 24);
    }

    private I28() {
    }
}
