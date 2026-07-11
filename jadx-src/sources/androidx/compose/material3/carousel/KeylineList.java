package androidx.compose.material3.carousel;

import androidx.compose.runtime.internal.StabilityInferred;
import com.caoccao.javet.values.reference.builtin.V8ValueBuiltInSymbol;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010*\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b \b\u0000\u0018\u0000 M2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001NB\u0017\b\u0000\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0003¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\f\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0096\u0001¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0096\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0096\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u0013J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001dJ&\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0007¢\u0006\u0004\b\"\u0010\u0015J\u0015\u0010%\u001a\u00020\u00072\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0015\u0010(\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020#¢\u0006\u0004\b(\u0010)J\u0015\u0010*\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020#¢\u0006\u0004\b*\u0010)J\u0015\u0010,\u001a\u00020\u00022\u0006\u0010+\u001a\u00020#¢\u0006\u0004\b,\u0010-J\u0015\u0010.\u001a\u00020\u00022\u0006\u0010+\u001a\u00020#¢\u0006\u0004\b.\u0010-J\u001a\u00101\u001a\u00020\u00072\b\u00100\u001a\u0004\u0018\u00010/H\u0096\u0002¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u000eH\u0016¢\u0006\u0004\b3\u00104R\u0017\u00108\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00104R\u0017\u0010:\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\b\u00106\u001a\u0004\b9\u00104R\u0017\u0010<\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b(\u00106\u001a\u0004\b;\u00104R\u0017\u0010?\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b=\u00106\u001a\u0004\b>\u00104R\u0017\u0010A\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b7\u00106\u001a\u0004\b@\u00104R\u0014\u0010'\u001a\u00020\u000e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bB\u00104R\u0011\u0010D\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b=\u0010CR\u0011\u0010F\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bE\u0010CR\u0011\u0010H\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bG\u0010CR\u0011\u0010J\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bI\u0010CR\u0011\u0010L\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bK\u0010C¨\u0006O"}, d2 = {"Landroidx/compose/material3/carousel/KeylineList;", "", "Landroidx/compose/material3/carousel/Keyline;", "keylines", "<init>", "(Ljava/util/List;)V", "element", "", "O", "(Landroidx/compose/material3/carousel/Keyline;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "", "index", "Uo", "(I)Landroidx/compose/material3/carousel/Keyline;", "S", "(Landroidx/compose/material3/carousel/Keyline;)I", "isEmpty", "()Z", "", V8ValueBuiltInSymbol.PROPERTY_ITERATOR, "()Ljava/util/Iterator;", "nY", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "WPU", "", "carouselMainAxisSize", "aYN", "(F)Z", "size", "J2", "(F)I", "ViF", "unadjustedOffset", "az", "(F)Landroidx/compose/material3/carousel/Keyline;", "qie", "", InneractiveMediationNameConsts.OTHER, "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "t", "I", "o", "pivotIndex", "gh", "firstNonAnchorIndex", "Ik", "lastNonAnchorIndex", "r", "xMQ", "firstFocalIndex", "HI", "lastFocalIndex", "XQ", "()Landroidx/compose/material3/carousel/Keyline;", "pivot", "mUb", "firstNonAnchor", "ck", "lastNonAnchor", "KN", "firstFocal", "ty", "lastFocal", "Z", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nKeylineList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KeylineList.kt\nandroidx/compose/material3/carousel/KeylineList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,566:1\n350#2,7:567\n350#2,7:574\n378#2,7:581\n350#2,7:588\n378#2,7:595\n288#2,2:602\n288#2,2:604\n116#3,2:606\n33#3,6:608\n118#3:614\n69#3,6:615\n33#3,6:621\n*S KotlinDebug\n*F\n+ 1 KeylineList.kt\nandroidx/compose/material3/carousel/KeylineList\n*L\n72#1:567,7\n82#1:574,7\n96#1:581,7\n110#1:588,7\n128#1:595,7\n180#1:602,2\n194#1:604,2\n217#1:606,2\n217#1:608,6\n217#1:614\n225#1:615,6\n232#1:621,6\n*E\n"})
public final class KeylineList implements List<Keyline>, KMappedMarker {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final int lastNonAnchorIndex;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final int firstNonAnchorIndex;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ List f28957n;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final int lastFocalIndex;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final int firstFocalIndex;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final int pivotIndex;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final int f28953S = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final KeylineList f28955g = new KeylineList(CollectionsKt.emptyList());

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/material3/carousel/KeylineList$Companion;", "", "<init>", "()V", "Landroidx/compose/material3/carousel/KeylineList;", "Empty", "Landroidx/compose/material3/carousel/KeylineList;", c.f62177j, "()Landroidx/compose/material3/carousel/KeylineList;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KeylineList n() {
            return KeylineList.f28955g;
        }
    }

    public boolean O(Keyline element) {
        return this.f28957n.contains(element);
    }

    public int S(Keyline element) {
        return this.f28957n.indexOf(element);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: Uo, reason: merged with bridge method [inline-methods] */
    public Keyline get(int index) {
        return (Keyline) this.f28957n.get(index);
    }

    public int XQ() {
        return this.f28957n.size();
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i2, Keyline keyline) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i2, Collection<? extends Keyline> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection elements) {
        return this.f28957n.containsAll(elements);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KeylineList)) {
            return false;
        }
        KeylineList keylineList = (KeylineList) other;
        if (size() != keylineList.size()) {
            return false;
        }
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!Intrinsics.areEqual(get(i2), keylineList.get(i2))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f28957n.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return this.f28957n.iterator();
    }

    @Override // java.util.List
    public ListIterator<Keyline> listIterator() {
        return this.f28957n.listIterator();
    }

    public int nY(Keyline element) {
        return this.f28957n.lastIndexOf(element);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Keyline remove(int i2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<Keyline> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Keyline set(int i2, Keyline keyline) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void sort(Comparator<? super Keyline> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<Keyline> subList(int fromIndex, int toIndex) {
        return this.f28957n.subList(fromIndex, toIndex);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    /* JADX INFO: renamed from: HI, reason: from getter */
    public final int getLastFocalIndex() {
        return this.lastFocalIndex;
    }

    /* JADX INFO: renamed from: Ik, reason: from getter */
    public final int getLastNonAnchorIndex() {
        return this.lastNonAnchorIndex;
    }

    public final int J2(float size) {
        Integer next;
        Iterator<Integer> it = new IntRange(this.lastFocalIndex, CollectionsKt.getLastIndex(this)).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (get(next.intValue()).getSize() == size) {
                break;
            }
        }
        Integer num = next;
        return num != null ? num.intValue() : CollectionsKt.getLastIndex(this);
    }

    public final Keyline KN() {
        Keyline keyline = (Keyline) CollectionsKt.getOrNull(this, this.firstFocalIndex);
        if (keyline != null) {
            return keyline;
        }
        throw new NoSuchElementException("All KeylineLists must have at least one focal keyline");
    }

    public final int ViF(float size) {
        Integer next;
        Iterator<Integer> it = RangesKt.downTo(this.firstFocalIndex - 1, 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (get(next.intValue()).getSize() == size) {
                break;
            }
        }
        Integer num = next;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Keyline ck() {
        return get(this.lastNonAnchorIndex);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Keyline) {
            return O((Keyline) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: gh, reason: from getter */
    public final int getFirstNonAnchorIndex() {
        return this.firstNonAnchorIndex;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Keyline) {
            return S((Keyline) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Keyline) {
            return nY((Keyline) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<Keyline> listIterator(int index) {
        return this.f28957n.listIterator(index);
    }

    public final Keyline mUb() {
        return get(this.firstNonAnchorIndex);
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final int getPivotIndex() {
        return this.pivotIndex;
    }

    public final Keyline r() {
        return get(this.pivotIndex);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return CollectionToArray.toArray(this, objArr);
    }

    public final Keyline ty() {
        Keyline keyline = (Keyline) CollectionsKt.getOrNull(this, this.lastFocalIndex);
        if (keyline != null) {
            return keyline;
        }
        throw new NoSuchElementException("All KeylineLists must have at least one focal keyline");
    }

    /* JADX INFO: renamed from: xMQ, reason: from getter */
    public final int getFirstFocalIndex() {
        return this.firstFocalIndex;
    }

    public KeylineList(List list) {
        int iNextIndex;
        int iNextIndex2;
        this.f28957n = list;
        Iterator<Keyline> it = iterator();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            iNextIndex = -1;
            if (it.hasNext()) {
                if (it.next().getIsPivot()) {
                    break;
                } else {
                    i3++;
                }
            } else {
                i3 = -1;
                break;
            }
        }
        this.pivotIndex = i3;
        Iterator<Keyline> it2 = iterator();
        int i5 = 0;
        while (true) {
            if (it2.hasNext()) {
                if (!it2.next().getIsAnchor()) {
                    break;
                } else {
                    i5++;
                }
            } else {
                i5 = -1;
                break;
            }
        }
        this.firstNonAnchorIndex = i5;
        ListIterator<Keyline> listIterator = listIterator(size());
        while (true) {
            if (listIterator.hasPrevious()) {
                if (!listIterator.previous().getIsAnchor()) {
                    iNextIndex2 = listIterator.nextIndex();
                    break;
                }
            } else {
                iNextIndex2 = -1;
                break;
            }
        }
        this.lastNonAnchorIndex = iNextIndex2;
        Iterator<Keyline> it3 = iterator();
        while (true) {
            if (it3.hasNext()) {
                if (it3.next().getIsFocal()) {
                    break;
                } else {
                    i2++;
                }
            } else {
                i2 = -1;
                break;
            }
        }
        this.firstFocalIndex = i2;
        ListIterator<Keyline> listIterator2 = listIterator(size());
        while (true) {
            if (!listIterator2.hasPrevious()) {
                break;
            } else if (listIterator2.previous().getIsFocal()) {
                iNextIndex = listIterator2.nextIndex();
                break;
            }
        }
        this.lastFocalIndex = iNextIndex;
    }

    public final boolean WPU() {
        if (KN().getOffset() - (KN().getSize() / 2) >= 0.0f && Intrinsics.areEqual(KN(), mUb())) {
            return true;
        }
        return false;
    }

    public final boolean aYN(float carouselMainAxisSize) {
        if (ty().getOffset() + (ty().getSize() / 2) <= carouselMainAxisSize && Intrinsics.areEqual(ty(), ck())) {
            return true;
        }
        return false;
    }

    public final Keyline az(float unadjustedOffset) {
        int size = size() - 1;
        if (size >= 0) {
            while (true) {
                int i2 = size - 1;
                Keyline keyline = get(size);
                if (keyline.getUnadjustedOffset() < unadjustedOffset) {
                    return keyline;
                }
                if (i2 < 0) {
                    break;
                }
                size = i2;
            }
        }
        return (Keyline) CollectionsKt.first((List) this);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        int size = size();
        int iHashCode = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iHashCode += get(i2).hashCode() * 31;
        }
        return iHashCode;
    }

    public final Keyline qie(float unadjustedOffset) {
        Keyline keyline;
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                keyline = get(i2);
                if (keyline.getUnadjustedOffset() >= unadjustedOffset) {
                    break;
                }
                i2++;
            } else {
                keyline = null;
                break;
            }
        }
        Keyline keyline2 = keyline;
        if (keyline2 == null) {
            return (Keyline) CollectionsKt.last((List) this);
        }
        return keyline2;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return XQ();
    }
}
