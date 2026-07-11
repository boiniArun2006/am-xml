package mfo;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class n implements w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final w6 f70932n;
    private final float rl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f70932n.equals(nVar.f70932n) && this.rl == nVar.rl;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f70932n, Float.valueOf(this.rl)});
    }

    @Override // mfo.w6
    public float n(RectF rectF) {
        return Math.max(0.0f, this.f70932n.n(rectF) + this.rl);
    }

    public n(float f3, w6 w6Var) {
        while (w6Var instanceof n) {
            w6Var = ((n) w6Var).f70932n;
            f3 += ((n) w6Var).rl;
        }
        this.f70932n = w6Var;
        this.rl = f3;
    }
}
