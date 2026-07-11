package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentFactory;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.preference.PreferenceFragmentCompat;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import androidx.view.C1511ViewTreeOnBackPressedDispatcherOwner;
import androidx.view.LifecycleOwner;
import androidx.view.OnBackPressedCallback;
import androidx.view.OnBackPressedDispatcher;
import androidx.view.OnBackPressedDispatcherOwner;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.utils.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u00012\u00020\u0002:\u00014B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\nH\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\"\u001a\u00020!2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0017¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0013H&¢\u0006\u0004\b$\u0010%J!\u0010'\u001a\u00020\f2\u0006\u0010&\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0017¢\u0006\u0004\b'\u0010(J\u0019\u0010)\u001a\u00020\f2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b)\u0010*J\u0011\u0010+\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b+\u0010,R\u0018\u00100\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0011\u00103\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00065"}, d2 = {"Landroidx/preference/PreferenceHeaderFragmentCompat;", "Landroidx/fragment/app/Fragment;", "Landroidx/preference/PreferenceFragmentCompat$OnPreferenceStartFragmentCallback;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroidx/slidingpanelayout/widget/SlidingPaneLayout;", "ViF", "(Landroid/view/LayoutInflater;)Landroidx/slidingpanelayout/widget/SlidingPaneLayout;", "Landroidx/preference/Preference;", "header", "", "E2", "(Landroidx/preference/Preference;)V", "Landroid/content/Intent;", "intent", "fD", "(Landroid/content/Intent;)V", "Landroidx/preference/PreferenceFragmentCompat;", "caller", "pref", "", "mUb", "(Landroidx/preference/PreferenceFragmentCompat;Landroidx/preference/Preference;)Z", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/ViewGroup;", TtmlNode.RUBY_CONTAINER, "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "te", "()Landroidx/preference/PreferenceFragmentCompat;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onViewStateRestored", "(Landroid/os/Bundle;)V", "g", "()Landroidx/fragment/app/Fragment;", "Landroidx/activity/OnBackPressedCallback;", c.f62177j, "Landroidx/activity/OnBackPressedCallback;", "onBackPressedCallback", "nY", "()Landroidx/slidingpanelayout/widget/SlidingPaneLayout;", "slidingPaneLayout", "InnerOnBackPressedCallback", "preference_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class PreferenceHeaderFragmentCompat extends Fragment implements PreferenceFragmentCompat.OnPreferenceStartFragmentCallback {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private OnBackPressedCallback onBackPressedCallback;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/preference/PreferenceHeaderFragmentCompat$InnerOnBackPressedCallback;", "Landroidx/activity/OnBackPressedCallback;", "Landroidx/slidingpanelayout/widget/SlidingPaneLayout$PanelSlideListener;", "Landroidx/preference/PreferenceHeaderFragmentCompat;", "caller", "<init>", "(Landroidx/preference/PreferenceHeaderFragmentCompat;)V", "", "Uo", "()V", "Landroid/view/View;", "panel", "", "slideOffset", "t", "(Landroid/view/View;F)V", c.f62177j, "(Landroid/view/View;)V", "rl", "nr", "Landroidx/preference/PreferenceHeaderFragmentCompat;", "preference_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private static final class InnerOnBackPressedCallback extends OnBackPressedCallback implements SlidingPaneLayout.PanelSlideListener {

        /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
        private final PreferenceHeaderFragmentCompat caller;

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
        public void t(View panel, float slideOffset) {
            Intrinsics.checkNotNullParameter(panel, "panel");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InnerOnBackPressedCallback(PreferenceHeaderFragmentCompat caller) {
            super(true);
            Intrinsics.checkNotNullParameter(caller, "caller");
            this.caller = caller;
            caller.nY().n(this);
        }

        @Override // androidx.view.OnBackPressedCallback
        public void Uo() {
            this.caller.nY().rl();
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
        public void n(View panel) {
            Intrinsics.checkNotNullParameter(panel, "panel");
            az(true);
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
        public void rl(View panel) {
            Intrinsics.checkNotNullParameter(panel, "panel");
            az(false);
        }
    }

    public static void safedk_Fragment_startActivity_d519b2d71bdac81b1d20f350086c68e6(Fragment p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/fragment/app/Fragment;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivity(p1);
    }

    public abstract PreferenceFragmentCompat te();

    private final SlidingPaneLayout ViF(LayoutInflater inflater) {
        SlidingPaneLayout slidingPaneLayout = new SlidingPaneLayout(inflater.getContext());
        slidingPaneLayout.setId(R.id.nr);
        FragmentContainerView fragmentContainerView = new FragmentContainerView(inflater.getContext());
        fragmentContainerView.setId(R.id.f40653t);
        SlidingPaneLayout.LayoutParams layoutParams = new SlidingPaneLayout.LayoutParams(getResources().getDimensionPixelSize(R.dimen.rl), -1);
        layoutParams.f41994n = getResources().getInteger(R.integer.rl);
        slidingPaneLayout.addView(fragmentContainerView, layoutParams);
        FragmentContainerView fragmentContainerView2 = new FragmentContainerView(inflater.getContext());
        fragmentContainerView2.setId(R.id.rl);
        SlidingPaneLayout.LayoutParams layoutParams2 = new SlidingPaneLayout.LayoutParams(getResources().getDimensionPixelSize(R.dimen.f40649n), -1);
        layoutParams2.f41994n = getResources().getInteger(R.integer.f40654n);
        slidingPaneLayout.addView(fragmentContainerView2, layoutParams2);
        return slidingPaneLayout;
    }

    private final void fD(Intent intent) {
        if (intent == null) {
            return;
        }
        safedk_Fragment_startActivity_d519b2d71bdac81b1d20f350086c68e6(this, intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void iF(PreferenceHeaderFragmentCompat this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        OnBackPressedCallback onBackPressedCallback = this$0.onBackPressedCallback;
        Intrinsics.checkNotNull(onBackPressedCallback);
        onBackPressedCallback.az(this$0.getChildFragmentManager().Jk() == 0);
    }

    @Override // androidx.preference.PreferenceFragmentCompat.OnPreferenceStartFragmentCallback
    public boolean mUb(PreferenceFragmentCompat caller, Preference pref) {
        Intrinsics.checkNotNullParameter(caller, "caller");
        Intrinsics.checkNotNullParameter(pref, "pref");
        if (caller.getId() == R.id.f40653t) {
            E2(pref);
            return true;
        }
        int id = caller.getId();
        int i2 = R.id.rl;
        if (id != i2) {
            return false;
        }
        FragmentFactory fragmentFactoryHV = getChildFragmentManager().HV();
        ClassLoader classLoader = requireContext().getClassLoader();
        String strAz = pref.az();
        Intrinsics.checkNotNull(strAz);
        Fragment fragmentN = fragmentFactoryHV.n(classLoader, strAz);
        Intrinsics.checkNotNullExpressionValue(fragmentN, "childFragmentManager.fra….fragment!!\n            )");
        fragmentN.setArguments(pref.gh());
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
        FragmentTransaction fragmentTransactionO = childFragmentManager.o();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionO, "beginTransaction()");
        fragmentTransactionO.nY(true);
        fragmentTransactionO.o(i2, fragmentN);
        fragmentTransactionO.g(4099);
        fragmentTransactionO.KN(null);
        fragmentTransactionO.mUb();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parentFragmentManager");
        FragmentTransaction fragmentTransactionO = parentFragmentManager.o();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionO, "beginTransaction()");
        fragmentTransactionO.ViF(this);
        fragmentTransactionO.mUb();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        SlidingPaneLayout slidingPaneLayoutViF = ViF(inflater);
        FragmentManager childFragmentManager = getChildFragmentManager();
        int i2 = R.id.f40653t;
        if (childFragmentManager.xg(i2) == null) {
            PreferenceFragmentCompat preferenceFragmentCompatTe = te();
            FragmentManager childFragmentManager2 = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "childFragmentManager");
            FragmentTransaction fragmentTransactionO = childFragmentManager2.o();
            Intrinsics.checkNotNullExpressionValue(fragmentTransactionO, "beginTransaction()");
            fragmentTransactionO.nY(true);
            fragmentTransactionO.rl(i2, preferenceFragmentCompatTe);
            fragmentTransactionO.mUb();
        }
        slidingPaneLayoutViF.setLockMode(3);
        return slidingPaneLayoutViF;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        OnBackPressedDispatcher onBackPressedDispatcher;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.onBackPressedCallback = new InnerOnBackPressedCallback(this);
        SlidingPaneLayout slidingPaneLayoutNY = nY();
        if (!ViewCompat.P5(slidingPaneLayoutNY) || slidingPaneLayoutNY.isLayoutRequested()) {
            slidingPaneLayoutNY.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: androidx.preference.PreferenceHeaderFragmentCompat$onViewCreated$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    boolean z2;
                    view2.removeOnLayoutChangeListener(this);
                    OnBackPressedCallback onBackPressedCallback = this.f40636n.onBackPressedCallback;
                    Intrinsics.checkNotNull(onBackPressedCallback);
                    if (this.f40636n.nY().ty() && this.f40636n.nY().az()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    onBackPressedCallback.az(z2);
                }
            });
        } else {
            OnBackPressedCallback onBackPressedCallback = this.onBackPressedCallback;
            Intrinsics.checkNotNull(onBackPressedCallback);
            onBackPressedCallback.az(nY().ty() && nY().az());
        }
        getChildFragmentManager().ty(new FragmentManager.OnBackStackChangedListener() { // from class: androidx.preference.n
            @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
            public final void O() {
                PreferenceHeaderFragmentCompat.iF(this.f40709n);
            }
        });
        OnBackPressedDispatcherOwner onBackPressedDispatcherOwnerN = C1511ViewTreeOnBackPressedDispatcherOwner.n(view);
        if (onBackPressedDispatcherOwnerN == null || (onBackPressedDispatcher = onBackPressedDispatcherOwnerN.getOnBackPressedDispatcher()) == null) {
            return;
        }
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        OnBackPressedCallback onBackPressedCallback2 = this.onBackPressedCallback;
        Intrinsics.checkNotNull(onBackPressedCallback2);
        onBackPressedDispatcher.xMQ(viewLifecycleOwner, onBackPressedCallback2);
    }

    private final void E2(Preference header) {
        Fragment fragmentN;
        if (header.az() == null) {
            fD(header.ck());
            return;
        }
        String strAz = header.az();
        if (strAz == null) {
            fragmentN = null;
        } else {
            fragmentN = getChildFragmentManager().HV().n(requireContext().getClassLoader(), strAz);
        }
        if (fragmentN != null) {
            fragmentN.setArguments(header.gh());
        }
        if (getChildFragmentManager().Jk() > 0) {
            FragmentManager.BackStackEntry backStackEntryN1 = getChildFragmentManager().n1(0);
            Intrinsics.checkNotNullExpressionValue(backStackEntryN1, "childFragmentManager.getBackStackEntryAt(0)");
            getChildFragmentManager().JVN(backStackEntryN1.getId(), 1);
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
        FragmentTransaction fragmentTransactionO = childFragmentManager.o();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionO, "beginTransaction()");
        fragmentTransactionO.nY(true);
        int i2 = R.id.rl;
        Intrinsics.checkNotNull(fragmentN);
        fragmentTransactionO.o(i2, fragmentN);
        if (nY().az()) {
            fragmentTransactionO.g(4099);
        }
        nY().Ik();
        fragmentTransactionO.mUb();
    }

    public Fragment g() {
        Fragment fragmentXg = getChildFragmentManager().xg(R.id.f40653t);
        if (fragmentXg != null) {
            PreferenceFragmentCompat preferenceFragmentCompat = (PreferenceFragmentCompat) fragmentXg;
            Fragment fragmentN = null;
            if (preferenceFragmentCompat.g().tUK() <= 0) {
                return null;
            }
            int iTUK = preferenceFragmentCompat.g().tUK();
            int i2 = 0;
            while (true) {
                if (i2 >= iTUK) {
                    break;
                }
                int i3 = i2 + 1;
                Preference preferenceHow = preferenceFragmentCompat.g().How(i2);
                Intrinsics.checkNotNullExpressionValue(preferenceHow, "headerFragment.preferenc…reen.getPreference(index)");
                if (preferenceHow.az() == null) {
                    i2 = i3;
                } else {
                    String strAz = preferenceHow.az();
                    if (strAz != null) {
                        fragmentN = getChildFragmentManager().HV().n(requireContext().getClassLoader(), strAz);
                    }
                    if (fragmentN == null) {
                        return fragmentN;
                    }
                    fragmentN.setArguments(preferenceHow.gh());
                }
            }
            return fragmentN;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.preference.PreferenceFragmentCompat");
    }

    public final SlidingPaneLayout nY() {
        return (SlidingPaneLayout) requireView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle savedInstanceState) {
        Fragment fragmentG;
        super.onViewStateRestored(savedInstanceState);
        if (savedInstanceState != null || (fragmentG = g()) == null) {
            return;
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
        FragmentTransaction fragmentTransactionO = childFragmentManager.o();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionO, "beginTransaction()");
        fragmentTransactionO.nY(true);
        fragmentTransactionO.o(R.id.rl, fragmentG);
        fragmentTransactionO.mUb();
    }
}
