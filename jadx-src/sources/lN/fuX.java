package lN;

import Hh.C;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class fuX implements Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final String f70416n;
    final boolean rl;

    public fuX(String str) {
        this(str, false);
    }

    public fuX(String str, boolean z2) {
        this.f70416n = (String) C.Uo(str);
        this.rl = z2;
    }

    @Override // lN.Ml
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fuX) {
            return this.f70416n.equals(((fuX) obj).f70416n);
        }
        return false;
    }

    @Override // lN.Ml
    public int hashCode() {
        return this.f70416n.hashCode();
    }

    @Override // lN.Ml
    public String n() {
        return this.f70416n;
    }

    @Override // lN.Ml
    public boolean rl() {
        return this.rl;
    }

    public String toString() {
        return this.f70416n;
    }
}
