package F2p;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f2489n;
    private final String rl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.areEqual(this.f2489n, jVar.f2489n) && Intrinsics.areEqual(this.rl, jVar.rl);
    }

    public j(String question, String answer) {
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(answer, "answer");
        this.f2489n = question;
        this.rl = answer;
    }

    public int hashCode() {
        return (this.f2489n.hashCode() * 31) + this.rl.hashCode();
    }

    public final String n() {
        return this.rl;
    }

    public final String rl() {
        return this.f2489n;
    }

    public String toString() {
        return "LocalizedQAItem(question=" + this.f2489n + ", answer=" + this.rl + ")";
    }
}
