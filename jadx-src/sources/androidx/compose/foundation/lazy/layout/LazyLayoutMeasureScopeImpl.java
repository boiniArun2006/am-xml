package androidx.compose.foundation.lazy.layout;

import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJl\u0010\u0017\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\f2\u001b\b\u0002\u0010\u0013\u001a\u0015\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f¢\u0006\u0002\b\u00122\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u000f¢\u0006\u0002\b\u0012H\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018JO\u0010\u0019\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\f2\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u000f¢\u0006\u0002\b\u0012H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\t*\u00020\u001bH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\t*\u00020\u001eH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020!*\u00020\u001bH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020!*\u00020\u001eH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b$\u0010%J(\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)2\u0006\u0010&\u001a\u00020\t2\u0006\u0010(\u001a\u00020'H\u0016ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u0016\u0010-\u001a\u00020\u001b*\u00020\u001eH\u0016ø\u0001\u0000¢\u0006\u0004\b-\u0010%J\u0019\u0010.\u001a\u00020\u001b*\u00020\tH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b.\u0010/J\u0019\u00100\u001a\u00020\u001b*\u00020!H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b0\u0010#J\u0019\u00101\u001a\u00020\u001e*\u00020!H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b1\u00102J\u0016\u00103\u001a\u00020\u001e*\u00020\u001bH\u0016ø\u0001\u0000¢\u0006\u0004\b3\u00102J\u0016\u00106\u001a\u000205*\u000204H\u0016ø\u0001\u0000¢\u0006\u0004\b6\u00107J\u0016\u00108\u001a\u000204*\u000205H\u0016ø\u0001\u0000¢\u0006\u0004\b8\u00107R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R \u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0)0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010G\u001a\u00020!8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0014\u0010I\u001a\u00020!8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bH\u0010FR\u0014\u0010M\u001a\u00020J8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0014\u0010Q\u001a\u00020N8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bO\u0010P\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006R"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;", "itemContentFactory", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "subcomposeMeasureScope", "<init>", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;Landroidx/compose/ui/layout/SubcomposeMeasureScope;)V", "", "width", "height", "", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLines", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/RulerScope;", "", "Lkotlin/ExtensionFunctionType;", "rulers", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "placementBlock", "Landroidx/compose/ui/layout/MeasureResult;", "bZm", "(IILjava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/layout/MeasureResult;", "Zn", "(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/unit/Dp;", "How", "(F)I", "Landroidx/compose/ui/unit/TextUnit;", "I4p", "(J)I", "", CmcdData.STREAM_TYPE_LIVE, "(F)F", "tFV", "(J)F", "index", "Landroidx/compose/ui/unit/Constraints;", "constraints", "", "Landroidx/compose/ui/layout/Placeable;", "Jk", "(IJ)Ljava/util/List;", "Z", "rV9", "(I)F", "bzg", "ViF", "(F)J", "ck", "Landroidx/compose/ui/unit/DpSize;", "Landroidx/compose/ui/geometry/Size;", "M", "(J)J", "Ik", c.f62177j, "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;", "t", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "O", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "itemProvider", "Landroidx/collection/MutableIntObjectMap;", "J2", "Landroidx/collection/MutableIntObjectMap;", "placeablesCache", "getDensity", "()F", "density", "yAc", "fontScale", "", "Org", "()Z", "isLookingAhead", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyLayoutMeasureScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutMeasureScope.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,147:1\n1#2:148\n*E\n"})
public final class LazyLayoutMeasureScopeImpl implements LazyLayoutMeasureScope, MeasureScope {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final MutableIntObjectMap placeablesCache = IntObjectMapKt.t();

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final LazyLayoutItemProvider itemProvider;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final LazyLayoutItemContentFactory itemContentFactory;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final SubcomposeMeasureScope subcomposeMeasureScope;

    @Override // androidx.compose.ui.unit.Density
    public int How(float f3) {
        return this.subcomposeMeasureScope.How(f3);
    }

    @Override // androidx.compose.ui.unit.Density
    public int I4p(long j2) {
        return this.subcomposeMeasureScope.I4p(j2);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public boolean Org() {
        return this.subcomposeMeasureScope.Org();
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    public MeasureResult Zn(int width, int height, Map alignmentLines, Function1 placementBlock) {
        return this.subcomposeMeasureScope.Zn(width, height, alignmentLines, placementBlock);
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    public MeasureResult bZm(int width, int height, Map alignmentLines, Function1 rulers, Function1 placementBlock) {
        return this.subcomposeMeasureScope.bZm(width, height, alignmentLines, rulers, placementBlock);
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.subcomposeMeasureScope.getDensity();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public LayoutDirection getLayoutDirection() {
        return this.subcomposeMeasureScope.getLayoutDirection();
    }

    @Override // androidx.compose.ui.unit.Density
    public float l(float f3) {
        return this.subcomposeMeasureScope.l(f3);
    }

    @Override // androidx.compose.ui.unit.Density
    public float tFV(long j2) {
        return this.subcomposeMeasureScope.tFV(j2);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* JADX INFO: renamed from: yAc */
    public float getFontScale() {
        return this.subcomposeMeasureScope.getFontScale();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    public long Ik(long j2) {
        return this.subcomposeMeasureScope.Ik(j2);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope
    public List Jk(int index, long constraints) {
        List list = (List) this.placeablesCache.rl(index);
        if (list != null) {
            return list;
        }
        Object objNr = this.itemProvider.nr(index);
        List listY = this.subcomposeMeasureScope.Y(objNr, this.itemContentFactory.rl(index, objNr, this.itemProvider.J2(index)));
        int size = listY.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((Measurable) listY.get(i2)).dR0(constraints));
        }
        this.placeablesCache.r(index, arrayList);
        return arrayList;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    public long M(long j2) {
        return this.subcomposeMeasureScope.M(j2);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    public long ViF(float f3) {
        return this.subcomposeMeasureScope.ViF(f3);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.FontScaling
    public float Z(long j2) {
        return this.subcomposeMeasureScope.Z(j2);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    public float bzg(float f3) {
        return this.subcomposeMeasureScope.bzg(f3);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.FontScaling
    public long ck(float f3) {
        return this.subcomposeMeasureScope.ck(f3);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    public float rV9(int i2) {
        return this.subcomposeMeasureScope.rV9(i2);
    }

    public LazyLayoutMeasureScopeImpl(LazyLayoutItemContentFactory lazyLayoutItemContentFactory, SubcomposeMeasureScope subcomposeMeasureScope) {
        this.itemContentFactory = lazyLayoutItemContentFactory;
        this.subcomposeMeasureScope = subcomposeMeasureScope;
        this.itemProvider = (LazyLayoutItemProvider) lazyLayoutItemContentFactory.getItemProvider().invoke();
    }
}
