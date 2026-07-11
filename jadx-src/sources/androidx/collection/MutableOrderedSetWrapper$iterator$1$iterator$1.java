package androidx.collection;

import androidx.collection.MutableOrderedSetWrapper;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequenceScope;

/* JADX INFO: Add missing generic type declarations: [E] */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "E", "Lkotlin/sequences/SequenceScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.collection.MutableOrderedSetWrapper$iterator$1$iterator$1", f = "OrderedScatterSet.kt", i = {0, 0, 0}, l = {1489}, m = "invokeSuspend", n = {"$this$iterator", "nodes$iv", "previousNode$iv"}, s = {"L$0", "L$3", "I$0"})
@SourceDebugExtension({"SMAP\nOrderedScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderedScatterSet.kt\nandroidx/collection/MutableOrderedSetWrapper$iterator$1$iterator$1\n+ 2 OrderedScatterSet.kt\nandroidx/collection/OrderedScatterSet\n+ 3 SieveCache.kt\nandroidx/collection/SieveCacheKt\n*L\n1#1,1511:1\n255#2,6:1512\n261#2,4:1519\n1123#3:1518\n*S KotlinDebug\n*F\n+ 1 OrderedScatterSet.kt\nandroidx/collection/MutableOrderedSetWrapper$iterator$1$iterator$1\n*L\n1487#1:1512,6\n1487#1:1519,4\n1487#1:1518\n*E\n"})
final class MutableOrderedSetWrapper$iterator$1$iterator$1<E> extends RestrictedSuspendLambda implements Function2<SequenceScope<? super E>, Continuation<? super Unit>, Object> {
    int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    Object f14827O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    final /* synthetic */ MutableOrderedSetWrapper.AnonymousClass1 f14828S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    final /* synthetic */ MutableOrderedSetWrapper f14829Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f14830n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private /* synthetic */ Object f14831o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f14832r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f14833t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MutableOrderedSetWrapper$iterator$1$iterator$1(MutableOrderedSetWrapper mutableOrderedSetWrapper, MutableOrderedSetWrapper.AnonymousClass1 anonymousClass1, Continuation continuation) {
        super(2, continuation);
        this.f14829Z = mutableOrderedSetWrapper;
        this.f14828S = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MutableOrderedSetWrapper$iterator$1$iterator$1 mutableOrderedSetWrapper$iterator$1$iterator$1 = new MutableOrderedSetWrapper$iterator$1$iterator$1(this.f14829Z, this.f14828S, continuation);
        mutableOrderedSetWrapper$iterator$1$iterator$1.f14831o = obj;
        return mutableOrderedSetWrapper$iterator$1$iterator$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Continuation<? super Unit> continuation) {
        return invoke((SequenceScope) obj, (Continuation) continuation);
    }

    public final Object invoke(SequenceScope sequenceScope, Continuation continuation) {
        return ((MutableOrderedSetWrapper$iterator$1$iterator$1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableOrderedSetWrapper mutableOrderedSetWrapper;
        int i2;
        MutableOrderedSetWrapper.AnonymousClass1 anonymousClass1;
        long[] jArr;
        SequenceScope sequenceScope;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f14832r;
        if (i3 != 0) {
            if (i3 == 1) {
                i2 = this.J2;
                jArr = (long[]) this.f14827O;
                mutableOrderedSetWrapper = (MutableOrderedSetWrapper) this.f14833t;
                anonymousClass1 = (MutableOrderedSetWrapper.AnonymousClass1) this.f14830n;
                sequenceScope = (SequenceScope) this.f14831o;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            SequenceScope sequenceScope2 = (SequenceScope) this.f14831o;
            MutableOrderedScatterSet mutableOrderedScatterSet = this.f14829Z.parent;
            MutableOrderedSetWrapper.AnonymousClass1 anonymousClass12 = this.f14828S;
            mutableOrderedSetWrapper = this.f14829Z;
            long[] jArr2 = mutableOrderedScatterSet.nodes;
            i2 = mutableOrderedScatterSet.tail;
            anonymousClass1 = anonymousClass12;
            jArr = jArr2;
            sequenceScope = sequenceScope2;
        }
        while (i2 != Integer.MAX_VALUE) {
            int i5 = (int) ((jArr[i2] >> 31) & 2147483647L);
            anonymousClass1.t(i2);
            Object obj2 = mutableOrderedSetWrapper.parent.elements[i2];
            this.f14831o = sequenceScope;
            this.f14830n = anonymousClass1;
            this.f14833t = mutableOrderedSetWrapper;
            this.f14827O = jArr;
            this.J2 = i5;
            this.f14832r = 1;
            if (sequenceScope.yield(obj2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            i2 = i5;
        }
        return Unit.INSTANCE;
    }
}
