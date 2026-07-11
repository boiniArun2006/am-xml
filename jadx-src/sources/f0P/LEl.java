package f0P;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alightcreative.app.motion.scene.BlendingMode;
import f0P.LEl;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class LEl extends RecyclerView.Adapter {
    private final OU[] J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private j f64443O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Function2 f64444n;
    private OU nr;
    private final Function1 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private BlendingMode f64445t;

    public final class j extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final SJ0.yg f64446n;
        private OU rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ LEl f64447t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(LEl lEl, SJ0.yg itemBinding) {
            super(itemBinding.getRoot());
            Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
            this.f64447t = lEl;
            this.f64446n = itemBinding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void KN(OU ou2, LEl lEl, j jVar, View view) {
            if (ou2 == OU.f64564t) {
                BlendingMode blendingModeIk = lEl.Ik();
                BlendingMode blendingMode = BlendingMode.NORMAL;
                if (blendingModeIk != blendingMode) {
                    lEl.XQ(blendingMode);
                    lEl.ck().invoke(blendingMode);
                    return;
                }
                return;
            }
            if (ou2 == lEl.ty()) {
                lEl.Z(null);
                jVar.itemView.setActivated(true);
                jVar.f64446n.rl.setVisibility(8);
                jVar.f64446n.J2.setRotation(0.0f);
                lEl.notifyItemChanged(jVar.getBindingAdapterPosition());
                return;
            }
            j jVar2 = lEl.f64443O;
            if (jVar2 != null && jVar2.rl == lEl.ty()) {
                jVar2.itemView.setActivated(false);
                jVar2.f64446n.rl.setVisibility(8);
                jVar2.f64446n.J2.setRotation(0.0f);
            }
            lEl.Z(ou2);
            lEl.f64443O = jVar;
            jVar.itemView.setActivated(true);
            jVar.f64446n.rl.setVisibility(0);
            jVar.f64446n.J2.setRotation(90.0f);
            lEl.HI().invoke(ou2, Integer.valueOf(jVar.getBindingAdapterPosition()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit Uo(j jVar, LEl lEl, BlendingMode newMode) {
            Intrinsics.checkNotNullParameter(newMode, "newMode");
            RecyclerView.Adapter adapter = jVar.f64446n.rl.getAdapter();
            Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.alightcreative.app.motion.activities.edit.fragments.BlendModeAdapter");
            ((mz) adapter).ck(newMode);
            lEl.XQ(newMode);
            lEl.ck().invoke(newMode);
            return Unit.INSTANCE;
        }

        public final void J2(final OU category) {
            Intrinsics.checkNotNullParameter(category, "category");
            this.rl = category;
            this.f64446n.nr.setText(category.rl());
            this.f64446n.rl.setLayoutManager(new LinearLayoutManager(this.itemView.getContext(), 0, false));
            RecyclerView recyclerView = this.f64446n.rl;
            BlendingMode blendingModeIk = this.f64447t.Ik();
            final LEl lEl = this.f64447t;
            Function1 function1 = new Function1() { // from class: f0P.p
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LEl.j.Uo(this.f66022n, lEl, (BlendingMode) obj);
                }
            };
            List list = YzO.f65131n;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((gnv) obj).rl() == category) {
                    arrayList.add(obj);
                }
            }
            recyclerView.setAdapter(new mz(blendingModeIk, function1, arrayList));
            ImageView imageView = this.f64446n.f9688O;
            Object obj2 = YzO.rl.get(this.f64447t.Ik());
            Intrinsics.checkNotNull(obj2);
            imageView.setVisibility(category == ((gnv) obj2).rl() ? 0 : 8);
            TextView textView = this.f64446n.Uo;
            Object obj3 = YzO.rl.get(this.f64447t.Ik());
            Intrinsics.checkNotNull(obj3);
            textView.setVisibility(category == ((gnv) obj3).rl() ? 0 : 8);
            TextView textView2 = this.f64446n.Uo;
            Object obj4 = YzO.rl.get(this.f64447t.Ik());
            Intrinsics.checkNotNull(obj4);
            textView2.setText(((gnv) obj4).nr());
            LinearLayout linearLayout = this.f64446n.f9690t;
            final LEl lEl2 = this.f64447t;
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: f0P.O
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LEl.j.KN(category, lEl2, this, view);
                }
            });
            if (category == OU.f64564t) {
                this.itemView.setActivated(false);
                this.f64446n.rl.setVisibility(8);
                this.f64446n.J2.setVisibility(8);
            } else {
                this.itemView.setActivated(category == this.f64447t.ty());
                this.f64446n.rl.setVisibility(category == this.f64447t.ty() ? 0 : 8);
                this.f64446n.J2.setVisibility(0);
                this.f64446n.J2.setRotation(category == this.f64447t.ty() ? 90.0f : 0.0f);
            }
        }
    }

    public LEl(BlendingMode initialBlendingMode, Function2 onCategoryExpanded, Function1 onItemSelected) {
        Intrinsics.checkNotNullParameter(initialBlendingMode, "initialBlendingMode");
        Intrinsics.checkNotNullParameter(onCategoryExpanded, "onCategoryExpanded");
        Intrinsics.checkNotNullParameter(onItemSelected, "onItemSelected");
        this.f64444n = onCategoryExpanded;
        this.rl = onItemSelected;
        this.f64445t = initialBlendingMode;
        gnv gnvVar = (gnv) YzO.rl.get(initialBlendingMode);
        this.nr = gnvVar != null ? gnvVar.rl() : null;
        this.J2 = OU.values();
    }

    public final Function2 HI() {
        return this.f64444n;
    }

    public final BlendingMode Ik() {
        return this.f64445t;
    }

    public final void XQ(BlendingMode value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.f64445t != value) {
            this.f64445t = value;
            notifyDataSetChanged();
        }
    }

    public final void Z(OU ou2) {
        this.nr = ou2;
    }

    public final Function1 ck() {
        return this.rl;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.J2.length;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public j onCreateViewHolder(ViewGroup parent, int i2) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        SJ0.yg ygVarT = SJ0.yg.t(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(ygVarT, "inflate(...)");
        return new j(this, ygVarT);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(j holder, int i2) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.J2(this.J2[i2]);
    }

    public final OU ty() {
        return this.nr;
    }
}
