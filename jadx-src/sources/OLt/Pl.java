package OLt;

import android.graphics.Canvas;
import android.graphics.drawable.NinePatchDrawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class Pl extends qz {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pl(NinePatchDrawable ninePatchDrawable) {
        super(ninePatchDrawable);
        Intrinsics.checkNotNullParameter(ninePatchDrawable, "ninePatchDrawable");
    }

    @Override // OLt.qz, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (T5.n.nr()) {
            T5.n.n("RoundedNinePatchDrawable#draw");
        }
        if (!xMQ()) {
            super.draw(canvas);
            if (T5.n.nr()) {
                T5.n.rl();
                return;
            }
            return;
        }
        ty();
        qie();
        canvas.clipPath(this.f7392r);
        super.draw(canvas);
        if (T5.n.nr()) {
            T5.n.rl();
        }
    }
}
