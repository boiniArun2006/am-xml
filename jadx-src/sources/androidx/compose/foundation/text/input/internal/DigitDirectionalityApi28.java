package androidx.compose.foundation.text.input.internal;

import android.icu.text.DecimalFormatSymbols;
import androidx.annotation.RequiresApi;
import java.util.Locale;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@RequiresApi
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/text/input/internal/DigitDirectionalityApi28;", "", "<init>", "()V", "Ljava/util/Locale;", "Landroidx/compose/ui/text/intl/PlatformLocale;", "locale", "", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Ljava/util/Locale;)B", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class DigitDirectionalityApi28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final DigitDirectionalityApi28 f20115n = new DigitDirectionalityApi28();

    private DigitDirectionalityApi28() {
    }

    public final byte n(Locale locale) {
        return Character.getDirectionality(CodepointHelpers_jvmKt.rl(DecimalFormatSymbols.getInstance(locale).getDigitStrings()[0], 0));
    }
}
