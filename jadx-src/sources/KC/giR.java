package KC;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.alightcreative.app.motion.tutorial.entities.SampleProjectInfo;
import com.bendingspoons.spidersense.data.storageManager.internal.CV.jhotmBbwMbr;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class giR extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final SJ0.FP f5181n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public giR(SJ0.FP itemBinding) {
        super(itemBinding.getRoot());
        Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
        this.f5181n = itemBinding;
    }

    public final void O(final SampleProjectInfo sampleProjectInfo, int i2, final Function1 onDownloadClick) {
        Intrinsics.checkNotNullParameter(sampleProjectInfo, jhotmBbwMbr.oKNOunRfIfq);
        Intrinsics.checkNotNullParameter(onDownloadClick, "onDownloadClick");
        this.f5181n.f9130t.getLayoutParams().width = i2;
        this.f5181n.f9130t.getLayoutParams().height = i2;
        this.f5181n.nr.getLayoutParams().width = i2;
        this.f5181n.nr.getLayoutParams().height = i2;
        SY6.j jVarBuild = ((Hwc.I28) Hwc.w6.Uo().wTp(sampleProjectInfo.n()).nY(true)).build();
        Intrinsics.checkNotNullExpressionValue(jVarBuild, "build(...)");
        this.f5181n.nr.setController(jVarBuild);
        TextView textView = this.f5181n.f9128O;
        Map mapNr = sampleProjectInfo.nr();
        Context context = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        textView.setText(Iy.w6.t(mapNr, context));
        this.f5181n.f9128O.setTextColor(Color.parseColor(sampleProjectInfo.t()));
        this.f5181n.rl.setOnClickListener(new View.OnClickListener() { // from class: KC.I7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                giR.J2(onDownloadClick, sampleProjectInfo, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J2(Function1 function1, SampleProjectInfo sampleProjectInfo, View view) {
        function1.invoke(sampleProjectInfo.rl());
    }
}
