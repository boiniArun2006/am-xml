package Hr;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import qcD.nehv.Apsps;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public interface Dsr extends Cp.j {

    public interface j {
        o read(ByteBuffer byteBuffer);
    }

    public static abstract class n {

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
        public static final class Ml extends n {
            private final List J2;
            private final int KN;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            private final String f3951O;
            private final int Uo;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final int f3952n;
            private final MediaFormat nr;
            private final String rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private final Integer f3953t;
            private final Integer xMQ;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Ml)) {
                    return false;
                }
                Ml ml = (Ml) obj;
                return this.f3952n == ml.f3952n && Intrinsics.areEqual(this.rl, ml.rl) && Intrinsics.areEqual(this.f3953t, ml.f3953t) && Intrinsics.areEqual(this.nr, ml.nr) && Intrinsics.areEqual(this.f3951O, ml.f3951O) && Intrinsics.areEqual(this.J2, ml.J2) && this.Uo == ml.Uo && this.KN == ml.KN && Intrinsics.areEqual(this.xMQ, ml.xMQ);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Ml(int i2, String str, Integer num, MediaFormat mediaFormat, String str2, List alternateDecoders, int i3, int i5, Integer num2) {
                super(null);
                Intrinsics.checkNotNullParameter(str, Apsps.PjAwY);
                Intrinsics.checkNotNullParameter(mediaFormat, "mediaFormat");
                Intrinsics.checkNotNullParameter(alternateDecoders, "alternateDecoders");
                this.f3952n = i2;
                this.rl = str;
                this.f3953t = num;
                this.nr = mediaFormat;
                this.f3951O = str2;
                this.J2 = alternateDecoders;
                this.Uo = i3;
                this.KN = i5;
                this.xMQ = num2;
            }

            public MediaFormat J2() {
                return this.nr;
            }

            public Integer O() {
                return this.f3953t;
            }

            public final int Uo() {
                return this.Uo;
            }

            public int hashCode() {
                int iHashCode = ((Integer.hashCode(this.f3952n) * 31) + this.rl.hashCode()) * 31;
                Integer num = this.f3953t;
                int iHashCode2 = (((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.nr.hashCode()) * 31;
                String str = this.f3951O;
                int iHashCode3 = (((((((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.J2.hashCode()) * 31) + Integer.hashCode(this.Uo)) * 31) + Integer.hashCode(this.KN)) * 31;
                Integer num2 = this.xMQ;
                return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
            }

            @Override // Hr.Dsr.n
            public int n() {
                return this.f3952n;
            }

            public final int nr() {
                return this.KN;
            }

            @Override // Hr.Dsr.n
            public String rl() {
                return this.rl;
            }

            public final String t() {
                return this.f3951O;
            }

            public String toString() {
                return "Video(index=" + this.f3952n + ", mime=" + this.rl + ", maxInputSize=" + this.f3953t + ", mediaFormat=" + this.nr + ", decoderName=" + this.f3951O + ", alternateDecoders=" + this.J2 + ", width=" + this.Uo + ", height=" + this.KN + ", colorFormat=" + this.xMQ + ")";
            }
        }

        public static final class j extends n {
            private final int J2;
            private final int KN;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            private final String f3954O;
            private final int Uo;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final int f3955n;
            private final MediaFormat nr;
            private final String rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private final Integer f3956t;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof j)) {
                    return false;
                }
                j jVar = (j) obj;
                return this.f3955n == jVar.f3955n && Intrinsics.areEqual(this.rl, jVar.rl) && Intrinsics.areEqual(this.f3956t, jVar.f3956t) && Intrinsics.areEqual(this.nr, jVar.nr) && Intrinsics.areEqual(this.f3954O, jVar.f3954O) && this.J2 == jVar.J2 && this.Uo == jVar.Uo && this.KN == jVar.KN;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public j(int i2, String mime, Integer num, MediaFormat mediaFormat, String str, int i3, int i5, int i7) {
                super(null);
                Intrinsics.checkNotNullParameter(mime, "mime");
                Intrinsics.checkNotNullParameter(mediaFormat, "mediaFormat");
                this.f3955n = i2;
                this.rl = mime;
                this.f3956t = num;
                this.nr = mediaFormat;
                this.f3954O = str;
                this.J2 = i3;
                this.Uo = i5;
                this.KN = i7;
            }

            public MediaFormat J2() {
                return this.nr;
            }

            public final int KN() {
                return this.J2;
            }

            public Integer O() {
                return this.f3956t;
            }

            public final int Uo() {
                return this.KN;
            }

            public int hashCode() {
                int iHashCode = ((Integer.hashCode(this.f3955n) * 31) + this.rl.hashCode()) * 31;
                Integer num = this.f3956t;
                int iHashCode2 = (((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.nr.hashCode()) * 31;
                String str = this.f3954O;
                return ((((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + Integer.hashCode(this.J2)) * 31) + Integer.hashCode(this.Uo)) * 31) + Integer.hashCode(this.KN);
            }

            @Override // Hr.Dsr.n
            public int n() {
                return this.f3955n;
            }

            public final String nr() {
                return this.f3954O;
            }

            @Override // Hr.Dsr.n
            public String rl() {
                return this.rl;
            }

            public final int t() {
                return this.Uo;
            }

            public String toString() {
                return "Audio(index=" + this.f3955n + ", mime=" + this.rl + ", maxInputSize=" + this.f3956t + ", mediaFormat=" + this.nr + ", decoderName=" + this.f3954O + ", sampleRate=" + this.J2 + ", channelCount=" + this.Uo + ", pcmEncoding=" + this.KN + ")";
            }
        }

        /* JADX INFO: renamed from: Hr.Dsr$n$n, reason: collision with other inner class name */
        public static final class C0138n extends n {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            private final String f3957O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final int f3958n;
            private final MediaFormat nr;
            private final String rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private final Integer f3959t;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0138n)) {
                    return false;
                }
                C0138n c0138n = (C0138n) obj;
                return this.f3958n == c0138n.f3958n && Intrinsics.areEqual(this.rl, c0138n.rl) && Intrinsics.areEqual(this.f3959t, c0138n.f3959t) && Intrinsics.areEqual(this.nr, c0138n.nr) && Intrinsics.areEqual(this.f3957O, c0138n.f3957O);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0138n(int i2, String mime, Integer num, MediaFormat mediaFormat, String language) {
                super(null);
                Intrinsics.checkNotNullParameter(mime, "mime");
                Intrinsics.checkNotNullParameter(mediaFormat, "mediaFormat");
                Intrinsics.checkNotNullParameter(language, "language");
                this.f3958n = i2;
                this.rl = mime;
                this.f3959t = num;
                this.nr = mediaFormat;
                this.f3957O = language;
            }

            public int hashCode() {
                int iHashCode = ((Integer.hashCode(this.f3958n) * 31) + this.rl.hashCode()) * 31;
                Integer num = this.f3959t;
                return ((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.nr.hashCode()) * 31) + this.f3957O.hashCode();
            }

            @Override // Hr.Dsr.n
            public int n() {
                return this.f3958n;
            }

            @Override // Hr.Dsr.n
            public String rl() {
                return this.rl;
            }

            public String toString() {
                return "Subtitle(index=" + this.f3958n + ", mime=" + this.rl + ", maxInputSize=" + this.f3959t + ", mediaFormat=" + this.nr + ", language=" + this.f3957O + ")";
            }
        }

        public static final class w6 extends n {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final int f3960n;
            private final MediaFormat nr;
            private final String rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private final Integer f3961t;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof w6)) {
                    return false;
                }
                w6 w6Var = (w6) obj;
                return this.f3960n == w6Var.f3960n && Intrinsics.areEqual(this.rl, w6Var.rl) && Intrinsics.areEqual(this.f3961t, w6Var.f3961t) && Intrinsics.areEqual(this.nr, w6Var.nr);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public w6(int i2, String mime, Integer num, MediaFormat mediaFormat) {
                super(null);
                Intrinsics.checkNotNullParameter(mime, "mime");
                Intrinsics.checkNotNullParameter(mediaFormat, "mediaFormat");
                this.f3960n = i2;
                this.rl = mime;
                this.f3961t = num;
                this.nr = mediaFormat;
            }

            public int hashCode() {
                int iHashCode = ((Integer.hashCode(this.f3960n) * 31) + this.rl.hashCode()) * 31;
                Integer num = this.f3961t;
                return ((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.nr.hashCode();
            }

            @Override // Hr.Dsr.n
            public int n() {
                return this.f3960n;
            }

            @Override // Hr.Dsr.n
            public String rl() {
                return this.rl;
            }

            public String toString() {
                return "Unknown(index=" + this.f3960n + ", mime=" + this.rl + ", maxInputSize=" + this.f3961t + ", mediaFormat=" + this.nr + ")";
            }
        }

        public /* synthetic */ n(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract int n();

        public abstract String rl();

        private n() {
        }
    }

    j Ik(n nVar, int i2);

    List nHg();

    long te(long j2);
}
