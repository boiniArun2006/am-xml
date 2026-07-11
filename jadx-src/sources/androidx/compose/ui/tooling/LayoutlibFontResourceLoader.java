package androidx.compose.ui.tooling;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.ResourceFont;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/tooling/LayoutlibFontResourceLoader;", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/compose/ui/text/font/Font;", "font", "Landroid/graphics/Typeface;", "rl", "(Landroidx/compose/ui/text/font/Font;)Landroid/graphics/Typeface;", c.f62177j, "Landroid/content/Context;", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LayoutlibFontResourceLoader implements Font.ResourceLoader {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final Context context;

    @Override // androidx.compose.ui.text.font.Font.ResourceLoader
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public Typeface n(Font font) {
        if ((font instanceof ResourceFont) && Build.VERSION.SDK_INT >= 26) {
            return ResourceFontHelper.f34016n.n(this.context, (ResourceFont) font);
        }
        throw new IllegalArgumentException("Unknown font type: " + font.getClass().getName());
    }

    public LayoutlibFontResourceLoader(Context context) {
        this.context = context;
    }
}
