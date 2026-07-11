package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.Immutable;
import com.caoccao.javet.values.reference.builtin.V8ValueBuiltInSymbol;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010(\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0001\u0018\u0000 '2\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001:\u0001(B5\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0002j\u0002`\u0003\u0012\u000e\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\r2\n\u0010\f\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\u00002\n\u0010\f\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u00002\n\u0010\f\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0000¢\u0006\u0004\b\u0017\u0010\u0015J\u001a\u0010\u0019\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0018H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001c\u001a\u00060\u0002j\u0002`\u00032\n\u0010\u001b\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"R\u0018\u0010\u0006\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R\u001c\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006)"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "upperSet", "lowerSet", "lowerBound", "", "Landroidx/compose/runtime/snapshots/SnapshotIdArray;", "belowBound", "<init>", "(JJJ[J)V", "id", "", "gh", "(J)Z", "ty", "(J)Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "mUb", "ids", "xMQ", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "bits", "az", "", V8ValueBuiltInSymbol.PROPERTY_ITERATOR, "()Ljava/util/Iterator;", "default", "qie", "(J)J", "", "toString", "()Ljava/lang/String;", c.f62177j, "J", "t", "O", "J2", "[J", "r", "Companion", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Immutable
@SourceDebugExtension({"SMAP\nSnapshotIdSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotIdSet.kt\nandroidx/compose/runtime/snapshots/SnapshotIdSet\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SnapshotId.jvm.kt\nandroidx/compose/runtime/snapshots/SnapshotId_jvmKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,315:1\n274#1,7:318\n281#1,15:329\n276#1:344\n274#1,7:345\n281#1,15:356\n276#1:371\n274#1,7:372\n281#1,15:383\n276#1:398\n274#1,7:399\n281#1,15:410\n276#1:425\n274#1,7:426\n281#1,15:437\n276#1:452\n280#1:453\n281#1,15:458\n1#2:316\n143#3:317\n83#3,4:325\n83#3,4:352\n83#3,4:379\n83#3,4:406\n83#3,4:433\n83#3,4:454\n83#3,4:473\n68#3:477\n1549#4:478\n1620#4,3:479\n*S KotlinDebug\n*F\n+ 1 SnapshotIdSet.kt\nandroidx/compose/runtime/snapshots/SnapshotIdSet\n*L\n198#1:318,7\n198#1:329,15\n198#1:344\n218#1:345,7\n218#1:356,15\n218#1:371\n222#1:372,7\n222#1:383,15\n222#1:398\n242#1:399,7\n242#1:410,15\n242#1:425\n245#1:426,7\n245#1:437,15\n245#1:452\n275#1:453\n275#1:458,15\n131#1:317\n198#1:325,4\n218#1:352,4\n222#1:379,4\n242#1:406,4\n245#1:433,4\n275#1:454,4\n280#1:473,4\n299#1:477\n306#1:478\n306#1:479,3\n*E\n"})
public final class SnapshotIdSet implements Iterable<Long>, KMappedMarker {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final long[] belowBound;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final long lowerBound;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final long upperSet;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final long lowerSet;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final SnapshotIdSet f30952o = new SnapshotIdSet(0, 0, 0, null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotIdSet$Companion;", "", "<init>", "()V", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "EMPTY", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", c.f62177j, "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SnapshotIdSet n() {
            return SnapshotIdSet.f30952o;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1", f = "SnapshotIdSet.kt", i = {0, 0, 1, 1, 2, 2}, l = {252, 256, 263}, m = "invokeSuspend", n = {"$this$sequence", "$this$forEach$iv", "$this$sequence", "index", "$this$sequence", "index"}, s = {"L$0", "L$1", "L$0", "I$0", "L$0", "I$0"})
    @SourceDebugExtension({"SMAP\nSnapshotIdSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotIdSet.kt\nandroidx/compose/runtime/snapshots/SnapshotIdSet$iterator$1\n+ 2 SnapshotId.jvm.kt\nandroidx/compose/runtime/snapshots/SnapshotId_jvmKt\n*L\n1#1,315:1\n83#2,4:316\n*S KotlinDebug\n*F\n+ 1 SnapshotIdSet.kt\nandroidx/compose/runtime/snapshots/SnapshotIdSet$iterator$1\n*L\n252#1:316,4\n*E\n"})
    static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Long>, Continuation<? super Unit>, Object> {
        int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f30957O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f30958n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f30960r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f30961t;

        AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = SnapshotIdSet.this.new AnonymousClass1(continuation);
            anonymousClass1.f30960r = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(SequenceScope<? super Long> sequenceScope, Continuation<? super Unit> continuation) {
            return invoke2((SequenceScope) sequenceScope, (Continuation) continuation);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(SequenceScope sequenceScope, Continuation continuation) {
            return ((AnonymousClass1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0079, code lost:
        
            if (r15.yield(r4, r20) == r1) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00b5, code lost:
        
            if (r13.yield(r4, r20) == r1) goto L40;
         */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00ba  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00c5  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00c8  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0079 -> B:19:0x007d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x009b -> B:30:0x00b8). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00b5 -> B:30:0x00b8). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00d3 -> B:43:0x00f4). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00f2 -> B:42:0x00f3). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            SequenceScope sequenceScope;
            SequenceScope sequenceScope2;
            int length;
            long[] jArr;
            int i2;
            long j2;
            SequenceScope sequenceScope3;
            int i3;
            SequenceScope sequenceScope4;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i5 = this.J2;
            int i7 = 0;
            if (i5 == 0) {
                ResultKt.throwOnFailure(obj);
                sequenceScope = (SequenceScope) this.f30960r;
                long[] jArr2 = SnapshotIdSet.this.belowBound;
                if (jArr2 != null) {
                    sequenceScope2 = sequenceScope;
                    length = jArr2.length;
                    jArr = jArr2;
                    i2 = 0;
                    if (i2 < length) {
                    }
                }
                j2 = 1;
                if (SnapshotIdSet.this.lowerSet != 0) {
                }
                if (SnapshotIdSet.this.upperSet != 0) {
                }
                return Unit.INSTANCE;
            }
            if (i5 == 1) {
                length = this.f30957O;
                i2 = this.f30961t;
                jArr = (long[]) this.f30958n;
                sequenceScope2 = (SequenceScope) this.f30960r;
                ResultKt.throwOnFailure(obj);
                i2++;
                if (i2 < length) {
                    sequenceScope = sequenceScope2;
                    j2 = 1;
                    if (SnapshotIdSet.this.lowerSet != 0) {
                        sequenceScope3 = sequenceScope;
                        i3 = 0;
                        if (i3 >= 64) {
                        }
                    }
                    if (SnapshotIdSet.this.upperSet != 0) {
                    }
                    return Unit.INSTANCE;
                }
                Long lBoxLong = Boxing.boxLong(jArr[i2]);
                this.f30960r = sequenceScope2;
                this.f30958n = jArr;
                this.f30961t = i2;
                this.f30957O = length;
                this.J2 = 1;
            } else {
                if (i5 != 2) {
                    if (i5 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i8 = this.f30961t;
                    sequenceScope4 = (SequenceScope) this.f30960r;
                    ResultKt.throwOnFailure(obj);
                    j2 = 1;
                    i7 = i8;
                    i7++;
                    if (i7 < 64) {
                        if ((SnapshotIdSet.this.upperSet & (j2 << i7)) != 0) {
                            Long lBoxLong2 = Boxing.boxLong(SnapshotIdSet.this.lowerBound + ((long) i7) + ((long) 64));
                            this.f30960r = sequenceScope4;
                            this.f30958n = null;
                            this.f30961t = i7;
                            this.J2 = 3;
                            if (sequenceScope4.yield(lBoxLong2, this) != coroutine_suspended) {
                                i8 = i7;
                                i7 = i8;
                            }
                            return coroutine_suspended;
                        }
                        i7++;
                        if (i7 < 64) {
                        }
                    }
                    return Unit.INSTANCE;
                }
                i3 = this.f30961t;
                sequenceScope3 = (SequenceScope) this.f30960r;
                ResultKt.throwOnFailure(obj);
                j2 = 1;
                i3++;
                if (i3 >= 64) {
                    sequenceScope = sequenceScope3;
                    if (SnapshotIdSet.this.upperSet != 0) {
                        sequenceScope4 = sequenceScope;
                        if (i7 < 64) {
                        }
                    }
                    return Unit.INSTANCE;
                }
                if ((SnapshotIdSet.this.lowerSet & (j2 << i3)) != 0) {
                    Long lBoxLong3 = Boxing.boxLong(SnapshotIdSet.this.lowerBound + ((long) i3));
                    this.f30960r = sequenceScope3;
                    this.f30958n = null;
                    this.f30961t = i3;
                    this.J2 = 2;
                }
                i3++;
                if (i3 >= 64) {
                }
            }
        }
    }

    public final SnapshotIdSet az(SnapshotIdSet bits) {
        SnapshotIdSet snapshotIdSetTy;
        SnapshotIdSet snapshotIdSet = f30952o;
        if (bits == snapshotIdSet) {
            return this;
        }
        if (this == snapshotIdSet) {
            return bits;
        }
        long j2 = bits.lowerBound;
        long j3 = this.lowerBound;
        if (j2 == j3) {
            long[] jArr = bits.belowBound;
            long[] jArr2 = this.belowBound;
            if (jArr == jArr2) {
                return new SnapshotIdSet(bits.upperSet | this.upperSet, bits.lowerSet | this.lowerSet, j3, jArr2);
            }
        }
        int i2 = 0;
        if (this.belowBound == null) {
            long[] jArr3 = this.belowBound;
            if (jArr3 != null) {
                for (long j4 : jArr3) {
                    bits = bits.ty(j4);
                }
            }
            if (this.lowerSet != 0) {
                for (int i3 = 0; i3 < 64; i3++) {
                    if ((this.lowerSet & (1 << i3)) != 0) {
                        bits = bits.ty(this.lowerBound + ((long) i3));
                    }
                }
            }
            if (this.upperSet != 0) {
                while (i2 < 64) {
                    if ((this.upperSet & (1 << i2)) != 0) {
                        bits = bits.ty(this.lowerBound + ((long) i2) + ((long) 64));
                    }
                    i2++;
                }
            }
            return bits;
        }
        long[] jArr4 = bits.belowBound;
        if (jArr4 != null) {
            snapshotIdSetTy = this;
            for (long j5 : jArr4) {
                snapshotIdSetTy = snapshotIdSetTy.ty(j5);
            }
        } else {
            snapshotIdSetTy = this;
        }
        if (bits.lowerSet != 0) {
            for (int i5 = 0; i5 < 64; i5++) {
                if ((bits.lowerSet & (1 << i5)) != 0) {
                    snapshotIdSetTy = snapshotIdSetTy.ty(bits.lowerBound + ((long) i5));
                }
            }
        }
        if (bits.upperSet != 0) {
            while (i2 < 64) {
                if ((bits.upperSet & (1 << i2)) != 0) {
                    snapshotIdSetTy = snapshotIdSetTy.ty(bits.lowerBound + ((long) i2) + ((long) 64));
                }
                i2++;
            }
        }
        return snapshotIdSetTy;
    }

    public final boolean gh(long id) {
        long[] jArr;
        long j2 = id - this.lowerBound;
        return (j2 < 0 || j2 >= 64) ? (j2 < 64 || j2 >= 128) ? j2 <= 0 && (jArr = this.belowBound) != null && SnapshotId_jvmKt.n(jArr, id) >= 0 : ((1 << (((int) j2) + (-64))) & this.upperSet) != 0 : ((1 << ((int) j2)) & this.lowerSet) != 0;
    }

    @Override // java.lang.Iterable
    public Iterator<Long> iterator() {
        return SequencesKt.sequence(new AnonymousClass1(null)).iterator();
    }

    public final SnapshotIdSet mUb(long id) {
        long[] jArr;
        int iN;
        long j2 = this.lowerBound;
        long j3 = id - j2;
        if (j3 >= 0 && j3 < 64) {
            long j4 = 1 << ((int) j3);
            long j5 = this.lowerSet;
            if ((j5 & j4) != 0) {
                return new SnapshotIdSet(this.upperSet, j5 & (~j4), j2, this.belowBound);
            }
        } else if (j3 >= 64 && j3 < 128) {
            long j6 = 1 << (((int) j3) - 64);
            long j7 = this.upperSet;
            if ((j7 & j6) != 0) {
                return new SnapshotIdSet(j7 & (~j6), this.lowerSet, j2, this.belowBound);
            }
        } else if (j3 < 0 && (jArr = this.belowBound) != null && (iN = SnapshotId_jvmKt.n(jArr, id)) >= 0) {
            return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, SnapshotId_jvmKt.O(jArr, iN));
        }
        return this;
    }

    public final long qie(long j2) {
        long[] jArr = this.belowBound;
        if (jArr != null) {
            return jArr[0];
        }
        long j3 = this.lowerSet;
        if (j3 != 0) {
            return this.lowerBound + ((long) Long.numberOfTrailingZeros(j3));
        }
        long j4 = this.upperSet;
        return j4 != 0 ? this.lowerBound + ((long) 64) + ((long) Long.numberOfTrailingZeros(j4)) : j2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(this, 10));
        Iterator<Long> it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().longValue()));
        }
        sb.append(ListUtilsKt.nr(arrayList, null, null, null, 0, null, null, 63, null));
        sb.append(']');
        return sb.toString();
    }

    public final SnapshotIdSet ty(long id) {
        long j2;
        long j3;
        long[] jArrRl;
        long j4 = this.lowerBound;
        long j5 = id - j4;
        long j6 = 1;
        if (j5 >= 0 && j5 < 64) {
            long j7 = 1 << ((int) j5);
            long j9 = this.lowerSet;
            if ((j9 & j7) == 0) {
                return new SnapshotIdSet(this.upperSet, j9 | j7, j4, this.belowBound);
            }
        } else if (j5 >= 64 && j5 < 128) {
            long j10 = 1 << (((int) j5) - 64);
            long j11 = this.upperSet;
            if ((j11 & j10) == 0) {
                return new SnapshotIdSet(j11 | j10, this.lowerSet, j4, this.belowBound);
            }
        } else if (j5 < 128) {
            long[] jArr = this.belowBound;
            if (jArr == null) {
                return new SnapshotIdSet(this.upperSet, this.lowerSet, j4, new long[]{id});
            }
            int iN = SnapshotId_jvmKt.n(jArr, id);
            if (iN < 0) {
                return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, SnapshotId_jvmKt.nr(jArr, -(iN + 1), id));
            }
        } else if (!gh(id)) {
            long j12 = this.upperSet;
            long j13 = this.lowerSet;
            long j14 = this.lowerBound;
            long j15 = 64;
            long j16 = ((id + 1) / j15) * j15;
            if (j16 < 0) {
                j16 = 9223372036854775680L;
            }
            SnapshotIdArrayBuilder snapshotIdArrayBuilder = null;
            long j17 = j12;
            while (true) {
                if (j14 >= j16) {
                    j2 = j13;
                    j3 = j14;
                    break;
                }
                if (j13 != 0) {
                    if (snapshotIdArrayBuilder == null) {
                        snapshotIdArrayBuilder = new SnapshotIdArrayBuilder(this.belowBound);
                    }
                    int i2 = 0;
                    while (i2 < 64) {
                        if ((j13 & (j6 << i2)) != 0) {
                            snapshotIdArrayBuilder.n(((long) i2) + j14);
                        }
                        i2++;
                        j6 = 1;
                    }
                }
                if (j17 == 0) {
                    j3 = j16;
                    j2 = 0;
                    break;
                }
                j14 += j15;
                j13 = j17;
                j6 = 1;
                j17 = 0;
            }
            if (snapshotIdArrayBuilder == null || (jArrRl = snapshotIdArrayBuilder.rl()) == null) {
                jArrRl = this.belowBound;
            }
            return new SnapshotIdSet(j17, j2, j3, jArrRl).ty(id);
        }
        return this;
    }

    public final SnapshotIdSet xMQ(SnapshotIdSet ids) {
        SnapshotIdSet snapshotIdSetMUb;
        SnapshotIdSet snapshotIdSet = f30952o;
        if (ids == snapshotIdSet) {
            return this;
        }
        if (this == snapshotIdSet) {
            return snapshotIdSet;
        }
        long j2 = ids.lowerBound;
        long j3 = this.lowerBound;
        if (j2 == j3) {
            long[] jArr = ids.belowBound;
            long[] jArr2 = this.belowBound;
            if (jArr == jArr2) {
                return new SnapshotIdSet((~ids.upperSet) & this.upperSet, (~ids.lowerSet) & this.lowerSet, j3, jArr2);
            }
        }
        long[] jArr3 = ids.belowBound;
        if (jArr3 != null) {
            snapshotIdSetMUb = this;
            for (long j4 : jArr3) {
                snapshotIdSetMUb = snapshotIdSetMUb.mUb(j4);
            }
        } else {
            snapshotIdSetMUb = this;
        }
        if (ids.lowerSet != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if ((ids.lowerSet & (1 << i2)) != 0) {
                    snapshotIdSetMUb = snapshotIdSetMUb.mUb(ids.lowerBound + ((long) i2));
                }
            }
        }
        if (ids.upperSet != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if ((ids.upperSet & (1 << i3)) != 0) {
                    snapshotIdSetMUb = snapshotIdSetMUb.mUb(ids.lowerBound + ((long) i3) + ((long) 64));
                }
            }
        }
        return snapshotIdSetMUb;
    }

    private SnapshotIdSet(long j2, long j3, long j4, long[] jArr) {
        this.upperSet = j2;
        this.lowerSet = j3;
        this.lowerBound = j4;
        this.belowBound = jArr;
    }
}
