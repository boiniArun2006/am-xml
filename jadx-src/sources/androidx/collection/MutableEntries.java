package androidx.collection;

import com.caoccao.javet.values.reference.builtin.V8ValueBuiltInSymbol;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.jvm.internal.markers.KMutableSet;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\fH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0014\u001a\u00020\t2\u0018\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0017\u001a\u00020\t2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u0019\u001a\u00020\t2\u0018\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u0015J#\u0010\u001a\u001a\u00020\t2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\u0018J)\u0010\u001b\u001a\u00020\t2\u0018\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\u0015J)\u0010\u001c\u001a\u00020\t2\u0018\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0012H\u0016¢\u0006\u0004\b\u001c\u0010\u0015J#\u0010\u001d\u001a\u00020\t2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016¢\u0006\u0004\b\u001d\u0010\u0018R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Landroidx/collection/MutableEntries;", "K", "V", "", "", "Landroidx/collection/MutableScatterMap;", "parent", "<init>", "(Landroidx/collection/MutableScatterMap;)V", "", "isEmpty", "()Z", "", V8ValueBuiltInSymbol.PROPERTY_ITERATOR, "()Ljava/util/Iterator;", "", "clear", "()V", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "element", "J2", "(Ljava/util/Map$Entry;)Z", "addAll", "O", "retainAll", "removeAll", "KN", c.f62177j, "Landroidx/collection/MutableScatterMap;", "", "Uo", "()I", "size", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableEntries\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1787:1\n1726#2,3:1788\n329#3,6:1791\n339#3,3:1798\n342#3,9:1802\n329#3,6:1811\n339#3,3:1818\n342#3,9:1822\n555#3:1831\n556#3:1835\n558#3,2:1837\n560#3,4:1840\n564#3:1847\n565#3:1851\n566#3:1853\n567#3,4:1856\n573#3:1861\n574#3,8:1863\n1399#4:1797\n1270#4:1801\n1399#4:1817\n1270#4:1821\n1165#4,3:1832\n1179#4:1836\n1175#4:1839\n1372#4,3:1844\n1386#4,3:1848\n1312#4:1852\n1303#4:1854\n1297#4:1855\n1309#4:1860\n1393#4:1862\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableEntries\n*L\n1558#1:1788,3\n1574#1:1791,6\n1574#1:1798,3\n1574#1:1802,9\n1592#1:1811,6\n1592#1:1818,3\n1592#1:1822,9\n1605#1:1831\n1605#1:1835\n1605#1:1837,2\n1605#1:1840,4\n1605#1:1847\n1605#1:1851\n1605#1:1853\n1605#1:1856,4\n1605#1:1861\n1605#1:1863,8\n1574#1:1797\n1574#1:1801\n1592#1:1817\n1592#1:1821\n1605#1:1832,3\n1605#1:1836\n1605#1:1839\n1605#1:1844,3\n1605#1:1848,3\n1605#1:1852\n1605#1:1854\n1605#1:1855\n1605#1:1860\n1605#1:1862\n*E\n"})
final class MutableEntries<K, V> implements Set<Map.Entry<K, V>>, KMutableSet {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final MutableScatterMap parent;

    /* JADX INFO: renamed from: androidx.collection.MutableEntries$iterator$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0010)\n\u0002\u0010'\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR4\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0019\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"androidx/collection/MutableEntries$iterator$1", "", "", "", "hasNext", "()Z", "O", "()Ljava/util/Map$Entry;", "", "remove", "()V", "", c.f62177j, "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "setIterator", "(Ljava/util/Iterator;)V", V8ValueBuiltInSymbol.PROPERTY_ITERATOR, "", "t", "I", "()I", "J2", "(I)V", "current", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 implements Iterator<Map.Entry<K, V>>, KMutableIterator {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private Iterator iterator;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private int current = -1;

        /* JADX INFO: renamed from: androidx.collection.MutableEntries$iterator$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00050\u0004H\u008a@"}, d2 = {"<anonymous>", "", "K", "V", "Lkotlin/sequences/SequenceScope;", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "androidx.collection.MutableEntries$iterator$1$1", f = "ScatterMap.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {1538}, m = "invokeSuspend", n = {"$this$iterator", "m$iv", "lastIndex$iv", "i$iv", "slot$iv", "bitCount$iv", "j$iv"}, s = {"L$0", "L$3", "I$0", "I$1", "J$0", "I$2", "I$3"})
        @SourceDebugExtension({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableEntries$iterator$1$1\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1787:1\n329#2,6:1788\n339#2,3:1795\n342#2,9:1799\n1399#3:1794\n1270#3:1798\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableEntries$iterator$1$1\n*L\n1536#1:1788,6\n1536#1:1795,3\n1536#1:1799,9\n1536#1:1794\n1536#1:1798\n*E\n"})
        static final class C04901 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Map.Entry<K, V>>, Continuation<? super Unit>, Object> {
            private /* synthetic */ Object E2;
            int J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            Object f14784O;

