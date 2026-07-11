package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.input.internal.IndexTransformationType;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.WedgeAffinity;
import androidx.compose.ui.text.TextRange;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "proposedCursor", "cursor", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "transformedTextFieldState", "Landroidx/compose/foundation/text/input/internal/selection/CursorAndWedgeAffinity;", c.f62177j, "(IILandroidx/compose/foundation/text/input/internal/TransformedTextFieldState;)J", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTextPreparedSelection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/input/internal/selection/TextPreparedSelectionKt\n+ 2 TransformedTextFieldState.kt\nandroidx/compose/foundation/text/input/internal/TransformedTextFieldStateKt\n*L\n1#1,560:1\n722#2,23:561\n*S KotlinDebug\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/input/internal/selection/TextPreparedSelectionKt\n*L\n465#1:561,23\n*E\n"})
public final class TextPreparedSelectionKt {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IndexTransformationType.values().length];
            try {
                iArr[IndexTransformationType.f20143n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IndexTransformationType.J2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IndexTransformationType.f20142O.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IndexTransformationType.f20146t.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final long n(int i2, int i3, TransformedTextFieldState transformedTextFieldState) {
        if (i2 == -1) {
            return CursorAndWedgeAffinity.t(i3);
        }
        boolean z2 = i2 > i3;
        long jIk = transformedTextFieldState.Ik(i2);
        long jO = transformedTextFieldState.o(jIk);
        int i5 = WhenMappings.$EnumSwitchMapping$0[((TextRange.KN(jIk) && TextRange.KN(jO)) ? IndexTransformationType.f20143n : (TextRange.KN(jIk) || TextRange.KN(jO)) ? (!TextRange.KN(jIk) || TextRange.KN(jO)) ? IndexTransformationType.J2 : IndexTransformationType.f20146t : IndexTransformationType.f20142O).ordinal()];
        if (i5 == 1) {
            return CursorAndWedgeAffinity.nr(i2, z2 ? WedgeAffinity.f20375n : WedgeAffinity.f20376t);
        }
        if (i5 == 2) {
            return CursorAndWedgeAffinity.t(i2);
        }
        if (i5 == 3) {
            return z2 ? CursorAndWedgeAffinity.nr(TextRange.xMQ(jO), WedgeAffinity.f20375n) : CursorAndWedgeAffinity.nr(TextRange.ty(jO), WedgeAffinity.f20376t);
        }
        if (i5 == 4) {
            return z2 ? i2 == TextRange.ty(jO) ? CursorAndWedgeAffinity.nr(i2, WedgeAffinity.f20375n) : CursorAndWedgeAffinity.nr(TextRange.xMQ(jO), WedgeAffinity.f20376t) : i2 == TextRange.xMQ(jO) ? CursorAndWedgeAffinity.nr(i2, WedgeAffinity.f20376t) : CursorAndWedgeAffinity.nr(TextRange.ty(jO), WedgeAffinity.f20375n);
        }
        throw new NoWhenBranchMatchedException();
    }
}
