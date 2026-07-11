package Tc;

import Tc.j;
import YHx.C;
import as.I28;
import as.Ml;
import as.Pl;
import as.z;
import com.google.android.exoplayer2.audio.AudioProcessor;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class n implements Tc.j {
    private static final j xMQ = new j(null);
    private ByteBuffer J2;
    private boolean KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private C f10524O;
    private ByteBuffer Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f10525n;
    private float nr;
    private int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f10526t;

    private static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float t() {
            return 50.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float nr() {
            return 0.05f;
        }
    }

    public /* synthetic */ n(int i2, int i3, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3, i5);
    }

    private n(int i2, int i3, int i5) {
        this.f10525n = i2;
        this.rl = i3;
        this.f10526t = i5;
        this.nr = 1.0f;
        this.f10524O = new C(i3);
        ByteBuffer EMPTY_BUFFER = AudioProcessor.EMPTY_BUFFER;
        Intrinsics.checkNotNullExpressionValue(EMPTY_BUFFER, "EMPTY_BUFFER");
        this.J2 = EMPTY_BUFFER;
        Intrinsics.checkNotNullExpressionValue(EMPTY_BUFFER, "EMPTY_BUFFER");
        this.Uo = EMPTY_BUFFER;
        this.KN = true;
    }

    private final int J2(int i2) {
        return i2 / as.j.f43098n.rl();
    }

    private final void KN() {
        float[] fArrT = this.f10524O.t();
        int iRl = I28.rl(O(), this.rl, as.j.f43098n.rl());
        if (w9.w6.nr(v9.n.KN(this.J2), iRl) < 0) {
            ByteBuffer byteBuffer = this.J2;
            this.J2 = v9.n.O(w9.w6.qie(w9.w6.J2(v9.n.J2(byteBuffer)), w9.w6.az(iRl, 2)), null, 2, null);
            byteBuffer.flip();
            this.J2.put(byteBuffer);
        }
        w6.rl(fArrT, J2(iRl), this.J2);
    }

    private final int O() {
        return Ml.t(this.f10524O.nr());
    }

    private final void Uo() {
        int iUo = v9.n.Uo(this.J2);
        this.J2.flip();
        v9.n.ty(this.Uo, this.J2);
        v9.n.HI(this.J2, iUo);
        this.J2.compact();
        this.Uo.flip();
    }

    @Override // Tc.j
    public int n() {
        return I28.n(Ml.f43088n, w9.w6.J2(v9.n.Uo(this.J2)), this.rl, as.j.f43098n.rl());
    }

    @Override // Tc.j
    public void nr(j.C0372j newConfiguration) {
        Intrinsics.checkNotNullParameter(newConfiguration, "newConfiguration");
        ByteBuffer EMPTY_BUFFER = AudioProcessor.EMPTY_BUFFER;
        Intrinsics.checkNotNullExpressionValue(EMPTY_BUFFER, "EMPTY_BUFFER");
        this.Uo = EMPTY_BUFFER;
        this.KN = true;
        this.f10525n = newConfiguration.rl();
        this.rl = newConfiguration.n();
        this.f10526t = newConfiguration.t();
        this.f10524O.KN();
        this.J2.clear();
        this.Uo.clear();
        this.f10524O = new C(this.rl);
    }

    @Override // Tc.j
    public void queueInput(ByteBuffer inputBuffer) {
        Intrinsics.checkNotNullParameter(inputBuffer, "inputBuffer");
        if (!this.KN) {
            throw new IllegalStateException("queueInput called after reset. A call to reconfigure is required before.");
        }
        if (inputBuffer.hasRemaining()) {
            int iKN = v9.n.KN(inputBuffer);
            this.f10524O.O(inputBuffer, I28.n(Ml.f43088n, iKN, this.rl, as.j.f43098n.rl()), this.rl, false, this.f10525n, MathKt.roundToInt(this.f10526t / this.nr));
            v9.n.ck(inputBuffer, w9.Ml.qie(v9.n.Uo(inputBuffer), iKN));
            KN();
        }
    }

    @Override // Tc.j
    public void t(float f3) {
        j jVar = xMQ;
        float fNr = jVar.nr();
        if (f3 <= jVar.t() && fNr <= f3) {
            if (this.nr == f3) {
                return;
            }
            this.nr = f3;
            return;
        }
        throw new IllegalArgumentException(("Given speed must be in range [" + jVar.nr() + ", " + jVar.t() + "]. Found speed: " + f3 + '.').toString());
    }

    @Override // Tc.j
    public ByteBuffer rl(int i2) {
        if (Ml.rl(i2, n()) <= 0) {
            int iRl = I28.rl(i2, this.rl, as.j.f43098n.rl());
            this.Uo.clear();
            if (w9.w6.nr(v9.n.KN(this.Uo), iRl) < 0) {
                this.Uo = v9.n.O(iRl, null, 2, null);
            }
            v9.n.HI(this.Uo, w9.Ml.J2(iRl));
            Uo();
            return this.Uo;
        }
        throw new IllegalArgumentException(("Number of given frames " + ((Object) Ml.mUb(i2)) + " must not be greater than number of available output frames " + ((Object) Ml.mUb(n()))).toString());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ n(int i2, int i3, int i5, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        i2 = (i7 & 1) != 0 ? z.n(1) : i2;
        this(i2, (i7 & 2) != 0 ? Pl.n(1) : i3, (i7 & 4) != 0 ? i2 : i5, null);
    }
}
