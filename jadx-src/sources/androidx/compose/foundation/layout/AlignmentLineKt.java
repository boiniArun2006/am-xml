package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a2\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a*\u0010\n\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a>\u0010\u0012\u001a\u00020\u0011*\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\"\u0018\u0010\u0017\u001a\u00020\u0014*\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "Landroidx/compose/ui/unit/Dp;", TtmlNode.ANNOTATION_POSITION_BEFORE, TtmlNode.ANNOTATION_POSITION_AFTER, "O", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/AlignmentLine;FF)Landroidx/compose/ui/Modifier;", "top", "bottom", "Uo", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "t", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/AlignmentLine;FFLandroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "", "nr", "(Landroidx/compose/ui/layout/AlignmentLine;)Z", "horizontal", "foundation-layout_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAlignmentLine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlignmentLine.kt\nandroidx/compose/foundation/layout/AlignmentLineKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,364:1\n110#2:365\n110#2:366\n97#3:367\n97#3:368\n97#3:372\n97#3:373\n247#4:369\n247#4:370\n1#5:371\n*S KotlinDebug\n*F\n+ 1 AlignmentLine.kt\nandroidx/compose/foundation/layout/AlignmentLineKt\n*L\n75#1:365\n119#1:366\n146#1:367\n153#1:368\n323#1:372\n328#1:373\n181#1:369\n184#1:370\n*E\n"})
public final class AlignmentLineKt {
    public static /* synthetic */ Modifier J2(Modifier modifier, AlignmentLine alignmentLine, float f3, float f4, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f3 = Dp.INSTANCE.t();
        }
        if ((i2 & 4) != 0) {
            f4 = Dp.INSTANCE.t();
        }
        return O(modifier, alignmentLine, f3, f4);
    }

    public static /* synthetic */ Modifier KN(Modifier modifier, float f3, float f4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f3 = Dp.INSTANCE.t();
        }
        if ((i2 & 2) != 0) {
            f4 = Dp.INSTANCE.t();
        }
        return Uo(modifier, f3, f4);
    }

    public static final Modifier O(Modifier modifier, final AlignmentLine alignmentLine, final float f3, final float f4) {
        return modifier.Zmq(new AlignmentLineOffsetDpElement(alignmentLine, f3, f4, InspectableValueKt.rl() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.AlignmentLineKt$paddingFrom-4j6BHR0$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                n(inspectorInfo);
                return Unit.INSTANCE;
            }

            public final void n(InspectorInfo inspectorInfo) {
                inspectorInfo.rl("paddingFrom");
                inspectorInfo.getProperties().n("alignmentLine", alignmentLine);
                inspectorInfo.getProperties().n(TtmlNode.ANNOTATION_POSITION_BEFORE, Dp.nr(f3));
                inspectorInfo.getProperties().n(TtmlNode.ANNOTATION_POSITION_AFTER, Dp.nr(f4));
            }
        } : InspectableValueKt.n(), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean nr(AlignmentLine alignmentLine) {
        return alignmentLine instanceof HorizontalAlignmentLine;
    }

    public static final Modifier Uo(Modifier modifier, float f3, float f4) {
        Modifier modifierJ2;
        Modifier modifierJ22;
        if (!Float.isNaN(f3)) {
            modifierJ2 = J2(Modifier.INSTANCE, androidx.compose.ui.layout.AlignmentLineKt.n(), f3, 0.0f, 4, null);
        } else {
            modifierJ2 = Modifier.INSTANCE;
        }
        Modifier modifierZmq = modifier.Zmq(modifierJ2);
        if (!Float.isNaN(f4)) {
            modifierJ22 = J2(Modifier.INSTANCE, androidx.compose.ui.layout.AlignmentLineKt.rl(), 0.0f, f4, 2, null);
        } else {
            modifierJ22 = Modifier.INSTANCE;
        }
        return modifierZmq.Zmq(modifierJ22);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult t(MeasureScope measureScope, final AlignmentLine alignmentLine, final float f3, float f4, Measurable measurable, long j2) {
        long jNr;
        int width;
        int iQie;
        int iHow;
        int iHow2;
        int iMax;
        int height;
        if (nr(alignmentLine)) {
            jNr = Constraints.nr(j2, 0, 0, 0, 0, 11, null);
        } else {
            jNr = Constraints.nr(j2, 0, 0, 0, 0, 14, null);
        }
        final Placeable placeableDR0 = measurable.dR0(jNr);
        int iZ = placeableDR0.z(alignmentLine);
        if (iZ == Integer.MIN_VALUE) {
            iZ = 0;
        }
        if (nr(alignmentLine)) {
            width = placeableDR0.getHeight();
        } else {
            width = placeableDR0.getWidth();
        }
        if (nr(alignmentLine)) {
            iQie = Constraints.gh(j2);
        } else {
            iQie = Constraints.qie(j2);
        }
        if (!Float.isNaN(f3)) {
            iHow = measureScope.How(f3);
        } else {
            iHow = 0;
        }
        int i2 = iQie - width;
        final int iCoerceIn = RangesKt.coerceIn(iHow - iZ, 0, i2);
        if (!Float.isNaN(f4)) {
            iHow2 = measureScope.How(f4);
        } else {
            iHow2 = 0;
        }
        final int iCoerceIn2 = RangesKt.coerceIn((iHow2 - width) + iZ, 0, i2 - iCoerceIn);
        if (nr(alignmentLine)) {
            iMax = placeableDR0.getWidth();
        } else {
            iMax = Math.max(placeableDR0.getWidth() + iCoerceIn + iCoerceIn2, Constraints.ty(j2));
        }
        final int i3 = iMax;
        if (nr(alignmentLine)) {
            height = Math.max(placeableDR0.getHeight() + iCoerceIn + iCoerceIn2, Constraints.az(j2));
        } else {
            height = placeableDR0.getHeight();
        }
        final int i5 = height;
        return MeasureScope.ER(measureScope, i3, i5, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.AlignmentLineKt$alignmentLineOffsetMeasure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                n(placementScope);
                return Unit.INSTANCE;
            }

            public final void n(Placeable.PlacementScope placementScope) {
                int width2;
                if (AlignmentLineKt.nr(alignmentLine)) {
                    width2 = 0;
                } else {
                    width2 = !Dp.mUb(f3, Dp.INSTANCE.t()) ? iCoerceIn : (i3 - iCoerceIn2) - placeableDR0.getWidth();
                }
                Placeable.PlacementScope.az(placementScope, placeableDR0, width2, AlignmentLineKt.nr(alignmentLine) ? !Dp.mUb(f3, Dp.INSTANCE.t()) ? iCoerceIn : (i5 - iCoerceIn2) - placeableDR0.getHeight() : 0, 0.0f, 4, null);
            }
        }, 4, null);
    }
}
