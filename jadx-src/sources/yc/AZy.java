package yc;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class AZy extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final SJ0.fg f75702n;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J2(Function1 function1, int i2, int i3, View view) {
        function1.invoke(Integer.valueOf((i2 - i3) - 1));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AZy(SJ0.fg itemBinding) {
        super(itemBinding.getRoot());
        Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
        this.f75702n = itemBinding;
    }

    public final void O(String title, final int i2, final int i3, final Function1 onClick) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        SJ0.fg fgVar = this.f75702n;
        if (i2 == 0) {
            fgVar.rl.setVisibility(8);
            fgVar.nr.setVisibility(0);
            fgVar.f9436O.setBackground(this.itemView.getResources().getDrawable(2131232254, this.itemView.getContext().getTheme()));
        } else if (i2 == i3 - 1) {
            fgVar.rl.setVisibility(0);
            fgVar.nr.setVisibility(8);
            fgVar.f9436O.setBackground(null);
        } else {
            fgVar.rl.setVisibility(0);
            fgVar.nr.setVisibility(8);
            fgVar.f9436O.setBackground(this.itemView.getResources().getDrawable(2131232257, this.itemView.getContext().getTheme()));
        }
        fgVar.f9438t.setText(title);
        fgVar.f9436O.setOnClickListener(new View.OnClickListener() { // from class: yc.dT
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AZy.J2(onClick, i3, i2, view);
            }
        });
    }
}
