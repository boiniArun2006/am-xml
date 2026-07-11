package com.alightcreative.widget;

import SJ0.C1465u;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
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
import com.alightcreative.widget.nKK;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class nKK {
    private int J2;
    private boolean KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final List f47434O;
    private int Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f47435n;
    private final List nr;
    private final kgE.fuX rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f47436t;
    private Function1 xMQ;

    public /* synthetic */ class CN3 {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[n.values().length];
            try {
                iArr[n.f47447n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n.J2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n.f47450t.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[n.f47445O.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[n.f47449r.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class I28 {
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class Ml extends BaseAdapter {
        private final kgE.fuX J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final boolean f47437O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final List f47438n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final Function0 f47439r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final boolean f47440t;

        public /* synthetic */ class j {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[n.values().length];
                try {
                    iArr[n.f47447n.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[n.f47450t.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[n.f47445O.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[n.J2.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[n.f47449r.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @Override // android.widget.Adapter
        public long getItemId(int i2) {
            return i2;
        }

        public Ml(List menuItems, boolean z2, boolean z3, kgE.fuX iapManager, Function0 dismiss) {
            Intrinsics.checkNotNullParameter(menuItems, "menuItems");
            Intrinsics.checkNotNullParameter(iapManager, "iapManager");
            Intrinsics.checkNotNullParameter(dismiss, "dismiss");
            this.f47438n = menuItems;
            this.f47440t = z2;
            this.f47437O = z3;
            this.J2 = iapManager;
            this.f47439r = dismiss;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit nr(Ml ml) {
            ml.f47439r.invoke();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String t(w6 w6Var) {
            return "APMenuItem: " + w6Var;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f47438n.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i2) {
            return this.f47438n.get(i2);
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i2) {
            return ((w6) this.f47438n.get(i2)).HI().ordinal();
        }

        /* JADX WARN: Removed duplicated region for block: B:109:0x02ae  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x027d  */
        @Override // android.widget.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public View getView(int i2, View view, ViewGroup parent) {
            View viewInflate;
            Resources resources;
            Resources.Theme theme;
            int i3;
            int i5;
            Resources resources2;
            Resources.Theme theme2;
            int i7;
            int i8;
            Intrinsics.checkNotNullParameter(parent, "parent");
            final w6 w6Var = (w6) this.f47438n.get(i2);
            int i9 = 0;
            if (view == null) {
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
                int i10 = j.$EnumSwitchMapping$0[((w6) this.f47438n.get(i2)).HI().ordinal()];
                if (i10 == 1) {
                    i8 = 2131558473;
                } else if (i10 == 2) {
                    i8 = this.f47440t ? 2131558480 : 2131558476;
                } else if (i10 == 3) {
                    i8 = 2131558475;
                } else if (i10 == 4) {
                    i8 = 2131558474;
                } else {
                    if (i10 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i8 = 2131558481;
                }
                viewInflate = layoutInflaterFrom.inflate(i8, parent, false);
            } else {
                viewInflate = view;
            }
            int i11 = j.$EnumSwitchMapping$0[w6Var.HI().ordinal()];
            if (i11 == 1) {
                SJ0.qf qfVarN = SJ0.qf.n(viewInflate);
                Intrinsics.checkNotNullExpressionValue(qfVarN, "bind(...)");
                if (w6Var.gh()) {
                    if (this.f47437O) {
                        resources2 = viewInflate.getResources();
                        theme2 = viewInflate.getContext().getTheme();
                        i7 = 2131099650;
                    } else {
                        resources2 = viewInflate.getResources();
                        theme2 = viewInflate.getContext().getTheme();
                        i7 = 2131099748;
                    }
                    viewInflate.setBackgroundColor(resources2.getColor(i7, theme2));
                } else {
                    if (this.f47437O) {
                        resources = viewInflate.getResources();
                        theme = viewInflate.getContext().getTheme();
                        i3 = 2131100868;
                    } else {
                        resources = viewInflate.getResources();
                        theme = viewInflate.getContext().getTheme();
                        i3 = 2131100871;
                    }
                    viewInflate.setBackgroundTintList(resources.getColorStateList(i3, theme));
                    viewInflate.setBackgroundColor(0);
                }
                qfVarN.J2.setText(w6Var.xMQ());
                qfVarN.J2.setAlpha(w6Var.Uo() ? 1.0f : 0.25f);
                XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.widget.DAz
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return nKK.Ml.t(w6Var);
                    }
                });
                if (w6Var.KN() != null) {
                    qfVarN.f9600O.setVisibility(0);
                    qfVarN.f9600O.setImageDrawable(w6Var.KN());
                } else if (w6Var.ty() != null) {
                    qfVarN.f9600O.setVisibility(0);
                    qfVarN.f9600O.setImageBitmap(ColorKt.makeSwatch$default(w6Var.ty(), 60, 60, 0.0f, 8.0f, 2, 0, 36, null));
                } else {
                    qfVarN.f9600O.setVisibility(8);
                }
                AppCompatImageView appCompatImageView = qfVarN.Uo;
                if (w6Var.mUb().isEmpty()) {
                    i5 = 8;
                    appCompatImageView.setVisibility(i5);
                    AppCompatImageView appCompatImageView2 = qfVarN.KN;
                    if (w6Var.mUb().isEmpty()) {
                    }
                } else {
                    Set setMUb = w6Var.mUb();
                    if (!(setMUb instanceof Collection) || !setMUb.isEmpty()) {
                        Iterator it = setMUb.iterator();
                        while (it.hasNext()) {
                            if (!this.J2.Uo().contains((kgE.K) it.next())) {
                                i5 = 8;
                                break;
                            }
                        }
                    }
                    i5 = 0;
                    appCompatImageView.setVisibility(i5);
                    AppCompatImageView appCompatImageView22 = qfVarN.KN;
                    if (w6Var.mUb().isEmpty()) {
                        Set setMUb2 = w6Var.mUb();
                        if ((setMUb2 instanceof Collection) && setMUb2.isEmpty()) {
                            i9 = 8;
                            appCompatImageView22.setVisibility(i9);
                        } else {
                            Iterator it2 = setMUb2.iterator();
                            while (it2.hasNext()) {
                                if (!this.J2.Uo().contains((kgE.K) it2.next())) {
                                    break;
                                }
                            }
                            i9 = 8;
                            appCompatImageView22.setVisibility(i9);
                        }
                    }
                }
            } else if (i11 == 2) {
                boolean z2 = this.f47440t;
                int i12 = z2 ? 2131558479 : 2131558478;
                RecyclerView recyclerView = z2 ? SJ0.vd.n(viewInflate).rl : SJ0.iwV.n(viewInflate).f9490t;
                Intrinsics.checkNotNull(recyclerView);
                recyclerView.setLayoutManager(new LinearLayoutManager(parent.getContext(), 0, false));
                recyclerView.setAdapter(new j(w6Var.J2(), i12, new Function0() { // from class: com.alightcreative.widget.u
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return nKK.Ml.nr(this.f47489n);
                    }
                }));
                Iterator it3 = w6Var.J2().iterator();
                int i13 = 0;
                while (true) {
                    if (!it3.hasNext()) {
                        i13 = -1;
                        break;
                    }
                    if (((w6) it3.next()).gh()) {
                        break;
                    }
                    i13++;
                }
                recyclerView.scrollToPosition(i13);
                if (recyclerView.getItemDecorationCount() > 0) {
                    int itemDecorationCount = recyclerView.getItemDecorationCount();
                    while (i9 < itemDecorationCount) {
                        recyclerView.removeItemDecorationAt(i9);
                        i9++;
                    }
                }
                if (w6Var.nr()) {
                    Context context = parent.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    recyclerView.addItemDecoration(new Wre(context));
                }
            } else if (i11 == 3) {
                SJ0.lej lejVarN = SJ0.lej.n(viewInflate);
                Intrinsics.checkNotNullExpressionValue(lejVarN, "bind(...)");
                lejVarN.f9522t.setText(w6Var.xMQ());
                lejVarN.nr.setText(((w6) w6Var.J2().get(w6Var.qie())).xMQ());
            } else if (i11 == 4) {
                SJ0.Ln lnN = SJ0.Ln.n(viewInflate);
                Intrinsics.checkNotNullExpressionValue(lnN, "bind(...)");
                lnN.f9199t.setText(w6Var.xMQ());
                lnN.rl.setActivated(w6Var.O());
            } else {
                if (i11 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                Intrinsics.checkNotNullExpressionValue(SJ0.Lu.n(viewInflate), "bind(...)");
                w6Var.az();
            }
            Intrinsics.checkNotNull(viewInflate);
            return viewInflate;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return n.values().length;
        }
    }

    private static final class Wre extends RecyclerView.ItemDecoration {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Drawable f47441n;

        public Wre(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.f47441n = ContextCompat.getDrawable(context, 2131231441);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void gh(Canvas c2, RecyclerView parent, RecyclerView.State state) {
            Intrinsics.checkNotNullParameter(c2, "c");
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(state, "state");
            int top = parent.getChildAt(0).getTop();
            int dimensionPixelOffset = parent.getResources().getDimensionPixelOffset(2131165283);
            Drawable drawable = this.f47441n;
            if (drawable != null) {
                drawable.setBounds(0, top, parent.getWidth(), dimensionPixelOffset + top);
            }
            Drawable drawable2 = this.f47441n;
            if (drawable2 != null) {
                drawable2.draw(c2);
            }
            super.gh(c2, parent, state);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class j extends RecyclerView.Adapter {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final List f47442n;
        private final int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Function0 f47443t;

        /* JADX INFO: renamed from: com.alightcreative.widget.nKK$j$j, reason: collision with other inner class name */
        public final class C0686j extends RecyclerView.ViewHolder {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final ViewBinding f47444n;
            final /* synthetic */ j rl;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0686j(j jVar, ViewBinding itemBinding) {
                super(itemBinding.getRoot());
                Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
                this.rl = jVar;
                this.f47444n = itemBinding;
            }

            public final void O(final w6 item) {
                Intrinsics.checkNotNullParameter(item, "item");
                ViewBinding viewBinding = this.f47444n;
                if (viewBinding instanceof SJ0.rv6) {
                    ((SJ0.rv6) viewBinding).rl.setImageDrawable(item.KN());
                    ((SJ0.rv6) this.f47444n).f9630t.setVisibility(item.gh() ? 0 : 8);
                } else if (viewBinding instanceof SJ0.M) {
                    ((SJ0.M) viewBinding).rl.setImageDrawable(item.KN());
                    ((SJ0.M) this.f47444n).f9203t.setVisibility(item.gh() ? 0 : 8);
                }
                View view = this.itemView;
                final j jVar = this.rl;
                view.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.widget.Ew
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        nKK.j.C0686j.J2(item, jVar, view2);
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void J2(w6 w6Var, j jVar, View view) {
                Function0 function0T = w6Var.t();
                if (function0T != null) {
                    function0T.invoke();
                }
                jVar.qie().invoke();
            }
        }

        public j(List inlineItems, int i2, Function0 dismiss) {
            Intrinsics.checkNotNullParameter(inlineItems, "inlineItems");
            Intrinsics.checkNotNullParameter(dismiss, "dismiss");
            this.f47442n = inlineItems;
            this.rl = i2;
            this.f47443t = dismiss;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: az, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(C0686j holder, int i2) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            holder.O((w6) this.f47442n.get(i2));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f47442n.size();
        }

        public final Function0 qie() {
            return this.f47443t;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: ty, reason: merged with bridge method [inline-methods] */
        public C0686j onCreateViewHolder(ViewGroup parent, int i2) {
            ViewBinding viewBindingT;
            Intrinsics.checkNotNullParameter(parent, "parent");
            switch (i2) {
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
            return new C0686j(this, viewBindingT);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class n {

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f47446Z;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final /* synthetic */ n[] f47448o;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f47447n = new n("Normal", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final n f47450t = new n("Inline", 1);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final n f47445O = new n("Dropdown", 2);
        public static final n J2 = new n("Radio", 3);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final n f47449r = new n("Spinner", 4);

        private static final /* synthetic */ n[] n() {
            return new n[]{f47447n, f47450t, f47445O, J2, f47449r};
        }

        static {
            n[] nVarArrN = n();
            f47448o = nVarArrN;
            f47446Z = EnumEntriesKt.enumEntries(nVarArrN);
        }

        public static n valueOf(String str) {
            return (n) Enum.valueOf(n.class, str);
        }

        public static n[] values() {
            return (n[]) f47448o.clone();
        }

        private n(String str, int i2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class w6 {
        private final boolean J2;
        private final int KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final String f47451O;
        private final Function0 Uo;
        private final SolidColor gh;
        private final Set mUb;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final n f47452n;
        private final boolean nr;
        private final boolean qie;
        private final Drawable rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final boolean f47453t;
        private final List xMQ;

        public w6(n type, Drawable drawable, boolean z2, boolean z3, String label, boolean z4, Function0 function0, int i2, List children, Set requiredBenefits, SolidColor solidColor, boolean z5, I28 i28) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(children, "children");
            Intrinsics.checkNotNullParameter(requiredBenefits, "requiredBenefits");
            this.f47452n = type;
            this.rl = drawable;
            this.f47453t = z2;
            this.nr = z3;
            this.f47451O = label;
            this.J2 = z4;
            this.Uo = function0;
            this.KN = i2;
            this.xMQ = children;
            this.mUb = requiredBenefits;
            this.gh = solidColor;
            this.qie = z5;
        }

        public static /* synthetic */ w6 rl(w6 w6Var, n nVar, Drawable drawable, boolean z2, boolean z3, String str, boolean z4, Function0 function0, int i2, List list, Set set, SolidColor solidColor, boolean z5, I28 i28, int i3, Object obj) {
            I28 i282;
            if ((i3 & 1) != 0) {
                nVar = w6Var.f47452n;
            }
            Drawable drawable2 = (i3 & 2) != 0 ? w6Var.rl : drawable;
            boolean z6 = (i3 & 4) != 0 ? w6Var.f47453t : z2;
            boolean z7 = (i3 & 8) != 0 ? w6Var.nr : z3;
            String str2 = (i3 & 16) != 0 ? w6Var.f47451O : str;
            boolean z9 = (i3 & 32) != 0 ? w6Var.J2 : z4;
            Function0 function02 = (i3 & 64) != 0 ? w6Var.Uo : function0;
            int i5 = (i3 & 128) != 0 ? w6Var.KN : i2;
            List list2 = (i3 & 256) != 0 ? w6Var.xMQ : list;
            Set set2 = (i3 & 512) != 0 ? w6Var.mUb : set;
            SolidColor solidColor2 = (i3 & 1024) != 0 ? w6Var.gh : solidColor;
            boolean z10 = (i3 & 2048) != 0 ? w6Var.qie : z5;
            if ((i3 & 4096) != 0) {
                w6Var.getClass();
                i282 = null;
            } else {
                i282 = i28;
            }
            return w6Var.n(nVar, drawable2, z6, z7, str2, z9, function02, i5, list2, set2, solidColor2, z10, i282);
        }

        public final I28 az() {
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof w6)) {
                return false;
            }
            w6 w6Var = (w6) obj;
            return this.f47452n == w6Var.f47452n && Intrinsics.areEqual(this.rl, w6Var.rl) && this.f47453t == w6Var.f47453t && this.nr == w6Var.nr && Intrinsics.areEqual(this.f47451O, w6Var.f47451O) && this.J2 == w6Var.J2 && Intrinsics.areEqual(this.Uo, w6Var.Uo) && this.KN == w6Var.KN && Intrinsics.areEqual(this.xMQ, w6Var.xMQ) && Intrinsics.areEqual(this.mUb, w6Var.mUb) && Intrinsics.areEqual(this.gh, w6Var.gh) && this.qie == w6Var.qie && Intrinsics.areEqual((Object) null, (Object) null);
        }

        public int hashCode() {
            int iHashCode = this.f47452n.hashCode() * 31;
            Drawable drawable = this.rl;
            int iHashCode2 = (((((((((iHashCode + (drawable == null ? 0 : drawable.hashCode())) * 31) + Boolean.hashCode(this.f47453t)) * 31) + Boolean.hashCode(this.nr)) * 31) + this.f47451O.hashCode()) * 31) + Boolean.hashCode(this.J2)) * 31;
            Function0 function0 = this.Uo;
            int iHashCode3 = (((((((iHashCode2 + (function0 == null ? 0 : function0.hashCode())) * 31) + Integer.hashCode(this.KN)) * 31) + this.xMQ.hashCode()) * 31) + this.mUb.hashCode()) * 31;
            SolidColor solidColor = this.gh;
            return (((iHashCode3 + (solidColor != null ? solidColor.hashCode() : 0)) * 31) + Boolean.hashCode(this.qie)) * 31;
        }

        public final w6 n(n type, Drawable drawable, boolean z2, boolean z3, String label, boolean z4, Function0 function0, int i2, List children, Set requiredBenefits, SolidColor solidColor, boolean z5, I28 i28) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(children, "children");
            Intrinsics.checkNotNullParameter(requiredBenefits, "requiredBenefits");
            return new w6(type, drawable, z2, z3, label, z4, function0, i2, children, requiredBenefits, solidColor, z5, i28);
        }

        public String toString() {
            return "MenuItem(type=" + this.f47452n + ", icon=" + this.rl + ", addTopDivider=" + this.f47453t + ", enabled=" + this.nr + ", label=" + this.f47451O + ", checked=" + this.J2 + ", action=" + this.Uo + ", selectedOption=" + this.KN + ", children=" + this.xMQ + ", requiredBenefits=" + this.mUb + ", swatch=" + this.gh + ", selected=" + this.qie + ", spinnerInfo=" + ((Object) null) + ")";
        }

        public final n HI() {
            return this.f47452n;
        }

        public final List J2() {
            return this.xMQ;
        }

        public final Drawable KN() {
            return this.rl;
        }

        public final boolean O() {
            return this.J2;
        }

        public final boolean Uo() {
            return this.nr;
        }

        public final boolean gh() {
            return this.qie;
        }

        public final Set mUb() {
            return this.mUb;
        }

        public final boolean nr() {
            return this.f47453t;
        }

        public final int qie() {
            return this.KN;
        }

        public final Function0 t() {
            return this.Uo;
        }

        public final SolidColor ty() {
            return this.gh;
        }

        public final String xMQ() {
            return this.f47451O;
        }

        public /* synthetic */ w6(n nVar, Drawable drawable, boolean z2, boolean z3, String str, boolean z4, Function0 function0, int i2, List list, Set set, SolidColor solidColor, boolean z5, I28 i28, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? n.f47447n : nVar, (i3 & 2) != 0 ? null : drawable, (i3 & 4) != 0 ? false : z2, (i3 & 8) != 0 ? true : z3, (i3 & 16) != 0 ? "" : str, (i3 & 32) != 0 ? false : z4, (i3 & 64) != 0 ? null : function0, (i3 & 128) != 0 ? 0 : i2, (i3 & 256) != 0 ? CollectionsKt.emptyList() : list, (i3 & 512) != 0 ? SetsKt.emptySet() : set, (i3 & 1024) != 0 ? null : solidColor, (i3 & 2048) == 0 ? z5 : false, (i3 & 4096) != 0 ? null : i28);
        }
    }

    public nKK(Context context, kgE.fuX iapManager, boolean z2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(iapManager, "iapManager");
        this.f47435n = context;
        this.rl = iapManager;
        this.f47436t = z2;
        this.nr = new ArrayList();
        this.f47434O = new ArrayList();
    }

    public final nKK gh(int i2, final int i3, int i5, boolean z2, SolidColor solidColor) {
        iF(this, false, 1, null);
        return qie(i2, i5, z2, solidColor, new Function0() { // from class: com.alightcreative.widget.SPz
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return nKK.Ik(this.f47237n, i3);
            }
        });
    }

    public static /* synthetic */ nKK HI(nKK nkk, int i2, int i3, boolean z2, SolidColor solidColor, Function0 function0, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i3 = 0;
        }
        if ((i5 & 4) != 0) {
            z2 = false;
        }
        if ((i5 & 8) != 0) {
            solidColor = null;
        }
        return nkk.qie(i2, i3, z2, solidColor, function0);
    }

    public static /* synthetic */ void N(nKK nkk, View view, int i2, int i3, Function0 function0, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            function0 = null;
        }
        nkk.T(view, i2, i3, function0);
    }

    public static /* synthetic */ nKK S(nKK nkk, Set set, int i2, int i3, Function0 function0, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        return nkk.o(set, i2, i3, function0);
    }

    public static /* synthetic */ nKK XQ(nKK nkk, Set set, int i2, int i3, int i5, int i7, Object obj) {
        if ((i7 & 8) != 0) {
            i5 = 0;
        }
        return nkk.r(set, i2, i3, i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bzg(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static /* synthetic */ nKK ck(nKK nkk, String str, Drawable drawable, boolean z2, SolidColor solidColor, Function0 function0, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            drawable = null;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        if ((i2 & 8) != 0) {
            solidColor = null;
        }
        return nkk.az(str, drawable, z2, solidColor, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(SJ0.lej lejVar, w6 w6Var) {
        lejVar.nr.setText(w6Var.xMQ());
        Function0 function0T = w6Var.t();
        if (function0T != null) {
            function0T.invoke();
        }
        return Unit.INSTANCE;
    }

    private final void g(int i2) {
        Function1 function1 = this.xMQ;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(i2));
        }
    }

    public static /* synthetic */ nKK iF(nKK nkk, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        return nkk.te(z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String nHg(nKK nkk) {
        return "TESTTEST :: popupWidth :: " + nkk.J2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rV9(C1465u c1465u, View view, int i2, int i3, int i5, int i7) {
        c1465u.nr.setVisibility(c1465u.f9659t.canScrollVertically(-1) ? 0 : 4);
        c1465u.rl.setVisibility(c1465u.f9659t.canScrollVertically(1) ? 0 : 4);
    }

    public static /* synthetic */ nKK ty(nKK nkk, int i2, int i3, int i5, boolean z2, SolidColor solidColor, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            i5 = 0;
        }
        if ((i7 & 8) != 0) {
            z2 = false;
        }
        if ((i7 & 16) != 0) {
            solidColor = null;
        }
        return nkk.gh(i2, i3, i5, z2, solidColor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wTp(nKK nkk, View view, final PopupWindow popupWindow, AdapterView adapterView, View view2, int i2, long j2) {
        w6 w6Var = (w6) nkk.nr.get(i2);
        Intrinsics.checkNotNull(view2);
        nkk.E2(view2, view, w6Var, new Function0() { // from class: com.alightcreative.widget.ci
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return nKK.v(popupWindow);
            }
        });
    }

    public final void T(final View anchor, int i2, int i3, final Function0 function0) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        iF(this, false, 1, null);
        XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.widget.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return nKK.nHg(this.f47380n);
            }
        });
        if (this.J2 == 0) {
            this.J2 = anchor.getResources().getDimensionPixelSize(2131166272);
        }
        if (this.Uo == 0) {
            this.Uo = this.nr.size() >= 8 ? anchor.getResources().getDimensionPixelSize(2131165282) * 8 : anchor.getResources().getDimensionPixelSize(2131165282) * this.nr.size();
        }
        final PopupWindow popupWindow = new PopupWindow(this.f47435n);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setTouchable(true);
        popupWindow.setFocusable(true);
        popupWindow.setBackgroundDrawable(ResourcesCompat.J2(this.f47435n.getResources(), this.f47436t ? 2131232190 : 2131232189, this.f47435n.getTheme()));
        popupWindow.setContentView(View.inflate(this.f47435n, 2131558472, null));
        final C1465u c1465uN = C1465u.n(popupWindow.getContentView());
        Intrinsics.checkNotNullExpressionValue(c1465uN, "bind(...)");
        c1465uN.f9659t.setAdapter((ListAdapter) new Ml(this.nr, this.KN, this.f47436t, this.rl, new Function0() { // from class: com.alightcreative.widget.s4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return nKK.s7N(popupWindow);
            }
        }));
        c1465uN.f9659t.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.alightcreative.widget.UGc
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i5, long j2) {
                nKK.wTp(this.f47309n, anchor, popupWindow, adapterView, view, i5, j2);
            }
        });
        int i5 = this.J2;
        if (i5 > 0) {
            popupWindow.setWidth(i5);
        }
        int i7 = this.Uo;
        if (i7 > 0) {
            popupWindow.setHeight(i7);
        }
        c1465uN.f9659t.setClipToOutline(true);
        c1465uN.f9659t.setClipChildren(true);
        Object parent = c1465uN.f9659t.getParent();
        View view = parent instanceof View ? (View) parent : null;
        if (view != null) {
            view.setClipToOutline(true);
        }
        ViewParent parent2 = c1465uN.f9659t.getParent();
        ViewGroup viewGroup = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
        if (viewGroup != null) {
            viewGroup.setClipChildren(true);
        }
        c1465uN.f9659t.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.alightcreative.widget.Q
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view2, int i8, int i9, int i10, int i11) {
                nKK.rV9(c1465uN, view2, i8, i9, i10, i11);
            }
        });
        popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.alightcreative.widget.r
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                nKK.bzg(function0);
            }
        });
        popupWindow.showAsDropDown(anchor, i2, i3);
    }

    public final void X(int i2) {
        this.J2 = i2;
    }

    public final nKK Z(Set requiredBenefits, String label, Drawable drawable, Function0 action) {
        Intrinsics.checkNotNullParameter(requiredBenefits, "requiredBenefits");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(action, "action");
        iF(this, false, 1, null);
        this.nr.add(new w6(null, drawable, false, false, label, false, action, 0, null, requiredBenefits, null, false, null, 7597, null));
        return this;
    }

    public final nKK aYN(int i2, final int i3, boolean z2) {
        iF(this, false, 1, null);
        List list = this.nr;
        String string = this.f47435n.getResources().getString(i2);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        list.add(new w6(n.J2, null, false, false, string, z2, new Function0() { // from class: com.alightcreative.widget.afx
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return nKK.ViF(this.f47378n, i3);
            }
        }, 0, null, null, null, false, null, 8078, null));
        return this;
    }

    public final nKK az(String label, Drawable drawable, boolean z2, SolidColor solidColor, Function0 action) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(action, "action");
        iF(this, false, 1, null);
        this.nr.add(new w6(null, drawable, false, false, label, false, action, 0, null, null, solidColor, z2, null, 5037, null));
        return this;
    }

    public final nKK fD(Function1 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.xMQ = listener;
        return this;
    }

    public final void nY() {
        if (this.nr.isEmpty()) {
            return;
        }
        List list = this.nr;
        int lastIndex = CollectionsKt.getLastIndex(list);
        List list2 = this.nr;
        list.set(lastIndex, w6.rl((w6) list2.get(CollectionsKt.getLastIndex(list2)), null, null, false, false, null, false, null, 0, null, null, null, false, null, 8183, null));
    }

    public final nKK o(Set requiredBenefits, int i2, int i3, Function0 action) {
        Intrinsics.checkNotNullParameter(requiredBenefits, "requiredBenefits");
        Intrinsics.checkNotNullParameter(action, "action");
        iF(this, false, 1, null);
        String string = this.f47435n.getResources().getString(i2);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return Z(requiredBenefits, string, i3 != 0 ? this.f47435n.getResources().getDrawable(i3, null) : null, action);
    }

    public final nKK qie(int i2, int i3, boolean z2, SolidColor solidColor, Function0 action) {
        Intrinsics.checkNotNullParameter(action, "action");
        iF(this, false, 1, null);
        String string = this.f47435n.getResources().getString(i2);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return az(string, i3 != 0 ? ResourcesCompat.J2(this.f47435n.getResources(), i3, this.f47435n.getTheme()) : null, z2, solidColor, action);
    }

    public final nKK r(Set requiredBenefits, int i2, final int i3, int i5) {
        Intrinsics.checkNotNullParameter(requiredBenefits, "requiredBenefits");
        iF(this, false, 1, null);
        return o(requiredBenefits, i2, i5, new Function0() { // from class: com.alightcreative.widget.Z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return nKK.WPU(this.f47372n, i3);
            }
        });
    }

    public final nKK te(boolean z2) {
        if (!this.f47434O.isEmpty()) {
            this.nr.add(new w6(n.f47450t, null, z2, false, null, false, null, 0, CollectionsKt.toList(this.f47434O), null, null, false, null, 7930, null));
            this.f47434O.clear();
        }
        return this;
    }

    private final void E2(View view, View view2, w6 w6Var, Function0 function0) {
        if (w6Var.Uo()) {
            int i2 = CN3.$EnumSwitchMapping$0[w6Var.HI().ordinal()];
            if (i2 != 1 && i2 != 2 && i2 != 3) {
                if (i2 != 4) {
                    if (i2 == 5) {
                        return;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                final SJ0.lej lejVarN = SJ0.lej.n(view);
                Intrinsics.checkNotNullExpressionValue(lejVarN, "bind(...)");
                nKK nkk = new nKK(this.f47435n, this.rl, false, 4, null);
                for (final w6 w6Var2 : w6Var.J2()) {
                    ck(nkk, w6Var2.xMQ(), null, false, null, new Function0() { // from class: com.alightcreative.widget.g9s
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return nKK.e(lejVarN, w6Var2);
                        }
                    }, 14, null);
                }
                Pair pairJ2 = HI0.o7q.J2(view2);
                int iIntValue = ((Number) pairJ2.component1()).intValue();
                int iIntValue2 = ((Number) pairJ2.component2()).intValue();
                AppCompatTextView dropdownMenu = lejVarN.nr;
                Intrinsics.checkNotNullExpressionValue(dropdownMenu, "dropdownMenu");
                Pair pairJ22 = HI0.o7q.J2(dropdownMenu);
                int iIntValue3 = ((Number) pairJ22.component1()).intValue() - iIntValue;
                int iIntValue4 = (((Number) pairJ22.component2()).intValue() - iIntValue2) - (view2.getHeight() - lejVarN.nr.getHeight());
                nkk.J2 = lejVarN.nr.getWidth();
                N(nkk, view2, iIntValue3, iIntValue4, null, 8, null);
                return;
            }
            Function0 function0T = w6Var.t();
            if (function0T != null) {
                function0T.invoke();
            }
            function0.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Ik(nKK nkk, int i2) {
        nkk.g(i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ViF(nKK nkk, int i2) {
        nkk.g(i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WPU(nKK nkk, int i2) {
        nkk.g(i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s7N(PopupWindow popupWindow) {
        popupWindow.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(PopupWindow popupWindow) {
        popupWindow.dismiss();
        return Unit.INSTANCE;
    }

    public /* synthetic */ nKK(Context context, kgE.fuX fux, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, fux, (i2 & 4) != 0 ? true : z2);
    }
}
