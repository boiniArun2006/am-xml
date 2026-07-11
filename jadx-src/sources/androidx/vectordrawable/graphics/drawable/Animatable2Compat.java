package androidx.vectordrawable.graphics.drawable;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public interface Animatable2Compat extends Animatable {

    public static abstract class AnimationCallback {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Animatable2.AnimationCallback f42298n;

        public void rl(Drawable drawable) {
        }

        public void t(Drawable drawable) {
        }

        Animatable2.AnimationCallback n() {
            if (this.f42298n == null) {
                this.f42298n = new Animatable2.AnimationCallback() { // from class: androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback.1
                    @Override // android.graphics.drawable.Animatable2.AnimationCallback
                    public void onAnimationEnd(Drawable drawable) {
                        AnimationCallback.this.rl(drawable);
                    }

                    @Override // android.graphics.drawable.Animatable2.AnimationCallback
                    public void onAnimationStart(Drawable drawable) {
                        AnimationCallback.this.t(drawable);
                    }
                };
            }
            return this.f42298n;
        }
    }
}
