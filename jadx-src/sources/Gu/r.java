package Gu;

import SJ0.Z5b;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.alightcreative.app.motion.tutorial.entities.TutorialInfo;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class r extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Z5b f3784n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Z5b itemBinding) {
        super(itemBinding.getRoot());
        Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
        this.f3784n = itemBinding;
    }

    public final void O(final TutorialInfo info, final Function1 onPlayClick) {
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(onPlayClick, "onPlayClick");
        SY6.j jVarBuild = ((Hwc.I28) Hwc.w6.Uo().wTp(info.rl()).nY(true)).build();
        Intrinsics.checkNotNullExpressionValue(jVarBuild, "build(...)");
        this.f3784n.nr.setController(jVarBuild);
        TextView textView = this.f3784n.f9400O;
        Map mapT = info.t();
        Context context = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        textView.setText(Iy.w6.t(mapT, context));
        TextView textView2 = this.f3784n.rl;
        Map mapN = info.n();
        Context context2 = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        textView2.setText(Iy.w6.t(mapN, context2));
        this.f3784n.f9402t.setOnClickListener(new View.OnClickListener() { // from class: Gu.Q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r.J2(onPlayClick, info, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J2(Function1 function1, TutorialInfo tutorialInfo, View view) {
        function1.invoke(tutorialInfo.nr());
    }
}
