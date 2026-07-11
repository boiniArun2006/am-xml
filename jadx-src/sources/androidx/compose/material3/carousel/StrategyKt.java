package androidx.compose.material3.carousel;

import androidx.collection.FloatList;
import androidx.collection.FloatListKt;
import androidx.collection.MutableFloatList;
import androidx.compose.ui.util.MathHelpersKt;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\n\u001a%\u0010\u0005\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\t\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\t\u0010\u0006\u001a5\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a5\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000f\u0010\u000e\u001a?\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a7\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a-\u0010!\u001a\u00020 2\u0006\u0010\u001c\u001a\u00020\u00032\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010\"\u001a'\u0010'\u001a\u00020&2\u0006\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020\u0003H\u0002¢\u0006\u0004\b'\u0010(\u001a/\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00120)*\b\u0012\u0004\u0012\u00020\u00120)2\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0014H\u0002¢\u0006\u0004\b*\u0010+\u001a7\u00101\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u00032\u0006\u0010.\u001a\u00020\u00032\u0006\u0010/\u001a\u00020\u00032\u0006\u00100\u001a\u00020\u0003H\u0002¢\u0006\u0004\b1\u00102¨\u00063"}, d2 = {"", "Landroidx/compose/material3/carousel/KeylineList;", "startKeylineSteps", "", "beforeContentPadding", "ty", "(Ljava/util/List;F)F", "endKeylineSteps", "afterContentPadding", "gh", "defaultKeylines", "carouselMainAxisSize", "itemSpacing", "az", "(Landroidx/compose/material3/carousel/KeylineList;FFF)Ljava/util/List;", "mUb", "from", "contentPadding", "Landroidx/compose/material3/carousel/Keyline;", "pivot", "", "pivotIndex", "xMQ", "(Landroidx/compose/material3/carousel/KeylineList;FFFLandroidx/compose/material3/carousel/Keyline;I)Landroidx/compose/material3/carousel/KeylineList;", "srcIndex", "dstIndex", "r", "(Landroidx/compose/material3/carousel/KeylineList;IIFF)Landroidx/compose/material3/carousel/KeylineList;", "totalShiftDistance", "steps", "", "isShiftingLeft", "Landroidx/collection/FloatList;", "HI", "(FLjava/util/List;Z)Landroidx/collection/FloatList;", "stepsCount", "shiftPoint", "interpolation", "Landroidx/compose/material3/carousel/ShiftPointRange;", "qie", "(ILandroidx/collection/FloatList;F)Landroidx/compose/material3/carousel/ShiftPointRange;", "", "Ik", "(Ljava/util/List;II)Ljava/util/List;", "outputMin", "outputMax", "inputMin", "inputMax", "value", "ck", "(FFFFF)F", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strategy.kt\nandroidx/compose/material3/carousel/StrategyKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,626:1\n235#2,3:627\n33#2,4:630\n238#2,2:634\n38#2:636\n240#2:637\n277#2,3:638\n69#2,4:641\n280#2,2:645\n74#2:647\n282#2:648\n1549#3:649\n1620#3,3:650\n1855#3,2:653\n*S KotlinDebug\n*F\n+ 1 Strategy.kt\nandroidx/compose/material3/carousel/StrategyKt\n*L\n483#1:627,3\n483#1:630,4\n483#1:634,2\n483#1:636\n483#1:637\n501#1:638,3\n501#1:641,4\n501#1:645,2\n501#1:647\n501#1:648\n562#1:649\n562#1:650,3\n590#1:653,2\n*E\n"})
public final class StrategyKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final FloatList HI(float f3, List list, boolean z2) {
        MutableFloatList mutableFloatListN = FloatListKt.n(0.0f);
        if (f3 != 0.0f && !list.isEmpty()) {
            IntRange intRangeUntil = RangesKt.until(1, list.size());
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
            Iterator<Integer> it = intRangeUntil.iterator();
            while (it.hasNext()) {
                int iNextInt = ((IntIterator) it).nextInt();
                int i2 = iNextInt - 1;
                KeylineList keylineList = (KeylineList) list.get(i2);
                KeylineList keylineList2 = (KeylineList) list.get(iNextInt);
                arrayList.add(Boolean.valueOf(mutableFloatListN.nr(iNextInt == CollectionsKt.getLastIndex(list) ? 1.0f : mutableFloatListN.n(i2) + ((z2 ? ((Keyline) CollectionsKt.first((List) keylineList2)).getUnadjustedOffset() - ((Keyline) CollectionsKt.first((List) keylineList)).getUnadjustedOffset() : ((Keyline) CollectionsKt.last((List) keylineList)).getUnadjustedOffset() - ((Keyline) CollectionsKt.last((List) keylineList2)).getUnadjustedOffset()) / f3))));
            }
        }
        return mutableFloatListN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ShiftPointRange qie(int i2, FloatList floatList, float f3) {
        float fN = floatList.n(0);
        Iterator<Integer> it = RangesKt.until(1, i2).iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            float fN2 = floatList.n(iNextInt);
            if (f3 <= fN2) {
                return new ShiftPointRange(iNextInt - 1, iNextInt, ck(0.0f, 1.0f, fN, fN2, f3));
            }
            fN = fN2;
        }
        return new ShiftPointRange(0, 0, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float ck(float f3, float f4, float f5, float f6, float f7) {
        return f7 <= f5 ? f3 : f7 >= f6 ? f4 : MathHelpersKt.rl(f3, f4, (f7 - f5) / (f6 - f5));
    }

    private static final KeylineList r(final KeylineList keylineList, final int i2, final int i3, float f3, float f4) {
        int i5 = i2 > i3 ? 1 : -1;
        return KeylineListKt.rl(f3, f4, keylineList.getPivotIndex() + i5, keylineList.r().getOffset() + (((keylineList.get(i2).getSize() - keylineList.get(i2).getCutoff()) + f4) * i5), new Function1<KeylineListScope, Unit>() { // from class: androidx.compose.material3.carousel.StrategyKt$moveKeylineAndCreateShiftedKeylineList$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(KeylineListScope keylineListScope) {
                n(keylineListScope);
                return Unit.INSTANCE;
            }

            public final void n(KeylineListScope keylineListScope) {
                List listIk = StrategyKt.Ik(CollectionsKt.toMutableList((Collection) keylineList), i2, i3);
                int size = listIk.size();
                for (int i7 = 0; i7 < size; i7++) {
                    Keyline keyline = (Keyline) listIk.get(i7);
                    keylineListScope.rl(keyline.getSize(), keyline.getIsAnchor());
                }
            }
        });
    }

    private static final KeylineList xMQ(final KeylineList keylineList, float f3, float f4, float f5, Keyline keyline, int i2) {
        ArrayList arrayList = new ArrayList(keylineList.size());
        int size = keylineList.size();
        for (int i3 = 0; i3 < size; i3++) {
            Keyline keyline2 = keylineList.get(i3);
            if (!keyline2.getIsAnchor()) {
                arrayList.add(keyline2);
            }
        }
        final float size2 = f5 / arrayList.size();
        KeylineList keylineListRl = KeylineListKt.rl(f3, f4, i2, (keyline.getOffset() - (size2 / 2.0f)) + f5, new Function1<KeylineListScope, Unit>() { // from class: androidx.compose.material3.carousel.StrategyKt$createShiftedKeylineListForContentPadding$newKeylines$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(KeylineListScope keylineListScope) {
                n(keylineListScope);
                return Unit.INSTANCE;
            }

            public final void n(KeylineListScope keylineListScope) {
                KeylineList keylineList2 = keylineList;
                float f6 = size2;
                int size3 = keylineList2.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    Keyline keyline3 = keylineList2.get(i5);
                    keylineListScope.rl(keyline3.getSize() - Math.abs(f6), keyline3.getIsAnchor());
                }
            }
        });
        ArrayList arrayList2 = new ArrayList(keylineListRl.size());
        int size3 = keylineListRl.size();
        for (int i5 = 0; i5 < size3; i5++) {
            arrayList2.add(Keyline.rl(keylineListRl.get(i5), 0.0f, 0.0f, keylineList.get(i5).getUnadjustedOffset(), false, false, false, 0.0f, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, null));
        }
        return new KeylineList(arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List Ik(List list, int i2, int i3) {
        Keyline keyline = (Keyline) list.get(i2);
        list.remove(i2);
        list.add(i3, keyline);
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List az(KeylineList keylineList, float f3, float f4, float f5) {
        if (keylineList.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(keylineList);
        if (keylineList.WPU()) {
            if (f5 == 0.0f) {
                return arrayList;
            }
            arrayList.add(xMQ(keylineList, f3, f4, f5, keylineList.KN(), keylineList.getFirstFocalIndex()));
            return arrayList;
        }
        int firstNonAnchorIndex = keylineList.getFirstNonAnchorIndex();
        int firstFocalIndex = keylineList.getFirstFocalIndex() - firstNonAnchorIndex;
        if (firstFocalIndex <= 0 && keylineList.KN().getCutoff() > 0.0f) {
            arrayList.add(r(keylineList, 0, 0, f3, f4));
            return arrayList;
        }
        for (int i2 = 0; i2 < firstFocalIndex; i2++) {
            KeylineList keylineList2 = (KeylineList) CollectionsKt.last((List) arrayList);
            int i3 = firstNonAnchorIndex + i2;
            int lastIndex = CollectionsKt.getLastIndex(keylineList);
            if (i3 > 0) {
                lastIndex = keylineList2.J2(keylineList.get(i3 - 1).getSize()) - 1;
            }
            arrayList.add(r(keylineList2, keylineList.getFirstNonAnchorIndex(), lastIndex, f3, f4));
        }
        if (f5 == 0.0f) {
            return arrayList;
        }
        arrayList.set(CollectionsKt.getLastIndex(arrayList), xMQ((KeylineList) CollectionsKt.last((List) arrayList), f3, f4, f5, ((KeylineList) CollectionsKt.last((List) arrayList)).KN(), ((KeylineList) CollectionsKt.last((List) arrayList)).getFirstFocalIndex()));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float gh(List list, float f3) {
        if (list.isEmpty()) {
            return 0.0f;
        }
        return Math.max(((Keyline) CollectionsKt.last((List) CollectionsKt.first(list))).getUnadjustedOffset() - ((Keyline) CollectionsKt.last((List) CollectionsKt.last(list))).getUnadjustedOffset(), f3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List mUb(KeylineList keylineList, float f3, float f4, float f5) {
        int iViF;
        if (keylineList.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(keylineList);
        if (keylineList.aYN(f3)) {
            if (f5 == 0.0f) {
                return arrayList;
            }
            arrayList.add(xMQ(keylineList, f3, f4, -f5, keylineList.ty(), keylineList.getLastFocalIndex()));
            return arrayList;
        }
        int lastFocalIndex = keylineList.getLastFocalIndex();
        int lastNonAnchorIndex = keylineList.getLastNonAnchorIndex();
        int i2 = lastNonAnchorIndex - lastFocalIndex;
        if (i2 <= 0 && keylineList.ty().getCutoff() > 0.0f) {
            arrayList.add(r(keylineList, 0, 0, f3, f4));
            return arrayList;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            KeylineList keylineList2 = (KeylineList) CollectionsKt.last((List) arrayList);
            int i5 = lastNonAnchorIndex - i3;
            if (i5 < CollectionsKt.getLastIndex(keylineList)) {
                iViF = keylineList2.ViF(keylineList.get(i5 + 1).getSize()) + 1;
            } else {
                iViF = 0;
            }
            arrayList.add(r(keylineList2, keylineList.getLastNonAnchorIndex(), iViF, f3, f4));
        }
        if (f5 == 0.0f) {
            return arrayList;
        }
        arrayList.set(CollectionsKt.getLastIndex(arrayList), xMQ((KeylineList) CollectionsKt.last((List) arrayList), f3, f4, -f5, ((KeylineList) CollectionsKt.last((List) arrayList)).ty(), ((KeylineList) CollectionsKt.last((List) arrayList)).getLastFocalIndex()));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float ty(List list, float f3) {
        if (list.isEmpty()) {
            return 0.0f;
        }
        return Math.max(((Keyline) CollectionsKt.first((List) CollectionsKt.last(list))).getUnadjustedOffset() - ((Keyline) CollectionsKt.first((List) CollectionsKt.first(list))).getUnadjustedOffset(), f3);
    }
}
