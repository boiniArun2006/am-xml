package com.alightcreative.widget;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListPopupWindow;
import android.widget.ListView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.alightcreative.app.motion.scene.ColorKt;
import com.alightcreative.widget.C1766z;
import com.alightcreative.widget.Pl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.ClosedRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Pl {
    private int J2;
    private boolean KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private Function1 f47179O;
    private boolean Uo;
    private Function1 mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f47180n;
    private Function1 nr;
    private final kgE.fuX rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List f47181t;
    private boolean xMQ;

    /* synthetic */ class CN3 extends FunctionReferenceImpl implements Function0 {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ ListPopupWindow f47183t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        CN3(ListPopupWindow listPopupWindow) {
            super(0, Intrinsics.Kotlin.class, "handleDismiss", "showPopupFrom$lambda$2$handleDismiss(Lcom/alightcreative/widget/AlightMenu;Landroid/widget/ListPopupWindow;)V", 0);
            this.f47183t = listPopupWindow;
        }

        public final void n() {
            Pl.XQ(Pl.this, this.f47183t);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            n();
            return Unit.INSTANCE;
        }
    }

    /* synthetic */ class I28 extends FunctionReferenceImpl implements Function0 {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ ListPopupWindow f47185t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        I28(ListPopupWindow listPopupWindow) {
            super(0, Intrinsics.Kotlin.class, "handleDismiss", "showPopupFrom$lambda$2$handleDismiss(Lcom/alightcreative/widget/AlightMenu;Landroid/widget/ListPopupWindow;)V", 0);
            this.f47185t = listPopupWindow;
        }

        public final void n() {
            Pl.XQ(Pl.this, this.f47185t);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            n();
            return Unit.INSTANCE;
        }
    }

    public static final class Ml implements eO {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Ref.BooleanRef f47186n;
        final /* synthetic */ Pl rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function1 f47187t;

        Ml(Ref.BooleanRef booleanRef, Pl pl, Function1 function1) {
            this.f47186n = booleanRef;
            this.rl = pl;
            this.f47187t = function1;
        }

        @Override // com.alightcreative.widget.eO
        public void J2(Function1 listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.rl.f47179O = listener;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.alightcreative.widget.eO
        public void KN(boolean z2, boolean z3, boolean z4, Function1 builder) {
            Intrinsics.checkNotNullParameter(builder, "builder");
            if (!z2) {
                throw new NotImplementedError(null, 1, 0 == true ? 1 : 0);
            }
            this.rl.f47181t.add(mUb(new C1766z(C1766z.j.f47523t, null, true, false, z3, z4, false, null, false, null, null, 0, 0, new Pl(this.rl.f47180n, this.rl.rl, builder).f47181t, null, null, false, 122826, null)));
        }

        @Override // com.alightcreative.widget.eO
        public void O(int i2, Function1 builder) {
            Intrinsics.checkNotNullParameter(builder, "builder");
            List list = this.rl.f47181t;
            C1766z c1766zRl = l3D.rl(this.rl.f47180n, builder);
            String string = this.rl.f47180n.getString(i2);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            list.add(mUb(C1766z.rl(c1766zRl, null, null, false, false, false, false, false, string, false, null, null, 0, 0, null, null, null, false, 130943, null)));
        }

        @Override // com.alightcreative.widget.eO
        public void Uo() {
            this.f47186n.element = true;
        }

        public final C1766z mUb(C1766z c1766z) {
            Intrinsics.checkNotNullParameter(c1766z, "<this>");
            Ref.BooleanRef booleanRef = this.f47186n;
            if (!booleanRef.element) {
                return c1766z;
            }
            booleanRef.element = false;
            return C1766z.rl(c1766z, null, null, true, false, false, false, false, null, false, null, null, 0, 0, null, null, null, false, 131067, null);
        }

        @Override // com.alightcreative.widget.eO
        public void n(int i2) {
            this.rl.J2 = i2;
        }

        @Override // com.alightcreative.widget.eO
        public void nr(Function1 builder) {
            Intrinsics.checkNotNullParameter(builder, "builder");
            this.rl.f47181t.add(mUb(l3D.rl(this.rl.f47180n, builder)));
        }

        @Override // com.alightcreative.widget.eO
        public void rl(Function1 listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.rl.nr = listener;
        }

        @Override // com.alightcreative.widget.eO
        public void t(boolean z2) {
            this.rl.mUb = z2 ? this.f47187t : null;
        }

        @Override // com.alightcreative.widget.eO
        public void xMQ(boolean z2) {
            this.rl.xMQ = z2;
        }
    }

    /* synthetic */ class Wre extends FunctionReferenceImpl implements Function0 {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ ListPopupWindow f47189t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Wre(ListPopupWindow listPopupWindow) {
            super(0, Intrinsics.Kotlin.class, "handleDismiss", "showPopupFrom$lambda$2$handleDismiss(Lcom/alightcreative/widget/AlightMenu;Landroid/widget/ListPopupWindow;)V", 0);
            this.f47189t = listPopupWindow;
        }

        public final void n() {
            Pl.XQ(Pl.this, this.f47189t);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            n();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class j extends RecyclerView.Adapter {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final int f47190O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final C1766z f47191n;
        private final List nr;
        private final int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Function0 f47192t;

        /* JADX INFO: renamed from: com.alightcreative.widget.Pl$j$j, reason: collision with other inner class name */
        public final class C0684j extends RecyclerView.ViewHolder {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final ViewBinding f47193n;
            final /* synthetic */ j rl;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0684j(j jVar, ViewBinding itemBinding) {
                super(itemBinding.getRoot());
                Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
                this.rl = jVar;
                this.f47193n = itemBinding;
            }

            public final void O(final C1766z item) {
                Intrinsics.checkNotNullParameter(item, "item");
                if (this.rl.az().J2()) {
                    View view = this.itemView;
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    j jVar = this.rl;
                    layoutParams.width = jVar.HI() / jVar.ty().size();
                    view.setLayoutParams(layoutParams);
                }
                ViewBinding viewBinding = this.f47193n;
                if (viewBinding instanceof SJ0.rv6) {
                    ((SJ0.rv6) viewBinding).rl.setImageDrawable(item.mUb());
                    ((SJ0.rv6) this.f47193n).rl.setAlpha(item.xMQ() ? 1.0f : 0.25f);
                    ((SJ0.rv6) this.f47193n).f9630t.setVisibility(item.ty() ? 0 : 8);
                } else {
                    if (!(viewBinding instanceof SJ0.M)) {
                        throw new UnsupportedOperationException();
                    }
                    ((SJ0.M) viewBinding).rl.setImageDrawable(item.mUb());
                    ((SJ0.M) this.f47193n).rl.setAlpha(item.xMQ() ? 1.0f : 0.25f);
                    ((SJ0.M) this.f47193n).f9203t.setVisibility(item.ty() ? 0 : 8);
                }
                View view2 = this.itemView;
                final j jVar2 = this.rl;
                view2.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.widget.qz
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        Pl.j.C0684j.J2(item, jVar2, view3);
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void J2(C1766z c1766z, j jVar, View view) {
                Function0 function0T = c1766z.t();
                if (function0T != null) {
                    function0T.invoke();
                }
                jVar.qie().invoke();
            }
        }

        public j(C1766z groupItem, boolean z2, int i2, Function0 dismiss) {
            Intrinsics.checkNotNullParameter(groupItem, "groupItem");
            Intrinsics.checkNotNullParameter(dismiss, "dismiss");
            this.f47191n = groupItem;
            this.rl = i2;
            this.f47192t = dismiss;
            this.nr = groupItem.KN();
            this.f47190O = z2 ? 2131558479 : 2131558478;
        }

        public final int HI() {
            return this.rl;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: Ik, reason: merged with bridge method [inline-methods] */
        public C0684j onCreateViewHolder(ViewGroup parent, int i2) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            switch (this.f47190O) {
                case 2131558478:
                    SJ0.M mT = SJ0.M.t(LayoutInflater.from(parent.getContext()), parent, false);
                    Intrinsics.checkNotNullExpressionValue(mT, "inflate(...)");
                    return new C0684j(this, mT);
                case 2131558479:
                    SJ0.rv6 rv6VarT = SJ0.rv6.t(LayoutInflater.from(parent.getContext()), parent, false);
                    Intrinsics.checkNotNullExpressionValue(rv6VarT, "inflate(...)");
                    return new C0684j(this, rv6VarT);
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final C1766z az() {
            return this.f47191n;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: ck, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(C0684j holder, int i2) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            holder.O((C1766z) this.nr.get(i2));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.nr.size();
        }

        public final Function0 qie() {
            return this.f47192t;
        }

        public final List ty() {
            return this.nr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class n extends BaseAdapter {
        private final int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final boolean f47194O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final List f47195n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final Function0 f47196o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final kgE.fuX f47197r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final boolean f47198t;

        public /* synthetic */ class j {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[C1766z.j.values().length];
                try {
                    iArr[C1766z.j.f47520n.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[C1766z.j.f47523t.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[C1766z.j.f47519O.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[C1766z.j.J2.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @Override // android.widget.Adapter
        public long getItemId(int i2) {
            return i2;
        }

        public n(List menuItems, boolean z2, boolean z3, int i2, kgE.fuX iapManager, Function0 dismiss) {
            Intrinsics.checkNotNullParameter(menuItems, "menuItems");
            Intrinsics.checkNotNullParameter(iapManager, "iapManager");
            Intrinsics.checkNotNullParameter(dismiss, "dismiss");
            this.f47195n = menuItems;
            this.f47198t = z2;
            this.f47194O = z3;
            this.J2 = i2;
            this.f47197r = iapManager;
            this.f47196o = dismiss;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit rl(n nVar) {
            nVar.f47196o.invoke();
            return Unit.INSTANCE;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f47195n.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i2) {
            return this.f47195n.get(i2);
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i2) {
            return ((C1766z) this.f47195n.get(i2)).o().ordinal();
        }

        /* JADX WARN: Removed duplicated region for block: B:118:0x02da  */
        /* JADX WARN: Removed duplicated region for block: B:129:0x030b  */
        @Override // android.widget.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public View getView(int i2, View view, ViewGroup parent) {
            int i3;
            Resources resources;
            Resources.Theme theme;
            int i5;
            int i7;
            Resources resources2;
            Resources.Theme theme2;
            int i8;
            Intrinsics.checkNotNullParameter(parent, "parent");
            C1766z c1766z = (C1766z) this.f47195n.get(i2);
            C1766z.j jVarO = c1766z.o();
            int[] iArr = j.$EnumSwitchMapping$0;
            int i9 = iArr[jVarO.ordinal()];
            if (i9 == 1) {
                i3 = 2131558473;
            } else if (i9 == 2) {
                i3 = this.f47198t ? 2131558480 : 2131558476;
            } else if (i9 == 3) {
                i3 = 2131558475;
            } else {
                if (i9 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                i3 = 2131558474;
            }
            int i10 = 0;
            View viewInflate = view == null ? LayoutInflater.from(parent.getContext()).inflate(i3, parent, false) : view;
            View viewFindViewById = viewInflate.findViewById(2131362560);
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(c1766z.O() ? 0 : 4);
            }
            View viewFindViewById2 = viewInflate.findViewById(2131363643);
            if (viewFindViewById2 != null) {
                viewFindViewById2.setVisibility(c1766z.ck() ? 0 : 4);
            }
            int i11 = iArr[c1766z.o().ordinal()];
            if (i11 == 1) {
                SJ0.qf qfVarN = SJ0.qf.n(viewInflate);
                Intrinsics.checkNotNullExpressionValue(qfVarN, "bind(...)");
                if (!c1766z.ty() || c1766z.ck()) {
                    if (this.f47194O) {
                        resources = viewInflate.getResources();
                        theme = viewInflate.getContext().getTheme();
                        i5 = 2131100868;
                    } else {
                        resources = viewInflate.getResources();
                        theme = viewInflate.getContext().getTheme();
                        i5 = 2131100871;
                    }
                    viewInflate.setBackgroundTintList(resources.getColorStateList(i5, theme));
                    viewInflate.setBackgroundColor(0);
                } else {
                    viewInflate.setBackgroundTintList(null);
                    if (this.f47194O) {
                        resources2 = viewInflate.getResources();
                        theme2 = viewInflate.getContext().getTheme();
                        i8 = 2131099650;
                    } else {
                        resources2 = viewInflate.getResources();
                        theme2 = viewInflate.getContext().getTheme();
                        i8 = 2131099748;
                    }
                    viewInflate.setBackgroundColor(resources2.getColor(i8, theme2));
                }
                qfVarN.J2.setText(c1766z.gh());
                qfVarN.J2.setTextColor(viewInflate.getResources().getColor(c1766z.ck() ? 2131099769 : 2131099755, viewInflate.getContext().getTheme()));
                qfVarN.J2.setAlpha(c1766z.xMQ() ? 1.0f : 0.25f);
                if (c1766z.mUb() != null) {
                    qfVarN.f9600O.setVisibility(0);
                    qfVarN.f9600O.setImageDrawable(c1766z.mUb());
                    qfVarN.f9600O.setAlpha(c1766z.xMQ() ? 1.0f : 0.25f);
                } else if (c1766z.r() != null) {
                    qfVarN.f9600O.setVisibility(0);
                    qfVarN.f9600O.setImageBitmap(ColorKt.makeSwatch$default(c1766z.r(), 60, 60, 0.0f, 8.0f, 2, 0, 36, null));
                    qfVarN.f9600O.setAlpha(c1766z.xMQ() ? 1.0f : 0.25f);
                } else {
                    qfVarN.f9600O.setVisibility(8);
                }
                AppCompatImageView appCompatImageView = qfVarN.Uo;
                if (c1766z.az().isEmpty()) {
                    i7 = 8;
                    appCompatImageView.setVisibility(i7);
                    AppCompatImageView appCompatImageView2 = qfVarN.KN;
                    if (c1766z.az().isEmpty()) {
                    }
                } else {
                    Set setAz = c1766z.az();
                    if (!(setAz instanceof Collection) || !setAz.isEmpty()) {
                        Iterator it = setAz.iterator();
                        while (it.hasNext()) {
                            if (!this.f47197r.Uo().contains((kgE.K) it.next())) {
                                i7 = 8;
                                break;
                            }
                        }
                    }
                    i7 = 0;
                    appCompatImageView.setVisibility(i7);
                    AppCompatImageView appCompatImageView22 = qfVarN.KN;
                    if (c1766z.az().isEmpty()) {
                        Set setAz2 = c1766z.az();
                        if ((setAz2 instanceof Collection) && setAz2.isEmpty()) {
                            i10 = 8;
                            appCompatImageView22.setVisibility(i10);
                        } else {
                            Iterator it2 = setAz2.iterator();
                            while (it2.hasNext()) {
                                if (!this.f47197r.Uo().contains((kgE.K) it2.next())) {
                                    break;
                                }
                            }
                            i10 = 8;
                            appCompatImageView22.setVisibility(i10);
                        }
                    }
                }
            } else if (i11 == 2) {
                RecyclerView recyclerView = this.f47198t ? SJ0.vd.n(viewInflate).rl : SJ0.iwV.n(viewInflate).f9490t;
                Intrinsics.checkNotNull(recyclerView);
                if (c1766z.Ik()) {
                    viewInflate.setBackgroundColor(viewInflate.getResources().getColor(2131099735, viewInflate.getContext().getTheme()));
                } else {
                    viewInflate.setBackgroundColor(0);
                }
                recyclerView.setLayoutManager(new LinearLayoutManager(parent.getContext(), 0, false));
                recyclerView.setAdapter(new j(c1766z, this.f47198t, (this.J2 - recyclerView.getPaddingStart()) - recyclerView.getPaddingEnd(), new Function0() { // from class: com.alightcreative.widget.Xo
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Pl.n.rl(this.f47356n);
                    }
                }));
                Iterator it3 = c1766z.KN().iterator();
                int i12 = 0;
                while (true) {
                    if (!it3.hasNext()) {
                        i12 = -1;
                        break;
                    }
                    if (((C1766z) it3.next()).ty()) {
                        break;
                    }
                    i12++;
                }
                recyclerView.scrollToPosition(i12);
                if (recyclerView.getItemDecorationCount() > 0) {
                    int itemDecorationCount = recyclerView.getItemDecorationCount();
                    while (i10 < itemDecorationCount) {
                        recyclerView.removeItemDecorationAt(i10);
                        i10++;
                    }
                }
            } else if (i11 == 3) {
                SJ0.lej lejVarN = SJ0.lej.n(viewInflate);
                Intrinsics.checkNotNullExpressionValue(lejVarN, "bind(...)");
                lejVarN.f9522t.setText(c1766z.gh());
                lejVarN.nr.setText(((C1766z) c1766z.KN().get(RangesKt.coerceIn(c1766z.HI(), (ClosedRange<Integer>) CollectionsKt.getIndices(c1766z.KN())))).gh());
            } else {
                if (i11 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                SJ0.Ln lnN = SJ0.Ln.n(viewInflate);
                Intrinsics.checkNotNullExpressionValue(lnN, "bind(...)");
                lnN.f9199t.setText(c1766z.gh());
                lnN.rl.setActivated(c1766z.Uo());
            }
            Intrinsics.checkNotNull(viewInflate);
            return viewInflate;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return C1766z.j.values().length;
        }
    }

    public /* synthetic */ class w6 {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[C1766z.j.values().length];
            try {
                iArr[C1766z.j.f47520n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C1766z.j.J2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C1766z.j.f47523t.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C1766z.j.f47519O.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Pl(Context context, kgE.fuX iapManager, Function1 builder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(iapManager, "iapManager");
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f47180n = context;
        this.rl = iapManager;
        this.f47181t = new ArrayList();
        this.KN = true;
        this.xMQ = true;
        Ik(builder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HI(final SJ0.lej lejVar, final C1766z c1766z, final Pl pl, final int i2, eO AlightMenu) {
        Intrinsics.checkNotNullParameter(AlightMenu, "$this$AlightMenu");
        AlightMenu.n(lejVar.nr.getWidth());
        AlightMenu.J2(new Function1() { // from class: com.alightcreative.widget.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Pl.ck(lejVar, c1766z, pl, i2, ((Integer) obj).intValue());
            }
        });
        return Unit.INSTANCE;
    }

    private final void Ik(Function1 function1) {
        XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.widget.Dsr
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Pl.r();
            }
        });
        this.f47181t.clear();
        function1.invoke(new Ml(new Ref.BooleanRef(), this, function1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(Pl pl, View view, ListPopupWindow listPopupWindow, AdapterView adapterView, View view2, int i2, long j2) {
        Intrinsics.checkNotNullParameter(view2, "view");
        pl.ty(view2, view, i2, (C1766z) pl.f47181t.get(i2), pl.new Wre(listPopupWindow));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void XQ(Pl pl, ListPopupWindow listPopupWindow) {
        Function1 function1 = pl.mUb;
        if (pl.xMQ) {
            listPopupWindow.dismiss();
            return;
        }
        if (function1 != null) {
            int size = pl.f47181t.size();
            pl.Ik(function1);
            listPopupWindow.setAdapter(new n(pl.f47181t, pl.Uo, pl.KN, pl.J2, pl.rl, pl.new CN3(listPopupWindow)));
            if (size != pl.f47181t.size()) {
                listPopupWindow.dismiss();
            }
        }
    }

    public static /* synthetic */ void Z(Pl pl, View view, int i2, int i3, Integer num, boolean z2, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            num = null;
        }
        if ((i5 & 16) != 0) {
            z2 = true;
        }
        pl.o(view, i2, i3, num, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ck(SJ0.lej lejVar, C1766z c1766z, Pl pl, int i2, int i3) {
        lejVar.nr.setText(((C1766z) c1766z.KN().get(i3)).gh());
        Function1 function1Qie = c1766z.qie();
        if (function1Qie != null) {
            function1Qie.invoke(Integer.valueOf(i3));
        }
        List list = pl.f47181t;
        list.set(i2, C1766z.rl((C1766z) list.get(i2), null, null, false, false, false, false, false, null, false, null, null, 0, i3, null, null, null, false, 126975, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String r() {
        return "refreshFromBuilder";
    }

    private final void ty(View view, View view2, final int i2, final C1766z c1766z, Function0 function0) {
        Function1 function1;
        if (c1766z.xMQ()) {
            int i3 = w6.$EnumSwitchMapping$0[c1766z.o().ordinal()];
            if (i3 == 1 || i3 == 2 || i3 == 3) {
                Function0 function0T = c1766z.t();
                if (function0T != null) {
                    function0T.invoke();
                }
                if (c1766z.nr() != 0 && (function1 = this.nr) != null) {
                    function1.invoke(Integer.valueOf(c1766z.nr()));
                }
                Function1 function12 = this.f47179O;
                if (function12 != null) {
                    function12.invoke(Integer.valueOf(i2));
                }
                function0.invoke();
                return;
            }
            if (i3 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            final SJ0.lej lejVarN = SJ0.lej.n(view);
            Intrinsics.checkNotNullExpressionValue(lejVarN, "bind(...)");
            Pl pl = new Pl(this.f47180n, this.rl, new Function1() { // from class: com.alightcreative.widget.C
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Pl.HI(lejVarN, c1766z, this, i2, (eO) obj);
                }
            });
            List list = pl.f47181t;
            List listKN = c1766z.KN();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listKN, 10));
            int i5 = 0;
            for (Object obj : listKN) {
                int i7 = i5 + 1;
                if (i5 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                arrayList.add(C1766z.rl((C1766z) obj, null, null, false, false, false, false, false, null, false, null, null, 0, 0, null, null, null, i5 == c1766z.HI(), 65535, null));
                i5 = i7;
            }
            CollectionsKt.addAll(list, arrayList);
            Pair pairJ2 = HI0.o7q.J2(view2);
            int iIntValue = ((Number) pairJ2.component1()).intValue();
            int iIntValue2 = ((Number) pairJ2.component2()).intValue();
            AppCompatTextView dropdownMenu = lejVarN.nr;
            Intrinsics.checkNotNullExpressionValue(dropdownMenu, "dropdownMenu");
            Pair pairJ22 = HI0.o7q.J2(dropdownMenu);
            Z(pl, view2, ((Number) pairJ22.component1()).intValue() - iIntValue, (((Number) pairJ22.component2()).intValue() - iIntValue2) - (view2.getHeight() - lejVarN.nr.getHeight()), null, false, 24, null);
        }
    }

    public final void o(final View anchor, int i2, int i3, Integer num, boolean z2) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        final ListPopupWindow listPopupWindow = new ListPopupWindow(this.f47180n);
        if (num != null) {
            listPopupWindow.setDropDownGravity(num.intValue());
        }
        if (!z2) {
            listPopupWindow.setAnimationStyle(0);
        }
        listPopupWindow.setBackgroundDrawable(this.f47180n.getResources().getDrawable(this.KN ? 2131232190 : 2131232189, this.f47180n.getTheme()));
        listPopupWindow.setAdapter(new n(this.f47181t, this.Uo, this.KN, this.J2, this.rl, new I28(listPopupWindow)));
        listPopupWindow.setAnchorView(anchor);
        listPopupWindow.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.alightcreative.widget.aC
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i5, long j2) {
                Pl.S(this.f47376n, anchor, listPopupWindow, adapterView, view, i5, j2);
            }
        });
        listPopupWindow.setHorizontalOffset(i2);
        listPopupWindow.setVerticalOffset(i3);
        listPopupWindow.setModal(true);
        int i5 = this.J2;
        if (i5 > 0) {
            listPopupWindow.setWidth(i5);
        }
        listPopupWindow.show();
        ListView listView = listPopupWindow.getListView();
        if (listView != null) {
            listView.setClipToOutline(true);
        }
        ListView listView2 = listPopupWindow.getListView();
        if (listView2 != null) {
            listView2.setClipChildren(true);
        }
        ListView listView3 = listPopupWindow.getListView();
        Object parent = listView3 != null ? listView3.getParent() : null;
        View view = parent instanceof View ? (View) parent : null;
        if (view != null) {
            view.setClipToOutline(true);
        }
        ListView listView4 = listPopupWindow.getListView();
        ViewParent parent2 = listView4 != null ? listView4.getParent() : null;
        ViewGroup viewGroup = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
        if (viewGroup != null) {
            viewGroup.setClipChildren(true);
        }
    }
}
