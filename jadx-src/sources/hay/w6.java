package hay;

import android.content.Context;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class w6 extends fuX {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f67975n;
    private final String nr;
    private final MR.j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final MR.j f67976t;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fuX) {
            fuX fux = (fuX) obj;
            if (this.f67975n.equals(fux.rl()) && this.rl.equals(fux.O()) && this.f67976t.equals(fux.nr()) && this.nr.equals(fux.t())) {
                return true;
            }
        }
        return false;
    }

    @Override // hay.fuX
    public MR.j O() {
        return this.rl;
    }

    public int hashCode() {
        return ((((((this.f67975n.hashCode() ^ 1000003) * 1000003) ^ this.rl.hashCode()) * 1000003) ^ this.f67976t.hashCode()) * 1000003) ^ this.nr.hashCode();
    }

    @Override // hay.fuX
    public MR.j nr() {
        return this.f67976t;
    }

    @Override // hay.fuX
    public Context rl() {
        return this.f67975n;
    }

    @Override // hay.fuX
    public String t() {
        return this.nr;
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f67975n + ", wallClock=" + this.rl + ", monotonicClock=" + this.f67976t + ", backendName=" + this.nr + "}";
    }

    w6(Context context, MR.j jVar, MR.j jVar2, String str) {
        if (context != null) {
            this.f67975n = context;
            if (jVar != null) {
                this.rl = jVar;
                if (jVar2 != null) {
                    this.f67976t = jVar2;
                    if (str != null) {
                        this.nr = str;
                        return;
                    }
                    throw new NullPointerException("Null backendName");
                }
                throw new NullPointerException("Null monotonicClock");
            }
            throw new NullPointerException("Null wallClock");
        }
        throw new NullPointerException("Null applicationContext");
    }
}
