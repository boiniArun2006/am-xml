package KA9;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.res.StringResources_androidKt;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class mz {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(float f3, int i2, Composer composer, int i3) {
        rl(f3, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    public static final void rl(float f3, Composer composer, final int i2) {
        int i3;
        final float f4;
        int i5;
        Composer composerKN = composer.KN(-684044122);
        if ((i2 & 6) == 0) {
            if (composerKN.rl(f3)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && composerKN.xMQ()) {
            composerKN.wTp();
            f4 = f3;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-684044122, i3, -1, "com.alightcreative.app.motion.activities.main.maintabs.projectlist.ui.components.XmlUploadProgressDialog (XmlUploadProgressDialog.kt:14)");
            }
            f4 = f3;
            Dj7.l4Z.J2(StringResources_androidKt.t(2132017161, composerKN, 6), f4, null, 0L, false, null, false, composerKN, (i3 << 3) & 112, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: KA9.l4Z
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return mz.t(f4, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
