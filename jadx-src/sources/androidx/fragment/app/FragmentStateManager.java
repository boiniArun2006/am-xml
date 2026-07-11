package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.ViewCompat;
import androidx.fragment.R;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.SpecialEffectsController;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.view.Lifecycle;
import androidx.view.ViewModelStoreOwner;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
class FragmentStateManager {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final FragmentLifecycleCallbacksDispatcher f38623n;
    private final FragmentStore rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Fragment f38624t;
    private boolean nr = false;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f38622O = -1;

    FragmentStateManager(FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher, FragmentStore fragmentStore, Fragment fragment) {
        this.f38623n = fragmentLifecycleCallbacksDispatcher;
        this.rl = fragmentStore;
        this.f38624t = fragment;
    }

    void KN() {
        View view;
        if (FragmentManager.F(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f38624t);
        }
        Fragment fragment = this.f38624t;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        this.f38624t.performDestroyView();
        this.f38623n.ty(this.f38624t, false);
        Fragment fragment2 = this.f38624t;
        fragment2.mContainer = null;
        fragment2.mView = null;
        fragment2.mViewLifecycleOwner = null;
        fragment2.mViewLifecycleOwnerLiveData.ck(null);
        this.f38624t.mInLayout = false;
    }

    void O() {
        if (FragmentManager.F(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f38624t);
        }
        Bundle bundle = this.f38624t.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        Fragment fragment = this.f38624t;
        if (fragment.mIsCreated) {
            fragment.mState = 1;
            fragment.restoreChildFragmentState();
        } else {
            this.f38623n.KN(fragment, bundle2, false);
            this.f38624t.performCreate(bundle2);
            this.f38623n.t(this.f38624t, bundle2, false);
        }
    }

    void S() {
        if (FragmentManager.F(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f38624t);
        }
        this.f38624t.performStop();
        this.f38623n.qie(this.f38624t, false);
    }

    void Uo() {
        Fragment fragmentJ2;
        if (FragmentManager.F(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f38624t);
        }
        Fragment fragment = this.f38624t;
        boolean zIsChangingConfigurations = true;
        boolean z2 = fragment.mRemoving && !fragment.isInBackStack();
        if (z2) {
            Fragment fragment2 = this.f38624t;
            if (!fragment2.mBeingSaved) {
                this.rl.te(fragment2.mWho, null);
            }
        }
        if (!z2 && !this.rl.ck().ty(this.f38624t)) {
            String str = this.f38624t.mTargetWho;
            if (str != null && (fragmentJ2 = this.rl.J2(str)) != null && fragmentJ2.mRetainInstance) {
                this.f38624t.mTarget = fragmentJ2;
            }
            this.f38624t.mState = 0;
            return;
        }
        FragmentHostCallback<?> fragmentHostCallback = this.f38624t.mHost;
        if (fragmentHostCallback instanceof ViewModelStoreOwner) {
            zIsChangingConfigurations = this.rl.ck().gh();
        } else if (fragmentHostCallback.getContext() instanceof Activity) {
            zIsChangingConfigurations = true ^ ((Activity) fragmentHostCallback.getContext()).isChangingConfigurations();
        }
        if ((z2 && !this.f38624t.mBeingSaved) || zIsChangingConfigurations) {
            this.rl.ck().t(this.f38624t, false);
        }
        this.f38624t.performDestroy();
        this.f38623n.nr(this.f38624t, false);
        for (FragmentStateManager fragmentStateManager : this.rl.gh()) {
            if (fragmentStateManager != null) {
                Fragment fragmentGh = fragmentStateManager.gh();
                if (this.f38624t.mWho.equals(fragmentGh.mTargetWho)) {
                    fragmentGh.mTarget = this.f38624t;
                    fragmentGh.mTargetWho = null;
                }
            }
        }
        Fragment fragment3 = this.f38624t;
        String str2 = fragment3.mTargetWho;
        if (str2 != null) {
            fragment3.mTarget = this.rl.J2(str2);
        }
        this.rl.o(this);
    }

    void XQ() {
        if (FragmentManager.F(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f38624t);
        }
        this.f38624t.performStart();
        this.f38623n.gh(this.f38624t, false);
    }

