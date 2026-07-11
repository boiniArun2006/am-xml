package androidx.appcompat.widget;

import android.view.MenuItem;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPopupHelper;
import androidx.appcompat.view.menu.ShowableListMenu;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class PopupMenu {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final MenuPopupHelper f14261n;
    OnMenuItemClickListener rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    OnDismissListener f14262t;

    /* JADX INFO: renamed from: androidx.appcompat.widget.PopupMenu$1, reason: invalid class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
    class AnonymousClass1 implements MenuBuilder.Callback {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ PopupMenu f14263n;

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public void rl(MenuBuilder menuBuilder) {
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public boolean n(MenuBuilder menuBuilder, MenuItem menuItem) {
            OnMenuItemClickListener onMenuItemClickListener = this.f14263n.rl;
            if (onMenuItemClickListener != null) {
                return onMenuItemClickListener.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.PopupMenu$2, reason: invalid class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
    class AnonymousClass2 implements PopupWindow.OnDismissListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ PopupMenu f14264n;

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            PopupMenu popupMenu = this.f14264n;
            OnDismissListener onDismissListener = popupMenu.f14262t;
            if (onDismissListener != null) {
                onDismissListener.n(popupMenu);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.PopupMenu$3, reason: invalid class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
    class AnonymousClass3 extends ForwardingListener {
        final /* synthetic */ PopupMenu E2;

        @Override // androidx.appcompat.widget.ForwardingListener
        protected boolean nr() {
            this.E2.n();
            return true;
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        public ShowableListMenu rl() {
            return this.E2.f14261n.t();
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        protected boolean t() {
            this.E2.rl();
            return true;
        }
    }

    public interface OnDismissListener {
        void n(PopupMenu popupMenu);
    }

    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public void n() {
        this.f14261n.rl();
    }

    public void rl() {
        this.f14261n.gh();
    }
}
