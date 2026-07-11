package ScC;

import android.app.Activity;
import fb.AbstractC2109j;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import pq.Ml;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public interface n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f9798n = j.rl;

    /* JADX INFO: renamed from: ScC.n$n, reason: collision with other inner class name */
    public static final class C0320n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f9799n;
        private final Ml rl;

        public C0320n(String location, Ml additionalInfo) {
            Intrinsics.checkNotNullParameter(location, "location");
            Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
            this.f9799n = location;
            this.rl = additionalInfo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0320n)) {
                return false;
            }
            C0320n c0320n = (C0320n) obj;
            return Intrinsics.areEqual(this.f9799n, c0320n.f9799n) && Intrinsics.areEqual(this.rl, c0320n.rl);
        }

        public int hashCode() {
            return (this.f9799n.hashCode() * 31) + this.rl.hashCode();
        }

        public final Ml n() {
            return this.rl;
        }

        public final String rl() {
            return this.f9799n;
        }

        public String toString() {
            return "MetricsInfo(location=" + this.f9799n + ", additionalInfo=" + this.rl + ")";
        }

        public /* synthetic */ C0320n(String str, Ml ml, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i2 & 2) != 0 ? new Ml() : ml);
        }
    }

    Object n(Activity activity, String str, C0320n c0320n, Continuation continuation);

    Object t(String str, C0320n c0320n, Continuation continuation);

    public static final class j extends AbstractC2109j {
        static final /* synthetic */ j rl = new j();

        private j() {
        }
    }
}
