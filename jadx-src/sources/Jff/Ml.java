package Jff;

import OLt.CN3;
import OLt.DAz;
import OLt.nKK;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class Ml extends CN3 implements nKK {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private DAz f4627o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    Drawable f4628r;

    @Override // OLt.CN3, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return -1;
    }

    @Override // OLt.CN3, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return -1;
    }

    public void Ik(Drawable drawable) {
        this.f4628r = drawable;
        invalidateSelf();
    }

    @Override // OLt.CN3, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z2, boolean z3) {
        DAz dAz = this.f4627o;
        if (dAz != null) {
            dAz.U(z2);
        }
        return super.setVisible(z2, z3);
    }

    @Override // OLt.nKK
    public void xMQ(DAz dAz) {
        this.f4627o = dAz;
    }

    public Ml(Drawable drawable) {
        super(drawable);
        this.f4628r = null;
    }

    @Override // OLt.CN3, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (isVisible()) {
            DAz dAz = this.f4627o;
            if (dAz != null) {
                dAz.onDraw();
            }
            super.draw(canvas);
            Drawable drawable = this.f4628r;
            if (drawable != null) {
                drawable.setBounds(getBounds());
                this.f4628r.draw(canvas);
            }
        }
    }
}
