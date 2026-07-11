package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aH\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0003ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f²\u0006\f\u0010\u000e\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"", "enabled", "isError", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/material/TextFieldColors;", "colors", "Landroidx/compose/ui/unit/Dp;", "focusedBorderThickness", "unfocusedBorderThickness", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/BorderStroke;", "rl", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material/TextFieldColors;FFLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "focused", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTextFieldDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material/TextFieldDefaultsKt\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,985:1\n85#2:986\n*S KotlinDebug\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material/TextFieldDefaultsKt\n*L\n972#1:986\n*E\n"})
public final class TextFieldDefaultsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final State rl(boolean z2, boolean z3, InteractionSource interactionSource, TextFieldColors textFieldColors, float f3, float f4, Composer composer, int i2) {
        float f5;
        State stateCk;
        if (ComposerKt.v()) {
            ComposerKt.p5(1097899920, i2, -1, "androidx.compose.material.animateBorderStrokeAsState (TextFieldDefaults.kt:970)");
        }
        State stateN = FocusInteractionKt.n(interactionSource, composer, (i2 >> 6) & 14);
        State stateO = textFieldColors.O(z2, z3, interactionSource, composer, i2 & 8190);
        if (t(stateN)) {
            f5 = f3;
        } else {
            f5 = f4;
        }
        if (z2) {
            composer.eF(773088894);
            stateCk = AnimateAsStateKt.t(f5, AnimationSpecKt.ty(150, 0, null, 6, null), null, null, composer, 48, 12);
            composer.Xw();
        } else {
            composer.eF(773193116);
            stateCk = SnapshotStateKt.ck(Dp.nr(f4), composer, (i2 >> 15) & 14);
            composer.Xw();
        }
        State stateCk2 = SnapshotStateKt.ck(new BorderStroke(((Dp) stateCk.getValue()).getValue(), new SolidColor(((Color) stateO.getValue()).getValue(), null), null), composer, 0);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return stateCk2;
    }

    private static final boolean t(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }
}
