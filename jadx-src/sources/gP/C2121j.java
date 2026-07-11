package gP;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: gP.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class C2121j {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final o f67553O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f67554n;
    private final List nr;
    private final EnumC2123w6 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List f67555t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2121j)) {
            return false;
        }
        C2121j c2121j = (C2121j) obj;
        return Intrinsics.areEqual(this.f67554n, c2121j.f67554n) && this.rl == c2121j.rl && Intrinsics.areEqual(this.f67555t, c2121j.f67555t) && Intrinsics.areEqual(this.nr, c2121j.nr) && Intrinsics.areEqual(this.f67553O, c2121j.f67553O);
    }

    public C2121j(String family, EnumC2123w6 category, List subset, List variants, o source) {
        Intrinsics.checkNotNullParameter(family, "family");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(subset, "subset");
        Intrinsics.checkNotNullParameter(variants, "variants");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f67554n = family;
        this.rl = category;
        this.f67555t = subset;
        this.nr = variants;
        this.f67553O = source;
    }

    public final List O() {
        return this.nr;
    }

    public int hashCode() {
        return (((((((this.f67554n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f67555t.hashCode()) * 31) + this.nr.hashCode()) * 31) + this.f67553O.hashCode();
    }

    public final EnumC2123w6 n() {
        return this.rl;
    }

    public final List nr() {
        return this.f67555t;
    }

    public final String rl() {
        return this.f67554n;
    }

    public final o t() {
        return this.f67553O;
    }

    public String toString() {
        return "AMFontInfo(family=" + this.f67554n + ", category=" + this.rl + ", subset=" + this.f67555t + ", variants=" + this.nr + ", source=" + this.f67553O + ")";
    }
}
