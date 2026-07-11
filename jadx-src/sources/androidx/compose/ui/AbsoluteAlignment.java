package androidx.compose.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAbsoluteAlignment;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR \u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR \u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\bR \u0010\u0014\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0006\u0012\u0004\b\u0013\u0010\u0003\u001a\u0004\b\u0012\u0010\bR \u0010\u0018\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0006\u0012\u0004\b\u0017\u0010\u0003\u001a\u0004\b\u0016\u0010\bR \u0010\u001c\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u0006\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u001a\u0010\bR \u0010#\u001a\u00020\u001d8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b\"\u0010\u0003\u001a\u0004\b \u0010!R \u0010&\u001a\u00020\u001d8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010\u001f\u0012\u0004\b%\u0010\u0003\u001a\u0004\b\u0005\u0010!¨\u0006'"}, d2 = {"Landroidx/compose/ui/AbsoluteAlignment;", "", "<init>", "()V", "Landroidx/compose/ui/Alignment;", "rl", "Landroidx/compose/ui/Alignment;", "t", "()Landroidx/compose/ui/Alignment;", "getTopLeft$annotations", "TopLeft", "nr", "getTopRight$annotations", "TopRight", "getCenterLeft", "getCenterLeft$annotations", "CenterLeft", "O", "getCenterRight", "getCenterRight$annotations", "CenterRight", "J2", "getBottomLeft", "getBottomLeft$annotations", "BottomLeft", "Uo", "getBottomRight", "getBottomRight$annotations", "BottomRight", "Landroidx/compose/ui/Alignment$Horizontal;", "KN", "Landroidx/compose/ui/Alignment$Horizontal;", c.f62177j, "()Landroidx/compose/ui/Alignment$Horizontal;", "getLeft$annotations", "Left", "xMQ", "getRight$annotations", "Right", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AbsoluteAlignment {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final AbsoluteAlignment f31033n = new AbsoluteAlignment();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final Alignment TopLeft = new BiasAbsoluteAlignment(-1.0f, -1.0f);

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final Alignment TopRight = new BiasAbsoluteAlignment(1.0f, -1.0f);

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private static final Alignment CenterLeft = new BiasAbsoluteAlignment(-1.0f, 0.0f);

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private static final Alignment CenterRight = new BiasAbsoluteAlignment(1.0f, 0.0f);

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private static final Alignment BottomLeft = new BiasAbsoluteAlignment(-1.0f, 1.0f);

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private static final Alignment BottomRight = new BiasAbsoluteAlignment(1.0f, 1.0f);

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private static final Alignment.Horizontal Left = new BiasAbsoluteAlignment.Horizontal(-1.0f);

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private static final Alignment.Horizontal Right = new BiasAbsoluteAlignment.Horizontal(1.0f);

    public final Alignment.Horizontal n() {
        return Left;
    }

    public final Alignment nr() {
        return TopRight;
    }

    public final Alignment.Horizontal rl() {
        return Right;
    }

    public final Alignment t() {
        return TopLeft;
    }

    private AbsoluteAlignment() {
    }
}
