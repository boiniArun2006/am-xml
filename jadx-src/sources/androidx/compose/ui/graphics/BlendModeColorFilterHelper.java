package androidx.compose.ui.graphics;

import androidx.annotation.RequiresApi;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@RequiresApi
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/graphics/BlendModeColorFilterHelper;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/Color;", TtmlNode.ATTR_TTS_COLOR, "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "Landroid/graphics/BlendModeColorFilter;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(JI)Landroid/graphics/BlendModeColorFilter;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class BlendModeColorFilterHelper {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final BlendModeColorFilterHelper f31421n = new BlendModeColorFilterHelper();

    private BlendModeColorFilterHelper() {
    }

    public final android.graphics.BlendModeColorFilter n(long color, int blendMode) {
        iwV.n();
        return lej.n(ColorKt.mUb(color), AndroidBlendMode_androidKt.n(blendMode));
    }
}
