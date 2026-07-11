package co4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class I28 implements l3D {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final o f43840n;

    public I28(o directive) {
        Intrinsics.checkNotNullParameter(directive, "directive");
        this.f43840n = directive;
    }

    public boolean equals(Object obj) {
        return (obj instanceof I28) && Intrinsics.areEqual(this.f43840n, ((I28) obj).f43840n);
    }

    public int hashCode() {
        return this.f43840n.hashCode();
    }

    @Override // co4.Xo
    public q6b.I28 n() {
        return this.f43840n.n();
    }

    @Override // co4.Xo
    public stX.eO rl() {
        return this.f43840n.rl();
    }

    public final o t() {
        return this.f43840n;
    }

    public String toString() {
        return "BasicFormatStructure(" + this.f43840n + ')';
    }
}
