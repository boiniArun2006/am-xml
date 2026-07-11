package com.bendingspoons.crisper.internal;

import GJW.C;
import GJW.RzR;
import GJW.vd;
import androidx.annotation.Keep;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.reference.V8ValuePromise;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlin.reflect.full.KCallables;
import kuA.Wre;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001J#\u0010\u0005\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/bendingspoons/crisper/internal/AsyncMethodReferenceWrapper;", "", "", "Lcom/caoccao/javet/values/V8Value;", "parameters", "invoke", "([Lcom/caoccao/javet/values/V8Value;)Lcom/caoccao/javet/values/V8Value;", "Lkotlin/coroutines/CoroutineContext;", c.f62177j, "Lkotlin/coroutines/CoroutineContext;", "context", "Lcom/caoccao/javet/interop/V8Runtime;", "rl", "Lcom/caoccao/javet/interop/V8Runtime;", "runtime", "t", "Ljava/lang/Object;", "receiver", "Lkotlin/reflect/KFunction;", "nr", "Lkotlin/reflect/KFunction;", "method", "crisper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AsyncMethodReferenceWrapper {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext context;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final KFunction method;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final V8Runtime runtime;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Object receiver;

    static final class j extends SuspendLambda implements Function2 {
        int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f51237O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ Map f51238Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f51239n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ AsyncMethodReferenceWrapper f51240o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ V8ValuePromise f51241r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f51242t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(V8ValuePromise v8ValuePromise, AsyncMethodReferenceWrapper asyncMethodReferenceWrapper, Map map, Continuation continuation) {
            super(2, continuation);
            this.f51241r = v8ValuePromise;
            this.f51240o = asyncMethodReferenceWrapper;
            this.f51238Z = map;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new j(this.f51241r, this.f51240o, this.f51238Z, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v11, types: [com.caoccao.javet.values.reference.V8ValuePromise] */
        /* JADX WARN: Type inference failed for: r0v12 */
        /* JADX WARN: Type inference failed for: r0v13 */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v6, types: [com.caoccao.javet.values.reference.V8ValuePromise] */
        /* JADX WARN: Type inference failed for: r0v7 */
        /* JADX WARN: Type inference failed for: r0v8, types: [com.caoccao.javet.values.reference.V8ValuePromise] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AsyncMethodReferenceWrapper asyncMethodReferenceWrapper;
            AutoCloseable autoCloseable;
            Throwable th;
            Exception e2;
            ?? r02;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.J2;
            if (i2 != 0) {
                if (i2 == 1) {
                    r02 = (V8ValuePromise) this.f51237O;
                    asyncMethodReferenceWrapper = (AsyncMethodReferenceWrapper) this.f51242t;
                    autoCloseable = (AutoCloseable) this.f51239n;
                    try {
                        try {
                            ResultKt.throwOnFailure(obj);
                            r02 = r02;
                            autoCloseable = autoCloseable;
                        } catch (Exception e3) {
                            e2 = e3;
                            r02.reject(asyncMethodReferenceWrapper.runtime.createV8ValueString(e2.toString()));
                            autoCloseable = autoCloseable;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            throw th;
                        } catch (Throwable th3) {
                            AutoCloseableKt.closeFinally(autoCloseable, th);
                            throw th3;
                        }
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                V8ValuePromise v8ValuePromise = this.f51241r;
                asyncMethodReferenceWrapper = this.f51240o;
                Map map = this.f51238Z;
                try {
                    KFunction kFunction = asyncMethodReferenceWrapper.method;
                    this.f51239n = v8ValuePromise;
                    this.f51242t = asyncMethodReferenceWrapper;
                    this.f51237O = v8ValuePromise;
                    this.J2 = 1;
                    Object objCallSuspendBy = KCallables.callSuspendBy(kFunction, map, this);
                    if (objCallSuspendBy == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    V8ValuePromise v8ValuePromise2 = v8ValuePromise;
                    obj = objCallSuspendBy;
                    autoCloseable = v8ValuePromise2;
                    r02 = v8ValuePromise2;
                } catch (Exception e4) {
                    autoCloseable = v8ValuePromise;
                    e2 = e4;
                    r02 = autoCloseable;
                    r02.reject(asyncMethodReferenceWrapper.runtime.createV8ValueString(e2.toString()));
                    autoCloseable = autoCloseable;
                } catch (Throwable th4) {
                    autoCloseable = v8ValuePromise;
                    th = th4;
                    throw th;
                }
            }
            r02.resolve(MK.j.J2(obj, asyncMethodReferenceWrapper.runtime));
            autoCloseable = autoCloseable;
            Unit unit = Unit.INSTANCE;
            AutoCloseableKt.closeFinally(autoCloseable, null);
            return Unit.INSTANCE;
        }
    }

    @Keep
    public final V8Value invoke(V8Value... parameters) throws JavetException {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Map mapRl = Wre.rl(this.receiver, this.method, parameters);
        V8ValuePromise v8ValuePromiseCreateV8ValuePromise = this.runtime.createV8ValuePromise();
        C.nr(RzR.f3449n, this.context, null, new j(v8ValuePromiseCreateV8ValuePromise, this, mapRl, null), 2, null);
        V8ValuePromise promise = v8ValuePromiseCreateV8ValuePromise.getPromise();
        Intrinsics.checkNotNullExpressionValue(promise, "getPromise(...)");
        return promise;
    }
}
