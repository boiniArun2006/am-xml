package androidx.compose.foundation.lazy.layout;

import androidx.collection.IntList;
import androidx.compose.ui.unit.IntOffset;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\u001ao\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u0004\u0018\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\"\u0018\u0010\u0013\u001a\u00020\u0007*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;", "", "positionedItems", "Landroidx/collection/IntList;", "stickyItems", "", "beforeContentPadding", "afterContentPadding", "layoutWidth", "layoutHeight", "Lkotlin/Function1;", "getAndMeasure", "", "rl", "(Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;Ljava/util/List;Landroidx/collection/IntList;IIIILkotlin/jvm/functions/Function1;)Ljava/util/List;", "t", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)I", "mainAxisOffset", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyLayoutStickyItems.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutStickyItems.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutStickyItemsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 IntList.kt\nandroidx/collection/IntList\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,220:1\n1#2:221\n366#3:222\n237#3,4:233\n242#3:244\n230#4,3:223\n34#4,6:226\n233#4:232\n350#5,7:237\n*S KotlinDebug\n*F\n+ 1 LazyLayoutStickyItems.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutStickyItemsKt\n*L\n178#1:222\n191#1:233,4\n191#1:244\n188#1:223,3\n188#1:226,6\n188#1:232\n192#1:237,7\n*E\n"})
public final class LazyLayoutStickyItemsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int t(LazyLayoutMeasuredItem lazyLayoutMeasuredItem) {
        long jHI = lazyLayoutMeasuredItem.HI(0);
        return lazyLayoutMeasuredItem.getIsVertical() ? IntOffset.qie(jHI) : IntOffset.gh(jHI);
    }

    public static final List rl(StickyItemsPlacement stickyItemsPlacement, List list, IntList intList, int i2, int i3, int i5, int i7, Function1 function1) {
        StickyItemsPlacement stickyItemsPlacement2 = stickyItemsPlacement;
        if (stickyItemsPlacement2 == null || list.isEmpty() || intList._size == 0) {
            return CollectionsKt.emptyList();
        }
        IntList intListRl = stickyItemsPlacement2.rl(((LazyLayoutMeasuredItem) CollectionsKt.first(list)).getIndex(), ((LazyLayoutMeasuredItem) CollectionsKt.last(list)).getIndex(), intList);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(list.size());
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            Object obj = list.get(i8);
            if (intList.t(((LazyLayoutMeasuredItem) obj).getIndex())) {
                arrayList2.add(obj);
            }
        }
        int[] iArr = intListRl.content;
        int i9 = intListRl._size;
        int i10 = 0;
        while (i10 < i9) {
            int i11 = iArr[i10];
            Iterator it = list.iterator();
            int i12 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i12 = -1;
                    break;
                }
                if (((LazyLayoutMeasuredItem) it.next()).getIndex() == i11) {
                    break;
                }
                i12++;
            }
            LazyLayoutMeasuredItem lazyLayoutMeasuredItem = i12 == -1 ? (LazyLayoutMeasuredItem) function1.invoke(Integer.valueOf(i11)) : (LazyLayoutMeasuredItem) list.remove(i12);
            ArrayList arrayList3 = arrayList2;
            LazyLayoutMeasuredItem lazyLayoutMeasuredItem2 = lazyLayoutMeasuredItem;
            int iN = stickyItemsPlacement2.n(arrayList3, i11, lazyLayoutMeasuredItem.getMainAxisSizeWithSpacings(), i12 == -1 ? Integer.MIN_VALUE : t(lazyLayoutMeasuredItem), i2, i3, i5, i7);
            lazyLayoutMeasuredItem2.J2(true);
            lazyLayoutMeasuredItem2.qie(iN, 0, i5, i7);
            arrayList.add(lazyLayoutMeasuredItem2);
            i10++;
            stickyItemsPlacement2 = stickyItemsPlacement;
            arrayList2 = arrayList3;
        }
        return arrayList;
    }
}
