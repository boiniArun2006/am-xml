package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Constraints;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\b \u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ;\u0010\"\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00062\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010!\u001a\u00020\u0006H&¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010&R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010&R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006+"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;", "", "", "isVertical", "Landroidx/compose/foundation/lazy/grid/LazyGridSlots;", "slots", "", "gridItemsCount", "spaceBetweenLines", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;", "measuredItemProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "spanLayoutProvider", "<init>", "(ZLandroidx/compose/foundation/lazy/grid/LazyGridSlots;IILandroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;)V", "startSlot", TtmlNode.TAG_SPAN, "Landroidx/compose/ui/unit/Constraints;", c.f62177j, "(II)J", "index", "nr", "(I)I", "lineIndex", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;", "t", "(I)Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;", "", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "items", "", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "spans", "mainAxisSpacing", "rl", "(I[Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;Ljava/util/List;I)Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;", "Z", "Landroidx/compose/foundation/lazy/grid/LazyGridSlots;", "I", "O", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;", "J2", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyGridMeasuredLineProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasuredLineProvider.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,102:1\n1#2:103\n*E\n"})
public abstract class LazyGridMeasuredLineProvider {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final LazyGridSpanLayoutProvider spanLayoutProvider;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final LazyGridMeasuredItemProvider measuredItemProvider;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final boolean isVertical;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final int spaceBetweenLines;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final LazyGridSlots slots;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final int gridItemsCount;

    public final long n(int startSlot, int span) {
        int i2;
        if (span == 1) {
            i2 = this.slots.getSizes()[startSlot];
        } else {
            int i3 = (span + startSlot) - 1;
            i2 = (this.slots.getPositions()[i3] + this.slots.getSizes()[i3]) - this.slots.getPositions()[startSlot];
        }
        int iCoerceAtLeast = RangesKt.coerceAtLeast(i2, 0);
        return this.isVertical ? Constraints.INSTANCE.O(iCoerceAtLeast) : Constraints.INSTANCE.nr(iCoerceAtLeast);
    }

    public abstract LazyGridMeasuredLine rl(int index, LazyGridMeasuredItem[] items, List spans, int mainAxisSpacing);

    public final int nr(int index) {
        LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider = this.spanLayoutProvider;
        return lazyGridSpanLayoutProvider.xMQ(index, lazyGridSpanLayoutProvider.getSlotsPerLine());
    }

    public final LazyGridMeasuredLine t(int lineIndex) {
        LazyGridSpanLayoutProvider.LineConfiguration lineConfigurationT = this.spanLayoutProvider.t(lineIndex);
        int size = lineConfigurationT.getSpans().size();
        int i2 = (size == 0 || lineConfigurationT.getFirstItemIndex() + size == this.gridItemsCount) ? 0 : this.spaceBetweenLines;
        LazyGridMeasuredItem[] lazyGridMeasuredItemArr = new LazyGridMeasuredItem[size];
        int i3 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            int iNr = GridItemSpan.nr(((GridItemSpan) lineConfigurationT.getSpans().get(i5)).getPackedValue());
            LazyGridMeasuredItem lazyGridMeasuredItemNr = this.measuredItemProvider.nr(lineConfigurationT.getFirstItemIndex() + i5, n(i3, iNr), i3, iNr, i2);
            i3 += iNr;
            Unit unit = Unit.INSTANCE;
            lazyGridMeasuredItemArr[i5] = lazyGridMeasuredItemNr;
        }
        return rl(lineIndex, lazyGridMeasuredItemArr, lineConfigurationT.getSpans(), i2);
    }

    public LazyGridMeasuredLineProvider(boolean z2, LazyGridSlots lazyGridSlots, int i2, int i3, LazyGridMeasuredItemProvider lazyGridMeasuredItemProvider, LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider) {
        this.isVertical = z2;
        this.slots = lazyGridSlots;
        this.gridItemsCount = i2;
        this.spaceBetweenLines = i3;
        this.measuredItemProvider = lazyGridMeasuredItemProvider;
        this.spanLayoutProvider = lazyGridSpanLayoutProvider;
    }
}
