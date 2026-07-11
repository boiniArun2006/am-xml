package ICC;

import android.net.Uri;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class C {
    private final long J2;
    private final boolean KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final long f4079O;
    private final long Uo;
    private final int gh;
    private final Function1 mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f4080n;
    private final long nr;
    private final j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Uri f4081t;
    private final float xMQ;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class j {
        private static final /* synthetic */ EnumEntries J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private static final /* synthetic */ j[] f4082O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f4083n = new j("Audio", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final j f4084t = new j("Video", 1);

        static {
            j[] jVarArrN = n();
            f4082O = jVarArrN;
            J2 = EnumEntriesKt.enumEntries(jVarArrN);
        }

        private static final /* synthetic */ j[] n() {
            return new j[]{f4083n, f4084t};
        }

        public static j valueOf(String str) {
            return (j) Enum.valueOf(j.class, str);
        }

        public static j[] values() {
            return (j[]) f4082O.clone();
        }

        private j(String str, int i2) {
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c2 = (C) obj;
        return this.f4080n == c2.f4080n && this.rl == c2.rl && Intrinsics.areEqual(this.f4081t, c2.f4081t) && this.nr == c2.nr && this.f4079O == c2.f4079O && this.J2 == c2.J2 && this.Uo == c2.Uo && this.KN == c2.KN && Float.compare(this.xMQ, c2.xMQ) == 0 && Intrinsics.areEqual(this.mUb, c2.mUb) && this.gh == c2.gh;
    }

    public C(long j2, j type, Uri uri, long j3, long j4, long j5, long j6, boolean z2, float f3, Function1 volumeShaper, int i2) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(volumeShaper, "volumeShaper");
        this.f4080n = j2;
        this.rl = type;
        this.f4081t = uri;
        this.nr = j3;
        this.f4079O = j4;
        this.J2 = j5;
        this.Uo = j6;
        this.KN = z2;
        this.xMQ = f3;
        this.mUb = volumeShaper;
        this.gh = i2;
    }

    public int hashCode() {
        return (((((((((((((((((((Long.hashCode(this.f4080n) * 31) + this.rl.hashCode()) * 31) + this.f4081t.hashCode()) * 31) + Long.hashCode(this.nr)) * 31) + Long.hashCode(this.f4079O)) * 31) + Long.hashCode(this.J2)) * 31) + Long.hashCode(this.Uo)) * 31) + Boolean.hashCode(this.KN)) * 31) + Float.hashCode(this.xMQ)) * 31) + this.mUb.hashCode()) * 31) + Integer.hashCode(this.gh);
    }

    public final long n() {
        return this.Uo;
    }

    public final j nr() {
        return this.rl;
    }

    public final long rl() {
        return this.f4080n;
    }

    public final long t() {
        return this.J2;
    }

    public String toString() {
        return "MediaTrack(id=" + this.f4080n + ", type=" + this.rl + ", uri=" + this.f4081t + ", inTime=" + this.nr + ", outTime=" + this.f4079O + ", startTime=" + this.J2 + ", endTime=" + this.Uo + ", loop=" + this.KN + ", speedFactor=" + this.xMQ + ", volumeShaper=" + this.mUb + ", estimatedFps=" + this.gh + ")";
    }
}
