package OLt;

import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class Ml {
    public static final j J2 = new j(null);
    private boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ColorFilter f7322t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f7321n = -1;
    private int nr = -1;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f7320O = -1;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    public final void O(boolean z2) {
        this.f7320O = z2 ? 1 : 0;
    }

    public final void n(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        int i2 = this.f7321n;
        if (i2 != -1) {
            drawable.setAlpha(i2);
        }
        if (this.rl) {
            drawable.setColorFilter(this.f7322t);
        }
        int i3 = this.nr;
        if (i3 != -1) {
            drawable.setDither(i3 != 0);
        }
        int i5 = this.f7320O;
        if (i5 != -1) {
            drawable.setFilterBitmap(i5 != 0);
        }
    }

    public final void nr(boolean z2) {
        this.nr = z2 ? 1 : 0;
    }

    public final void rl(int i2) {
        this.f7321n = i2;
    }

    public final void t(ColorFilter colorFilter) {
        this.f7322t = colorFilter;
        this.rl = colorFilter != null;
    }
}
