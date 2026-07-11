package TFv;

import GJW.xuv;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import teV.Pl;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
abstract /* synthetic */ class o {
    public static final Wre n(Wre wre, int i2, ILs.j jVar) {
        if (i2 < 0 && i2 != -2 && i2 != -1) {
            throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i2).toString());
        }
        if (i2 == -1 && jVar != ILs.j.f4185n) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i2 == -1) {
            jVar = ILs.j.f4187t;
            i2 = 0;
        }
        int i3 = i2;
        ILs.j jVar2 = jVar;
        if (wre instanceof teV.Pl) {
            return Pl.j.n((teV.Pl) wre, null, i3, jVar2, 1, null);
        }
        return new teV.CN3(wre, null, i3, jVar2, 2, null);
    }

    public static final Wre nr(Wre wre) {
        return rl(wre, -1, null, 2, null);
    }

    public static /* synthetic */ Wre rl(Wre wre, int i2, ILs.j jVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = -2;
        }
        if ((i3 & 2) != 0) {
            jVar = ILs.j.f4185n;
        }
        return fuX.nr(wre, i2, jVar);
    }

    private static final void t(CoroutineContext coroutineContext) {
        if (coroutineContext.get(xuv.nr) == null) {
            return;
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + coroutineContext).toString());
    }

    public static final Wre O(Wre wre, CoroutineContext coroutineContext) {
        t(coroutineContext);
        if (Intrinsics.areEqual(coroutineContext, EmptyCoroutineContext.INSTANCE)) {
            return wre;
        }
        if (wre instanceof teV.Pl) {
            return Pl.j.n((teV.Pl) wre, coroutineContext, 0, null, 6, null);
        }
        return new teV.CN3(wre, coroutineContext, 0, null, 12, null);
    }
}
