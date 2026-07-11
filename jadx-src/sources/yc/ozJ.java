package yc;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class ozJ extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ArrayList f76086n;
    private final Function1 rl;

    public ozJ(ArrayList list, Function1 onClick) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.f76086n = list;
        this.rl = onClick;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: az, reason: merged with bridge method [inline-methods] */
    public AZy onCreateViewHolder(ViewGroup parent, int i2) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        SJ0.fg fgVarT = SJ0.fg.t(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(fgVarT, "inflate(...)");
        return new AZy(fgVarT);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f76086n.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: qie, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(AZy holder, int i2) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object obj = this.f76086n.get(i2);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        holder.O((String) obj, i2, this.f76086n.size(), this.rl);
    }

    public final void ty(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.f76086n = arrayList;
    }
}
