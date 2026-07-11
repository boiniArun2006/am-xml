package androidx.compose.material;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.material.Strings;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001a\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/Strings;", "string", "", c.f62177j, "(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStrings.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strings.android.kt\nandroidx/compose/material/Strings_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,41:1\n75#2:42\n75#2:43\n*S KotlinDebug\n*F\n+ 1 Strings.android.kt\nandroidx/compose/material/Strings_androidKt\n*L\n27#1:42\n28#1:43\n*E\n"})
public final class Strings_androidKt {
    public static final String n(int i2, Composer composer, int i3) {
        String string;
        if (ComposerKt.v()) {
            ComposerKt.p5(-726638443, i3, -1, "androidx.compose.material.getString (Strings.android.kt:25)");
        }
        composer.ty(AndroidCompositionLocals_androidKt.J2());
        Resources resources = ((Context) composer.ty(AndroidCompositionLocals_androidKt.Uo())).getResources();
        Strings.Companion companion = Strings.INSTANCE;
        if (Strings.gh(i2, companion.O())) {
            string = resources.getString(androidx.compose.ui.R.string.xMQ);
        } else if (Strings.gh(i2, companion.n())) {
            string = resources.getString(androidx.compose.ui.R.string.rl);
        } else if (Strings.gh(i2, companion.rl())) {
            string = resources.getString(androidx.compose.ui.R.string.f31095t);
        } else if (Strings.gh(i2, companion.t())) {
            string = resources.getString(androidx.compose.ui.R.string.nr);
        } else if (Strings.gh(i2, companion.nr())) {
            string = resources.getString(androidx.compose.ui.R.string.J2);
        } else if (Strings.gh(i2, companion.Uo())) {
            string = resources.getString(androidx.compose.ui.R.string.qie);
        } else if (Strings.gh(i2, companion.J2())) {
            string = resources.getString(androidx.compose.ui.R.string.gh);
        } else if (Strings.gh(i2, companion.KN())) {
            string = resources.getString(R.string.f22576n);
        } else {
            string = "";
        }
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return string;
    }
}
