package dF;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class Wre {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f63468n;
    private final boolean rl;

    public Wre(boolean z2, boolean z3) {
        this.f63468n = z2;
        this.rl = z3;
    }

    public final boolean n() {
        return this.f63468n;
    }

    public final boolean rl() {
        return this.rl;
    }

    public /* synthetic */ Wre(boolean z2, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z2, (i2 & 2) != 0 ? false : z3);
    }
}
