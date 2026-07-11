package I;

import XoT.C;
import com.caoccao.javet.enums.JavetPromiseRejectEvent;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.V8Host;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.interop.callback.IJavetPromiseRejectCallback;
import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.reference.V8ValuePromise;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.concurrent.ThreadsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Dsr {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f4002n;
    private boolean nr;
    private final Lazy rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final SynchronousQueue f4003t;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void az(JavetPromiseRejectEvent javetPromiseRejectEvent, V8ValuePromise v8ValuePromise, V8Value v8Value) {
    }

    public Dsr(String debugTag) {
        Intrinsics.checkNotNullParameter(debugTag, "debugTag");
        this.f4002n = debugTag;
        this.rl = LazyKt.lazy(new Function0() { // from class: I.Ml
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Dsr.qie();
            }
        });
        this.f4003t = new SynchronousQueue();
        this.nr = true;
        ThreadsKt.thread$default(false, false, null, "JSWrapper:" + debugTag, 0, new Function0() { // from class: I.I28
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Dsr.Uo(this.f4004n);
            }
        }, 23, null);
    }

    private final V8Runtime KN() {
        return (V8Runtime) this.rl.getValue();
    }

    public static String O() {
        return "[JS] New Runtime";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Uo(Dsr dsr) throws JavetException {
        C.qie(dsr, new Function0() { // from class: I.Wre
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Dsr.O();
            }
        });
        while (dsr.nr) {
            ((Function0) dsr.f4003t.take()).invoke();
        }
        dsr.KN().close(false);
        C.qie(dsr, new Function0() { // from class: I.CN3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Dsr.nr();
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, java.lang.Object] */
    public static final Unit gh(Dsr dsr, Ref.ObjectRef objectRef, Function2 function2, CountDownLatch countDownLatch) {
        V8Runtime v8RuntimeKN = dsr.KN();
        Intrinsics.checkNotNullExpressionValue(v8RuntimeKN, "<get-v8>(...)");
        n nVar = new n(v8RuntimeKN);
        V8Runtime v8RuntimeKN2 = dsr.KN();
        Intrinsics.checkNotNullExpressionValue(v8RuntimeKN2, "<get-v8>(...)");
        objectRef.element = function2.invoke(nVar, v8RuntimeKN2);
        nVar.nr();
        countDownLatch.countDown();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object mUb(Dsr dsr, int i2, Function2 function2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 15000;
        }
        return dsr.xMQ(i2, function2);
    }

    public static String nr() {
        return "[JS] Dispose Runtime";
    }

    public final Object xMQ(int i2, final Function2 action) throws InterruptedException {
        Intrinsics.checkNotNullParameter(action, "action");
        int iIncrementAndGet = aC.f4005n.incrementAndGet();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        System.nanoTime();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f4003t.put(new Function0() { // from class: I.w6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Dsr.gh(this.f4009n, objectRef, action, countDownLatch);
            }
        });
        long jNanoTime = System.nanoTime() + (((long) i2) * 1000000);
        boolean zAwait = false;
        boolean z2 = false;
        while (this.nr && !zAwait) {
            zAwait = countDownLatch.await(10L, TimeUnit.MILLISECONDS);
            if (!z2 && System.nanoTime() > jNanoTime) {
                FirebaseCrashlytics.getInstance().recordException(new TimeoutException("Timeout awaiting JS (instance=" + iIncrementAndGet + ", tag=" + this.f4002n + ", timeout=" + i2 + ")"));
                z2 = true;
            }
        }
        System.nanoTime();
        T t3 = objectRef.element;
        if (t3 != 0) {
            return t3;
        }
        throw new RuntimeException("Attempt to perform operation on terminated JS execution thread");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final V8Runtime qie() throws JavetException {
        V8Runtime v8RuntimeCreateV8Runtime = V8Host.getV8Instance().createV8Runtime();
        v8RuntimeCreateV8Runtime.setPromiseRejectCallback(new IJavetPromiseRejectCallback() { // from class: I.fuX
            @Override // com.caoccao.javet.interop.callback.IJavetPromiseRejectCallback
            public final void callback(JavetPromiseRejectEvent javetPromiseRejectEvent, V8ValuePromise v8ValuePromise, V8Value v8Value) {
                Dsr.az(javetPromiseRejectEvent, v8ValuePromise, v8Value);
            }
        });
        return v8RuntimeCreateV8Runtime;
    }
}
