package androidx.appcompat.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.R;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.core.view.ActionProvider;
import com.safedk.android.utils.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class ShareActionProvider extends ActionProvider {
    final Context J2;
    OnShareTargetSelectedListener KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final ShareMenuItemOnMenuItemClickListener f14334O;
    String Uo;
    private int nr;

    public interface OnShareTargetSelectedListener {
        boolean n(ShareActionProvider shareActionProvider, Intent intent);
    }

    private class ShareActivityChooserModelPolicy implements ActivityChooserModel.OnChooseActivityListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ ShareActionProvider f14335n;

        @Override // androidx.appcompat.widget.ActivityChooserModel.OnChooseActivityListener
        public boolean n(ActivityChooserModel activityChooserModel, Intent intent) {
            ShareActionProvider shareActionProvider = this.f14335n;
            OnShareTargetSelectedListener onShareTargetSelectedListener = shareActionProvider.KN;
            if (onShareTargetSelectedListener == null) {
                return false;
            }
            onShareTargetSelectedListener.n(shareActionProvider, intent);
            return false;
        }
    }

    private class ShareMenuItemOnMenuItemClickListener implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ ShareActionProvider f14336n;

        public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
            Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
            if (p1 == null) {
                return;
            }
            p0.startActivity(p1);
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            ShareActionProvider shareActionProvider = this.f14336n;
            Intent intentRl = ActivityChooserModel.nr(shareActionProvider.J2, shareActionProvider.Uo).rl(menuItem.getItemId());
            if (intentRl == null) {
                return true;
            }
            String action = intentRl.getAction();
            if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                this.f14336n.qie(intentRl);
            }
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this.f14336n.J2, intentRl);
            return true;
        }
    }

    @Override // androidx.core.view.ActionProvider
    public boolean n() {
        return true;
    }

    void qie(Intent intent) {
        intent.addFlags(134742016);
    }

    @Override // androidx.core.view.ActionProvider
    public View t() {
        ActivityChooserView activityChooserView = new ActivityChooserView(this.J2);
        if (!activityChooserView.isInEditMode()) {
            activityChooserView.setActivityChooserModel(ActivityChooserModel.nr(this.J2, this.Uo));
        }
        TypedValue typedValue = new TypedValue();
        this.J2.getTheme().resolveAttribute(R.attr.mUb, typedValue, true);
        activityChooserView.setExpandActivityOverflowButtonDrawable(AppCompatResources.rl(this.J2, typedValue.resourceId));
        activityChooserView.setProvider(this);
        activityChooserView.setDefaultActionButtonContentDescription(R.string.Ik);
        activityChooserView.setExpandActivityOverflowButtonContentDescription(R.string.ck);
        return activityChooserView;
    }

    @Override // androidx.core.view.ActionProvider
    public void J2(SubMenu subMenu) {
        subMenu.clear();
        ActivityChooserModel activityChooserModelNr = ActivityChooserModel.nr(this.J2, this.Uo);
        PackageManager packageManager = this.J2.getPackageManager();
        int iJ2 = activityChooserModelNr.J2();
        int iMin = Math.min(iJ2, this.nr);
        for (int i2 = 0; i2 < iMin; i2++) {
            ResolveInfo resolveInfoO = activityChooserModelNr.O(i2);
            subMenu.add(0, i2, i2, resolveInfoO.loadLabel(packageManager)).setIcon(resolveInfoO.loadIcon(packageManager)).setOnMenuItemClickListener(this.f14334O);
        }
        if (iMin < iJ2) {
            SubMenu subMenuAddSubMenu = subMenu.addSubMenu(0, iMin, iMin, this.J2.getString(R.string.rl));
            for (int i3 = 0; i3 < iJ2; i3++) {
                ResolveInfo resolveInfoO2 = activityChooserModelNr.O(i3);
                subMenuAddSubMenu.add(0, i3, i3, resolveInfoO2.loadLabel(packageManager)).setIcon(resolveInfoO2.loadIcon(packageManager)).setOnMenuItemClickListener(this.f14334O);
            }
        }
    }
}
