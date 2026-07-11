package androidx.compose.runtime;

import ILs.C;
import ILs.aC;
import TFv.CN3;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSet;
import androidx.compose.runtime.collection.ScatterSetWrapper;
import androidx.compose.runtime.snapshots.ObserverHandle;
import androidx.compose.runtime.snapshots.ReaderKind;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "LTFv/CN3;", "", "<anonymous>", "(LTFv/CN3;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1", f = "SnapshotFlow.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, l = {142, 146, 169}, m = "invokeSuspend", n = {"$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue", "$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue", "found", "$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
@SourceDebugExtension({"SMAP\nSnapshotFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotFlow.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,179:1\n148#2,5:180\n148#2,5:185\n*S KotlinDebug\n*F\n+ 1 SnapshotFlow.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1\n*L\n137#1:180,5\n161#1:185,5\n*E\n"})
final class SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1 extends SuspendLambda implements Function2<CN3, Continuation<? super Unit>, Object> {
    Object J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    Object f30440O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private /* synthetic */ Object f30441S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    int f30442Z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ Function0 f30443g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f30444n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f30445o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    Object f30446r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f30447t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.f30443g = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1 snapshotStateKt__SnapshotFlowKt$snapshotFlow$1 = new SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(this.f30443g, continuation);
        snapshotStateKt__SnapshotFlowKt$snapshotFlow$1.f30441S = obj;
        return snapshotStateKt__SnapshotFlowKt$snapshotFlow$1;
    }

    /* JADX WARN: Path cross not found for [B:34:0x00e2, B:38:0x00eb], limit reached: 75 */
    /* JADX WARN: Path cross not found for [B:42:0x00fa, B:58:0x0139], limit reached: 75 */
    /* JADX WARN: Path cross not found for [B:58:0x0139, B:42:0x00fa], limit reached: 75 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fa A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #3 {all -> 0x0055, blocks: (B:32:0x00de, B:34:0x00e2, B:39:0x00ec, B:42:0x00fa, B:46:0x0110, B:48:0x0119, B:56:0x0135, B:57:0x0138, B:15:0x0050, B:43:0x0105, B:45:0x010d, B:54:0x0131, B:55:0x0134), top: B:74:0x0050, inners: #5 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        ObserverHandle observerHandleXMQ;
        CN3 cn3;
        final MutableScatterSet mutableScatterSet;
        Function1<Object, Unit> function1;
        final ILs.CN3 cn3Rl;
        Snapshot snapshotCk;
        Snapshot snapshotQie;
        Object objInvoke;
        ObserverHandle observerHandle;
        CN3 cn32;
        MutableScatterSet mutableScatterSet2;
        Function1<Object, Unit> function12;
        ILs.CN3 cn33;
        Object obj2;
        int i2;
        Set set;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f30442Z;
        try {
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 == 3) {
                            objInvoke = this.f30446r;
                            observerHandleXMQ = (ObserverHandle) this.J2;
                            cn3Rl = (ILs.CN3) this.f30440O;
                            function1 = (Function1) this.f30447t;
                            mutableScatterSet = (MutableScatterSet) this.f30444n;
                            cn3 = (CN3) this.f30441S;
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        i2 = this.f30445o;
                        obj2 = this.f30446r;
                        observerHandle = (ObserverHandle) this.J2;
                        cn33 = (ILs.CN3) this.f30440O;
                        function12 = (Function1) this.f30447t;
                        mutableScatterSet2 = (MutableScatterSet) this.f30444n;
                        cn32 = (CN3) this.f30441S;
                        try {
                            ResultKt.throwOnFailure(obj);
                            set = (Set) obj;
                            do {
                                if (i2 != 0 && !SnapshotStateKt__SnapshotFlowKt.nr(mutableScatterSet2, set)) {
                                    i2 = 0;
                                } else {
                                    i2 = 1;
                                }
                                set = (Set) C.J2(cn33.O());
                            } while (set != null);
                            if (i2 != 0) {
                                mutableScatterSet2.ty();
                                snapshotCk = Snapshot.INSTANCE.ck(function12);
                                Function0 function0 = this.f30443g;
                                try {
                                    try {
                                        objInvoke = function0.invoke();
                                        snapshotCk.nr();
                                        if (!Intrinsics.areEqual(objInvoke, obj2)) {
                                            this.f30441S = cn32;
                                            this.f30444n = mutableScatterSet2;
                                            this.f30447t = function12;
                                            this.f30440O = cn33;
                                            this.J2 = observerHandle;
                                            this.f30446r = objInvoke;
                                            this.f30442Z = 3;
                                            if (cn32.rl(objInvoke, this) != coroutine_suspended) {
                                                observerHandleXMQ = observerHandle;
                                                cn3Rl = cn33;
                                                function1 = function12;
                                                mutableScatterSet = mutableScatterSet2;
                                                cn3 = cn32;
                                            }
                                            return coroutine_suspended;
                                        }
                                    } finally {
                                    }
                                    snapshotQie = snapshotCk.qie();
                                } finally {
                                }
                            }
                            objInvoke = obj2;
                            observerHandleXMQ = observerHandle;
                            cn3Rl = cn33;
                            function1 = function12;
                            mutableScatterSet = mutableScatterSet2;
                            cn3 = cn32;
                        } catch (Throwable th) {
                            th = th;
                            observerHandleXMQ = observerHandle;
                            observerHandleXMQ.n();
                            throw th;
                        }
                    }
                } else {
                    objInvoke = this.f30446r;
                    observerHandleXMQ = (ObserverHandle) this.J2;
                    cn3Rl = (ILs.CN3) this.f30440O;
                    function1 = (Function1) this.f30447t;
                    mutableScatterSet = (MutableScatterSet) this.f30444n;
                    cn3 = (CN3) this.f30441S;
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                cn3 = (CN3) this.f30441S;
                mutableScatterSet = new MutableScatterSet(0, 1, null);
                function1 = new Function1<Object, Unit>() { // from class: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$readObserver$1
                    {
                        super(1);
                    }

                    public final void n(Object obj3) {
                        if (obj3 instanceof StateObjectImpl) {
                            ((StateObjectImpl) obj3).iF(ReaderKind.n(4));
                        }
                        mutableScatterSet.xMQ(obj3);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Object obj3) {
                        n(obj3);
                        return Unit.INSTANCE;
                    }
                };
                cn3Rl = aC.rl(Integer.MAX_VALUE, null, null, 6, null);
                Snapshot.Companion companion = Snapshot.INSTANCE;
                observerHandleXMQ = companion.xMQ(new Function2<Set<? extends Object>, Snapshot, Unit>() { // from class: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$unregisterApplyObserver$1
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Set<? extends Object> set2, Snapshot snapshot) {
                        n(set2, snapshot);
                        return Unit.INSTANCE;
                    }

                    public final void n(Set set2, Snapshot snapshot) {
                        if (!(set2 instanceof ScatterSetWrapper)) {
                            Set set3 = set2;
                            if ((set3 instanceof Collection) && set3.isEmpty()) {
                                return;
                            }
                            for (Object obj3 : set3) {
                                if (!(obj3 instanceof StateObjectImpl) || ((StateObjectImpl) obj3).te(ReaderKind.n(4))) {
                                }
                            }
                            return;
                        }
                        ScatterSet set4 = ((ScatterSetWrapper) set2).getSet();
                        Object[] objArr = set4.elements;
                        long[] jArr = set4.metadata;
                        int length = jArr.length - 2;
                        if (length < 0) {
                            return;
                        }
                        int i5 = 0;
                        loop0: while (true) {
                            long j2 = jArr[i5];
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i7 = 8 - ((~(i5 - length)) >>> 31);
                                for (int i8 = 0; i8 < i7; i8++) {
                                    if ((255 & j2) < 128) {
                                        Object obj4 = objArr[(i5 << 3) + i8];
                                        if (!(obj4 instanceof StateObjectImpl) || ((StateObjectImpl) obj4).te(ReaderKind.n(4))) {
                                            break loop0;
                                        }
                                    }
                                    j2 >>= 8;
                                }
                                if (i7 != 8) {
                                    return;
                                }
                            }
                            if (i5 == length) {
                                return;
                            } else {
                                i5++;
                            }
                        }
                        cn3Rl.nr(set2);
                    }
                });
                snapshotCk = companion.ck(function1);
                Function0 function02 = this.f30443g;
                try {
                    snapshotQie = snapshotCk.qie();
                    try {
                        objInvoke = function02.invoke();
                        snapshotCk.nr();
                        this.f30441S = cn3;
                        this.f30444n = mutableScatterSet;
                        this.f30447t = function1;
                        this.f30440O = cn3Rl;
                        this.J2 = observerHandleXMQ;
                        this.f30446r = objInvoke;
                        this.f30442Z = 1;
                        if (cn3.rl(objInvoke, this) == coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    } finally {
                    }
                } finally {
                }
            }
            this.f30441S = cn3;
            this.f30444n = mutableScatterSet;
            this.f30447t = function1;
            this.f30440O = cn3Rl;
            this.J2 = observerHandleXMQ;
            this.f30446r = objInvoke;
            this.f30445o = 0;
            this.f30442Z = 2;
            obj = cn3Rl.KN(this);
            if (obj != coroutine_suspended) {
                cn32 = cn3;
                mutableScatterSet2 = mutableScatterSet;
                function12 = function1;
                cn33 = cn3Rl;
                observerHandle = observerHandleXMQ;
                obj2 = objInvoke;
                i2 = 0;
                set = (Set) obj;
                do {
                    if (i2 != 0) {
                    }
                    i2 = 1;
                    set = (Set) C.J2(cn33.O());
                } while (set != null);
                if (i2 != 0) {
                }
                objInvoke = obj2;
                observerHandleXMQ = observerHandle;
                cn3Rl = cn33;
                function1 = function12;
                mutableScatterSet = mutableScatterSet2;
                cn3 = cn32;
                this.f30441S = cn3;
                this.f30444n = mutableScatterSet;
                this.f30447t = function1;
                this.f30440O = cn3Rl;
                this.J2 = observerHandleXMQ;
                this.f30446r = objInvoke;
                this.f30445o = 0;
                this.f30442Z = 2;
                obj = cn3Rl.KN(this);
                if (obj != coroutine_suspended) {
                }
            }
            return coroutine_suspended;
        } catch (Throwable th2) {
            th = th2;
            observerHandleXMQ.n();
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Object invoke(CN3 cn3, Continuation continuation) {
        return ((SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1) create(cn3, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
