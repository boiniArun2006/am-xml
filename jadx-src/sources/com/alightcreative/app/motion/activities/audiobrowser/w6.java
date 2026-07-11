package com.alightcreative.app.motion.activities.audiobrowser;

import SJ0.P;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m.C2282c;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class w6 extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f44907n;
    private final Function1 rl;

    public final class j extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final P f44908n;
        final /* synthetic */ w6 rl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(w6 w6Var, P itemBinding) {
            super(itemBinding.getRoot());
            Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
            this.rl = w6Var;
            this.f44908n = itemBinding;
        }

        public final P nr() {
            return this.f44908n;
        }
    }

    public w6(List list, Function1 clickListener) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(clickListener, "clickListener");
        this.f44907n = list;
        this.rl = clickListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ty(w6 w6Var, int i2, View view) {
        w6Var.rl.invoke(((C2282c) w6Var.f44907n.get(i2)).n());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: HI, reason: merged with bridge method [inline-methods] */
    public j onCreateViewHolder(ViewGroup parent, int i2) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        P pT = P.t(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(pT, "inflate(...)");
        return new j(this, pT);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: az, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(j holder, final int i2) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.nr().f9255t.setImageDrawable(((C2282c) this.f44907n.get(i2)).rl());
        holder.nr().J2.setText(((C2282c) this.f44907n.get(i2)).t());
        holder.nr().nr.setText(String.valueOf(((C2282c) this.f44907n.get(i2)).nr()));
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.audiobrowser.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w6.ty(this.f44905n, i2, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f44907n.size();
    }
}
