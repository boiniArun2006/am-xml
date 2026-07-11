package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.input.internal.TextLayoutState;
import androidx.compose.foundation.text.input.internal.TextLayoutStateKt;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.unit.IntSize;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a2\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "textFieldState", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "selectionState", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "textLayoutState", "Landroidx/compose/ui/unit/IntSize;", "magnifierSize", "Landroidx/compose/ui/geometry/Offset;", c.f62177j, "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;J)J", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTextFieldMagnifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldMagnifier.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldMagnifierKt\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,123:1\n278#2:124\n30#2:130\n65#3:125\n60#4:126\n85#4:129\n53#4,3:131\n22#5:127\n54#6:128\n1#7:134\n*S KotlinDebug\n*F\n+ 1 TextFieldMagnifier.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldMagnifierKt\n*L\n73#1:124\n117#1:130\n89#1:125\n89#1:126\n107#1:129\n117#1:131,3\n89#1:127\n107#1:128\n*E\n"})
public final class TextFieldMagnifierKt {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Handle.values().length];
            try {
                iArr[Handle.f19677n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Handle.f19679t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Handle.f19676O.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final long n(TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, TextLayoutState textLayoutState, long j2) {
        int i2;
        int iTy;
        long J2 = textFieldSelectionState.J();
        if ((9223372034707292159L & J2) == 9205357640488583168L || transformedTextFieldState.HI().length() == 0) {
            return Offset.INSTANCE.rl();
        }
        long selection = transformedTextFieldState.HI().getSelection();
        Handle handleFX = textFieldSelectionState.FX();
        if (handleFX == null) {
            i2 = -1;
        } else {
            i2 = WhenMappings.$EnumSwitchMapping$0[handleFX.ordinal()];
        }
        if (i2 != -1) {
            if (i2 != 1 && i2 != 2) {
                if (i2 == 3) {
                    iTy = TextRange.xMQ(selection);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                iTy = TextRange.ty(selection);
            }
            TextLayoutResult textLayoutResultJ2 = textLayoutState.J2();
            if (textLayoutResultJ2 == null) {
                return Offset.INSTANCE.rl();
            }
            float fIntBitsToFloat = Float.intBitsToFloat((int) (J2 >> 32));
            int iIk = textLayoutResultJ2.Ik(iTy);
            float fO = textLayoutResultJ2.o(iIk);
            float fZ = textLayoutResultJ2.Z(iIk);
            float fCoerceIn = RangesKt.coerceIn(fIntBitsToFloat, Math.min(fO, fZ), Math.max(fO, fZ));
            if (!IntSize.O(j2, IntSize.INSTANCE.n()) && Math.abs(fIntBitsToFloat - fCoerceIn) > ((int) (j2 >> 32)) / 2) {
                return Offset.INSTANCE.rl();
            }
            float fS = textLayoutResultJ2.S(iIk);
            long jO = Offset.O((((long) Float.floatToRawIntBits(((textLayoutResultJ2.az(iIk) - fS) / 2) + fS)) & 4294967295L) | (Float.floatToRawIntBits(fCoerceIn) << 32));
            LayoutCoordinates layoutCoordinatesMUb = textLayoutState.mUb();
            if (layoutCoordinatesMUb != null) {
                if (!layoutCoordinatesMUb.nr()) {
                    layoutCoordinatesMUb = null;
                }
                if (layoutCoordinatesMUb != null) {
                    jO = TextLayoutStateKt.n(jO, SelectionManagerKt.xMQ(layoutCoordinatesMUb));
                }
            }
            return TextLayoutStateKt.t(textLayoutState, jO);
        }
        return Offset.INSTANCE.rl();
    }
}
