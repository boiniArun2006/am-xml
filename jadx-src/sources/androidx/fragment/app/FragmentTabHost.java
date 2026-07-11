package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.TabHost;
import androidx.annotation.Nullable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Deprecated
public class FragmentTabHost extends TabHost implements TabHost.OnTabChangeListener {
    private int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private FragmentManager f38632O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private boolean f38633S;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ArrayList f38634n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private TabInfo f38635o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private TabHost.OnTabChangeListener f38636r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Context f38637t;

    static class DummyTabFactory implements TabHost.TabContentFactory {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Context f38638n;

        @Override // android.widget.TabHost.TabContentFactory
        public View createTabContent(String str) {
            View view = new View(this.f38638n);
            view.setMinimumWidth(0);
            view.setMinimumHeight(0);
            return view;
        }
    }

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.fragment.app.FragmentTabHost.SavedState.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        };

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        String f38639n;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f38639n = parcel.readString();
        }

        public String toString() {
            return "FragmentTabHost.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " curTab=" + this.f38639n + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeString(this.f38639n);
        }
    }

    static final class TabInfo {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final String f38640n;
        Fragment nr;
        final Class rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final Bundle f38641t;
    }

    private TabInfo rl(String str) {
        int size = this.f38634n.size();
        for (int i2 = 0; i2 < size; i2++) {
            TabInfo tabInfo = (TabInfo) this.f38634n.get(i2);
            if (tabInfo.f38640n.equals(str)) {
                return tabInfo;
            }
        }
        return null;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.f38639n);
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    public void onTabChanged(String str) {
        FragmentTransaction fragmentTransactionN;
        if (this.f38633S && (fragmentTransactionN = n(str, null)) != null) {
            fragmentTransactionN.mUb();
        }
        TabHost.OnTabChangeListener onTabChangeListener = this.f38636r;
        if (onTabChangeListener != null) {
            onTabChangeListener.onTabChanged(str);
        }
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setOnTabChangedListener(@Nullable TabHost.OnTabChangeListener onTabChangeListener) {
        this.f38636r = onTabChangeListener;
    }

    @Override // android.widget.TabHost
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    private FragmentTransaction n(String str, FragmentTransaction fragmentTransaction) {
        Fragment fragment;
        TabInfo tabInfoRl = rl(str);
        if (this.f38635o != tabInfoRl) {
            if (fragmentTransaction == null) {
                fragmentTransaction = this.f38632O.o();
            }
            TabInfo tabInfo = this.f38635o;
            if (tabInfo != null && (fragment = tabInfo.nr) != null) {
                fragmentTransaction.ty(fragment);
            }
            if (tabInfoRl != null) {
                Fragment fragment2 = tabInfoRl.nr;
                if (fragment2 == null) {
                    Fragment fragmentN = this.f38632O.HV().n(this.f38637t.getClassLoader(), tabInfoRl.rl.getName());
                    tabInfoRl.nr = fragmentN;
                    fragmentN.setArguments(tabInfoRl.f38641t);
                    fragmentTransaction.t(this.J2, tabInfoRl.nr, tabInfoRl.f38640n);
                } else {
                    fragmentTransaction.xMQ(fragment2);
                }
            }
            this.f38635o = tabInfoRl;
        }
        return fragmentTransaction;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        int size = this.f38634n.size();
        FragmentTransaction fragmentTransactionO = null;
        for (int i2 = 0; i2 < size; i2++) {
            TabInfo tabInfo = (TabInfo) this.f38634n.get(i2);
            Fragment fragmentPJg = this.f38632O.pJg(tabInfo.f38640n);
            tabInfo.nr = fragmentPJg;
            if (fragmentPJg != null && !fragmentPJg.isDetached()) {
                if (tabInfo.f38640n.equals(currentTabTag)) {
                    this.f38635o = tabInfo;
                } else {
                    if (fragmentTransactionO == null) {
                        fragmentTransactionO = this.f38632O.o();
                    }
                    fragmentTransactionO.ty(tabInfo.nr);
                }
            }
        }
        this.f38633S = true;
        FragmentTransaction fragmentTransactionN = n(currentTabTag, fragmentTransactionO);
        if (fragmentTransactionN != null) {
            fragmentTransactionN.mUb();
            this.f38632O.ijL();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f38633S = false;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f38639n = getCurrentTabTag();
        return savedState;
    }
}
