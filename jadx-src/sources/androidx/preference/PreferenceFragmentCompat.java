package androidx.preference;

import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.preference.DialogPreference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class PreferenceFragmentCompat extends Fragment implements PreferenceManager.OnPreferenceTreeClickListener, PreferenceManager.OnDisplayPreferenceDialogListener, PreferenceManager.OnNavigateToScreenListener, DialogPreference.TargetFragment {
    private boolean J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    RecyclerView f40602O;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private Runnable f40604Z;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f40608r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private PreferenceManager f40609t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final DividerDecoration f40606n = new DividerDecoration();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f40607o = R.layout.f40656t;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final Handler f40603S = new Handler(Looper.getMainLooper()) { // from class: androidx.preference.PreferenceFragmentCompat.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            PreferenceFragmentCompat.this.aYN();
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Runnable f40605g = new Runnable() { // from class: androidx.preference.PreferenceFragmentCompat.2
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = PreferenceFragmentCompat.this.f40602O;
            recyclerView.focusableViewAvailable(recyclerView);
        }
    };

    /* JADX INFO: renamed from: androidx.preference.PreferenceFragmentCompat$3, reason: invalid class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
    class AnonymousClass3 implements Runnable {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ PreferenceFragmentCompat f40612O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Preference f40613n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f40614t;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            RecyclerView.Adapter adapter = this.f40612O.f40602O.getAdapter();
            if (!(adapter instanceof PreferenceGroup.PreferencePositionCallback)) {
                if (adapter != 0) {
                    throw new IllegalStateException("Adapter must implement PreferencePositionCallback");
                }
                return;
            }
            Preference preference = this.f40613n;
            int iT = preference != null ? ((PreferenceGroup.PreferencePositionCallback) adapter).t(preference) : ((PreferenceGroup.PreferencePositionCallback) adapter).mUb(this.f40614t);
            if (iT != -1) {
                this.f40612O.f40602O.scrollToPosition(iT);
            } else {
                adapter.registerAdapterDataObserver(new ScrollToPreferenceObserver(adapter, this.f40612O.f40602O, this.f40613n, this.f40614t));
            }
        }
    }

    private class DividerDecoration extends RecyclerView.ItemDecoration {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Drawable f40615n;
        private int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f40616t = true;

        DividerDecoration() {
        }

        public void az(Drawable drawable) {
            if (drawable != null) {
                this.rl = drawable.getIntrinsicHeight();
            } else {
                this.rl = 0;
            }
            this.f40615n = drawable;
            PreferenceFragmentCompat.this.f40602O.invalidateItemDecorations();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void gh(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
            if (this.f40615n == null) {
                return;
            }
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = recyclerView.getChildAt(i2);
                if (HI(childAt, recyclerView)) {
                    int y2 = ((int) childAt.getY()) + childAt.getHeight();
                    this.f40615n.setBounds(0, y2, width, this.rl + y2);
                    this.f40615n.draw(canvas);
                }
            }
        }

        public void qie(boolean z2) {
            this.f40616t = z2;
        }

        public void ty(int i2) {
            this.rl = i2;
            PreferenceFragmentCompat.this.f40602O.invalidateItemDecorations();
        }

        private boolean HI(View view, RecyclerView recyclerView) {
            RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(view);
            if (!(childViewHolder instanceof PreferenceViewHolder) || !((PreferenceViewHolder) childViewHolder).J2()) {
                return false;
            }
            boolean z2 = this.f40616t;
            int iIndexOfChild = recyclerView.indexOfChild(view);
            if (iIndexOfChild < recyclerView.getChildCount() - 1) {
                RecyclerView.ViewHolder childViewHolder2 = recyclerView.getChildViewHolder(recyclerView.getChildAt(iIndexOfChild + 1));
                if (!(childViewHolder2 instanceof PreferenceViewHolder) || !((PreferenceViewHolder) childViewHolder2).O()) {
                    return false;
                }
                return true;
            }
            return z2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void Uo(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            if (HI(view, recyclerView)) {
                rect.bottom = this.rl;
            }
        }
    }

    public interface OnPreferenceDisplayDialogCallback {
        boolean n(PreferenceFragmentCompat preferenceFragmentCompat, Preference preference);
    }

    public interface OnPreferenceStartFragmentCallback {
        boolean mUb(PreferenceFragmentCompat preferenceFragmentCompat, Preference preference);
    }

    public interface OnPreferenceStartScreenCallback {
        boolean n(PreferenceFragmentCompat preferenceFragmentCompat, PreferenceScreen preferenceScreen);
    }

    private static class ScrollToPreferenceObserver extends RecyclerView.AdapterDataObserver {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final RecyclerView.Adapter f40617n;
        private final String nr;
        private final RecyclerView rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Preference f40618t;

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i2, int i3) {
            n();
        }

        private void n() {
            this.f40617n.unregisterAdapterDataObserver(this);
            Preference preference = this.f40618t;
            int iT = preference != null ? ((PreferenceGroup.PreferencePositionCallback) this.f40617n).t(preference) : ((PreferenceGroup.PreferencePositionCallback) this.f40617n).mUb(this.nr);
            if (iT != -1) {
                this.rl.scrollToPosition(iT);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i2, int i3, Object obj) {
            n();
        }

        ScrollToPreferenceObserver(RecyclerView.Adapter adapter, RecyclerView recyclerView, Preference preference, String str) {
            this.f40617n = adapter;
            this.rl = recyclerView;
            this.f40618t = preference;
            this.nr = str;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            n();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i2, int i3) {
            n();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i2, int i3, int i5) {
            n();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i2, int i3) {
            n();
        }
    }

    public abstract void E2(Bundle bundle, String str);

    public Fragment ViF() {
        return null;
    }

    protected void X() {
    }

    protected void te() {
    }

    private void N() {
        if (this.f40609t == null) {
            throw new RuntimeException("This should be called after super.onCreate.");
        }
    }

    private void T() {
        if (this.f40603S.hasMessages(1)) {
            return;
        }
        this.f40603S.obtainMessage(1).sendToTarget();
    }

    @Override // androidx.preference.DialogPreference.TargetFragment
    public Preference KN(CharSequence charSequence) {
        PreferenceManager preferenceManager = this.f40609t;
        if (preferenceManager == null) {
            return null;
        }
        return preferenceManager.n(charSequence);
    }

    public RecyclerView.LayoutManager fD() {
        return new LinearLayoutManager(requireContext());
    }

    public PreferenceScreen g() {
        return this.f40609t.xMQ();
    }

    protected RecyclerView.Adapter iF(PreferenceScreen preferenceScreen) {
        return new PreferenceGroupAdapter(preferenceScreen);
    }

    public void nHg(Drawable drawable) {
        this.f40606n.az(drawable);
    }

    public final RecyclerView nY() {
        return this.f40602O;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f40603S.removeCallbacks(this.f40605g);
        this.f40603S.removeMessages(1);
        if (this.J2) {
            v();
        }
        this.f40602O = null;
        super.onDestroyView();
    }

    public void s7N(int i2) {
        this.f40606n.ty(i2);
    }

    public void wTp(PreferenceScreen preferenceScreen) {
        if (!this.f40609t.ck(preferenceScreen) || preferenceScreen == null) {
            return;
        }
        X();
        this.J2 = true;
        if (this.f40608r) {
            T();
        }
    }

    private void v() {
        nY().setAdapter(null);
        PreferenceScreen preferenceScreenG = g();
        if (preferenceScreenG != null) {
            preferenceScreenG.p5();
        }
        X();
    }

    @Override // androidx.preference.PreferenceManager.OnNavigateToScreenListener
    public void J2(PreferenceScreen preferenceScreen) {
        boolean zN;
        if (ViF() instanceof OnPreferenceStartScreenCallback) {
            zN = ((OnPreferenceStartScreenCallback) ViF()).n(this, preferenceScreen);
        } else {
            zN = false;
        }
        for (Fragment parentFragment = this; !zN && parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof OnPreferenceStartScreenCallback) {
                zN = ((OnPreferenceStartScreenCallback) parentFragment).n(this, preferenceScreen);
            }
        }
        if (!zN && (getContext() instanceof OnPreferenceStartScreenCallback)) {
            zN = ((OnPreferenceStartScreenCallback) getContext()).n(this, preferenceScreen);
        }
        if (!zN && (getActivity() instanceof OnPreferenceStartScreenCallback)) {
            ((OnPreferenceStartScreenCallback) getActivity()).n(this, preferenceScreen);
        }
    }

    public void WPU(int i2) {
        N();
        wTp(this.f40609t.gh(requireContext(), i2, g()));
    }

    void aYN() {
        PreferenceScreen preferenceScreenG = g();
        if (preferenceScreenG != null) {
            nY().setAdapter(iF(preferenceScreenG));
            preferenceScreenG.bzg();
        }
        te();
    }

    @Override // androidx.preference.PreferenceManager.OnPreferenceTreeClickListener
    public boolean az(Preference preference) {
        boolean zMUb;
        if (preference.az() == null) {
            return false;
        }
        if (ViF() instanceof OnPreferenceStartFragmentCallback) {
            zMUb = ((OnPreferenceStartFragmentCallback) ViF()).mUb(this, preference);
        } else {
            zMUb = false;
        }
        for (Fragment parentFragment = this; !zMUb && parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof OnPreferenceStartFragmentCallback) {
                zMUb = ((OnPreferenceStartFragmentCallback) parentFragment).mUb(this, preference);
            }
        }
        if (!zMUb && (getContext() instanceof OnPreferenceStartFragmentCallback)) {
            zMUb = ((OnPreferenceStartFragmentCallback) getContext()).mUb(this, preference);
        }
        if (!zMUb && (getActivity() instanceof OnPreferenceStartFragmentCallback)) {
            zMUb = ((OnPreferenceStartFragmentCallback) getActivity()).mUb(this, preference);
        }
        if (!zMUb) {
            Log.w("PreferenceFragment", "onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
            FragmentManager parentFragmentManager = getParentFragmentManager();
            Bundle bundleGh = preference.gh();
            Fragment fragmentN = parentFragmentManager.HV().n(requireActivity().getClassLoader(), preference.az());
            fragmentN.setArguments(bundleGh);
            fragmentN.setTargetFragment(this, 0);
            parentFragmentManager.o().o(((View) requireView().getParent()).getId(), fragmentN).KN(null).mUb();
            return true;
        }
        return true;
    }

    public RecyclerView e(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        if (requireContext().getPackageManager().hasSystemFeature("android.hardware.type.automotive") && (recyclerView = (RecyclerView) viewGroup.findViewById(R.id.f40651O)) != null) {
            return recyclerView;
        }
        RecyclerView recyclerView2 = (RecyclerView) layoutInflater.inflate(R.layout.nr, viewGroup, false);
        recyclerView2.setLayoutManager(fD());
        recyclerView2.setAccessibilityDelegateCompat(new PreferenceRecyclerViewAccessibilityDelegate(recyclerView2));
        return recyclerView2;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        TypedValue typedValue = new TypedValue();
        requireContext().getTheme().resolveAttribute(R.attr.mUb, typedValue, true);
        int i2 = typedValue.resourceId;
        if (i2 == 0) {
            i2 = R.style.f40660n;
        }
        requireContext().getTheme().applyStyle(i2, false);
        PreferenceManager preferenceManager = new PreferenceManager(requireContext());
        this.f40609t = preferenceManager;
        preferenceManager.ty(this);
        if (getArguments() != null) {
            string = getArguments().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT");
        } else {
            string = null;
        }
        E2(bundle, string);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TypedArray typedArrayObtainStyledAttributes = requireContext().obtainStyledAttributes(null, R.styleable.Rl, R.attr.J2, 0);
        this.f40607o = typedArrayObtainStyledAttributes.getResourceId(R.styleable.qm, this.f40607o);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R.styleable.mYa);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Org, -1);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HV, true);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(requireContext());
        View viewInflate = layoutInflaterCloneInContext.inflate(this.f40607o, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(android.R.id.list_container);
        if (viewFindViewById instanceof ViewGroup) {
            ViewGroup viewGroup2 = (ViewGroup) viewFindViewById;
            RecyclerView recyclerViewE = e(layoutInflaterCloneInContext, viewGroup2, bundle);
            if (recyclerViewE != null) {
                this.f40602O = recyclerViewE;
                recyclerViewE.addItemDecoration(this.f40606n);
                nHg(drawable);
                if (dimensionPixelSize != -1) {
                    s7N(dimensionPixelSize);
                }
                this.f40606n.qie(z2);
                if (this.f40602O.getParent() == null) {
                    viewGroup2.addView(this.f40602O);
                }
                this.f40603S.post(this.f40605g);
                return viewInflate;
            }
            throw new RuntimeException("Could not create RecyclerView");
        }
        throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        PreferenceScreen preferenceScreenG = g();
        if (preferenceScreenG != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreenG.m(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.f40609t.HI(this);
        this.f40609t.az(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.f40609t.HI(null);
        this.f40609t.az(null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Bundle bundle2;
        PreferenceScreen preferenceScreenG;
        super.onViewCreated(view, bundle);
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (preferenceScreenG = g()) != null) {
            preferenceScreenG.ijL(bundle2);
        }
        if (this.J2) {
            aYN();
            Runnable runnable = this.f40604Z;
            if (runnable != null) {
                runnable.run();
                this.f40604Z = null;
            }
        }
        this.f40608r = true;
    }

    @Override // androidx.preference.PreferenceManager.OnDisplayPreferenceDialogListener
    public void qie(Preference preference) {
        boolean zN;
        DialogFragment dialogFragmentT;
        if (ViF() instanceof OnPreferenceDisplayDialogCallback) {
            zN = ((OnPreferenceDisplayDialogCallback) ViF()).n(this, preference);
        } else {
            zN = false;
        }
        for (Fragment parentFragment = this; !zN && parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof OnPreferenceDisplayDialogCallback) {
                zN = ((OnPreferenceDisplayDialogCallback) parentFragment).n(this, preference);
            }
        }
        if (!zN && (getContext() instanceof OnPreferenceDisplayDialogCallback)) {
            zN = ((OnPreferenceDisplayDialogCallback) getContext()).n(this, preference);
        }
        if (!zN && (getActivity() instanceof OnPreferenceDisplayDialogCallback)) {
            zN = ((OnPreferenceDisplayDialogCallback) getActivity()).n(this, preference);
        }
        if (zN || getParentFragmentManager().pJg("androidx.preference.PreferenceFragment.DIALOG") != null) {
            return;
        }
        if (preference instanceof EditTextPreference) {
            dialogFragmentT = EditTextPreferenceDialogFragmentCompat.N(preference.Ik());
        } else if (preference instanceof ListPreference) {
            dialogFragmentT = ListPreferenceDialogFragmentCompat.T(preference.Ik());
        } else if (preference instanceof MultiSelectListPreference) {
            dialogFragmentT = MultiSelectListPreferenceDialogFragmentCompat.T(preference.Ik());
        } else {
            throw new IllegalArgumentException("Cannot display dialog for an unknown Preference type: " + preference.getClass().getSimpleName() + ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
        }
        dialogFragmentT.setTargetFragment(this, 0);
        dialogFragmentT.show(getParentFragmentManager(), "androidx.preference.PreferenceFragment.DIALOG");
    }
}
