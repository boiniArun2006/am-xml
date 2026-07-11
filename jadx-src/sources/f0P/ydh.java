package f0P;

import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import f0P.ydh;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class ydh extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f66372n;
    private final Function1 nr;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private com.alightcreative.app.motion.fonts.w6 f66373t;

    public final class j extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final ViewBinding f66374n;
        private com.alightcreative.app.motion.fonts.w6 rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ ydh f66375t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ydh ydhVar, ViewBinding itemBinding) {
            super(itemBinding.getRoot());
            Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
            this.f66375t = ydhVar;
            this.f66374n = itemBinding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void mUb(com.alightcreative.app.motion.fonts.w6 w6Var, j jVar, AppCompatTextView appCompatTextView, Result result) {
            if (Intrinsics.areEqual(w6Var, jVar.rl)) {
                appCompatTextView.setVisibility(0);
                Object value = result.getValue();
                if (Result.m319isFailureimpl(value)) {
                    value = null;
                }
                appCompatTextView.setTypeface((Typeface) value);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit qie(View child) {
            Intrinsics.checkNotNullParameter(child, "child");
            child.setActivated(false);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit xMQ(final j jVar, final com.alightcreative.app.motion.fonts.w6 w6Var, final AppCompatTextView appCompatTextView, final Result result) {
            jVar.itemView.post(new Runnable() { // from class: f0P.Vz
                @Override // java.lang.Runnable
                public final void run() {
                    ydh.j.mUb(w6Var, jVar, appCompatTextView, result);
                }
            });
            return Unit.INSTANCE;
        }

        public final void KN(final com.alightcreative.app.motion.fonts.w6 amTypeface) {
            final AppCompatTextView appCompatTextView;
            TextView textView;
            Intrinsics.checkNotNullParameter(amTypeface, "amTypeface");
            List listNr = amTypeface.n().nr();
            List listListOf = CollectionsKt.listOf((Object[]) new gP.Xo[]{gP.Xo.f67531FX, gP.Xo.f67528B, gP.Xo.f67534N, gP.Xo.f67536T, gP.Xo.f67535S});
            ArrayList arrayList = new ArrayList();
            for (Object obj : listListOf) {
                if (listNr.contains((gP.Xo) obj)) {
                    arrayList.add(obj);
                }
            }
            boolean z2 = arrayList.size() > 1;
            String country = this.itemView.getResources().getConfiguration().getLocales().get(0).getCountry();
            Intrinsics.checkNotNullExpressionValue(country, "getCountry(...)");
            Locale ROOT = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            String lowerCase = country.toLowerCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            ViewBinding viewBinding = this.f66374n;
            if (viewBinding instanceof SJ0.Sw) {
                appCompatTextView = ((SJ0.Sw) viewBinding).nr;
            } else if (viewBinding instanceof SJ0.xq) {
                appCompatTextView = ((SJ0.xq) viewBinding).nr;
            } else {
                if (!(viewBinding instanceof SJ0.DT)) {
                    throw new UnsupportedOperationException();
                }
                appCompatTextView = ((SJ0.DT) viewBinding).f9117t;
            }
            Intrinsics.checkNotNull(appCompatTextView);
            String str = "Abc";
            if (!z2) {
                if (listNr.contains(gP.Xo.f67531FX)) {
                    str = "은하수";
                } else if (listNr.contains(gP.Xo.f67528B)) {
                    str = "あいう";
                } else if (listNr.contains(gP.Xo.f67534N)) {
                    str = "اب";
                } else if (listNr.contains(gP.Xo.f67536T) && Intrinsics.areEqual(lowerCase, "in")) {
                    str = "कअ";
                } else if (listNr.contains(gP.Xo.f67535S) && Intrinsics.areEqual(lowerCase, "il")) {
                    str = "אק";
                }
            }
            appCompatTextView.setText(str);
            this.rl = amTypeface;
            Typeface typefaceS = com.alightcreative.app.motion.fonts.CN3.S(amTypeface, 15L);
            if (typefaceS != null) {
                appCompatTextView.setVisibility(0);
                appCompatTextView.setTypeface(typefaceS);
            } else {
                appCompatTextView.setVisibility(4);
                com.alightcreative.app.motion.fonts.CN3.Z(amTypeface, new Function1() { // from class: f0P.MoK
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return ydh.j.xMQ(this.f64499n, amTypeface, appCompatTextView, (Result) obj2);
                    }
                });
            }
            ViewBinding viewBinding2 = this.f66374n;
            if (viewBinding2 instanceof SJ0.Sw) {
                textView = ((SJ0.Sw) viewBinding2).f9332t;
            } else if (viewBinding2 instanceof SJ0.xq) {
                textView = ((SJ0.xq) viewBinding2).f9683t;
            } else {
                if (!(viewBinding2 instanceof SJ0.DT)) {
                    throw new UnsupportedOperationException();
                }
                textView = ((SJ0.DT) viewBinding2).rl;
            }
            Intrinsics.checkNotNull(textView);
            this.itemView.setActivated(Intrinsics.areEqual(amTypeface, this.f66375t.az()));
            textView.setText(com.alightcreative.app.motion.fonts.CN3.HI(amTypeface));
            View view = this.itemView;
            final ydh ydhVar = this.f66375t;
            view.setOnClickListener(new View.OnClickListener() { // from class: f0P.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ydh.j.gh(ydhVar, amTypeface, view2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void gh(ydh ydhVar, com.alightcreative.app.motion.fonts.w6 w6Var, View view) {
            View view2;
            Object parent = view.getParent();
            if (parent instanceof View) {
                view2 = (View) parent;
            } else {
                view2 = null;
            }
            if (view2 != null) {
                HI0.o7q.t(view2, new Function1() { // from class: f0P.bx
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ydh.j.qie((View) obj);
                    }
                });
            }
            view.setActivated(true);
            ydhVar.ck(w6Var);
            ydhVar.qie().invoke(w6Var);
        }
    }

    public ydh(List fontList, int i2, com.alightcreative.app.motion.fonts.w6 w6Var, Function1 onFontSelected) {
        Intrinsics.checkNotNullParameter(fontList, "fontList");
        Intrinsics.checkNotNullParameter(onFontSelected, "onFontSelected");
        this.f66372n = fontList;
        this.rl = i2;
        this.f66373t = w6Var;
        this.nr = onFontSelected;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: HI, reason: merged with bridge method [inline-methods] */
    public j onCreateViewHolder(ViewGroup parent, int i2) {
        ViewBinding viewBindingT;
        Intrinsics.checkNotNullParameter(parent, "parent");
        switch (i2) {
            case 2131558714:
                viewBindingT = SJ0.DT.t(LayoutInflater.from(parent.getContext()), parent, false);
                Intrinsics.checkNotNull(viewBindingT);
                break;
            case 2131558715:
                viewBindingT = SJ0.Sw.t(LayoutInflater.from(parent.getContext()), parent, false);
                Intrinsics.checkNotNull(viewBindingT);
                break;
            case 2131558716:
                viewBindingT = SJ0.xq.t(LayoutInflater.from(parent.getContext()), parent, false);
                Intrinsics.checkNotNull(viewBindingT);
                break;
            default:
                throw new UnsupportedOperationException();
        }
        return new j(this, viewBindingT);
    }

    public final com.alightcreative.app.motion.fonts.w6 az() {
        return this.f66373t;
    }

    public final void ck(com.alightcreative.app.motion.fonts.w6 w6Var) {
        this.f66373t = w6Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f66372n.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i2) {
        int i3 = this.rl;
        if (i2 == i3) {
            return 2131558715;
        }
        return (i2 != 0 || i3 < 1) ? 2131558714 : 2131558716;
    }

    public final Function1 qie() {
        return this.nr;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: ty, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(j holder, int i2) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.KN((com.alightcreative.app.motion.fonts.w6) this.f66372n.get(i2));
    }
}
