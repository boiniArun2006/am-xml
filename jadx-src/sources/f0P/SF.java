package f0P;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.SceneElementKt;
import com.alightcreative.app.motion.scene.visualeffect.KeyableVisualEffectRef;
import com.alightcreative.app.motion.scene.visualeffect.VisualEffect;
import com.alightcreative.app.motion.scene.visualeffect.VisualEffectKt;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class SF extends RecyclerView.Adapter {
    private final Q.fuX J2;
    private List KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f64686O;
    private final kgE.fuX Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final SceneElement f64687n;
    private final Function2 nr;
    private final Function0 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Function1 f64688t;

    public static final class j extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final ViewBinding f64689n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ViewBinding itemBinding) {
            super(itemBinding.getRoot());
            Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
            this.f64689n = itemBinding;
        }

        public final ViewBinding nr() {
            return this.f64689n;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z(View view) {
    }

    public SF(SceneElement element, Function0 onAddEffectClickListener, Function1 onToggleVisibilityListener, Function2 onEffectSettingsClickListener, boolean z2, Q.fuX featureUnlockManager, kgE.fuX iapManager) {
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(onAddEffectClickListener, "onAddEffectClickListener");
        Intrinsics.checkNotNullParameter(onToggleVisibilityListener, "onToggleVisibilityListener");
        Intrinsics.checkNotNullParameter(onEffectSettingsClickListener, "onEffectSettingsClickListener");
        Intrinsics.checkNotNullParameter(featureUnlockManager, "featureUnlockManager");
        Intrinsics.checkNotNullParameter(iapManager, "iapManager");
        this.f64687n = element;
        this.rl = onAddEffectClickListener;
        this.f64688t = onToggleVisibilityListener;
        this.nr = onEffectSettingsClickListener;
        this.f64686O = z2;
        this.J2 = featureUnlockManager;
        this.Uo = iapManager;
        this.KN = SceneElementKt.getVisualEffectsInOrder(element);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void XQ(SF sf, j jVar, int i2, View view) {
        Function2 function2 = sf.nr;
        View itemView = jVar.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        function2.invoke(itemView, Integer.valueOf(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(SF sf, int i2, View view) {
        sf.f64688t.invoke(Integer.valueOf(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(SF sf, View view) {
        sf.rl.invoke();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: Ik, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(final j holder, final int i2) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ViewBinding viewBindingNr = holder.nr();
        if (viewBindingNr instanceof SJ0.FKk) {
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: f0P.yvO
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SF.r(this.f66386n, view);
                }
            });
            return;
        }
        if (viewBindingNr instanceof SJ0.Fl) {
            final KeyableVisualEffectRef keyableVisualEffectRef = (KeyableVisualEffectRef) this.KN.get(i2);
            VisualEffect visualEffectVisualEffectById = VisualEffectKt.visualEffectById(keyableVisualEffectRef.getId());
            ((SJ0.Fl) holder.nr()).f9136t.setVisibility(0);
            ((SJ0.Fl) holder.nr()).f9136t.setImageResource(keyableVisualEffectRef.getHidden() ? 2131232060 : 2131232058);
            ((SJ0.Fl) holder.nr()).f9136t.setOnClickListener(new View.OnClickListener() { // from class: f0P.SUH
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SF.o(this.f64696n, i2, view);
                }
            });
            boolean z2 = this.Uo.Uo().contains(kgE.K.f70072S) || this.J2.t(keyableVisualEffectRef.getId());
            int i3 = 8;
            ((SJ0.Fl) holder.nr()).f9134O.setVisibility((kgE.Md.n().contains(keyableVisualEffectRef.getId()) && z2) ? 0 : 8);
            AppCompatImageView appCompatImageView = ((SJ0.Fl) holder.nr()).J2;
            if (kgE.Md.n().contains(keyableVisualEffectRef.getId()) && !z2) {
                i3 = 0;
            }
            appCompatImageView.setVisibility(i3);
            ((SJ0.Fl) holder.nr()).f9134O.setImageDrawable(AppCompatResources.rl(holder.itemView.getContext(), 2131231824));
            if (visualEffectVisualEffectById == null) {
                ((SJ0.Fl) holder.nr()).rl.setText("?" + keyableVisualEffectRef.getId());
                holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: f0P.eD
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SF.Z(view);
                    }
                });
                return;
            }
            Iy.n localizedStrings = visualEffectVisualEffectById.getLocalizedStrings();
            Context context = holder.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            String strN = Iy.w6.n(localizedStrings, context, visualEffectVisualEffectById.getName());
            if (visualEffectVisualEffectById.getDeprecated()) {
                ((SJ0.Fl) holder.nr()).rl.setText(holder.itemView.getResources().getString(2132017674, strN));
            } else if (visualEffectVisualEffectById.getExperimental()) {
                ((SJ0.Fl) holder.nr()).rl.setText(strN + " (experimental)");
            } else if (visualEffectVisualEffectById.getInternal()) {
                ((SJ0.Fl) holder.nr()).rl.setText(strN + " (internal)");
            } else {
                ((SJ0.Fl) holder.nr()).rl.setText(strN);
            }
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: f0P.iB
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SF.XQ(this.f65632n, holder, i2, view);
                }
            });
            if (this.f64686O) {
                this.f64686O = false;
                holder.itemView.post(new Runnable() { // from class: f0P.ng
                    @Override // java.lang.Runnable
                    public final void run() {
                        SF.S(keyableVisualEffectRef, this, holder, i2);
                    }
                });
            }
        }
    }

    public final boolean ViF(int i2, int i3) {
        XoT.C.nr("onMoveEffect(" + i2 + "," + i3 + ") effects.size=" + this.KN.size());
        if (i2 >= this.KN.size() || i3 >= this.KN.size()) {
            return false;
        }
        HI0.rv6.rl(this.KN, i2, i3);
        notifyItemMoved(i2, i3);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: WPU, reason: merged with bridge method [inline-methods] */
    public j onCreateViewHolder(ViewGroup parent, int i2) {
        ViewBinding viewBindingT;
        Intrinsics.checkNotNullParameter(parent, "parent");
        switch (i2) {
            case 2131558545:
                viewBindingT = SJ0.FKk.t(LayoutInflater.from(parent.getContext()), parent, false);
                Intrinsics.checkNotNull(viewBindingT);
                break;
            case 2131558546:
                viewBindingT = SJ0.Fl.t(LayoutInflater.from(parent.getContext()), parent, false);
                Intrinsics.checkNotNull(viewBindingT);
                break;
            default:
                throw new UnsupportedOperationException();
        }
        return new j(viewBindingT);
    }

    public final boolean aYN(int i2) {
        XoT.C.nr("onDeleteEffect(" + i2 + ") effects.size=" + this.KN.size());
        if (i2 >= this.KN.size()) {
            return false;
        }
        HI0.rv6.O(this.KN, i2);
        notifyItemRemoved(i2);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.KN.size() + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i2) {
        return i2 >= this.KN.size() ? 2131558545 : 2131558546;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(KeyableVisualEffectRef keyableVisualEffectRef, SF sf, j jVar, int i2) {
        if (kgE.Md.n().contains(keyableVisualEffectRef.getId()) && !sf.Uo.Uo().contains(kgE.K.f70072S)) {
            return;
        }
        Function2 function2 = sf.nr;
        View itemView = jVar.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        function2.invoke(itemView, Integer.valueOf(i2));
    }
}
