package com.alightcreative.app.motion.activities.mediabrowser;

import D5a.RzR;
import HI0.afx;
import HI0.qz;
import Hwc.w6;
import SJ0.ibE;
import XoT.C;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.alightcreative.app.motion.activities.mediabrowser.n;
import com.alightcreative.app.motion.scene.TimeKt;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import dX.CN3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kPg.fuX;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import tu.Ew;
import tu.Z;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class n extends RecyclerView.Adapter {
    private ArrayList J2;
    private Map KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final boolean f45543O;
    private Map Uo;
    private boolean mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f45544n;
    private final Function2 nr;
    private List rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Function1 f45545t;
    private Uri xMQ;

    public final class j extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final ibE f45546n;
        final /* synthetic */ n rl;

        /* JADX INFO: Access modifiers changed from: private */
        public static final Bitmap mUb(j jVar, Z z2) {
            try {
                return jVar.itemView.getContext().getContentResolver().loadThumbnail(z2.nY(), new Size(200, 200), null);
            } catch (IOException e2) {
                C.mUb(jVar, new Function0() { // from class: D5a.R6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return n.j.gh(e2);
                    }
                });
                e2.printStackTrace();
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(n nVar, ibE itemBinding) {
            super(itemBinding.getRoot());
            Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
            this.rl = nVar;
            this.f45546n = itemBinding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String gh(IOException iOException) {
            return "loadThumbnail Error : " + iOException;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit qie(j jVar, Z z2, Bitmap bitmap) {
            if (bitmap != null && Intrinsics.areEqual(jVar.f45546n.J2.getTag(), Long.valueOf(z2.Z()))) {
                jVar.f45546n.J2.setImageBitmap(bitmap);
            }
            return Unit.INSTANCE;
        }

        public final ibE HI() {
            return this.f45546n;
        }

        public final void xMQ(final Z info, final int i2) {
            Intrinsics.checkNotNullParameter(info, "info");
            w6.n();
            TextView duration = this.f45546n.nr;
            Intrinsics.checkNotNullExpressionValue(duration, "duration");
            afx.ViF(duration, 2.0f, 0.0f, 0.0f, 1426063360);
            Ew ewViF = info.ViF();
            Ew ew = Ew.f73884r;
            if (ewViF != ew || Build.VERSION.SDK_INT < 29) {
                String scheme = info.nY().getScheme();
                fuX fux = fuX.f69922n;
                if (Intrinsics.areEqual(scheme, fux.rl())) {
                    this.f45546n.J2.setVisibility(0);
                    this.f45546n.f9486O.setVisibility(8);
                    this.f45546n.J2.setImageBitmap(fux.O(info.nY()));
                } else {
                    this.f45546n.J2.setVisibility(8);
                    this.f45546n.f9486O.setVisibility(0);
                    SimpleDraweeView simpleDraweeView = this.f45546n.f9486O;
                    ImageRequestBuilder imageRequestBuilderAYN = ImageRequestBuilder.aYN(info.nY());
                    imageRequestBuilderAYN.X(true);
                    imageRequestBuilderAYN.v(new CN3(200, 200, 0.0f, 0.0f, 12, null));
                    simpleDraweeView.setImageRequest(imageRequestBuilderAYN.n());
                }
            } else {
                this.f45546n.J2.setVisibility(0);
                this.f45546n.J2.setTag(Long.valueOf(info.Z()));
                this.f45546n.f9486O.setVisibility(8);
                qz.t(RzR.f1328n, new Function0() { // from class: D5a.YzO
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return n.j.mUb(this.f1337n, info);
                    }
                }).Uo(new Function1() { // from class: D5a.QaP
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return n.j.qie(this.f1325n, info, (Bitmap) obj);
                    }
                });
            }
            this.f45546n.nr.setText(info.ViF() == ew ? TimeKt.formatTimeMillis$default((int) info.ck(), "hhh:mm:ss", false, 4, null) : "");
            View view = this.itemView;
            final n nVar = this.rl;
            view.setOnClickListener(new View.OnClickListener() { // from class: D5a.FKk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    n.j.az(nVar, info, i2, this, view2);
                }
            });
            View view2 = this.itemView;
            final n nVar2 = this.rl;
            view2.setOnLongClickListener(new View.OnLongClickListener() { // from class: D5a.Fl
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view3) {
                    return n.j.ty(nVar2, info, view3);
                }
            });
            this.rl.e(this.f45546n, i2, info);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void az(n nVar, Z z2, int i2, j jVar, View view) {
            if (!nVar.ViF()) {
                nVar.S().clear();
                nVar.XQ().clear();
                nVar.XQ().add(z2);
            } else {
                boolean zContains = nVar.XQ().contains(z2);
                if (zContains && nVar.HI() == i2) {
                    nVar.S().remove(z2.nY());
                    nVar.WPU().remove(z2.nY());
                    nVar.XQ().remove(z2);
                } else if (!zContains) {
                    nVar.XQ().add(z2);
                }
            }
            nVar.te(z2.nY());
            nVar.o().invoke(z2);
            nVar.e(jVar.f45546n, i2, z2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean ty(n nVar, Z z2, View view) {
            if (nVar.aYN() || nVar.ViF()) {
                return false;
            }
            nVar.XQ().clear();
            nVar.te(z2.nY());
            nVar.XQ().add(z2);
            nVar.Z().invoke(z2, Boolean.TRUE);
            nVar.fD(true);
            return true;
        }
    }

    public n(String str, List mediaList, Function1 onItemClicked, Function2 onItemLongClicked, boolean z2) {
        Intrinsics.checkNotNullParameter(mediaList, "mediaList");
        Intrinsics.checkNotNullParameter(onItemClicked, "onItemClicked");
        Intrinsics.checkNotNullParameter(onItemLongClicked, "onItemLongClicked");
        this.f45544n = str;
        this.rl = mediaList;
        this.f45545t = onItemClicked;
        this.nr = onItemLongClicked;
        this.f45543O = z2;
        this.J2 = new ArrayList();
        this.Uo = new LinkedHashMap();
        this.KN = new LinkedHashMap();
        Z z3 = (Z) CollectionsKt.firstOrNull(this.rl);
        this.xMQ = z3 != null ? z3.nY() : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void te(Uri uri) {
        if (Intrinsics.areEqual(this.xMQ, uri)) {
            return;
        }
        notifyItemChanged(HI());
        this.xMQ = uri;
    }

    public final void E2(boolean z2, int i2) {
        Uri uri = this.xMQ;
        if (uri == null) {
            return;
        }
        if (this.Uo.containsKey(uri)) {
            if (z2) {
                this.Uo.put(uri, Integer.valueOf(i2));
            } else {
                this.Uo.remove(uri);
            }
        } else if (z2) {
            this.Uo.put(uri, Integer.valueOf(i2));
        }
        notifyItemChanged(HI());
    }

    public final int HI() {
        if (this.xMQ == null) {
            return -1;
        }
        Iterator it = this.rl.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (Intrinsics.areEqual(((Z) it.next()).nY(), this.xMQ)) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public final int Ik(Z info) {
        Intrinsics.checkNotNullParameter(info, "info");
        return this.rl.indexOf(info);
    }

    public final Map S() {
        return this.KN;
    }

    public final boolean ViF() {
        return this.mUb;
    }

    public final Map WPU() {
        return this.Uo;
    }

    public final ArrayList XQ() {
        return this.J2;
    }

    public final Function2 Z() {
        return this.nr;
    }

    public final boolean aYN() {
        return this.f45543O;
    }

    public final void az() {
        Object next;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.J2.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            Object next2 = it.next();
            Intrinsics.checkNotNullExpressionValue(next2, "next(...)");
            Z z2 = (Z) next2;
            if (!this.rl.contains(z2)) {
                arrayList.add(z2);
            }
        }
        this.J2.removeAll(arrayList);
        Iterator it2 = this.rl.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            } else {
                next = it2.next();
                if (Intrinsics.areEqual(((Z) next).nY(), this.xMQ)) {
                    break;
                }
            }
        }
        if (((Z) next) == null) {
            if (this.mUb) {
                te(this.J2.size() > 0 ? ((Z) CollectionsKt.first((List) this.J2)).nY() : null);
            } else if (this.rl.isEmpty()) {
                te(null);
            } else {
                te(((Z) CollectionsKt.first(this.rl)).nY());
                this.J2.add(CollectionsKt.first(this.rl));
            }
        }
    }

    public final Z ck(int i2) {
        return (Z) this.rl.get(i2);
    }

    public final void e(ibE itemBinding, int i2, Z info) {
        Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
        Intrinsics.checkNotNullParameter(info, "info");
        itemBinding.rl.setVisibility(i2 == HI() ? 0 : 8);
        if (!this.mUb) {
            itemBinding.f9488t.setVisibility(8);
            itemBinding.KN.setVisibility(4);
            itemBinding.Uo.setVisibility(4);
            return;
        }
        boolean zContains = this.J2.contains(info);
        itemBinding.f9488t.setVisibility(0);
        itemBinding.f9488t.setActivated(zContains);
        AppCompatTextView appCompatTextView = itemBinding.f9488t;
        appCompatTextView.setText(appCompatTextView.isActivated() ? String.valueOf(this.J2.indexOf(info) + 1) : "");
        itemBinding.Uo.setVisibility((zContains && this.Uo.containsKey(info.nY())) ? 0 : 4);
        itemBinding.KN.setVisibility((zContains && this.KN.containsKey(info.nY())) ? 0 : 4);
    }

    public final void fD(boolean z2) {
        if (this.mUb != z2) {
            if (!z2) {
                this.KN.clear();
                this.Uo.clear();
                this.J2.clear();
                if (HI() != -1) {
                    this.J2.add(this.rl.get(HI()));
                }
            }
            this.mUb = z2;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public j onCreateViewHolder(ViewGroup parent, int i2) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ibE ibeT = ibE.t(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(ibeT, "inflate(...)");
        return new j(this, ibeT);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.rl.size();
    }

    public final void iF(List list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.rl = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: nY, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(j holder, int i2) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.xMQ((Z) this.rl.get(i2), i2);
    }

    public final Function1 o() {
        return this.f45545t;
    }

    public final List r() {
        return this.rl;
    }

    public final String ty() {
        return this.f45544n;
    }
}
