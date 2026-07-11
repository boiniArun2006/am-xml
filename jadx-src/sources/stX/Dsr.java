package stX;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class Dsr {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f73348n;
    private final Function0 rl;

    public Dsr(int i2, Function0 message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f73348n = i2;
        this.rl = message;
    }

    public final Function0 n() {
        return this.rl;
    }

    public final int rl() {
        return this.f73348n;
    }
}
