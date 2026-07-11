package com.bendingspoons.crisper.internal;

import GJW.RzR;
import GJW.vd;
import Pb7.C;
import Pb7.Pl;
import Pb7.Xo;
import Pb7.qz;
import androidx.annotation.Keep;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.reference.V8ValuePromise;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001J#\u0010\u0005\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R6\u0010\u0018\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/bendingspoons/crisper/internal/AsyncMethodWrapper;", "", "", "Lcom/caoccao/javet/values/V8Value;", "parameters", "invoke", "([Lcom/caoccao/javet/values/V8Value;)Lcom/caoccao/javet/values/V8Value;", "Lkotlin/coroutines/CoroutineContext;", c.f62177j, "Lkotlin/coroutines/CoroutineContext;", "context", "Lcom/caoccao/javet/interop/V8Runtime;", "rl", "Lcom/caoccao/javet/interop/V8Runtime;", "runtime", "", "t", "I", "argsCount", "Lkotlin/Function2;", "LPb7/Pl;", "Lkotlin/coroutines/Continuation;", "nr", "Lkotlin/jvm/functions/Function2;", "block", "crisper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMethodWrappers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MethodWrappers.kt\ncom/bendingspoons/crisper/internal/AsyncMethodWrapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,198:1\n1557#2:199\n1628#2,3:200\n37#3:203\n36#3,3:204\n*S KotlinDebug\n*F\n+ 1 MethodWrappers.kt\ncom/bendingspoons/crisper/internal/AsyncMethodWrapper\n*L\n65#1:199\n65#1:200,3\n67#1:203\n67#1:204,3\n*E\n"})
public final class AsyncMethodWrapper {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext context;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final Function2 block;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final V8Runtime runtime;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final int argsCount;

