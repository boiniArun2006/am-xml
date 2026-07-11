package f0P;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class q9 extends RecyclerView.Adapter {
    private final List J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f66061O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f66062n;
    private int nr;
    private final Function1 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Function0 f66063t;

    public static final class j extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final SJ0.LEl f66064n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(SJ0.LEl itemBinding) {
            super(itemBinding.getRoot());
            Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
            this.f66064n = itemBinding;
        }

        public final void nr(int i2, int i3, int i5, int i7) {
            if (i7 == 0) {
                this.f66064n.rl.setScaleX(1.0f);
            } else if (i7 != 1) {
                return;
            } else {
                this.f66064n.rl.setScaleX(-1.0f);
            }
            this.f66064n.rl.setImageDrawable(this.itemView.getResources().getDrawable(i2, null));
            if (i3 == i5) {
                this.f66064n.rl.setColorFilter(this.itemView.getResources().getColor(2131099798, null));
            } else {
                this.f66064n.rl.setColorFilter(-1);
            }
        }
    }

    public q9(Context context, Function1 onItemClick, Function0 closePanel) {
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        Intrinsics.checkNotNullParameter(closePanel, "closePanel");
        this.f66062n = context;
        this.rl = onItemClick;
        this.f66063t = closePanel;
        this.f66061O = -1;
        this.J2 = CollectionsKt.listOf((Object[]) new Integer[]{2131232005, 2131231979, 2131232002, 2131232001, 2131231984, 2131231980, 2131231983, 2131231987, 2131231982, 2131231986, 2131231981, 2131231988, 2131231985});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HI(q9 q9Var, int i2, View view) {
        q9Var.rl.invoke(Integer.valueOf(i2));
        q9Var.r(i2);
    }

    public final void Ik(int i2) {
        if (this.nr != i2) {
            this.nr = i2;
            notifyDataSetChanged();
        }
    }

    public final int az() {
        return this.f66061O;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: ck, reason: merged with bridge method [inline-methods] */
    public j onCreateViewHolder(ViewGroup parent, int i2) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        SJ0.LEl lElT = SJ0.LEl.t(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(lElT, "inflate(...)");
        return new j(lElT);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.J2.size();
    }

    public final void r(int i2) {
        if (this.f66061O == i2) {
            this.f66063t.invoke();
        } else {
            this.f66061O = i2;
            notifyDataSetChanged();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: ty, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(j holder, final int i2) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.nr(((Number) this.J2.get(i2)).intValue(), i2, this.f66061O, this.nr);
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: f0P.voM
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q9.HI(this.f66275n, i2, view);
            }
        });
    }
}
