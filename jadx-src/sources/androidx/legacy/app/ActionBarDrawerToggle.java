package androidx.legacy.app;

import android.R;
import android.app.ActionBar;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.drawerlayout.widget.DrawerLayout;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Deprecated
public class ActionBarDrawerToggle implements DrawerLayout.DrawerListener {
    private static final int[] Uo = {R.attr.homeAsUpIndicator};
    private final int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final int f38798O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final Activity f38799n;
    private SlideDrawable nr;
    private final Delegate rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f38800t;

    @Deprecated
    public interface Delegate {
        void n(int i2);
    }

    @Deprecated
    public interface DelegateProvider {
    }

    private static class SetIndicatorInfo {
    }

    private class SlideDrawable extends InsetDrawable implements Drawable.Callback {
        private float J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private float f38801O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final boolean f38802n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ ActionBarDrawerToggle f38803r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Rect f38804t;

        @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            copyBounds(this.f38804t);
            canvas.save();
            boolean z2 = ViewCompat.nY(this.f38803r.f38799n.getWindow().getDecorView()) == 1;
            int i2 = z2 ? -1 : 1;
            float fWidth = this.f38804t.width();
            canvas.translate((-this.J2) * fWidth * this.f38801O * i2, 0.0f);
            if (z2 && !this.f38802n) {
                canvas.translate(fWidth, 0.0f);
                canvas.scale(-1.0f, 1.0f);
            }
            super.draw(canvas);
            canvas.restore();
        }

        public float n() {
            return this.f38801O;
        }

        public void rl(float f3) {
            this.f38801O = f3;
            invalidateSelf();
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public void t(int i2) {
    }

    private void O(int i2) {
        Delegate delegate = this.rl;
        if (delegate != null) {
            delegate.n(i2);
            return;
        }
        ActionBar actionBar = this.f38799n.getActionBar();
        if (actionBar != null) {
            actionBar.setHomeActionContentDescription(i2);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public void n(View view) {
        this.nr.rl(1.0f);
        if (this.f38800t) {
            O(this.J2);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public void nr(View view, float f3) {
        float fN = this.nr.n();
        this.nr.rl(f3 > 0.5f ? Math.max(fN, Math.max(0.0f, f3 - 0.5f) * 2.0f) : Math.min(fN, f3 * 2.0f));
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public void rl(View view) {
        this.nr.rl(0.0f);
        if (this.f38800t) {
            O(this.f38798O);
        }
    }
}
