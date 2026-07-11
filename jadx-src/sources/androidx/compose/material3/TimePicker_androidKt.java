package androidx.compose.material3;

import android.content.res.Configuration;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001a\u0010\u0005\u001a\u00020\u00008AX\u0080\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0001\u0010\u0002¨\u0006\u0006"}, d2 = {"Landroidx/compose/material3/TimePickerLayoutType;", c.f62177j, "(Landroidx/compose/runtime/Composer;I)I", "getDefaultTimePickerLayoutType$annotations", "()V", "defaultTimePickerLayoutType", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTimePicker.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.android.kt\nandroidx/compose/material3/TimePicker_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,35:1\n77#2:36\n*S KotlinDebug\n*F\n+ 1 TimePicker.android.kt\nandroidx/compose/material3/TimePicker_androidKt\n*L\n28#1:36\n*E\n"})
public final class TimePicker_androidKt {
    public static final int n(Composer composer, int i2) {
        int iRl;
        if (ComposerKt.v()) {
            ComposerKt.p5(-1979410629, i2, -1, "androidx.compose.material3.<get-defaultTimePickerLayoutType> (TimePicker.android.kt:27)");
        }
        Configuration configuration = (Configuration) composer.ty(AndroidCompositionLocals_androidKt.J2());
        if (configuration.screenHeightDp < configuration.screenWidthDp) {
            iRl = TimePickerLayoutType.INSTANCE.n();
        } else {
            iRl = TimePickerLayoutType.INSTANCE.rl();
        }
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return iRl;
    }
}
