package com.alightcreative.export.preview;

import SJ0.C1455c;
import SJ0.C1466z;
import SJ0.QJ;
import SJ0.Xo;
import SJ0.eO;
import SJ0.l3D;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class n extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f46614n;
    private final ExportPreviewActivity rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f46615t;

    public final class j extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final ViewBinding f46616n;
        final /* synthetic */ n rl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(n nVar, ViewBinding itemBinding) {
            super(itemBinding.getRoot());
            Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
            this.rl = nVar;
            this.f46616n = itemBinding;
        }

        public final void nr(Uri uri, ExportPreviewActivity activity) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            Intrinsics.checkNotNullParameter(activity, "activity");
            ViewBinding viewBinding = this.f46616n;
            if (viewBinding instanceof l3D) {
                activity.Mh(((l3D) viewBinding).rl);
                activity.UF(uri);
                return;
            }
            if (viewBinding instanceof Xo) {
                ((Xo) viewBinding).f9392t.setImageURI(uri);
                return;
            }
            if (viewBinding instanceof C1466z) {
                ((C1466z) viewBinding).f9696t.setImageURI(uri);
                return;
            }
            if (viewBinding instanceof C1455c) {
                activity.Mh(((C1455c) viewBinding).rl);
                activity.UF(uri);
            } else if (viewBinding instanceof eO) {
                ((eO) viewBinding).f9430t.setImageURI(uri);
            } else if (viewBinding instanceof QJ) {
                ((QJ) viewBinding).f9281t.setImageURI(uri);
            }
        }
    }

    public n(List uris, ExportPreviewActivity activity, boolean z2) {
        Intrinsics.checkNotNullParameter(uris, "uris");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f46614n = uris;
        this.rl = activity;
        this.f46615t = z2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: az, reason: merged with bridge method [inline-methods] */
    public j onCreateViewHolder(ViewGroup parent, int i2) {
        ViewBinding viewBindingT;
        Intrinsics.checkNotNullParameter(parent, "parent");
        switch (i2) {
            case 2131558444:
                viewBindingT = Xo.t(LayoutInflater.from(parent.getContext()), parent, false);
                Intrinsics.checkNotNull(viewBindingT);
                break;
            case 2131558445:
                viewBindingT = eO.t(LayoutInflater.from(parent.getContext()), parent, false);
                Intrinsics.checkNotNull(viewBindingT);
                break;
            case 2131558446:
                viewBindingT = C1466z.t(LayoutInflater.from(parent.getContext()), parent, false);
                Intrinsics.checkNotNull(viewBindingT);
                break;
            case 2131558447:
                viewBindingT = QJ.t(LayoutInflater.from(parent.getContext()), parent, false);
                Intrinsics.checkNotNull(viewBindingT);
                break;
            case 2131558448:
                viewBindingT = l3D.t(LayoutInflater.from(parent.getContext()), parent, false);
                Intrinsics.checkNotNull(viewBindingT);
                break;
            case 2131558449:
                viewBindingT = C1455c.t(LayoutInflater.from(parent.getContext()), parent, false);
                Intrinsics.checkNotNull(viewBindingT);
                break;
            default:
                throw new UnsupportedOperationException();
        }
        return new j(this, viewBindingT);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f46614n.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i2) {
        if (this.f46615t) {
            if (i2 == 0) {
                return 2131558448;
            }
            if (i2 == 1) {
                return 2131558444;
            }
            if (i2 == 2) {
                return 2131558446;
            }
            throw new UnsupportedOperationException();
        }
        if (i2 == 0) {
            return 2131558449;
        }
        if (i2 == 1) {
            return 2131558445;
        }
        if (i2 == 2) {
            return 2131558447;
        }
        throw new UnsupportedOperationException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: qie, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(j holder, int i2) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.nr((Uri) this.f46614n.get(i2), this.rl);
    }
}
