package aUP;

import android.media.MediaMuxer;
import ase.n;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class qz {

    static final class j extends SuspendLambda implements Function2 {
        final /* synthetic */ MediaMuxer J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ List f13078O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f13079n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Function2 f13080r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f13081t;

        /* JADX INFO: renamed from: aUP.qz$j$j, reason: collision with other inner class name */
        public static final class C0476j implements TFv.Wre {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ TFv.Wre[] f13082n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Function2 f13083t;

            /* JADX INFO: renamed from: aUP.qz$j$j$j, reason: collision with other inner class name */
            static final class C0477j extends Lambda implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ TFv.Wre[] f13084n;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0477j(TFv.Wre[] wreArr) {
                    super(0);
                    this.f13084n = wreArr;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object[] invoke() {
                    return new d2n.Ml[this.f13084n.length];
                }
            }

            /* JADX INFO: renamed from: aUP.qz$j$j$n */
            public static final class n extends SuspendLambda implements Function3 {
                final /* synthetic */ Function2 J2;

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                /* synthetic */ Object f13085O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f13086n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                private /* synthetic */ Object f13087t;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public n(Function2 function2, Continuation continuation) {
                    super(3, continuation);
                    this.J2 = function2;
                }

                @Override // kotlin.jvm.functions.Function3
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object invoke(TFv.CN3 cn3, Object[] objArr, Continuation continuation) {
                    n nVar = new n(this.J2, continuation);
                    nVar.f13087t = cn3;
                    nVar.f13085O = objArr;
                    return nVar.invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
                
                    if (r1.rl(r6, r5) == r0) goto L15;
                 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    TFv.CN3 cn3;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.f13086n;
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 == 2) {
                                ResultKt.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        cn3 = (TFv.CN3) this.f13087t;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        ResultKt.throwOnFailure(obj);
                        cn3 = (TFv.CN3) this.f13087t;
                        Object[] objArr = (Object[]) this.f13085O;
                        Function2 function2 = this.J2;
                        this.f13087t = cn3;
                        this.f13086n = 1;
                        obj = function2.invoke(objArr, this);
                        if (obj != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                    this.f13087t = null;
                    this.f13086n = 2;
                }
            }

            public C0476j(TFv.Wre[] wreArr, Function2 function2) {
                this.f13082n = wreArr;
                this.f13083t = function2;
            }

            @Override // TFv.Wre
            public Object n(TFv.CN3 cn3, Continuation continuation) {
                TFv.Wre[] wreArr = this.f13082n;
                Object objN = teV.Dsr.n(cn3, wreArr, new C0477j(wreArr), new n(this.f13083t, null), continuation);
                return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
            }
        }

        public static final class n implements TFv.Wre {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ TFv.Wre f13088n;

            /* JADX INFO: renamed from: aUP.qz$j$n$j, reason: collision with other inner class name */
            public static final class C0478j implements TFv.CN3 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ TFv.CN3 f13089n;

                /* JADX INFO: renamed from: aUP.qz$j$n$j$j, reason: collision with other inner class name */
                public static final class C0479j extends ContinuationImpl {

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    /* synthetic */ Object f13091n;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    int f13092t;

                    public C0479j(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f13091n = obj;
                        this.f13092t |= Integer.MIN_VALUE;
                        return C0478j.this.rl(null, this);
                    }
                }

                public C0478j(TFv.CN3 cn3) {
                    this.f13089n = cn3;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // TFv.CN3
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object rl(Object obj, Continuation continuation) {
                    C0479j c0479j;
                    if (continuation instanceof C0479j) {
                        c0479j = (C0479j) continuation;
                        int i2 = c0479j.f13092t;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c0479j.f13092t = i2 - Integer.MIN_VALUE;
                        } else {
                            c0479j = new C0479j(continuation);
                        }
                    }
                    Object obj2 = c0479j.f13091n;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i3 = c0479j.f13092t;
                    if (i3 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        TFv.CN3 cn3 = this.f13089n;
                        ase.n nVar = (ase.n) obj;
                        d2n.Ml mlRl = null;
                        if (nVar instanceof n.j) {
                            n.j jVar = (n.j) nVar;
                            if (!oVe.j.rl(jVar.rl())) {
                                mlRl = d2n.Ml.rl(d2n.Ml.f63370t.n(jVar.rl().presentationTimeUs));
                            }
                        }
                        if (mlRl != null) {
                            c0479j.f13092t = 1;
                            if (cn3.rl(mlRl, c0479j) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
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

            public n(TFv.Wre wre) {
                this.f13088n = wre;
            }

            @Override // TFv.Wre
            public Object n(TFv.CN3 cn3, Continuation continuation) {
                Object objN = this.f13088n.n(new C0478j(cn3), continuation);
                return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
            }
        }

        static final class w6 extends SuspendLambda implements Function2 {
            final /* synthetic */ int J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ o f13093O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f13094n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f13095t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            w6(o oVar, int i2, Continuation continuation) {
                super(2, continuation);
                this.f13093O = oVar;
                this.J2 = i2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                w6 w6Var = new w6(this.f13093O, this.J2, continuation);
                w6Var.f13095t = obj;
                return w6Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f13094n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    ase.n nVar = (ase.n) this.f13095t;
                    o oVar = this.f13093O;
                    int i3 = this.J2;
                    this.f13094n = 1;
                    if (oVar.rl(i3, nVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(ase.n nVar, Continuation continuation) {
                return ((w6) create(nVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(List list, MediaMuxer mediaMuxer, Function2 function2, Continuation continuation) {
            super(2, continuation);
            this.f13078O = list;
            this.J2 = mediaMuxer;
            this.f13080r = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            j jVar = new j(this.f13078O, this.J2, this.f13080r, continuation);
            jVar.f13081t = obj;
            return jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            o oVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f13079n;
            if (i2 != 0) {
                if (i2 == 1) {
                    oVar = (o) this.f13081t;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                TFv.CN3 cn3 = (TFv.CN3) this.f13081t;
                o oVar2 = new o(this.f13078O.size(), this.J2);
                List list = this.f13078O;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                int i3 = 0;
                for (Object obj2 : list) {
                    int i5 = i3 + 1;
                    if (i3 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    arrayList.add(new n(TFv.fuX.s7N((TFv.Wre) obj2, new w6(oVar2, i3, null))));
                    i3 = i5;
                }
                Function2 function2 = this.f13080r;
                Object[] array = CollectionsKt.toList(arrayList).toArray(new TFv.Wre[0]);
                if (array != null) {
                    C0476j c0476j = new C0476j((TFv.Wre[]) array, function2);
                    this.f13081t = oVar2;
                    this.f13079n = 1;
                    if (TFv.fuX.S(cn3, c0476j, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    oVar = oVar2;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
            }
            oVar.n();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TFv.CN3 cn3, Continuation continuation) {
            return ((j) create(cn3, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final TFv.Wre n(List list, MediaMuxer muxer, Function2 transform) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(muxer, "muxer");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return TFv.fuX.iF(new j(list, muxer, transform, null));
    }
}
