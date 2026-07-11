package aUP;

import GJW.OU;
import GJW.lej;
import GJW.vd;
import LQ.fuX;
import LQ.j;
import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaMuxer;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.ExceptionsKt;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class fuX implements fOK.I28 {
    private static final w6 KN = new w6(null);
    private static final Function2 xMQ = new n(null);
    private final Function1 J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Function2 f13018O;
    private final lej Uo;
    private final ase.j nr;
    private final ase.w6 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ase.I28 f13019t;

    public static final class CN3 extends SuspendLambda implements Function2 {
        final /* synthetic */ LQ.w6 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ LQ.n f13020O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f13021n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f13022t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CN3(LQ.n nVar, Continuation continuation, LQ.w6 w6Var) {
            super(2, continuation);
            this.f13020O = nVar;
            this.J2 = w6Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            CN3 cn3 = new CN3(this.f13020O, continuation, this.J2);
            cn3.f13022t = obj;
            return cn3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f13021n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                TFv.CN3 cn3 = (TFv.CN3) this.f13022t;
                LQ.n nVar = this.f13020O;
                this.f13022t = cn3;
                this.f13021n = 1;
                obj = nVar.n(cn3, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            LQ.j jVar = (LQ.j) obj;
            if (!(jVar instanceof j.n)) {
                boolean z2 = jVar instanceof j.w6;
                return Unit.INSTANCE;
            }
            this.J2.n(new fOK.Ml((aUP.I28) ((j.n) jVar).n()));
            throw new KotlinNothingValueException();
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TFv.CN3 cn3, Continuation continuation) {
            return ((CN3) create(cn3, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class Dsr implements TFv.CN3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ LQ.w6 f13023n;

        Dsr(LQ.w6 w6Var) {
            this.f13023n = w6Var;
        }

        public final Object n(long j2, Continuation continuation) {
            Object objRl = this.f13023n.rl(d2n.Ml.rl(j2), continuation);
            return objRl == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objRl : Unit.INSTANCE;
        }

        @Override // TFv.CN3
        public /* bridge */ /* synthetic */ Object rl(Object obj, Continuation continuation) {
            return n(((d2n.Ml) obj).Ik(), continuation);
        }
    }

    static final class I28 implements TFv.CN3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ LQ.w6 f13024n;

        I28(LQ.w6 w6Var) {
            this.f13024n = w6Var;
        }

        public final Object n(long j2, Continuation continuation) {
            Object objRl = this.f13024n.rl(d2n.Ml.rl(j2), continuation);
            return objRl == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objRl : Unit.INSTANCE;
        }

        @Override // TFv.CN3
        public /* bridge */ /* synthetic */ Object rl(Object obj, Continuation continuation) {
            return n(((d2n.Ml) obj).Ik(), continuation);
        }
    }

    static final class Ml extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f13025n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f13026t;

        Ml(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            Ml ml = new Ml(continuation);
            ml.f13026t = obj;
            return ml;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f13025n == 0) {
                ResultKt.throwOnFailure(obj);
                return ArraysKt.minOrThrow((d2n.Ml[]) this.f13026t);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(d2n.Ml[] mlArr, Continuation continuation) {
            return ((Ml) create(mlArr, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final class Wre extends SuspendLambda implements Function2 {
        final /* synthetic */ LQ.w6 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ LQ.n f13027O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f13028n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f13029t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Wre(LQ.n nVar, Continuation continuation, LQ.w6 w6Var) {
            super(2, continuation);
            this.f13027O = nVar;
            this.J2 = w6Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            Wre wre = new Wre(this.f13027O, continuation, this.J2);
            wre.f13029t = obj;
            return wre;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f13028n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                TFv.CN3 cn3 = (TFv.CN3) this.f13029t;
                LQ.n nVar = this.f13027O;
                this.f13029t = cn3;
                this.f13028n = 1;
                obj = nVar.n(cn3, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            LQ.j jVar = (LQ.j) obj;
            if (!(jVar instanceof j.n)) {
                boolean z2 = jVar instanceof j.w6;
                return Unit.INSTANCE;
            }
            this.J2.n(new fOK.Ml((aUP.I28) ((j.n) jVar).n()));
            throw new KotlinNothingValueException();
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TFv.CN3 cn3, Continuation continuation) {
            return ((Wre) create(cn3, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final class aC implements LQ.n {
        final /* synthetic */ boolean J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Pair f13030O;
        final /* synthetic */ Pair nr;
        final /* synthetic */ Context rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Uri f13032t;

        public static final class j extends ContinuationImpl {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            int f13033O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f13034n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f13035t;

            public j(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f13035t = obj;
                this.f13033O |= Integer.MIN_VALUE;
                return aC.this.n(null, this);
            }
        }

        public static final class n extends SuspendLambda implements Function2 {
            Object E2;
            final /* synthetic */ fuX J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ LQ.CN3 f13036O;

            /* JADX INFO: renamed from: S, reason: collision with root package name */
            final /* synthetic */ Pair f13037S;

            /* JADX INFO: renamed from: X, reason: collision with root package name */
            Object f13038X;

            /* JADX INFO: renamed from: Z, reason: collision with root package name */
            final /* synthetic */ Pair f13039Z;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f13040e;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ boolean f13041g;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f13042n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ Uri f13043o;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ Context f13044r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private /* synthetic */ Object f13045t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public n(LQ.CN3 cn3, Continuation continuation, fuX fux, Context context, Uri uri, Pair pair, Pair pair2, boolean z2) {
                super(2, continuation);
                this.f13036O = cn3;
                this.J2 = fux;
                this.f13044r = context;
                this.f13043o = uri;
                this.f13039Z = pair;
                this.f13037S = pair2;
                this.f13041g = z2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                n nVar = new n(this.f13036O, continuation, this.J2, this.f13044r, this.f13043o, this.f13039Z, this.f13037S, this.f13041g);
                nVar.f13045t = obj;
                return nVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:25:0x008d A[Catch: all -> 0x00a0, TryCatch #0 {all -> 0x00a0, blocks: (B:23:0x0087, B:25:0x008d, B:30:0x00a8, B:28:0x00a4, B:46:0x00ed, B:47:0x00f2), top: B:52:0x0087 }] */
            /* JADX WARN: Removed duplicated region for block: B:28:0x00a4 A[Catch: all -> 0x00a0, TryCatch #0 {all -> 0x00a0, blocks: (B:23:0x0087, B:25:0x008d, B:30:0x00a8, B:28:0x00a4, B:46:0x00ed, B:47:0x00f2), top: B:52:0x0087 }] */
            /* JADX WARN: Removed duplicated region for block: B:35:0x00d4  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) throws Throwable {
                Throwable th;
                HandlerThread handlerThread;
                LQ.w6 ml;
                HandlerThread handlerThread2;
                n nVar;
                HandlerThread handlerThread3;
                LQ.w6 w6Var;
                HandlerThread handlerThread4;
                LQ.j nVar2;
                MediaMuxer mediaMuxer;
                Throwable th2;
                MediaMuxer mediaMuxer2;
                fuX fux;
                Handler handler;
                Pair pair;
                n nVar3;
                Pair pair2;
                boolean z2;
                HandlerThread handlerThread5;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f13042n;
                try {
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 == 2) {
                                mediaMuxer2 = (MediaMuxer) this.E2;
                                HandlerThread handlerThread6 = (HandlerThread) this.f13045t;
                                try {
                                    ResultKt.throwOnFailure(obj);
                                    handlerThread5 = handlerThread6;
                                    Unit unit = Unit.INSTANCE;
                                    mediaMuxer2.release();
                                    handlerThread5.quitSafely();
                                    return Unit.INSTANCE;
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    mediaMuxer2.release();
                                    throw th2;
                                }
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ml = (LQ.w6) this.f13038X;
                        HandlerThread handlerThread7 = (HandlerThread) this.f13040e;
                        handlerThread2 = (HandlerThread) this.E2;
                        w6Var = (LQ.w6) this.f13045t;
                        try {
                            ResultKt.throwOnFailure(obj);
                            handlerThread3 = handlerThread7;
                            handlerThread4 = handlerThread2;
                            nVar = this;
                            try {
                                nVar2 = (LQ.j) obj;
                                if (!(nVar2 instanceof j.n)) {
                                    nVar2 = new j.n(new fOK.w6((t2.I28) ((j.n) nVar2).n()));
                                } else if (!(nVar2 instanceof j.w6)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                mediaMuxer = (MediaMuxer) ml.O(nVar2);
                                HandlerThread handlerThread8 = handlerThread3;
                                try {
                                    fux = nVar.J2;
                                    handler = new Handler(handlerThread8.getLooper());
                                    pair = nVar.f13039Z;
                                    nVar3 = nVar;
                                    pair2 = nVar3.f13037S;
                                    z2 = nVar3.f13041g;
                                    nVar3.f13045t = handlerThread4;
                                    nVar3.E2 = mediaMuxer;
                                    nVar3.f13040e = null;
                                    nVar3.f13038X = null;
                                    nVar3.f13042n = 2;
                                    if (fux.Uo(w6Var, handler, mediaMuxer, pair, pair2, z2, nVar3) != coroutine_suspended) {
                                        handlerThread5 = handlerThread4;
                                        mediaMuxer2 = mediaMuxer;
                                        Unit unit2 = Unit.INSTANCE;
                                        mediaMuxer2.release();
                                        handlerThread5.quitSafely();
                                        return Unit.INSTANCE;
                                    }
                                    return coroutine_suspended;
                                } catch (Throwable th4) {
                                    th2 = th4;
                                    mediaMuxer2 = mediaMuxer;
                                    mediaMuxer2.release();
                                    throw th2;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                handlerThread = handlerThread4;
                                handlerThread.quitSafely();
                                throw th;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            th = th;
                            handlerThread = handlerThread2;
                            handlerThread.quitSafely();
                            throw th;
                        }
                    }
                    ResultKt.throwOnFailure(obj);
                    ml = new LQ.Ml(this.f13036O, (TFv.CN3) this.f13045t);
                    HandlerThread handlerThread9 = (HandlerThread) this.J2.J2.invoke("Exporter handler");
                    handlerThread9.start();
                    try {
                        ase.w6 w6Var2 = this.J2.rl;
                        Context context = this.f13044r;
                        Uri uri = this.f13043o;
                        this.f13045t = ml;
                        this.E2 = handlerThread9;
                        this.f13040e = handlerThread9;
                        this.f13038X = ml;
                        this.f13042n = 1;
                        nVar = this;
                        Object objO = ase.Ml.O(w6Var2, context, uri, 0, nVar, 4, null);
                        if (objO != coroutine_suspended) {
                            handlerThread3 = handlerThread9;
                            w6Var = ml;
                            obj = objO;
                            handlerThread4 = handlerThread3;
                            nVar2 = (LQ.j) obj;
                            if (!(nVar2 instanceof j.n)) {
                            }
                            mediaMuxer = (MediaMuxer) ml.O(nVar2);
                            HandlerThread handlerThread82 = handlerThread3;
                            fux = nVar.J2;
                            handler = new Handler(handlerThread82.getLooper());
                            pair = nVar.f13039Z;
                            nVar3 = nVar;
                            pair2 = nVar3.f13037S;
                            z2 = nVar3.f13041g;
                            nVar3.f13045t = handlerThread4;
                            nVar3.E2 = mediaMuxer;
                            nVar3.f13040e = null;
                            nVar3.f13038X = null;
                            nVar3.f13042n = 2;
                            if (fux.Uo(w6Var, handler, mediaMuxer, pair, pair2, z2, nVar3) != coroutine_suspended) {
                            }
                        }
                        return coroutine_suspended;
                    } catch (Throwable th7) {
                        th = th7;
                        handlerThread2 = handlerThread9;
                        th = th;
                        handlerThread = handlerThread2;
                        handlerThread.quitSafely();
                        throw th;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    handlerThread = 2;
                }
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(TFv.CN3 cn3, Continuation continuation) {
                return ((n) create(cn3, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public aC(Context context, Uri uri, Pair pair, Pair pair2, boolean z2) {
            this.rl = context;
            this.f13032t = uri;
            this.nr = pair;
            this.f13030O = pair2;
            this.J2 = z2;
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // LQ.n
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object n(TFv.CN3 cn3, Continuation continuation) throws fuX.j {
            j jVar;
            fuX.j jVar2;
            LQ.fuX fux;
            if (continuation instanceof j) {
                jVar = (j) continuation;
                int i2 = jVar.f13033O;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    jVar.f13033O = i2 - Integer.MIN_VALUE;
                } else {
                    jVar = new j(continuation);
                }
            }
            Object obj = jVar.f13035t;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = jVar.f13033O;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                LQ.fuX fux2 = new LQ.fuX();
                try {
                    TFv.Wre wreIF = TFv.fuX.iF(new n(fux2, null, fuX.this, this.rl, this.f13032t, this.nr, this.f13030O, this.J2));
                    jVar.f13034n = fux2;
                    jVar.f13033O = 1;
                    if (wreIF.n(cn3, jVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    fux = fux2;
                } catch (fuX.j e2) {
                    jVar2 = e2;
                    fux = fux2;
                    if (jVar2.rl() != fux) {
                        return new j.n(jVar2.n());
                    }
                    throw jVar2;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fux = (LQ.fuX) jVar.f13034n;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (fuX.j e3) {
                    jVar2 = e3;
                    if (jVar2.rl() != fux) {
                    }
                }
            }
            return new j.w6(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: aUP.fuX$fuX, reason: collision with other inner class name */
    public static final class C0474fuX implements LQ.n {
        final /* synthetic */ boolean J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Pair f13046O;
        final /* synthetic */ Pair nr;
        final /* synthetic */ Context rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Uri f13048t;

        /* JADX INFO: renamed from: aUP.fuX$fuX$j */
        public static final class j extends ContinuationImpl {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            int f13049O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f13050n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f13051t;

            public j(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f13051t = obj;
                this.f13049O |= Integer.MIN_VALUE;
                return C0474fuX.this.n(null, this);
            }
        }

        /* JADX INFO: renamed from: aUP.fuX$fuX$n */
        public static final class n extends SuspendLambda implements Function2 {
            final /* synthetic */ fuX J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ LQ.CN3 f13052O;

            /* JADX INFO: renamed from: S, reason: collision with root package name */
            final /* synthetic */ Pair f13053S;

            /* JADX INFO: renamed from: Z, reason: collision with root package name */
            final /* synthetic */ Pair f13054Z;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ boolean f13055g;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f13056n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ Uri f13057o;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ Context f13058r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private /* synthetic */ Object f13059t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public n(LQ.CN3 cn3, Continuation continuation, fuX fux, Context context, Uri uri, Pair pair, Pair pair2, boolean z2) {
                super(2, continuation);
                this.f13052O = cn3;
                this.J2 = fux;
                this.f13058r = context;
                this.f13057o = uri;
                this.f13054Z = pair;
                this.f13053S = pair2;
                this.f13055g = z2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                n nVar = new n(this.f13052O, continuation, this.J2, this.f13058r, this.f13057o, this.f13054Z, this.f13053S, this.f13055g);
                nVar.f13059t = obj;
                return nVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f13056n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    LQ.Ml ml = new LQ.Ml(this.f13052O, (TFv.CN3) this.f13059t);
                    TFv.Wre wreE = TFv.fuX.e(TFv.fuX.HI(ml.J2(this.J2.KN(this.f13058r, this.f13057o, this.f13054Z, this.f13053S, this.f13055g))), this.J2.Uo);
                    Dsr dsr = new Dsr(ml);
                    this.f13056n = 1;
                    if (wreE.n(dsr, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(TFv.CN3 cn3, Continuation continuation) {
                return ((n) create(cn3, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public C0474fuX(Context context, Uri uri, Pair pair, Pair pair2, boolean z2) {
            this.rl = context;
            this.f13048t = uri;
            this.nr = pair;
            this.f13046O = pair2;
            this.J2 = z2;
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // LQ.n
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object n(TFv.CN3 cn3, Continuation continuation) throws fuX.j {
            j jVar;
            fuX.j jVar2;
            LQ.fuX fux;
            if (continuation instanceof j) {
                jVar = (j) continuation;
                int i2 = jVar.f13049O;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    jVar.f13049O = i2 - Integer.MIN_VALUE;
                } else {
                    jVar = new j(continuation);
                }
            }
            Object obj = jVar.f13051t;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = jVar.f13049O;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                LQ.fuX fux2 = new LQ.fuX();
                try {
                    TFv.Wre wreIF = TFv.fuX.iF(new n(fux2, null, fuX.this, this.rl, this.f13048t, this.nr, this.f13046O, this.J2));
                    jVar.f13050n = fux2;
                    jVar.f13049O = 1;
                    if (wreIF.n(cn3, jVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    fux = fux2;
                } catch (fuX.j e2) {
                    jVar2 = e2;
                    fux = fux2;
                    if (jVar2.rl() != fux) {
                        return new j.n(jVar2.n());
                    }
                    throw jVar2;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fux = (LQ.fuX) jVar.f13050n;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (fuX.j e3) {
                    jVar2 = e3;
                    if (jVar2.rl() != fux) {
                    }
                }
            }
            return new j.w6(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class j extends Lambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f13060n = new j();

        j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final HandlerThread invoke(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new HandlerThread(it);
        }
    }

    static final class n extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f13061n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f13062t;

        public static final class j extends SuspendLambda implements Function2 {
            final /* synthetic */ String J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ Ref.ObjectRef f13063O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f13064n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private /* synthetic */ Object f13065t;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public j(Ref.ObjectRef objectRef, Continuation continuation, String str) {
                super(2, continuation);
                this.f13063O = objectRef;
                this.J2 = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                j jVar = new j(this.f13063O, continuation, this.J2);
                jVar.f13065t = obj;
                return jVar;
            }

            /* JADX WARN: Type inference failed for: r3v4, types: [T, aUP.fuX$w6$j, java.lang.Object] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws IOException {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f13064n == 0) {
                    ResultKt.throwOnFailure(obj);
                    MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(this.J2);
                    Intrinsics.checkNotNullExpressionValue(mediaCodecCreateByCodecName, "createByCodecName(name)");
                    ?? jVar = new w6.j(mediaCodecCreateByCodecName);
                    this.f13063O.element = jVar;
                    return jVar;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        n(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            n nVar = new n(continuation);
            nVar.f13062t = obj;
            return nVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation continuation) {
            return ((n) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws InterruptedException {
            Ref.ObjectRef objectRef;
            Object objM313constructorimpl;
            Object nVar;
            w9.fuX fux;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f13061n;
            if (i2 != 0) {
                if (i2 == 1) {
                    objectRef = (Ref.ObjectRef) this.f13062t;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th) {
                        th = th;
                        Result.Companion companion = Result.INSTANCE;
                        objM313constructorimpl = Result.m313constructorimpl(ResultKt.createFailure(th));
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                String str = (String) this.f13062t;
                j.C0208j c0208j = LQ.j.f6082n;
                try {
                    lej lejVarRl = OU.rl();
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    try {
                        Result.Companion companion2 = Result.INSTANCE;
                        j jVar = new j(objectRef2, null, str);
                        this.f13062t = objectRef2;
                        this.f13061n = 1;
                        obj = GJW.Dsr.Uo(lejVarRl, jVar, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        objectRef = objectRef2;
                    } catch (Throwable th2) {
                        th = th2;
                        objectRef = objectRef2;
                        Result.Companion companion3 = Result.INSTANCE;
                        objM313constructorimpl = Result.m313constructorimpl(ResultKt.createFailure(th));
                    }
                } catch (InterruptedException e2) {
                    throw e2;
                } catch (CancellationException e3) {
                    throw e3;
                } catch (Exception e4) {
                    nVar = new j.n(e4);
                }
            }
            objM313constructorimpl = Result.m313constructorimpl((w9.fuX) obj);
            if (Result.m316exceptionOrNullimpl(objM313constructorimpl) != null && (fux = (w9.fuX) objectRef.element) != null) {
                fux.release();
            }
            ResultKt.throwOnFailure(objM313constructorimpl);
            nVar = new j.w6(((w6.j) objM313constructorimpl).gh());
            if (nVar instanceof j.n) {
                return new j.n(new aUP.I28(ExceptionsKt.stackTraceToString((Exception) ((j.n) nVar).n())));
            }
            if (nVar instanceof j.w6) {
                return nVar;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    private static final class w6 {

        private static final class j implements w9.fuX {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final MediaCodec f13066n;

            public j(MediaCodec codec) {
                Intrinsics.checkNotNullParameter(codec, "codec");
                this.f13066n = codec;
            }

            public final MediaCodec gh() {
                return this.f13066n;
            }

            @Override // w9.fuX
            public void release() {
                this.f13066n.release();
            }
        }

        public /* synthetic */ w6(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private w6() {
        }
    }

    public fuX(ase.w6 mediaMuxerFactory, ase.I28 videoEncoderProvider, ase.j audioEncoderProvider, Function2 codecProvider, Function1 handlerThreadFactory, lej exportDispatcher) {
        Intrinsics.checkNotNullParameter(mediaMuxerFactory, "mediaMuxerFactory");
        Intrinsics.checkNotNullParameter(videoEncoderProvider, "videoEncoderProvider");
        Intrinsics.checkNotNullParameter(audioEncoderProvider, "audioEncoderProvider");
        Intrinsics.checkNotNullParameter(codecProvider, "codecProvider");
        Intrinsics.checkNotNullParameter(handlerThreadFactory, "handlerThreadFactory");
        Intrinsics.checkNotNullParameter(exportDispatcher, "exportDispatcher");
        this.rl = mediaMuxerFactory;
        this.f13019t = videoEncoderProvider;
        this.nr = audioEncoderProvider;
        this.f13018O = codecProvider;
        this.J2 = handlerThreadFactory;
        this.Uo = exportDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object Uo(LQ.w6 w6Var, Handler handler, MediaMuxer mediaMuxer, Pair pair, Pair pair2, boolean z2, Continuation continuation) {
        TFv.Wre wreIF;
        TFv.Wre wreIF2;
        Object objN;
        if (pair != null) {
            oC.Wre wre = (oC.Wre) pair.component1();
            fOK.Wre wre2 = (fOK.Wre) pair.component2();
            LQ.j jVarN = this.f13019t.n(wre);
            if (jVarN instanceof j.n) {
                fOK.n nVar = (fOK.n) ((j.n) jVarN).n();
                if (!z2) {
                    w6Var.n(nVar);
                    throw new KotlinNothingValueException();
                }
                objN = (List) w6Var.O(this.f13019t.rl(wre.Uo()));
            } else {
                if (!(jVarN instanceof j.w6)) {
                    throw new NoWhenBranchMatchedException();
                }
                objN = ((j.w6) jVarN).n();
            }
            wreIF = TFv.fuX.iF(new CN3(aUP.CN3.KN(wre2, (List) objN, oC.CN3.n(wre), handler, this.f13018O), null, w6Var));
        } else {
            wreIF = null;
        }
        if (pair2 != null) {
            oC.n nVar2 = (oC.n) pair2.component1();
            wreIF2 = TFv.fuX.iF(new Wre(aUP.CN3.nr((TFv.Wre) pair2.component2(), (String) w6Var.O(this.nr.rl(nVar2)), oC.w6.n(nVar2), handler, this.f13018O), null, w6Var));
        } else {
            wreIF2 = null;
        }
        List listListOfNotNull = CollectionsKt.listOfNotNull((Object[]) new TFv.Wre[]{wreIF, wreIF2});
        if (pair != null) {
            mediaMuxer.setOrientationHint(((oC.Wre) pair.getFirst()).nr().n().rl());
        }
        Object objN2 = TFv.fuX.Ik(qz.n(listListOfNotNull, mediaMuxer, new Ml(null))).n(new I28(w6Var), continuation);
        return objN2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN2 : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LQ.n KN(Context context, Uri uri, Pair pair, Pair pair2, boolean z2) {
        return new aC(context, uri, pair, pair2, z2);
    }

    @Override // fOK.I28
    public LQ.n n(Context context, Uri outputUri, Pair pair, Pair pair2, boolean z2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(outputUri, "outputUri");
        if (pair == null && pair2 == null) {
            throw new IllegalArgumentException("Either video track or audio track must be not null");
        }
        return new C0474fuX(context, outputUri, pair, pair2, z2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ fuX(ase.w6 w6Var, ase.I28 i28, ase.j jVar, Function2 function2, Function1 function1, lej lejVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        int i3 = 1;
        this((i2 & 1) != 0 ? new aUP.Dsr(null, i3, 0 == true ? 1 : 0) : w6Var, (i2 & 2) != 0 ? new Xo(0 == true ? 1 : 0, i3, 0 == true ? 1 : 0) : i28, (i2 & 4) != 0 ? new aUP.j(null, 1, null) : jVar, (i2 & 8) != 0 ? xMQ : function2, (i2 & 16) != 0 ? j.f13060n : function1, (i2 & 32) != 0 ? OU.rl() : lejVar);
    }
}
