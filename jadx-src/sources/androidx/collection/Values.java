package androidx.collection;

import com.caoccao.javet.values.reference.builtin.V8ValueBuiltInSymbol;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
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
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Landroidx/collection/Values;", "K", "V", "", "Landroidx/collection/ScatterMap;", "parent", "<init>", "(Landroidx/collection/ScatterMap;)V", "", "isEmpty", "()Z", "", V8ValueBuiltInSymbol.PROPERTY_ITERATOR, "()Ljava/util/Iterator;", "elements", "containsAll", "(Ljava/util/Collection;)Z", "element", "contains", "(Ljava/lang/Object;)Z", c.f62177j, "Landroidx/collection/ScatterMap;", "", "O", "()I", "size", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/Values\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1787:1\n1726#2,3:1788\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/Values\n*L\n1450#1:1788,3\n*E\n"})
final class Values<K, V> implements Collection<V>, KMappedMarker {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final ScatterMap parent;

    /* JADX INFO: renamed from: androidx.collection.Values$iterator$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\u008a@"}, d2 = {"<anonymous>", "", "K", "V", "Lkotlin/sequences/SequenceScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.collection.Values$iterator$1", f = "ScatterMap.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {1446}, m = "invokeSuspend", n = {"$this$iterator", "v$iv", "m$iv$iv", "lastIndex$iv$iv", "i$iv$iv", "slot$iv$iv", "bitCount$iv$iv", "j$iv$iv"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "J$0", "I$2", "I$3"})
    @SourceDebugExtension({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/Values$iterator$1\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1787:1\n372#2,3:1788\n329#2,6:1791\n339#2,3:1798\n342#2,9:1802\n375#2:1811\n1399#3:1797\n1270#3:1801\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/Values$iterator$1\n*L\n1446#1:1788,3\n1446#1:1791,6\n1446#1:1798,3\n1446#1:1802,9\n1446#1:1811\n1446#1:1797\n1446#1:1801\n*E\n"})
    static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super V>, Continuation<? super Unit>, Object> {
        int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f14923O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        int f14924S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        long f14925Z;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private /* synthetic */ Object f14926g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f14927n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f14928o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f14929r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f14930t;

        AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.f14926g = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return invoke((SequenceScope) obj, (Continuation) continuation);
        }

        public final Object invoke(SequenceScope sequenceScope, Continuation continuation) {
            return ((AnonymousClass1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0097  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x009f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0058 -> B:23:0x009d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005a -> B:14:0x006b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0074 -> B:20:0x0094). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0091 -> B:20:0x0094). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            SequenceScope sequenceScope;
            Object[] objArr;
            long[] jArr;
            int length;
            int i2;
            long j2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.f14924S;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                sequenceScope = (SequenceScope) this.f14926g;
                ScatterMap scatterMap = Values.this.parent;
                objArr = scatterMap.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String;
                jArr = scatterMap.metadata;
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
            int i5 = this.f14928o;
            int i7 = this.f14929r;
            long j3 = this.f14925Z;
            i2 = this.J2;
            int i8 = this.f14923O;
            long[] jArr2 = (long[]) this.f14930t;
            Object[] objArr2 = (Object[]) this.f14927n;
            SequenceScope sequenceScope2 = (SequenceScope) this.f14926g;
            ResultKt.throwOnFailure(obj);
            j3 >>= 8;
            i5++;
            if (i5 < i7) {
                if (i7 == 8) {
                    length = i8;
                    jArr = jArr2;
                    objArr = objArr2;
                    sequenceScope = sequenceScope2;
                    if (i2 != length) {
                        i2++;
                        j2 = jArr[i2];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            sequenceScope2 = sequenceScope;
                            i5 = 0;
                            jArr2 = jArr;
                            i8 = length;
                            i7 = 8 - ((~(i2 - length)) >>> 31);
                            objArr2 = objArr;
                            j3 = j2;
                            if (i5 < i7) {
                                if ((255 & j3) < 128) {
                                    Object obj2 = objArr2[(i2 << 3) + i5];
                                    this.f14926g = sequenceScope2;
                                    this.f14927n = objArr2;
                                    this.f14930t = jArr2;
                                    this.f14923O = i8;
                                    this.J2 = i2;
                                    this.f14925Z = j3;
                                    this.f14929r = i7;
                                    this.f14928o = i5;
                                    this.f14924S = 1;
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

    @Override // java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    public Values(ScatterMap parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.parent = parent;
    }

    public int O() {
        return this.parent._size;
    }

    @Override // java.util.Collection
    public boolean contains(Object element) {
        return this.parent.nr(element);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.parent.nr(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.parent.KN();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return SequencesKt.iterator(new AnonymousClass1(null));
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return CollectionToArray.toArray(this, array);
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return O();
    }
}
