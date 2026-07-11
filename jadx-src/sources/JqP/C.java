package JqP;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class C {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f4686n;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C) && this.f4686n == ((C) obj).f4686n;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f4686n);
    }

    public final boolean n() {
        return this.f4686n;
    }

    public String toString() {
        return "OnboardingViewModelState(isSkipButtonVisible=" + this.f4686n + ")";
    }

    public C(boolean z2) {
        this.f4686n = z2;
    }
}
