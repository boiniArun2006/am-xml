package cg;

import GJW.OU;
import GJW.vd;
import android.content.Context;
import androidx.content.core.DataStore;
import cg.w6;
import com.google.protobuf.g9s;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Dsr {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f43763n;

    static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ String f43764O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f43765n;

        /* JADX INFO: renamed from: cg.Dsr$j$j, reason: collision with other inner class name */
        public static final class C0596j implements TFv.Wre {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ TFv.Wre f43767n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ String f43768t;

            /* JADX INFO: renamed from: cg.Dsr$j$j$j, reason: collision with other inner class name */
            public static final class C0597j implements TFv.CN3 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ TFv.CN3 f43769n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ String f43770t;

                /* JADX INFO: renamed from: cg.Dsr$j$j$j$j, reason: collision with other inner class name */
                public static final class C0598j extends ContinuationImpl {

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    /* synthetic */ Object f43772n;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    int f43773t;

                    public C0598j(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f43772n = obj;
                        this.f43773t |= Integer.MIN_VALUE;
                        return C0597j.this.rl(null, this);
                    }
                }

                public C0597j(TFv.CN3 cn3, String str) {
                    this.f43769n = cn3;
                    this.f43770t = str;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
                @Override // TFv.CN3
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object rl(Object obj, Continuation continuation) {
                    C0598j c0598j;
                    if (continuation instanceof C0598j) {
                        c0598j = (C0598j) continuation;
                        int i2 = c0598j.f43773t;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c0598j.f43773t = i2 - Integer.MIN_VALUE;
                        } else {
                            c0598j = new C0598j(continuation);
                        }
                    }
                    Object obj2 = c0598j.f43772n;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i3 = c0598j.f43773t;
                    if (i3 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        TFv.CN3 cn3 = this.f43769n;
                        CN3 cn32 = (CN3) ((w6) obj).mUb().get(this.f43770t);
                        Wre wre = cn32 != null ? new Wre(cn32.ck(), cn32.Ik(), cn32.r(), cn32.o(), cn32.HI()) : null;
                        c0598j.f43773t = 1;
                        if (cn3.rl(wre, c0598j) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i3 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            public C0596j(TFv.Wre wre, String str) {
                this.f43767n = wre;
                this.f43768t = str;
            }

            @Override // TFv.Wre
            public Object n(TFv.CN3 cn3, Continuation continuation) {
                Object objN = this.f43767n.n(new C0597j(cn3, this.f43768t), continuation);
                return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, Continuation continuation) {
            super(2, continuation);
            this.f43764O = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Dsr.this.new j(this.f43764O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f43765n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C0596j c0596j = new C0596j(aC.rl(Dsr.this.f43763n).getData(), this.f43764O);
            this.f43765n = 1;
            Object objG = TFv.fuX.g(c0596j, this);
            if (objG == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objG;
        }
    }

    static final class n extends SuspendLambda implements Function2 {
        final /* synthetic */ Wre J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ String f43774O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f43775n;

        static final class j extends SuspendLambda implements Function2 {
            final /* synthetic */ Wre J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ String f43777O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f43778n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f43779t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(String str, Wre wre, Continuation continuation) {
                super(2, continuation);
                this.f43777O = str;
                this.J2 = wre;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                j jVar = new j(this.f43777O, this.J2, continuation);
                jVar.f43779t = obj;
                return jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f43778n == 0) {
                    ResultKt.throwOnFailure(obj);
                    g9s g9sVarBuild = ((w6.C0601w6) ((w6) this.f43779t).toBuilder()).xMQ(this.f43777O, (CN3) CN3.Z().mUb(this.J2.nr()).gh(this.J2.O()).qie(this.J2.J2()).az(this.J2.Uo()).xMQ(this.J2.t()).build()).build();
                    Intrinsics.checkNotNullExpressionValue(g9sVarBuild, "build(...)");
                    return g9sVarBuild;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(w6 w6Var, Continuation continuation) {
                return ((j) create(w6Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(String str, Wre wre, Continuation continuation) {
            super(2, continuation);
            this.f43774O = str;
            this.J2 = wre;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Dsr.this.new n(this.f43774O, this.J2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f43775n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            DataStore dataStoreRl = aC.rl(Dsr.this.f43763n);
            j jVar = new j(this.f43774O, this.J2, null);
            this.f43775n = 1;
            Object objN = dataStoreRl.n(jVar, this);
            if (objN == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objN;
        }
    }

    public Dsr(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f43763n = context;
    }

    public final Object rl(String str, Continuation continuation) {
        return GJW.Dsr.Uo(OU.rl(), new j(str, null), continuation);
    }

    public final Object t(Wre wre, String str, Continuation continuation) {
        return GJW.Dsr.Uo(OU.rl(), new n(str, wre, null), continuation);
    }
}
