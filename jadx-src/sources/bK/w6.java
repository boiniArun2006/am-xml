package bK;

import d2n.Wre;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class w6 {
    public static final Wre n(Wre toItemRange, long j2) {
        Intrinsics.checkNotNullParameter(toItemRange, "$this$toItemRange");
        return new Wre(n.n(toItemRange.O(), j2), n.n(toItemRange.nr(), j2), null);
    }

    public static final Wre rl(Wre toSourceRange, long j2, long j3, H7v.j speed) {
        Intrinsics.checkNotNullParameter(toSourceRange, "$this$toSourceRange");
        Intrinsics.checkNotNullParameter(speed, "speed");
        return new Wre(n.rl(toSourceRange.O(), j2, j3, speed), n.rl(toSourceRange.nr(), j2, j3, speed), null);
    }

    public static final Wre t(Wre toSourceRange, long j2, H7v.j speed) {
        Intrinsics.checkNotNullParameter(toSourceRange, "$this$toSourceRange");
        Intrinsics.checkNotNullParameter(speed, "speed");
        return new Wre(n.t(toSourceRange.O(), j2, speed), n.t(toSourceRange.nr(), j2, speed), null);
    }
}
