package co4;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class afx extends j {
    private final qz J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Integer f43853O;
    private final int Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final n f43854n;
    private final String nr;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f43855t;

    public /* synthetic */ afx(n nVar, int i2, int i3, String str, Integer num, qz qzVar, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(nVar, i2, i3, (i5 & 8) != 0 ? nVar.getName() : str, (i5 & 16) != 0 ? null : num, (i5 & 32) != 0 ? null : qzVar);
    }

    public final int J2() {
        return this.rl;
    }

    public final int O() {
        return this.f43855t;
    }

    @Override // co4.Pl
    public String getName() {
        return this.nr;
    }

    @Override // co4.Pl
    public n n() {
        return this.f43854n;
    }

    public final int nr() {
        return this.Uo;
    }

    @Override // co4.Pl
    public qz rl() {
        return this.J2;
    }

    @Override // co4.Pl
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public Integer getDefaultValue() {
        return this.f43853O;
    }

    public afx(n accessor, int i2, int i3, String name, Integer num, qz qzVar) {
        int i5;
        Intrinsics.checkNotNullParameter(accessor, "accessor");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f43854n = accessor;
        this.rl = i2;
        this.f43855t = i3;
        this.nr = name;
        this.f43853O = num;
        this.J2 = qzVar;
        if (i3 < 10) {
            i5 = 1;
        } else if (i3 < 100) {
            i5 = 2;
        } else {
            if (i3 >= 1000) {
                throw new IllegalArgumentException("Max value " + i3 + " is too large");
            }
            i5 = 3;
        }
        this.Uo = i5;
    }
}
