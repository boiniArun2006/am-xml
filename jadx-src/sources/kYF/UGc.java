package kYF;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class UGc {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Be4.qz f69933O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f69934n;
    private final int nr;
    private final boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f69935t;

    public UGc(boolean z2, boolean z3, boolean z4, int i2, Be4.qz qzVar) {
        this.f69934n = z2;
        this.rl = z3;
        this.f69935t = z4;
        this.nr = i2;
        this.f69933O = qzVar;
    }

    public final boolean O() {
        return this.f69935t;
    }

    public final boolean n() {
        return this.f69934n;
    }

    public final boolean nr() {
        return this.rl;
    }

    public final Be4.qz rl() {
        return this.f69933O;
    }

    public final int t() {
        return this.nr;
    }

    public /* synthetic */ UGc(boolean z2, boolean z3, boolean z4, int i2, Be4.qz qzVar, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? true : z2, (i3 & 2) != 0 ? true : z3, (i3 & 4) != 0 ? true : z4, (i3 & 8) != 0 ? 4 : i2, (i3 & 16) != 0 ? Be4.qz.f563t : qzVar);
    }
}
