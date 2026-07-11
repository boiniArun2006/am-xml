package androidx.compose.runtime;

import GJW.AbstractC1363t;
import GJW.Lu;
import GJW.Pl;
import GJW.vd;
import GJW.xuv;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSet;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.collection.ScatterSetWrapper;
import androidx.compose.runtime.snapshots.ObserverHandle;
import androidx.compose.runtime.snapshots.ReaderKind;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2", f = "Recomposer.kt", i = {0, 0}, l = {1072}, m = "invokeSuspend", n = {"callingJob", "unregisterApplyObserver"}, s = {"L$0", "L$1"})
@SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$recompositionRunner$2\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,1791:1\n33#2,2:1792\n33#2,2:1800\n33#3,6:1794\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$recompositionRunner$2\n*L\n1070#1:1792,2\n1075#1:1800,2\n1070#1:1794,6\n*E\n"})
final class Recomposer$recompositionRunner$2 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
    final /* synthetic */ Recomposer J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private /* synthetic */ Object f30305O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f30306n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ MonotonicFrameClock f30307o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ Function3 f30308r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f30309t;

    /* JADX INFO: renamed from: androidx.compose.runtime.Recomposer$recompositionRunner$2$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2$3", f = "Recomposer.kt", i = {}, l = {1072}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass3 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
        final /* synthetic */ MonotonicFrameClock J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function3 f30310O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f30311n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f30312t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(Function3 function3, MonotonicFrameClock monotonicFrameClock, Continuation continuation) {
            super(2, continuation);
            this.f30310O = function3;
            this.J2 = monotonicFrameClock;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.f30310O, this.J2, continuation);
            anonymousClass3.f30312t = obj;
            return anonymousClass3;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(vd vdVar, Continuation continuation) {
            return ((AnonymousClass3) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
            return invoke2(vdVar, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f30311n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                vd vdVar = (vd) this.f30312t;
                Function3 function3 = this.f30310O;
                MonotonicFrameClock monotonicFrameClock = this.J2;
                this.f30311n = 1;
                if (function3.invoke(vdVar, monotonicFrameClock, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Recomposer$recompositionRunner$2(Recomposer recomposer, Function3 function3, MonotonicFrameClock monotonicFrameClock, Continuation continuation) {
        super(2, continuation);
        this.J2 = recomposer;
        this.f30308r = function3;
        this.f30307o = monotonicFrameClock;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        Recomposer$recompositionRunner$2 recomposer$recompositionRunner$2 = new Recomposer$recompositionRunner$2(this.J2, this.f30308r, this.f30307o, continuation);
        recomposer$recompositionRunner$2.f30305O = obj;
        return recomposer$recompositionRunner$2;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vd vdVar, Continuation continuation) {
        return ((Recomposer$recompositionRunner$2) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
        return invoke2(vdVar, (Continuation) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0099 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        xuv xuvVarAz;
        ObserverHandle observerHandle;
        Throwable th;
        List listEWT;
        Object obj2;
        Object obj3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f30309t;
        if (i2 != 0) {
            if (i2 == 1) {
                observerHandle = (ObserverHandle) this.f30306n;
                xuvVarAz = (xuv) this.f30305O;
                try {
                    ResultKt.throwOnFailure(obj);
                    observerHandle.n();
                    obj3 = this.J2.stateLock;
                    Recomposer recomposer = this.J2;
                    synchronized (obj3) {
                        try {
                            if (recomposer.runnerJob == xuvVarAz) {
                                recomposer.runnerJob = null;
                            }
                            recomposer.m();
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    Recomposer.INSTANCE.nr(this.J2.recomposerInfo);
                    return Unit.INSTANCE;
                } catch (Throwable th3) {
                    th = th3;
                    observerHandle.n();
                    obj2 = this.J2.stateLock;
                    Recomposer recomposer2 = this.J2;
                    synchronized (obj2) {
                    }
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            xuvVarAz = AbstractC1363t.az(((vd) this.f30305O).getCoroutineContext());
            this.J2.i(xuvVarAz);
            Snapshot.Companion companion = Snapshot.INSTANCE;
            final Recomposer recomposer3 = this.J2;
            ObserverHandle observerHandleXMQ = companion.xMQ(new Function2<Set<? extends Object>, Snapshot, Unit>() { // from class: androidx.compose.runtime.Recomposer$recompositionRunner$2$unregisterApplyObserver$1
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Set<? extends Object> set, Snapshot snapshot) {
                    n(set, snapshot);
                    return Unit.INSTANCE;
                }

                public final void n(Set set, Snapshot snapshot) {
                    Pl plM;
                    Object obj4 = recomposer3.stateLock;
                    Recomposer recomposer4 = recomposer3;
                    synchronized (obj4) {
                        try {
                            if (((Recomposer.State) recomposer4._state.getValue()).compareTo(Recomposer.State.f30292r) >= 0) {
                                MutableScatterSet mutableScatterSet = recomposer4.snapshotInvalidations;
                                if (set instanceof ScatterSetWrapper) {
                                    ScatterSet set2 = ((ScatterSetWrapper) set).getSet();
                                    Object[] objArr = set2.elements;
                                    long[] jArr = set2.metadata;
                                    int length = jArr.length - 2;
                                    if (length >= 0) {
                                        int i3 = 0;
                                        while (true) {
                                            long j2 = jArr[i3];
                                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i5 = 8 - ((~(i3 - length)) >>> 31);
                                                for (int i7 = 0; i7 < i5; i7++) {
                                                    if ((255 & j2) < 128) {
                                                        Object obj5 = objArr[(i3 << 3) + i7];
                                                        if (!(obj5 instanceof StateObjectImpl) || ((StateObjectImpl) obj5).te(ReaderKind.n(1))) {
                                                            mutableScatterSet.xMQ(obj5);
                                                        }
                                                    }
                                                    j2 >>= 8;
                                                }
                                                if (i5 != 8) {
                                                    break;
                                                }
                                            }
                                            if (i3 == length) {
                                                break;
                                            } else {
                                                i3++;
                                            }
                                        }
                                    }
                                } else {
                                    for (Object obj6 : set) {
                                        if (!(obj6 instanceof StateObjectImpl) || ((StateObjectImpl) obj6).te(ReaderKind.n(1))) {
                                            mutableScatterSet.xMQ(obj6);
                                        }
                                    }
                                }
                                plM = recomposer4.m();
                            } else {
                                plM = null;
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    if (plM != null) {
                        Result.Companion companion2 = Result.INSTANCE;
                        plM.resumeWith(Result.m313constructorimpl(Unit.INSTANCE));
                    }
                }
            });
            Recomposer.INSTANCE.t(this.J2.recomposerInfo);
            try {
                Object obj4 = this.J2.stateLock;
                Recomposer recomposer4 = this.J2;
                synchronized (obj4) {
                    listEWT = recomposer4.eWT();
                }
                int size = listEWT.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((ControlledComposition) listEWT.get(i3)).aYN();
                }
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.f30308r, this.f30307o, null);
                this.f30305O = xuvVarAz;
                this.f30306n = observerHandleXMQ;
                this.f30309t = 1;
                if (Lu.J2(anonymousClass3, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                observerHandle = observerHandleXMQ;
                observerHandle.n();
                obj3 = this.J2.stateLock;
                Recomposer recomposer5 = this.J2;
                synchronized (obj3) {
                }
            } catch (Throwable th4) {
                observerHandle = observerHandleXMQ;
                th = th4;
                observerHandle.n();
                obj2 = this.J2.stateLock;
                Recomposer recomposer22 = this.J2;
                synchronized (obj2) {
                    try {
                        if (recomposer22.runnerJob == xuvVarAz) {
                            recomposer22.runnerJob = null;
                        }
                        recomposer22.m();
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
                Recomposer.INSTANCE.nr(this.J2.recomposerInfo);
                throw th;
            }
        }
    }
}
