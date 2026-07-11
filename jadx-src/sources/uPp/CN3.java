package uPp;

import android.util.Pair;
import as.eO;
import as.qz;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class CN3 {

    public static final class j extends CN3 {
        public static final C1225j Uo = new C1225j(null);
        private final as.CN3 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final Integer f74404O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f74405n;
        private final String nr;
        private final Format rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final String f74406t;

        /* JADX INFO: renamed from: uPp.CN3$j$j, reason: collision with other inner class name */
        public static final class C1225j {
            public /* synthetic */ C1225j(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C1225j() {
            }

            public final j n(Format format, int i2) {
                Intrinsics.checkNotNullParameter(format, "format");
                String str = format.sampleMimeType;
                if (str == null || !fuX.t(str) || format.channelCount <= 0 || format.sampleRate <= 0) {
                    return null;
                }
                int i3 = format.bitrate;
                if (i3 == -1 || i3 >= 0) {
                    return new j(i2, format);
                }
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return O() == jVar.O() && Intrinsics.areEqual(nr(), jVar.nr());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(int i2, Format format) {
            super(null);
            Intrinsics.checkNotNullParameter(format, "format");
            this.f74405n = i2;
            this.rl = format;
            String str = nr().sampleMimeType;
            if (str == null) {
                throw new IllegalArgumentException("Mime type cannot be null");
            }
            this.f74406t = str;
            this.nr = nr().containerMimeType;
            Integer numValueOf = Integer.valueOf(nr().bitrate);
            this.f74404O = numValueOf.intValue() == -1 ? null : numValueOf;
            this.J2 = new as.CN3(qz.rl(nr().channelCount), eO.nr(nr().sampleRate), null);
            if (!fuX.t(J2())) {
                throw new IllegalArgumentException(("Invalid audio mime: " + J2()).toString());
            }
            if (n() == null || n().intValue() > 0) {
                return;
            }
            throw new IllegalArgumentException(("Expected null or positive bitrate, found: " + n()).toString());
        }

        public String J2() {
            return this.f74406t;
        }

        public int O() {
            return this.f74405n;
        }

        public final int Uo() {
            return this.J2.t();
        }

        public Integer n() {
            return this.f74404O;
        }

        public Format nr() {
            return this.rl;
        }

        public final int rl() {
            return this.J2.rl();
        }

        public String t() {
            return this.nr;
        }

        public String toString() {
            return "Audio[id=" + O() + ", format=" + Wre.n(nr()) + ']';
        }

        public int hashCode() {
            return (Integer.hashCode(O()) * 31) + nr().hashCode();
        }
    }

    public static final class n extends CN3 {
        private final Integer J2;
        private final int KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final Integer f74407O;
        private final Integer Uo;
        private final int gh;
        private final Float mUb;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f74408n;
        private final String nr;
        private final Format rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final String f74409t;
        private final int xMQ;
        public static final j qie = new j(null);
        private static final List az = CollectionsKt.listOf((Object[]) new Integer[]{0, 90, 180, 270});

        public static final class j {
            public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private j() {
            }

            public final n n(Format format, int i2) {
                Intrinsics.checkNotNullParameter(format, "format");
                String str = format.sampleMimeType;
                if (str == null || !fuX.nr(str) || format.width <= 0 || format.height <= 0 || !n.az.contains(Integer.valueOf(format.rotationDegrees))) {
                    return null;
                }
                int i3 = format.bitrate;
                if (i3 == -1 || i3 >= 0) {
                    return new n(i2, format);
                }
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return Uo() == nVar.Uo() && Intrinsics.areEqual(nr(), nVar.nr());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public n(int i2, Format format) {
            super(0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(format, "format");
            this.f74408n = i2;
            this.rl = format;
            String str = nr().sampleMimeType;
            if (str == null) {
                throw new IllegalArgumentException("Mime type cannot be null");
            }
            this.f74409t = str;
            this.nr = nr().containerMimeType;
            Integer numValueOf = Integer.valueOf(nr().bitrate);
            this.f74407O = numValueOf.intValue() == -1 ? null : numValueOf;
            int i3 = nr().width;
            this.KN = i3;
            int i5 = nr().height;
            this.xMQ = i5;
            Float fValueOf = Float.valueOf(nr().frameRate);
            fValueOf = ((int) fValueOf.floatValue()) == -1 ? null : fValueOf;
            this.mUb = fValueOf;
            int i7 = nr().rotationDegrees;
            this.gh = i7;
            if (!fuX.nr(xMQ())) {
                throw new IllegalArgumentException(("Invalid video mime: " + xMQ()).toString());
            }
            if (fValueOf != null) {
                LRC.n.rl(fValueOf.floatValue(), "frame rate");
            }
            if (rl() != null && rl().intValue() <= 0) {
                throw new IllegalArgumentException(("Expected null or positive bitrate, found: " + rl()).toString());
            }
            if (i3 <= 0 || i5 <= 0) {
                throw new IllegalArgumentException(("Expected positive video dimensions, found: (" + i3 + ", " + i5 + ')').toString());
            }
            if (az.contains(Integer.valueOf(i7))) {
                Pair<Integer, Integer> codecProfileAndLevel = MediaCodecUtil.getCodecProfileAndLevel(nr());
                this.J2 = codecProfileAndLevel != null ? (Integer) codecProfileAndLevel.first : null;
                this.Uo = codecProfileAndLevel != null ? (Integer) codecProfileAndLevel.second : null;
            } else {
                throw new IllegalArgumentException(("Expected rotation to be either  0, 90, 180 or 270, found: " + i7 + ' ').toString());
            }
        }

        public final int J2() {
            return this.xMQ;
        }

        public final Integer KN() {
            return this.Uo;
        }

        public final Float O() {
            return this.mUb;
        }

        public int Uo() {
            return this.f74408n;
        }

        public final int gh() {
            return this.gh;
        }

        public final Integer mUb() {
            return this.J2;
        }

        public Format nr() {
            return this.rl;
        }

        public final int qie() {
            return this.KN;
        }

        public Integer rl() {
            return this.f74407O;
        }

        public String t() {
            return this.nr;
        }

        public String toString() {
            return "Video[id=" + Uo() + ", format=" + Wre.n(nr()) + ']';
        }

        public String xMQ() {
            return this.f74409t;
        }

        public int hashCode() {
            return (Integer.hashCode(Uo()) * 31) + nr().hashCode();
        }
    }

    public /* synthetic */ CN3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CN3() {
    }
}
