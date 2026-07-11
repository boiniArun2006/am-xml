package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.caoccao.javet.values.reference.builtin.V8ValueBuiltInSymbol;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.brandsafety.l;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableCollection;
import kotlin.jvm.internal.markers.KMutableSet;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0010#\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0013\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001FB\u0013\b\u0007\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u0007J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u0010J\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001b\u0010\u0010J\u0015\u0010\u001c\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u0017J\u0015\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00010\u001d\"\u0004\b\u0001\u0010 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010\u001d¢\u0006\u0004\b\u001e\u0010\"J\u001a\u0010$\u001a\u00020\u000e2\b\u0010#\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b$\u0010\u0010J\u000f\u0010%\u001a\u00020\u0004H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000*H\u0096\u0002¢\u0006\u0004\b+\u0010,J\u001d\u0010/\u001a\u00020\u000e2\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0016¢\u0006\u0004\b/\u00100J\u001d\u00101\u001a\u00020\u000e2\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0016¢\u0006\u0004\b1\u00100J\u001d\u00102\u001a\u00020\u000e2\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0016¢\u0006\u0004\b2\u00100J\u001d\u00103\u001a\u00020\u000e2\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0016¢\u0006\u0004\b3\u00100R\"\u0010;\u001a\u0002048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R*\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010<\u001a\u0004\b=\u0010\u001f\"\u0004\b>\u0010?R\"\u0010C\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b=\u0010@\u001a\u0004\bA\u0010&\"\u0004\bB\u0010\u0007R\u0014\u0010E\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010&¨\u0006G"}, d2 = {"Landroidx/collection/ArraySet;", "E", "", "", "", "capacity", "<init>", "(I)V", "", "clear", "()V", "minimumCapacity", "t", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "key", "indexOf", "(Ljava/lang/Object;)I", "index", "az", "(I)Ljava/lang/Object;", "isEmpty", "()Z", l.f62657l, "remove", "xMQ", "", "toArray", "()[Ljava/lang/Object;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "array", "([Ljava/lang/Object;)[Ljava/lang/Object;", InneractiveMediationNameConsts.OTHER, "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "", V8ValueBuiltInSymbol.PROPERTY_ITERATOR, "()Ljava/util/Iterator;", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "addAll", "removeAll", "retainAll", "", c.f62177j, "[I", "J2", "()[I", "gh", "([I)V", "hashes", "[Ljava/lang/Object;", "O", "mUb", "([Ljava/lang/Object;)V", "I", "KN", "qie", "_size", "Uo", "size", "ElementIterator", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nArraySet.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArraySet.jvm.kt\nandroidx/collection/ArraySet\n+ 2 ArraySet.kt\nandroidx/collection/ArraySetKt\n*L\n1#1,283:1\n288#2,10:284\n301#2,14:294\n318#2:308\n323#2:309\n328#2:310\n333#2:311\n338#2,61:312\n403#2,17:373\n423#2,6:390\n433#2,60:396\n501#2,9:456\n514#2,22:465\n540#2,7:487\n551#2,19:494\n574#2,6:513\n584#2,6:519\n594#2,5:525\n603#2,8:530\n*S KotlinDebug\n*F\n+ 1 ArraySet.jvm.kt\nandroidx/collection/ArraySet\n*L\n89#1:284,10\n98#1:294,14\n108#1:308\n118#1:309\n128#1:310\n133#1:311\n145#1:312,61\n155#1:373,17\n165#1:390,6\n176#1:396,60\n185#1:456,9\n210#1:465,22\n215#1:487,7\n223#1:494,19\n250#1:513,6\n259#1:519,6\n269#1:525,5\n280#1:530,8\n*E\n"})
public final class ArraySet<E> implements Collection<E>, Set<E>, KMutableCollection, KMutableSet {

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private int _size;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int[] hashes;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private Object[] array;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/collection/ArraySet$ElementIterator;", "Landroidx/collection/IndexBasedArrayIterator;", "<init>", "(Landroidx/collection/ArraySet;)V", "", "index", "t", "(I)Ljava/lang/Object;", "", "O", "(I)V", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private final class ElementIterator extends IndexBasedArrayIterator<E> {
        public ElementIterator() {
            super(ArraySet.this.get_size());
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        protected void O(int index) {
            ArraySet.this.xMQ(index);
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        protected Object t(int index) {
            return ArraySet.this.az(index);
        }
    }

    public ArraySet() {
        this(0, 1, null);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Set) || size() != ((Set) other).size()) {
            return false;
        }
        try {
            int i2 = get_size();
            for (int i3 = 0; i3 < i2; i3++) {
                if (!((Set) other).contains(az(i3))) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return ArraysKt.copyOfRange(this.array, 0, this._size);
    }

    public ArraySet(int i2) {
        this.hashes = ContainerHelpersKt.f14931n;
        this.array = ContainerHelpersKt.f14932t;
        if (i2 > 0) {
            ArraySetKt.n(this, i2);
        }
    }

    /* JADX INFO: renamed from: J2, reason: from getter */
    public final int[] getHashes() {
        return this.hashes;
    }

    /* JADX INFO: renamed from: KN, reason: from getter */
    public final int get_size() {
        return this._size;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final Object[] getArray() {
        return this.array;
    }

    public int Uo() {
        return this._size;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(Object element) {
        int i2;
        int iT;
        int i3 = get_size();
        if (element == null) {
            iT = ArraySetKt.nr(this);
            i2 = 0;
        } else {
            int iHashCode = element.hashCode();
            i2 = iHashCode;
            iT = ArraySetKt.t(this, element, iHashCode);
        }
        if (iT >= 0) {
            return false;
        }
        int i5 = ~iT;
        if (i3 >= getHashes().length) {
            int i7 = 8;
            if (i3 >= 8) {
                i7 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i7 = 4;
            }
            int[] hashes = getHashes();
            Object[] array = getArray();
            ArraySetKt.n(this, i7);
            if (i3 != get_size()) {
                throw new ConcurrentModificationException();
            }
            if (!(getHashes().length == 0)) {
                ArraysKt.copyInto$default(hashes, getHashes(), 0, 0, hashes.length, 6, (Object) null);
                ArraysKt.copyInto$default(array, getArray(), 0, 0, array.length, 6, (Object) null);
            }
        }
        if (i5 < i3) {
            int i8 = i5 + 1;
            ArraysKt.copyInto(getHashes(), getHashes(), i8, i5, i3);
            ArraysKt.copyInto(getArray(), getArray(), i8, i5, i3);
        }
        if (i3 != get_size() || i5 >= getHashes().length) {
            throw new ConcurrentModificationException();
        }
        getHashes()[i5] = i2;
        getArray()[i5] = element;
        qie(get_size() + 1);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        t(get_size() + elements.size());
        Iterator<E> it = elements.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<E> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void gh(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<set-?>");
        this.hashes = iArr;
    }

    public final int indexOf(Object key) {
        return key == null ? ArraySetKt.nr(this) : ArraySetKt.t(this, key, key.hashCode());
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new ElementIterator();
    }

    public final void mUb(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<set-?>");
        this.array = objArr;
    }

    public final void qie(int i2) {
        this._size = i2;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<E> it = elements.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z2 = false;
        for (int i2 = get_size() - 1; -1 < i2; i2--) {
            if (!CollectionsKt.contains(elements, getArray()[i2])) {
                xMQ(i2);
                z2 = true;
            }
        }
        return z2;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        Object[] objArrN = ArraySetJvmUtil.n(array, this._size);
        ArraysKt.copyInto(this.array, objArrN, 0, 0, this._size);
        Intrinsics.checkNotNull(objArrN);
        return objArrN;
    }

    public final Object az(int index) {
        return getArray()[index];
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        if (get_size() != 0) {
            gh(ContainerHelpersKt.f14931n);
            mUb(ContainerHelpersKt.f14932t);
            qie(0);
        }
        if (get_size() == 0) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object element) {
        if (indexOf(element) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] hashes = getHashes();
        int i2 = get_size();
        int i3 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            i3 += hashes[i5];
        }
        return i3;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        if (get_size() <= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object element) {
        int iIndexOf = indexOf(element);
        if (iIndexOf >= 0) {
            xMQ(iIndexOf);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return Uo();
    }

    public final void t(int minimumCapacity) {
        int i2 = get_size();
        if (getHashes().length < minimumCapacity) {
            int[] hashes = getHashes();
            Object[] array = getArray();
            ArraySetKt.n(this, minimumCapacity);
            if (get_size() > 0) {
                ArraysKt.copyInto$default(hashes, getHashes(), 0, 0, get_size(), 6, (Object) null);
                ArraysKt.copyInto$default(array, getArray(), 0, 0, get_size(), 6, (Object) null);
            }
        }
        if (get_size() == i2) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public String toString() {
        if (isEmpty()) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb = new StringBuilder(get_size() * 14);
        sb.append('{');
        int i2 = get_size();
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object objAz = az(i3);
            if (objAz != this) {
                sb.append(objAz);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final Object xMQ(int index) {
        int i2;
        Object[] objArr;
        int i3 = get_size();
        Object obj = getArray()[index];
        if (i3 <= 1) {
            clear();
            return obj;
        }
        int i5 = i3 - 1;
        int i7 = 8;
        if (getHashes().length > 8 && get_size() < getHashes().length / 3) {
            if (get_size() > 8) {
                i7 = get_size() + (get_size() >> 1);
            }
            int[] hashes = getHashes();
            Object[] array = getArray();
            ArraySetKt.n(this, i7);
            if (index > 0) {
                ArraysKt.copyInto$default(hashes, getHashes(), 0, 0, index, 6, (Object) null);
                objArr = array;
                ArraysKt.copyInto$default(objArr, getArray(), 0, 0, index, 6, (Object) null);
                i2 = index;
            } else {
                i2 = index;
                objArr = array;
            }
            if (i2 < i5) {
                int i8 = i2 + 1;
                ArraysKt.copyInto(hashes, getHashes(), i2, i8, i3);
                ArraysKt.copyInto(objArr, getArray(), i2, i8, i3);
            }
        } else {
            if (index < i5) {
                int i9 = index + 1;
                ArraysKt.copyInto(getHashes(), getHashes(), index, i9, i3);
                ArraysKt.copyInto(getArray(), getArray(), index, i9, i3);
            }
            getArray()[i5] = null;
        }
        if (i3 == get_size()) {
            qie(i5);
            return obj;
        }
        throw new ConcurrentModificationException();
    }

    public /* synthetic */ ArraySet(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i2);
    }
}
