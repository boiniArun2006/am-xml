package teV;

import TFv.rv6;
import java.util.Arrays;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class j {
    private SPz J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f73648O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private w6[] f73649n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f73650t;

    protected final void az(w6 w6Var) {
        SPz sPz;
        int i2;
        Continuation[] continuationArrRl;
        synchronized (this) {
            try {
                int i3 = this.f73650t - 1;
                this.f73650t = i3;
                sPz = this.J2;
                if (i3 == 0) {
                    this.f73648O = 0;
                }
                Intrinsics.checkNotNull(w6Var, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                continuationArrRl = w6Var.rl(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (Continuation continuation : continuationArrRl) {
            if (continuation != null) {
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.m313constructorimpl(Unit.INSTANCE));
            }
        }
        if (sPz != null) {
            sPz.D(-1);
        }
    }

    protected abstract w6 gh();

    protected final w6 mUb() {
        w6 w6VarGh;
        SPz sPz;
        synchronized (this) {
            try {
                w6[] w6VarArrQie = this.f73649n;
                if (w6VarArrQie == null) {
                    w6VarArrQie = qie(2);
                    this.f73649n = w6VarArrQie;
                } else if (this.f73650t >= w6VarArrQie.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(w6VarArrQie, w6VarArrQie.length * 2);
                    Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                    this.f73649n = (w6[]) objArrCopyOf;
                    w6VarArrQie = (w6[]) objArrCopyOf;
                }
                int i2 = this.f73648O;
                do {
                    w6VarGh = w6VarArrQie[i2];
                    if (w6VarGh == null) {
                        w6VarGh = gh();
                        w6VarArrQie[i2] = w6VarGh;
                    }
                    i2++;
                    if (i2 >= w6VarArrQie.length) {
                        i2 = 0;
                    }
                    Intrinsics.checkNotNull(w6VarGh, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                } while (!w6VarGh.n(this));
                this.f73648O = i2;
                this.f73650t++;
                sPz = this.J2;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (sPz != null) {
            sPz.D(1);
        }
        return w6VarGh;
    }

    public final rv6 nr() {
        SPz sPz;
        synchronized (this) {
            sPz = this.J2;
            if (sPz == null) {
                sPz = new SPz(this.f73650t);
                this.J2 = sPz;
            }
        }
        return sPz;
    }

    protected abstract w6[] qie(int i2);

    protected final w6[] HI() {
        return this.f73649n;
    }

    protected final int ty() {
        return this.f73650t;
    }
}
