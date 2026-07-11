package Gu;

import SJ0.Z5b;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.alightcreative.app.motion.tutorial.entities.TutorialInfo;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class SPz extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ArrayList f3768n;
    private final Function1 rl;

    public SPz(ArrayList tutorials, Function1 onPlayClick) {
        Intrinsics.checkNotNullParameter(tutorials, "tutorials");
        Intrinsics.checkNotNullParameter(onPlayClick, "onPlayClick");
        this.f3768n = tutorials;
        this.rl = onPlayClick;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: az, reason: merged with bridge method [inline-methods] */
    public r onCreateViewHolder(ViewGroup parent, int i2) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Z5b z5bT = Z5b.t(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(z5bT, "inflate(...)");
        return new r(z5bT);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f3768n.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: qie, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(r holder, int i2) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object obj = this.f3768n.get(i2);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        holder.O((TutorialInfo) obj, this.rl);
    }
}
