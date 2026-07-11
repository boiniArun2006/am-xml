package androidx.appcompat.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.ShowableListMenu;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.core.view.ActionProvider;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.safedk.android.utils.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@RestrictTo
public class ActivityChooserView extends ViewGroup implements ActivityChooserModel.ActivityChooserModelClient {
    private final int E2;
    private final Drawable J2;
    private int M7;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final ViewTreeObserver.OnGlobalLayoutListener f14013N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final View f14014O;
    private boolean P5;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    final FrameLayout f14015S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    final DataSetObserver f14016T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    int f14017U;
    PopupWindow.OnDismissListener Xw;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ActionProvider f14018e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ImageView f14019g;
    boolean jB;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final ActivityChooserViewAdapter f14020n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ImageView f14021o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final FrameLayout f14022r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Callbacks f14023t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private ListPopupWindow f14024v;

    private class ActivityChooserViewAdapter extends BaseAdapter {
        private boolean J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private boolean f14029O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private ActivityChooserModel f14030n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private boolean f14032r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f14033t = 4;

        @Override // android.widget.Adapter
        public long getItemId(int i2) {
            return i2;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return 3;
        }

        ActivityChooserViewAdapter() {
        }

        public int J2() {
            int i2 = this.f14033t;
            this.f14033t = Integer.MAX_VALUE;
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            int count = getCount();
            int iMax = 0;
            View view = null;
            for (int i3 = 0; i3 < count; i3++) {
                view = getView(i3, view, null);
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                iMax = Math.max(iMax, view.getMeasuredWidth());
            }
            this.f14033t = i2;
            return iMax;
        }

        public void KN(int i2) {
            if (this.f14033t != i2) {
                this.f14033t = i2;
                notifyDataSetChanged();
            }
        }

        public boolean O() {
            return this.f14029O;
        }

        public void Uo(ActivityChooserModel activityChooserModel) {
            ActivityChooserModel activityChooserModelRl = ActivityChooserView.this.f14020n.rl();
            if (activityChooserModelRl != null && ActivityChooserView.this.isShown()) {
                activityChooserModelRl.unregisterObserver(ActivityChooserView.this.f14016T);
            }
            this.f14030n = activityChooserModel;
            if (activityChooserModel != null && ActivityChooserView.this.isShown()) {
                activityChooserModel.registerObserver(ActivityChooserView.this.f14016T);
            }
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int iJ2 = this.f14030n.J2();
            if (!this.f14029O && this.f14030n.KN() != null) {
                iJ2--;
            }
            int iMin = Math.min(iJ2, this.f14033t);
            return this.f14032r ? iMin + 1 : iMin;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i2) {
            return (this.f14032r && i2 == getCount() - 1) ? 1 : 0;
        }

        public void mUb(boolean z2) {
            if (this.f14032r != z2) {
                this.f14032r = z2;
                notifyDataSetChanged();
            }
        }

        public int n() {
            return this.f14030n.J2();
        }

        public int nr() {
            return this.f14030n.xMQ();
        }

        public ActivityChooserModel rl() {
            return this.f14030n;
        }

        public ResolveInfo t() {
            return this.f14030n.KN();
        }

