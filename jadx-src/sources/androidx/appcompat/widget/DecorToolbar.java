package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.core.view.ViewPropertyAnimatorCompat;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@RestrictTo
public interface DecorToolbar {
    void HI(int i2);

    void Ik(boolean z2);

    void J2();

    boolean KN();

    boolean O();

    int S();

    boolean Uo();

    void WPU();

    void XQ(MenuPresenter.Callback callback, MenuBuilder.Callback callback2);

    void Z(int i2);

    ViewGroup az();

    void ck();

    void collapseActionView();

    Context getContext();

    CharSequence getTitle();

    int gh();

    Menu mUb();

    boolean n();

    void nr(Menu menu, MenuPresenter.Callback callback);

    void o(ScrollingTabContainerView scrollingTabContainerView);

    ViewPropertyAnimatorCompat qie(int i2, long j2);

    void r();

    boolean rl();

    void setIcon(int i2);

    void setIcon(Drawable drawable);

    void setVisibility(int i2);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    boolean t();

    void ty(boolean z2);

    void xMQ(int i2);
}
