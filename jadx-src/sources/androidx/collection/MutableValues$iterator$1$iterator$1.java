package androidx.collection;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequenceScope;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00020\u00050\u0004H\u008a@"}, d2 = {"<anonymous>", "", "K", "V", "Lkotlin/sequences/SequenceScope;", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.collection.MutableValues$iterator$1$iterator$1", f = "ScatterMap.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {1696}, m = "invokeSuspend", n = {"$this$iterator", "m$iv", "lastIndex$iv", "i$iv", "slot$iv", "bitCount$iv", "j$iv"}, s = {"L$0", "L$1", "I$0", "I$1", "J$0", "I$2", "I$3"})
@SourceDebugExtension({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableValues$iterator$1$iterator$1\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1787:1\n329#2,6:1788\n339#2,3:1795\n342#2,9:1799\n1399#3:1794\n1270#3:1798\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableValues$iterator$1$iterator$1\n*L\n1696#1:1788,6\n1696#1:1795,3\n1696#1:1799,9\n1696#1:1794\n1696#1:1798\n*E\n"})
final class MutableValues$iterator$1$iterator$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Integer>, Continuation<? super Unit>, Object> {
    int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    int f14853O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private /* synthetic */ Object f14854S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    int f14855Z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ MutableValues f14856g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f14857n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    long f14858o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f14859r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f14860t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MutableValues$iterator$1$iterator$1(MutableValues mutableValues, Continuation continuation) {
        super(2, continuation);
        this.f14856g = mutableValues;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MutableValues$iterator$1$iterator$1 mutableValues$iterator$1$iterator$1 = new MutableValues$iterator$1$iterator$1(this.f14856g, continuation);
        mutableValues$iterator$1$iterator$1.f14854S = obj;
        return mutableValues$iterator$1$iterator$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(SequenceScope<? super Integer> sequenceScope, Continuation<? super Unit> continuation) {
        return invoke2((SequenceScope) sequenceScope, (Continuation) continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(SequenceScope sequenceScope, Continuation continuation) {
        return ((MutableValues$iterator$1$iterator$1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0052 -> B:23:0x0098). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0054 -> B:14:0x0066). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006f -> B:20:0x008f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x008c -> B:20:0x008f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SequenceScope sequenceScope;
        long[] jArr;
        int length;
        int i2;
        long j2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f14855Z;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            sequenceScope = (SequenceScope) this.f14854S;
            jArr = this.f14856g.parent.metadata;
            length = jArr.length - 2;
            if (length >= 0) {
                i2 = 0;
                j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                }
                if (i2 != length) {
                }
            }
            return Unit.INSTANCE;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i5 = this.f14859r;
        int i7 = this.J2;
        long j3 = this.f14858o;
        int i8 = this.f14853O;
        int i9 = this.f14860t;
        long[] jArr2 = (long[]) this.f14857n;
        SequenceScope sequenceScope2 = (SequenceScope) this.f14854S;
        ResultKt.throwOnFailure(obj);
        j3 >>= 8;
        i5++;
        if (i5 < i7) {
            if (i7 == 8) {
                i2 = i8;
                length = i9;
                jArr = jArr2;
                sequenceScope = sequenceScope2;
                if (i2 != length) {
                    i2++;
                    j2 = jArr[i2];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        jArr2 = jArr;
                        i7 = 8 - ((~(i2 - length)) >>> 31);
                        sequenceScope2 = sequenceScope;
                        i5 = 0;
                        i9 = length;
                        i8 = i2;
                        j3 = j2;
                        if (i5 < i7) {
                            if ((255 & j3) < 128) {
                                Integer numBoxInt = Boxing.boxInt((i8 << 3) + i5);
                                this.f14854S = sequenceScope2;
                                this.f14857n = jArr2;
                                this.f14860t = i9;
                                this.f14853O = i8;
                                this.f14858o = j3;
                                this.J2 = i7;
                                this.f14859r = i5;
                                this.f14855Z = 1;
                                if (sequenceScope2.yield(numBoxInt, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            j3 >>= 8;
                            i5++;
                            if (i5 < i7) {
                            }
                        }
                    }
                    if (i2 != length) {
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }
}
