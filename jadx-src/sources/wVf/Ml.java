package wVf;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import wVf.j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class Ml implements j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f75000n;
    private final Class rl = Ml.class;

    @Override // wVf.j
    public void nr(n bitmapFramePreparer, zdu.n bitmapFrameCache, y8.j animationBackend, int i2, Function0 function0) {
        Intrinsics.checkNotNullParameter(bitmapFramePreparer, "bitmapFramePreparer");
        Intrinsics.checkNotNullParameter(bitmapFrameCache, "bitmapFrameCache");
        Intrinsics.checkNotNullParameter(animationBackend, "animationBackend");
        int i3 = this.f75000n;
        int i5 = 1;
        if (1 <= i3) {
            while (true) {
                int iN = (i2 + i5) % animationBackend.n();
                if (Dzy.j.az(2)) {
                    Dzy.j.ck(this.rl, "Preparing frame %d, last drawn: %d", Integer.valueOf(iN), Integer.valueOf(i2));
                }
                if (!bitmapFramePreparer.n(bitmapFrameCache, animationBackend, iN)) {
                    return;
                }
                if (i5 == i3) {
                    break;
                } else {
                    i5++;
                }
            }
        }
        if (function0 != null) {
            function0.invoke();
        }
    }

    public Ml(int i2) {
        this.f75000n = i2;
    }

    @Override // wVf.j
    public void n(int i2, int i3, Function0 function0) {
        j.C1259j.nr(this, i2, i3, function0);
    }

    @Override // wVf.j
    public void onStop() {
        j.C1259j.t(this);
    }

    @Override // wVf.j
    public Pj0.j rl(int i2, int i3, int i5) {
        return j.C1259j.rl(this, i2, i3, i5);
    }

    @Override // wVf.j
    public void t() {
        j.C1259j.n(this);
    }
}
