package NtE;

import androidx.media3.exoplayer.hls.offline.Oqje.QiDPjiOCZHDS;
import as.Xo;
import as.aC;
import as.qz;
import java.util.Collection;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class n {

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    static final class j extends Lambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f7150n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f7151t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(int i2, int i3) {
            super(1);
            this.f7150n = i2;
            this.f7151t = i3;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final as.n invoke(as.n it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return as.w6.O(it, this.f7150n, this.f7151t);
        }
    }

    private static final as.n t(as.n nVar, int i2, xkG.n nVar2) {
        if (i2 == 1) {
            return nVar2.rl(nVar);
        }
        if (i2 == 2) {
            return nVar2.n(nVar);
        }
        throw new UnsupportedOperationException("Only 1 or 2 output channels are supported, found " + ((Object) qz.J2(i2)));
    }

    private static final int Uo(float f3, int i2) {
        return f3 == 1.0f ? i2 : as.Ml.t((int) (f3 * i2));
    }

    public static final I28 nr(d2n.Wre processedRange, d2n.Wre instructionRange, int i2) {
        Intrinsics.checkNotNullParameter(processedRange, "processedRange");
        Intrinsics.checkNotNullParameter(instructionRange, "instructionRange");
        if (d2n.CN3.rl(processedRange, instructionRange)) {
            Xo xoNr = aC.nr(processedRange.O(), i2);
            Xo xoNr2 = aC.nr(instructionRange.O(), i2);
            Xo xoNr3 = aC.nr(instructionRange.nr(), i2);
            return new I28(xoNr2.nr(xoNr), xoNr3.nr(xoNr2), aC.nr(processedRange.nr(), i2).nr(xoNr3), null);
        }
        throw new IllegalStateException(("The instruction range (" + instructionRange + ") must be fully contained in the processed range (" + processedRange + ").").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final as.n J2(xkG.Ml ml, Q6.aC aCVar, as.CN3 cn3, d2n.Wre wre, xkG.n nVar) {
        boolean z2;
        I28 i28Nr = nr(wre, aCVar.rl(), cn3.t());
        int iN = i28Nr.n();
        int iRl = i28Nr.rl();
        int iT = i28Nr.t();
        if (as.Ml.rl(iRl, ml.n()) <= 0) {
            as.n nVarRl = ml.rl(iRl);
            if (as.Ml.Uo(iN) && as.Ml.Uo(iT)) {
                z2 = false;
            } else {
                z2 = true;
            }
            as.n nVarT = t((as.n) w9.Wre.n(nVarRl, z2, new j(iN, iT)), cn3.rl(), nVar);
            if (Intrinsics.areEqual(nVarT.Uo(), cn3)) {
                return nVarT;
            }
            throw new IllegalStateException(("Stream properties of audio fragment " + nVarT.Uo() + " must equal required one " + cn3).toString());
        }
        throw new IllegalStateException((QiDPjiOCZHDS.nWontzlQrfA + ((Object) as.Ml.mUb(iRl)) + " audio frames of available output for the requested range " + wre + " but found " + ((Object) as.Ml.mUb(ml.n())) + ".\nfragmentTimeRange: " + aCVar.rl()).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(xkG.Ml ml, Q6.aC aCVar, as.n nVar, int i2) {
        if (!w9.w6.mUb(v9.n.KN(nVar.O()))) {
            as.CN3 cn3Uo = nVar.Uo();
            int iN = as.I28.n(as.Ml.f43088n, v9.n.KN(nVar.O()), cn3Uo.rl(), cn3Uo.n());
            Q6.CN3 cn3Rl = Q6.CN3.rl((Q6.CN3) CollectionsKt.last(aCVar.t()), 1.0f, null, 0.0f, 6, null);
            Xo xoN = Xo.f43093O.n(cn3Uo.t());
            for (Pair pair : CollectionsKt.zipWithNext(CollectionsKt.plus((Collection<? extends Q6.CN3>) aCVar.t(), cn3Rl))) {
                Q6.CN3 cn3 = (Q6.CN3) pair.getFirst();
                int iUo = xoN.J2(Uo(cn3.nr(), iN)).Uo(cn3Uo);
                int iUo2 = xoN.J2(Uo(((Q6.CN3) pair.getSecond()).nr(), iN)).Uo(cn3Uo);
                if (!w9.Ml.KN(iUo, iUo2)) {
                    ml.t(as.n.rl(nVar, v9.n.qie(nVar.O(), w9.Ml.HI(iUo, iUo2)), null, 2, null), cn3.t(), cn3.O(), i2);
                }
            }
        }
    }
}
