package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Stable
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\bg\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\u0007J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\u0007J-\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H'¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u0012\u0010\u000eJ%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H'¢\u0006\u0004\b\u0013\u0010\u0011J-\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u0014\u0010\u000eJ-\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\u0015\u0010\u000eJ\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000f\u001a\u00020\u0002H'¢\u0006\u0004\b\u0016\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, d2 = {"Landroidx/compose/material/TextFieldColors;", "", "", "enabled", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", "t", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", c.f62177j, "Uo", MRAIDPresenter.ERROR, "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "KN", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "isError", "rl", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "nr", "J2", "mUb", "O", "xMQ", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface TextFieldColors {
    State J2(boolean z2, boolean z3, Composer composer, int i2);

    State KN(boolean z2, boolean z3, InteractionSource interactionSource, Composer composer, int i2);

    State O(boolean z2, boolean z3, InteractionSource interactionSource, Composer composer, int i2);

    State Uo(boolean z2, Composer composer, int i2);

    State n(boolean z2, Composer composer, int i2);

    State rl(boolean z2, boolean z3, Composer composer, int i2);

    State t(boolean z2, Composer composer, int i2);

    State xMQ(boolean z2, Composer composer, int i2);

    default State mUb(boolean z2, boolean z3, InteractionSource interactionSource, Composer composer, int i2) {
        composer.eF(454310320);
        if (ComposerKt.v()) {
            ComposerKt.p5(454310320, i2, -1, "androidx.compose.material.TextFieldColors.trailingIconColor (TextFieldDefaults.kt:155)");
        }
        State stateJ2 = J2(z2, z3, composer, (i2 & 126) | ((i2 >> 3) & 896));
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return stateJ2;
    }

    default State nr(boolean z2, boolean z3, InteractionSource interactionSource, Composer composer, int i2) {
        composer.eF(-1036335134);
        if (ComposerKt.v()) {
            ComposerKt.p5(-1036335134, i2, -1, "androidx.compose.material.TextFieldColors.leadingIconColor (TextFieldDefaults.kt:124)");
        }
        State stateRl = rl(z2, z3, composer, (i2 & 126) | ((i2 >> 3) & 896));
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return stateRl;
    }
}
