package com.alightcreative.app.motion.activities;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.alightcreative.app.motion.activities.GX;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class GX extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f44562n;
    private final Function1 rl;

    public final class j extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final SJ0.g f44563n;
        final /* synthetic */ GX rl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(GX gx, SJ0.g itemBinding) {
            super(itemBinding.getRoot());
            Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
            this.rl = gx;
            this.f44563n = itemBinding;
        }

        public final void O(final com.google.firebase.auth.QJ item, int i2) {
            Intrinsics.checkNotNullParameter(item, "item");
            String strN1 = item.n1();
            int iHashCode = strN1.hashCode();
            if (iHashCode != -1536293812) {
                if (iHashCode != -364826023) {
                    if (iHashCode == 1216985755 && strN1.equals("password")) {
                        this.f44563n.f9446t.setImageDrawable(AppCompatResources.rl(this.itemView.getContext(), 2131231706));
                        this.f44563n.f9444O.setVisibility(4);
                        this.f44563n.nr.setText(this.itemView.getResources().getString(2132018947));
                    }
                } else if (strN1.equals("facebook.com")) {
                    this.f44563n.f9446t.setImageDrawable(AppCompatResources.rl(this.itemView.getContext(), 2131231732));
                    this.f44563n.f9444O.setVisibility(0);
                    AppCompatTextView appCompatTextView = this.f44563n.nr;
                    String email = item.getEmail();
                    if (email == null) {
                        email = "Facebook";
                    }
                    appCompatTextView.setText(email);
                }
            } else if (strN1.equals("google.com")) {
                this.f44563n.f9446t.setImageDrawable(AppCompatResources.rl(this.itemView.getContext(), 2131231748));
                this.f44563n.f9444O.setVisibility(0);
                AppCompatTextView appCompatTextView2 = this.f44563n.nr;
                String email2 = item.getEmail();
                if (email2 == null) {
                    email2 = "Google";
                }
                appCompatTextView2.setText(email2);
            }
            LinearLayoutCompat linearLayoutCompat = this.f44563n.f9444O;
            final GX gx = this.rl;
            linearLayoutCompat.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.Bg5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GX.j.J2(gx, item, view);
                }
            });
            this.f44563n.rl.setVisibility(i2 % 2 != 1 ? 8 : 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void J2(GX gx, com.google.firebase.auth.QJ qj, View view) {
            Function1 function1Qie = gx.qie();
            String strN1 = qj.n1();
            Intrinsics.checkNotNullExpressionValue(strN1, "getProviderId(...)");
            function1Qie.invoke(strN1);
        }
    }

    public GX(List list, Function1 unlikListener) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(unlikListener, "unlikListener");
        this.f44562n = list;
        this.rl = unlikListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: az, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(j holder, int i2) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.O((com.google.firebase.auth.QJ) this.f44562n.get(i2), i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f44562n.size();
    }

    public final Function1 qie() {
        return this.rl;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: ty, reason: merged with bridge method [inline-methods] */
    public j onCreateViewHolder(ViewGroup parent, int i2) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        SJ0.g gVarT = SJ0.g.t(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(gVarT, "inflate(...)");
        return new j(this, gVarT);
    }
}
