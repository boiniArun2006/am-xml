package KQ;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class Pl {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f5318n;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f5319t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pl)) {
            return false;
        }
        Pl pl = (Pl) obj;
        return Intrinsics.areEqual(this.f5318n, pl.f5318n) && Intrinsics.areEqual(this.rl, pl.rl) && this.f5319t == pl.f5319t;
    }

    public Pl(String id, String text, boolean z2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f5318n = id;
        this.rl = text;
        this.f5319t = z2;
    }

    public int hashCode() {
        return (((this.f5318n.hashCode() * 31) + this.rl.hashCode()) * 31) + Boolean.hashCode(this.f5319t);
    }

    public final String n() {
        return this.f5318n;
    }

    public final String rl() {
        return this.rl;
    }

    public final boolean t() {
        return this.f5319t;
    }

    public String toString() {
        return "SurveyAnswerUIModel(id=" + this.f5318n + ", text=" + this.rl + ", isOpenField=" + this.f5319t + ")";
    }
}
