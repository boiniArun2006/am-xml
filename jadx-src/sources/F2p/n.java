package F2p;

import i.C2167j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final C2167j f2490n;
    private final C2167j rl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.areEqual(this.f2490n, nVar.f2490n) && Intrinsics.areEqual(this.rl, nVar.rl);
    }

    public n(C2167j question, C2167j answer) {
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(answer, "answer");
        this.f2490n = question;
        this.rl = answer;
    }

    public int hashCode() {
        return (this.f2490n.hashCode() * 31) + this.rl.hashCode();
    }

    public final C2167j n() {
        return this.rl;
    }

    public final C2167j rl() {
        return this.f2490n;
    }

    public String toString() {
        return "QAItem(question=" + this.f2490n + ", answer=" + this.rl + ")";
    }
}
