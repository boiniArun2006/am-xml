package yUp;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f75678n;
    private final String rl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.areEqual(this.f75678n, jVar.f75678n) && Intrinsics.areEqual(this.rl, jVar.rl);
    }

    public j(String question, String answer) {
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(answer, "answer");
        this.f75678n = question;
        this.rl = answer;
    }

    public int hashCode() {
        return (this.f75678n.hashCode() * 31) + this.rl.hashCode();
    }

    public final String n() {
        return this.rl;
    }

    public final String rl() {
        return this.f75678n;
    }

    public String toString() {
        return "QAItemUiModel(question=" + this.f75678n + ", answer=" + this.rl + ")";
    }
}
