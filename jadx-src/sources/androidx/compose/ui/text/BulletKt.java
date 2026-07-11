package androidx.compose.ui.text;

import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.unit.TextUnitKt;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0007\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0002\"\u0014\u0010\t\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0002\"\u001a\u0010\u000e\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0001\u0010\r¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/unit/TextUnit;", c.f62177j, "J", "getDefaultBulletIndentation", "()J", "DefaultBulletIndentation", "rl", "DefaultBulletSize", "t", "DefaultBulletPadding", "Landroidx/compose/ui/text/Bullet;", "nr", "Landroidx/compose/ui/text/Bullet;", "()Landroidx/compose/ui/text/Bullet;", "DefaultBullet", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class BulletKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f33372n = TextUnitKt.O(1);
    private static final Bullet nr;
    private static final long rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long f33373t;

    static {
        long jNr = TextUnitKt.nr(0.25d);
        rl = jNr;
        long jNr2 = TextUnitKt.nr(0.25d);
        f33373t = jNr2;
        nr = new Bullet(CircleShape.f33377n, jNr, jNr2, null, 1.0f, Fill.f31654n, null);
    }

    public static final Bullet n() {
        return nr;
    }
}
