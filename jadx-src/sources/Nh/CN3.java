package Nh;

import i.C2167j;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class CN3 {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final List f7086O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f7087n;
    private final String nr;
    private final C2167j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final C2167j f7088t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CN3)) {
            return false;
        }
        CN3 cn3 = (CN3) obj;
        return Intrinsics.areEqual(this.f7087n, cn3.f7087n) && Intrinsics.areEqual(this.rl, cn3.rl) && Intrinsics.areEqual(this.f7088t, cn3.f7088t) && Intrinsics.areEqual(this.nr, cn3.nr) && Intrinsics.areEqual(this.f7086O, cn3.f7086O);
    }

    public CN3(String id, C2167j text, C2167j c2167j, String str, List answers) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(answers, "answers");
        this.f7087n = id;
        this.rl = text;
        this.f7088t = c2167j;
        this.nr = str;
        this.f7086O = answers;
    }

    public C2167j O() {
        return this.rl;
    }

    public int hashCode() {
        int iHashCode = ((this.f7087n.hashCode() * 31) + this.rl.hashCode()) * 31;
        C2167j c2167j = this.f7088t;
        int iHashCode2 = (iHashCode + (c2167j == null ? 0 : c2167j.hashCode())) * 31;
        String str = this.nr;
        return ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.f7086O.hashCode();
    }

    public final List n() {
        return this.f7086O;
    }

    public final String nr() {
        return this.nr;
    }

    public final C2167j rl() {
        return this.f7088t;
    }

    public String t() {
        return this.f7087n;
    }

    public String toString() {
        return "SurveyQuestion(id=" + this.f7087n + ", text=" + this.rl + ", description=" + this.f7088t + ", image=" + this.nr + ", answers=" + this.f7086O + ")";
    }
}
