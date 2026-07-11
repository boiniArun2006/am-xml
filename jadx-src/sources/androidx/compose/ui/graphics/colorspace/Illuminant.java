package androidx.compose.ui.graphics.colorspace;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u0011\u0010\u000bR\u0017\u0010\u0014\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\b\u0010\u000bR\u0017\u0010\u0016\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0018\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\t\u001a\u0004\b\u0010\u0010\u000bR\u0017\u0010\u001a\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\t\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u001d\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\t\u001a\u0004\b\u001c\u0010\u000bR\u0017\u0010 \u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\t\u001a\u0004\b\u001f\u0010\u000bR\u001a\u0010#\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\r\u0010\u0006¨\u0006$"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Illuminant;", "", "<init>", "()V", "", "J2", "()[F", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "rl", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "getA", "()Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "A", "t", "getB", "B", "nr", c.f62177j, "C", "O", "D50", "getD55", "D55", "Uo", "D60", "KN", "D65", "xMQ", "getD75", "D75", "mUb", "getE", "E", "gh", "[F", "D50Xyz", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Illuminant {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Illuminant f31613n = new Illuminant();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final WhitePoint A = new WhitePoint(0.44757f, 0.40745f);

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final WhitePoint B = new WhitePoint(0.34842f, 0.35161f);

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private static final WhitePoint C = new WhitePoint(0.31006f, 0.31616f);

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private static final WhitePoint D50 = new WhitePoint(0.34567f, 0.3585f);

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private static final WhitePoint D55 = new WhitePoint(0.33242f, 0.34743f);

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private static final WhitePoint D60 = new WhitePoint(0.32168f, 0.33767f);

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private static final WhitePoint D65 = new WhitePoint(0.31271f, 0.32902f);

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private static final WhitePoint D75 = new WhitePoint(0.29902f, 0.31485f);

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private static final WhitePoint E = new WhitePoint(0.33333f, 0.33333f);

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private static final float[] D50Xyz = {0.964212f, 1.0f, 0.825188f};

    public final float[] J2() {
        return new float[]{0.964212f, 1.0f, 0.825188f};
    }

    public final WhitePoint O() {
        return D65;
    }

    public final WhitePoint n() {
        return C;
    }

    public final WhitePoint nr() {
        return D60;
    }

    public final WhitePoint rl() {
        return D50;
    }

    public final float[] t() {
        return D50Xyz;
    }

    private Illuminant() {
    }
}
