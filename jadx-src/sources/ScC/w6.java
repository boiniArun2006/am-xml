package ScC;

import android.app.Activity;
import fb.AbstractC2109j;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import pq.Ml;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public interface w6 {
    public static final j rl = j.rl;

    public static final class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f9800n;
        private final String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Ml f9801t;

        public n(String location, String str, Ml additionalInfo) {
            Intrinsics.checkNotNullParameter(location, "location");
            Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
            this.f9800n = location;
            this.rl = str;
            this.f9801t = additionalInfo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return Intrinsics.areEqual(this.f9800n, nVar.f9800n) && Intrinsics.areEqual(this.rl, nVar.rl) && Intrinsics.areEqual(this.f9801t, nVar.f9801t);
        }

        public int hashCode() {
            int iHashCode = this.f9800n.hashCode() * 31;
            String str = this.rl;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f9801t.hashCode();
        }

        public final Ml n() {
            return this.f9801t;
        }

        public final String rl() {
            return this.rl;
        }

        public final String t() {
            return this.f9800n;
        }

        public String toString() {
            return "MetricsInfo(location=" + this.f9800n + ", contentToUnlock=" + this.rl + ", additionalInfo=" + this.f9801t + ")";
        }

        public /* synthetic */ n(String str, String str2, Ml ml, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? new Ml() : ml);
        }
    }

    Object nr(String str, n nVar, Continuation continuation);

    Object rl(Activity activity, String str, boolean z2, n nVar, Continuation continuation);

    public static final class j extends AbstractC2109j {
        static final /* synthetic */ j rl = new j();

        private j() {
        }
    }
}