    void ck() {
        if (FragmentManager.F(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f38624t);
        }
        View focusedView = this.f38624t.getFocusedView();
        if (focusedView != null && qie(focusedView)) {
            boolean zRequestFocus = focusedView.requestFocus();
            if (FragmentManager.F(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("requestFocus: Restoring focused view ");
                sb.append(focusedView);
                sb.append(" ");
                sb.append(zRequestFocus ? "succeeded" : "failed");
                sb.append(" on Fragment ");
                sb.append(this.f38624t);
                sb.append(" resulting in focused view ");
                sb.append(this.f38624t.mView.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        this.f38624t.setFocusedView(null);
        this.f38624t.performResume();
        this.f38623n.xMQ(this.f38624t, false);
        this.rl.te(this.f38624t.mWho, null);
        Fragment fragment = this.f38624t;
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    void n() {
        if (FragmentManager.F(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f38624t);
        }
        Bundle bundle = this.f38624t.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        this.f38624t.performActivityCreated(bundle2);
        this.f38623n.n(this.f38624t, bundle2, false);
    }

    void t() {
        if (FragmentManager.F(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f38624t);
        }
        Fragment fragment = this.f38624t;
        Fragment fragment2 = fragment.mTarget;
        FragmentStateManager fragmentStateManagerTy = null;
        if (fragment2 != null) {
            FragmentStateManager fragmentStateManagerTy2 = this.rl.ty(fragment2.mWho);
            if (fragmentStateManagerTy2 == null) {
                throw new IllegalStateException("Fragment " + this.f38624t + " declared target fragment " + this.f38624t.mTarget + " that does not belong to this FragmentManager!");
            }
            Fragment fragment3 = this.f38624t;
            fragment3.mTargetWho = fragment3.mTarget.mWho;
            fragment3.mTarget = null;
            fragmentStateManagerTy = fragmentStateManagerTy2;
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (fragmentStateManagerTy = this.rl.ty(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f38624t + " declared target fragment " + this.f38624t.mTargetWho + " that does not belong to this FragmentManager!");
            }
        }
        if (fragmentStateManagerTy != null) {
            fragmentStateManagerTy.az();
        }
        Fragment fragment4 = this.f38624t;
        fragment4.mHost = fragment4.mFragmentManager.EWS();
        Fragment fragment5 = this.f38624t;
        fragment5.mParentFragment = fragment5.mFragmentManager.i();
        this.f38623n.Uo(this.f38624t, false);
        this.f38624t.performAttach();
        this.f38623n.rl(this.f38624t, false);
    }

    void ty() {
        if (FragmentManager.F(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f38624t);
        }
        this.f38624t.performPause();
        this.f38623n.J2(this.f38624t, false);
    }

    void xMQ() {
        if (FragmentManager.F(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f38624t);
        }
        this.f38624t.performDetach();
        this.f38623n.O(this.f38624t, false);
        Fragment fragment = this.f38624t;
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if ((!fragment.mRemoving || fragment.isInBackStack()) && !this.rl.ck().ty(this.f38624t)) {
            return;
        }
        if (FragmentManager.F(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + this.f38624t);
        }
        this.f38624t.initState();
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentStateManager$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f38627n;

        static {
            int[] iArr = new int[Lifecycle.State.values().length];
            f38627n = iArr;
            try {
                iArr[Lifecycle.State.f38884r.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38627n[Lifecycle.State.J2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38627n[Lifecycle.State.f38880O.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f38627n[Lifecycle.State.f38885t.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private boolean qie(View view) {
        if (view == this.f38624t.mView) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f38624t.mView) {
                return true;
            }
        }
        return false;
    }

    void HI(ClassLoader classLoader) {
        Bundle bundle = this.f38624t.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (this.f38624t.mSavedFragmentState.getBundle("savedInstanceState") == null) {
            this.f38624t.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
        }
        try {
            Fragment fragment = this.f38624t;
            fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("viewState");
            Fragment fragment2 = this.f38624t;
            fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle("viewRegistryState");
            FragmentState fragmentState = (FragmentState) this.f38624t.mSavedFragmentState.getParcelable("state");
            if (fragmentState != null) {
                Fragment fragment3 = this.f38624t;
                fragment3.mTargetWho = fragmentState.f38612T;
                fragment3.mTargetRequestCode = fragmentState.f38609N;
                Boolean bool = fragment3.mSavedUserVisibleHint;
                if (bool != null) {
                    fragment3.mUserVisibleHint = bool.booleanValue();
                    this.f38624t.mSavedUserVisibleHint = null;
                } else {
                    fragment3.mUserVisibleHint = fragmentState.f38621v;
                }
            }
            Fragment fragment4 = this.f38624t;
            if (fragment4.mUserVisibleHint) {
                return;
            }
            fragment4.mDeferStart = true;
        } catch (BadParcelableException e2) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + gh(), e2);
        }
    }

    Fragment.SavedState Ik() {
        if (this.f38624t.mState > -1) {
            return new Fragment.SavedState(r());
        }
        return null;
    }

    void J2() {
        String resourceName;
        if (this.f38624t.mFromLayout) {
            return;
        }
        if (FragmentManager.F(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f38624t);
        }
        Bundle bundle = this.f38624t.mSavedFragmentState;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterPerformGetLayoutInflater = this.f38624t.performGetLayoutInflater(bundle2);
        Fragment fragment = this.f38624t;
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i2 = fragment.mContainerId;
            if (i2 != 0) {
                if (i2 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f38624t + " for a container view with no id");
                }
                viewGroup = (ViewGroup) fragment.mFragmentManager.qm().t(this.f38624t.mContainerId);
                if (viewGroup == null) {
                    Fragment fragment2 = this.f38624t;
                    if (!fragment2.mRestored && !fragment2.mInDynamicContainer) {
                        try {
                            resourceName = fragment2.getResources().getResourceName(this.f38624t.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f38624t.mContainerId) + " (" + resourceName + ") for fragment " + this.f38624t);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    FragmentStrictMode.ck(this.f38624t, viewGroup);
                }
            }
        }
        Fragment fragment3 = this.f38624t;
        fragment3.mContainer = viewGroup;
        fragment3.performCreateView(layoutInflaterPerformGetLayoutInflater, viewGroup, bundle2);
        if (this.f38624t.mView != null) {
            if (FragmentManager.F(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + this.f38624t);
            }
            this.f38624t.mView.setSaveFromParentEnabled(false);
            Fragment fragment4 = this.f38624t;
            fragment4.mView.setTag(R.id.f38462n, fragment4);
            if (viewGroup != null) {
                rl();
            }
            Fragment fragment5 = this.f38624t;
            if (fragment5.mHidden) {
                fragment5.mView.setVisibility(8);
            }
            if (this.f38624t.mView.isAttachedToWindow()) {
                ViewCompat.piY(this.f38624t.mView);
            } else {
                final View view = this.f38624t.mView;
                view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.fragment.app.FragmentStateManager.1
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(View view2) {
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(View view2) {
                        view.removeOnAttachStateChangeListener(this);
                        ViewCompat.piY(view);
                    }
                });
            }
            this.f38624t.performViewCreated();
            FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher = this.f38623n;
            Fragment fragment6 = this.f38624t;
            fragmentLifecycleCallbacksDispatcher.az(fragment6, fragment6.mView, bundle2, false);
            int visibility = this.f38624t.mView.getVisibility();
            this.f38624t.setPostOnViewCreatedAlpha(this.f38624t.mView.getAlpha());
            Fragment fragment7 = this.f38624t;
            if (fragment7.mContainer != null && visibility == 0) {
                View viewFindFocus = fragment7.mView.findFocus();
                if (viewFindFocus != null) {
                    this.f38624t.setFocusedView(viewFindFocus);
                    if (FragmentManager.F(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + this.f38624t);
                    }
                }
                this.f38624t.mView.setAlpha(0.0f);
            }
        }
        this.f38624t.mState = 2;
    }

    void Z(int i2) {
        this.f38622O = i2;
    }

    void az() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.nr) {
            if (FragmentManager.F(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + gh());
                return;
            }
            return;
        }
        try {
            this.nr = true;
            boolean z2 = false;
            while (true) {
                int iNr = nr();
                Fragment fragment = this.f38624t;
                int i2 = fragment.mState;
                if (iNr == i2) {
                    if (!z2 && i2 == -1 && fragment.mRemoving && !fragment.isInBackStack() && !this.f38624t.mBeingSaved) {
                        if (FragmentManager.F(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + this.f38624t);
                        }
                        this.rl.ck().t(this.f38624t, true);
                        this.rl.o(this);
                        if (FragmentManager.F(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + this.f38624t);
                        }
                        this.f38624t.initState();
                    }
                    Fragment fragment2 = this.f38624t;
                    if (fragment2.mHiddenChanged) {
                        if (fragment2.mView != null && (viewGroup = fragment2.mContainer) != null) {
                            SpecialEffectsController specialEffectsControllerXQ = SpecialEffectsController.XQ(viewGroup, fragment2.getParentFragmentManager());
                            if (this.f38624t.mHidden) {
                                specialEffectsControllerXQ.gh(this);
                            } else {
                                specialEffectsControllerXQ.az(this);
                            }
                        }
                        Fragment fragment3 = this.f38624t;
                        FragmentManager fragmentManager = fragment3.mFragmentManager;
                        if (fragmentManager != null) {
                            fragmentManager.RQ(fragment3);
                        }
                        Fragment fragment4 = this.f38624t;
                        fragment4.mHiddenChanged = false;
                        fragment4.onHiddenChanged(fragment4.mHidden);
                        this.f38624t.mChildFragmentManager.Xw();
                    }
                    this.nr = false;
                    return;
                }
                if (iNr <= i2) {
                    switch (i2 - 1) {
                        case -1:
                            xMQ();
                            break;
                        case 0:
                            if (fragment.mBeingSaved && this.rl.Ik(fragment.mWho) == null) {
                                this.rl.te(this.f38624t.mWho, r());
                            }
                            Uo();
                            break;
                        case 1:
                            KN();
                            this.f38624t.mState = 1;
                            break;
                        case 2:
                            fragment.mInLayout = false;
                            fragment.mState = 2;
                            break;
                        case 3:
                            if (FragmentManager.F(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f38624t);
                            }
                            Fragment fragment5 = this.f38624t;
                            if (fragment5.mBeingSaved) {
                                this.rl.te(fragment5.mWho, r());
                            } else if (fragment5.mView != null && fragment5.mSavedViewState == null) {
                                o();
                            }
                            Fragment fragment6 = this.f38624t;
                            if (fragment6.mView != null && (viewGroup2 = fragment6.mContainer) != null) {
                                SpecialEffectsController.XQ(viewGroup2, fragment6.getParentFragmentManager()).qie(this);
                            }
                            this.f38624t.mState = 3;
                            break;
                        case 4:
                            S();
                            break;
                        case 5:
                            fragment.mState = 5;
                            break;
                        case 6:
                            ty();
                            break;
                    }
                } else {
                    switch (i2 + 1) {
                        case 0:
                            t();
                            break;
                        case 1:
                            O();
                            break;
                        case 2:
                            mUb();
                            J2();
                            break;
                        case 3:
                            n();
                            break;
                        case 4:
                            if (fragment.mView != null && (viewGroup3 = fragment.mContainer) != null) {
                                SpecialEffectsController.XQ(viewGroup3, fragment.getParentFragmentManager()).mUb(SpecialEffectsController.Operation.State.t(this.f38624t.mView.getVisibility()), this);
                            }
                            this.f38624t.mState = 4;
                            break;
                        case 5:
                            XQ();
                            break;
                        case 6:
                            fragment.mState = 6;
                            break;
                        case 7:
                            ck();
                            break;
                    }
                }
                z2 = true;
            }
        } catch (Throwable th) {
            this.nr = false;
            throw th;
        }
    }

    Fragment gh() {
        return this.f38624t;
    }

    void mUb() {
        Fragment fragment = this.f38624t;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (FragmentManager.F(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f38624t);
            }
            Bundle bundle = this.f38624t.mSavedFragmentState;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            Fragment fragment2 = this.f38624t;
            fragment2.performCreateView(fragment2.performGetLayoutInflater(bundle2), null, bundle2);
            View view = this.f38624t.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f38624t;
                fragment3.mView.setTag(R.id.f38462n, fragment3);
                Fragment fragment4 = this.f38624t;
                if (fragment4.mHidden) {
                    fragment4.mView.setVisibility(8);
                }
                this.f38624t.performViewCreated();
                FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher = this.f38623n;
                Fragment fragment5 = this.f38624t;
                fragmentLifecycleCallbacksDispatcher.az(fragment5, fragment5.mView, bundle2, false);
                this.f38624t.mState = 2;
            }
        }
    }

    int nr() {
        Fragment fragment = this.f38624t;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int iMin = this.f38622O;
        int i2 = AnonymousClass2.f38627n[fragment.mMaxState.ordinal()];
        if (i2 != 1) {
            iMin = i2 != 2 ? i2 != 3 ? i2 != 4 ? Math.min(iMin, -1) : Math.min(iMin, 0) : Math.min(iMin, 1) : Math.min(iMin, 5);
        }
        Fragment fragment2 = this.f38624t;
        if (fragment2.mFromLayout) {
            if (fragment2.mInLayout) {
                iMin = Math.max(this.f38622O, 2);
                View view = this.f38624t.mView;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f38622O < 4 ? Math.min(iMin, fragment2.mState) : Math.min(iMin, 1);
            }
        }
        Fragment fragment3 = this.f38624t;
        if (fragment3.mInDynamicContainer && fragment3.mContainer == null) {
            iMin = Math.min(iMin, 4);
        }
        if (!this.f38624t.mAdded) {
            iMin = Math.min(iMin, 1);
        }
        Fragment fragment4 = this.f38624t;
        ViewGroup viewGroup = fragment4.mContainer;
        SpecialEffectsController.Operation.LifecycleImpact lifecycleImpactO = viewGroup != null ? SpecialEffectsController.XQ(viewGroup, fragment4.getParentFragmentManager()).o(this) : null;
        if (lifecycleImpactO == SpecialEffectsController.Operation.LifecycleImpact.ADDING) {
            iMin = Math.min(iMin, 6);
        } else if (lifecycleImpactO == SpecialEffectsController.Operation.LifecycleImpact.REMOVING) {
            iMin = Math.max(iMin, 3);
        } else {
            Fragment fragment5 = this.f38624t;
            if (fragment5.mRemoving) {
                iMin = fragment5.isInBackStack() ? Math.min(iMin, 1) : Math.min(iMin, -1);
            }
        }
        Fragment fragment6 = this.f38624t;
        if (fragment6.mDeferStart && fragment6.mState < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (this.f38624t.mTransitioning) {
            iMin = Math.max(iMin, 3);
        }
        if (FragmentManager.F(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + this.f38624t);
        }
        return iMin;
    }

    void o() {
        if (this.f38624t.mView == null) {
            return;
        }
        if (FragmentManager.F(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + this.f38624t + " with view " + this.f38624t.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f38624t.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f38624t.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f38624t.mViewLifecycleOwner.O(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f38624t.mSavedViewRegistryState = bundle;
    }

    Bundle r() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        Fragment fragment = this.f38624t;
        if (fragment.mState == -1 && (bundle = fragment.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new FragmentState(this.f38624t));
        if (this.f38624t.mState > 0) {
            Bundle bundle3 = new Bundle();
            this.f38624t.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f38623n.mUb(this.f38624t, bundle3, false);
            Bundle bundle4 = new Bundle();
            this.f38624t.mSavedStateRegistryController.O(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle bundleTh = this.f38624t.mChildFragmentManager.Th();
            if (!bundleTh.isEmpty()) {
                bundle2.putBundle("childFragmentManager", bundleTh);
            }
            if (this.f38624t.mView != null) {
                o();
            }
            SparseArray<Parcelable> sparseArray = this.f38624t.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = this.f38624t.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = this.f38624t.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    void rl() {
        Fragment fragmentMx = FragmentManager.Mx(this.f38624t.mContainer);
        Fragment parentFragment = this.f38624t.getParentFragment();
        if (fragmentMx != null && !fragmentMx.equals(parentFragment)) {
            Fragment fragment = this.f38624t;
            FragmentStrictMode.Ik(fragment, fragmentMx, fragment.mContainerId);
        }
        int iMUb = this.rl.mUb(this.f38624t);
        Fragment fragment2 = this.f38624t;
        fragment2.mContainer.addView(fragment2.mView, iMUb);
    }

    FragmentStateManager(FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher, FragmentStore fragmentStore, ClassLoader classLoader, FragmentFactory fragmentFactory, Bundle bundle) {
        this.f38623n = fragmentLifecycleCallbacksDispatcher;
        this.rl = fragmentStore;
        Fragment fragmentN = ((FragmentState) bundle.getParcelable("state")).n(fragmentFactory, classLoader);
        this.f38624t = fragmentN;
        fragmentN.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        fragmentN.setArguments(bundle2);
        if (FragmentManager.F(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + fragmentN);
        }
    }

    FragmentStateManager(FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher, FragmentStore fragmentStore, Fragment fragment, Bundle bundle) {
        this.f38623n = fragmentLifecycleCallbacksDispatcher;
        this.rl = fragmentStore;
        this.f38624t = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        fragment.mSavedFragmentState = bundle;
        fragment.mArguments = bundle.getBundle("arguments");
    }
}
