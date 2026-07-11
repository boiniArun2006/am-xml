package as;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class n {
    public static final j nr = new j(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ByteBuffer f43100n;
    private final CN3 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f43101t;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final n n(CN3 streamProperties, int i2) {
            Intrinsics.checkNotNullParameter(streamProperties, "streamProperties");
            return new n(v9.n.O(I28.rl(i2, streamProperties.rl(), streamProperties.n()), null, 2, null), streamProperties);
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
        return Intrinsics.areEqual(this.f43100n, nVar.f43100n) && Intrinsics.areEqual(this.rl, nVar.rl);
    }

    public n(ByteBuffer data, CN3 streamProperties) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(streamProperties, "streamProperties");
        this.f43100n = data;
        this.rl = streamProperties;
        if (v9.n.mUb(data, w6.rl(this))) {
            this.f43101t = data.remaining() == 0;
            return;
        }
        throw new IllegalArgumentException(("Data size (" + data.remaining() + ") incompatible with byte count per frame (" + ((Object) C.rl(w6.rl(this))) + ')').toString());
    }

    public static /* synthetic */ n rl(n nVar, ByteBuffer byteBuffer, CN3 cn3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            byteBuffer = nVar.f43100n;
        }
        if ((i2 & 2) != 0) {
            cn3 = nVar.rl;
        }
        return nVar.n(byteBuffer, cn3);
    }

    public final int J2() {
        return this.rl.t();
    }

    public final ByteBuffer O() {
        return this.f43100n;
    }

    public final CN3 Uo() {
        return this.rl;
    }

    public int hashCode() {
        return (this.f43100n.hashCode() * 31) + this.rl.hashCode();
    }

    public final n n(ByteBuffer data, CN3 streamProperties) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(streamProperties, "streamProperties");
        return new n(data, streamProperties);
    }

    public final int nr() {
        return this.rl.rl();
    }

    public final int t() {
        return this.rl.n();
    }

    public String toString() {
        return "AudioFragment(data=" + this.f43100n + ", streamProperties=" + this.rl + ')';
    }
}