    static final class j extends SuspendLambda implements Function2 {
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f51245O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ AsyncMethodWrapper f51246S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ Pl[] f51247Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f51248n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ V8ValuePromise f51249o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f51250r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f51251t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new j(this.f51249o, this.f51247Z, this.f51246S, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Not initialized variable reg: 5, insn: 0x00ac: INVOKE (r5 I:com.caoccao.javet.values.reference.V8ValuePromise), (r11 I:com.caoccao.javet.values.V8Value) VIRTUAL call: com.caoccao.javet.values.reference.V8ValuePromise.reject(com.caoccao.javet.values.V8Value):boolean A[Catch: all -> 0x006f, MD:(com.caoccao.javet.values.V8Value):boolean throws com.caoccao.javet.exceptions.JavetException (m)] (LINE:175), block:B:53:0x00a0 */
        /* JADX WARN: Not initialized variable reg: 6, insn: 0x00b9: INVOKE (r6 I:java.lang.AutoCloseable), (r11 I:java.lang.Throwable) STATIC call: kotlin.jdk7.AutoCloseableKt.closeFinally(java.lang.AutoCloseable, java.lang.Throwable):void A[MD:(java.lang.AutoCloseable, java.lang.Throwable):void (m)] (LINE:188), block:B:59:0x00b9 */
        /* JADX WARN: Removed duplicated region for block: B:45:0x008e A[Catch: all -> 0x006f, Exception -> 0x0071, TryCatch #4 {Exception -> 0x0071, blocks: (B:23:0x0063, B:25:0x0066, B:27:0x006c, B:34:0x0076, B:43:0x008b, B:45:0x008e, B:47:0x0094, B:50:0x009a, B:51:0x009d, B:52:0x009f), top: B:68:0x0009, outer: #5 }] */
        /* JADX WARN: Type inference failed for: r2v0, types: [com.bendingspoons.crisper.internal.AsyncMethodWrapper, int] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            AutoCloseable autoCloseableCloseFinally;
            V8ValuePromise v8ValuePromiseReject;
            V8ValuePromise v8ValuePromise;
            AsyncMethodWrapper asyncMethodWrapper;
            Pl[] plArr;
            Throwable th;
            AutoCloseable autoCloseable;
            int length;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r2 = this.f51250r;
            int i2 = 0;
            try {
                try {
                    if (r2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        v8ValuePromise = this.f51249o;
                        Pl[] plArr2 = this.f51247Z;
                        asyncMethodWrapper = this.f51246S;
                        try {
                            Function2 function2 = asyncMethodWrapper.block;
                            this.f51248n = v8ValuePromise;
                            this.f51251t = v8ValuePromise;
                            this.f51245O = asyncMethodWrapper;
                            this.J2 = plArr2;
                            this.f51250r = 1;
                            Object objInvoke = function2.invoke(plArr2, this);
                            if (objInvoke == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            plArr = plArr2;
                            obj = objInvoke;
                            autoCloseable = v8ValuePromise;
                        } catch (Throwable th2) {
                            plArr = plArr2;
                            th = th2;
                            length = plArr.length;
                            while (i2 < length) {
                            }
                            throw th;
                        }
                    } else {
                        if (r2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        plArr = (Pl[]) this.J2;
                        asyncMethodWrapper = (AsyncMethodWrapper) this.f51245O;
                        v8ValuePromise = (V8ValuePromise) this.f51251t;
                        autoCloseable = (AutoCloseable) this.f51248n;
                        try {
                            ResultKt.throwOnFailure(obj);
                        } catch (Throwable th3) {
                            th = th3;
                            length = plArr.length;
                            while (i2 < length) {
                                Pl pl = plArr[i2];
                                C c2 = pl instanceof C ? (C) pl : null;
                                if (c2 != null) {
                                    c2.release();
                                }
                                i2++;
                            }
                            throw th;
                        }
                    }
                    Pl pl3 = (Pl) obj;
                    try {
                        v8ValuePromise.resolve(Xo.n(pl3, asyncMethodWrapper.runtime));
                        int length2 = plArr.length;
                        while (i2 < length2) {
                            Pl pl4 = plArr[i2];
                            C c4 = pl4 instanceof C ? (C) pl4 : null;
                            if (c4 != null) {
                                c4.release();
                            }
                            i2++;
                        }
                    } finally {
                        if (pl3 instanceof C) {
                            ((C) pl3).release();
                        }
                    }
                } catch (Exception e2) {
                    v8ValuePromiseReject.reject((V8Value) ((AsyncMethodWrapper) r2).runtime.createV8ValueString(e2.toString()));
                }
                Unit unit = Unit.INSTANCE;
                AutoCloseableKt.closeFinally(autoCloseable, null);
                return Unit.INSTANCE;
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    AutoCloseableKt.closeFinally(autoCloseableCloseFinally, th4);
                    throw th5;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(V8ValuePromise v8ValuePromise, Pl[] plArr, AsyncMethodWrapper asyncMethodWrapper, Continuation continuation) {
            super(2, continuation);
            this.f51249o = v8ValuePromise;
            this.f51247Z = plArr;
            this.f51246S = asyncMethodWrapper;
        }
    }

    @Keep
    public final V8Value invoke(V8Value... parameters) throws JavetException {
        Pl plNr;
        V8Value clone;
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        int length = parameters.length;
        int i2 = this.argsCount;
        if (length > i2) {
            throw new IllegalArgumentException(("JS injected method invoked with wrong number of arguments.\nExpected: <= " + i2 + ",\nReceived " + parameters.length).toString());
        }
        IntRange intRangeUntil = RangesKt.until(0, i2);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            V8Value v8Value = (V8Value) ArraysKt.getOrNull(parameters, ((IntIterator) it).nextInt());
            if (v8Value == null || (clone = v8Value.toClone()) == null || (plNr = MK.j.nr(clone)) == null) {
                plNr = qz.f7710n;
            }
            arrayList.add(plNr);
        }
        Pl[] plArr = (Pl[]) arrayList.toArray(new Pl[0]);
        V8ValuePromise v8ValuePromiseCreateV8ValuePromise = this.runtime.createV8ValuePromise();
        V8ValuePromise promise = v8ValuePromiseCreateV8ValuePromise.getPromise();
        GJW.C.nr(RzR.f3449n, this.context, null, new j(v8ValuePromiseCreateV8ValuePromise, plArr, this, null), 2, null);
        Intrinsics.checkNotNull(promise);
        return promise;
    }
}
