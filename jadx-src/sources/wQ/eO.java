package wQ;

import GJW.Lu;
import ILs.l3D;
import ILs.r;
import ILs.s4;
import android.net.Uri;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.Ml;
import com.google.firebase.storage.StorageException;
import com.google.firebase.storage.qf;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class eO {

    static final class CN3 implements OnSuccessListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final /* synthetic */ Function1 f74934n;

        CN3(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f74934n = function;
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        public final /* synthetic */ void onSuccess(Object obj) {
            this.f74934n.invoke(obj);
        }
    }

    static final class I28 implements OnFailureListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Continuation f74935n;

        I28(Continuation continuation) {
            this.f74935n = continuation;
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public final void onFailure(Exception it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Continuation continuation = this.f74935n;
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m313constructorimpl(ResultKt.createFailure(it)));
        }
    }

    static final class Ml implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Continuation f74936n;

        Ml(Continuation continuation) {
            this.f74936n = continuation;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n((Void) obj);
            return Unit.INSTANCE;
        }

        public final void n(Void r2) {
            Continuation continuation = this.f74936n;
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m313constructorimpl(Boolean.TRUE));
        }
    }

    static final class Wre implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Continuation f74937n;

        Wre(Continuation continuation) {
            this.f74937n = continuation;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n((Uri) obj);
            return Unit.INSTANCE;
        }

        public final void n(Uri uri) {
            if (uri != null) {
                this.f74937n.resumeWith(Result.m313constructorimpl(uri));
                return;
            }
            Continuation continuation = this.f74937n;
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m313constructorimpl(ResultKt.createFailure(new Exception("Error while getting the thumbnail URL"))));
        }
    }

    static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ qf f74938O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f74939n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f74940t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(qf qfVar, Continuation continuation) {
            super(2, continuation);
            this.f74938O = qfVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            j jVar = new j(this.f74938O, continuation);
            jVar.f74940t = obj;
            return jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f74939n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                s4 s4Var = (s4) this.f74940t;
                qf qfVar = this.f74938O;
                this.f74939n = 1;
                if (eO.o(qfVar, s4Var, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(s4 s4Var, Continuation continuation) {
            return ((j) create(s4Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class n extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ com.google.firebase.storage.Ml f74941O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f74942n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f74943t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(com.google.firebase.storage.Ml ml, Continuation continuation) {
            super(2, continuation);
            this.f74941O = ml;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            n nVar = new n(this.f74941O, continuation);
            nVar.f74943t = obj;
            return nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f74942n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                s4 s4Var = (s4) this.f74943t;
                com.google.firebase.storage.Ml ml = this.f74941O;
                this.f74942n = 1;
                if (eO.r(ml, s4Var, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(s4 s4Var, Continuation continuation) {
            return ((n) create(s4Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class w6 implements OnFailureListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Continuation f74944n;

        w6(Continuation continuation) {
            this.f74944n = continuation;
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public final void onFailure(Exception it) {
            Intrinsics.checkNotNullParameter(it, "it");
            StorageException storageException = it instanceof StorageException ? (StorageException) it : null;
            if (storageException == null || storageException.J2() != -13010) {
                Continuation continuation = this.f74944n;
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.m313constructorimpl(ResultKt.createFailure(it)));
            } else {
                Continuation continuation2 = this.f74944n;
                Result.Companion companion2 = Result.INSTANCE;
                continuation2.resumeWith(Result.m313constructorimpl(Boolean.FALSE));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ViF(s4 s4Var, qf.n nVar) {
        r.j.n(s4Var, null, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z(s4 s4Var, Ml.j jVar) {
        r.j.n(s4Var, null, 1, null);
        return Unit.INSTANCE;
    }

    public static final Object HI(com.google.firebase.storage.o oVar, Continuation continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        oVar.nr().addOnFailureListener(new w6(safeContinuation)).addOnSuccessListener(new CN3(new Ml(safeContinuation)));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    public static final com.google.firebase.storage.o Ik(com.google.firebase.storage.o oVar, String uid, String projectId) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        com.google.firebase.storage.o oVarRl = oVar.rl("u").rl(uid).rl(TtmlNode.TAG_P).rl(projectId);
        Intrinsics.checkNotNullExpressionValue(oVarRl, "child(...)");
        return oVarRl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(s4 s4Var, Exception it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Lu.t(s4Var, "Failure: " + it.getMessage(), it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WPU(s4 s4Var, qf.n it) {
        Intrinsics.checkNotNullParameter(it, "it");
        s4Var.nr(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void aYN(Function1 function1, Object p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        function1.invoke(p0);
    }

    public static final TFv.Wre az(com.google.firebase.storage.Ml ml) {
        Intrinsics.checkNotNullParameter(ml, "<this>");
        return TFv.fuX.J2(new n(ml, null));
    }

    public static final Object ck(com.google.firebase.storage.o oVar, Continuation continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        oVar.Uo().addOnFailureListener(new I28(safeContinuation)).addOnSuccessListener(new CN3(new Wre(safeContinuation)));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(s4 s4Var, Exception it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Lu.t(s4Var, "Failure: " + it.getMessage(), it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void iF(Function1 function1, Object p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        function1.invoke(p0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object o(qf qfVar, final s4 s4Var, Continuation continuation) {
        qfVar.addOnFailureListener(new OnFailureListener() { // from class: wQ.C
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                eO.S(s4Var, exc);
            }
        });
        final Function1 function1 = new Function1() { // from class: wQ.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return eO.WPU(s4Var, (qf.n) obj);
            }
        };
        qfVar.r(new com.google.firebase.storage.aC() { // from class: wQ.qz
            @Override // com.google.firebase.storage.aC
            public final void n(Object obj) {
                eO.aYN(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: wQ.Pl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return eO.ViF(s4Var, (qf.n) obj);
            }
        };
        qfVar.addOnSuccessListener(new OnSuccessListener() { // from class: wQ.Xo
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                eO.nY(function12, obj);
            }
        });
        Object objT = l3D.t(s4Var, null, continuation, 1, null);
        return objT == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objT : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object r(com.google.firebase.storage.Ml ml, final s4 s4Var, Continuation continuation) {
        ml.addOnFailureListener(new OnFailureListener() { // from class: wQ.Wre
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                eO.g(s4Var, exc);
            }
        });
        final Function1 function1 = new Function1() { // from class: wQ.CN3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return eO.te(s4Var, (Ml.j) obj);
            }
        };
        ml.r(new com.google.firebase.storage.aC() { // from class: wQ.fuX
            @Override // com.google.firebase.storage.aC
            public final void n(Object obj) {
                eO.iF(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: wQ.Dsr
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return eO.Z(s4Var, (Ml.j) obj);
            }
        };
        ml.addOnSuccessListener(new OnSuccessListener() { // from class: wQ.aC
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                eO.XQ(function12, obj);
            }
        });
        Object objT = l3D.t(s4Var, null, continuation, 1, null);
        return objT == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objT : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit te(s4 s4Var, Ml.j it) {
        Intrinsics.checkNotNullParameter(it, "it");
        s4Var.nr(it);
        return Unit.INSTANCE;
    }

    public static final TFv.Wre ty(qf qfVar) {
        Intrinsics.checkNotNullParameter(qfVar, "<this>");
        return TFv.fuX.J2(new j(qfVar, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void XQ(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nY(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}
