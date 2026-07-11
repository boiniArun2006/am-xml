package mfo;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class Dsr implements w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final float f70924n;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Dsr) && this.f70924n == ((Dsr) obj).f70924n;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f70924n)});
    }

    @Override // mfo.w6
    public float n(RectF rectF) {
        return this.f70924n * rl(rectF);
    }

    public Dsr(float f3) {
        this.f70924n = f3;
    }

    private static float rl(RectF rectF) {
        return Math.min(rectF.width(), rectF.height());
    }
}
