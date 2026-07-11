package gwe;

import android.os.Handler;
import android.os.HandlerThread;
import gwe.o;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class I28 {
    private static final Lazy J2;
    private static final Runnable KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final ConcurrentHashMap f67909O;
    private static final Runnable Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final I28 f67910n;
    private static final AtomicInteger nr;
    private static final AtomicInteger rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final AtomicInteger f67911t;

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[o.j.values().length];
            try {
                iArr[o.j.f67920n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.j.f67922t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o.j.f67919O.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        I28 i28 = new I28();
        f67910n = i28;
        rl = new AtomicInteger(0);
        f67911t = new AtomicInteger(0);
        nr = new AtomicInteger(0);
        f67909O = new ConcurrentHashMap();
        J2 = LazyKt.lazy(new Function0() { // from class: gwe.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return I28.Uo();
            }
        });
        Runnable runnable = new Runnable() { // from class: gwe.w6
            @Override // java.lang.Runnable
            public final void run() {
                I28.nr();
            }
        };
        Uo = runnable;
        Runnable runnable2 = new Runnable() { // from class: gwe.Ml
            @Override // java.lang.Runnable
            public final void run() {
                I28.O();
            }
        };
        KN = runnable2;
        i28.J2().post(runnable);
        i28.J2().post(runnable2);
    }

    private final Handler J2() {
        return (Handler) J2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Handler Uo() {
        HandlerThread handlerThread = new HandlerThread("FrescoAnimationWorker");
        handlerThread.start();
        return new Handler(handlerThread.getLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nr() {
        float andSet = rl.getAndSet(0);
        float andSet2 = f67911t.getAndSet(0);
        float andSet3 = nr.getAndSet(0);
        float f3 = andSet + andSet2 + andSet3;
        if (f3 > 0.0f) {
            float f4 = andSet / f3;
            float f5 = andSet3 / f3;
            if (andSet2 / f3 > 0.25f || f5 > 0.1f) {
                for (Map.Entry entry : f67909O.entrySet()) {
                    f67910n.gh((Dsr) entry.getKey(), -((Number) entry.getValue()).intValue());
                }
            } else if (f4 > 0.98f) {
                for (Map.Entry entry2 : f67909O.entrySet()) {
                    f67910n.gh((Dsr) entry2.getKey(), ((Number) entry2.getValue()).intValue());
                }
            }
            f67909O.clear();
        }
        f67910n.mUb();
    }

    public final void KN(Dsr animation, o frameResult) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Intrinsics.checkNotNullParameter(frameResult, "frameResult");
        ConcurrentHashMap concurrentHashMap = f67909O;
        if (!concurrentHashMap.contains(animation)) {
            concurrentHashMap.put(animation, Integer.valueOf((int) (animation.t() * 0.2f)));
        }
        int i2 = j.$EnumSwitchMapping$0[frameResult.rl().ordinal()];
        if (i2 == 1) {
            rl.incrementAndGet();
        } else if (i2 == 2) {
            f67911t.incrementAndGet();
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            nr.incrementAndGet();
        }
    }

    private I28() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O() {
        C.nr.n(new Date(System.currentTimeMillis() - 10000));
        f67910n.xMQ();
    }

    private final void gh(Dsr dsr, int i2) {
        int iCoerceIn = RangesKt.coerceIn(dsr.n() + i2, (int) RangesKt.coerceAtLeast(dsr.t() * 0.5f, 1.0f), dsr.t());
        if (iCoerceIn != dsr.n()) {
            dsr.rl(iCoerceIn);
        }
    }

    private final boolean mUb() {
        return J2().postDelayed(Uo, 2000L);
    }

    private final boolean xMQ() {
        return J2().postDelayed(KN, 10000L);
    }
}
