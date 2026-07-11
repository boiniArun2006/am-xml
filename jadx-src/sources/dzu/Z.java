package dzu;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class Z {
    public static Object n(Object obj) {
        return obj;
    }

    public static final afx rl(Object obj) {
        if (obj != n.f63571n) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
            return (afx) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final boolean t(Object obj) {
        if (obj == n.f63571n) {
            return true;
        }
        return false;
    }
}
