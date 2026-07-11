package xhQ;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public interface UGc {

    public static final class j implements UGc {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final int f75437O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final List f75438n;
        private final int nr;
        private final boolean rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final int f75439t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return Intrinsics.areEqual(this.f75438n, jVar.f75438n) && this.rl == jVar.rl && this.f75439t == jVar.f75439t && this.nr == jVar.nr && this.f75437O == jVar.f75437O;
        }

        public j(List items, boolean z2, int i2, int i3, int i5) {
            Intrinsics.checkNotNullParameter(items, "items");
            this.f75438n = items;
            this.rl = z2;
            this.f75439t = i2;
            this.nr = i3;
            this.f75437O = i5;
        }

        public final boolean O() {
            return this.rl;
        }

        public int hashCode() {
            return (((((((this.f75438n.hashCode() * 31) + Boolean.hashCode(this.rl)) * 31) + Integer.hashCode(this.f75439t)) * 31) + Integer.hashCode(this.nr)) * 31) + Integer.hashCode(this.f75437O);
        }

        public final List n() {
            return this.f75438n;
        }

        public final int nr() {
            return this.f75437O;
        }

        public final int rl() {
            return this.f75439t;
        }

        public final int t() {
            return this.nr;
        }

        public String toString() {
            return "Content(items=" + this.f75438n + ", isFreeTrialButtonVisible=" + this.rl + ", numAdsToWatch=" + this.f75439t + ", numAdsWatched=" + this.nr + ", progress=" + this.f75437O + ")";
        }
    }
}
