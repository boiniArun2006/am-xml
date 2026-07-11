package androidx.transition;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
class RectEvaluator implements TypeEvaluator<Rect> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Rect f42200n;

    RectEvaluator() {
    }

    RectEvaluator(Rect rect) {
        this.f42200n = rect;
    }

    @Override // android.animation.TypeEvaluator
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public Rect evaluate(float f3, Rect rect, Rect rect2) {
        int i2 = rect.left + ((int) ((rect2.left - r0) * f3));
        int i3 = rect.top + ((int) ((rect2.top - r1) * f3));
        int i5 = rect.right + ((int) ((rect2.right - r2) * f3));
        int i7 = rect.bottom + ((int) ((rect2.bottom - r6) * f3));
        Rect rect3 = this.f42200n;
        if (rect3 == null) {
            return new Rect(i2, i3, i5, i7);
        }
        rect3.set(i2, i3, i5, i7);
        return this.f42200n;
    }
}
