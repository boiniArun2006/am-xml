package com.alightcreative.app.motion.activities;

import android.net.Uri;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.storage.qf;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class Esr {

    static final class CN3 implements OnSuccessListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final /* synthetic */ Function1 f44510n;

        CN3(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f44510n = function;
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        public final /* synthetic */ void onSuccess(Object obj) {
            this.f44510n.invoke(obj);
        }
    }

    static final class Dsr implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Continuation f44511n;

        Dsr(Continuation continuation) {
            this.f44511n = continuation;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n((Void) obj);
            return Unit.INSTANCE;
        }

        public final void n(Void r2) {
            this.f44511n.resumeWith(Result.m313constructorimpl(Result.m312boximpl(Result.m313constructorimpl(r2))));
        }
    }

    static final class I28 implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Continuation f44512n;

        I28(Continuation continuation) {
            this.f44512n = continuation;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n((qf.n) obj);
            return Unit.INSTANCE;
        }

        public final void n(qf.n nVar) {
            this.f44512n.resumeWith(Result.m313constructorimpl(Result.m312boximpl(Result.m313constructorimpl(nVar))));
        }
    }

    static final class Ml extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f44513O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f44514n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f44515t;

        Ml(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f44513O = obj;
            this.J2 |= Integer.MIN_VALUE;
            Object objRl = Esr.rl(null, null, this);
            return objRl == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objRl : Result.m312boximpl(objRl);
        }
    }

    static final class Wre implements OnFailureListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Continuation f44516n;

        Wre(Continuation continuation) {
            this.f44516n = continuation;
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public final void onFailure(Exception it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Continuation continuation = this.f44516n;
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m313constructorimpl(Result.m312boximpl(Result.m313constructorimpl(ResultKt.createFailure(it)))));
        }
    }

    static final class aC implements OnFailureListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Continuation f44517n;

        aC(Continuation continuation) {
            this.f44517n = continuation;
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public final void onFailure(Exception it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Continuation continuation = this.f44517n;
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m313constructorimpl(Result.m312boximpl(Result.m313constructorimpl(ResultKt.createFailure(it)))));
        }
    }

    static final class fuX extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f44518O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f44519n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f44520t;

        fuX(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f44518O = obj;
            this.J2 |= Integer.MIN_VALUE;
            Object objT = Esr.t(null, null, this);
            return objT == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objT : Result.m312boximpl(objT);
        }
    }

    static final class j extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f44521O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f44522n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f44523t;

        j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f44523t = obj;
            this.f44521O |= Integer.MIN_VALUE;
            Object objN = Esr.n(null, this);
            return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Result.m312boximpl(objN);
        }
    }

    static final class n implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Continuation f44524n;

        n(Continuation continuation) {
            this.f44524n = continuation;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n((Uri) obj);
            return Unit.INSTANCE;
        }

        public final void n(Uri uri) {
            this.f44524n.resumeWith(Result.m313constructorimpl(Result.m312boximpl(Result.m313constructorimpl(uri))));
        }
    }

    static final class w6 implements OnFailureListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Continuation f44525n;

        w6(Continuation continuation) {
            this.f44525n = continuation;
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public final void onFailure(Exception it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Continuation continuation = this.f44525n;
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m313constructorimpl(Result.m312boximpl(Result.m313constructorimpl(ResultKt.createFailure(it)))));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object n(com.google.firebase.storage.o oVar, Continuation continuation) {
        j jVar;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.f44521O;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.f44521O = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        }
        Object orThrow = jVar.f44523t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = jVar.f44521O;
        if (i3 == 0) {
            ResultKt.throwOnFailure(orThrow);
            jVar.f44522n = oVar;
            jVar.f44521O = 1;
            SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(jVar));
            Task taskUo = oVar.Uo();
            Intrinsics.checkNotNullExpressionValue(taskUo, "getDownloadUrl(...)");
            taskUo.addOnSuccessListener(new CN3(new n(safeContinuation)));
            taskUo.addOnFailureListener(new w6(safeContinuation));
            orThrow = safeContinuation.getOrThrow();
            if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(jVar);
            }
            if (orThrow == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(orThrow);
        }
        return ((Result) orThrow).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object rl(com.google.firebase.storage.o oVar, byte[] bArr, Continuation continuation) {
        Ml ml;
        if (continuation instanceof Ml) {
            ml = (Ml) continuation;
            int i2 = ml.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ml.J2 = i2 - Integer.MIN_VALUE;
            } else {
                ml = new Ml(continuation);
            }
        }
        Object orThrow = ml.f44513O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = ml.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(orThrow);
            ml.f44514n = oVar;
            ml.f44515t = bArr;
            ml.J2 = 1;
            SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(ml));
            com.google.firebase.storage.qf qfVarR = oVar.r(bArr);
            Intrinsics.checkNotNullExpressionValue(qfVarR, "putBytes(...)");
            qfVarR.addOnSuccessListener(new CN3(new I28(safeContinuation)));
            qfVarR.addOnFailureListener(new Wre(safeContinuation));
            orThrow = safeContinuation.getOrThrow();
            if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(ml);
            }
            if (orThrow == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(orThrow);
        }
        return ((Result) orThrow).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object t(FirebaseUser firebaseUser, UserProfileChangeRequest userProfileChangeRequest, Continuation continuation) {
        fuX fux;
        if (continuation instanceof fuX) {
            fux = (fuX) continuation;
            int i2 = fux.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fux.J2 = i2 - Integer.MIN_VALUE;
            } else {
                fux = new fuX(continuation);
            }
        }
        Object orThrow = fux.f44518O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = fux.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(orThrow);
            fux.f44519n = firebaseUser;
            fux.f44520t = userProfileChangeRequest;
            fux.J2 = 1;
            SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(fux));
            Task taskXVH = firebaseUser.xVH(userProfileChangeRequest);
            Intrinsics.checkNotNullExpressionValue(taskXVH, "updateProfile(...)");
            taskXVH.addOnSuccessListener(new CN3(new Dsr(safeContinuation)));
            taskXVH.addOnFailureListener(new aC(safeContinuation));
            orThrow = safeContinuation.getOrThrow();
            if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(fux);
            }
            if (orThrow == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(orThrow);
        }
        return ((Result) orThrow).getValue();
    }
}
