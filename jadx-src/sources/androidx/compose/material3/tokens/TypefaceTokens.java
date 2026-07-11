package androidx.compose.material3.tokens;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.GenericFontFamily;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0013\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\n\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\r\u0010\u0010¨\u0006\u0016"}, d2 = {"Landroidx/compose/material3/tokens/TypefaceTokens;", "", "<init>", "()V", "Landroidx/compose/ui/text/font/GenericFontFamily;", "rl", "Landroidx/compose/ui/text/font/GenericFontFamily;", c.f62177j, "()Landroidx/compose/ui/text/font/GenericFontFamily;", "Brand", "t", "Plain", "Landroidx/compose/ui/text/font/FontWeight;", "nr", "Landroidx/compose/ui/text/font/FontWeight;", "getWeightBold", "()Landroidx/compose/ui/text/font/FontWeight;", "WeightBold", "O", "WeightMedium", "J2", "WeightRegular", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TypefaceTokens {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private static final FontWeight WeightRegular;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private static final FontWeight WeightMedium;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final TypefaceTokens f30015n = new TypefaceTokens();

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private static final FontWeight WeightBold;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final GenericFontFamily Brand;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final GenericFontFamily Plain;

    static {
        FontFamily.Companion companion = FontFamily.INSTANCE;
        Brand = companion.nr();
        Plain = companion.nr();
        FontWeight.Companion companion2 = FontWeight.INSTANCE;
        WeightBold = companion2.n();
        WeightMedium = companion2.nr();
        WeightRegular = companion2.O();
    }

    public final GenericFontFamily n() {
        return Brand;
    }

    public final FontWeight nr() {
        return WeightRegular;
    }

    public final GenericFontFamily rl() {
        return Plain;
    }

    public final FontWeight t() {
        return WeightMedium;
    }

    private TypefaceTokens() {
    }
}
