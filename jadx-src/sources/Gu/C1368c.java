package Gu;

import SJ0.iy;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Gu.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class C1368c extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ArrayList f3773n;
    private final Context rl;

    public C1368c(ArrayList list, Context context) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f3773n = list;
        this.rl = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: az, reason: merged with bridge method [inline-methods] */
    public UGc onCreateViewHolder(ViewGroup parent, int i2) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        iy iyVarT = iy.t(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(iyVarT, "inflate(...)");
        return new UGc(iyVarT);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f3773n.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: qie, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(UGc holder, int i2) {
        String str;
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (((l3D) this.f3773n.get(i2)).nr() != null) {
            str = "android.resource://" + this.rl.getPackageName() + "/" + ((l3D) this.f3773n.get(i2)).nr();
        } else {
            str = null;
        }
        Object obj = this.f3773n.get(i2);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        holder.O((l3D) obj, str);
    }
}
