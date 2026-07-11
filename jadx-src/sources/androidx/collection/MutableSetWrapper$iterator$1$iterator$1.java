package androidx.collection;

import androidx.collection.MutableSetWrapper;
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
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "E", "Lkotlin/sequences/SequenceScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.collection.MutableSetWrapper$iterator$1$iterator$1", f = "ScatterSet.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {1188}, m = "invokeSuspend", n = {"$this$iterator", "m$iv", "lastIndex$iv", "i$iv", "slot$iv", "bitCount$iv", "j$iv"}, s = {"L$0", "L$3", "I$0", "I$1", "J$0", "I$2", "I$3"})
@SourceDebugExtension({"SMAP\nScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/MutableSetWrapper$iterator$1$iterator$1\n+ 2 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1210:1\n200#2,7:1211\n211#2,3:1219\n214#2,9:1223\n1399#3:1218\n1270#3:1222\n*S KotlinDebug\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/MutableSetWrapper$iterator$1$iterator$1\n*L\n1186#1:1211,7\n1186#1:1219,3\n1186#1:1223,9\n1186#1:1218\n1186#1:1222\n*E\n"})
final class MutableSetWrapper$iterator$1$iterator$1<E> extends RestrictedSuspendLambda implements Function2<SequenceScope<? super E>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object E2;
    int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    Object f14839O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    long f14840S;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    final /* synthetic */ MutableSetWrapper.AnonymousClass1 f14841X;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    int f14842Z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ MutableSetWrapper f14843e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f14844g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f14845n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f14846o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f14847r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f14848t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MutableSetWrapper$iterator$1$iterator$1(MutableSetWrapper mutableSetWrapper, MutableSetWrapper.AnonymousClass1 anonymousClass1, Continuation continuation) {
        super(2, continuation);
        this.f14843e = mutableSetWrapper;
        this.f14841X = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MutableSetWrapper$iterator$1$iterator$1 mutableSetWrapper$iterator$1$iterator$1 = new MutableSetWrapper$iterator$1$iterator$1(this.f14843e, this.f14841X, continuation);
        mutableSetWrapper$iterator$1$iterator$1.E2 = obj;
        return mutableSetWrapper$iterator$1$iterator$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Continuation<? super Unit> continuation) {
        return invoke((SequenceScope) obj, (Continuation) continuation);
    }

    public final Object invoke(SequenceScope sequenceScope, Continuation continuation) {
        return ((MutableSetWrapper$iterator$1$iterator$1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x005d -> B:23:0x00b3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005f -> B:14:0x0073). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x007c -> B:20:0x00a7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00a4 -> B:20:0x00a7). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SequenceScope sequenceScope;
        MutableSetWrapper.AnonymousClass1 anonymousClass1;
        MutableSetWrapper mutableSetWrapper;
        long[] jArr;
        int length;
        int i2;
        long j2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f14844g;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            sequenceScope = (SequenceScope) this.E2;
            MutableScatterSet mutableScatterSet = this.f14843e.parent;
            anonymousClass1 = this.f14841X;
            mutableSetWrapper = this.f14843e;
            jArr = mutableScatterSet.metadata;
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
        int i5 = this.f14842Z;
        int i7 = this.f14846o;
        long j3 = this.f14840S;
        int i8 = this.f14847r;
        int i9 = this.J2;
        long[] jArr2 = (long[]) this.f14839O;
        MutableSetWrapper mutableSetWrapper2 = (MutableSetWrapper) this.f14848t;
        MutableSetWrapper.AnonymousClass1 anonymousClass12 = (MutableSetWrapper.AnonymousClass1) this.f14845n;
        SequenceScope sequenceScope2 = (SequenceScope) this.E2;
        ResultKt.throwOnFailure(obj);
        j3 >>= 8;
        i5++;
        if (i5 < i7) {
            if (i7 == 8) {
                int i10 = i9;
                i2 = i8;
                length = i10;
                jArr = jArr2;
                mutableSetWrapper = mutableSetWrapper2;
                anonymousClass1 = anonymousClass12;
                sequenceScope = sequenceScope2;
                if (i2 != length) {
                    i2++;
                    j2 = jArr[i2];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i11 = 8 - ((~(i2 - length)) >>> 31);
                        int i12 = i2;
                        i9 = length;
                        i8 = i12;
                        sequenceScope2 = sequenceScope;
                        i5 = 0;
                        jArr2 = jArr;
                        mutableSetWrapper2 = mutableSetWrapper;
                        i7 = i11;
                        anonymousClass12 = anonymousClass1;
                        j3 = j2;
                        if (i5 < i7) {
                            if ((255 & j3) < 128) {
                                int i13 = (i8 << 3) + i5;
                                anonymousClass12.t(i13);
                                Object obj2 = mutableSetWrapper2.parent.elements[i13];
                                this.E2 = sequenceScope2;
                                this.f14845n = anonymousClass12;
                                this.f14848t = mutableSetWrapper2;
                                this.f14839O = jArr2;
                                this.J2 = i9;
                                this.f14847r = i8;
                                this.f14840S = j3;
                                this.f14846o = i7;
                                this.f14842Z = i5;
                                this.f14844g = 1;
                                if (sequenceScope2.yield(obj2, this) == coroutine_suspended) {
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
