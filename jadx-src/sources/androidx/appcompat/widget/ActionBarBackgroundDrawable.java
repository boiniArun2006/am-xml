package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
class ActionBarBackgroundDrawable extends Drawable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final ActionBarContainer f13930n;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @RequiresApi
    private static class Api21Impl {
        public static void n(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f13930n;
        if (actionBarContainer.f13934g) {
            Drawable drawable = actionBarContainer.f13932S;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f13937r;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f13930n;
        Drawable drawable3 = actionBarContainer2.f13936o;
        if (drawable3 == null || !actionBarContainer2.E2) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f13930n;
        if (actionBarContainer.f13934g) {
            if (actionBarContainer.f13932S != null) {
                Api21Impl.n(actionBarContainer.f13937r, outline);
            }
        } else {
            Drawable drawable = actionBarContainer.f13937r;
            if (drawable != null) {
                Api21Impl.n(drawable, outline);
            }
        }
    }

    public ActionBarBackgroundDrawable(ActionBarContainer actionBarContainer) {
        this.f13930n = actionBarContainer;
    }
}