            /* JADX INFO: renamed from: S, reason: collision with root package name */
            long f14785S;

            /* JADX INFO: renamed from: X, reason: collision with root package name */
            final /* synthetic */ AnonymousClass1 f14786X;

            /* JADX INFO: renamed from: Z, reason: collision with root package name */
            int f14787Z;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ MutableEntries f14788e;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f14789g;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f14790n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            int f14791o;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f14792r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            Object f14793t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C04901(MutableEntries mutableEntries, AnonymousClass1 anonymousClass1, Continuation continuation) {
                super(2, continuation);
                this.f14788e = mutableEntries;
                this.f14786X = anonymousClass1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                C04901 c04901 = new C04901(this.f14788e, this.f14786X, continuation);
                c04901.E2 = obj;
                return c04901;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Continuation<? super Unit> continuation) {
                return invoke((SequenceScope) obj, (Continuation) continuation);
            }

            public final Object invoke(SequenceScope sequenceScope, Continuation continuation) {
                return ((C04901) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
            /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x00c1  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x00cc  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x00cf  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005f -> B:14:0x0073). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x007c -> B:20:0x00b7). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00b4 -> B:21:0x00ba). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00cc -> B:26:0x00cd). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                SequenceScope sequenceScope;
                AnonymousClass1 anonymousClass1;
                MutableEntries mutableEntries;
                long[] jArr;
                int length;
                int i2;
                long j2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = this.f14789g;
                int i5 = 8;
                int i7 = 1;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj);
                    sequenceScope = (SequenceScope) this.E2;
                    MutableScatterMap mutableScatterMap = this.f14788e.parent;
                    anonymousClass1 = this.f14786X;
                    mutableEntries = this.f14788e;
                    jArr = mutableScatterMap.metadata;
                    length = jArr.length - 2;
                    if (length >= 0) {
                        i2 = 0;
                        j2 = jArr[i2];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) == -9187201950435737472L) {
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i8 = this.f14787Z;
                int i9 = this.f14791o;
                long j3 = this.f14785S;
                int i10 = this.f14792r;
                int i11 = this.J2;
                long[] jArr2 = (long[]) this.f14784O;
                MutableEntries mutableEntries2 = (MutableEntries) this.f14793t;
                AnonymousClass1 anonymousClass12 = (AnonymousClass1) this.f14790n;
                SequenceScope sequenceScope2 = (SequenceScope) this.E2;
                ResultKt.throwOnFailure(obj);
                int i12 = i5;
                int i13 = i7;
                j3 >>= i12;
                i8 += i13;
                i7 = i13;
                i5 = i12;
                if (i8 < i9) {
                    int i14 = i7;
                    if (i9 == i5) {
                        int i15 = i11;
                        i2 = i10;
                        length = i15;
                        jArr = jArr2;
                        mutableEntries = mutableEntries2;
                        anonymousClass1 = anonymousClass12;
                        sequenceScope = sequenceScope2;
                        if (i2 != length) {
                            i2++;
                            i7 = i14;
                            j2 = jArr[i2];
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) == -9187201950435737472L) {
                                int i16 = 8 - ((~(i2 - length)) >>> 31);
                                int i17 = i2;
                                i11 = length;
                                i10 = i17;
                                sequenceScope2 = sequenceScope;
                                i8 = 0;
                                jArr2 = jArr;
                                mutableEntries2 = mutableEntries;
                                i9 = i16;
                                anonymousClass12 = anonymousClass1;
                                j3 = j2;
                                if (i8 < i9) {
                                    if ((255 & j3) < 128) {
                                        anonymousClass12.J2((i10 << 3) + i8);
                                        i12 = i5;
                                        MutableMapEntry mutableMapEntry = new MutableMapEntry(mutableEntries2.parent.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_KEYS java.lang.String, mutableEntries2.parent.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String, anonymousClass12.getCurrent());
                                        this.E2 = sequenceScope2;
                                        this.f14790n = anonymousClass12;
                                        this.f14793t = mutableEntries2;
                                        this.f14784O = jArr2;
                                        this.J2 = i11;
                                        this.f14792r = i10;
                                        this.f14785S = j3;
                                        this.f14791o = i9;
                                        this.f14787Z = i8;
                                        i13 = 1;
                                        this.f14789g = 1;
                                        if (sequenceScope2.yield(mutableMapEntry, this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    } else {
                                        int i122 = i5;
                                        int i132 = i7;
                                    }
                                    j3 >>= i122;
                                    i8 += i132;
                                    i7 = i132;
                                    i5 = i122;
                                    if (i8 < i9) {
                                    }
                                }
                            } else {
                                i14 = i7;
                                if (i2 != length) {
                                }
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
            }
        }

        AnonymousClass1() {
            this.iterator = SequencesKt.iterator(new C04901(MutableEntries.this, this, null));
        }

        public final void J2(int i2) {
            this.current = i2;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            return (Map.Entry) this.iterator.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.iterator.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.current != -1) {
                MutableEntries.this.parent.S(this.current);
                this.current = -1;
            }
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getCurrent() {
            return this.current;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    public MutableEntries(MutableScatterMap parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.parent = parent;
    }

    public boolean J2(Map.Entry element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return Intrinsics.areEqual(this.parent.O(element.getKey()), element.getValue());
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0083, code lost:
    
        if (((r4 & ((~r4) << 6)) & r11) == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0085, code lost:
    
        r13 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean KN(Map.Entry element) {
        int iNumberOfTrailingZeros;
        Intrinsics.checkNotNullParameter(element, "element");
        MutableScatterMap mutableScatterMap = this.parent;
        Object key = element.getKey();
        int iHashCode = (key != null ? key.hashCode() : 0) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i5 = mutableScatterMap._capacity;
        int i7 = (i2 >>> 7) & i5;
        int i8 = 0;
        loop0: while (true) {
            long[] jArr = mutableScatterMap.metadata;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            int i11 = i7;
            long j2 = (((-i10) >> 63) & (jArr[i9 + 1] << (64 - i10))) | (jArr[i9] >>> i10);
            long j3 = (((long) i3) * 72340172838076673L) ^ j2;
            long j4 = -9187201950435737472L;
            long j5 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j5 == 0) {
                    break;
                }
                iNumberOfTrailingZeros = (i11 + (Long.numberOfTrailingZeros(j5) >> 3)) & i5;
                long j6 = j4;
                if (Intrinsics.areEqual(mutableScatterMap.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_KEYS java.lang.String[iNumberOfTrailingZeros], key)) {
                    break loop0;
                }
                j5 &= j5 - 1;
                j4 = j6;
            }
            i8 += 8;
            i7 = (i11 + i8) & i5;
        }
        if (iNumberOfTrailingZeros < 0 || !Intrinsics.areEqual(this.parent.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String[iNumberOfTrailingZeros], element.getValue())) {
            return false;
        }
        this.parent.S(iNumberOfTrailingZeros);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public boolean add(Map.Entry element) {
        Intrinsics.checkNotNullParameter(element, "element");
        throw new UnsupportedOperationException();
    }

    public int Uo() {
        return this.parent._size;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.parent.gh();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection<Map.Entry> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Map.Entry entry : collection) {
            if (!Intrinsics.areEqual(this.parent.O(entry.getKey()), entry.getValue())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.parent.KN();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new AnonymousClass1();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        long[] jArr = this.parent.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i2 = 0;
        boolean z2 = false;
        while (true) {
            long j2 = jArr[i2];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i5 = 0; i5 < i3; i5++) {
                    if ((255 & j2) < 128) {
                        int i7 = (i2 << 3) + i5;
                        Iterator it = elements.iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            if (Intrinsics.areEqual(entry.getKey(), this.parent.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_KEYS java.lang.String[i7]) && Intrinsics.areEqual(entry.getValue(), this.parent.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String[i7])) {
                                this.parent.S(i7);
                                z2 = true;
                                break;
                            }
                        }
                    }
                    j2 >>= 8;
                }
                if (i3 != 8) {
                    return z2;
                }
            }
            if (i2 == length) {
                return z2;
            }
            i2++;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        long[] jArr = this.parent.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i2 = 0;
        boolean z2 = false;
        while (true) {
            long j2 = jArr[i2];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i5 = 0; i5 < i3; i5++) {
                    if ((255 & j2) < 128) {
                        int i7 = (i2 << 3) + i5;
                        Iterator it = elements.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                this.parent.S(i7);
                                z2 = true;
                                break;
                            }
                            Map.Entry entry = (Map.Entry) it.next();
                            if (!Intrinsics.areEqual(entry.getKey(), this.parent.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_KEYS java.lang.String[i7]) || !Intrinsics.areEqual(entry.getValue(), this.parent.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String[i7])) {
                            }
                        }
                    }
                    j2 >>= 8;
                }
                if (i3 != 8) {
                    return z2;
                }
            }
            if (i2 == length) {
                return z2;
            }
            i2++;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return CollectionToArray.toArray(this, array);
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!TypeIntrinsics.isMutableMapEntry(obj)) {
            return false;
        }
        return J2((Map.Entry) obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean remove(Object obj) {
        if (!TypeIntrinsics.isMutableMapEntry(obj)) {
            return false;
        }
        return KN((Map.Entry) obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return Uo();
    }
}
