package com.alightcreative.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.PopupWindow;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.alightcreative.app.motion.scene.ColorKt;
import com.alightcreative.app.motion.scene.SolidColor;
import com.alightcreative.widget.xuv;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class xuv {
    private int J2;
    private Function1 KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final List f47495O;
    private boolean Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f47496n;
    private final List nr;
    private final kgE.fuX rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f47497t;

    /* synthetic */ class CN3 extends FunctionReferenceImpl implements Function4 {
        CN3(Object obj) {
            super(4, obj, xuv.class, "onItemClick", "onItemClick(Landroid/view/View;Landroid/view/View;Lcom/alightcreative/widget/LayerCopyPasteMenuPopup$MenuItem;Lkotlin/jvm/functions/Function0;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            n((View) obj, (View) obj2, (Ml) obj3, (Function0) obj4);
            return Unit.INSTANCE;
        }

        public final void n(View p0, View p1, Ml p2, Function0 p3) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            Intrinsics.checkNotNullParameter(p2, "p2");
            Intrinsics.checkNotNullParameter(p3, "p3");
            ((xuv) this.receiver).ViF(p0, p1, p2, p3);
        }
    }

    private static final class I28 extends RecyclerView.ItemDecoration {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Drawable f47498n;

        public I28(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.f47498n = ContextCompat.getDrawable(context, 2131231441);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void gh(Canvas c2, RecyclerView parent, RecyclerView.State state) {
            Intrinsics.checkNotNullParameter(c2, "c");
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(state, "state");
            int top = parent.getChildAt(0).getTop();
            int dimensionPixelOffset = parent.getResources().getDimensionPixelOffset(2131165283);
            Drawable drawable = this.f47498n;
            if (drawable != null) {
                drawable.setBounds(0, top, parent.getWidth(), dimensionPixelOffset + top);
            }
            Drawable drawable2 = this.f47498n;
            if (drawable2 != null) {
                drawable2.draw(c2);
            }
            super.gh(c2, parent, state);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class Ml {
        private final boolean HI;
        private final boolean J2;
        private final int KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final String f47499O;
        private final Function0 Uo;
        private final boolean az;
        private final SolidColor gh;
        private final Set mUb;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final n f47500n;
        private final boolean nr;
        private final boolean qie;
        private final Drawable rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final boolean f47501t;
        private final String ty;
        private final List xMQ;

        public Ml(n type, Drawable drawable, boolean z2, boolean z3, String label, boolean z4, Function0 function0, int i2, List children, Set requiredBenefits, SolidColor solidColor, boolean z5, boolean z6, String str, boolean z7) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(children, "children");
            Intrinsics.checkNotNullParameter(requiredBenefits, "requiredBenefits");
            this.f47500n = type;
            this.rl = drawable;
            this.f47501t = z2;
            this.nr = z3;
            this.f47499O = label;
            this.J2 = z4;
            this.Uo = function0;
            this.KN = i2;
            this.xMQ = children;
            this.mUb = requiredBenefits;
            this.gh = solidColor;
            this.qie = z5;
            this.az = z6;
            this.ty = str;
            this.HI = z7;
        }

        public static /* synthetic */ Ml rl(Ml ml, n nVar, Drawable drawable, boolean z2, boolean z3, String str, boolean z4, Function0 function0, int i2, List list, Set set, SolidColor solidColor, boolean z5, boolean z6, String str2, boolean z7, int i3, Object obj) {
            return ml.n((i3 & 1) != 0 ? ml.f47500n : nVar, (i3 & 2) != 0 ? ml.rl : drawable, (i3 & 4) != 0 ? ml.f47501t : z2, (i3 & 8) != 0 ? ml.nr : z3, (i3 & 16) != 0 ? ml.f47499O : str, (i3 & 32) != 0 ? ml.J2 : z4, (i3 & 64) != 0 ? ml.Uo : function0, (i3 & 128) != 0 ? ml.KN : i2, (i3 & 256) != 0 ? ml.xMQ : list, (i3 & 512) != 0 ? ml.mUb : set, (i3 & 1024) != 0 ? ml.gh : solidColor, (i3 & 2048) != 0 ? ml.qie : z5, (i3 & 4096) != 0 ? ml.az : z6, (i3 & 8192) != 0 ? ml.ty : str2, (i3 & 16384) != 0 ? ml.HI : z7);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Ml)) {
                return false;
            }
            Ml ml = (Ml) obj;
            return this.f47500n == ml.f47500n && Intrinsics.areEqual(this.rl, ml.rl) && this.f47501t == ml.f47501t && this.nr == ml.nr && Intrinsics.areEqual(this.f47499O, ml.f47499O) && this.J2 == ml.J2 && Intrinsics.areEqual(this.Uo, ml.Uo) && this.KN == ml.KN && Intrinsics.areEqual(this.xMQ, ml.xMQ) && Intrinsics.areEqual(this.mUb, ml.mUb) && Intrinsics.areEqual(this.gh, ml.gh) && this.qie == ml.qie && this.az == ml.az && Intrinsics.areEqual(this.ty, ml.ty) && this.HI == ml.HI;
        }

        public int hashCode() {
            int iHashCode = this.f47500n.hashCode() * 31;
            Drawable drawable = this.rl;
            int iHashCode2 = (((((((((iHashCode + (drawable == null ? 0 : drawable.hashCode())) * 31) + Boolean.hashCode(this.f47501t)) * 31) + Boolean.hashCode(this.nr)) * 31) + this.f47499O.hashCode()) * 31) + Boolean.hashCode(this.J2)) * 31;
            Function0 function0 = this.Uo;
            int iHashCode3 = (((((((iHashCode2 + (function0 == null ? 0 : function0.hashCode())) * 31) + Integer.hashCode(this.KN)) * 31) + this.xMQ.hashCode()) * 31) + this.mUb.hashCode()) * 31;
            SolidColor solidColor = this.gh;
            int iHashCode4 = (((((iHashCode3 + (solidColor == null ? 0 : solidColor.hashCode())) * 31) + Boolean.hashCode(this.qie)) * 31) + Boolean.hashCode(this.az)) * 31;
            String str = this.ty;
            return ((iHashCode4 + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.HI);
        }

        public final Ml n(n type, Drawable drawable, boolean z2, boolean z3, String label, boolean z4, Function0 function0, int i2, List children, Set requiredBenefits, SolidColor solidColor, boolean z5, boolean z6, String str, boolean z7) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(children, "children");
            Intrinsics.checkNotNullParameter(requiredBenefits, "requiredBenefits");
            return new Ml(type, drawable, z2, z3, label, z4, function0, i2, children, requiredBenefits, solidColor, z5, z6, str, z7);
        }

        public String toString() {
            return "MenuItem(type=" + this.f47500n + ", icon=" + this.rl + ", addTopDivider=" + this.f47501t + ", enabled=" + this.nr + ", label=" + this.f47499O + ", checked=" + this.J2 + ", action=" + this.Uo + ", selectedOption=" + this.KN + ", children=" + this.xMQ + ", requiredBenefits=" + this.mUb + ", swatch=" + this.gh + ", selected=" + this.qie + ", hasSubPage=" + this.az + ", subTitle=" + this.ty + ", hasNewTag=" + this.HI + ")";
        }

        public final String HI() {
            return this.ty;
        }

        public final n Ik() {
            return this.f47500n;
        }

        public final List J2() {
            return this.xMQ;
        }

        public final boolean KN() {
            return this.HI;
        }

        public final boolean O() {
            return this.J2;
        }

        public final boolean Uo() {
            return this.nr;
        }

        public final boolean az() {
            return this.qie;
        }

        public final SolidColor ck() {
            return this.gh;
        }

        public final String gh() {
            return this.f47499O;
        }

        public final Drawable mUb() {
            return this.rl;
        }

        public final boolean nr() {
            return this.f47501t;
        }

        public final Set qie() {
            return this.mUb;
        }

        public final Function0 t() {
            return this.Uo;
        }

        public final int ty() {
            return this.KN;
        }

        public final boolean xMQ() {
            return this.az;
        }

        public /* synthetic */ Ml(n nVar, Drawable drawable, boolean z2, boolean z3, String str, boolean z4, Function0 function0, int i2, List list, Set set, SolidColor solidColor, boolean z5, boolean z6, String str2, boolean z7, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? n.f47506n : nVar, (i3 & 2) != 0 ? null : drawable, (i3 & 4) != 0 ? false : z2, (i3 & 8) != 0 ? true : z3, (i3 & 16) != 0 ? "" : str, (i3 & 32) != 0 ? false : z4, (i3 & 64) != 0 ? null : function0, (i3 & 128) != 0 ? 0 : i2, (i3 & 256) != 0 ? CollectionsKt.emptyList() : list, (i3 & 512) != 0 ? SetsKt.emptySet() : set, (i3 & 1024) != 0 ? null : solidColor, (i3 & 2048) != 0 ? false : z5, (i3 & 4096) != 0 ? false : z6, (i3 & 8192) != 0 ? null : str2, (i3 & 16384) != 0 ? false : z7);
        }
    }

    public /* synthetic */ class Wre {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[n.values().length];
            try {
                iArr[n.f47506n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n.J2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n.f47509t.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[n.f47505O.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[U4.values().length];
            try {
                iArr2[U4.f47298O.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[U4.J2.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[U4.f47305r.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[U4.f47304o.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[U4.f47301Z.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[U4.f47299S.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[U4.f47303g.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[U4.E2.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class j extends RecyclerView.Adapter {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final List f47502n;
        private final int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Function0 f47503t;

        /* JADX INFO: renamed from: com.alightcreative.widget.xuv$j$j, reason: collision with other inner class name */
        public final class C0687j extends RecyclerView.ViewHolder {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final ViewBinding f47504n;
            final /* synthetic */ j rl;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0687j(j jVar, ViewBinding itemBinding) {
                super(itemBinding.getRoot());
                Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
                this.rl = jVar;
                this.f47504n = itemBinding;
            }

            public final void O(final Ml item) {
                Intrinsics.checkNotNullParameter(item, "item");
                ViewBinding viewBinding = this.f47504n;
                if (viewBinding instanceof SJ0.rv6) {
                    ((SJ0.rv6) viewBinding).rl.setImageDrawable(item.mUb());
                    ((SJ0.rv6) this.f47504n).f9630t.setVisibility(item.az() ? 0 : 8);
                } else {
                    if (!(viewBinding instanceof SJ0.M)) {
                        throw new UnsupportedOperationException();
                    }
                    ((SJ0.M) viewBinding).rl.setImageDrawable(item.mUb());
                    ((SJ0.M) this.f47504n).f9203t.setVisibility(item.az() ? 0 : 8);
                }
                View view = this.itemView;
                final j jVar = this.rl;
                view.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.widget.B
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        xuv.j.C0687j.J2(item, jVar, view2);
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void J2(Ml ml, j jVar, View view) {
                Function0 function0T = ml.t();
                if (function0T != null) {
                    function0T.invoke();
                }
                jVar.qie().invoke();
            }
        }

        public j(List inlineItems, int i2, Function0 dismiss) {
            Intrinsics.checkNotNullParameter(inlineItems, "inlineItems");
            Intrinsics.checkNotNullParameter(dismiss, "dismiss");
            this.f47502n = inlineItems;
            this.rl = i2;
            this.f47503t = dismiss;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: az, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(C0687j holder, int i2) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            holder.O((Ml) this.f47502n.get(i2));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f47502n.size();
        }

        public final Function0 qie() {
            return this.f47503t;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: ty, reason: merged with bridge method [inline-methods] */
        public C0687j onCreateViewHolder(ViewGroup parent, int i2) {
            ViewBinding viewBindingT;
            Intrinsics.checkNotNullParameter(parent, "parent");
            switch (this.rl) {
                case 2131558478:
                    viewBindingT = SJ0.M.t(LayoutInflater.from(parent.getContext()), parent, false);
                    Intrinsics.checkNotNull(viewBindingT);
                    break;
                case 2131558479:
                    viewBindingT = SJ0.rv6.t(LayoutInflater.from(parent.getContext()), parent, false);
                    Intrinsics.checkNotNull(viewBindingT);
                    break;
                default:
                    throw new UnsupportedOperationException();
            }
            return new C0687j(this, viewBindingT);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class n {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f47507o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final /* synthetic */ n[] f47508r;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f47506n = new n("Normal", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final n f47509t = new n("Inline", 1);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final n f47505O = new n("Dropdown", 2);
        public static final n J2 = new n("Radio", 3);

        private static final /* synthetic */ n[] n() {
            return new n[]{f47506n, f47509t, f47505O, J2};
        }

        static {
            n[] nVarArrN = n();
            f47508r = nVarArrN;
            f47507o = EnumEntriesKt.enumEntries(nVarArrN);
        }

        public static n valueOf(String str) {
            return (n) Enum.valueOf(n.class, str);
        }

        public static n[] values() {
            return (n[]) f47508r.clone();
        }

        private n(String str, int i2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class w6 extends RecyclerView.Adapter {
        private final Function0 J2;
        private final kgE.fuX KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final Function4 f47510O;
        private final Function0 Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final List f47511n;
        private final View nr;
        private final boolean rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final boolean f47512t;

        public static final class j extends RecyclerView.ViewHolder {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final ViewBinding f47513n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public j(ViewBinding itemBinding) {
                super(itemBinding.getRoot());
                Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
                this.f47513n = itemBinding;
            }

            public final ViewBinding nr() {
                return this.f47513n;
            }
        }

        public /* synthetic */ class n {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[n.values().length];
                try {
                    iArr[n.f47506n.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[n.f47509t.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[n.f47505O.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[n.J2.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public w6(List menuItems, boolean z2, boolean z3, View anchor, Function4 onItemClick, Function0 showSubmenu, Function0 dismiss, kgE.fuX iapManager) {
            Intrinsics.checkNotNullParameter(menuItems, "menuItems");
            Intrinsics.checkNotNullParameter(anchor, "anchor");
            Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
            Intrinsics.checkNotNullParameter(showSubmenu, "showSubmenu");
            Intrinsics.checkNotNullParameter(dismiss, "dismiss");
            Intrinsics.checkNotNullParameter(iapManager, "iapManager");
            this.f47511n = menuItems;
            this.rl = z2;
            this.f47512t = z3;
            this.nr = anchor;
            this.f47510O = onItemClick;
            this.J2 = showSubmenu;
            this.Uo = dismiss;
            this.KN = iapManager;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit S(w6 w6Var) {
            w6Var.Uo.invoke();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void XQ(final w6 w6Var, View view, Ml ml, View view2) {
            w6Var.f47510O.invoke(view, w6Var.nr, ml, new Function0() { // from class: com.alightcreative.widget.L0y
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return xuv.w6.S(this.f47147n);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit Z(w6 w6Var) {
            w6Var.Uo.invoke();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String o(Ml ml) {
            return "APMenuItem: " + ml;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void r(w6 w6Var, View view) {
            w6Var.J2.invoke();
        }

        /* JADX WARN: Removed duplicated region for block: B:107:0x02ab  */
        /* JADX WARN: Removed duplicated region for block: B:118:0x02dc  */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: Ik, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onBindViewHolder(j holder, int i2) {
            Resources resources;
            Resources.Theme theme;
            int i3;
            int i5;
            Resources resources2;
            Resources.Theme theme2;
            int i7;
            RecyclerView recyclerView;
            Intrinsics.checkNotNullParameter(holder, "holder");
            final View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            final Ml ml = (Ml) this.f47511n.get(i2);
            int i8 = n.$EnumSwitchMapping$0[ml.Ik().ordinal()];
            int i9 = 0;
            if (i8 == 1) {
                ViewBinding viewBindingNr = holder.nr();
                Intrinsics.checkNotNull(viewBindingNr, "null cannot be cast to non-null type com.alightcreative.app.motion.databinding.AlightPopupMenuListItemBinding");
                SJ0.qf qfVar = (SJ0.qf) viewBindingNr;
                qfVar.rl.setVisibility(ml.xMQ() ? 0 : 8);
                qfVar.rl.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.widget.c7r
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        xuv.w6.r(this.f47381n, view);
                    }
                });
                if (ml.az()) {
                    View view = holder.itemView;
                    if (this.f47512t) {
                        resources2 = itemView.getResources();
                        theme2 = itemView.getContext().getTheme();
                        i7 = 2131099650;
                    } else {
                        resources2 = itemView.getResources();
                        theme2 = itemView.getContext().getTheme();
                        i7 = 2131099748;
                    }
                    view.setBackgroundColor(resources2.getColor(i7, theme2));
                } else {
                    if (this.f47512t) {
                        resources = itemView.getResources();
                        theme = itemView.getContext().getTheme();
                        i3 = 2131100868;
                    } else {
                        resources = itemView.getResources();
                        theme = itemView.getContext().getTheme();
                        i3 = 2131100871;
                    }
                    itemView.setBackgroundTintList(resources.getColorStateList(i3, theme));
                    itemView.setBackgroundColor(0);
                }
                qfVar.J2.setText(ml.gh());
                qfVar.J2.setAlpha(ml.Uo() ? 1.0f : 0.25f);
                qfVar.gh.setVisibility(ml.HI() != null ? 0 : 8);
                AppCompatTextView appCompatTextView = qfVar.gh;
                String strHI = ml.HI();
                if (strHI == null) {
                    strHI = "";
                }
                appCompatTextView.setText(strHI);
                qfVar.gh.setAlpha(ml.Uo() ? 1.0f : 0.25f);
                qfVar.rl.setEnabled(ml.Uo());
                qfVar.rl.setAlpha(ml.Uo() ? 1.0f : 0.25f);
                XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.widget.t
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return xuv.w6.o(ml);
                    }
                });
                if (ml.mUb() != null) {
                    qfVar.f9600O.setVisibility(0);
                    qfVar.f9600O.setImageDrawable(ml.mUb());
                } else if (ml.ck() != null) {
                    qfVar.f9600O.setVisibility(0);
                    qfVar.f9600O.setImageBitmap(ColorKt.makeSwatch$default(ml.ck(), 60, 60, 0.0f, 8.0f, 2, 0, 36, null));
                } else {
                    qfVar.f9600O.setVisibility(8);
                }
                qfVar.xMQ.setVisibility(ml.KN() ? 0 : 8);
                AppCompatImageView appCompatImageView = qfVar.Uo;
                if (ml.qie().isEmpty()) {
                    i5 = 8;
                    appCompatImageView.setVisibility(i5);
                    AppCompatImageView appCompatImageView2 = qfVar.KN;
                    if (ml.qie().isEmpty()) {
                    }
                } else {
                    Set setQie = ml.qie();
                    if (!(setQie instanceof Collection) || !setQie.isEmpty()) {
                        Iterator it = setQie.iterator();
                        while (it.hasNext()) {
                            if (!this.KN.Uo().contains((kgE.K) it.next())) {
                                i5 = 8;
                                break;
                            }
                        }
                    }
                    i5 = 0;
                    appCompatImageView.setVisibility(i5);
                    AppCompatImageView appCompatImageView22 = qfVar.KN;
                    if (ml.qie().isEmpty()) {
                        Set setQie2 = ml.qie();
                        if ((setQie2 instanceof Collection) && setQie2.isEmpty()) {
                            i9 = 8;
                            appCompatImageView22.setVisibility(i9);
                        } else {
                            Iterator it2 = setQie2.iterator();
                            while (it2.hasNext()) {
                                if (!this.KN.Uo().contains((kgE.K) it2.next())) {
                                    break;
                                }
                            }
                            i9 = 8;
                            appCompatImageView22.setVisibility(i9);
                        }
                    }
                }
            } else if (i8 == 2) {
                int i10 = this.rl ? 2131558479 : 2131558478;
                ViewBinding viewBindingNr2 = holder.nr();
                if (viewBindingNr2 instanceof SJ0.vd) {
                    recyclerView = ((SJ0.vd) holder.nr()).rl;
                } else {
                    if (!(viewBindingNr2 instanceof SJ0.iwV)) {
                        throw new UnsupportedOperationException();
                    }
                    recyclerView = ((SJ0.iwV) holder.nr()).f9490t;
                }
                Intrinsics.checkNotNull(recyclerView);
                recyclerView.setLayoutManager(new LinearLayoutManager(itemView.getContext(), 0, false));
                recyclerView.setAdapter(new j(ml.J2(), i10, new Function0() { // from class: com.alightcreative.widget.cA
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return xuv.w6.Z(this.f47382n);
                    }
                }));
                Iterator it3 = ml.J2().iterator();
                int i11 = 0;
                while (true) {
                    if (!it3.hasNext()) {
                        i11 = -1;
                        break;
                    } else if (((Ml) it3.next()).az()) {
                        break;
                    } else {
                        i11++;
                    }
                }
                recyclerView.scrollToPosition(i11);
                if (recyclerView.getItemDecorationCount() > 0) {
                    int itemDecorationCount = recyclerView.getItemDecorationCount();
                    while (i9 < itemDecorationCount) {
                        recyclerView.removeItemDecorationAt(i9);
                        i9++;
                    }
                }
                if (ml.nr()) {
                    Context context = itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    recyclerView.addItemDecoration(new I28(context));
                }
            } else if (i8 == 3) {
                ViewBinding viewBindingNr3 = holder.nr();
                Intrinsics.checkNotNull(viewBindingNr3, "null cannot be cast to non-null type com.alightcreative.app.motion.databinding.AlightPopupMenuListItemDropdownBinding");
                SJ0.lej lejVar = (SJ0.lej) viewBindingNr3;
                lejVar.f9522t.setText(ml.gh());
                lejVar.nr.setText(((Ml) ml.J2().get(ml.ty())).gh());
            } else {
                if (i8 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                ViewBinding viewBindingNr4 = holder.nr();
                Intrinsics.checkNotNull(viewBindingNr4, "null cannot be cast to non-null type com.alightcreative.app.motion.databinding.AlightPopupMenuListItemCheckboxBinding");
                SJ0.Ln ln2 = (SJ0.Ln) viewBindingNr4;
                ln2.f9199t.setText(ml.gh());
                ln2.rl.setActivated(ml.O());
            }
            itemView.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.widget.g9
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    xuv.w6.XQ(this.f47407n, itemView, ml, view2);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: WPU, reason: merged with bridge method [inline-methods] */
        public j onCreateViewHolder(ViewGroup parent, int i2) {
            ViewBinding viewBindingT;
            Intrinsics.checkNotNullParameter(parent, "parent");
            if (i2 != 2131558480) {
                switch (i2) {
                    case 2131558473:
                        viewBindingT = SJ0.qf.t(LayoutInflater.from(parent.getContext()), parent, false);
                        Intrinsics.checkNotNull(viewBindingT);
                        break;
                    case 2131558474:
                        viewBindingT = SJ0.Ln.t(LayoutInflater.from(parent.getContext()), parent, false);
                        Intrinsics.checkNotNull(viewBindingT);
                        break;
                    case 2131558475:
                        viewBindingT = SJ0.lej.t(LayoutInflater.from(parent.getContext()), parent, false);
                        Intrinsics.checkNotNull(viewBindingT);
                        break;
                    case 2131558476:
                        viewBindingT = SJ0.iwV.t(LayoutInflater.from(parent.getContext()), parent, false);
                        Intrinsics.checkNotNull(viewBindingT);
                        break;
                    default:
                        throw new UnsupportedOperationException();
                }
            } else {
                viewBindingT = SJ0.vd.t(LayoutInflater.from(parent.getContext()), parent, false);
                Intrinsics.checkNotNull(viewBindingT);
            }
            return new j(viewBindingT);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f47511n.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i2) {
            int i3 = n.$EnumSwitchMapping$0[((Ml) this.f47511n.get(i2)).Ik().ordinal()];
            if (i3 == 1) {
                return 2131558473;
            }
            if (i3 == 2) {
                return this.rl ? 2131558480 : 2131558476;
            }
            if (i3 == 3) {
                return 2131558475;
            }
            if (i3 == 4) {
                return 2131558474;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public xuv(Context context, kgE.fuX iapManager, boolean z2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(iapManager, "iapManager");
        this.f47496n = context;
        this.rl = iapManager;
        this.f47497t = z2;
        this.nr = new ArrayList();
        this.f47495O = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E2(SJ0.D d2, Map.Entry entry) {
        d2.ck.setText((CharSequence) entry.getValue());
    }

    public static /* synthetic */ xuv Ik(xuv xuvVar, String str, int i2, boolean z2, SolidColor solidColor, boolean z3, String str2, boolean z4, Function0 function0, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        if ((i3 & 8) != 0) {
            solidColor = null;
        }
        if ((i3 & 16) != 0) {
            z3 = false;
        }
        if ((i3 & 32) != 0) {
            str2 = null;
        }
        if ((i3 & 64) != 0) {
            z4 = false;
        }
        return xuvVar.HI(str, i2, z2, solidColor, z3, str2, z4, function0);
    }

    static /* synthetic */ xuv S(xuv xuvVar, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        return xuvVar.XQ(z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit X(SJ0.D d2) {
        d2.HI.setTranslationX(d2.Ik.getWidth() / 2);
        d2.HI.setVisibility(0);
        d2.HI.setAlpha(1.0f);
        d2.HI.animate().withStartAction(new Runnable() { // from class: com.alightcreative.widget.RGN
            @Override // java.lang.Runnable
            public final void run() {
                xuv.T();
            }
        }).translationX(0.0f).setInterpolator(new OvershootInterpolator()).setDuration(250L).start();
        return Unit.INSTANCE;
    }

    private final xuv XQ(boolean z2) {
        if (!this.f47495O.isEmpty()) {
            this.nr.add(new Ml(n.f47509t, null, z2, false, null, false, null, 0, CollectionsKt.toList(this.f47495O), null, null, false, false, null, false, 32506, null));
            this.f47495O.clear();
        }
        return this;
    }

    private final void Z(int i2) {
        Function1 function1 = this.KN;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(i2));
        }
    }

    public static /* synthetic */ xuv ck(xuv xuvVar, String str, int i2, int i3, boolean z2, SolidColor solidColor, boolean z3, String str2, boolean z4, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            z2 = false;
        }
        if ((i5 & 16) != 0) {
            solidColor = null;
        }
        if ((i5 & 32) != 0) {
            z3 = false;
        }
        if ((i5 & 64) != 0) {
            str2 = null;
        }
        if ((i5 & 128) != 0) {
            z4 = false;
        }
        return xuvVar.ty(str, i2, i3, z2, solidColor, z3, str2, z4);
    }

    public static /* synthetic */ void iF(xuv xuvVar, View view, Set set, Function1 function1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            set = null;
        }
        if ((i2 & 4) != 0) {
            function1 = null;
        }
        xuvVar.te(view, set, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nHg(final SJ0.D d2, View view) {
        d2.HI.animate().translationX(d2.Ik.getWidth()).alpha(0.0f).setInterpolator(new AccelerateInterpolator()).setDuration(200L).withEndAction(new Runnable() { // from class: com.alightcreative.widget.hQ
            @Override // java.lang.Runnable
            public final void run() {
                xuv.s7N(d2);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nY(SJ0.lej lejVar, Ml ml) {
        lejVar.nr.setText(ml.gh());
        Function0 function0T = ml.t();
        if (function0T != null) {
            function0T.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s7N(SJ0.D d2) {
        d2.HI.setVisibility(4);
    }

    public final xuv HI(String label, int i2, boolean z2, SolidColor solidColor, boolean z3, String str, boolean z4, Function0 action) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(action, "action");
        S(this, false, 1, null);
        this.nr.add(new Ml(null, i2 != 0 ? ResourcesCompat.J2(this.f47496n.getResources(), i2, this.f47496n.getTheme()) : null, false, false, label, false, action, 0, null, null, solidColor, z2, z3, str, z4, 941, null));
        return this;
    }

    public final kgE.fuX WPU() {
        return this.rl;
    }

    public final xuv aYN(Function1 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.KN = listener;
        return this;
    }

    public final void g(int i2) {
        this.J2 = i2;
    }

    public final void o() {
        if (this.nr.isEmpty()) {
            return;
        }
        List list = this.nr;
        int lastIndex = CollectionsKt.getLastIndex(list);
        List list2 = this.nr;
        list.set(lastIndex, Ml.rl((Ml) list2.get(CollectionsKt.getLastIndex(list2)), null, null, false, false, null, false, null, 0, null, null, null, false, false, null, false, 32759, null));
    }

    public final void te(View anchor, Set set, final Function1 function1) {
        U4 u4;
        final SJ0.D d2;
        final xuv xuvVar = this;
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        U4 u42 = null;
        S(xuvVar, false, 1, null);
        final PopupWindow popupWindow = new PopupWindow(xuvVar.f47496n);
        int i2 = xuvVar.J2;
        if (i2 > 0) {
            popupWindow.setWidth(i2);
        }
        popupWindow.setOutsideTouchable(true);
        popupWindow.setTouchable(true);
        popupWindow.setFocusable(true);
        popupWindow.setBackgroundDrawable(xuvVar.f47496n.getResources().getDrawable(xuvVar.f47497t ? 2131232190 : 2131232189, xuvVar.f47496n.getTheme()));
        final SJ0.D dT = SJ0.D.t(LayoutInflater.from(xuvVar.f47496n));
        Intrinsics.checkNotNullExpressionValue(dT, "inflate(...)");
        popupWindow.setContentView(dT.getRoot());
        dT.Ik.setLayoutManager(new LinearLayoutManager(xuvVar.f47496n, 1, false));
        dT.Ik.setAdapter(new w6(xuvVar.nr, xuvVar.Uo, xuvVar.f47497t, anchor, new CN3(xuvVar), new Function0() { // from class: com.alightcreative.widget.FKk
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return xuv.X(dT);
            }
        }, new Function0() { // from class: com.alightcreative.widget.Fl
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return xuv.N(popupWindow);
            }
        }, xuvVar.rl));
        dT.rl.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.widget.R6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xuv.nHg(dT, view);
            }
        });
        dT.az.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.widget.RzR
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xuv.wTp(popupWindow, view);
            }
        });
        dT.ty.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.widget.pq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xuv.v(this.f47468n, popupWindow, view);
            }
        });
        if (set != null) {
            dT.J2.setVisibility(set.contains(U4.f47301Z) ? 0 : 8);
            dT.qie.setVisibility(set.contains(U4.f47299S) ? 0 : 8);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                U4 u43 = (U4) it.next();
                switch (Wre.$EnumSwitchMapping$1[u43.ordinal()]) {
                    case 1:
                        dT.f9109O.setTag(u43);
                        linkedHashMap.put(dT.f9109O, xuvVar.f47496n.getString(2132019826));
                        break;
                    case 2:
                        dT.nr.setTag(u43);
                        linkedHashMap.put(dT.nr, xuvVar.f47496n.getString(2132019825));
                        break;
                    case 3:
                        dT.f9111t.setTag(u43);
                        linkedHashMap.put(dT.f9111t, xuvVar.f47496n.getString(2132019824));
                        break;
                    case 4:
                        dT.mUb.setTag(u43);
                        linkedHashMap.put(dT.mUb, xuvVar.f47496n.getString(2132019835));
                        break;
                    case 5:
                        dT.J2.setTag(u43);
                        linkedHashMap.put(dT.J2, xuvVar.f47496n.getString(2132019842));
                        break;
                    case 6:
                        dT.qie.setTag(u43);
                        linkedHashMap.put(dT.qie, xuvVar.f47496n.getString(2132019844));
                        break;
                    case 7:
                        dT.Uo.setTag(u43);
                        linkedHashMap.put(dT.Uo, xuvVar.f47496n.getString(2132019832));
                        break;
                    case 8:
                        dT.gh.setTag(u43);
                        linkedHashMap.put(dT.gh, xuvVar.f47496n.getString(2132019840));
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
            for (final Map.Entry entry : linkedHashMap.entrySet()) {
                Object tag = ((View) entry.getKey()).getTag();
                final U4 u44 = tag instanceof U4 ? (U4) tag : u42;
                if (u44 != null) {
                    ((View) entry.getKey()).setEnabled(u44.rl());
                    if (u44.rl()) {
                        ((View) entry.getKey()).setActivated(u44.t());
                    }
                    U4 u45 = u42;
                    d2 = dT;
                    u4 = u45;
                    ((View) entry.getKey()).setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.widget.kO4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            xuv.fD(u44, function1, d2, entry, popupWindow, xuvVar, view);
                        }
                    });
                } else {
                    u4 = u42;
                    d2 = dT;
                }
                xuvVar = this;
                dT = d2;
                u42 = u4;
            }
        }
        popupWindow.showAsDropDown(anchor);
    }

    public final xuv ty(String label, final int i2, int i3, boolean z2, SolidColor solidColor, boolean z3, String str, boolean z4) {
        Intrinsics.checkNotNullParameter(label, "label");
        S(this, false, 1, null);
        return HI(label, i3, z2, solidColor, z3, str, z4, new Function0() { // from class: com.alightcreative.widget.M5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return xuv.r(this.f47163n, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N(PopupWindow popupWindow) {
        popupWindow.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ViF(View view, View view2, Ml ml, Function0 function0) {
        if (!ml.Uo()) {
            return;
        }
        int i2 = Wre.$EnumSwitchMapping$0[ml.Ik().ordinal()];
        if (i2 != 1 && i2 != 2 && i2 != 3) {
            if (i2 == 4) {
                final SJ0.lej lejVarN = SJ0.lej.n(view);
                Intrinsics.checkNotNullExpressionValue(lejVarN, "bind(...)");
                xuv xuvVar = new xuv(this.f47496n, this.rl, false, 4, null);
                for (final Ml ml2 : ml.J2()) {
                    Ik(xuvVar, ml2.gh(), 0, false, null, false, null, false, new Function0() { // from class: com.alightcreative.widget.qYU
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return xuv.nY(lejVarN, ml2);
                        }
                    }, 126, null);
                }
                xuvVar.J2 = lejVarN.nr.getWidth();
                iF(xuvVar, view2, null, null, 6, null);
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
        Function0 function0T = ml.t();
        if (function0T != null) {
            function0T.invoke();
        }
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(PopupWindow popupWindow, SJ0.D d2, xuv xuvVar) {
        if (popupWindow.isShowing()) {
            d2.ck.setAlpha(1.0f);
            d2.ck.setText(xuvVar.f47496n.getString(2132019841));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fD(U4 u4, Function1 function1, final SJ0.D d2, final Map.Entry entry, final PopupWindow popupWindow, final xuv xuvVar, View view) {
        view.setActivated(!u4.t());
        if (function1 != null) {
            u4.J2(!u4.t());
            function1.invoke(u4);
        }
        if (view.isActivated()) {
            d2.ck.animate().withStartAction(new Runnable() { // from class: com.alightcreative.widget.YzO
                @Override // java.lang.Runnable
                public final void run() {
                    xuv.E2(d2, entry);
                }
            }).alpha(0.0f).setDuration(1000L).withEndAction(new Runnable() { // from class: com.alightcreative.widget.QaP
                @Override // java.lang.Runnable
                public final void run() {
                    xuv.e(popupWindow, d2, xuvVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(xuv xuvVar, int i2) {
        xuvVar.Z(i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(xuv xuvVar, PopupWindow popupWindow, View view) {
        xuvVar.Z(2131361947);
        popupWindow.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wTp(PopupWindow popupWindow, View view) {
        popupWindow.dismiss();
    }

    public /* synthetic */ xuv(Context context, kgE.fuX fux, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, fux, (i2 & 4) != 0 ? true : z2);
    }
}
