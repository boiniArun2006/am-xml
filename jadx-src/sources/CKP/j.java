package CKP;

import java.util.Currency;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f879n;
    private final double rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Currency f880t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.areEqual(this.f879n, jVar.f879n) && Double.compare(this.rl, jVar.rl) == 0 && Intrinsics.areEqual(this.f880t, jVar.f880t);
    }

    public j(String eventName, double d2, Currency currency) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f879n = eventName;
        this.rl = d2;
        this.f880t = currency;
    }

    public int hashCode() {
        return (((this.f879n.hashCode() * 31) + Double.hashCode(this.rl)) * 31) + this.f880t.hashCode();
    }

    public final double n() {
        return this.rl;
    }

    public final Currency rl() {
        return this.f880t;
    }

    public final String t() {
        return this.f879n;
    }

    public String toString() {
        return "InAppPurchase(eventName=" + this.f879n + ", amount=" + this.rl + ", currency=" + this.f880t + ')';
    }
}
