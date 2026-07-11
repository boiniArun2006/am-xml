package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ!\u0010\f\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b\u0011\u0010\u0012J9\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0018\u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0004\u0012\u00020\u00100\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\tR \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001bR$\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00058\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u0011\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010!¨\u0006#"}, d2 = {"Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/foundation/lazy/layout/IntervalList;", "<init>", "()V", "", "itemIndex", "Landroidx/compose/foundation/lazy/layout/IntervalList$Interval;", "nr", "(I)Landroidx/compose/foundation/lazy/layout/IntervalList$Interval;", "index", "", "t", "(Landroidx/compose/foundation/lazy/layout/IntervalList$Interval;I)Z", "size", "value", "", "rl", "(ILjava/lang/Object;)V", "fromIndex", "toIndex", "Lkotlin/Function1;", "block", c.f62177j, "(IILkotlin/jvm/functions/Function1;)V", "get", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/runtime/collection/MutableVector;", "intervals", "<set-?>", "I", "getSize", "()I", "Landroidx/compose/foundation/lazy/layout/IntervalList$Interval;", "lastInterval", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIntervalList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntervalList.kt\nandroidx/compose/foundation/lazy/layout/MutableIntervalList\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,204:1\n165#1,4:213\n165#1,4:217\n165#1,4:228\n1101#2:205\n1083#2,2:206\n96#3,5:208\n96#3,5:221\n472#4:226\n472#4:227\n472#4:232\n1#5:233\n*S KotlinDebug\n*F\n+ 1 IntervalList.kt\nandroidx/compose/foundation/lazy/layout/MutableIntervalList\n*L\n133#1:213,4\n134#1:217,4\n150#1:228,4\n94#1:205\n94#1:206,2\n112#1:208,5\n135#1:221,5\n140#1:226\n142#1:227\n159#1:232\n*E\n"})
public final class MutableIntervalList<T> implements IntervalList<T> {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final MutableVector intervals = new MutableVector(new IntervalList.Interval[16], 0);

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private int size;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private IntervalList.Interval lastInterval;

    private final IntervalList.Interval nr(int itemIndex) {
        IntervalList.Interval interval = this.lastInterval;
        if (interval != null && t(interval, itemIndex)) {
            return interval;
        }
        MutableVector mutableVector = this.intervals;
        IntervalList.Interval interval2 = (IntervalList.Interval) mutableVector.content[IntervalListKt.rl(mutableVector, itemIndex)];
        this.lastInterval = interval2;
        return interval2;
    }

    @Override // androidx.compose.foundation.lazy.layout.IntervalList
    public IntervalList.Interval get(int index) {
        if (index < 0 || index >= getSize()) {
            InlineClassHelperKt.O("Index " + index + ", size " + getSize());
        }
        return nr(index);
    }

    @Override // androidx.compose.foundation.lazy.layout.IntervalList
    public int getSize() {
        return this.size;
    }

    @Override // androidx.compose.foundation.lazy.layout.IntervalList
    public void n(int fromIndex, int toIndex, Function1 block) {
        if (fromIndex < 0 || fromIndex >= getSize()) {
            InlineClassHelperKt.O("Index " + fromIndex + ", size " + getSize());
        }
        if (toIndex < 0 || toIndex >= getSize()) {
            InlineClassHelperKt.O("Index " + toIndex + ", size " + getSize());
        }
        if (!(toIndex >= fromIndex)) {
            InlineClassHelperKt.n("toIndex (" + toIndex + ") should be not smaller than fromIndex (" + fromIndex + ')');
        }
        int iRl = IntervalListKt.rl(this.intervals, fromIndex);
        int startIndex = ((IntervalList.Interval) this.intervals.content[iRl]).getStartIndex();
        while (startIndex <= toIndex) {
            IntervalList.Interval interval = (IntervalList.Interval) this.intervals.content[iRl];
            block.invoke(interval);
            startIndex += interval.getSize();
            iRl++;
        }
    }

    public final void rl(int size, Object value) {
        if (!(size >= 0)) {
            InlineClassHelperKt.n("size should be >=0");
        }
        if (size == 0) {
            return;
        }
        IntervalList.Interval interval = new IntervalList.Interval(getSize(), size, value);
        this.size = getSize() + size;
        this.intervals.rl(interval);
    }

    private final boolean t(IntervalList.Interval interval, int i2) {
        int startIndex = interval.getStartIndex();
        if (i2 >= interval.getStartIndex() + interval.getSize() || startIndex > i2) {
            return false;
        }
        return true;
    }
}
