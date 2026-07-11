package Y;

import Y.w6;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class w6 extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f11994n;
    private final Function2 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Function2 f11995t;

    public final class j extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final SJ0.Z f11996n;
        final /* synthetic */ w6 rl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(w6 w6Var, SJ0.Z itemBinding) {
            super(itemBinding.getRoot());
            Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
            this.rl = w6Var;
            this.f11996n = itemBinding;
        }

        public final void J2(final o7q effect, int i2) {
            Intrinsics.checkNotNullParameter(effect, "effect");
            if (i2 == 0 || i2 % 2 == 0) {
                this.f11996n.J2.setBackgroundColor(this.itemView.getResources().getColor(2131099744, this.itemView.getResources().newTheme()));
            } else {
                this.f11996n.J2.setBackgroundColor(this.itemView.getResources().getColor(2131099746, this.itemView.getResources().newTheme()));
            }
            this.f11996n.f9399t.setVisibility(0);
            if (effect.t() != null) {
                this.f11996n.f9397O.setText(effect.rl());
                this.f11996n.Uo.setVisibility(0);
                this.f11996n.Uo.setText(this.itemView.getContext().getString(2132019893) + ":  " + effect.t());
            } else {
                this.f11996n.f9397O.setText(this.itemView.getResources().getString(2132020223));
                this.f11996n.Uo.setVisibility(8);
            }
            this.f11996n.rl.setSelected(com.alightcreative.app.motion.persist.j.INSTANCE.getFavoriteEffects().contains(effect.n()));
            View view = this.f11996n.nr;
            final w6 w6Var = this.rl;
            view.setOnClickListener(new View.OnClickListener() { // from class: Y.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    w6.j.Uo(w6Var, effect, view2);
                }
            });
            AppCompatImageButton appCompatImageButton = this.f11996n.rl;
            final w6 w6Var2 = this.rl;
            appCompatImageButton.setOnClickListener(new View.OnClickListener() { // from class: Y.n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    w6.j.KN(w6Var2, effect, view2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void KN(w6 w6Var, o7q o7qVar, View view) {
            w6Var.az().invoke(o7qVar.n(), o7qVar.t());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void Uo(w6 w6Var, o7q o7qVar, View view) {
            w6Var.qie().invoke(o7qVar.n(), o7qVar.t());
        }
    }

    public w6(List list, Function2 addListener, Function2 favoriteListener) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(addListener, "addListener");
        Intrinsics.checkNotNullParameter(favoriteListener, "favoriteListener");
        this.f11994n = list;
        this.rl = addListener;
        this.f11995t = favoriteListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: HI, reason: merged with bridge method [inline-methods] */
    public j onCreateViewHolder(ViewGroup parent, int i2) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        SJ0.Z zT2 = SJ0.Z.t(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(zT2, "inflate(...)");
        return new j(this, zT2);
    }

    public final Function2 az() {
        return this.f11995t;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f11994n.size();
    }

    public final Function2 qie() {
        return this.rl;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: ty, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(j holder, int i2) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.J2((o7q) this.f11994n.get(i2), i2);
    }
}
