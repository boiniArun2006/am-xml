package aUP;

import GJW.OU;
import GJW.lej;
import GJW.vd;
import LQ.j;
import android.media.MediaMuxer;
import java.io.FileDescriptor;
import java.io.IOException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Dsr implements ase.w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final lej f12989n;

    static final class Ml extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f12991n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f12992t;

        Ml(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f12992t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return Dsr.this.n(null, 0, this);
        }
    }

    public static final class j extends SuspendLambda implements Function2 {
        final /* synthetic */ String J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f12993O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f12994n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f12995r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f12996t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Ref.ObjectRef objectRef, Continuation continuation, String str, int i2) {
            super(2, continuation);
            this.f12993O = objectRef;
            this.J2 = str;
            this.f12995r = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            j jVar = new j(this.f12993O, continuation, this.J2, this.f12995r);
            jVar.f12996t = obj;
            return jVar;
        }

        /* JADX WARN: Type inference failed for: r4v4, types: [T, aUP.Pl, java.lang.Object] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f12994n == 0) {
                ResultKt.throwOnFailure(obj);
                ?? pl = new Pl(new MediaMuxer(this.J2, this.f12995r));
                this.f12993O.element = pl;
                return pl;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final class n extends SuspendLambda implements Function2 {
        final /* synthetic */ FileDescriptor J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f12997O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f12998n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f12999r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f13000t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Ref.ObjectRef objectRef, Continuation continuation, FileDescriptor fileDescriptor, int i2) {
            super(2, continuation);
            this.f12997O = objectRef;
            this.J2 = fileDescriptor;
            this.f12999r = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            n nVar = new n(this.f12997O, continuation, this.J2, this.f12999r);
            nVar.f13000t = obj;
            return nVar;
        }

        /* JADX WARN: Type inference failed for: r3v4, types: [T, aUP.Pl, java.lang.Object] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f12998n == 0) {
                ResultKt.throwOnFailure(obj);
                C.n();
                ?? pl = new Pl(aC.n(this.J2, this.f12999r));
                this.f12997O.element = pl;
                return pl;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static final class w6 extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f13002n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f13003t;

        w6(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f13003t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return Dsr.this.rl(null, 0, this);
        }
    }

    public Dsr(lej ioDispatcher) {
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.f12989n = ioDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ase.w6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(FileDescriptor fileDescriptor, int i2, Continuation continuation) {
        Ml ml;
        Ref.ObjectRef objectRef;
        Object objM313constructorimpl;
        w9.fuX fux;
        if (continuation instanceof Ml) {
            ml = (Ml) continuation;
            int i3 = ml.J2;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ml.J2 = i3 - Integer.MIN_VALUE;
            } else {
                ml = new Ml(continuation);
            }
        }
        Object objUo = ml.f12992t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = ml.J2;
        try {
            if (i5 == 0) {
                ResultKt.throwOnFailure(objUo);
                lej lejVar = this.f12989n;
                Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                try {
                    Result.Companion companion = Result.INSTANCE;
                    n nVar = new n(objectRef2, null, fileDescriptor, i2);
                    ml.f12991n = objectRef2;
                    ml.J2 = 1;
                    objUo = GJW.Dsr.Uo(lejVar, nVar, ml);
                    if (objUo == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef = objectRef2;
                } catch (Throwable th) {
                    th = th;
                    objectRef = objectRef2;
                    Result.Companion companion2 = Result.INSTANCE;
                    objM313constructorimpl = Result.m313constructorimpl(ResultKt.createFailure(th));
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef = (Ref.ObjectRef) ml.f12991n;
                try {
                    ResultKt.throwOnFailure(objUo);
                } catch (Throwable th2) {
                    th = th2;
                    Result.Companion companion22 = Result.INSTANCE;
                    objM313constructorimpl = Result.m313constructorimpl(ResultKt.createFailure(th));
                }
            }
            objM313constructorimpl = Result.m313constructorimpl((w9.fuX) objUo);
            if (Result.m316exceptionOrNullimpl(objM313constructorimpl) != null && (fux = (w9.fuX) objectRef.element) != null) {
                fux.release();
            }
            ResultKt.throwOnFailure(objM313constructorimpl);
            return new j.w6(((Pl) objM313constructorimpl).gh());
        } catch (IOException e2) {
            return new j.n(new t2.Wre(e2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ase.w6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object rl(String str, int i2, Continuation continuation) {
        w6 w6Var;
        Ref.ObjectRef objectRef;
        Object objM313constructorimpl;
        w9.fuX fux;
        if (continuation instanceof w6) {
            w6Var = (w6) continuation;
            int i3 = w6Var.J2;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                w6Var.J2 = i3 - Integer.MIN_VALUE;
            } else {
                w6Var = new w6(continuation);
            }
        }
        Object objUo = w6Var.f13003t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = w6Var.J2;
        try {
            if (i5 == 0) {
                ResultKt.throwOnFailure(objUo);
                lej lejVar = this.f12989n;
                Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                try {
                    Result.Companion companion = Result.INSTANCE;
                    j jVar = new j(objectRef2, null, str, i2);
                    w6Var.f13002n = objectRef2;
                    w6Var.J2 = 1;
                    objUo = GJW.Dsr.Uo(lejVar, jVar, w6Var);
                    if (objUo == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef = objectRef2;
                } catch (Throwable th) {
                    th = th;
                    objectRef = objectRef2;
                    Result.Companion companion2 = Result.INSTANCE;
                    objM313constructorimpl = Result.m313constructorimpl(ResultKt.createFailure(th));
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef = (Ref.ObjectRef) w6Var.f13002n;
                try {
                    ResultKt.throwOnFailure(objUo);
                } catch (Throwable th2) {
                    th = th2;
                    Result.Companion companion22 = Result.INSTANCE;
                    objM313constructorimpl = Result.m313constructorimpl(ResultKt.createFailure(th));
                }
            }
            objM313constructorimpl = Result.m313constructorimpl((w9.fuX) objUo);
            if (Result.m316exceptionOrNullimpl(objM313constructorimpl) != null && (fux = (w9.fuX) objectRef.element) != null) {
                fux.release();
            }
            ResultKt.throwOnFailure(objM313constructorimpl);
            return new j.w6(((Pl) objM313constructorimpl).gh());
        } catch (IOException e2) {
            return new j.n(new t2.Wre(e2));
        }
    }

    public /* synthetic */ Dsr(lej lejVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? OU.rl() : lejVar);
    }
}
