package androidx.constraintlayout.compose;

import android.util.Log;
import androidx.collection.IntIntPair;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.state.WidgetFrame;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.VirtualLayout;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\n\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006JO\u0010\u0013\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0019\u001a\u00020\u0018*\b\u0012\u0004\u0012\u00020\t0\u00152\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\"\u0010 \u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00182\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0018H\u0016¢\u0006\u0004\b(\u0010)JR\u00106\u001a\u0002052\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\f\u00100\u001a\b\u0012\u0004\u0012\u00020/0.2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u000202012\u0006\u00104\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0018H\u0000¢\u0006\u0004\b8\u0010)J\u001a\u00109\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001dH\u0004ø\u0001\u0000¢\u0006\u0004\b9\u0010:J3\u0010<\u001a\u00020\u0018*\u00020;2\f\u00100\u001a\b\u0012\u0004\u0012\u00020/0.2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020201¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u0018H\u0016¢\u0006\u0004\b>\u0010)R\u0016\u0010A\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010@R$\u0010F\u001a\u0004\u0018\u00010$8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\"\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010'R\u001a\u0010K\u001a\u00020G8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b&\u0010H\u001a\u0004\bI\u0010JR.\u0010Q\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u000202018\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b9\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR&\u0010R\u001a\u0014\u0012\u0004\u0012\u00020?\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0015018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010LR&\u0010U\u001a\u000e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020S018\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0019\u0010L\u001a\u0004\bT\u0010NR\u001a\u0010[\u001a\u00020V8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR\u0014\u0010]\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010\\R\u0014\u0010_\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010\\R\"\u0010f\u001a\u00020`8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bW\u0010c\"\u0004\bd\u0010eR\u0011\u0010h\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\ba\u0010gR\u0011\u0010i\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b^\u0010g\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006j"}, d2 = {"Landroidx/constraintlayout/compose/Measurer2;", "Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measurer;", "Landroidx/constraintlayout/compose/DesignInfoProvider;", "Landroidx/compose/ui/unit/Density;", "density", "<init>", "(Landroidx/compose/ui/unit/Density;)V", "Landroidx/constraintlayout/core/widgets/ConstraintWidget$DimensionBehaviour;", "dimensionBehaviour", "", "dimension", "matchConstraintDefaultDimension", "measureStrategy", "", "otherDimensionResolved", "currentDimensionResolved", "rootMaxConstraint", "", "outConstraints", "ck", "(Landroidx/constraintlayout/core/widgets/ConstraintWidget$DimensionBehaviour;IIIZZI[I)Z", "", "Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;", "measure", "", "J2", "([Ljava/lang/Integer;Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;)V", "Landroidx/constraintlayout/core/widgets/ConstraintWidget;", "constraintWidget", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/collection/IntIntPair;", "HI", "(Landroidx/constraintlayout/core/widgets/ConstraintWidget;J)J", "rl", "(Landroidx/constraintlayout/core/widgets/ConstraintWidget;Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;)V", "Landroidx/constraintlayout/compose/LayoutInformationReceiver;", "layoutReceiver", "t", "(Landroidx/constraintlayout/compose/LayoutInformationReceiver;)V", "O", "()V", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/constraintlayout/compose/ConstraintSet;", "constraintSet", "", "Landroidx/compose/ui/layout/Measurable;", "measurables", "", "Landroidx/compose/ui/layout/Placeable;", "placeableMap", "optimizationLevel", "Landroidx/compose/ui/unit/IntSize;", "r", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/constraintlayout/compose/ConstraintSet;Ljava/util/List;Ljava/util/Map;I)J", "o", "nr", "(J)V", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Ik", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;Ljava/util/List;Ljava/util/Map;)V", c.f62177j, "", "Ljava/lang/String;", "computedLayoutResult", "Landroidx/constraintlayout/compose/LayoutInformationReceiver;", "gh", "()Landroidx/constraintlayout/compose/LayoutInformationReceiver;", "setLayoutInformationReceiver", "layoutInformationReceiver", "Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;", "Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;", "az", "()Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;", "root", "Ljava/util/Map;", "qie", "()Ljava/util/Map;", "Z", "(Ljava/util/Map;)V", "placeables", "lastMeasures", "Landroidx/constraintlayout/core/state/WidgetFrame;", "KN", "frameCache", "Landroidx/constraintlayout/compose/State;", "Uo", "Landroidx/constraintlayout/compose/State;", "ty", "()Landroidx/constraintlayout/compose/State;", "state", "[I", "widthConstraintsHolder", "xMQ", "heightConstraintsHolder", "", "mUb", "F", "()F", "setForcedScaleFactor", "(F)V", "forcedScaleFactor", "()I", "layoutCurrentWidth", "layoutCurrentHeight", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@PublishedApi
@SourceDebugExtension({"SMAP\nMeasurer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Measurer.kt\nandroidx/constraintlayout/compose/Measurer2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,527:1\n1#2:528\n361#3,7:529\n33#4,6:536\n33#4,6:542\n*S KotlinDebug\n*F\n+ 1 Measurer.kt\nandroidx/constraintlayout/compose/Measurer2\n*L\n215#1:529,7\n458#1:536,6\n465#1:542,6\n*E\n"})
public class Measurer2 implements BasicMeasure.Measurer, DesignInfoProvider {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final Map frameCache;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final int[] widthConstraintsHolder;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final Map lastMeasures;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final State state;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private float forcedScaleFactor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private String computedLayoutResult = "";

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private Map placeables;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private LayoutInformationReceiver layoutInformationReceiver;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final ConstraintWidgetContainer root;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final int[] heightConstraintsHolder;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConstraintWidget.DimensionBehaviour.values().length];
            try {
                iArr[ConstraintWidget.DimensionBehaviour.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ConstraintWidget.DimensionBehaviour.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ConstraintWidget.DimensionBehaviour.MATCH_PARENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer
    public void n() {
    }

    private final void J2(Integer[] numArr, BasicMeasure.Measure measure) {
        numArr[0] = Integer.valueOf(measure.f35554O);
        numArr[1] = Integer.valueOf(measure.J2);
        numArr[2] = Integer.valueOf(measure.Uo);
    }

    private final boolean ck(ConstraintWidget.DimensionBehaviour dimensionBehaviour, int dimension, int matchConstraintDefaultDimension, int measureStrategy, boolean otherDimensionResolved, boolean currentDimensionResolved, int rootMaxConstraint, int[] outConstraints) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[dimensionBehaviour.ordinal()];
        if (i2 == 1) {
            outConstraints[0] = dimension;
            outConstraints[1] = dimension;
            return false;
        }
        if (i2 == 2) {
            outConstraints[0] = 0;
            outConstraints[1] = rootMaxConstraint;
            return true;
        }
        if (i2 == 3) {
            boolean z2 = currentDimensionResolved || ((measureStrategy == BasicMeasure.Measure.qie || measureStrategy == BasicMeasure.Measure.az) && (measureStrategy == BasicMeasure.Measure.az || matchConstraintDefaultDimension != 1 || otherDimensionResolved));
            outConstraints[0] = z2 ? dimension : 0;
            if (!z2) {
                dimension = rootMaxConstraint;
            }
            outConstraints[1] = dimension;
            return !z2;
        }
        if (i2 == 4) {
            outConstraints[0] = rootMaxConstraint;
            outConstraints[1] = rootMaxConstraint;
            return false;
        }
        throw new IllegalStateException((dimensionBehaviour + " is not supported").toString());
    }

    public final void Ik(Placeable.PlacementScope placementScope, List list, Map map) {
        Placeable placeable;
        Placeable.PlacementScope placementScope2;
        this.placeables = map;
        int i2 = 0;
        if (this.frameCache.isEmpty()) {
            ArrayList arrayListMh = this.root.Mh();
            int size = arrayListMh.size();
            for (int i3 = 0; i3 < size; i3++) {
                ConstraintWidget constraintWidget = (ConstraintWidget) arrayListMh.get(i3);
                Object objXQ = constraintWidget.XQ();
                if (objXQ instanceof Measurable) {
                    this.frameCache.put(MeasurerKt.n((Measurable) objXQ), new WidgetFrame(constraintWidget.ty.XQ()));
                }
            }
        }
        int size2 = list.size();
        while (i2 < size2) {
            Measurable measurable = (Measurable) list.get(i2);
            WidgetFrame widgetFrame = (WidgetFrame) this.frameCache.get(MeasurerKt.n(measurable));
            if (widgetFrame == null || (placeable = (Placeable) this.placeables.get(measurable)) == null) {
                placementScope2 = placementScope;
            } else {
                placementScope2 = placementScope;
                ConstraintLayoutKt.ty(placementScope2, placeable, widgetFrame, 0L, 4, null);
            }
            i2++;
            placementScope = placementScope2;
        }
        LayoutInformationReceiver layoutInformationReceiver = this.layoutInformationReceiver;
        if ((layoutInformationReceiver != null ? layoutInformationReceiver.getLayoutInformationMode() : null) == LayoutInfoFlags.BOUNDS) {
            O();
        }
    }

    /* JADX INFO: renamed from: KN, reason: from getter */
    protected final Map getFrameCache() {
        return this.frameCache;
    }

    public void O() {
        ConstraintWidget constraintWidget;
        StringBuilder sb = new StringBuilder();
        sb.append("{ ");
        sb.append("  root: {");
        sb.append("interpolated: { left:  0,");
        sb.append("  top:  0,");
        sb.append("  right:   " + this.root.J() + " ,");
        sb.append("  bottom:  " + this.root.nY() + " ,");
        sb.append(" } }");
        for (ConstraintWidget constraintWidget2 : this.root.Mh()) {
            Object objXQ = constraintWidget2.XQ();
            if (objXQ instanceof Measurable) {
                WidgetFrame widgetFrame = null;
                if (constraintWidget2.HI == null) {
                    Measurable measurable = (Measurable) objXQ;
                    Object objN = LayoutIdKt.n(measurable);
                    if (objN == null) {
                        objN = ConstraintLayoutTagKt.n(measurable);
                    }
                    constraintWidget2.HI = objN != null ? objN.toString() : null;
                }
                WidgetFrame widgetFrame2 = (WidgetFrame) this.frameCache.get(MeasurerKt.n((Measurable) objXQ));
                if (widgetFrame2 != null && (constraintWidget = widgetFrame2.f35462n) != null) {
                    widgetFrame = constraintWidget.ty;
                }
                if (widgetFrame != null) {
                    sb.append(' ' + constraintWidget2.HI + ": {");
                    sb.append(" interpolated : ");
                    widgetFrame.HI(sb, true);
                    sb.append("}, ");
                }
            } else if (constraintWidget2 instanceof Guideline) {
                sb.append(' ' + constraintWidget2.HI + ": {");
                Guideline guideline = (Guideline) constraintWidget2;
                if (guideline.Mh() == 0) {
                    sb.append(" type: 'hGuideline', ");
                } else {
                    sb.append(" type: 'vGuideline', ");
                }
                sb.append(" interpolated: ");
                sb.append(" { left: " + guideline.D() + ", top: " + guideline.a() + ", right: " + (guideline.D() + guideline.J()) + ", bottom: " + (guideline.a() + guideline.nY()) + " }");
                sb.append("}, ");
            }
        }
        sb.append(" }");
        String string = sb.toString();
        this.computedLayoutResult = string;
        LayoutInformationReceiver layoutInformationReceiver = this.layoutInformationReceiver;
        if (layoutInformationReceiver != null) {
            layoutInformationReceiver.xMQ(string);
        }
    }

    /* JADX INFO: renamed from: Uo, reason: from getter */
    public final float getForcedScaleFactor() {
        return this.forcedScaleFactor;
    }

    protected final void Z(Map map) {
        this.placeables = map;
    }

    /* JADX INFO: renamed from: az, reason: from getter */
    protected final ConstraintWidgetContainer getRoot() {
        return this.root;
    }

    /* JADX INFO: renamed from: gh, reason: from getter */
    protected final LayoutInformationReceiver getLayoutInformationReceiver() {
        return this.layoutInformationReceiver;
    }

    public final int mUb() {
        return this.root.J();
    }

    protected final void nr(long constraints) {
        this.root.vl(Constraints.qie(constraints));
        this.root.a63(Constraints.gh(constraints));
        this.forcedScaleFactor = Float.NaN;
        LayoutInformationReceiver layoutInformationReceiver = this.layoutInformationReceiver;
        if (layoutInformationReceiver != null && (layoutInformationReceiver == null || layoutInformationReceiver.getForcedWidth() != Integer.MIN_VALUE)) {
            LayoutInformationReceiver layoutInformationReceiver2 = this.layoutInformationReceiver;
            Intrinsics.checkNotNull(layoutInformationReceiver2);
            int iCk = layoutInformationReceiver2.getForcedWidth();
            if (iCk > this.root.J()) {
                this.forcedScaleFactor = this.root.J() / iCk;
            } else {
                this.forcedScaleFactor = 1.0f;
            }
            this.root.vl(iCk);
        }
        LayoutInformationReceiver layoutInformationReceiver3 = this.layoutInformationReceiver;
        if (layoutInformationReceiver3 != null) {
            if (layoutInformationReceiver3 == null || layoutInformationReceiver3.getForcedHeight() != Integer.MIN_VALUE) {
                LayoutInformationReceiver layoutInformationReceiver4 = this.layoutInformationReceiver;
                Intrinsics.checkNotNull(layoutInformationReceiver4);
                int iUo = layoutInformationReceiver4.getForcedHeight();
                if (Float.isNaN(this.forcedScaleFactor)) {
                    this.forcedScaleFactor = 1.0f;
                }
                float fNY = iUo > this.root.nY() ? this.root.nY() / iUo : 1.0f;
                if (fNY < this.forcedScaleFactor) {
                    this.forcedScaleFactor = fNY;
                }
                this.root.a63(iUo);
            }
        }
    }

    public final void o() {
        this.placeables.clear();
        this.lastMeasures.clear();
        this.frameCache.clear();
    }

    /* JADX INFO: renamed from: qie, reason: from getter */
    protected final Map getPlaceables() {
        return this.placeables;
    }

    public final long r(long constraints, LayoutDirection layoutDirection, ConstraintSet constraintSet, List measurables, Map placeableMap, int optimizationLevel) {
        this.placeables = placeableMap;
        if (measurables.isEmpty()) {
            return IntSizeKt.n(Constraints.ty(constraints), Constraints.az(constraints));
        }
        this.state.E2(Constraints.mUb(constraints) ? androidx.constraintlayout.core.state.Dimension.rl(Constraints.qie(constraints)) : androidx.constraintlayout.core.state.Dimension.KN().HI(Constraints.ty(constraints)));
        this.state.az(Constraints.xMQ(constraints) ? androidx.constraintlayout.core.state.Dimension.rl(Constraints.gh(constraints)) : androidx.constraintlayout.core.state.Dimension.KN().HI(Constraints.az(constraints)));
        this.state.J2.E2().n(this.state, this.root, 0);
        this.state.J2.iF().n(this.state, this.root, 1);
        this.state.N(constraints);
        this.state.nY(layoutDirection == LayoutDirection.f34161t);
        o();
        if (constraintSet.rl(measurables)) {
            this.state.XQ();
            constraintSet.n(this.state, measurables);
            ConstraintLayoutKt.mUb(this.state, measurables);
            this.state.n(this.root);
        } else {
            ConstraintLayoutKt.mUb(this.state, measurables);
        }
        nr(constraints);
        this.root.A();
        this.root.I4p(optimizationLevel);
        ConstraintWidgetContainer constraintWidgetContainer = this.root;
        constraintWidgetContainer.uQ(constraintWidgetContainer.SR(), 0, 0, 0, 0, 0, 0, 0, 0);
        return IntSizeKt.n(this.root.J(), this.root.nY());
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    @Override // androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void rl(ConstraintWidget constraintWidget, BasicMeasure.Measure measure) {
        boolean z2;
        String str = constraintWidget.HI;
        Integer[] numArr = (Integer[]) this.lastMeasures.get(str);
        boolean z3 = true;
        ck(measure.f35555n, measure.f35556t, constraintWidget.WPU, measure.mUb, (numArr != null ? numArr[1].intValue() : 0) == constraintWidget.nY(), constraintWidget.C(), Constraints.qie(this.state.getRootIncomingConstraints()), this.widthConstraintsHolder);
        ck(measure.rl, measure.nr, constraintWidget.aYN, measure.mUb, (numArr != null ? numArr[0].intValue() : 0) == constraintWidget.J(), constraintWidget.Mx(), Constraints.gh(this.state.getRootIncomingConstraints()), this.heightConstraintsHolder);
        int[] iArr = this.widthConstraintsHolder;
        int i2 = iArr[0];
        int i3 = iArr[1];
        int[] iArr2 = this.heightConstraintsHolder;
        long jN = ConstraintsKt.n(i2, i3, iArr2[0], iArr2[1]);
        int i5 = measure.mUb;
        if (i5 == BasicMeasure.Measure.qie || i5 == BasicMeasure.Measure.az) {
            long jHI = HI(constraintWidget, jN);
            constraintWidget.HBN(false);
            Integer numValueOf = Integer.valueOf(IntIntPair.O(jHI));
            Integer numValueOf2 = Integer.valueOf(constraintWidget.nY);
            if (numValueOf2.intValue() <= 0) {
                numValueOf2 = null;
            }
            Integer numValueOf3 = Integer.valueOf(constraintWidget.f35524g);
            if (numValueOf3.intValue() <= 0) {
                numValueOf3 = null;
            }
            int iIntValue = ((Number) RangesKt.coerceIn(numValueOf, numValueOf2, numValueOf3)).intValue();
            Integer numValueOf4 = Integer.valueOf(IntIntPair.J2(jHI));
            Integer numValueOf5 = Integer.valueOf(constraintWidget.iF);
            if (numValueOf5.intValue() <= 0) {
                numValueOf5 = null;
            }
            Integer numValueOf6 = Integer.valueOf(constraintWidget.fD);
            int iIntValue2 = ((Number) RangesKt.coerceIn(numValueOf4, numValueOf5, numValueOf6.intValue() > 0 ? numValueOf6 : null)).intValue();
            if (iIntValue != IntIntPair.O(jHI)) {
                jN = ConstraintsKt.n(iIntValue, iIntValue, Constraints.az(jN), Constraints.gh(jN));
                z2 = true;
            } else {
                z2 = false;
            }
            if (iIntValue2 != IntIntPair.J2(jHI)) {
                jN = ConstraintsKt.n(Constraints.ty(jN), Constraints.qie(jN), iIntValue2, iIntValue2);
                z2 = true;
            }
            if (z2) {
                HI(constraintWidget, jN);
                constraintWidget.HBN(false);
            }
        } else {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = measure.f35555n;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            if (dimensionBehaviour != dimensionBehaviour2 || constraintWidget.WPU != 0 || measure.rl != dimensionBehaviour2 || constraintWidget.aYN != 0) {
            }
        }
        Placeable placeable = (Placeable) this.placeables.get(constraintWidget.XQ());
        measure.f35554O = placeable != null ? placeable.getWidth() : constraintWidget.J();
        measure.J2 = placeable != null ? placeable.getHeight() : constraintWidget.nY();
        int iZ = (placeable == null || !this.state.Ik(constraintWidget)) ? Integer.MIN_VALUE : placeable.z(AlignmentLineKt.n());
        measure.KN = iZ != Integer.MIN_VALUE;
        measure.Uo = iZ;
        Map map = this.lastMeasures;
        Object obj = map.get(str);
        Object obj2 = obj;
        if (obj == null) {
            Integer[] numArr2 = {0, 0, Integer.MIN_VALUE};
            map.put(str, numArr2);
            obj2 = numArr2;
        }
        J2((Integer[]) obj2, measure);
        if (measure.f35554O == measure.f35556t && measure.J2 == measure.nr) {
            z3 = false;
        }
        measure.xMQ = z3;
    }

    public final void t(LayoutInformationReceiver layoutReceiver) {
        this.layoutInformationReceiver = layoutReceiver;
        if (layoutReceiver != null) {
            layoutReceiver.xMQ(this.computedLayoutResult);
        }
    }

    /* JADX INFO: renamed from: ty, reason: from getter */
    protected final State getState() {
        return this.state;
    }

    public final int xMQ() {
        return this.root.nY();
    }

    public Measurer2(Density density) {
        ConstraintWidgetContainer constraintWidgetContainer = new ConstraintWidgetContainer(0, 0);
        constraintWidgetContainer.iV(this);
        this.root = constraintWidgetContainer;
        this.placeables = new LinkedHashMap();
        this.lastMeasures = new LinkedHashMap();
        this.frameCache = new LinkedHashMap();
        this.state = new State(density);
        this.widthConstraintsHolder = new int[2];
        this.heightConstraintsHolder = new int[2];
        this.forcedScaleFactor = Float.NaN;
    }

    private final long HI(ConstraintWidget constraintWidget, long constraints) {
        int i2;
        Object objXQ = constraintWidget.XQ();
        String str = constraintWidget.HI;
        int i3 = 0;
        if (constraintWidget instanceof VirtualLayout) {
            if (Constraints.mUb(constraints)) {
                i2 = 1073741824;
            } else if (Constraints.KN(constraints)) {
                i2 = Integer.MIN_VALUE;
            } else {
                i2 = 0;
            }
            if (Constraints.xMQ(constraints)) {
                i3 = 1073741824;
            } else if (Constraints.Uo(constraints)) {
                i3 = Integer.MIN_VALUE;
            }
            VirtualLayout virtualLayout = (VirtualLayout) constraintWidget;
            virtualLayout.NP(i2, Constraints.qie(constraints), i3, Constraints.gh(constraints));
            return IntIntPair.rl(virtualLayout.xzo(), virtualLayout.Th());
        }
        if (objXQ instanceof Measurable) {
            Placeable placeableDR0 = ((Measurable) objXQ).dR0(constraints);
            this.placeables.put(objXQ, placeableDR0);
            return IntIntPair.rl(placeableDR0.getWidth(), placeableDR0.getHeight());
        }
        Log.w("CCL", "Nothing to measure for widget: " + str);
        return IntIntPair.rl(0, 0);
    }
}
