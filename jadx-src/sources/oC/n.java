package oC;

import as.qz;
import as.z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f71369n;
    private final as.CN3 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final oC.j f71370t;
    public static final j nr = new j(null);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final as.CN3 f71368O = new as.CN3(qz.rl(2), z.n(48000), null);

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
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
        return this.f71369n == nVar.f71369n && Intrinsics.areEqual(this.rl, nVar.rl) && this.f71370t == nVar.f71370t;
    }

    public n(int i2, as.CN3 streamProperties, oC.j mime) {
        Intrinsics.checkNotNullParameter(streamProperties, "streamProperties");
        Intrinsics.checkNotNullParameter(mime, "mime");
        this.f71369n = i2;
        this.rl = streamProperties;
        this.f71370t = mime;
    }

    public static /* synthetic */ n rl(n nVar, int i2, as.CN3 cn3, oC.j jVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = nVar.f71369n;
        }
        if ((i3 & 2) != 0) {
            cn3 = nVar.rl;
        }
        if ((i3 & 4) != 0) {
            jVar = nVar.f71370t;
        }
        return nVar.n(i2, cn3, jVar);
    }

    public final as.CN3 O() {
        return this.rl;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f71369n) * 31) + this.rl.hashCode()) * 31) + this.f71370t.hashCode();
    }

    public final n n(int i2, as.CN3 streamProperties, oC.j mime) {
        Intrinsics.checkNotNullParameter(streamProperties, "streamProperties");
        Intrinsics.checkNotNullParameter(mime, "mime");
        return new n(i2, streamProperties, mime);
    }

    public final oC.j nr() {
        return this.f71370t;
    }

    public final int t() {
        return this.f71369n;
    }

    public String toString() {
        return "AudioParams(bitRate=" + this.f71369n + ", streamProperties=" + this.rl + ", mime=" + this.f71370t + ')';
    }
}
