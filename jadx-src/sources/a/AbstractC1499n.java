package a;

import GJW.C;
import GJW.Lu;
import GJW.vd;
import GJW.xuv;
import Si.Xo;
import Si.o;
import TFv.CN3;
import TFv.rv6;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: a.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class AbstractC1499n {
    private final MutableState J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final MutableState f12638O;
    private xuv Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final o f12639n;
    private final MutableState nr;
    private final vd rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final MutableState f12640t;

    /* JADX INFO: renamed from: a.n$j */
    static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f12641n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        j(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return AbstractC1499n.this.new j(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f12641n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                AbstractC1499n abstractC1499n = AbstractC1499n.this;
                this.f12641n = 1;
                if (abstractC1499n.ck(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: a.n$n, reason: collision with other inner class name */
    static final class C0463n extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f12644n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f12645t;

        /* JADX INFO: renamed from: a.n$n$j */
        static final class j extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f12646n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ AbstractC1499n f12647t;

            /* JADX INFO: renamed from: a.n$n$j$j, reason: collision with other inner class name */
            static final class C0464j implements CN3 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ AbstractC1499n f12648n;

                C0464j(AbstractC1499n abstractC1499n) {
                    this.f12648n = abstractC1499n;
                }

                public final Object n(boolean z2, Continuation continuation) {
                    this.f12648n.f12640t.setValue(Boxing.boxBoolean(z2));
                    return Unit.INSTANCE;
                }

                @Override // TFv.CN3
                public /* bridge */ /* synthetic */ Object rl(Object obj, Continuation continuation) {
                    return n(((Boolean) obj).booleanValue(), continuation);
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(AbstractC1499n abstractC1499n, Continuation continuation) {
                super(2, continuation);
                this.f12647t = abstractC1499n;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new j(this.f12647t, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f12646n;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                    rv6 rv6VarX = this.f12647t.nr().X();
                    C0464j c0464j = new C0464j(this.f12647t);
                    this.f12646n = 1;
                    if (rv6VarX.n(c0464j, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                throw new KotlinNothingValueException();
            }
        }

        /* JADX INFO: renamed from: a.n$n$n, reason: collision with other inner class name */
        static final class C0465n extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f12649n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ AbstractC1499n f12650t;

            /* JADX INFO: renamed from: a.n$n$n$j */
            static final class j implements CN3 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ AbstractC1499n f12651n;

                j(AbstractC1499n abstractC1499n) {
                    this.f12651n = abstractC1499n;
                }

                @Override // TFv.CN3
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object rl(o.j jVar, Continuation continuation) {
                    this.f12651n.nr.setValue(Boxing.boxLong(jVar.rl() / ((long) 1000)));
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((C0465n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0465n(AbstractC1499n abstractC1499n, Continuation continuation) {
                super(2, continuation);
                this.f12650t = abstractC1499n;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C0465n(this.f12650t, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f12649n;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                    rv6 currentPosition = this.f12650t.nr().getCurrentPosition();
                    j jVar = new j(this.f12650t);
                    this.f12649n = 1;
                    if (currentPosition.n(jVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                throw new KotlinNothingValueException();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((C0463n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        C0463n(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C0463n c0463n = AbstractC1499n.this.new C0463n(continuation);
            c0463n.f12645t = obj;
            return c0463n;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f12644n == 0) {
                ResultKt.throwOnFailure(obj);
                vd vdVar = (vd) this.f12645t;
                C.nr(vdVar, null, null, new j(AbstractC1499n.this, null), 3, null);
                return C.nr(vdVar, null, null, new C0465n(AbstractC1499n.this, null), 3, null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void HI(int i2) {
        Ik(false);
        this.f12639n.HI(i2, true);
    }

    public final void az() {
        Ik(false);
    }

    public final void ty(long j2) {
        Ik(false);
        this.f12639n.seekTo((int) j2);
    }

    public AbstractC1499n(o player, vd scope) {
        Intrinsics.checkNotNullParameter(player, "player");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f12639n = player;
        this.rl = scope;
        Boolean bool = Boolean.FALSE;
        this.f12640t = SnapshotStateKt__SnapshotStateKt.O(bool, null, 2, null);
        this.nr = SnapshotStateKt__SnapshotStateKt.O(0L, null, 2, null);
        this.f12638O = SnapshotStateKt__SnapshotStateKt.O(1, null, 2, null);
        this.J2 = SnapshotStateKt__SnapshotStateKt.O(bool, null, 2, null);
        this.Uo = C.nr(scope, null, null, new j(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object ck(Continuation continuation) {
        Object objJ2 = Lu.J2(new C0463n(null), continuation);
        return objJ2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objJ2 : Unit.INSTANCE;
    }

    protected void Ik(boolean z2) {
        if (z2) {
            Xo.j.n(this.f12639n, false, 1, null);
        } else {
            this.f12639n.pause();
        }
    }

    public long J2() {
        return this.f12639n.t();
    }

    public final boolean KN() {
        return ((Boolean) this.J2.getValue()).booleanValue();
    }

    protected final long O() {
        return RangesKt.coerceAtMost(((Number) this.nr.getValue()).longValue(), J2());
    }

    protected final int Uo() {
        return ((Number) this.f12638O.getValue()).intValue();
    }

    public void gh() {
        this.J2.setValue(Boolean.TRUE);
    }

    public void mUb() {
        this.J2.setValue(Boolean.FALSE);
    }

    public final o nr() {
        return this.f12639n;
    }

    public final void r(int i2) {
        this.f12638O.setValue(Integer.valueOf(i2));
    }

    public final boolean xMQ() {
        return ((Boolean) this.f12640t.getValue()).booleanValue();
    }

    public final void o(float f3) {
        ty((long) ((J2() * Math.max(0.0f, Math.min(f3, Uo()))) / Uo()));
    }

    public final void qie() {
        Ik(!xMQ());
    }
}
