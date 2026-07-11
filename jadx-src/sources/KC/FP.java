package KC;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.alightcreative.app.motion.tutorial.entities.SampleProjectInfo;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class FP extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ArrayList f5072n;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Function1 f5073t;

    public FP(ArrayList sampleProjectList, int i2, Function1 onDownloadClick) {
        Intrinsics.checkNotNullParameter(sampleProjectList, "sampleProjectList");
        Intrinsics.checkNotNullParameter(onDownloadClick, "onDownloadClick");
        this.f5072n = sampleProjectList;
        this.rl = i2;
        this.f5073t = onDownloadClick;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: az, reason: merged with bridge method [inline-methods] */
    public giR onCreateViewHolder(ViewGroup parent, int i2) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        SJ0.FP fpT = SJ0.FP.t(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(fpT, "inflate(...)");
        return new giR(fpT);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f5072n.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: qie, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(giR holder, int i2) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object obj = this.f5072n.get(i2);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        holder.O((SampleProjectInfo) obj, this.rl, this.f5073t);
    }
}
