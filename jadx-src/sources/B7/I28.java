package B7;

import java.nio.ShortBuffer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class I28 implements Ml {
    public static final j Uo = new j(null);
    private int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private ShortBuffer f242O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f243n;
    private final r nr;
    private long rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private as.CN3 f244t;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    public I28(int i2, int i3) {
        this.f243n = i3;
        this.rl = d2n.Ml.f63370t.J2();
        this.nr = new r(i2);
        this.J2 = -1;
    }

    @Override // B7.Ml
    public void J2(long j2, as.CN3 properties) {
        Intrinsics.checkNotNullParameter(properties, "properties");
        this.rl = j2;
        this.f244t = properties;
        this.J2 = this.f243n * properties.rl();
        this.nr.n();
    }

    @Override // B7.Ml
    public void O() {
        ShortBuffer shortBuffer = this.f242O;
        if (shortBuffer == null) {
            return;
        }
        as.CN3 cn3 = null;
        this.f242O = null;
        as.CN3 cn32 = this.f244t;
        if (cn32 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("properties");
        } else {
            cn3 = cn32;
        }
        int iRl = cn3.rl();
        int iPosition = shortBuffer.position();
        int iN = as.I28.n(as.Ml.f43088n, w9.w6.J2(shortBuffer.remaining() * 2), iRl, as.j.f43098n.rl()) / 8;
        int iMax = 0;
        for (int i2 = 0; i2 < iN; i2++) {
            int i3 = (i2 * 8 * iRl) + iPosition;
            for (int i5 = 0; i5 < iRl; i5++) {
                iMax = Math.max(iMax, Math.abs((int) shortBuffer.get(i3 + i5)));
            }
        }
        this.nr.nr(Wre.J2(iMax));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    @Override // B7.Ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void nr(ShortBuffer stream) {
        Sequence<ShortBuffer> sequenceN;
        Intrinsics.checkNotNullParameter(stream, "stream");
        if (this.f243n == -1) {
            throw new IllegalStateException("Cannot accumulate fragments before receiver AudioLevelMeter is configured.");
        }
        ShortBuffer shortBuffer = this.f242O;
        if (shortBuffer != null) {
            this.f242O = null;
            sequenceN = Wre.nr(stream, shortBuffer, this.J2);
            if (sequenceN == null) {
                sequenceN = v9.Dsr.n(stream, this.J2);
            }
        }
        for (ShortBuffer shortBuffer2 : sequenceN) {
            if (shortBuffer2.remaining() < this.J2) {
                this.f242O = Wre.O(shortBuffer2);
            } else {
                as.CN3 cn3 = this.f244t;
                if (cn3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("properties");
                    cn3 = null;
                }
                int iRl = cn3.rl();
                int iPosition = shortBuffer2.position();
                int iN = as.I28.n(as.Ml.f43088n, w9.w6.J2(shortBuffer2.remaining() * 2), iRl, as.j.f43098n.rl()) / 8;
                int iMax = 0;
                for (int i2 = 0; i2 < iN; i2++) {
                    int i3 = (i2 * 8 * iRl) + iPosition;
                    for (int i5 = 0; i5 < iRl; i5++) {
                        iMax = Math.max(iMax, Math.abs((int) shortBuffer2.get(i3 + i5)));
                    }
                }
                this.nr.nr(Wre.J2(iMax));
            }
        }
    }

    @Override // B7.Ml
    public Float t(long j2) {
        as.CN3 cn3 = null;
        if (this.nr.t()) {
            return null;
        }
        long jAz = d2n.Ml.az(j2, this.rl);
        if (d2n.j.nr(jAz, d2n.j.f63374t.J2()) < 0) {
            return null;
        }
        as.CN3 cn32 = this.f244t;
        if (cn32 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("properties");
        } else {
            cn3 = cn32;
        }
        return this.nr.rl(as.aC.t(jAz, cn3.t()) / this.f243n);
    }

    public /* synthetic */ I28(int i2, int i3, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 500 : i2, (i5 & 2) != 0 ? 250 : i3);
    }
}
