package YF;

import GJW.AbstractC1363t;
import GJW.O;
import GJW.OU;
import GJW.Pl;
import GJW.iF;
import GJW.oXP;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.time.DurationKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class Ml extends I28 implements iF {
    private final boolean J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final String f12033O;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Ml f12034r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Handler f12035t;

    private Ml(Handler handler, String str, boolean z2) {
        super(null);
        this.f12035t = handler;
        this.f12033O = str;
        this.J2 = z2;
        this.f12034r = z2 ? this : new Ml(handler, str, true);
    }

    private final void Qu(CoroutineContext coroutineContext, Runnable runnable) {
        AbstractC1363t.nr(coroutineContext, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        OU.rl().n1(coroutineContext, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void UF(Ml ml, Runnable runnable) {
        ml.f12035t.removeCallbacks(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X4T(Pl pl, Ml ml) {
        pl.o(ml, Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Zmq(Ml ml, Runnable runnable, Throwable th) {
        ml.f12035t.removeCallbacks(runnable);
        return Unit.INSTANCE;
    }

    @Override // YF.I28
    /* JADX INFO: renamed from: HBN, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Ml p0N() {
        return this.f12034r;
    }

    @Override // GJW.lej
    public boolean Org(CoroutineContext coroutineContext) {
        return (this.J2 && Intrinsics.areEqual(Looper.myLooper(), this.f12035t.getLooper())) ? false : true;
    }

    @Override // GJW.iF
    public O U(long j2, final Runnable runnable, CoroutineContext coroutineContext) {
        if (this.f12035t.postDelayed(runnable, RangesKt.coerceAtMost(j2, DurationKt.MAX_MILLIS))) {
            return new O() { // from class: YF.j
                @Override // GJW.O
                public final void n() {
                    Ml.UF(this.f12037n, runnable);
                }
            };
        }
        Qu(coroutineContext, runnable);
        return oXP.f3498n;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Ml)) {
            return false;
        }
        Ml ml = (Ml) obj;
        return ml.f12035t == this.f12035t && ml.J2 == this.J2;
    }

    public int hashCode() {
        return System.identityHashCode(this.f12035t) ^ (this.J2 ? 1231 : 1237);
    }

    @Override // GJW.lej
    public void n1(CoroutineContext coroutineContext, Runnable runnable) {
        if (this.f12035t.post(runnable)) {
            return;
        }
        Qu(coroutineContext, runnable);
    }

    @Override // GJW.iF
    public void z(long j2, final Pl pl) {
        final Runnable runnable = new Runnable() { // from class: YF.n
            @Override // java.lang.Runnable
            public final void run() {
                Ml.X4T(pl, this);
            }
        };
        if (this.f12035t.postDelayed(runnable, RangesKt.coerceAtMost(j2, DurationKt.MAX_MILLIS))) {
            pl.J2(new Function1() { // from class: YF.w6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Ml.Zmq(this.f12041n, runnable, (Throwable) obj);
                }
            });
        } else {
            Qu(pl.getContext(), runnable);
        }
    }

    @Override // GJW.DC, GJW.lej
    public String toString() {
        String strBu = Bu();
        if (strBu == null) {
            String string = this.f12033O;
            if (string == null) {
                string = this.f12035t.toString();
            }
            if (this.J2) {
                return string + ".immediate";
            }
            return string;
        }
        return strBu;
    }

    public /* synthetic */ Ml(Handler handler, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(handler, (i2 & 2) != 0 ? null : str);
    }

    public Ml(Handler handler, String str) {
        this(handler, str, false);
    }
}
