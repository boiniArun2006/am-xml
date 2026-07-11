package co4;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: co4.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class C1686z extends j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final n f43868n;
    private final qz nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Object f43869t;

    public /* synthetic */ C1686z(n nVar, String str, Object obj, qz qzVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(nVar, (i2 & 2) != 0 ? nVar.getName() : str, (i2 & 4) != 0 ? null : obj, (i2 & 8) != 0 ? null : qzVar);
    }

    @Override // co4.Pl
    public Object getDefaultValue() {
        return this.f43869t;
    }

    @Override // co4.Pl
    public String getName() {
        return this.rl;
    }

    @Override // co4.Pl
    public n n() {
        return this.f43868n;
    }

    @Override // co4.Pl
    public qz rl() {
        return this.nr;
    }

    public C1686z(n accessor, String name, Object obj, qz qzVar) {
        Intrinsics.checkNotNullParameter(accessor, "accessor");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f43868n = accessor;
        this.rl = name;
        this.f43869t = obj;
        this.nr = qzVar;
    }
}
