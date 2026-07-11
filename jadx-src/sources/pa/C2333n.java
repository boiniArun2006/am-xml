package pa;

import com.google.android.gms.common.internal.Objects;

/* JADX INFO: renamed from: pa.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class C2333n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f72036n;

    public boolean equals(Object obj) {
        if (obj instanceof C2333n) {
            return Objects.equal(this.f72036n, ((C2333n) obj).f72036n);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.f72036n);
    }

    public C2333n(String str) {
        this.f72036n = str;
    }

    public String toString() {
        return Objects.toStringHelper(this).add("token", this.f72036n).toString();
    }
}
