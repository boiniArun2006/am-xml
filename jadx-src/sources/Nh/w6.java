package Nh;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class w6 implements n {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final List f7098O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f7099n;
    private final int nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f7100t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6)) {
            return false;
        }
        w6 w6Var = (w6) obj;
        return Intrinsics.areEqual(this.f7099n, w6Var.f7099n) && Intrinsics.areEqual(this.rl, w6Var.rl) && Intrinsics.areEqual(this.f7100t, w6Var.f7100t) && this.nr == w6Var.nr && Intrinsics.areEqual(this.f7098O, w6Var.f7098O);
    }

    public w6(String id, String text, String str, int i2, List answers) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(answers, "answers");
        this.f7099n = id;
        this.rl = text;
        this.f7100t = str;
        this.nr = i2;
        this.f7098O = answers;
    }

    @Override // Nh.n
    public String getId() {
        return this.f7099n;
    }

    public int hashCode() {
        int iHashCode = ((this.f7099n.hashCode() * 31) + this.rl.hashCode()) * 31;
        String str = this.f7100t;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.nr)) * 31) + this.f7098O.hashCode();
    }

    @Override // Nh.n
    public String n() {
        return this.rl;
    }

    public final int nr() {
        return this.nr;
    }

    public final List rl() {
        return this.f7098O;
    }

    public final String t() {
        return this.f7100t;
    }

    public String toString() {
        return "LocalizedSurveyQuestion(id=" + this.f7099n + ", text=" + this.rl + ", description=" + this.f7100t + ", imageResId=" + this.nr + ", answers=" + this.f7098O + ")";
    }
}
