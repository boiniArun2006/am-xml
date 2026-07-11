package wVf;

import gwe.C;
import gwe.Dsr;
import gwe.aC;
import gwe.o;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import wVf.j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class Wre implements wVf.j {
    private final int J2;
    private aC KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final String f75001O;
    private final int Uo;
    private final j gh;
    private int mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final y8.Ml f75002n;
    private final boolean nr;
    private final zdu.w6 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final C f75003t;
    private final int xMQ;

    public static final class j implements Dsr {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f75004n;

        j() {
            this.f75004n = Wre.this.xMQ;
        }

        @Override // gwe.Dsr
        public int n() {
            return Wre.this.mUb;
        }

        @Override // gwe.Dsr
        public void rl(int i2) {
            if (i2 != Wre.this.mUb) {
                Wre wre = Wre.this;
                wre.mUb = RangesKt.coerceIn(i2, 1, wre.xMQ);
                aC aCVarQie = Wre.this.qie();
                if (aCVarQie != null) {
                    aCVarQie.t(Wre.this.mUb);
                }
            }
        }

        @Override // gwe.Dsr
        public int t() {
            return this.f75004n;
        }
    }

    public Wre(String str, y8.Ml animationInformation, zdu.w6 bitmapFrameRenderer, C frameLoaderFactory, boolean z2) {
        Intrinsics.checkNotNullParameter(animationInformation, "animationInformation");
        Intrinsics.checkNotNullParameter(bitmapFrameRenderer, "bitmapFrameRenderer");
        Intrinsics.checkNotNullParameter(frameLoaderFactory, "frameLoaderFactory");
        this.f75002n = animationInformation;
        this.rl = bitmapFrameRenderer;
        this.f75003t = frameLoaderFactory;
        this.nr = z2;
        this.f75001O = str == null ? String.valueOf(hashCode()) : str;
        this.J2 = animationInformation.az();
        this.Uo = animationInformation.Uo();
        int iGh = gh(animationInformation);
        this.xMQ = iGh;
        this.mUb = iGh;
        this.gh = new j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit az() {
        return Unit.INSTANCE;
    }

    private final int gh(y8.Ml ml) {
        return (int) RangesKt.coerceAtLeast(TimeUnit.SECONDS.toMillis(1L) / ((long) (ml.mUb() / ml.n())), 1L);
    }

    private final CN3 mUb(int i2, int i3) {
        if (!this.nr) {
            return new CN3(this.J2, this.Uo);
        }
        int iCoerceAtMost = this.J2;
        int iCoerceAtMost2 = this.Uo;
        if (i2 < iCoerceAtMost || i3 < iCoerceAtMost2) {
            double d2 = ((double) iCoerceAtMost) / ((double) iCoerceAtMost2);
            if (i3 > i2) {
                iCoerceAtMost2 = RangesKt.coerceAtMost(i3, iCoerceAtMost2);
                iCoerceAtMost = (int) (((double) iCoerceAtMost2) * d2);
            } else {
                iCoerceAtMost = RangesKt.coerceAtMost(i2, iCoerceAtMost);
                iCoerceAtMost2 = (int) (((double) iCoerceAtMost) / d2);
            }
        }
        return new CN3(iCoerceAtMost, iCoerceAtMost2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final aC qie() {
        if (this.KN == null) {
            this.KN = this.f75003t.rl(this.f75001O, this.rl, this.f75002n);
        }
        return this.KN;
    }

    @Override // wVf.j
    public void n(int i2, int i3, Function0 function0) {
        if (i2 <= 0 || i3 <= 0 || this.J2 <= 0 || this.Uo <= 0) {
            return;
        }
        CN3 cn3MUb = mUb(i2, i3);
        aC aCVarQie = qie();
        if (aCVarQie != null) {
            int iRl = cn3MUb.rl();
            int iRl2 = cn3MUb.rl();
            if (function0 == null) {
                function0 = new Function0() { // from class: wVf.I28
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Wre.az();
                    }
                };
            }
            aCVarQie.n(iRl, iRl2, function0);
        }
    }

    @Override // wVf.j
    public void nr(n nVar, zdu.n nVar2, y8.j jVar, int i2, Function0 function0) {
        j.C1259j.O(this, nVar, nVar2, jVar, i2, function0);
    }

    @Override // wVf.j
    public void onStop() {
        aC aCVarQie = qie();
        if (aCVarQie != null) {
            aCVarQie.onStop();
        }
        t();
    }

    @Override // wVf.j
    public Pj0.j rl(int i2, int i3, int i5) {
        o oVarRl;
        CN3 cn3MUb = mUb(i3, i5);
        aC aCVarQie = qie();
        if (aCVarQie != null) {
            oVarRl = aCVarQie.rl(i2, cn3MUb.rl(), cn3MUb.n());
        } else {
            oVarRl = null;
        }
        if (oVarRl != null) {
            gwe.I28.f67910n.KN(this.gh, oVarRl);
        }
        if (oVarRl == null) {
            return null;
        }
        return oVarRl.n();
    }

    @Override // wVf.j
    public void t() {
        aC aCVarQie = qie();
        if (aCVarQie != null) {
            C.nr.rl(this.f75001O, aCVarQie);
        }
        this.KN = null;
    }
}
