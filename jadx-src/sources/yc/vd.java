package yc;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import yc.psW;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class vd extends RecyclerView.ViewHolder implements tmw {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final SJ0.Sis f76149n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vd(SJ0.Sis itemBinding) {
        super(itemBinding.getRoot());
        Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
        this.f76149n = itemBinding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J2(psW.j jVar, int i2, View view) {
        if (jVar != null) {
            jVar.n(i2);
        }
    }

    public final void O(final int i2, final psW.j jVar, BitmapDrawable bitmapDrawable, int i3, boolean z2) {
        int dimensionPixelOffset = this.itemView.getResources().getDimensionPixelOffset(2131165316);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelOffset, dimensionPixelOffset, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        bitmapCreateBitmap.eraseColor(i2);
        if (i3 > -1) {
            this.f76149n.nr.getLayoutParams().width = i3;
            this.f76149n.nr.getLayoutParams().height = i3;
            this.f76149n.rl.getLayoutParams().width = i3;
            this.f76149n.rl.getLayoutParams().height = i3;
        }
        this.f76149n.rl.setImageBitmap(bitmapCreateBitmap);
        this.f76149n.rl.setBackground(bitmapDrawable);
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: yc.rv6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vd.J2(jVar, i2, view);
            }
        });
        if (z2 || Color.alpha(i2) >= 255) {
            this.f76149n.f9322t.setVisibility(8);
        } else {
            this.f76149n.f9322t.setVisibility(0);
        }
    }

    @Override // yc.tmw
    public void n() {
        this.itemView.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f);
    }

    @Override // yc.tmw
    public void rl() {
        this.itemView.animate().scaleX(2.0f).scaleY(2.0f).alpha(0.8f).setDuration(300L);
    }
}
