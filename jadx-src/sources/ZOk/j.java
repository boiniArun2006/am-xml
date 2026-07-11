package ZOk;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.TintAwareDrawable;
import mfo.C;
import mfo.CN3;
import mfo.Pl;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class j extends Drawable implements Pl, TintAwareDrawable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private n f12385n;

    static final class n extends Drawable.ConstantState {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        CN3 f12386n;
        boolean rl;

        public n(CN3 cn3) {
            this.f12386n = cn3;
            this.rl = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public j newDrawable() {
            return new j(new n(this));
        }

        public n(n nVar) {
            this.f12386n = (CN3) nVar.f12386n.getConstantState().newDrawable();
            this.rl = nVar.rl;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    public j(C c2) {
        this(new n(new CN3(c2)));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        n nVar = this.f12385n;
        if (nVar.rl) {
            nVar.f12386n.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f12385n;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f12385n.f12386n.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public j mutate() {
        this.f12385n = new n(this.f12385n);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f12385n.f12386n.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f12385n.f12386n.setColorFilter(colorFilter);
    }

    @Override // mfo.Pl
    public void setShapeAppearanceModel(C c2) {
        this.f12385n.f12386n.setShapeAppearanceModel(c2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i2) {
        this.f12385n.f12386n.setTint(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f12385n.f12386n.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f12385n.f12386n.setTintMode(mode);
    }

    private j(n nVar) {
        this.f12385n = nVar;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f12385n.f12386n.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        if (this.f12385n.f12386n.setState(iArr)) {
            zOnStateChange = true;
        }
        boolean zO = ZOk.n.O(iArr);
        n nVar = this.f12385n;
        if (nVar.rl != zO) {
            nVar.rl = zO;
            return true;
        }
        return zOnStateChange;
    }
}
