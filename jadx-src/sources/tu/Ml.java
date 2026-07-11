package tu;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class Ml {
    private final Integer J2;
    private final long KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final int f73888O;
    private final j Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f73889n;
    private final String nr;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f73890t;
    private final String xMQ;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class j {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f73893o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final /* synthetic */ j[] f73894r;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f73892n = new j("PCM_16_BIT", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final j f73895t = new j("PCM_8_BIT", 1);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final j f73891O = new j("PCM_FLOAT", 2);
        public static final j J2 = new j("UNKNOWN", 3);

        static {
            j[] jVarArrN = n();
            f73894r = jVarArrN;
            f73893o = EnumEntriesKt.enumEntries(jVarArrN);
        }

        private static final /* synthetic */ j[] n() {
            return new j[]{f73892n, f73895t, f73891O, J2};
        }

        public static j valueOf(String str) {
            return (j) Enum.valueOf(j.class, str);
        }

        public static j[] values() {
            return (j[]) f73894r.clone();
        }

        private j(String str, int i2) {
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ml)) {
            return false;
        }
        Ml ml = (Ml) obj;
        return this.f73889n == ml.f73889n && this.rl == ml.rl && Intrinsics.areEqual(this.f73890t, ml.f73890t) && Intrinsics.areEqual(this.nr, ml.nr) && this.f73888O == ml.f73888O && Intrinsics.areEqual(this.J2, ml.J2) && this.Uo == ml.Uo && this.KN == ml.KN && Intrinsics.areEqual(this.xMQ, ml.xMQ);
    }

    public Ml(boolean z2, int i2, String decoderName, String mimeType, int i3, Integer num, j pcmEncoding, long j2, String str) {
        Intrinsics.checkNotNullParameter(decoderName, "decoderName");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Intrinsics.checkNotNullParameter(pcmEncoding, "pcmEncoding");
        this.f73889n = z2;
        this.rl = i2;
        this.f73890t = decoderName;
        this.nr = mimeType;
        this.f73888O = i3;
        this.J2 = num;
        this.Uo = pcmEncoding;
        this.KN = j2;
        this.xMQ = str;
    }

    public static /* synthetic */ Ml rl(Ml ml, boolean z2, int i2, String str, String str2, int i3, Integer num, j jVar, long j2, String str3, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z2 = ml.f73889n;
        }
        if ((i5 & 2) != 0) {
            i2 = ml.rl;
        }
        if ((i5 & 4) != 0) {
            str = ml.f73890t;
        }
        if ((i5 & 8) != 0) {
            str2 = ml.nr;
        }
        if ((i5 & 16) != 0) {
            i3 = ml.f73888O;
        }
        if ((i5 & 32) != 0) {
            num = ml.J2;
        }
        if ((i5 & 64) != 0) {
            jVar = ml.Uo;
        }
        if ((i5 & 128) != 0) {
            j2 = ml.KN;
        }
        if ((i5 & 256) != 0) {
            str3 = ml.xMQ;
        }
        String str4 = str3;
        long j3 = j2;
        Integer num2 = num;
        j jVar2 = jVar;
        int i7 = i3;
        String str5 = str;
        return ml.n(z2, i2, str5, str2, i7, num2, jVar2, j3, str4);
    }

    public final int J2() {
        return this.rl;
    }

    public final String O() {
        return this.nr;
    }

    public final boolean Uo() {
        return this.f73889n;
    }

    public int hashCode() {
        int iHashCode = ((((((((Boolean.hashCode(this.f73889n) * 31) + Integer.hashCode(this.rl)) * 31) + this.f73890t.hashCode()) * 31) + this.nr.hashCode()) * 31) + Integer.hashCode(this.f73888O)) * 31;
        Integer num = this.J2;
        int iHashCode2 = (((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.Uo.hashCode()) * 31) + Long.hashCode(this.KN)) * 31;
        String str = this.xMQ;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final Ml n(boolean z2, int i2, String decoderName, String mimeType, int i3, Integer num, j pcmEncoding, long j2, String str) {
        Intrinsics.checkNotNullParameter(decoderName, "decoderName");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Intrinsics.checkNotNullParameter(pcmEncoding, "pcmEncoding");
        return new Ml(z2, i2, decoderName, mimeType, i3, num, pcmEncoding, j2, str);
    }

    public final long nr() {
        return this.KN;
    }

    public final String t() {
        return this.xMQ;
    }

    public String toString() {
        return "AudioInfo(supported=" + this.f73889n + ", sampleRate=" + this.rl + ", decoderName=" + this.f73890t + ", mimeType=" + this.nr + ", channelCount=" + this.f73888O + ", maxInputBufferSize=" + this.J2 + ", pcmEncoding=" + this.Uo + ", duration=" + this.KN + ", containerFormat=" + this.xMQ + ")";
    }
}
