package androidx.compose.material3.tokens;

import androidx.compose.material3.internal.DefaultPlatformTextStyle_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.LineHeightStyle;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\n\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0001\u0010\t¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle;", c.f62177j, "Landroidx/compose/ui/text/style/LineHeightStyle;", "getDefaultLineHeightStyle", "()Landroidx/compose/ui/text/style/LineHeightStyle;", "DefaultLineHeightStyle", "Landroidx/compose/ui/text/TextStyle;", "rl", "Landroidx/compose/ui/text/TextStyle;", "()Landroidx/compose/ui/text/TextStyle;", "DefaultTextStyle", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TypographyTokensKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final LineHeightStyle f30033n;
    private static final TextStyle rl;

    static {
        LineHeightStyle lineHeightStyle = new LineHeightStyle(LineHeightStyle.Alignment.INSTANCE.n(), LineHeightStyle.Trim.INSTANCE.rl(), (DefaultConstructorMarker) null);
        f30033n = lineHeightStyle;
        rl = TextStyle.t(TextStyle.INSTANCE.n(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, DefaultPlatformTextStyle_androidKt.n(), lineHeightStyle, 0, 0, null, 15204351, null);
    }

    public static final TextStyle n() {
        return rl;
    }
}
