package androidx.dynamicanimation.animation;

import android.util.FloatProperty;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class FloatPropertyCompat<T> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final String f38304n;

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.FloatPropertyCompat$1, reason: invalid class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    final class AnonymousClass1 extends FloatPropertyCompat<Object> {
        final /* synthetic */ FloatProperty rl;

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public float n(Object obj) {
            return ((Float) this.rl.get(obj)).floatValue();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public void rl(Object obj, float f3) {
            this.rl.setValue(obj, f3);
        }
    }

    public abstract float n(Object obj);

    public abstract void rl(Object obj, float f3);

    public FloatPropertyCompat(String str) {
        this.f38304n = str;
    }
}
