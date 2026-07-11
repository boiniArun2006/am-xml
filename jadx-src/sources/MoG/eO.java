package MoG;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class eO {

    public static final class j extends eO {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f6761n;
        private final int nr;
        private final String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final int f6762t;

        public /* synthetic */ j(String str, String str2, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, i2, i3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return Intrinsics.areEqual(this.f6761n, jVar.f6761n) && Intrinsics.areEqual(this.rl, jVar.rl) && as.eO.Uo(this.f6762t, jVar.f6762t) && as.qz.nr(this.nr, jVar.nr);
        }

        private j(String str, String str2, int i2, int i3) {
            super(null);
            this.f6761n = str;
            this.rl = str2;
            this.f6762t = i2;
            this.nr = i3;
        }

        public int hashCode() {
            int iHashCode = this.f6761n.hashCode() * 31;
            String str = this.rl;
            return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + as.eO.KN(this.f6762t)) * 31) + as.qz.O(this.nr);
        }

        public final int n() {
            return this.nr;
        }

        public final int nr() {
            return this.f6762t;
        }

        public final String rl() {
            return this.rl;
        }

        public final String t() {
            return this.f6761n;
        }

        public String toString() {
            return "Audio(sampleMimeType=" + this.f6761n + ", containerMimeType=" + this.rl + ", sampleRate=" + ((Object) as.eO.xMQ(this.f6762t)) + ", channelCount=" + ((Object) as.qz.J2(this.nr)) + ')';
        }
    }

    public static final class n extends eO {
        private final Float J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final Integer f6763O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f6764n;
        private final Integer nr;
        private final String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Oe.j f6765t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return Intrinsics.areEqual(this.f6764n, nVar.f6764n) && Intrinsics.areEqual(this.rl, nVar.rl) && Intrinsics.areEqual(this.f6765t, nVar.f6765t) && Intrinsics.areEqual(this.nr, nVar.nr) && Intrinsics.areEqual(this.f6763O, nVar.f6763O) && Intrinsics.areEqual((Object) this.J2, (Object) nVar.J2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String sampleMimeType, String str, Oe.j dimensions, Integer num, Integer num2, Float f3) {
            super(null);
            Intrinsics.checkNotNullParameter(sampleMimeType, "sampleMimeType");
            Intrinsics.checkNotNullParameter(dimensions, "dimensions");
            this.f6764n = sampleMimeType;
            this.rl = str;
            this.f6765t = dimensions;
            this.nr = num;
            this.f6763O = num2;
            this.J2 = f3;
        }

        public final String J2() {
            return this.f6764n;
        }

        public final Integer O() {
            return this.nr;
        }

        public int hashCode() {
            int iHashCode = this.f6764n.hashCode() * 31;
            String str = this.rl;
            int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f6765t.hashCode()) * 31;
            Integer num = this.nr;
            int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f6763O;
            int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Float f3 = this.J2;
            return iHashCode4 + (f3 != null ? f3.hashCode() : 0);
        }

        public final String n() {
            return this.rl;
        }

        public final Integer nr() {
            return this.f6763O;
        }

        public final Oe.j rl() {
            return this.f6765t;
        }

        public final Float t() {
            return this.J2;
        }

        public String toString() {
            return "Video(sampleMimeType=" + this.f6764n + ", containerMimeType=" + this.rl + ", dimensions=" + this.f6765t + ", profile=" + this.nr + ", level=" + this.f6763O + ", frameRate=" + this.J2 + ')';
        }
    }

    public /* synthetic */ eO(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private eO() {
    }
}
