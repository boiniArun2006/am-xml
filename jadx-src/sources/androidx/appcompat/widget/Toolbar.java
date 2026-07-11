package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.ColorInt;
import androidx.annotation.DoNotInline;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.R;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.CollapsibleActionView;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.GravityCompat;
import androidx.core.view.MenuHost;
import androidx.core.view.MenuHostHelper;
import androidx.core.view.MenuProvider;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class Toolbar extends ViewGroup implements MenuHost {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private CharSequence f14387B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    MenuBuilder.Callback f14388C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private ColorStateList f14389D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f14390E;
    View E2;

    /* JADX INFO: renamed from: FX, reason: collision with root package name */
    private int f14391FX;

    /* JADX INFO: renamed from: G7, reason: collision with root package name */
    private OnBackInvokedCallback f14392G7;

    /* JADX INFO: renamed from: GR, reason: collision with root package name */
    private boolean f14393GR;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f14394I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private CharSequence f14395J;
    private ImageButton J2;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private int f14396M;
    private int M7;
    private boolean Mx;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private int f14397N;
    private final ArrayList Nxk;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private TextView f14398O;
    private int P5;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private CharSequence f14399S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private int f14400T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private int f14401U;
    int Xw;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ColorStateList f14402a;
    private final int[] dR0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Context f14403e;
    private RtlSpacingHelper eF;
    private ToolbarWidgetWrapper eTf;
    private boolean eWT;
    private OnBackInvokedDispatcher fcU;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ImageButton f14404g;
    OnMenuItemClickListener ijL;
    private int jB;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ArrayList f14405k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ActionMenuView.OnMenuItemClickListener f14406m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    ActionMenuView f14407n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Drawable f14408o;
    private MenuPresenter.Callback ofS;
    private int p5;
    private ExpandedActionViewMenuPresenter pJg;
    private ArrayList piY;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ImageView f14409r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private TextView f14410t;
    private final Runnable ul;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f14411v;
    private ActionMenuPresenter xg;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    final MenuHostHelper f14412z;

    @RequiresApi
    static class Api33Impl {
        @DoNotInline
        static void nr(@NonNull Object obj, @NonNull Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }

        @DoNotInline
        static void t(@NonNull Object obj, @NonNull Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        @Nullable
        @DoNotInline
        static OnBackInvokedDispatcher n(@NonNull View view) {
            return view.findOnBackInvokedDispatcher();
        }

        @NonNull
        @DoNotInline
        static OnBackInvokedCallback rl(@NonNull final Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new OnBackInvokedCallback() { // from class: androidx.appcompat.widget.r
                public final void onBackInvoked() {
                    runnable.run();
                }
            };
        }
    }

    private class ExpandedActionViewMenuPresenter implements MenuPresenter {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        MenuBuilder f14418n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        MenuItemImpl f14419t;

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public boolean J2(SubMenuBuilder subMenuBuilder) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public void O(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public Parcelable Uo() {
            return null;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public int getId() {
            return 0;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public void rl(MenuBuilder menuBuilder, boolean z2) {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public boolean xMQ() {
            return false;
        }

        ExpandedActionViewMenuPresenter() {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public void KN(boolean z2) {
            if (this.f14419t != null) {
                MenuBuilder menuBuilder = this.f14418n;
                if (menuBuilder != null) {
                    int size = menuBuilder.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        if (this.f14418n.getItem(i2) == this.f14419t) {
                            return;
                        }
                    }
                }
                mUb(this.f14418n, this.f14419t);
            }
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public void gh(Context context, MenuBuilder menuBuilder) {
            MenuItemImpl menuItemImpl;
            MenuBuilder menuBuilder2 = this.f14418n;
            if (menuBuilder2 != null && (menuItemImpl = this.f14419t) != null) {
                menuBuilder2.J2(menuItemImpl);
            }
            this.f14418n = menuBuilder;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public boolean mUb(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
            KeyEvent.Callback callback = Toolbar.this.E2;
            if (callback instanceof CollapsibleActionView) {
                ((CollapsibleActionView) callback).J2();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.E2);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f14404g);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.E2 = null;
            toolbar3.rl();
            this.f14419t = null;
            Toolbar.this.requestLayout();
            menuItemImpl.r(false);
            Toolbar.this.P5();
            return true;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public boolean t(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
            Toolbar.this.KN();
            ViewParent parent = Toolbar.this.f14404g.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f14404g);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f14404g);
            }
            Toolbar.this.E2 = menuItemImpl.getActionView();
            this.f14419t = menuItemImpl;
            ViewParent parent2 = Toolbar.this.E2.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.E2);
                }
                LayoutParams layoutParamsGenerateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                layoutParamsGenerateDefaultLayoutParams.f13541n = (toolbar4.Xw & 112) | 8388611;
                layoutParamsGenerateDefaultLayoutParams.rl = 2;
                toolbar4.E2.setLayoutParams(layoutParamsGenerateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.E2);
            }
            Toolbar.this.nHg();
            Toolbar.this.requestLayout();
            menuItemImpl.r(true);
            KeyEvent.Callback callback = Toolbar.this.E2;
            if (callback instanceof CollapsibleActionView) {
                ((CollapsibleActionView) callback).rl();
            }
            Toolbar.this.P5();
            return true;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    @RequiresApi
    @RestrictTo
    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion {
        private int HI;
        private int Ik;
        private int J2;
        private int KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private int f14420O;
        private int Uo;
        private int XQ;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        private int f14421Z;
        private int az;
        private int ck;
        private int gh;
        private int mUb;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f14422n;
        private int nr;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f14423o;
        private int qie;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f14424r;
        private int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f14425t;
        private int ty;
        private int xMQ;

        public void mapProperties(PropertyMapper propertyMapper) {
            this.rl = propertyMapper.mapObject("collapseContentDescription", R.attr.E2);
            this.f14425t = propertyMapper.mapObject("collapseIcon", R.attr.f13434e);
            this.nr = propertyMapper.mapInt("contentInsetEnd", R.attr.rV9);
            this.f14420O = propertyMapper.mapInt("contentInsetEndWithActions", R.attr.bzg);
            this.J2 = propertyMapper.mapInt("contentInsetLeft", R.attr.Xw);
            this.Uo = propertyMapper.mapInt("contentInsetRight", R.attr.jB);
            this.KN = propertyMapper.mapInt("contentInsetStart", R.attr.f13429U);
            this.xMQ = propertyMapper.mapInt("contentInsetStartWithNavigation", R.attr.P5);
            this.mUb = propertyMapper.mapObject("logo", R.attr.f13420GR);
            this.gh = propertyMapper.mapObject("logoDescription", R.attr.Nxk);
            this.qie = propertyMapper.mapObject("menu", R.attr.f13437k);
            this.az = propertyMapper.mapObject("navigationContentDescription", R.attr.dR0);
            this.ty = propertyMapper.mapObject("navigationIcon", R.attr.f13444z);
            this.HI = propertyMapper.mapResourceId("popupTheme", R.attr.ijL);
            this.ck = propertyMapper.mapObject("subtitle", R.attr.fcU);
            this.Ik = propertyMapper.mapObject("title", R.attr.GD);
            this.f14424r = propertyMapper.mapInt("titleMarginBottom", R.attr.Po6);
            this.f14423o = propertyMapper.mapInt("titleMarginEnd", R.attr.EWS);
            this.f14421Z = propertyMapper.mapInt("titleMarginStart", R.attr.hRu);
            this.XQ = propertyMapper.mapInt("titleMarginTop", R.attr.UhV);
            this.f14422n = true;
        }

        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void readProperties(Toolbar toolbar, PropertyReader propertyReader) {
            if (!this.f14422n) {
                throw w6.n();
            }
            propertyReader.readObject(this.rl, toolbar.getCollapseContentDescription());
            propertyReader.readObject(this.f14425t, toolbar.getCollapseIcon());
            propertyReader.readInt(this.nr, toolbar.getContentInsetEnd());
            propertyReader.readInt(this.f14420O, toolbar.getContentInsetEndWithActions());
            propertyReader.readInt(this.J2, toolbar.getContentInsetLeft());
            propertyReader.readInt(this.Uo, toolbar.getContentInsetRight());
            propertyReader.readInt(this.KN, toolbar.getContentInsetStart());
            propertyReader.readInt(this.xMQ, toolbar.getContentInsetStartWithNavigation());
            propertyReader.readObject(this.mUb, toolbar.getLogo());
            propertyReader.readObject(this.gh, toolbar.getLogoDescription());
            propertyReader.readObject(this.qie, toolbar.getMenu());
            propertyReader.readObject(this.az, toolbar.getNavigationContentDescription());
            propertyReader.readObject(this.ty, toolbar.getNavigationIcon());
            propertyReader.readResourceId(this.HI, toolbar.getPopupTheme());
            propertyReader.readObject(this.ck, toolbar.getSubtitle());
            propertyReader.readObject(this.Ik, toolbar.getTitle());
            propertyReader.readInt(this.f14424r, toolbar.getTitleMarginBottom());
            propertyReader.readInt(this.f14423o, toolbar.getTitleMarginEnd());
            propertyReader.readInt(this.f14421Z, toolbar.getTitleMarginStart());
            propertyReader.readInt(this.XQ, toolbar.getTitleMarginTop());
        }
    }

    public static class LayoutParams extends ActionBar.LayoutParams {
        int rl;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.rl = 0;
        }

        void n(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public LayoutParams(int i2, int i3) {
            super(i2, i3);
            this.rl = 0;
            this.f13541n = 8388627;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ActionBar.LayoutParams) layoutParams);
            this.rl = 0;
            this.rl = layoutParams.rl;
        }

        public LayoutParams(ActionBar.LayoutParams layoutParams) {
            super(layoutParams);
            this.rl = 0;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.rl = 0;
            n(marginLayoutParams);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.rl = 0;
        }
    }

    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f13423K);
    }

    private int S(List list, int[] iArr) {
        int i2 = iArr[0];
        int i3 = iArr[1];
        int size = list.size();
        int i5 = 0;
        int measuredWidth = 0;
        while (i5 < size) {
            View view = (View) list.get(i5);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int i7 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin - i2;
            int i8 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin - i3;
            int iMax = Math.max(0, i7);
            int iMax2 = Math.max(0, i8);
            int iMax3 = Math.max(0, -i7);
            int iMax4 = Math.max(0, -i8);
            measuredWidth += iMax + view.getMeasuredWidth() + iMax2;
            i5++;
            i3 = iMax4;
            i2 = iMax3;
        }
        return measuredWidth;
    }

    public void setCollapseContentDescription(@StringRes int i2) {
        setCollapseContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setCollapseIcon(@DrawableRes int i2) {
        setCollapseIcon(AppCompatResources.rl(getContext(), i2));
    }

    public void setLogo(@DrawableRes int i2) {
        setLogo(AppCompatResources.rl(getContext(), i2));
    }

    public void setLogoDescription(@StringRes int i2) {
        setLogoDescription(getContext().getText(i2));
    }

    public void setNavigationContentDescription(@StringRes int i2) {
        setNavigationContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setNavigationIcon(@DrawableRes int i2) {
        setNavigationIcon(AppCompatResources.rl(getContext(), i2));
    }

    public void setSubtitle(@StringRes int i2) {
        setSubtitle(getContext().getText(i2));
    }

    public void setSubtitleTextColor(@ColorInt int i2) {
        setSubtitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setTitle(@StringRes int i2) {
        setTitle(getContext().getText(i2));
    }

    public void setTitleTextColor(@ColorInt int i2) {
        setTitleTextColor(ColorStateList.valueOf(i2));
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: androidx.appcompat.widget.Toolbar.SavedState.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        };
        boolean J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f14426O;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f14426O = parcel.readInt();
            this.J2 = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f14426O);
            parcel.writeInt(this.J2 ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f14391FX = 8388627;
        this.Nxk = new ArrayList();
        this.f14405k = new ArrayList();
        this.dR0 = new int[2];
        this.f14412z = new MenuHostHelper(new Runnable() { // from class: androidx.appcompat.widget.Q
            @Override // java.lang.Runnable
            public final void run() {
                this.f14265n.nY();
            }
        });
        this.piY = new ArrayList();
        this.f14406m = new ActionMenuView.OnMenuItemClickListener() { // from class: androidx.appcompat.widget.Toolbar.1
            @Override // androidx.appcompat.widget.ActionMenuView.OnMenuItemClickListener
            public boolean onMenuItemClick(MenuItem menuItem) {
                if (Toolbar.this.f14412z.KN(menuItem)) {
                    return true;
                }
                OnMenuItemClickListener onMenuItemClickListener = Toolbar.this.ijL;
                if (onMenuItemClickListener != null) {
                    return onMenuItemClickListener.onMenuItemClick(menuItem);
                }
                return false;
            }
        };
        this.ul = new Runnable() { // from class: androidx.appcompat.widget.Toolbar.2
            @Override // java.lang.Runnable
            public void run() {
                Toolbar.this.U();
            }
        };
        Context context2 = getContext();
        int[] iArr = R.styleable.f13538x;
        TintTypedArray tintTypedArrayS = TintTypedArray.S(context2, attributeSet, iArr, i2, 0);
        ViewCompat.ijL(this, context, iArr, attributeSet, tintTypedArrayS.r(), i2, 0);
        this.f14397N = tintTypedArrayS.ty(R.styleable.kC, 0);
        this.f14411v = tintTypedArrayS.ty(R.styleable.W1c, 0);
        this.f14391FX = tintTypedArrayS.qie(R.styleable.XUb, this.f14391FX);
        this.Xw = tintTypedArrayS.qie(R.styleable.rR, 48);
        int iO = tintTypedArrayS.O(R.styleable.GT, 0);
        int i3 = R.styleable.jE;
        iO = tintTypedArrayS.o(i3) ? tintTypedArrayS.O(i3, iO) : iO;
        this.p5 = iO;
        this.M7 = iO;
        this.P5 = iO;
        this.f14401U = iO;
        int iO2 = tintTypedArrayS.O(R.styleable.WKb, -1);
        if (iO2 >= 0) {
            this.f14401U = iO2;
        }
        int iO3 = tintTypedArrayS.O(R.styleable.f13518b, -1);
        if (iO3 >= 0) {
            this.P5 = iO3;
        }
        int iO4 = tintTypedArrayS.O(R.styleable.ZwA, -1);
        if (iO4 >= 0) {
            this.M7 = iO4;
        }
        int iO5 = tintTypedArrayS.O(R.styleable.Vd, -1);
        if (iO5 >= 0) {
            this.p5 = iO5;
        }
        this.jB = tintTypedArrayS.J2(R.styleable.f13509Rc, -1);
        int iO6 = tintTypedArrayS.O(R.styleable.iu, Integer.MIN_VALUE);
        int iO7 = tintTypedArrayS.O(R.styleable.sFO, Integer.MIN_VALUE);
        int iJ2 = tintTypedArrayS.J2(R.styleable.Of6, 0);
        int iJ22 = tintTypedArrayS.J2(R.styleable.jX, 0);
        xMQ();
        this.eF.O(iJ2, iJ22);
        if (iO6 != Integer.MIN_VALUE || iO7 != Integer.MIN_VALUE) {
            this.eF.Uo(iO6, iO7);
        }
        this.f14390E = tintTypedArrayS.O(R.styleable.Qg8, Integer.MIN_VALUE);
        this.f14396M = tintTypedArrayS.O(R.styleable.JI, Integer.MIN_VALUE);
        this.f14408o = tintTypedArrayS.Uo(R.styleable.V5F);
        this.f14399S = tintTypedArrayS.ck(R.styleable.MPw);
        CharSequence charSequenceCk = tintTypedArrayS.ck(R.styleable.ni);
        if (!TextUtils.isEmpty(charSequenceCk)) {
            setTitle(charSequenceCk);
        }
        CharSequence charSequenceCk2 = tintTypedArrayS.ck(R.styleable.poH);
        if (!TextUtils.isEmpty(charSequenceCk2)) {
            setSubtitle(charSequenceCk2);
        }
        this.f14403e = getContext();
        setPopupTheme(tintTypedArrayS.ty(R.styleable.ex, 0));
        Drawable drawableUo = tintTypedArrayS.Uo(R.styleable.NC9);
        if (drawableUo != null) {
            setNavigationIcon(drawableUo);
        }
        CharSequence charSequenceCk3 = tintTypedArrayS.ck(R.styleable.W5k);
        if (!TextUtils.isEmpty(charSequenceCk3)) {
            setNavigationContentDescription(charSequenceCk3);
        }
        Drawable drawableUo2 = tintTypedArrayS.Uo(R.styleable.tdZ);
        if (drawableUo2 != null) {
            setLogo(drawableUo2);
        }
        CharSequence charSequenceCk4 = tintTypedArrayS.ck(R.styleable.GRh);
        if (!TextUtils.isEmpty(charSequenceCk4)) {
            setLogoDescription(charSequenceCk4);
        }
        int i5 = R.styleable.eOa;
        if (tintTypedArrayS.o(i5)) {
            setTitleTextColor(tintTypedArrayS.t(i5));
        }
        int i7 = R.styleable.pr;
        if (tintTypedArrayS.o(i7)) {
            setSubtitleTextColor(tintTypedArrayS.t(i7));
        }
        int i8 = R.styleable.UR;
        if (tintTypedArrayS.o(i8)) {
            ViF(tintTypedArrayS.ty(i8, 0));
        }
        tintTypedArrayS.aYN();
    }

    private void N() {
        removeCallbacks(this.ul);
        post(this.ul);
    }

    private boolean Xw() {
        if (!this.Mx) {
            return false;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (jB(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private void az() {
        if (this.J2 == null) {
            this.J2 = new AppCompatImageButton(getContext(), null, R.attr.f13436i);
            LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            layoutParamsGenerateDefaultLayoutParams.f13541n = (this.Xw & 112) | 8388611;
            this.J2.setLayoutParams(layoutParamsGenerateDefaultLayoutParams);
        }
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i2 = 0; i2 < menu.size(); i2++) {
            arrayList.add(menu.getItem(i2));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new SupportMenuInflater(getContext());
    }

    private boolean jB(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private void mUb() {
        if (this.f14409r == null) {
            this.f14409r = new AppCompatImageView(getContext());
        }
    }

    private int o(int i2) {
        int i3 = i2 & 112;
        return (i3 == 16 || i3 == 48 || i3 == 80) ? i3 : this.f14391FX & 112;
    }

    private void qie() {
        if (this.f14407n == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f14407n = actionMenuView;
            actionMenuView.setPopupTheme(this.f14400T);
            this.f14407n.setOnMenuItemClickListener(this.f14406m);
            this.f14407n.jB(this.ofS, new MenuBuilder.Callback() { // from class: androidx.appcompat.widget.Toolbar.3
                @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
                public boolean n(MenuBuilder menuBuilder, MenuItem menuItem) {
                    MenuBuilder.Callback callback = Toolbar.this.f14388C;
                    return callback != null && callback.n(menuBuilder, menuItem);
                }

                @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
                public void rl(MenuBuilder menuBuilder) {
                    if (!Toolbar.this.f14407n.wTp()) {
                        Toolbar.this.f14412z.xMQ(menuBuilder);
                    }
                    MenuBuilder.Callback callback = Toolbar.this.f14388C;
                    if (callback != null) {
                        callback.rl(menuBuilder);
                    }
                }
            });
            LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            layoutParamsGenerateDefaultLayoutParams.f13541n = (this.Xw & 112) | 8388613;
            this.f14407n.setLayoutParams(layoutParamsGenerateDefaultLayoutParams);
            nr(this.f14407n, false);
        }
    }

    private void xMQ() {
        if (this.eF == null) {
            this.eF = new RtlSpacingHelper();
        }
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: HI, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void J2() {
        ExpandedActionViewMenuPresenter expandedActionViewMenuPresenter = this.pJg;
        MenuItemImpl menuItemImpl = expandedActionViewMenuPresenter == null ? null : expandedActionViewMenuPresenter.f14419t;
        if (menuItemImpl != null) {
            menuItemImpl.collapseActionView();
        }
    }

    void KN() {
        if (this.f14404g == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, R.attr.f13436i);
            this.f14404g = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.f14408o);
            this.f14404g.setContentDescription(this.f14399S);
            LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            layoutParamsGenerateDefaultLayoutParams.f13541n = (this.Xw & 112) | 8388611;
            layoutParamsGenerateDefaultLayoutParams.rl = 2;
            this.f14404g.setLayoutParams(layoutParamsGenerateDefaultLayoutParams);
            this.f14404g.setOnClickListener(new View.OnClickListener() { // from class: androidx.appcompat.widget.Toolbar.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Toolbar.this.J2();
                }
            });
        }
    }

    void P5() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherN = Api33Impl.n(this);
            boolean z2 = WPU() && onBackInvokedDispatcherN != null && isAttachedToWindow() && this.eWT;
            if (z2 && this.fcU == null) {
                if (this.f14392G7 == null) {
                    this.f14392G7 = Api33Impl.rl(new Runnable() { // from class: androidx.appcompat.widget.UGc
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f14447n.J2();
                        }
                    });
                }
                Api33Impl.t(onBackInvokedDispatcherN, this.f14392G7);
                this.fcU = onBackInvokedDispatcherN;
                return;
            }
            if (z2 || (onBackInvokedDispatcher = this.fcU) == null) {
                return;
            }
            Api33Impl.nr(onBackInvokedDispatcher, this.f14392G7);
            this.fcU = null;
        }
    }

    public boolean U() {
        ActionMenuView actionMenuView = this.f14407n;
        return actionMenuView != null && actionMenuView.U();
    }

    public void Uo() {
        ActionMenuView actionMenuView = this.f14407n;
        if (actionMenuView != null) {
            actionMenuView.fD();
        }
    }

    public boolean WPU() {
        ExpandedActionViewMenuPresenter expandedActionViewMenuPresenter = this.pJg;
        return (expandedActionViewMenuPresenter == null || expandedActionViewMenuPresenter.f14419t == null) ? false : true;
    }

    public boolean aYN() {
        ActionMenuView actionMenuView = this.f14407n;
        return actionMenuView != null && actionMenuView.nHg();
    }

    @Override // androidx.core.view.MenuHost
    public void addMenuProvider(MenuProvider menuProvider) {
        this.f14412z.t(menuProvider);
    }

    public void bzg(Context context, int i2) {
        this.f14397N = i2;
        TextView textView = this.f14410t;
        if (textView != null) {
            textView.setTextAppearance(context, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: ck, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof ActionBar.LayoutParams ? new LayoutParams((ActionBar.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    @Nullable
    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f14404g;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    @Nullable
    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f14404g;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        RtlSpacingHelper rtlSpacingHelper = this.eF;
        if (rtlSpacingHelper != null) {
            return rtlSpacingHelper.n();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i2 = this.f14396M;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        RtlSpacingHelper rtlSpacingHelper = this.eF;
        if (rtlSpacingHelper != null) {
            return rtlSpacingHelper.rl();
        }
        return 0;
    }

    public int getContentInsetRight() {
        RtlSpacingHelper rtlSpacingHelper = this.eF;
        if (rtlSpacingHelper != null) {
            return rtlSpacingHelper.t();
        }
        return 0;
    }

    public int getContentInsetStart() {
        RtlSpacingHelper rtlSpacingHelper = this.eF;
        if (rtlSpacingHelper != null) {
            return rtlSpacingHelper.nr();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i2 = this.f14390E;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        MenuBuilder menuBuilderXw;
        ActionMenuView actionMenuView = this.f14407n;
        return (actionMenuView == null || (menuBuilderXw = actionMenuView.Xw()) == null || !menuBuilderXw.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f14396M, 0));
    }

    public Drawable getLogo() {
        ImageView imageView = this.f14409r;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f14409r;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    @Nullable
    @VisibleForTesting
    View getNavButtonView() {
        return this.J2;
    }

    @Nullable
    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.J2;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    @Nullable
    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.J2;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.xg;
    }

    Context getPopupContext() {
        return this.f14403e;
    }

    @StyleRes
    public int getPopupTheme() {
        return this.f14400T;
    }

    public CharSequence getSubtitle() {
        return this.f14395J;
    }

    @Nullable
    @VisibleForTesting
    final TextView getSubtitleTextView() {
        return this.f14398O;
    }

    public CharSequence getTitle() {
        return this.f14387B;
    }

    public int getTitleMarginBottom() {
        return this.p5;
    }

    public int getTitleMarginEnd() {
        return this.P5;
    }

    public int getTitleMarginStart() {
        return this.f14401U;
    }

    public int getTitleMarginTop() {
        return this.M7;
    }

    @Nullable
    @VisibleForTesting
    final TextView getTitleTextView() {
        return this.f14410t;
    }

    @RestrictTo
    public DecorToolbar getWrapper() {
        if (this.eTf == null) {
            this.eTf = new ToolbarWidgetWrapper(this, true);
        }
        return this.eTf;
    }

    public boolean iF() {
        ActionMenuView actionMenuView = this.f14407n;
        return actionMenuView != null && actionMenuView.wTp();
    }

    public void nY() {
        Iterator it = this.piY.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        T();
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0298 A[LOOP:0: B:104:0x0296->B:105:0x0298, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02b6 A[LOOP:1: B:107:0x02b4->B:108:0x02b6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02ed A[LOOP:2: B:116:0x02eb->B:117:0x02ed, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x021e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onLayout(boolean z2, int i2, int i3, int i5, int i7) {
        int iFD;
        int iE2;
        int iMax;
        boolean zJB;
        boolean zJB2;
        boolean z3;
        int measuredHeight;
        int i8;
        int paddingTop;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int size;
        int iFD2;
        int i14;
        int size2;
        int i15;
        int i16;
        int size3;
        boolean z4 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i17 = width - paddingRight;
        int[] iArr = this.dR0;
        iArr[1] = 0;
        iArr[0] = 0;
        int iG = ViewCompat.g(this);
        int iMin = iG >= 0 ? Math.min(iG, i7 - i3) : 0;
        if (!jB(this.J2)) {
            iFD = paddingLeft;
        } else {
            if (z4) {
                iE2 = E2(this.J2, i17, iArr, iMin);
                iFD = paddingLeft;
                if (jB(this.f14404g)) {
                    if (z4) {
                        iE2 = E2(this.f14404g, iE2, iArr, iMin);
                    } else {
                        iFD = fD(this.f14404g, iFD, iArr, iMin);
                    }
                }
                if (jB(this.f14407n)) {
                    if (z4) {
                        iFD = fD(this.f14407n, iFD, iArr, iMin);
                    } else {
                        iE2 = E2(this.f14407n, iE2, iArr, iMin);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - iFD);
                iArr[1] = Math.max(0, currentContentInsetRight - (i17 - iE2));
                iMax = Math.max(iFD, currentContentInsetLeft);
                int iMin2 = Math.min(iE2, i17 - currentContentInsetRight);
                if (jB(this.E2)) {
                    if (z4) {
                        iMin2 = E2(this.E2, iMin2, iArr, iMin);
                    } else {
                        iMax = fD(this.E2, iMax, iArr, iMin);
                    }
                }
                if (jB(this.f14409r)) {
                    if (z4) {
                        iMin2 = E2(this.f14409r, iMin2, iArr, iMin);
                    } else {
                        iMax = fD(this.f14409r, iMax, iArr, iMin);
                    }
                }
                zJB = jB(this.f14410t);
                zJB2 = jB(this.f14398O);
                if (zJB) {
                    z3 = z4;
                    measuredHeight = 0;
                } else {
                    LayoutParams layoutParams = (LayoutParams) this.f14410t.getLayoutParams();
                    z3 = z4;
                    measuredHeight = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + this.f14410t.getMeasuredHeight();
                }
                if (!zJB2) {
                    LayoutParams layoutParams2 = (LayoutParams) this.f14398O.getLayoutParams();
                    measuredHeight += ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + this.f14398O.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                }
                if (!zJB || zJB2) {
                    TextView textView = !zJB ? this.f14410t : this.f14398O;
                    TextView textView2 = !zJB2 ? this.f14398O : this.f14410t;
                    LayoutParams layoutParams3 = (LayoutParams) textView.getLayoutParams();
                    LayoutParams layoutParams4 = (LayoutParams) textView2.getLayoutParams();
                    int i18 = measuredHeight;
                    boolean z5 = (zJB && this.f14410t.getMeasuredWidth() > 0) || (zJB2 && this.f14398O.getMeasuredWidth() > 0);
                    i8 = this.f14391FX & 112;
                    int i19 = iMax;
                    if (i8 == 48) {
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin + this.M7;
                    } else if (i8 != 80) {
                        int iMax2 = (((height - paddingTop2) - paddingBottom) - i18) / 2;
                        int i20 = ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin;
                        int i21 = this.M7;
                        if (iMax2 < i20 + i21) {
                            iMax2 = i20 + i21;
                        } else {
                            int i22 = (((height - paddingBottom) - i18) - iMax2) - paddingTop2;
                            int i23 = ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin;
                            int i24 = this.p5;
                            if (i22 < i23 + i24) {
                                iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin + i24) - i22));
                            }
                        }
                        paddingTop = paddingTop2 + iMax2;
                    } else {
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin) - this.p5) - i18;
                    }
                    if (z3) {
                        int i25 = (z5 ? this.f14401U : 0) - iArr[1];
                        iMin2 -= Math.max(0, i25);
                        iArr[1] = Math.max(0, -i25);
                        if (zJB) {
                            LayoutParams layoutParams5 = (LayoutParams) this.f14410t.getLayoutParams();
                            int measuredWidth = iMin2 - this.f14410t.getMeasuredWidth();
                            int measuredHeight2 = this.f14410t.getMeasuredHeight() + paddingTop;
                            this.f14410t.layout(measuredWidth, paddingTop, iMin2, measuredHeight2);
                            i12 = measuredWidth - this.P5;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin;
                        } else {
                            i12 = iMin2;
                        }
                        if (zJB2) {
                            int i26 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.f14398O.getLayoutParams())).topMargin;
                            this.f14398O.layout(iMin2 - this.f14398O.getMeasuredWidth(), i26, iMin2, this.f14398O.getMeasuredHeight() + i26);
                            i13 = iMin2 - this.P5;
                        } else {
                            i13 = iMin2;
                        }
                        if (z5) {
                            iMin2 = Math.min(i12, i13);
                        }
                        iMax = i19;
                        i9 = 0;
                    } else {
                        i9 = 0;
                        int i27 = (z5 ? this.f14401U : 0) - iArr[0];
                        iMax = i19 + Math.max(0, i27);
                        iArr[0] = Math.max(0, -i27);
                        if (zJB) {
                            LayoutParams layoutParams6 = (LayoutParams) this.f14410t.getLayoutParams();
                            int measuredWidth2 = this.f14410t.getMeasuredWidth() + iMax;
                            int measuredHeight3 = this.f14410t.getMeasuredHeight() + paddingTop;
                            this.f14410t.layout(iMax, paddingTop, measuredWidth2, measuredHeight3);
                            i10 = measuredWidth2 + this.P5;
                            paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) layoutParams6).bottomMargin;
                        } else {
                            i10 = iMax;
                        }
                        if (zJB2) {
                            int i28 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.f14398O.getLayoutParams())).topMargin;
                            int measuredWidth3 = this.f14398O.getMeasuredWidth() + iMax;
                            this.f14398O.layout(iMax, i28, measuredWidth3, this.f14398O.getMeasuredHeight() + i28);
                            i11 = measuredWidth3 + this.P5;
                        } else {
                            i11 = iMax;
                        }
                        if (z5) {
                            iMax = Math.max(i10, i11);
                        }
                    }
                } else {
                    i9 = 0;
                }
                t(this.Nxk, 3);
                size = this.Nxk.size();
                iFD2 = iMax;
                for (i14 = i9; i14 < size; i14++) {
                    iFD2 = fD((View) this.Nxk.get(i14), iFD2, iArr, iMin);
                }
                t(this.Nxk, 5);
                size2 = this.Nxk.size();
                for (i15 = i9; i15 < size2; i15++) {
                    iMin2 = E2((View) this.Nxk.get(i15), iMin2, iArr, iMin);
                }
                t(this.Nxk, 1);
                int iS = S(this.Nxk, iArr);
                i16 = (paddingLeft + (((width - paddingLeft) - paddingRight) / 2)) - (iS / 2);
                int i29 = iS + i16;
                if (i16 >= iFD2) {
                    iFD2 = i29 > iMin2 ? i16 - (i29 - iMin2) : i16;
                }
                size3 = this.Nxk.size();
                while (i9 < size3) {
                    iFD2 = fD((View) this.Nxk.get(i9), iFD2, iArr, iMin);
                    i9++;
                }
                this.Nxk.clear();
            }
            iFD = fD(this.J2, paddingLeft, iArr, iMin);
        }
        iE2 = i17;
        if (jB(this.f14404g)) {
        }
        if (jB(this.f14407n)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iFD);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i17 - iE2));
        iMax = Math.max(iFD, currentContentInsetLeft2);
        int iMin22 = Math.min(iE2, i17 - currentContentInsetRight2);
        if (jB(this.E2)) {
        }
        if (jB(this.f14409r)) {
        }
        zJB = jB(this.f14410t);
        zJB2 = jB(this.f14398O);
        if (zJB) {
        }
        if (!zJB2) {
        }
        if (zJB) {
            if (!zJB) {
            }
            if (!zJB2) {
            }
            LayoutParams layoutParams32 = (LayoutParams) textView.getLayoutParams();
            LayoutParams layoutParams42 = (LayoutParams) textView2.getLayoutParams();
            int i182 = measuredHeight;
            if (zJB) {
                i8 = this.f14391FX & 112;
                int i192 = iMax;
                if (i8 == 48) {
                }
                if (z3) {
                }
            } else {
                i8 = this.f14391FX & 112;
                int i1922 = iMax;
                if (i8 == 48) {
                }
                if (z3) {
                }
            }
        }
        t(this.Nxk, 3);
        size = this.Nxk.size();
        iFD2 = iMax;
        while (i14 < size) {
        }
        t(this.Nxk, 5);
        size2 = this.Nxk.size();
        while (i15 < size2) {
        }
        t(this.Nxk, 1);
        int iS2 = S(this.Nxk, iArr);
        i16 = (paddingLeft + (((width - paddingLeft) - paddingRight) / 2)) - (iS2 / 2);
        int i292 = iS2 + i16;
        if (i16 >= iFD2) {
        }
        size3 = this.Nxk.size();
        while (i9 < size3) {
        }
        this.Nxk.clear();
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        int measuredWidth;
        int iMax;
        int iCombineMeasuredStates;
        int measuredWidth2;
        int[] iArr;
        int iMax2;
        int iCombineMeasuredStates2;
        int measuredHeight;
        int[] iArr2 = this.dR0;
        boolean zRl = ViewUtils.rl(this);
        int i5 = !zRl ? 1 : 0;
        if (jB(this.J2)) {
            X(this.J2, i2, 0, i3, 0, this.jB);
            measuredWidth = this.J2.getMeasuredWidth() + Z(this.J2);
            iMax = Math.max(0, this.J2.getMeasuredHeight() + XQ(this.J2));
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.J2.getMeasuredState());
        } else {
            measuredWidth = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (jB(this.f14404g)) {
            X(this.f14404g, i2, 0, i3, 0, this.jB);
            measuredWidth = this.f14404g.getMeasuredWidth() + Z(this.f14404g);
            iMax = Math.max(iMax, this.f14404g.getMeasuredHeight() + XQ(this.f14404g));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f14404g.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, measuredWidth);
        iArr2[zRl ? 1 : 0] = Math.max(0, currentContentInsetStart - measuredWidth);
        if (jB(this.f14407n)) {
            X(this.f14407n, i2, iMax3, i3, 0, this.jB);
            measuredWidth2 = this.f14407n.getMeasuredWidth() + Z(this.f14407n);
            iMax = Math.max(iMax, this.f14407n.getMeasuredHeight() + XQ(this.f14407n));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f14407n.getMeasuredState());
        } else {
            measuredWidth2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax4 = iMax3 + Math.max(currentContentInsetEnd, measuredWidth2);
        iArr2[i5] = Math.max(0, currentContentInsetEnd - measuredWidth2);
        if (jB(this.E2)) {
            iArr = iArr2;
            iMax4 += e(this.E2, i2, iMax4, i3, 0, iArr);
            iMax = Math.max(iMax, this.E2.getMeasuredHeight() + XQ(this.E2));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.E2.getMeasuredState());
        } else {
            iArr = iArr2;
        }
        if (jB(this.f14409r)) {
            iMax4 += e(this.f14409r, i2, iMax4, i3, 0, iArr);
            iMax = Math.max(iMax, this.f14409r.getMeasuredHeight() + XQ(this.f14409r));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f14409r.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (((LayoutParams) childAt.getLayoutParams()).rl == 0 && jB(childAt)) {
                iMax4 += e(childAt, i2, iMax4, i3, 0, iArr);
                int iMax5 = Math.max(iMax, childAt.getMeasuredHeight() + XQ(childAt));
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax5;
            } else {
                iMax4 = iMax4;
            }
        }
        int i8 = iMax4;
        int i9 = this.M7 + this.p5;
        int i10 = this.f14401U + this.P5;
        if (jB(this.f14410t)) {
            e(this.f14410t, i2, i8 + i10, i3, i9, iArr);
            int measuredWidth3 = this.f14410t.getMeasuredWidth() + Z(this.f14410t);
            int measuredHeight2 = this.f14410t.getMeasuredHeight() + XQ(this.f14410t);
            iMax2 = measuredWidth3;
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f14410t.getMeasuredState());
            measuredHeight = measuredHeight2;
        } else {
            iMax2 = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            measuredHeight = 0;
        }
        if (jB(this.f14398O)) {
            iMax2 = Math.max(iMax2, e(this.f14398O, i2, i8 + i10, i3, i9 + measuredHeight, iArr));
            measuredHeight += this.f14398O.getMeasuredHeight() + XQ(this.f14398O);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f14398O.getMeasuredState());
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i8 + iMax2 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i2, (-16777216) & iCombineMeasuredStates2), Xw() ? 0 : View.resolveSizeAndState(Math.max(Math.max(iMax, measuredHeight) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i3, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.n());
        ActionMenuView actionMenuView = this.f14407n;
        MenuBuilder menuBuilderXw = actionMenuView != null ? actionMenuView.Xw() : null;
        int i2 = savedState.f14426O;
        if (i2 != 0 && this.pJg != null && menuBuilderXw != null && (menuItemFindItem = menuBuilderXw.findItem(i2)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (savedState.J2) {
            N();
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        MenuItemImpl menuItemImpl;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        ExpandedActionViewMenuPresenter expandedActionViewMenuPresenter = this.pJg;
        if (expandedActionViewMenuPresenter != null && (menuItemImpl = expandedActionViewMenuPresenter.f14419t) != null) {
            savedState.f14426O = menuItemImpl.getItemId();
        }
        savedState.J2 = iF();
        return savedState;
    }

    public void rV9(Context context, int i2) {
        this.f14411v = i2;
        TextView textView = this.f14398O;
        if (textView != null) {
            textView.setTextAppearance(context, i2);
        }
    }

    @Override // androidx.core.view.MenuHost
    public void removeMenuProvider(MenuProvider menuProvider) {
        this.f14412z.mUb(menuProvider);
    }

    void rl() {
        for (int size = this.f14405k.size() - 1; size >= 0; size--) {
            addView((View) this.f14405k.get(size));
        }
        this.f14405k.clear();
    }

    public void setBackInvokedCallbackEnabled(boolean z2) {
        if (this.eWT != z2) {
            this.eWT = z2;
            P5();
        }
    }

    public void setCollapseContentDescription(@Nullable CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            KN();
        }
        ImageButton imageButton = this.f14404g;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(@Nullable Drawable drawable) {
        if (drawable != null) {
            KN();
            this.f14404g.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.f14404g;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.f14408o);
            }
        }
    }

    @RestrictTo
    public void setCollapsible(boolean z2) {
        this.Mx = z2;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.f14396M) {
            this.f14396M = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.f14390E) {
            this.f14390E = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            mUb();
            if (!g(this.f14409r)) {
                nr(this.f14409r, true);
            }
        } else {
            ImageView imageView = this.f14409r;
            if (imageView != null && g(imageView)) {
                removeView(this.f14409r);
                this.f14405k.remove(this.f14409r);
            }
        }
        ImageView imageView2 = this.f14409r;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            mUb();
        }
        ImageView imageView = this.f14409r;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(@Nullable CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            az();
        }
        ImageButton imageButton = this.J2;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            TooltipCompat.n(this.J2, charSequence);
        }
    }

    public void setNavigationIcon(@Nullable Drawable drawable) {
        if (drawable != null) {
            az();
            if (!g(this.J2)) {
                nr(this.J2, true);
            }
        } else {
            ImageButton imageButton = this.J2;
            if (imageButton != null && g(imageButton)) {
                removeView(this.J2);
                this.f14405k.remove(this.J2);
            }
        }
        ImageButton imageButton2 = this.J2;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.ijL = onMenuItemClickListener;
    }

    public void setPopupTheme(@StyleRes int i2) {
        if (this.f14400T != i2) {
            this.f14400T = i2;
            if (i2 == 0) {
                this.f14403e = getContext();
            } else {
                this.f14403e = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f14398O;
            if (textView != null && g(textView)) {
                removeView(this.f14398O);
                this.f14405k.remove(this.f14398O);
            }
        } else {
            if (this.f14398O == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f14398O = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f14398O.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f14411v;
                if (i2 != 0) {
                    this.f14398O.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.f14402a;
                if (colorStateList != null) {
                    this.f14398O.setTextColor(colorStateList);
                }
            }
            if (!g(this.f14398O)) {
                nr(this.f14398O, true);
            }
        }
        TextView textView2 = this.f14398O;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f14395J = charSequence;
    }

    public void setSubtitleTextColor(@NonNull ColorStateList colorStateList) {
        this.f14402a = colorStateList;
        TextView textView = this.f14398O;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f14410t;
            if (textView != null && g(textView)) {
                removeView(this.f14410t);
                this.f14405k.remove(this.f14410t);
            }
        } else {
            if (this.f14410t == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f14410t = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f14410t.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f14397N;
                if (i2 != 0) {
                    this.f14410t.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.f14389D;
                if (colorStateList != null) {
                    this.f14410t.setTextColor(colorStateList);
                }
            }
            if (!g(this.f14410t)) {
                nr(this.f14410t, true);
            }
        }
        TextView textView2 = this.f14410t;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f14387B = charSequence;
    }

    public void setTitleMarginBottom(int i2) {
        this.p5 = i2;
        requestLayout();
    }

    public void setTitleMarginEnd(int i2) {
        this.P5 = i2;
        requestLayout();
    }

    public void setTitleMarginStart(int i2) {
        this.f14401U = i2;
        requestLayout();
    }

    public void setTitleMarginTop(int i2) {
        this.M7 = i2;
        requestLayout();
    }

    public void setTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.f14389D = colorStateList;
        TextView textView = this.f14410t;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public boolean te() {
        ActionMenuView actionMenuView = this.f14407n;
        return actionMenuView != null && actionMenuView.s7N();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: ty, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    public void v(MenuPresenter.Callback callback, MenuBuilder.Callback callback2) {
        this.ofS = callback;
        this.f14388C = callback2;
        ActionMenuView actionMenuView = this.f14407n;
        if (actionMenuView != null) {
            actionMenuView.jB(callback, callback2);
        }
    }

    public void wTp(MenuBuilder menuBuilder, ActionMenuPresenter actionMenuPresenter) {
        if (menuBuilder == null && this.f14407n == null) {
            return;
        }
        qie();
        MenuBuilder menuBuilderXw = this.f14407n.Xw();
        if (menuBuilderXw == menuBuilder) {
            return;
        }
        if (menuBuilderXw != null) {
            menuBuilderXw.U(this.xg);
            menuBuilderXw.U(this.pJg);
        }
        if (this.pJg == null) {
            this.pJg = new ExpandedActionViewMenuPresenter();
        }
        actionMenuPresenter.nHg(true);
        if (menuBuilder != null) {
            menuBuilder.t(actionMenuPresenter, this.f14403e);
            menuBuilder.t(this.pJg, this.f14403e);
        } else {
            actionMenuPresenter.gh(this.f14403e, null);
            this.pJg.gh(this.f14403e, null);
            actionMenuPresenter.KN(true);
            this.pJg.KN(true);
        }
        this.f14407n.setPopupTheme(this.f14400T);
        this.f14407n.setPresenter(actionMenuPresenter);
        this.xg = actionMenuPresenter;
        P5();
    }

    private int E2(View view, int i2, int[] iArr, int i3) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i5 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin - iArr[1];
        int iMax = i2 - Math.max(0, i5);
        iArr[1] = Math.max(0, -i5);
        int iR = r(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iR, iMax, view.getMeasuredHeight() + iR);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin);
    }

    private int Ik(int i2) {
        int layoutDirection = getLayoutDirection();
        int iRl = GravityCompat.rl(i2, layoutDirection) & 7;
        if (iRl != 1 && iRl != 3 && iRl != 5) {
            if (layoutDirection != 1) {
                return 3;
            }
            return 5;
        }
        return iRl;
    }

    private void T() {
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.f14412z.J2(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.piY = currentMenuItems2;
    }

    private void X(View view, int i2, int i3, int i5, int i7, int i8) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i5, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i7, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i8 >= 0) {
            if (mode != 0) {
                i8 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i8);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private int XQ(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int Z(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    private int e(View view, int i2, int i3, int i5, int i7, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i8 = marginLayoutParams.leftMargin - iArr[0];
        int i9 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i8) + Math.max(0, i9);
        iArr[0] = Math.max(0, -i8);
        iArr[1] = Math.max(0, -i9);
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + iMax + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i5, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i7, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    private int fD(View view, int i2, int[] iArr, int i3) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i5 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin - iArr[0];
        int iMax = i2 + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        int iR = r(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iR, iMax + measuredWidth, view.getMeasuredHeight() + iR);
        return iMax + measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
    }

    private boolean g(View view) {
        if (view.getParent() != this && !this.f14405k.contains(view)) {
            return false;
        }
        return true;
    }

    private void gh() {
        qie();
        if (this.f14407n.Xw() == null) {
            MenuBuilder menuBuilder = (MenuBuilder) this.f14407n.getMenu();
            if (this.pJg == null) {
                this.pJg = new ExpandedActionViewMenuPresenter();
            }
            this.f14407n.setExpandedActionViewsExclusive(true);
            menuBuilder.t(this.pJg, this.f14403e);
            P5();
        }
    }

    private void nr(View view, boolean z2) {
        LayoutParams layoutParamsGenerateLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParamsGenerateLayoutParams = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(layoutParams)) {
            layoutParamsGenerateLayoutParams = generateLayoutParams(layoutParams);
        } else {
            layoutParamsGenerateLayoutParams = (LayoutParams) layoutParams;
        }
        layoutParamsGenerateLayoutParams.rl = 1;
        if (z2 && this.E2 != null) {
            view.setLayoutParams(layoutParamsGenerateLayoutParams);
            this.f14405k.add(view);
        } else {
            addView(view, layoutParamsGenerateLayoutParams);
        }
    }

    private int r(View view, int i2) {
        int i3;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 > 0) {
            i3 = (measuredHeight - i2) / 2;
        } else {
            i3 = 0;
        }
        int iO = o(layoutParams.f13541n);
        if (iO != 48) {
            if (iO != 80) {
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                int i5 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                if (iMax < i5) {
                    iMax = i5;
                } else {
                    int i7 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
                    int i8 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    if (i7 < i8) {
                        iMax = Math.max(0, iMax - (i8 - i7));
                    }
                }
                return paddingTop + iMax;
            }
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - i3;
        }
        return getPaddingTop() - i3;
    }

    private void t(List list, int i2) {
        boolean z2;
        if (getLayoutDirection() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        int childCount = getChildCount();
        int iRl = GravityCompat.rl(i2, getLayoutDirection());
        list.clear();
        if (z2) {
            for (int i3 = childCount - 1; i3 >= 0; i3--) {
                View childAt = getChildAt(i3);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.rl == 0 && jB(childAt) && Ik(layoutParams.f13541n) == iRl) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt2 = getChildAt(i5);
            LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
            if (layoutParams2.rl == 0 && jB(childAt2) && Ik(layoutParams2.f13541n) == iRl) {
                list.add(childAt2);
            }
        }
    }

    public boolean O() {
        ActionMenuView actionMenuView;
        if (getVisibility() == 0 && (actionMenuView = this.f14407n) != null && actionMenuView.v()) {
            return true;
        }
        return false;
    }

    public void ViF(int i2) {
        getMenuInflater().inflate(i2, getMenu());
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams)) {
            return true;
        }
        return false;
    }

    public int getCurrentContentInsetLeft() {
        if (getLayoutDirection() == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (getLayoutDirection() == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.f14390E, 0));
        }
        return getContentInsetStart();
    }

    public Menu getMenu() {
        gh();
        return this.f14407n.getMenu();
    }

    @Nullable
    public Drawable getOverflowIcon() {
        gh();
        return this.f14407n.getOverflowIcon();
    }

    void nHg() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((LayoutParams) childAt.getLayoutParams()).rl != 2 && childAt != this.f14407n) {
                removeViewAt(childCount);
                this.f14405k.add(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        P5();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.ul);
        P5();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f14393GR = false;
        }
        if (!this.f14393GR) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f14393GR = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f14393GR = false;
        }
        return true;
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        xMQ();
        RtlSpacingHelper rtlSpacingHelper = this.eF;
        boolean z2 = true;
        if (i2 != 1) {
            z2 = false;
        }
        rtlSpacingHelper.J2(z2);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f14394I = false;
        }
        if (!this.f14394I) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f14394I = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f14394I = false;
        }
        return true;
    }

    public void s7N(int i2, int i3) {
        xMQ();
        this.eF.Uo(i2, i3);
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        az();
        this.J2.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(@Nullable Drawable drawable) {
        gh();
        this.f14407n.setOverflowIcon(drawable);
    }
}
