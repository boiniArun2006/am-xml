package dzu;

import GJW.IG;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class psW {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final CoroutineContext f63573n;
    private int nr;
    private final Object[] rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final IG[] f63574t;

    public final void n(IG ig, Object obj) {
        Object[] objArr = this.rl;
        int i2 = this.nr;
        objArr[i2] = obj;
        IG[] igArr = this.f63574t;
        this.nr = i2 + 1;
        Intrinsics.checkNotNull(ig, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        igArr[i2] = ig;
    }

    public final void rl(CoroutineContext coroutineContext) {
        int length = this.f63574t.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i2 = length - 1;
            IG ig = this.f63574t[length];
            Intrinsics.checkNotNull(ig);
            ig.p5(coroutineContext, this.rl[length]);
            if (i2 < 0) {
                return;
            } else {
                length = i2;
            }
        }
    }

    public psW(CoroutineContext coroutineContext, int i2) {
        this.f63573n = coroutineContext;
        this.rl = new Object[i2];
        this.f63574t = new IG[i2];
    }
}
