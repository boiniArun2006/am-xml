package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo;
import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0015\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0002,-B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\tJ\u0015\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0003J\u001d\u0010\u0017\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0019\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010#R\u0016\u0010&\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010%R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020(0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006."}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;", "", "<init>", "()V", "", "capacity", "newOffset", "", "rl", "(II)V", "itemIndex", "lane", "qie", "KN", "(I)I", "targetLane", "", c.f62177j, "(II)Z", "az", "()I", "xMQ", "mUb", "J2", "(II)I", "O", "requestedIndex", "nr", "(I)V", "", "gaps", "gh", "(I[I)V", "Uo", "(I)[I", "I", "anchor", "[I", "lanes", "Lkotlin/collections/ArrayDeque;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo$SpannedItem;", "t", "Lkotlin/collections/ArrayDeque;", "spannedItems", "Companion", "SpannedItem", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyStaggeredGridLaneInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridLaneInfo.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 Collections.kt\nkotlin/collections/CollectionsKt__CollectionsKt\n*L\n1#1,206:1\n96#2,5:207\n96#2,5:226\n399#3,7:212\n399#3,7:219\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridLaneInfo.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo\n*L\n36#1:207,5\n190#1:226,5\n165#1:212,7\n185#1:219,7\n*E\n"})
public final class LazyStaggeredGridLaneInfo {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int anchor;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private int[] lanes = new int[16];

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final ArrayDeque spannedItems = new ArrayDeque();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final int f18717O = 8;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo$SpannedItem;", "", "", "index", "", "gaps", "<init>", "(I[I)V", c.f62177j, "I", "rl", "()I", "[I", "()[I", "t", "([I)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    static final class SpannedItem {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final int index;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private int[] gaps;

        /* JADX INFO: renamed from: n, reason: from getter */
        public final int[] getGaps() {
            return this.gaps;
        }

        /* JADX INFO: renamed from: rl, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        public final void t(int[] iArr) {
            this.gaps = iArr;
        }

        public SpannedItem(int i2, int[] iArr) {
            this.index = i2;
            this.gaps = iArr;
        }
    }

    public final void qie(int itemIndex, int lane) {
        if (!(itemIndex >= 0)) {
            InlineClassHelperKt.n("Negative lanes are not supported");
        }
        nr(itemIndex);
        this.lanes[itemIndex - this.anchor] = lane + 1;
    }

    private final void rl(int capacity, int newOffset) {
        if (!(capacity <= 131072)) {
            InlineClassHelperKt.n("Requested item capacity " + capacity + " is larger than max supported: 131072!");
        }
        int[] iArr = this.lanes;
        if (iArr.length < capacity) {
            int length = iArr.length;
            while (length < capacity) {
                length *= 2;
            }
            this.lanes = ArraysKt.copyInto$default(this.lanes, new int[length], newOffset, 0, 0, 12, (Object) null);
        }
    }

    static /* synthetic */ void t(LazyStaggeredGridLaneInfo lazyStaggeredGridLaneInfo, int i2, int i3, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i3 = 0;
        }
        lazyStaggeredGridLaneInfo.rl(i2, i3);
    }

    public final int J2(int itemIndex, int targetLane) {
        do {
            itemIndex--;
            if (-1 >= itemIndex) {
                return -1;
            }
        } while (!n(itemIndex, targetLane));
        return itemIndex;
    }

    public final int O(int itemIndex, int targetLane) {
        int iAz = az();
        for (int i2 = itemIndex + 1; i2 < iAz; i2++) {
            if (n(i2, targetLane)) {
                return i2;
            }
        }
        return az();
    }

    public final int[] Uo(int itemIndex) {
        ArrayDeque arrayDeque = this.spannedItems;
        final Integer numValueOf = Integer.valueOf(itemIndex);
        SpannedItem spannedItem = (SpannedItem) CollectionsKt.getOrNull(this.spannedItems, CollectionsKt.binarySearch(arrayDeque, 0, arrayDeque.size(), new Function1<SpannedItem, Integer>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo$getGaps$$inlined$binarySearchBy$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(Object obj) {
                return Integer.valueOf(ComparisonsKt.compareValues(Integer.valueOf(((LazyStaggeredGridLaneInfo.SpannedItem) obj).getIndex()), numValueOf));
            }
        }));
        if (spannedItem != null) {
            return spannedItem.getGaps();
        }
        return null;
    }

    public final int az() {
        return this.anchor + this.lanes.length;
    }

    public final void gh(int itemIndex, int[] gaps) {
        ArrayDeque arrayDeque = this.spannedItems;
        final Integer numValueOf = Integer.valueOf(itemIndex);
        int iBinarySearch = CollectionsKt.binarySearch(arrayDeque, 0, arrayDeque.size(), new Function1<SpannedItem, Integer>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo$setGaps$$inlined$binarySearchBy$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(Object obj) {
                return Integer.valueOf(ComparisonsKt.compareValues(Integer.valueOf(((LazyStaggeredGridLaneInfo.SpannedItem) obj).getIndex()), numValueOf));
            }
        });
        if (iBinarySearch < 0) {
            if (gaps == null) {
                return;
            }
            this.spannedItems.add(-(iBinarySearch + 1), new SpannedItem(itemIndex, gaps));
            return;
        }
        if (gaps == null) {
            this.spannedItems.remove(iBinarySearch);
        } else {
            ((SpannedItem) this.spannedItems.get(iBinarySearch)).t(gaps);
        }
    }

    public final void mUb() {
        ArraysKt.fill$default(this.lanes, 0, 0, 0, 6, (Object) null);
        this.spannedItems.clear();
    }

    public final void nr(int requestedIndex) {
        int i2 = this.anchor;
        int i3 = requestedIndex - i2;
        if (i3 < 0 || i3 >= 131072) {
            int iMax = Math.max(requestedIndex - (this.lanes.length / 2), 0);
            this.anchor = iMax;
            int i5 = iMax - i2;
            if (i5 >= 0) {
                int[] iArr = this.lanes;
                if (i5 < iArr.length) {
                    ArraysKt.copyInto(iArr, iArr, 0, i5, iArr.length);
                }
                int[] iArr2 = this.lanes;
                ArraysKt.fill(iArr2, 0, Math.max(0, iArr2.length - i5), this.lanes.length);
            } else {
                int i7 = -i5;
                int[] iArr3 = this.lanes;
                if (iArr3.length + i7 < 131072) {
                    rl(iArr3.length + i7 + 1, i7);
                } else {
                    if (i7 < iArr3.length) {
                        ArraysKt.copyInto(iArr3, iArr3, i7, 0, iArr3.length - i7);
                    }
                    int[] iArr4 = this.lanes;
                    ArraysKt.fill(iArr4, 0, 0, Math.min(iArr4.length, i7));
                }
            }
        } else {
            t(this, i3 + 1, 0, 2, null);
        }
        while (!this.spannedItems.isEmpty() && ((SpannedItem) this.spannedItems.first()).getIndex() < getAnchor()) {
            this.spannedItems.removeFirst();
        }
        while (!this.spannedItems.isEmpty() && ((SpannedItem) this.spannedItems.last()).getIndex() > az()) {
            this.spannedItems.removeLast();
        }
    }

    /* JADX INFO: renamed from: xMQ, reason: from getter */
    public final int getAnchor() {
        return this.anchor;
    }

    public final int KN(int itemIndex) {
        if (itemIndex >= getAnchor() && itemIndex < az()) {
            return this.lanes[itemIndex - this.anchor] - 1;
        }
        return -1;
    }

    public final boolean n(int itemIndex, int targetLane) {
        int iKN = KN(itemIndex);
        if (iKN != targetLane && iKN != -1 && iKN != -2) {
            return false;
        }
        return true;
    }
}
