package androidx.compose.material3.internal;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.os.ConfigurationCompat;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a\u001a\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a.\u0010\b\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H\u0001ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\n"}, d2 = {"Landroidx/compose/material3/internal/Strings;", "string", "", c.f62177j, "(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "", "", "formatArgs", "rl", "(I[Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStrings.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strings.android.kt\nandroidx/compose/material3/internal/Strings_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,243:1\n77#2:244\n77#2:245\n77#2:246\n*S KotlinDebug\n*F\n+ 1 Strings.android.kt\nandroidx/compose/material3/internal/Strings_androidKt\n*L\n32#1:244\n33#1:245\n42#1:246\n*E\n"})
public final class Strings_androidKt {
    public static final String n(int i2, Composer composer, int i3) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-907677715, i3, -1, "androidx.compose.material3.internal.getString (Strings.android.kt:30)");
        }
        composer.ty(AndroidCompositionLocals_androidKt.J2());
        String string = ((Context) composer.ty(AndroidCompositionLocals_androidKt.Uo())).getResources().getString(i2);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return string;
    }

    public static final String rl(int i2, Object[] objArr, Composer composer, int i3) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-1427268608, i3, -1, "androidx.compose.material3.internal.getString (Strings.android.kt:38)");
        }
        String strN = n(i2, composer, i3 & 14);
        Locale localeNr = ConfigurationCompat.n((Configuration) composer.ty(AndroidCompositionLocals_androidKt.J2())).nr(0);
        if (localeNr == null) {
            localeNr = Locale.getDefault();
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        String str = String.format(localeNr, strN, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return str;
    }
}
