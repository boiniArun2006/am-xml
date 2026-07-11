package androidx.constraintlayout.compose;

import android.util.Log;
import androidx.collection.IntIntPair;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.constraintlayout.core.state.ConstraintSetParser;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.VirtualLayout;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.b;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002JO\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0015\u001a\u00020\u0014*\b\u0012\u0004\u0012\u00020\u00050\u00112\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\"\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ&\u0010\"\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010!\u001a\u00020 H\u0002ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J3\u0010(\u001a\u00020'2\"\u0010&\u001a\u001e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e0$j\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e`%H\u0002¢\u0006\u0004\b(\u0010)J\u001f\u0010*\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0014H\u0016¢\u0006\u0004\b,\u0010-J\u001b\u00101\u001a\u00020\u0014*\u00020.2\u0006\u00100\u001a\u00020/H\u0007¢\u0006\u0004\b1\u00102J\u0019\u00104\u001a\u00020\u0014*\u0002032\u0006\u00100\u001a\u00020/¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0014H\u0007¢\u0006\u0004\b6\u00107R\u001a\u0010<\u001a\u0002088\u0004X\u0084\u0004¢\u0006\f\n\u0004\b,\u00109\u001a\u0004\b:\u0010;R&\u0010C\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020?0=8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b*\u0010@\u001a\u0004\bA\u0010BR&\u0010D\u001a\u0014\u0012\u0004\u0012\u00020\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00110=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010@R\u001a\u0010I\u001a\u00020E8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b6\u0010F\u001a\u0004\bG\u0010HR\u0014\u0010K\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010JR\u0014\u0010L\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010JR&\u0010Q\u001a\u0012\u0012\u0004\u0012\u00020N0Mj\b\u0012\u0004\u0012\u00020N`O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010PR\u0011\u0010T\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0011\u0010V\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bU\u0010S\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006W"}, d2 = {"Landroidx/constraintlayout/compose/Measurer;", "Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measurer;", "Landroidx/constraintlayout/compose/DesignInfoProvider;", "Landroidx/constraintlayout/core/widgets/ConstraintWidget$DimensionBehaviour;", "dimensionBehaviour", "", "dimension", "matchConstraintDefaultDimension", "measureStrategy", "", "otherDimensionResolved", "currentDimensionResolved", "rootMaxConstraint", "", "outConstraints", "az", "(Landroidx/constraintlayout/core/widgets/ConstraintWidget$DimensionBehaviour;IIIZZI[I)Z", "", "Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;", "measure", "", "t", "([Ljava/lang/Integer;Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;)V", "Landroidx/constraintlayout/core/widgets/ConstraintWidget;", "constraintWidget", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/collection/IntIntPair;", "qie", "(Landroidx/constraintlayout/core/widgets/ConstraintWidget;J)J", "", "str", "Landroidx/compose/ui/graphics/Color;", "defaultColor", "Uo", "(Ljava/lang/String;J)J", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "params", "Landroidx/compose/ui/text/TextStyle;", "gh", "(Ljava/util/HashMap;)Landroidx/compose/ui/text/TextStyle;", "rl", "(Landroidx/constraintlayout/core/widgets/ConstraintWidget;Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;)V", c.f62177j, "()V", "Landroidx/compose/foundation/layout/BoxScope;", "", "forcedScaleFactor", "O", "(Landroidx/compose/foundation/layout/BoxScope;FLandroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "J2", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;F)V", "nr", "(Landroidx/compose/runtime/Composer;I)V", "Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;", "Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;", "getRoot", "()Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;", "root", "", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/layout/Placeable;", "Ljava/util/Map;", "getPlaceables", "()Ljava/util/Map;", "placeables", "lastMeasures", "Landroidx/constraintlayout/compose/State;", "Landroidx/constraintlayout/compose/State;", "getState", "()Landroidx/constraintlayout/compose/State;", "state", "[I", "widthConstraintsHolder", "heightConstraintsHolder", "Ljava/util/ArrayList;", "Landroidx/constraintlayout/core/state/ConstraintSetParser$DesignElement;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "designElements", "mUb", "()I", "layoutCurrentWidth", "xMQ", "layoutCurrentHeight", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Deprecated(message = "Replace with Measurer2 instead for proper Measure/Layout handling.", replaceWith = @ReplaceWith(expression = "Measurer2", imports = {}))
@PublishedApi
@SourceDebugExtension({"SMAP\nConstraintLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintLayout.kt\nandroidx/constraintlayout/compose/Measurer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 10 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 11 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,2303:1\n1#2:2304\n361#3,7:2305\n33#4,6:2312\n33#4,4:2318\n38#4:2324\n33#4,4:2331\n38#4:2377\n288#5,2:2322\n1225#6,6:2325\n149#7:2335\n149#7:2372\n71#8:2336\n68#8,6:2337\n74#8:2371\n78#8:2376\n79#9,6:2343\n86#9,4:2358\n90#9,2:2368\n94#9:2375\n368#10,9:2349\n377#10:2370\n378#10,2:2373\n4034#11,6:2362\n*S KotlinDebug\n*F\n+ 1 ConstraintLayout.kt\nandroidx/constraintlayout/compose/Measurer\n*L\n1752#1:2305,7\n1989#1:2312,6\n1996#1:2318,4\n1996#1:2324\n2129#1:2331,4\n2129#1:2377\n2000#1:2322,2\n2078#1:2325,6\n2145#1:2335\n2156#1:2372\n2154#1:2336\n2154#1:2337,6\n2154#1:2371\n2154#1:2376\n2154#1:2343,6\n2154#1:2358,4\n2154#1:2368,2\n2154#1:2375\n2154#1:2349,9\n2154#1:2370\n2154#1:2373,2\n2154#1:2362,6\n*E\n"})
public class Measurer implements BasicMeasure.Measurer, DesignInfoProvider {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final int[] heightConstraintsHolder;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final int[] widthConstraintsHolder;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private ArrayList designElements;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final ConstraintWidgetContainer root;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final State state;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final Map placeables;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Map lastMeasures;

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

    static /* synthetic */ long KN(Measurer measurer, String str, long j2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getColor-wrIjXm8");
        }
        if ((i2 & 2) != 0) {
            j2 = Color.INSTANCE.n();
        }
        return measurer.Uo(str, j2);
    }

    private final long Uo(String str, long defaultColor) {
        if (str != null && StringsKt.startsWith$default((CharSequence) str, '#', false, 2, (Object) null)) {
            String strSubstring = str.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
            if (strSubstring.length() == 6) {
                strSubstring = "FF" + strSubstring;
            }
            try {
                return ColorKt.rl((int) Long.parseLong(strSubstring, 16));
            } catch (Exception unused) {
            }
        }
        return defaultColor;
    }

    private final boolean az(ConstraintWidget.DimensionBehaviour dimensionBehaviour, int dimension, int matchConstraintDefaultDimension, int measureStrategy, boolean otherDimensionResolved, boolean currentDimensionResolved, int rootMaxConstraint, int[] outConstraints) {
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

    private final TextStyle gh(HashMap params) {
        String str = (String) params.get("size");
        long jN = TextUnit.INSTANCE.n();
        if (str != null) {
            jN = TextUnitKt.Uo(Float.parseFloat(str));
        }
        return new TextStyle(KN(this, (String) params.get(TtmlNode.ATTR_TTS_COLOR), 0L, 2, null), jN, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777212, null);
    }

    private final void t(Integer[] numArr, BasicMeasure.Measure measure) {
        numArr[0] = Integer.valueOf(measure.f35554O);
        numArr[1] = Integer.valueOf(measure.J2);
        numArr[2] = Integer.valueOf(measure.Uo);
    }

    public final int mUb() {
        return this.root.J();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1 */
    /* JADX WARN: Type inference failed for: r26v10 */
    /* JADX WARN: Type inference failed for: r26v11 */
    /* JADX WARN: Type inference failed for: r26v12 */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r26v4 */
    /* JADX WARN: Type inference failed for: r26v5 */
    /* JADX WARN: Type inference failed for: r26v6 */
    /* JADX WARN: Type inference failed for: r26v7 */
    /* JADX WARN: Type inference failed for: r26v8 */
    /* JADX WARN: Type inference failed for: r26v9 */
    /* JADX WARN: Type inference failed for: r7v13 */
    public final void nr(Composer composer, final int i2) {
        int i3;
        ?? r26;
        int i5;
        int i7;
        ?? r262;
        ?? r15;
        ?? r152;
        Composer composerKN = composer.KN(1750959258);
        int i8 = 6;
        int i9 = (i2 & 6) == 0 ? (composerKN.E2(this) ? 4 : 2) | i2 : i2;
        if ((i9 & 3) == 2 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(1750959258, i9, -1, "androidx.constraintlayout.compose.Measurer.createDesignElements (ConstraintLayout.kt:2127)");
            }
            ArrayList arrayList = this.designElements;
            int size = arrayList.size();
            ?? r14 = 0;
            int i10 = 0;
            while (i10 < size) {
                ConstraintSetParser.DesignElement designElement = (ConstraintSetParser.DesignElement) arrayList.get(i10);
                String strN = designElement.n();
                Function4 function4 = (Function4) DesignElements.f34528n.n().get(designElement.t());
                if (function4 != null) {
                    composerKN.eF(-208717382);
                    function4.invoke(strN, designElement.rl(), composerKN, Integer.valueOf((int) r14));
                    composerKN.Xw();
                    i3 = i10;
                    i7 = size;
                    r262 = r14;
                    i5 = i8;
                } else {
                    composerKN.eF(-208578533);
                    String strT = designElement.t();
                    if (strT != null) {
                        switch (strT.hashCode()) {
                            case -1377687758:
                                i3 = i10;
                                i7 = size;
                                ?? r263 = r14;
                                i5 = i8;
                                r26 = r263;
                                if (!strT.equals("button")) {
                                    composerKN.eF(-206260074);
                                    composerKN.Xw();
                                    r262 = r26;
                                } else {
                                    composerKN.eF(-208561607);
                                    String str = (String) designElement.rl().get("text");
                                    if (str == null) {
                                        str = "text";
                                    }
                                    BasicTextKt.KN(str, PaddingKt.xMQ(BackgroundKt.nr(ClipKt.n(LayoutIdKt.rl(Modifier.INSTANCE, strN), RoundedCornerShapeKt.n(20)), Uo((String) designElement.rl().get(TtmlNode.ATTR_TTS_BACKGROUND_COLOR), Color.INSTANCE.nr()), null, 2, null), Dp.KN(8)), gh(designElement.rl()), null, 0, false, 0, 0, null, composerKN, 0, 504);
                                    composerKN.Xw();
                                    r262 = r263;
                                }
                                break;
                            case -1031434259:
                                i3 = i10;
                                i7 = size;
                                ?? r153 = r14;
                                r15 = r153;
                                if (strT.equals("textfield")) {
                                    composerKN.eF(-206910206);
                                    String str2 = (String) designElement.rl().get("text");
                                    if (str2 == null) {
                                        str2 = "text";
                                    }
                                    Modifier modifierRl = LayoutIdKt.rl(Modifier.INSTANCE, strN);
                                    Measurer$createDesignElements$1$2 measurer$createDesignElements$1$2 = new Function1<String, Unit>() { // from class: androidx.constraintlayout.compose.Measurer$createDesignElements$1$2
                                        public final void n(String str3) {
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(String str3) {
                                            n(str3);
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    Composer composer2 = composerKN;
                                    r262 = r153 == true ? 1 : 0;
                                    i5 = 6;
                                    BasicTextFieldKt.O(str2, measurer$createDesignElements$1$2, modifierRl, false, false, null, null, null, false, 0, 0, null, null, null, null, null, composer2, 48, 0, 65528);
                                    composerKN = composer2;
                                    composerKN.Xw();
                                }
                                r26 = r15;
                                i5 = 6;
                                composerKN.eF(-206260074);
                                composerKN.Xw();
                                r262 = r26;
                                break;
                            case 97739:
                                i3 = i10;
                                i7 = size;
                                ?? r154 = r14;
                                r15 = r154;
                                if (strT.equals("box")) {
                                    composerKN.eF(-207870648);
                                    String str3 = (String) designElement.rl().get("text");
                                    if (str3 == null) {
                                        str3 = "";
                                    }
                                    long jUo = Uo((String) designElement.rl().get(TtmlNode.ATTR_TTS_BACKGROUND_COLOR), Color.INSTANCE.nr());
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    Modifier modifierNr = BackgroundKt.nr(LayoutIdKt.rl(companion, strN), jUo, null, 2, null);
                                    MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), r154);
                                    int iN = ComposablesKt.n(composerKN, r154 == true ? 1 : 0);
                                    CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                                    Modifier modifierO = ComposedModifierKt.O(composerKN, modifierNr);
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                    Function0 function0N = companion2.n();
                                    if (composerKN.getApplier() == null) {
                                        ComposablesKt.t();
                                    }
                                    composerKN.T();
                                    if (composerKN.getInserting()) {
                                        composerKN.s7N(function0N);
                                    } else {
                                        composerKN.r();
                                    }
                                    Composer composerN = Updater.n(composerKN);
                                    Updater.O(composerN, measurePolicyUo, companion2.t());
                                    Updater.O(composerN, compositionLocalMapIk, companion2.O());
                                    Function2 function2Rl = companion2.rl();
                                    if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                        composerN.o(Integer.valueOf(iN));
                                        composerN.az(Integer.valueOf(iN), function2Rl);
                                    }
                                    Updater.O(composerN, modifierO, companion2.nr());
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                    BasicTextKt.KN(str3, PaddingKt.xMQ(companion, Dp.KN(8)), gh(designElement.rl()), null, 0, false, 0, 0, null, composerKN, 48, 504);
                                    composerKN.XQ();
                                    composerKN.Xw();
                                    r152 = r154;
                                    r262 = r152;
                                    i5 = 6;
                                }
                                r26 = r15;
                                i5 = 6;
                                composerKN.eF(-206260074);
                                composerKN.Xw();
                                r262 = r26;
                                break;
                            case 3556653:
                                i3 = i10;
                                if (strT.equals("text")) {
                                    composerKN.eF(-207262986);
                                    String str4 = (String) designElement.rl().get("text");
                                    if (str4 == null) {
                                        str4 = "text";
                                    }
                                    Modifier modifierRl2 = LayoutIdKt.rl(Modifier.INSTANCE, strN);
                                    TextStyle textStyleGh = gh(designElement.rl());
                                    i7 = size;
                                    r152 = r14 == true ? 1 : 0;
                                    BasicTextKt.KN(str4, modifierRl2, textStyleGh, null, 0, false, 0, 0, null, composerKN, 0, 504);
                                    composerKN.Xw();
                                    r262 = r152;
                                    i5 = 6;
                                }
                                break;
                            case 100313435:
                                if (!strT.equals("image")) {
                                    i3 = i10;
                                } else {
                                    composerKN.eF(-206572957);
                                    Composer composer3 = composerKN;
                                    i3 = i10;
                                    ImageKt.n(PainterResources_androidKt.t(android.R.drawable.ic_menu_gallery, composerKN, i8), "Placeholder Image", LayoutIdKt.rl(Modifier.INSTANCE, strN), null, null, 0.0f, null, composer3, 48, b.f61769v);
                                    composerKN = composer3;
                                    composerKN.Xw();
                                    i7 = size;
                                    r262 = r14;
                                    i5 = i8;
                                }
                                break;
                            default:
                                i3 = i10;
                                break;
                        }
                        composerKN.Xw();
                    } else {
                        i3 = i10;
                    }
                    i7 = size;
                    r26 = r14;
                    i5 = i8;
                    composerKN.eF(-206260074);
                    composerKN.Xw();
                    r262 = r26;
                    composerKN.Xw();
                }
                i10 = i3 + 1;
                size = i7;
                i8 = i5;
                r14 = r262;
            }
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.constraintlayout.compose.Measurer$createDesignElements$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                    n(composer4, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer4, int i11) {
                    this.f34605n.nr(composer4, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
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
        az(measure.f35555n, measure.f35556t, constraintWidget.WPU, measure.mUb, (numArr != null ? numArr[1].intValue() : 0) == constraintWidget.nY(), constraintWidget.C(), Constraints.qie(this.state.getRootIncomingConstraints()), this.widthConstraintsHolder);
        az(measure.rl, measure.nr, constraintWidget.aYN, measure.mUb, (numArr != null ? numArr[0].intValue() : 0) == constraintWidget.J(), constraintWidget.Mx(), Constraints.gh(this.state.getRootIncomingConstraints()), this.heightConstraintsHolder);
        int[] iArr = this.widthConstraintsHolder;
        int i2 = iArr[0];
        int i3 = iArr[1];
        int[] iArr2 = this.heightConstraintsHolder;
        long jN = ConstraintsKt.n(i2, i3, iArr2[0], iArr2[1]);
        int i5 = measure.mUb;
        if (i5 == BasicMeasure.Measure.qie || i5 == BasicMeasure.Measure.az) {
            long jQie = qie(constraintWidget, jN);
            constraintWidget.HBN(false);
            Integer numValueOf = Integer.valueOf(IntIntPair.O(jQie));
            Integer numValueOf2 = Integer.valueOf(constraintWidget.nY);
            if (numValueOf2.intValue() <= 0) {
                numValueOf2 = null;
            }
            Integer numValueOf3 = Integer.valueOf(constraintWidget.f35524g);
            if (numValueOf3.intValue() <= 0) {
                numValueOf3 = null;
            }
            int iIntValue = ((Number) RangesKt.coerceIn(numValueOf, numValueOf2, numValueOf3)).intValue();
            Integer numValueOf4 = Integer.valueOf(IntIntPair.J2(jQie));
            Integer numValueOf5 = Integer.valueOf(constraintWidget.iF);
            if (numValueOf5.intValue() <= 0) {
                numValueOf5 = null;
            }
            Integer numValueOf6 = Integer.valueOf(constraintWidget.fD);
            int iIntValue2 = ((Number) RangesKt.coerceIn(numValueOf4, numValueOf5, numValueOf6.intValue() > 0 ? numValueOf6 : null)).intValue();
            if (iIntValue != IntIntPair.O(jQie)) {
                jN = ConstraintsKt.n(iIntValue, iIntValue, Constraints.az(jN), Constraints.gh(jN));
                z2 = true;
            } else {
                z2 = false;
            }
            if (iIntValue2 != IntIntPair.J2(jQie)) {
                jN = ConstraintsKt.n(Constraints.ty(jN), Constraints.qie(jN), iIntValue2, iIntValue2);
                z2 = true;
            }
            if (z2) {
                qie(constraintWidget, jN);
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
        t((Integer[]) obj2, measure);
        if (measure.f35554O == measure.f35556t && measure.J2 == measure.nr) {
            z3 = false;
        }
        measure.xMQ = z3;
    }

    public final int xMQ() {
        return this.root.nY();
    }

    private final long qie(ConstraintWidget constraintWidget, long constraints) {
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

    public final void J2(DrawScope drawScope, float f3) {
        float fMUb = mUb() * f3;
        float fXMQ = xMQ() * f3;
        float fGh = (Size.gh(drawScope.t()) - fMUb) / 2.0f;
        float fXMQ2 = (Size.xMQ(drawScope.t()) - fXMQ) / 2.0f;
        Color.Companion companion = Color.INSTANCE;
        long jKN = companion.KN();
        float f4 = fGh + fMUb;
        DrawScope.mI(drawScope, jKN, OffsetKt.n(fGh, fXMQ2), OffsetKt.n(f4, fXMQ2), 0.0f, 0, null, 0.0f, null, 0, 504, null);
        long jN = OffsetKt.n(f4, fXMQ2);
        float f5 = fXMQ2 + fXMQ;
        DrawScope.mI(drawScope, jKN, jN, OffsetKt.n(f4, f5), 0.0f, 0, null, 0.0f, null, 0, 504, null);
        DrawScope.mI(drawScope, jKN, OffsetKt.n(f4, f5), OffsetKt.n(fGh, f5), 0.0f, 0, null, 0.0f, null, 0, 504, null);
        DrawScope.mI(drawScope, jKN, OffsetKt.n(fGh, f5), OffsetKt.n(fGh, fXMQ2), 0.0f, 0, null, 0.0f, null, 0, 504, null);
        float f6 = 1;
        float f7 = fGh + f6;
        float f8 = fXMQ2 + f6;
        long jN2 = companion.n();
        float f9 = f7 + fMUb;
        DrawScope.mI(drawScope, jN2, OffsetKt.n(f7, f8), OffsetKt.n(f9, f8), 0.0f, 0, null, 0.0f, null, 0, 504, null);
        float f10 = f8 + fXMQ;
        DrawScope.mI(drawScope, jN2, OffsetKt.n(f9, f8), OffsetKt.n(f9, f10), 0.0f, 0, null, 0.0f, null, 0, 504, null);
        DrawScope.mI(drawScope, jN2, OffsetKt.n(f9, f10), OffsetKt.n(f7, f10), 0.0f, 0, null, 0.0f, null, 0, 504, null);
        DrawScope.mI(drawScope, jN2, OffsetKt.n(f7, f10), OffsetKt.n(f7, f8), 0.0f, 0, null, 0.0f, null, 0, 504, null);
    }

    public final void O(final BoxScope boxScope, final float f3, Composer composer, final int i2) {
        int i3;
        boolean z2;
        int i5;
        int i7;
        int i8;
        Composer composerKN = composer.KN(2126574786);
        if ((i2 & 6) == 0) {
            if (composerKN.p5(boxScope)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i3 = i8 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (composerKN.rl(f3)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i3 |= i7;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            if (composerKN.E2(this)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        if ((i3 & 147) == 146 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(2126574786, i3, -1, "androidx.constraintlayout.compose.Measurer.drawDebugBounds (ConstraintLayout.kt:2076)");
            }
            Modifier modifierO = boxScope.O(Modifier.INSTANCE);
            boolean zE2 = composerKN.E2(this);
            if ((i3 & 112) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z3 = z2 | zE2;
            Object objIF = composerKN.iF();
            if (z3 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function1<DrawScope, Unit>() { // from class: androidx.constraintlayout.compose.Measurer$drawDebugBounds$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        n(drawScope);
                        return Unit.INSTANCE;
                    }

                    public final void n(DrawScope drawScope) {
                        this.f34607n.J2(drawScope, f3);
                    }
                };
                composerKN.o(objIF);
            }
            CanvasKt.rl(modifierO, (Function1) objIF, composerKN, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.constraintlayout.compose.Measurer$drawDebugBounds$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i9) {
                    this.f34610n.O(boxScope, f3, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }
}
