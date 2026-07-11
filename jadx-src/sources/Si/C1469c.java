package Si;

import SJ0.QhI;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Si.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class C1469c extends C {
    private Xo J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final QhI f9846O;

    public /* synthetic */ C1469c(Context context, AttributeSet attributeSet, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1469c(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        QhI qhIT = QhI.t(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(qhIT, "inflate(...)");
        this.f9846O = qhIT;
    }

    public final void setPlayer(Xo player) {
        Intrinsics.checkNotNullParameter(player, "player");
        Xo xo = this.J2;
        if (xo != null) {
            throw new IllegalStateException("Cannot change Player!");
        }
        if (xo != null) {
            xo.iF(null);
        }
        player.iF(this.f9846O.rl.getHolder());
        this.J2 = player;
    }
}
