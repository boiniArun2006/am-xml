package androidx.preference;

import android.app.DialogFragment;
import android.app.Fragment;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.res.TypedArrayUtils;
import androidx.preference.DialogPreference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Deprecated
public abstract class PreferenceFragment extends Fragment implements PreferenceManager.OnPreferenceTreeClickListener, PreferenceManager.OnDisplayPreferenceDialogListener, PreferenceManager.OnNavigateToScreenListener, DialogPreference.TargetFragment {
    private final Runnable E2;
    private boolean J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    RecyclerView f40585O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private Runnable f40586S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private int f40587Z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Handler f40588g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final DividerDecoration f40589n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Context f40590o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f40591r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private PreferenceManager f40592t;

    /* JADX INFO: renamed from: androidx.preference.PreferenceFragment$1, reason: invalid class name */
    class AnonymousClass1 extends Handler {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ PreferenceFragment f40593n;

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            this.f40593n.n();
        }
    }

    /* JADX INFO: renamed from: androidx.preference.PreferenceFragment$2, reason: invalid class name */
    class AnonymousClass2 implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ PreferenceFragment f40594n;

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
            RecyclerView recyclerView = this.f40594n.f40585O;
            recyclerView.focusableViewAvailable(recyclerView);
        }
    }

    /* JADX INFO: renamed from: androidx.preference.PreferenceFragment$3, reason: invalid class name */
    class AnonymousClass3 implements Runnable {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ PreferenceFragment f40595O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Preference f40596n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f40597t;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            RecyclerView.Adapter adapter = this.f40595O.f40585O.getAdapter();
            if (!(adapter instanceof PreferenceGroup.PreferencePositionCallback)) {
                if (adapter != 0) {
                    throw new IllegalStateException("Adapter must implement PreferencePositionCallback");
                }
                return;
            }
            Preference preference = this.f40596n;
            int iT = preference != null ? ((PreferenceGroup.PreferencePositionCallback) adapter).t(preference) : ((PreferenceGroup.PreferencePositionCallback) adapter).mUb(this.f40597t);
            if (iT != -1) {
                this.f40595O.f40585O.scrollToPosition(iT);
            } else {
                adapter.registerAdapterDataObserver(new ScrollToPreferenceObserver(adapter, this.f40595O.f40585O, this.f40596n, this.f40597t));
            }
        }
    }

    private class DividerDecoration extends RecyclerView.ItemDecoration {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Drawable f40598n;
        final /* synthetic */ PreferenceFragment nr;
        private int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f40599t;

        public void az(Drawable drawable) {
            if (drawable != null) {
                this.rl = drawable.getIntrinsicHeight();
            } else {
                this.rl = 0;
            }
            this.f40598n = drawable;
            this.nr.f40585O.invalidateItemDecorations();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void gh(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
            if (this.f40598n == null) {
                return;
            }
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = recyclerView.getChildAt(i2);
                if (HI(childAt, recyclerView)) {
                    int y2 = ((int) childAt.getY()) + childAt.getHeight();
                    this.f40598n.setBounds(0, y2, width, this.rl + y2);
                    this.f40598n.draw(canvas);
                }
            }
        }

        public void qie(boolean z2) {
            this.f40599t = z2;
        }

        public void ty(int i2) {
            this.rl = i2;
            this.nr.f40585O.invalidateItemDecorations();
        }

        private boolean HI(View view, RecyclerView recyclerView) {
            RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(view);
            if (!(childViewHolder instanceof PreferenceViewHolder) || !((PreferenceViewHolder) childViewHolder).J2()) {
                return false;
            }
            boolean z2 = this.f40599t;
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
        boolean n(PreferenceFragment preferenceFragment, Preference preference);
    }

    public interface OnPreferenceStartFragmentCallback {
        boolean n(PreferenceFragment preferenceFragment, Preference preference);
    }

    public interface OnPreferenceStartScreenCallback {
        boolean n(PreferenceFragment preferenceFragment, PreferenceScreen preferenceScreen);
    }

    private static class ScrollToPreferenceObserver extends RecyclerView.AdapterDataObserver {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final RecyclerView.Adapter f40600n;
        private final String nr;
        private final RecyclerView rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Preference f40601t;

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i2, int i3) {
            n();
        }

        private void n() {
            this.f40600n.unregisterAdapterDataObserver(this);
            Preference preference = this.f40601t;
            int iT = preference != null ? ((PreferenceGroup.PreferencePositionCallback) this.f40600n).t(preference) : ((PreferenceGroup.PreferencePositionCallback) this.f40600n).mUb(this.nr);
            if (iT != -1) {
                this.rl.scrollToPosition(iT);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i2, int i3, Object obj) {
            n();
        }

        ScrollToPreferenceObserver(RecyclerView.Adapter adapter, RecyclerView recyclerView, Preference preference, String str) {
            this.f40600n = adapter;
            this.rl = recyclerView;
            this.f40601t = preference;
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

    protected void O() {
    }

    public abstract void mUb(Bundle bundle, String str);

    public Fragment rl() {
        return null;
    }

    protected void ty() {
    }

    public void HI(Drawable drawable) {
        this.f40589n.az(drawable);
    }

    @Override // androidx.preference.DialogPreference.TargetFragment
    public Preference KN(CharSequence charSequence) {
        PreferenceManager preferenceManager = this.f40592t;
        if (preferenceManager == null) {
            return null;
        }
        return preferenceManager.n(charSequence);
    }

    protected RecyclerView.Adapter Uo(PreferenceScreen preferenceScreen) {
        return new PreferenceGroupAdapter(preferenceScreen);
    }

    public void ck(int i2) {
        this.f40589n.ty(i2);
    }

    public RecyclerView gh(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        if (this.f40590o.getPackageManager().hasSystemFeature("android.hardware.type.automotive") && (recyclerView = (RecyclerView) viewGroup.findViewById(R.id.f40651O)) != null) {
            return recyclerView;
        }
        RecyclerView recyclerView2 = (RecyclerView) layoutInflater.inflate(R.layout.nr, viewGroup, false);
        recyclerView2.setLayoutManager(xMQ());
        recyclerView2.setAccessibilityDelegateCompat(new PreferenceRecyclerViewAccessibilityDelegate(recyclerView2));
        return recyclerView2;
    }

    public PreferenceScreen nr() {
        return this.f40592t.xMQ();
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = this.f40590o;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, R.styleable.fcU, TypedArrayUtils.n(context, R.attr.Uo, android.R.attr.preferenceFragmentStyle), 0);
        this.f40587Z = typedArrayObtainStyledAttributes.getResourceId(R.styleable.eWT, this.f40587Z);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R.styleable.ul);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.n1, -1);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.Jk, true);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(this.f40590o);
        View viewInflate = layoutInflaterCloneInContext.inflate(this.f40587Z, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(android.R.id.list_container);
        if (!(viewFindViewById instanceof ViewGroup)) {
            throw new RuntimeException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        }
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById;
        RecyclerView recyclerViewGh = gh(layoutInflaterCloneInContext, viewGroup2, bundle);
        if (recyclerViewGh == null) {
            throw new RuntimeException("Could not create RecyclerView");
        }
        this.f40585O = recyclerViewGh;
        recyclerViewGh.addItemDecoration(this.f40589n);
        HI(drawable);
        if (dimensionPixelSize != -1) {
            ck(dimensionPixelSize);
        }
        this.f40589n.qie(z2);
        if (this.f40585O.getParent() == null) {
            viewGroup2.addView(this.f40585O);
        }
        this.f40588g.post(this.E2);
        return viewInflate;
    }

    @Override // android.app.Fragment
    public void onDestroyView() {
        this.f40588g.removeCallbacks(this.E2);
        this.f40588g.removeMessages(1);
        if (this.J2) {
            Ik();
        }
        this.f40585O = null;
        super.onDestroyView();
    }

    public final RecyclerView t() {
        return this.f40585O;
    }

    public RecyclerView.LayoutManager xMQ() {
        return new LinearLayoutManager(getActivity());
    }

    private void Ik() {
        PreferenceScreen preferenceScreenNr = nr();
        if (preferenceScreenNr != null) {
            preferenceScreenNr.p5();
        }
        ty();
    }

    @Override // androidx.preference.PreferenceManager.OnNavigateToScreenListener
    public void J2(PreferenceScreen preferenceScreen) {
        boolean zN;
        if (rl() instanceof OnPreferenceStartScreenCallback) {
            zN = ((OnPreferenceStartScreenCallback) rl()).n(this, preferenceScreen);
        } else {
            zN = false;
        }
        if (!zN && (getActivity() instanceof OnPreferenceStartScreenCallback)) {
            ((OnPreferenceStartScreenCallback) getActivity()).n(this, preferenceScreen);
        }
    }

    @Override // androidx.preference.PreferenceManager.OnPreferenceTreeClickListener
    public boolean az(Preference preference) {
        boolean zN = false;
        if (preference.az() != null) {
            if (rl() instanceof OnPreferenceStartFragmentCallback) {
                zN = ((OnPreferenceStartFragmentCallback) rl()).n(this, preference);
            }
            if (!zN && (getActivity() instanceof OnPreferenceStartFragmentCallback)) {
                return ((OnPreferenceStartFragmentCallback) getActivity()).n(this, preference);
            }
        }
        return zN;
    }

    void n() {
        PreferenceScreen preferenceScreenNr = nr();
        if (preferenceScreenNr != null) {
            t().setAdapter(Uo(preferenceScreenNr));
            preferenceScreenNr.bzg();
        }
        O();
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        TypedValue typedValue = new TypedValue();
        getActivity().getTheme().resolveAttribute(R.attr.mUb, typedValue, true);
        int i2 = typedValue.resourceId;
        if (i2 == 0) {
            i2 = R.style.f40660n;
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getActivity(), i2);
        this.f40590o = contextThemeWrapper;
        PreferenceManager preferenceManager = new PreferenceManager(contextThemeWrapper);
        this.f40592t = preferenceManager;
        preferenceManager.ty(this);
        if (getArguments() != null) {
            string = getArguments().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT");
        } else {
            string = null;
        }
        mUb(bundle, string);
    }

    @Override // android.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        PreferenceScreen preferenceScreenNr = nr();
        if (preferenceScreenNr != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreenNr.m(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.f40592t.HI(this);
        this.f40592t.az(this);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.f40592t.HI(null);
        this.f40592t.az(null);
    }

    @Override // android.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Bundle bundle2;
        PreferenceScreen preferenceScreenNr;
        super.onViewCreated(view, bundle);
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (preferenceScreenNr = nr()) != null) {
            preferenceScreenNr.ijL(bundle2);
        }
        if (this.J2) {
            n();
            Runnable runnable = this.f40586S;
            if (runnable != null) {
                runnable.run();
                this.f40586S = null;
            }
        }
        this.f40591r = true;
    }

    @Override // androidx.preference.PreferenceManager.OnDisplayPreferenceDialogListener
    public void qie(Preference preference) {
        boolean zN;
        DialogFragment dialogFragmentXMQ;
        if (rl() instanceof OnPreferenceDisplayDialogCallback) {
            zN = ((OnPreferenceDisplayDialogCallback) rl()).n(this, preference);
        } else {
            zN = false;
        }
        if (!zN && (getActivity() instanceof OnPreferenceDisplayDialogCallback)) {
            zN = ((OnPreferenceDisplayDialogCallback) getActivity()).n(this, preference);
        }
        if (zN || getFragmentManager().findFragmentByTag("androidx.preference.PreferenceFragment.DIALOG") != null) {
            return;
        }
        if (preference instanceof EditTextPreference) {
            dialogFragmentXMQ = EditTextPreferenceDialogFragment.xMQ(preference.Ik());
        } else if (preference instanceof ListPreference) {
            dialogFragmentXMQ = ListPreferenceDialogFragment.xMQ(preference.Ik());
        } else if (preference instanceof MultiSelectListPreference) {
            dialogFragmentXMQ = MultiSelectListPreferenceDialogFragment.xMQ(preference.Ik());
        } else {
            throw new IllegalArgumentException("Tried to display dialog for unknown preference type. Did you forget to override onDisplayPreferenceDialog()?");
        }
        dialogFragmentXMQ.setTargetFragment(this, 0);
        dialogFragmentXMQ.show(getFragmentManager(), "androidx.preference.PreferenceFragment.DIALOG");
    }
}
