package androidx.compose.ui.res;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.caoccao.javet.exceptions.JavetError;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\t\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t\u001a!\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\u0001\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a5\u0010\r\u001a\u00020\u00022\b\b\u0001\u0010\u0001\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"", "id", "", "t", "(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "", "", "formatArgs", "nr", "(I[Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", JavetError.PARAMETER_COUNT, c.f62177j, "(IILandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "rl", "(II[Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class StringResources_androidKt {
    public static final String n(int i2, int i3, Composer composer, int i5) {
        if (ComposerKt.v()) {
            ComposerKt.p5(1784741530, i5, -1, "androidx.compose.ui.res.pluralStringResource (StringResources.android.kt:73)");
        }
        String quantityString = Resources_androidKt.n(composer, 0).getQuantityString(i2, i3);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return quantityString;
    }

    public static final String nr(int i2, Object[] objArr, Composer composer, int i3) {
        if (ComposerKt.v()) {
            ComposerKt.p5(2071230100, i3, -1, "androidx.compose.ui.res.stringResource (StringResources.android.kt:46)");
        }
        String string = Resources_androidKt.n(composer, 0).getString(i2, Arrays.copyOf(objArr, objArr.length));
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return string;
    }

    public static final String rl(int i2, int i3, Object[] objArr, Composer composer, int i5) {
        if (ComposerKt.v()) {
            ComposerKt.p5(523207213, i5, -1, "androidx.compose.ui.res.pluralStringResource (StringResources.android.kt:88)");
        }
        String quantityString = Resources_androidKt.n(composer, 0).getQuantityString(i2, i3, Arrays.copyOf(objArr, objArr.length));
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return quantityString;
    }

    public static final String t(int i2, Composer composer, int i3) {
        if (ComposerKt.v()) {
            ComposerKt.p5(1223887937, i3, -1, "androidx.compose.ui.res.stringResource (StringResources.android.kt:32)");
        }
        String string = Resources_androidKt.n(composer, 0).getString(i2);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return string;
    }
}
