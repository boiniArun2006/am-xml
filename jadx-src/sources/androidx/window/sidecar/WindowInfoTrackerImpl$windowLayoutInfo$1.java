package androidx.window.sidecar;

import ILs.Dsr;
import ILs.aC;
import ILs.j;
import TFv.CN3;
import android.app.Activity;
import androidx.core.util.Consumer;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTFv/CN3;", "Landroidx/window/layout/WindowLayoutInfo;", "", "<anonymous>", "(LTFv/CN3;)V"}, k = 3, mv = {1, 6, 0})
@DebugMetadata(c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1", f = "WindowInfoTrackerImpl.kt", i = {0, 0, 1, 1}, l = {54, 55}, m = "invokeSuspend", n = {"$this$flow", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "$this$flow", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER}, s = {"L$0", "L$1", "L$0", "L$1"})
final class WindowInfoTrackerImpl$windowLayoutInfo$1 extends SuspendLambda implements Function2<CN3, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    int f42682O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f42683n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ Activity f42684o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ WindowInfoTrackerImpl f42685r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f42686t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WindowInfoTrackerImpl$windowLayoutInfo$1(WindowInfoTrackerImpl windowInfoTrackerImpl, Activity activity, Continuation continuation) {
        super(2, continuation);
        this.f42685r = windowInfoTrackerImpl;
        this.f42684o = activity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        WindowInfoTrackerImpl$windowLayoutInfo$1 windowInfoTrackerImpl$windowLayoutInfo$1 = new WindowInfoTrackerImpl$windowLayoutInfo$1(this.f42685r, this.f42684o, continuation);
        windowInfoTrackerImpl$windowLayoutInfo$1.J2 = obj;
        return windowInfoTrackerImpl$windowLayoutInfo$1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void xMQ(ILs.CN3 cn3, WindowLayoutInfo info) {
        Intrinsics.checkNotNullExpressionValue(info, "info");
        cn3.nr(info);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public final Object invoke(CN3 cn3, Continuation continuation) {
        return ((WindowInfoTrackerImpl$windowLayoutInfo$1) create(cn3, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0090, code lost:
    
        if (r5.rl(r10, r9) == r0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007e A[Catch: all -> 0x001f, TRY_LEAVE, TryCatch #0 {all -> 0x001f, blocks: (B:7:0x001a, B:18:0x0064, B:22:0x0076, B:24:0x007e, B:14:0x0036, B:17:0x0060), top: B:31:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0090 -> B:8:0x001d). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CN3 cn3;
        Consumer consumer;
        Dsr it;
        CN3 cn32;
        Object objRl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f42682O;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        it = (Dsr) this.f42686t;
                        consumer = (Consumer) this.f42683n;
                        cn32 = (CN3) this.J2;
                        ResultKt.throwOnFailure(obj);
                        cn3 = cn32;
                        this.J2 = cn3;
                        this.f42683n = consumer;
                        this.f42686t = it;
                        this.f42682O = 1;
                        objRl = it.rl(this);
                        if (objRl == coroutine_suspended) {
                            cn32 = cn3;
                            obj = objRl;
                            if (!((Boolean) obj).booleanValue()) {
                                WindowLayoutInfo windowLayoutInfo = (WindowLayoutInfo) it.next();
                                this.J2 = cn32;
                                this.f42683n = consumer;
                                this.f42686t = it;
                                this.f42682O = 2;
                            } else {
                                this.f42685r.windowBackend.rl(consumer);
                                return Unit.INSTANCE;
                            }
                        } else {
                            return coroutine_suspended;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    it = (Dsr) this.f42686t;
                    consumer = (Consumer) this.f42683n;
                    cn32 = (CN3) this.J2;
                    ResultKt.throwOnFailure(obj);
                    if (!((Boolean) obj).booleanValue()) {
                    }
                }
            } else {
                ResultKt.throwOnFailure(obj);
                cn3 = (CN3) this.J2;
                final ILs.CN3 cn3Rl = aC.rl(10, j.f4187t, null, 4, null);
                consumer = new Consumer() { // from class: androidx.window.layout.fuX
                    @Override // androidx.core.util.Consumer
                    public final void accept(Object obj2) {
                        WindowInfoTrackerImpl$windowLayoutInfo$1.xMQ(cn3Rl, (WindowLayoutInfo) obj2);
                    }
                };
                this.f42685r.windowBackend.n(this.f42684o, new androidx.credentials.j(), consumer);
                it = cn3Rl.iterator();
                this.J2 = cn3;
                this.f42683n = consumer;
                this.f42686t = it;
                this.f42682O = 1;
                objRl = it.rl(this);
                if (objRl == coroutine_suspended) {
                }
            }
        } catch (Throwable th) {
            this.f42685r.windowBackend.rl(consumer);
            throw th;
        }
    }
}
