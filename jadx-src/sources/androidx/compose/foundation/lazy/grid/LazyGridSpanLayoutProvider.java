package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001:\u0003234B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR$\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u001c0\u001bj\b\u0012\u0004\u0012\u00020\u001c`\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001eR\u0016\u0010!\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010 R\u0016\u0010\"\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010 R\u0016\u0010$\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010 R\u0016\u0010&\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010 R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010(R\u001c\u0010+\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010(R*\u0010/\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010 \u001a\u0004\b#\u0010-\"\u0004\b*\u0010.R\u0014\u00100\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010-R\u0011\u00101\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b%\u0010-¨\u00065"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "", "Landroidx/compose/foundation/lazy/grid/LazyGridIntervalContent;", "gridContent", "<init>", "(Landroidx/compose/foundation/lazy/grid/LazyGridIntervalContent;)V", "", "currentSlotsPerLine", "", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "rl", "(I)Ljava/util/List;", "", "Uo", "()V", "lineIndex", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider$LineConfiguration;", "t", "(I)Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider$LineConfiguration;", "itemIndex", "nr", "(I)I", "maxSpan", "xMQ", "(II)I", c.f62177j, "Landroidx/compose/foundation/lazy/grid/LazyGridIntervalContent;", "Ljava/util/ArrayList;", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider$Bucket;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "buckets", "I", "lastLineIndex", "lastLineStartItemIndex", "O", "lastLineStartKnownSpan", "J2", "cachedBucketIndex", "", "Ljava/util/List;", "cachedBucket", "KN", "previousDefaultSpans", "value", "()I", "(I)V", "slotsPerLine", "bucketSize", "totalSize", "Bucket", "LazyGridItemSpanScopeImpl", "LineConfiguration", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyGridSpanLayoutProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridSpanLayoutProvider.kt\nandroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,258:1\n1#2:259\n50#3,5:260\n50#3,5:265\n96#3,5:270\n96#3,5:275\n*S KotlinDebug\n*F\n+ 1 LazyGridSpanLayoutProvider.kt\nandroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider\n*L\n122#1:260,5\n151#1:265,5\n185#1:270,5\n197#1:275,5\n*E\n"})
public final class LazyGridSpanLayoutProvider {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private int cachedBucketIndex;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private List previousDefaultSpans;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private int lastLineStartKnownSpan;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final List cachedBucket;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final LazyGridIntervalContent gridContent;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private int lastLineStartItemIndex;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final ArrayList buckets;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int lastLineIndex;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private int slotsPerLine;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\b\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider$Bucket;", "", "", "firstItemIndex", "firstItemKnownSpan", "<init>", "(II)V", c.f62177j, "I", "()I", "rl", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    static final class Bucket {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final int firstItemIndex;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private final int firstItemKnownSpan;

        public Bucket(int i2, int i3) {
            this.firstItemIndex = i2;
            this.firstItemKnownSpan = i3;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getFirstItemIndex() {
            return this.firstItemIndex;
        }

        /* JADX INFO: renamed from: rl, reason: from getter */
        public final int getFirstItemKnownSpan() {
            return this.firstItemKnownSpan;
        }

        public /* synthetic */ Bucket(int i2, int i3, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this(i2, (i5 & 2) != 0 ? 0 : i3);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\n\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\u0005\u0010\tR\"\u0010\r\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\"\u0004\b\u000b\u0010\t¨\u0006\u000e"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider$LazyGridItemSpanScopeImpl;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "<init>", "()V", "", "rl", "I", "getMaxCurrentLineSpan", "()I", "(I)V", "maxCurrentLineSpan", "t", c.f62177j, "maxLineSpan", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class LazyGridItemSpanScopeImpl implements LazyGridItemSpanScope {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final LazyGridItemSpanScopeImpl f18330n = new LazyGridItemSpanScopeImpl();

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private static int maxCurrentLineSpan;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private static int maxLineSpan;

        @Override // androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope
        public int n() {
            return maxLineSpan;
        }

        public void rl(int i2) {
            maxCurrentLineSpan = i2;
        }

        public void t(int i2) {
            maxLineSpan = i2;
        }

        private LazyGridItemSpanScopeImpl() {
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider$LineConfiguration;", "", "", "firstItemIndex", "", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "spans", "<init>", "(ILjava/util/List;)V", c.f62177j, "I", "()I", "rl", "Ljava/util/List;", "()Ljava/util/List;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LineConfiguration {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final int firstItemIndex;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private final List spans;

        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getFirstItemIndex() {
            return this.firstItemIndex;
        }

        /* JADX INFO: renamed from: rl, reason: from getter */
        public final List getSpans() {
            return this.spans;
        }

        public LineConfiguration(int i2, List list) {
            this.firstItemIndex = i2;
            this.spans = list;
        }
    }

    private final void Uo() {
        this.buckets.clear();
        int i2 = 0;
        this.buckets.add(new Bucket(i2, i2, 2, null));
        this.lastLineIndex = 0;
        this.lastLineStartItemIndex = 0;
        this.lastLineStartKnownSpan = 0;
        this.cachedBucketIndex = -1;
        this.cachedBucket.clear();
    }

    private final List rl(int currentSlotsPerLine) {
        if (currentSlotsPerLine == this.previousDefaultSpans.size()) {
            return this.previousDefaultSpans;
        }
        ArrayList arrayList = new ArrayList(currentSlotsPerLine);
        for (int i2 = 0; i2 < currentSlotsPerLine; i2++) {
            arrayList.add(GridItemSpan.n(LazyGridSpanKt.n(1)));
        }
        this.previousDefaultSpans = arrayList;
        return arrayList;
    }

    public final int J2() {
        return this.gridContent.getIntervals().getSize();
    }

    public final void KN(int i2) {
        if (i2 != this.slotsPerLine) {
            this.slotsPerLine = i2;
            Uo();
        }
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final int getSlotsPerLine() {
        return this.slotsPerLine;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LineConfiguration t(int lineIndex) {
        int i2;
        boolean z2;
        int i3;
        int i5;
        if (!this.gridContent.getHasCustomSpans()) {
            int i7 = lineIndex * this.slotsPerLine;
            return new LineConfiguration(i7, rl(RangesKt.coerceAtLeast(RangesKt.coerceAtMost(this.slotsPerLine, J2() - i7), 0)));
        }
        int iMin = Math.min(lineIndex / n(), this.buckets.size() - 1);
        int iN = n() * iMin;
        int firstItemIndex = ((Bucket) this.buckets.get(iMin)).getFirstItemIndex();
        int firstItemKnownSpan = ((Bucket) this.buckets.get(iMin)).getFirstItemKnownSpan();
        int i8 = this.lastLineIndex;
        if (iN <= i8 && i8 <= lineIndex) {
            firstItemIndex = this.lastLineStartItemIndex;
            firstItemKnownSpan = this.lastLineStartKnownSpan;
            iN = i8;
        } else if (iMin == this.cachedBucketIndex && (i2 = lineIndex - iN) < this.cachedBucket.size()) {
            firstItemIndex = ((Number) this.cachedBucket.get(i2)).intValue();
            iN = lineIndex;
            firstItemKnownSpan = 0;
        }
        if (iN % n() == 0) {
            int i9 = lineIndex - iN;
            z2 = 2 <= i9 && i9 < n();
        }
        if (z2) {
            this.cachedBucketIndex = iMin;
            this.cachedBucket.clear();
        }
        if (!(iN <= lineIndex)) {
            InlineClassHelperKt.t("currentLine (" + iN + ") > lineIndex (" + lineIndex + ')');
        }
        while (iN < lineIndex && firstItemIndex < J2()) {
            if (z2) {
                this.cachedBucket.add(Integer.valueOf(firstItemIndex));
            }
            int i10 = 0;
            while (i10 < this.slotsPerLine && firstItemIndex < J2()) {
                if (firstItemKnownSpan == 0) {
                    i5 = firstItemKnownSpan;
                    firstItemKnownSpan = xMQ(firstItemIndex, this.slotsPerLine - i10);
                } else {
                    i5 = 0;
                }
                i10 += firstItemKnownSpan;
                if (i10 > this.slotsPerLine) {
                    break;
                }
                firstItemIndex++;
                firstItemKnownSpan = i5;
            }
            iN++;
            if (iN % n() == 0 && firstItemIndex < J2()) {
                if (!(this.buckets.size() == iN / n())) {
                    InlineClassHelperKt.t("invalid starting point");
                }
                this.buckets.add(new Bucket(firstItemIndex, firstItemKnownSpan));
            }
        }
        this.lastLineIndex = lineIndex;
        this.lastLineStartItemIndex = firstItemIndex;
        this.lastLineStartKnownSpan = firstItemKnownSpan;
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        int i12 = firstItemIndex;
        while (i11 < this.slotsPerLine && i12 < J2()) {
            if (firstItemKnownSpan == 0) {
                int i13 = firstItemKnownSpan;
                firstItemKnownSpan = xMQ(i12, this.slotsPerLine - i11);
                i3 = i13;
            } else {
                i3 = 0;
            }
            i11 += firstItemKnownSpan;
            if (i11 > this.slotsPerLine) {
                break;
            }
            i12++;
            arrayList.add(GridItemSpan.n(LazyGridSpanKt.n(firstItemKnownSpan)));
            firstItemKnownSpan = i3;
        }
        return new LineConfiguration(firstItemIndex, arrayList);
    }

    public final int xMQ(int itemIndex, int maxSpan) {
        LazyGridItemSpanScopeImpl lazyGridItemSpanScopeImpl = LazyGridItemSpanScopeImpl.f18330n;
        lazyGridItemSpanScopeImpl.rl(maxSpan);
        lazyGridItemSpanScopeImpl.t(this.slotsPerLine);
        IntervalList.Interval interval = this.gridContent.getIntervals().get(itemIndex);
        return GridItemSpan.nr(((GridItemSpan) ((LazyGridInterval) interval.getValue()).getAndroidx.media3.extractor.text.ttml.TtmlNode.TAG_SPAN java.lang.String().invoke(lazyGridItemSpanScopeImpl, Integer.valueOf(itemIndex - interval.getStartIndex()))).getPackedValue());
    }

    public LazyGridSpanLayoutProvider(LazyGridIntervalContent lazyGridIntervalContent) {
        this.gridContent = lazyGridIntervalContent;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        arrayList.add(new Bucket(i2, i2, 2, null));
        this.buckets = arrayList;
        this.cachedBucketIndex = -1;
        this.cachedBucket = new ArrayList();
        this.previousDefaultSpans = CollectionsKt.emptyList();
    }

    private final int n() {
        return ((int) Math.sqrt((((double) J2()) * 1.0d) / ((double) this.slotsPerLine))) + 1;
    }

    public final int nr(final int itemIndex) {
        boolean z2;
        boolean z3;
        int i2;
        int i3 = 0;
        if (J2() <= 0) {
            return 0;
        }
        if (itemIndex < J2()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            InlineClassHelperKt.n("ItemIndex > total count");
        }
        if (!this.gridContent.getHasCustomSpans()) {
            return itemIndex / this.slotsPerLine;
        }
        int iBinarySearch$default = CollectionsKt.binarySearch$default(this.buckets, 0, 0, new Function1<Bucket, Integer>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$getLineIndexOfItem$lowerBoundBucket$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(LazyGridSpanLayoutProvider.Bucket bucket) {
                return Integer.valueOf(bucket.getFirstItemIndex() - itemIndex);
            }
        }, 3, (Object) null);
        int i5 = 2;
        if (iBinarySearch$default < 0) {
            iBinarySearch$default = (-iBinarySearch$default) - 2;
        }
        int iN = n() * iBinarySearch$default;
        int firstItemIndex = ((Bucket) this.buckets.get(iBinarySearch$default)).getFirstItemIndex();
        if (firstItemIndex <= itemIndex) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            InlineClassHelperKt.n("currentItemIndex > itemIndex");
        }
        int i7 = 0;
        while (firstItemIndex < itemIndex) {
            int i8 = firstItemIndex + 1;
            int iXMQ = xMQ(firstItemIndex, this.slotsPerLine - i7);
            i7 += iXMQ;
            int i9 = this.slotsPerLine;
            if (i7 >= i9) {
                if (i7 == i9) {
                    iN++;
                    i7 = 0;
                } else {
                    iN++;
                    i7 = iXMQ;
                }
            }
            if (iN % n() == 0 && iN / n() >= this.buckets.size()) {
                ArrayList arrayList = this.buckets;
                if (i7 > 0) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                arrayList.add(new Bucket(i8 - i2, i3, i5, null));
            }
            firstItemIndex = i8;
        }
        if (i7 + xMQ(itemIndex, this.slotsPerLine - i7) > this.slotsPerLine) {
            return iN + 1;
        }
        return iN;
    }
}
