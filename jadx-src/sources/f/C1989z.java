package f;

import com.google.firebase.installations.ktx.Bq.YjqZUJsVmhcjko;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: f.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class C1989z implements sqD.I28 {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final JSONObject f64046O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f64047n;
    private final JSONArray nr;
    private final boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final JSONArray f64048t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1989z)) {
            return false;
        }
        C1989z c1989z = (C1989z) obj;
        return this.f64047n == c1989z.f64047n && this.rl == c1989z.rl && Intrinsics.areEqual(this.f64048t, c1989z.f64048t) && Intrinsics.areEqual(this.nr, c1989z.nr) && Intrinsics.areEqual(this.f64046O, c1989z.f64046O);
    }

    public C1989z(boolean z2, boolean z3, JSONArray elements, JSONArray buttons, JSONObject localization) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        Intrinsics.checkNotNullParameter(localization, "localization");
        this.f64047n = z2;
        this.rl = z3;
        this.f64048t = elements;
        this.nr = buttons;
        this.f64046O = localization;
    }

    public final boolean J2() {
        return this.rl;
    }

    public final boolean O() {
        return this.f64047n;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.f64047n) * 31) + Boolean.hashCode(this.rl)) * 31) + this.f64048t.hashCode()) * 31) + this.nr.hashCode()) * 31) + this.f64046O.hashCode();
    }

    public final JSONObject nr() {
        return this.f64046O;
    }

    public final JSONArray rl() {
        return this.nr;
    }

    public final JSONArray t() {
        return this.f64048t;
    }

    public String toString() {
        return YjqZUJsVmhcjko.ARYbXpxBqwtGiT + this.f64047n + ", isDismissibleWithBackButton=" + this.rl + ", elements=" + this.f64048t + ", buttons=" + this.nr + ", localization=" + this.f64046O + ")";
    }
}
