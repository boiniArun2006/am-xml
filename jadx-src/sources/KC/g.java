package KC;

import SJ0.Il5;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.alightcreative.app.motion.tutorial.entities.TipInfo;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class g extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ArrayList f5176n;

    public g(ArrayList tips) {
        Intrinsics.checkNotNullParameter(tips, "tips");
        this.f5176n = tips;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: az, reason: merged with bridge method [inline-methods] */
    public H onCreateViewHolder(ViewGroup parent, int i2) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Il5 il5T = Il5.t(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(il5T, "inflate(...)");
        return new H(il5T);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f5176n.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: qie, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(H holder, int i2) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object obj = this.f5176n.get(i2);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        holder.nr((TipInfo) obj);
    }
}
