package androidx.compose.runtime;

import GJW.AbstractC1363t;
import GJW.C;
import GJW.Lu;
import GJW.vd;
import GJW.xuv;
import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.collection.ScatterSetWrapperKt;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LGJW/vd;", "Landroidx/compose/runtime/MonotonicFrameClock;", "parentFrameClock", "", "<anonymous>", "(LGJW/vd;Landroidx/compose/runtime/MonotonicFrameClock;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2", f = "Recomposer.kt", i = {0, 0, 0, 1}, l = {911, 931, 932}, m = "invokeSuspend", n = {"recomposeCoroutineScope", "frameSignal", "frameLoop", "frameLoop"}, s = {"L$0", "L$1", "L$2", "L$0"})
@SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2\n+ 2 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 3 Recomposer.kt\nandroidx/compose/runtime/Recomposer\n+ 4 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 5 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,1791:1\n33#2,5:1792\n490#3:1797\n491#3,5:1800\n489#3,9:1805\n498#3,2:1818\n501#3:1821\n502#3,7:1833\n33#4,2:1798\n33#4,2:1828\n33#4,2:1840\n33#5,4:1814\n38#5:1820\n423#6,6:1822\n429#6,3:1830\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2\n*L\n902#1:1792,5\n914#1:1797\n914#1:1800,5\n914#1:1805,9\n914#1:1818,2\n914#1:1821\n914#1:1833,7\n914#1:1798,2\n915#1:1828,2\n926#1:1840,2\n914#1:1814,4\n914#1:1820\n914#1:1822,6\n914#1:1830,3\n*E\n"})
final class Recomposer$runRecomposeConcurrentlyAndApplyChanges$2 extends SuspendLambda implements Function3<vd, MonotonicFrameClock, Continuation<? super Unit>, Object> {
    /* synthetic */ Object J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private /* synthetic */ Object f30341O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f30342n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ Recomposer f30343o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ CoroutineContext f30344r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f30345t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Recomposer$runRecomposeConcurrentlyAndApplyChanges$2(CoroutineContext coroutineContext, Recomposer recomposer, Continuation continuation) {
        super(3, continuation);
        this.f30344r = coroutineContext;
        this.f30343o = recomposer;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00bb, code lost:
    
        if (r10.k(r19) == r2) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b2, code lost:
    
        if (GJW.AbstractC1363t.Uo(r0, r19) != r2) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0192  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00bb -> B:25:0x00bf). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        xuv xuvVarNr;
        vd vdVar;
        ProduceFrameSignal produceFrameSignal;
        xuv xuvVar;
        MutableScatterSet mutableScatterSet;
        Continuation continuationNr;
        int i2;
        int i3 = 1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = this.f30345t;
        if (i5 == 0) {
            ResultKt.throwOnFailure(obj);
            vd vdVar2 = (vd) this.f30341O;
            MonotonicFrameClock monotonicFrameClock = (MonotonicFrameClock) this.J2;
            CoroutineContext coroutineContext = this.f30344r;
            xuv.n nVar = xuv.nr;
            boolean z2 = coroutineContext.get(nVar) == null;
            CoroutineContext coroutineContext2 = this.f30344r;
            if (!z2) {
                PreconditionsKt.n("recomposeCoroutineContext may not contain a Job; found " + coroutineContext2.get(nVar));
            }
            vd vdVarN = Lu.n(vdVar2.getCoroutineContext().plus(this.f30344r).plus(AbstractC1363t.n(AbstractC1363t.az(vdVar2.getCoroutineContext()))));
            ProduceFrameSignal produceFrameSignal2 = new ProduceFrameSignal();
            xuvVarNr = C.nr(vdVar2, null, null, new Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$frameLoop$1(this.f30343o, monotonicFrameClock, produceFrameSignal2, null), 3, null);
            vdVar = vdVarN;
            produceFrameSignal = produceFrameSignal2;
            if (this.f30343o.ul()) {
            }
            return coroutine_suspended;
        }
        if (i5 == 1) {
            xuvVarNr = (xuv) this.f30342n;
            produceFrameSignal = (ProduceFrameSignal) this.J2;
            vdVar = (vd) this.f30341O;
            ResultKt.throwOnFailure(obj);
            Recomposer recomposer = this.f30343o;
            synchronized (recomposer.stateLock) {
                mutableScatterSet = recomposer.snapshotInvalidations;
                if (mutableScatterSet.J2()) {
                    recomposer.snapshotInvalidations = new MutableScatterSet(0, i3, null);
                }
            }
            Set setN = ScatterSetWrapperKt.n(mutableScatterSet);
            if (!setN.isEmpty()) {
                List listEWT = recomposer.eWT();
                int size = listEWT.size();
                for (int i7 = 0; i7 < size; i7 += i3) {
                    ((ControlledComposition) listEWT.get(i7)).HI(setN);
                }
            }
            MutableVector mutableVector = recomposer.compositionInvalidations;
            Object[] objArr = mutableVector.content;
            int size2 = mutableVector.getSize();
            int i8 = 0;
            while (i8 < size2) {
                ControlledComposition controlledComposition = (ControlledComposition) objArr[i8];
                synchronized (recomposer.stateLock) {
                    i2 = i3;
                    recomposer.concurrentCompositionsOutstanding++;
                }
                C.nr(vdVar, CompositionKt.nr(controlledComposition), null, new Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2(recomposer, controlledComposition, null), 2, null);
                i8++;
                size2 = size2;
                i3 = i2;
                objArr = objArr;
            }
            int i9 = i3;
            recomposer.compositionInvalidations.KN();
            synchronized (recomposer.stateLock) {
                if (recomposer.m() != null) {
                    throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                }
                Unit unit = Unit.INSTANCE;
            }
            Object obj2 = this.f30343o.stateLock;
            Recomposer recomposer2 = this.f30343o;
            synchronized (obj2) {
                continuationNr = recomposer2.Mx() ? produceFrameSignal.nr() : null;
            }
            if (continuationNr != null) {
                Result.Companion companion = Result.INSTANCE;
                continuationNr.resumeWith(Result.m313constructorimpl(Unit.INSTANCE));
            }
            i3 = i9;
            if (this.f30343o.ul()) {
                xuv xuvVarAz = AbstractC1363t.az(vdVar.getCoroutineContext());
                this.f30341O = xuvVarNr;
                this.J2 = null;
                this.f30342n = null;
                this.f30345t = 2;
                if (AbstractC1363t.Uo(xuvVarAz, this) != coroutine_suspended) {
                    xuvVar = xuvVarNr;
                    this.f30341O = null;
                    this.f30345t = 3;
                }
            } else {
                Recomposer recomposer3 = this.f30343o;
                this.f30341O = vdVar;
                this.J2 = produceFrameSignal;
                this.f30342n = xuvVarNr;
                this.f30345t = i3;
            }
            return coroutine_suspended;
        }
        if (i5 != 2) {
            if (i5 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        xuvVar = (xuv) this.f30341O;
        ResultKt.throwOnFailure(obj);
        this.f30341O = null;
        this.f30345t = 3;
    }

    @Override // kotlin.jvm.functions.Function3
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Object invoke(vd vdVar, MonotonicFrameClock monotonicFrameClock, Continuation continuation) {
        Recomposer$runRecomposeConcurrentlyAndApplyChanges$2 recomposer$runRecomposeConcurrentlyAndApplyChanges$2 = new Recomposer$runRecomposeConcurrentlyAndApplyChanges$2(this.f30344r, this.f30343o, continuation);
        recomposer$runRecomposeConcurrentlyAndApplyChanges$2.f30341O = vdVar;
        recomposer$runRecomposeConcurrentlyAndApplyChanges$2.J2 = monotonicFrameClock;
        return recomposer$runRecomposeConcurrentlyAndApplyChanges$2.invokeSuspend(Unit.INSTANCE);
    }
}
