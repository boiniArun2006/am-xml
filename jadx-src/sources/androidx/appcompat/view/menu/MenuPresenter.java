package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@RestrictTo
public interface MenuPresenter {

    public interface Callback {
        void rl(MenuBuilder menuBuilder, boolean z2);

        boolean t(MenuBuilder menuBuilder);
    }

    boolean J2(SubMenuBuilder subMenuBuilder);

    void KN(boolean z2);

    void O(Parcelable parcelable);

    Parcelable Uo();

    int getId();

    void gh(Context context, MenuBuilder menuBuilder);

    boolean mUb(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl);

    void nr(Callback callback);

    void rl(MenuBuilder menuBuilder, boolean z2);

    boolean t(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl);

    boolean xMQ();
}
