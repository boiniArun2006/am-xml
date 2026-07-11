package TCZ;

import X4.n;
import android.content.Context;
import android.graphics.Color;
import androidx.core.graphics.ColorUtils;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class j {
    private static final int J2 = (int) Math.round(5.1000000000000005d);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final float f10221O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f10222n;
    private final int nr;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f10223t;

    public j(Context context) {
        this(n.rl(context, Rxk.n.f8809r, false), W3.j.rl(context, Rxk.n.Ik, 0), W3.j.rl(context, Rxk.n.ck, 0), W3.j.rl(context, Rxk.n.ty, 0), context.getResources().getDisplayMetrics().density);
    }

    private boolean O(int i2) {
        return ColorUtils.ck(i2, 255) == this.nr;
    }

    public float n(float f3) {
        if (this.f10221O <= 0.0f || f3 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f3 / r0)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public boolean nr() {
        return this.f10222n;
    }

    public int t(int i2, float f3) {
        return (this.f10222n && O(i2)) ? rl(i2, f3) : i2;
    }

    public int rl(int i2, float f3) {
        int i3;
        float fN = n(f3);
        int iAlpha = Color.alpha(i2);
        int iMUb = W3.j.mUb(ColorUtils.ck(i2, 255), this.rl, fN);
        if (fN > 0.0f && (i3 = this.f10223t) != 0) {
            iMUb = W3.j.xMQ(iMUb, ColorUtils.ck(i3, J2));
        }
        return ColorUtils.ck(iMUb, iAlpha);
    }

    public j(boolean z2, int i2, int i3, int i5, float f3) {
        this.f10222n = z2;
        this.rl = i2;
        this.f10223t = i3;
        this.nr = i5;
        this.f10221O = f3;
    }
}