        public void xMQ(boolean z2, boolean z3) {
            if (this.f14029O == z2 && this.J2 == z3) {
                return;
            }
            this.f14029O = z2;
            this.J2 = z3;
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i2) {
            int itemViewType = getItemViewType(i2);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    return null;
                }
                throw new IllegalArgumentException();
            }
            if (!this.f14029O && this.f14030n.KN() != null) {
                i2++;
            }
            return this.f14030n.O(i2);
        }

        @Override // android.widget.Adapter
        public View getView(int i2, View view, ViewGroup viewGroup) {
            int itemViewType = getItemViewType(i2);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    if (view != null && view.getId() == 1) {
                        return view;
                    }
                    View viewInflate = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(R.layout.J2, viewGroup, false);
                    viewInflate.setId(1);
                    ((TextView) viewInflate.findViewById(R.id.nHg)).setText(ActivityChooserView.this.getContext().getString(R.string.rl));
                    return viewInflate;
                }
                throw new IllegalArgumentException();
            }
            if (view == null || view.getId() != R.id.aYN) {
                view = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(R.layout.J2, viewGroup, false);
            }
            PackageManager packageManager = ActivityChooserView.this.getContext().getPackageManager();
            ImageView imageView = (ImageView) view.findViewById(R.id.f13468S);
            ResolveInfo resolveInfo = (ResolveInfo) getItem(i2);
            imageView.setImageDrawable(resolveInfo.loadIcon(packageManager));
            ((TextView) view.findViewById(R.id.nHg)).setText(resolveInfo.loadLabel(packageManager));
            if (this.f14029O && i2 == 0 && this.J2) {
                view.setActivated(true);
                return view;
            }
            view.setActivated(false);
            return view;
        }
    }

    private class Callbacks implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {
        public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
            Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
            if (p1 == null) {
                return;
            }
            p0.startActivity(p1);
        }

        Callbacks() {
        }

        private void n() {
            PopupWindow.OnDismissListener onDismissListener = ActivityChooserView.this.Xw;
            if (onDismissListener != null) {
                onDismissListener.onDismiss();
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view != activityChooserView.f14015S) {
                if (view != activityChooserView.f14022r) {
                    throw new IllegalArgumentException();
                }
                activityChooserView.jB = false;
                activityChooserView.nr(activityChooserView.f14017U);
                return;
            }
            activityChooserView.n();
            Intent intentRl = ActivityChooserView.this.f14020n.rl().rl(ActivityChooserView.this.f14020n.rl().Uo(ActivityChooserView.this.f14020n.t()));
            if (intentRl != null) {
                intentRl.addFlags(524288);
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(ActivityChooserView.this.getContext(), intentRl);
            }
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view != activityChooserView.f14015S) {
                throw new IllegalArgumentException();
            }
            if (activityChooserView.f14020n.getCount() > 0) {
                ActivityChooserView activityChooserView2 = ActivityChooserView.this;
                activityChooserView2.jB = true;
                activityChooserView2.nr(activityChooserView2.f14017U);
            }
            return true;
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            n();
            ActionProvider actionProvider = ActivityChooserView.this.f14018e;
            if (actionProvider != null) {
                actionProvider.gh(false);
            }
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
            int itemViewType = ((ActivityChooserViewAdapter) adapterView.getAdapter()).getItemViewType(i2);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    ActivityChooserView.this.nr(Integer.MAX_VALUE);
                    return;
                }
                throw new IllegalArgumentException();
            }
            ActivityChooserView.this.n();
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (activityChooserView.jB) {
                if (i2 > 0) {
                    activityChooserView.f14020n.rl().HI(i2);
                    return;
                }
                return;
            }
            if (!activityChooserView.f14020n.O()) {
                i2++;
            }
            Intent intentRl = ActivityChooserView.this.f14020n.rl().rl(i2);
            if (intentRl != null) {
                intentRl.addFlags(524288);
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(ActivityChooserView.this.getContext(), intentRl);
            }
        }
    }

    public ActivityChooserView(Context context) {
        this(context, null);
    }

    @RestrictTo
    public static class InnerLayout extends LinearLayout {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final int[] f14035n = {android.R.attr.background};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TintTypedArray tintTypedArrayXQ = TintTypedArray.XQ(context, attributeSet, f14035n);
            setBackgroundDrawable(tintTypedArrayXQ.Uo(0));
            tintTypedArrayXQ.aYN();
        }
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    void O() {
        if (this.f14020n.getCount() > 0) {
            this.f14022r.setEnabled(true);
        } else {
            this.f14022r.setEnabled(false);
        }
        int iN = this.f14020n.n();
        int iNr = this.f14020n.nr();
        if (iN == 1 || (iN > 1 && iNr > 0)) {
            this.f14015S.setVisibility(0);
            ResolveInfo resolveInfoT = this.f14020n.t();
            PackageManager packageManager = getContext().getPackageManager();
            this.f14019g.setImageDrawable(resolveInfoT.loadIcon(packageManager));
            if (this.M7 != 0) {
                this.f14015S.setContentDescription(getContext().getString(this.M7, resolveInfoT.loadLabel(packageManager)));
            }
        } else {
            this.f14015S.setVisibility(8);
        }
        if (this.f14015S.getVisibility() == 0) {
            this.f14014O.setBackgroundDrawable(this.J2);
        } else {
            this.f14014O.setBackgroundDrawable(null);
        }
    }

    @RestrictTo
    public ActivityChooserModel getDataModel() {
        return this.f14020n.rl();
    }

    ListPopupWindow getListPopupWindow() {
        if (this.f14024v == null) {
            ListPopupWindow listPopupWindow = new ListPopupWindow(getContext());
            this.f14024v = listPopupWindow;
            listPopupWindow.qie(this.f14020n);
            this.f14024v.iF(this);
            this.f14024v.N(true);
            this.f14024v.s7N(this.f14023t);
            this.f14024v.nHg(this.f14023t);
        }
        return this.f14024v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean, int] */
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
    void nr(int i2) {
        if (this.f14020n.rl() == null) {
            throw new IllegalStateException("No data model. Did you call #setDataModel?");
        }
        getViewTreeObserver().addOnGlobalLayoutListener(this.f14013N);
        ?? r02 = this.f14015S.getVisibility() == 0 ? 1 : 0;
        int iN = this.f14020n.n();
        if (i2 == Integer.MAX_VALUE || iN <= i2 + r02) {
            this.f14020n.mUb(false);
            this.f14020n.KN(i2);
        } else {
            this.f14020n.mUb(true);
            this.f14020n.KN(i2 - 1);
        }
        ListPopupWindow listPopupWindow = getListPopupWindow();
        if (listPopupWindow.n()) {
            return;
        }
        if (this.jB || r02 == 0) {
            this.f14020n.xMQ(true, r02);
        } else {
            this.f14020n.xMQ(false, false);
        }
        listPopupWindow.E2(Math.min(this.f14020n.J2(), this.E2));
        listPopupWindow.show();
        ActionProvider actionProvider = this.f14018e;
        if (actionProvider != null) {
            actionProvider.gh(true);
        }
        listPopupWindow.ty().setContentDescription(getContext().getString(R.string.f13487t));
        listPopupWindow.ty().setSelector(new ColorDrawable(0));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i5, int i7) {
        this.f14014O.layout(0, 0, i5 - i2, i7 - i3);
        if (rl()) {
            return;
        }
        n();
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        View view = this.f14014O;
        if (this.f14015S.getVisibility() != 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824);
        }
        measureChild(view, i2, i3);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    @RestrictTo
    public void setActivityChooserModel(ActivityChooserModel activityChooserModel) {
        this.f14020n.Uo(activityChooserModel);
        if (rl()) {
            n();
            t();
        }
    }

    public void setDefaultActionButtonContentDescription(int i2) {
        this.M7 = i2;
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.f14021o.setImageDrawable(drawable);
    }

    public void setInitialActivityCount(int i2) {
        this.f14017U = i2;
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.Xw = onDismissListener;
    }

    @RestrictTo
    public void setProvider(ActionProvider actionProvider) {
        this.f14018e = actionProvider;
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f14016T = new DataSetObserver() { // from class: androidx.appcompat.widget.ActivityChooserView.1
            @Override // android.database.DataSetObserver
            public void onChanged() {
                super.onChanged();
                ActivityChooserView.this.f14020n.notifyDataSetChanged();
            }

            @Override // android.database.DataSetObserver
            public void onInvalidated() {
                super.onInvalidated();
                ActivityChooserView.this.f14020n.notifyDataSetInvalidated();
            }
        };
        this.f14013N = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.appcompat.widget.ActivityChooserView.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (ActivityChooserView.this.rl()) {
                    if (!ActivityChooserView.this.isShown()) {
                        ActivityChooserView.this.getListPopupWindow().dismiss();
                        return;
                    }
                    ActivityChooserView.this.getListPopupWindow().show();
                    ActionProvider actionProvider = ActivityChooserView.this.f14018e;
                    if (actionProvider != null) {
                        actionProvider.gh(true);
                    }
                }
            }
        };
        this.f14017U = 4;
        int[] iArr = R.styleable.E2;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        ViewCompat.ijL(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i2, 0);
        this.f14017U = typedArrayObtainStyledAttributes.getInt(R.styleable.f13514X, 4);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R.styleable.f13521e);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(R.layout.f13479O, (ViewGroup) this, true);
        Callbacks callbacks = new Callbacks();
        this.f14023t = callbacks;
        View viewFindViewById = findViewById(R.id.mUb);
        this.f14014O = viewFindViewById;
        this.J2 = viewFindViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.f13476r);
        this.f14015S = frameLayout;
        frameLayout.setOnClickListener(callbacks);
        frameLayout.setOnLongClickListener(callbacks);
        int i3 = R.id.WPU;
        this.f14019g = (ImageView) frameLayout.findViewById(i3);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(R.id.f13471Z);
        frameLayout2.setOnClickListener(callbacks);
        frameLayout2.setAccessibilityDelegate(new View.AccessibilityDelegate() { // from class: androidx.appcompat.widget.ActivityChooserView.3
            @Override // android.view.View.AccessibilityDelegate
            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                AccessibilityNodeInfoCompat.Zmq(accessibilityNodeInfo).eTf(true);
            }
        });
        frameLayout2.setOnTouchListener(new ForwardingListener(frameLayout2) { // from class: androidx.appcompat.widget.ActivityChooserView.4
            @Override // androidx.appcompat.widget.ForwardingListener
            protected boolean nr() {
                ActivityChooserView.this.n();
                return true;
            }

            @Override // androidx.appcompat.widget.ForwardingListener
            public ShowableListMenu rl() {
                return ActivityChooserView.this.getListPopupWindow();
            }

            @Override // androidx.appcompat.widget.ForwardingListener
            protected boolean t() {
                ActivityChooserView.this.t();
                return true;
            }
        });
        this.f14022r = frameLayout2;
        ImageView imageView = (ImageView) frameLayout2.findViewById(i3);
        this.f14021o = imageView;
        imageView.setImageDrawable(drawable);
        ActivityChooserViewAdapter activityChooserViewAdapter = new ActivityChooserViewAdapter();
        this.f14020n = activityChooserViewAdapter;
        activityChooserViewAdapter.registerDataSetObserver(new DataSetObserver() { // from class: androidx.appcompat.widget.ActivityChooserView.5
            @Override // android.database.DataSetObserver
            public void onChanged() {
                super.onChanged();
                ActivityChooserView.this.O();
            }
        });
        Resources resources = context.getResources();
        this.E2 = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.nr));
    }

    public boolean n() {
        if (rl()) {
            getListPopupWindow().dismiss();
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this.f14013N);
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ActivityChooserModel activityChooserModelRl = this.f14020n.rl();
        if (activityChooserModelRl != null) {
            activityChooserModelRl.registerObserver(this.f14016T);
        }
        this.P5 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActivityChooserModel activityChooserModelRl = this.f14020n.rl();
        if (activityChooserModelRl != null) {
            activityChooserModelRl.unregisterObserver(this.f14016T);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f14013N);
        }
        if (rl()) {
            n();
        }
        this.P5 = false;
    }

    public boolean rl() {
        return getListPopupWindow().n();
    }

    public void setExpandActivityOverflowButtonContentDescription(int i2) {
        this.f14021o.setContentDescription(getContext().getString(i2));
    }

    public boolean t() {
        if (rl() || !this.P5) {
            return false;
        }
        this.jB = false;
        nr(this.f14017U);
        return true;
    }
}
