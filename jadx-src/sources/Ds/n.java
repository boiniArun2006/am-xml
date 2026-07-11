package Ds;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f1942n;
    private final boolean rl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f1942n == nVar.f1942n && this.rl == nVar.rl;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f1942n) * 31) + Boolean.hashCode(this.rl);
    }

    public String toString() {
        return "LegalNotifications(shouldNotifyTermsOfService=" + this.f1942n + ", shouldNotifyPrivacyPolicy=" + this.rl + ")";
    }

    public n(boolean z2, boolean z3) {
        this.f1942n = z2;
        this.rl = z3;
    }
}
