package KC;

import SJ0.Il5;
import android.content.Context;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.alightcreative.app.motion.tutorial.entities.TipInfo;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class H extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Il5 f5074n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(Il5 itemBinding) {
        super(itemBinding.getRoot());
        Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
        this.f5074n = itemBinding;
    }

    public final void nr(TipInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        SY6.j jVarBuild = ((Hwc.I28) Hwc.w6.Uo().wTp(info.rl()).nY(true)).build();
        Intrinsics.checkNotNullExpressionValue(jVarBuild, "build(...)");
        this.f5074n.f9157t.setController(jVarBuild);
        TextView textView = this.f5074n.nr;
        Map mapT = info.t();
        Context context = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        textView.setText(Iy.w6.t(mapT, context));
        TextView textView2 = this.f5074n.rl;
        Map mapN = info.n();
        Context context2 = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        textView2.setText(Iy.w6.t(mapN, context2));
    }
}
