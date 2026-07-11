package UO6;

import SJ0.DC;
import UO6.vd;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.ViewGroupKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.alightcreative.app.motion.activities.ResolutionDropdown;
import com.alightcreative.app.motion.activities.w6O;
import com.alightcreative.app.motion.persist.j;
import com.alightcreative.monorepo.settings.ExportUIMenuItem;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class Md extends RecyclerView.Adapter {
    private final Function1 J2;
    private final Collection KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Function1 f10663O;
    private final int Uo;
    private vd gh;
    private final Iterable mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f10664n;
    private final Function1 nr;
    private final List rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Function1 f10665t;
    private final Collection xMQ;

    public final class j extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final ViewBinding f10666n;
        final /* synthetic */ Md rl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Md md, ViewBinding itemBinding) {
            super(itemBinding.getRoot());
            Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
            this.rl = md;
            this.f10666n = itemBinding;
        }

        public final ViewBinding nr() {
            return this.f10666n;
        }
    }

    public /* synthetic */ class n {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[vd.n.values().length];
            try {
                iArr[vd.n.f10728S.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[vd.n.f10729Z.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[vd.n.f10734t.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[vd.n.f10733r.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[vd.n.J2.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[vd.n.f10731g.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[vd.n.f10732o.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Md(Context context, List items, Function1 showSettingForMode, Function1 updateMediaSizeDisplay, Function1 updateTrialToggleVisibility, Function1 onResolutionSelected, int i2, Collection gifResolutions, Collection videoResolutions, Iterable activeBenefits) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(showSettingForMode, "showSettingForMode");
        Intrinsics.checkNotNullParameter(updateMediaSizeDisplay, "updateMediaSizeDisplay");
        Intrinsics.checkNotNullParameter(updateTrialToggleVisibility, "updateTrialToggleVisibility");
        Intrinsics.checkNotNullParameter(onResolutionSelected, "onResolutionSelected");
        Intrinsics.checkNotNullParameter(gifResolutions, "gifResolutions");
        Intrinsics.checkNotNullParameter(videoResolutions, "videoResolutions");
        Intrinsics.checkNotNullParameter(activeBenefits, "activeBenefits");
        this.f10664n = context;
        this.rl = items;
        this.f10665t = showSettingForMode;
        this.nr = updateMediaSizeDisplay;
        this.f10663O = updateTrialToggleVisibility;
        this.J2 = onResolutionSelected;
        this.Uo = i2;
        this.KN = gifResolutions;
        this.xMQ = videoResolutions;
        this.mUb = activeBenefits;
        this.gh = (vd) CollectionsKt.first(items);
    }

    private final void WPU(vd vdVar) {
        this.f10663O.invoke(vdVar.xMQ());
        int i2 = n.$EnumSwitchMapping$0[vdVar.xMQ().ordinal()];
        if (i2 == 1 || i2 == 2) {
            P.t(this.f10664n, vdVar);
            return;
        }
        this.gh = vdVar;
        this.f10665t.invoke(vdVar);
        this.nr.invoke(vdVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void XQ(Md md, vd vdVar, j jVar, View view) {
        if (Intrinsics.areEqual(md.gh, vdVar)) {
            return;
        }
        ViewParent parent = jVar.itemView.getParent();
        Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        Sequence sequenceN = ViewGroupKt.n((ViewGroup) parent);
        View itemView = jVar.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        md.aYN(sequenceN, itemView);
        md.gh = vdVar;
        md.f10663O.invoke(vdVar.xMQ());
        md.nr.invoke(vdVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z(Md md, w6O it) {
        Intrinsics.checkNotNullParameter(it, "it");
        md.J2.invoke(Integer.valueOf(it.t()));
        return Unit.INSTANCE;
    }

    public final vd Ik() {
        return this.gh;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public j onCreateViewHolder(ViewGroup parent, int i2) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (i2 != 2131558581) {
            throw new UnsupportedOperationException();
        }
        DC dcT = DC.t(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNull(dcT);
        return new j(this, dcT);
    }

    public final List ck() {
        return this.rl;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.rl.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i2) {
        return ((vd) this.rl.get(i2)).xMQ().rl();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(final j holder, int i2) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final vd vdVar = (vd) this.rl.get(i2);
        boolean zContains = CollectionsKt.contains(this.mUb, kgE.K.f70078g);
        holder.itemView.setActivated(Intrinsics.areEqual(this.gh, vdVar));
        ViewBinding viewBindingNr = holder.nr();
        Intrinsics.checkNotNull(viewBindingNr, "null cannot be cast to non-null type com.alightcreative.app.motion.databinding.ExportItemBinding");
        DC dc = (DC) viewBindingNr;
        dc.J2.setImageDrawable(ResourcesCompat.J2(this.f10664n.getResources(), vdVar.rl(), null));
        dc.f9113O.setText(this.f10664n.getResources().getString(vdVar.nr()));
        TextView textView = dc.f9115t;
        String strHI = HI(vdVar);
        int i3 = 0;
        if (strHI != null) {
            Intrinsics.checkNotNull(textView);
            textView.setVisibility(0);
            textView.setText(strHI);
        } else {
            Intrinsics.checkNotNull(textView);
            textView.setVisibility(8);
        }
        AppCompatImageView membersBadge = dc.Uo;
        Intrinsics.checkNotNullExpressionValue(membersBadge, "membersBadge");
        membersBadge.setVisibility(vdVar.Uo() && zContains ? 0 : 8);
        AppCompatImageView membersBadgeLock = dc.KN;
        Intrinsics.checkNotNullExpressionValue(membersBadgeLock, "membersBadgeLock");
        membersBadgeLock.setVisibility(vdVar.Uo() && !zContains ? 0 : 8);
        TextView newBadge = dc.xMQ;
        Intrinsics.checkNotNullExpressionValue(newBadge, "newBadge");
        newBadge.setVisibility(vdVar.J2() ? 0 : 8);
        ImageView imageView = dc.qie;
        Intrinsics.checkNotNull(imageView);
        imageView.setVisibility(vdVar.O() != null ? 0 : 8);
        if (vdVar.O() != null) {
            imageView.setImageDrawable(ResourcesCompat.J2(imageView.getContext().getResources(), vdVar.O().rl(), null));
            imageView.setOnClickListener(new View.OnClickListener() { // from class: UO6.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Md.o(this.f10684n, vdVar, view);
                }
            });
        }
        ConstraintLayout quickOptionsHolder = dc.mUb;
        Intrinsics.checkNotNullExpressionValue(quickOptionsHolder, "quickOptionsHolder");
        quickOptionsHolder.setVisibility(vdVar.KN() ? 0 : 8);
        ResolutionDropdown resolutionDropdown = dc.gh;
        if (vdVar.KN() && vdVar.xMQ() == vd.n.f10734t) {
            resolutionDropdown.setItems(this.xMQ);
            Iterator it = this.xMQ.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i3 = -1;
                    break;
                }
                Object next = it.next();
                if (i3 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                int iT = ((w6O) next).t();
                w6 w6VarN = vdVar.n();
                Intrinsics.checkNotNull(w6VarN);
                if (iT == Ml.n(w6VarN)) {
                    break;
                } else {
                    i3++;
                }
            }
            resolutionDropdown.setSelectedIndex(i3);
            resolutionDropdown.setOnItemSelectedListener(new Function1() { // from class: UO6.K
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Md.Z(this.f10662n, (w6O) obj);
                }
            });
        }
        dc.az.setOnClickListener(new View.OnClickListener() { // from class: UO6.psW
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Md.XQ(this.f10693n, vdVar, holder, view);
            }
        });
    }

    private final String HI(vd vdVar) {
        String strRl;
        String strRl2;
        String strRl3;
        int i2 = n.$EnumSwitchMapping$0[vdVar.xMQ().ordinal()];
        Object obj = null;
        if (i2 != 1) {
            String str = "";
            if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        if (i2 != 6) {
                            if (i2 != 7) {
                                return null;
                            }
                            return "for workflow integrations";
                        }
                        return this.f10664n.getString(2132019028);
                    }
                    w6 w6VarN = vdVar.n();
                    if (w6VarN == null) {
                        return null;
                    }
                    int iN = iF.n(this.Uo, w6VarN.nr()) / 100;
                    Iterator it = this.xMQ.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (((w6O) next).t() == Ml.n(w6VarN)) {
                            obj = next;
                            break;
                        }
                    }
                    w6O w6o = (w6O) obj;
                    j.fuX fuxT = w6VarN.t();
                    if (w6o != null && (strRl3 = w6o.rl()) != null) {
                        str = strRl3;
                    }
                    return fuxT + " " + str + " " + iN + "fps ";
                }
                w6 w6VarN2 = vdVar.n();
                if (w6VarN2 == null) {
                    return null;
                }
                int iN2 = iF.n(this.Uo, w6VarN2.nr()) / 100;
                Iterator it2 = this.KN.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next2 = it2.next();
                    if (((w6O) next2).t() == Ml.n(w6VarN2)) {
                        obj = next2;
                        break;
                    }
                }
                w6O w6o2 = (w6O) obj;
                if (w6o2 != null && (strRl2 = w6o2.rl()) != null) {
                    str = strRl2;
                }
                return str + " " + iN2 + "fps ";
            }
            w6 w6VarN3 = vdVar.n();
            if (w6VarN3 == null) {
                return null;
            }
            Iterator it3 = this.xMQ.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next3 = it3.next();
                if (((w6O) next3).t() == Ml.n(w6VarN3)) {
                    obj = next3;
                    break;
                }
            }
            w6O w6o3 = (w6O) obj;
            int iN3 = iF.n(this.Uo, w6VarN3.nr());
            if (w6o3 != null && (strRl = w6o3.rl()) != null) {
                str = strRl;
            }
            return "MP4 " + str + " " + (iN3 / 100) + "fps ";
        }
        if (vdVar.t() != ExportUIMenuItem.PROJECT_PACKAGE) {
            return null;
        }
        return this.f10664n.getResources().getString(2132020446);
    }

    private final void aYN(Sequence sequence, View view) {
        Iterator it = sequence.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setActivated(false);
        }
        view.setActivated(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(Md md, vd vdVar, View view) {
        md.WPU(vdVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i2) {
        return 2131558581;
    }
}
