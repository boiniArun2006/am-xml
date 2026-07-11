package Si;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class C extends FrameLayout implements j9J.w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private BGJ.fuX f9802n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f9803t;

    public final BGJ.fuX n() {
        if (this.f9802n == null) {
            this.f9802n = rl();
        }
        return this.f9802n;
    }

    protected BGJ.fuX rl() {
        return new BGJ.fuX(this, false);
    }

    protected void t() {
        if (this.f9803t) {
            return;
        }
        this.f9803t = true;
        ((s4) Z()).rl((C1469c) j9J.I28.n(this));
    }

    C(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!isInEditMode()) {
            t();
        }
    }

    @Override // j9J.n
    public final Object Z() {
        return n().Z();
    }
}
