package Y;

import Y.l3D;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yc.S;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class l3D extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f11961n;
    private final Function1 rl;

    public final class j extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final SJ0.o7q f11962n;
        final /* synthetic */ l3D rl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(l3D l3d, SJ0.o7q itemBinding) {
            super(itemBinding.getRoot());
            Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
            this.rl = l3d;
            this.f11962n = itemBinding;
        }

        public final void O(S info, final int i2) {
            Intrinsics.checkNotNullParameter(info, "info");
            this.f11962n.f9579t.setText(this.itemView.getContext().getString(info.t()));
            Integer numNr = info.nr();
            if (numNr != null) {
                this.f11962n.rl.setImageResource(numNr.intValue());
            } else {
                this.f11962n.rl.setImageDrawable(null);
            }
            View view = this.itemView;
            final l3D l3d = this.rl;
            view.setOnClickListener(new View.OnClickListener() { // from class: Y.QJ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    l3D.j.J2(l3d, i2, view2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void J2(l3D l3d, int i2, View view) {
            l3d.qie().invoke(Integer.valueOf(i2));
        }
    }

    public l3D(List list, Function1 listener) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f11961n = list;
        this.rl = listener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: az, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(j holder, int i2) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.O((S) this.f11961n.get(i2), i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f11961n.size();
    }

    public final Function1 qie() {
        return this.rl;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: ty, reason: merged with bridge method [inline-methods] */
    public j onCreateViewHolder(ViewGroup parent, int i2) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        SJ0.o7q o7qVarT = SJ0.o7q.t(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(o7qVarT, "inflate(...)");
        return new j(this, o7qVarT);
    }
}
