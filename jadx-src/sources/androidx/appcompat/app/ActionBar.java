package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.appcompat.view.ActionMode;
import androidx.fragment.app.FragmentTransaction;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class ActionBar {

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface DisplayOptions {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface NavigationMode {
    }

    public interface OnMenuVisibilityListener {
        void n(boolean z2);
    }

    @Deprecated
    public interface OnNavigationListener {
        boolean n(int i2, long j2);
    }

    @Deprecated
    public static abstract class Tab {
        public abstract void J2();

        public abstract CharSequence O();

        public abstract CharSequence n();

        public abstract int nr();

        public abstract View rl();

        public abstract Drawable t();
    }

    @Deprecated
    public interface TabListener {
        void n(Tab tab, FragmentTransaction fragmentTransaction);

        void rl(Tab tab, FragmentTransaction fragmentTransaction);

        void t(Tab tab, FragmentTransaction fragmentTransaction);
    }

    public boolean HI(KeyEvent keyEvent) {
        return false;
    }

    public void Ik(boolean z2) {
    }

    public boolean J2() {
        return false;
    }

    public void KN(boolean z2) {
    }

    public boolean Uo() {
        return false;
    }

    public ActionMode XQ(ActionMode.Callback callback) {
        return null;
    }

    public void Z(CharSequence charSequence) {
    }

    void az() {
    }

    public boolean ck() {
        return false;
    }

    public boolean gh() {
        return false;
    }

    public Context mUb() {
        return null;
    }

    public void o(boolean z2) {
    }

    public void qie(Configuration configuration) {
    }

    public void r(int i2) {
    }

    public boolean ty(int i2, KeyEvent keyEvent) {
        return false;
    }

    public abstract int xMQ();

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f13541n;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f13541n = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f13516Z);
            this.f13541n = typedArrayObtainStyledAttributes.getInt(R.styleable.XQ, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public LayoutParams(int i2, int i3) {
            super(i2, i3);
            this.f13541n = 8388627;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.f13541n = 0;
            this.f13541n = layoutParams.f13541n;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f13541n = 0;
        }
    }
}
