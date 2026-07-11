package VV;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public interface n extends fuX {

    public static final class j {
        public static /* synthetic */ Object n(n nVar, FQq.Dsr dsr, int i2, int i3, boolean z2, float f3, aC aCVar, float f4, boolean z3, Dsr dsr2, boolean z4, boolean z5, Continuation continuation, int i5, Object obj) {
            aC aCVar2;
            boolean z6;
            n nVar2;
            Continuation continuation2;
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animate");
            }
            int iS = (i5 & 2) != 0 ? nVar.S() : i2;
            int iR = (i5 & 4) != 0 ? nVar.r() : i3;
            boolean zIk = (i5 & 8) != 0 ? nVar.Ik() : z2;
            float fO = (i5 & 16) != 0 ? nVar.o() : f3;
            if ((i5 & 32) != 0) {
                nVar.ViF();
                aCVar2 = null;
            } else {
                aCVar2 = aCVar;
            }
            float fT = (i5 & 64) != 0 ? Ml.t(dsr, aCVar2, fO) : f4;
            boolean z7 = (i5 & 128) != 0 ? false : z3;
            Dsr dsr3 = (i5 & 256) != 0 ? Dsr.f10886n : dsr2;
            boolean z9 = (i5 & 512) != 0 ? false : z4;
            if ((i5 & 1024) != 0) {
                z6 = false;
                continuation2 = continuation;
                nVar2 = nVar;
            } else {
                z6 = z5;
                nVar2 = nVar;
                continuation2 = continuation;
            }
            return nVar2.aYN(dsr, iS, iR, zIk, fO, aCVar2, fT, z7, dsr3, z9, z6, continuation2);
        }

        public static /* synthetic */ Object rl(n nVar, FQq.Dsr dsr, float f3, int i2, boolean z2, Continuation continuation, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: snapTo");
            }
            if ((i3 & 1) != 0) {
                dsr = nVar.WPU();
            }
            if ((i3 & 2) != 0) {
                f3 = nVar.t();
            }
            if ((i3 & 4) != 0) {
                i2 = nVar.S();
            }
            if ((i3 & 8) != 0) {
                z2 = !(f3 == nVar.t());
            }
            return nVar.ty(dsr, f3, i2, z2, continuation);
        }
    }

    Object aYN(FQq.Dsr dsr, int i2, int i3, boolean z2, float f3, aC aCVar, float f4, boolean z3, Dsr dsr2, boolean z4, boolean z5, Continuation continuation);

    Object ty(FQq.Dsr dsr, float f3, int i2, boolean z2, Continuation continuation);
}
