package Y;

import SJ0.crp;
import Y.M5;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yc.V;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class M5 extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f11894n;
    private final c7r nr;
    private final Function2 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f11895t;

    public final class j extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final crp f11896n;
        final /* synthetic */ M5 rl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(M5 m5, crp itemBinding) {
            super(itemBinding.getRoot());
            Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
            this.rl = m5;
            this.f11896n = itemBinding;
        }

        public final void O(final V tag) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            this.f11896n.rl.getLayoutParams().width = this.rl.az() ? -1 : -2;
            this.f11896n.f9427t.setText(this.itemView.getContext().getString(tag.t()));
            View view = this.itemView;
            final M5 m5 = this.rl;
            view.setOnClickListener(new View.OnClickListener() { // from class: Y.xZD
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    M5.j.J2(m5, tag, view2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void J2(M5 m5, V v2, View view) {
            Function2 function2Qie = m5.qie();
            if (function2Qie != null) {
                function2Qie.invoke(v2, m5.ty());
            }
        }
    }

    public M5(List list, Function2 function2, boolean z2, c7r source) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f11894n = list;
        this.rl = function2;
        this.f11895t = z2;
        this.nr = source;
    }

    public /* synthetic */ M5(List list, Function2 function2, boolean z2, c7r c7rVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i2 & 2) != 0 ? null : function2, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? c7r.f11943t : c7rVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: HI, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(j holder, int i2) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.O((V) this.f11894n.get(i2));
    }

    public final boolean az() {
        return this.f11895t;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: ck, reason: merged with bridge method [inline-methods] */
    public j onCreateViewHolder(ViewGroup parent, int i2) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        crp crpVarT = crp.t(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(crpVarT, "inflate(...)");
        return new j(this, crpVarT);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f11894n.size();
    }

    public final Function2 qie() {
        return this.rl;
    }

    public final c7r ty() {
        return this.nr;
    }
}
