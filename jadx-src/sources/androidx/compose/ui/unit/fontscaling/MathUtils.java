package androidx.compose.ui.unit.fontscaling;

import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.applovin.sdk.AppLovinEventParameters;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0010\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ%\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\tJ5\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/unit/fontscaling/MathUtils;", "", "<init>", "()V", "", TtmlNode.START, "stop", AppLovinEventParameters.REVENUE_AMOUNT, "rl", "(FFF)F", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "b", "value", "t", "rangeMin", "rangeMax", "valueMin", "valueMax", c.f62177j, "(FFFFF)F", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@RestrictTo
public final class MathUtils {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final MathUtils f34175n = new MathUtils();

    public final float rl(float start, float stop, float amount) {
        return start + ((stop - start) * amount);
    }

    public final float t(float a2, float b2, float value) {
        if (a2 == b2) {
            return 0.0f;
        }
        return (value - a2) / (b2 - a2);
    }

    public final float n(float rangeMin, float rangeMax, float valueMin, float valueMax, float value) {
        return rl(rangeMin, rangeMax, Math.max(0.0f, Math.min(1.0f, t(valueMin, valueMax, value))));
    }

    private MathUtils() {
    }
}
