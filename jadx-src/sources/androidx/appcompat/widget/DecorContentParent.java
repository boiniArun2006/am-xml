package androidx.appcompat.widget;

import android.view.Menu;
import android.view.Window;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuPresenter;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@RestrictTo
public interface DecorContentParent {
    void J2();

    void KN(int i2);

    boolean O();

    boolean Uo();

    boolean n();

    void nr(Menu menu, MenuPresenter.Callback callback);

    void qie();

    boolean rl();

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    boolean t();
}
