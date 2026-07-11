package com.alightcreative.app.motion.activities;

import SJ0.C1463p;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.core.content.res.ResourcesCompat;
import com.alightcreative.app.motion.scene.ColorKt;
import com.alightcreative.app.motion.scene.SolidColor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class xuv {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f45732n;
    private int nr;
    private final List rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f45733t;

    private static final class j extends BaseAdapter {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final List f45734n;

        /* JADX INFO: renamed from: com.alightcreative.app.motion.activities.xuv$j$j, reason: collision with other inner class name */
        public /* synthetic */ class C0647j {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[QYU.j.values().length];
                try {
                    iArr[QYU.j.f8224t.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[QYU.j.f8222O.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @Override // android.widget.Adapter
        public long getItemId(int i2) {
            return i2;
        }

        public j(List menuItems) {
            Intrinsics.checkNotNullParameter(menuItems, "menuItems");
            this.f45734n = menuItems;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f45734n.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i2) {
            return this.f45734n.get(i2);
        }

        @Override // android.widget.Adapter
        public View getView(int i2, View view, ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            n nVar = (n) this.f45734n.get(i2);
            if (view == null) {
                view = LayoutInflater.from(parent.getContext()).inflate(2131558513, parent, false);
            }
            SJ0.O oN = SJ0.O.n(view);
            Intrinsics.checkNotNullExpressionValue(oN, "bind(...)");
            if (nVar.J2()) {
                view.setBackgroundColor(view.getResources().getColor(2131099650, view.getContext().getTheme()));
            } else {
                view.setBackgroundTintList(view.getResources().getColorStateList(2131100868, view.getContext().getTheme()));
                view.setBackgroundColor(0);
            }
            oN.nr.setText(nVar.nr());
            oN.nr.setAlpha(nVar.rl() ? 1.0f : 0.25f);
            if (nVar.t() != null) {
                oN.f9246t.setVisibility(0);
                oN.f9246t.setImageDrawable(nVar.t());
            } else if (nVar.Uo() != null) {
                oN.f9246t.setVisibility(0);
                oN.f9246t.setImageBitmap(ColorKt.makeSwatch$default(nVar.Uo(), 60, 60, 0.0f, 8.0f, 2, 0, 36, null));
            } else {
                oN.f9246t.setVisibility(8);
            }
            if (nVar.O() != null) {
                QYU.j jVarO = nVar.O();
                int i3 = jVarO == null ? -1 : C0647j.$EnumSwitchMapping$0[jVarO.ordinal()];
                if (i3 == 1) {
                    oN.J2.setVisibility(0);
                    oN.f9244O.setVisibility(8);
                } else {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oN.J2.setVisibility(8);
                    oN.f9244O.setVisibility(0);
                }
            } else {
                oN.J2.setVisibility(8);
                oN.f9244O.setVisibility(8);
            }
            Intrinsics.checkNotNull(view);
            return view;
        }
    }

    public static final class n {
        private final QYU.j J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final boolean f45735O;
        private final Function0 Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Drawable f45736n;
        private final SolidColor nr;
        private final boolean rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final String f45737t;

        public n(Drawable drawable, boolean z2, String label, SolidColor solidColor, boolean z3, QYU.j jVar, Function0 function0) {
            Intrinsics.checkNotNullParameter(label, "label");
            this.f45736n = drawable;
            this.rl = z2;
            this.f45737t = label;
            this.nr = solidColor;
            this.f45735O = z3;
            this.J2 = jVar;
            this.Uo = function0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return Intrinsics.areEqual(this.f45736n, nVar.f45736n) && this.rl == nVar.rl && Intrinsics.areEqual(this.f45737t, nVar.f45737t) && Intrinsics.areEqual(this.nr, nVar.nr) && this.f45735O == nVar.f45735O && this.J2 == nVar.J2 && Intrinsics.areEqual(this.Uo, nVar.Uo);
        }

        public int hashCode() {
            Drawable drawable = this.f45736n;
            int iHashCode = (((((drawable == null ? 0 : drawable.hashCode()) * 31) + Boolean.hashCode(this.rl)) * 31) + this.f45737t.hashCode()) * 31;
            SolidColor solidColor = this.nr;
            int iHashCode2 = (((iHashCode + (solidColor == null ? 0 : solidColor.hashCode())) * 31) + Boolean.hashCode(this.f45735O)) * 31;
            QYU.j jVar = this.J2;
            int iHashCode3 = (iHashCode2 + (jVar == null ? 0 : jVar.hashCode())) * 31;
            Function0 function0 = this.Uo;
            return iHashCode3 + (function0 != null ? function0.hashCode() : 0);
        }

        public String toString() {
            return "MenuItem(icon=" + this.f45736n + ", enabled=" + this.rl + ", label=" + this.f45737t + ", swatch=" + this.nr + ", selected=" + this.f45735O + ", premiumBadge=" + this.J2 + ", action=" + this.Uo + ")";
        }

        public final boolean J2() {
            return this.f45735O;
        }

        public final QYU.j O() {
            return this.J2;
        }

        public final SolidColor Uo() {
            return this.nr;
        }

        public final Function0 n() {
            return this.Uo;
        }

        public final String nr() {
            return this.f45737t;
        }

        public final boolean rl() {
            return this.rl;
        }

        public final Drawable t() {
            return this.f45736n;
        }

        public /* synthetic */ n(Drawable drawable, boolean z2, String str, SolidColor solidColor, boolean z3, QYU.j jVar, Function0 function0, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? null : drawable, (i2 & 2) != 0 ? true : z2, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? null : solidColor, (i2 & 16) != 0 ? false : z3, (i2 & 32) != 0 ? null : jVar, (i2 & 64) != 0 ? null : function0);
        }
    }

    public xuv(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f45732n = context;
        this.rl = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void az(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mUb(xuv xuvVar, final PopupWindow popupWindow, AdapterView adapterView, View view, int i2, long j2) {
        xuvVar.J2((n) xuvVar.rl.get(i2), new Function0() { // from class: com.alightcreative.app.motion.activities.B
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return xuv.gh(popupWindow);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void qie(C1463p c1463p, View view, int i2, int i3, int i5, int i7) {
        c1463p.nr.setVisibility(c1463p.f9588t.canScrollVertically(-1) ? 0 : 4);
        c1463p.rl.setVisibility(c1463p.f9588t.canScrollVertically(1) ? 0 : 4);
    }

    public static /* synthetic */ void xMQ(xuv xuvVar, View view, int i2, int i3, Function0 function0, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            function0 = null;
        }
        xuvVar.KN(view, i2, i3, function0);
    }

    public final void KN(View anchor, int i2, int i3, final Function0 function0) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        if (this.f45733t == 0) {
            this.f45733t = anchor.getResources().getDimensionPixelSize(2131166272);
        }
        if (this.nr == 0) {
            this.nr = this.rl.size() >= 8 ? anchor.getResources().getDimensionPixelSize(2131165282) * 8 : anchor.getResources().getDimensionPixelSize(2131165282) * this.rl.size();
        }
        final PopupWindow popupWindow = new PopupWindow(this.f45732n);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setTouchable(true);
        popupWindow.setFocusable(true);
        popupWindow.setBackgroundDrawable(ResourcesCompat.J2(this.f45732n.getResources(), 2131232190, this.f45732n.getTheme()));
        popupWindow.setContentView(View.inflate(this.f45732n, 2131558512, null));
        final C1463p c1463pN = C1463p.n(popupWindow.getContentView());
        Intrinsics.checkNotNullExpressionValue(c1463pN, "bind(...)");
        c1463pN.f9588t.setAdapter((ListAdapter) new j(this.rl));
        c1463pN.f9588t.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.alightcreative.app.motion.activities.hQ
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i5, long j2) {
                xuv.mUb(this.f45260n, popupWindow, adapterView, view, i5, j2);
            }
        });
        int i5 = this.f45733t;
        if (i5 > 0) {
            popupWindow.setWidth(i5);
        }
        int i7 = this.nr;
        if (i7 > 0) {
            popupWindow.setHeight(i7);
        }
        c1463pN.f9588t.setClipToOutline(true);
        c1463pN.f9588t.setClipChildren(true);
        Object parent = c1463pN.f9588t.getParent();
        View view = parent instanceof View ? (View) parent : null;
        if (view != null) {
            view.setClipToOutline(true);
        }
        ViewParent parent2 = c1463pN.f9588t.getParent();
        ViewGroup viewGroup = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
        if (viewGroup != null) {
            viewGroup.setClipChildren(true);
        }
        c1463pN.f9588t.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.alightcreative.app.motion.activities.qYU
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view2, int i8, int i9, int i10, int i11) {
                xuv.qie(c1463pN, view2, i8, i9, i10, i11);
            }
        });
        popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.alightcreative.app.motion.activities.RGN
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                xuv.az(function0);
            }
        });
        popupWindow.showAsDropDown(anchor, i2, i3);
    }

    public final void O(Collection items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.rl.addAll(items);
    }

    public final void Uo(int i2) {
        this.f45733t = i2;
    }

    private final void J2(n nVar, Function0 function0) {
        if (nVar.rl()) {
            Function0 function0N = nVar.n();
            if (function0N != null) {
                function0N.invoke();
            }
            function0.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit gh(PopupWindow popupWindow) {
        popupWindow.dismiss();
        return Unit.INSTANCE;
    }
}
