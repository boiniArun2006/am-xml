package androidx.compose.foundation.lazy.layout;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.ObjectIntMap;
import androidx.collection.ObjectIntMapKt;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.runtime.internal.StabilityInferred;
import com.caoccao.javet.values.reference.IV8ValueMap;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/lazy/layout/NearestRangeKeyIndexMap;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "Lkotlin/ranges/IntRange;", "nearestRange", "Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent;", "intervalContent", "<init>", "(Lkotlin/ranges/IntRange;Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent;)V", "", "key", "", "t", "(Ljava/lang/Object;)I", "index", "nr", "(I)Ljava/lang/Object;", "Landroidx/collection/ObjectIntMap;", c.f62177j, "Landroidx/collection/ObjectIntMap;", "map", "", "rl", "[Ljava/lang/Object;", IV8ValueMap.FUNCTION_KEYS, "I", "keysStartIndex", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyLayoutKeyIndexMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutKeyIndexMap.kt\nandroidx/compose/foundation/lazy/layout/NearestRangeKeyIndexMap\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,96:1\n50#2,5:97\n354#3,5:102\n1#4:107\n*S KotlinDebug\n*F\n+ 1 LazyLayoutKeyIndexMap.kt\nandroidx/compose/foundation/lazy/layout/NearestRangeKeyIndexMap\n*L\n62#1:97,5\n92#1:102,5\n*E\n"})
public final class NearestRangeKeyIndexMap implements LazyLayoutKeyIndexMap {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final ObjectIntMap map;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final Object[] keys;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final int keysStartIndex;

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap
    public Object nr(int index) {
        Object[] objArr = this.keys;
        int i2 = index - this.keysStartIndex;
        if (i2 < 0 || i2 > ArraysKt.getLastIndex(objArr)) {
            return null;
        }
        return objArr[i2];
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap
    public int t(Object key) {
        ObjectIntMap objectIntMap = this.map;
        int iRl = objectIntMap.rl(key);
        if (iRl >= 0) {
            return objectIntMap.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String[iRl];
        }
        return -1;
    }

    public NearestRangeKeyIndexMap(IntRange intRange, LazyLayoutIntervalContent lazyLayoutIntervalContent) {
        boolean z2;
        IntervalList intervals = lazyLayoutIntervalContent.getIntervals();
        final int first = intRange.getFirst();
        if (first >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            InlineClassHelperKt.t("negative nearestRange.first");
        }
        final int iMin = Math.min(intRange.getLast(), intervals.getSize() - 1);
        if (iMin < first) {
            this.map = ObjectIntMapKt.n();
            this.keys = new Object[0];
            this.keysStartIndex = 0;
        } else {
            int i2 = (iMin - first) + 1;
            this.keys = new Object[i2];
            this.keysStartIndex = first;
            final MutableObjectIntMap mutableObjectIntMap = new MutableObjectIntMap(i2);
            intervals.n(first, iMin, new Function1<IntervalList.Interval<? extends LazyLayoutIntervalContent.Interval>, Unit>() { // from class: androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(IntervalList.Interval<? extends LazyLayoutIntervalContent.Interval> interval) {
                    n(interval);
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0039  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void n(IntervalList.Interval interval) {
                    Object objN;
                    Function1 key = ((LazyLayoutIntervalContent.Interval) interval.getValue()).getKey();
                    int iMax = Math.max(first, interval.getStartIndex());
                    int iMin2 = Math.min(iMin, (interval.getStartIndex() + interval.getSize()) - 1);
                    if (iMax > iMin2) {
                        return;
                    }
                    while (true) {
                        if (key != null) {
                            objN = key.invoke(Integer.valueOf(iMax - interval.getStartIndex()));
                            if (objN == null) {
                            }
                        } else {
                            objN = Lazy_androidKt.n(iMax);
                        }
                        mutableObjectIntMap.XQ(objN, iMax);
                        this.keys[iMax - this.keysStartIndex] = objN;
                        if (iMax != iMin2) {
                            iMax++;
                        } else {
                            return;
                        }
                    }
                }
            });
            this.map = mutableObjectIntMap;
        }
    }
}
