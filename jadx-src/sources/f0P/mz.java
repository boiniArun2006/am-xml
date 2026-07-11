package f0P;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.net.Toe.GDEJgAYrPQHfw;
import androidx.recyclerview.widget.RecyclerView;
import com.alightcreative.app.motion.scene.BlendingMode;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class mz extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Function1 f65802n;
    private final List rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private BlendingMode f65803t;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    public static final class j extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final SJ0.iF f65804n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(SJ0.iF itemBinding) {
            super(itemBinding.getRoot());
            Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
            this.f65804n = itemBinding;
        }

        public final SJ0.iF nr() {
            return this.f65804n;
        }
    }

    public mz(BlendingMode initialBlenidngMode, Function1 onBlendingModeChange, List list) {
        Intrinsics.checkNotNullParameter(initialBlenidngMode, "initialBlenidngMode");
        Intrinsics.checkNotNullParameter(onBlendingModeChange, "onBlendingModeChange");
        Intrinsics.checkNotNullParameter(list, GDEJgAYrPQHfw.ByeGkIgObkVtg);
        this.f65802n = onBlendingModeChange;
        this.rl = list;
        this.f65803t = initialBlenidngMode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ty(mz mzVar, int i2, View view) {
        BlendingMode blendingModeN = ((gnv) mzVar.rl.get(i2)).n();
        if (mzVar.f65803t != blendingModeN) {
            mzVar.ck(blendingModeN);
            mzVar.f65802n.invoke(blendingModeN);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: HI, reason: merged with bridge method [inline-methods] */
    public j onCreateViewHolder(ViewGroup parent, int i2) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        SJ0.iF iFVarT = SJ0.iF.t(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(iFVarT, "inflate(...)");
        return new j(iFVarT);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: az, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(j holder, final int i2) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(holder.itemView.getResources(), ((gnv) this.rl.get(i2)).t());
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeResource.getWidth(), bitmapDecodeResource.getHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(1);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmapDecodeResource, tileMode, tileMode));
        bitmapCreateBitmap.eraseColor(0);
        float fMin = Math.min(bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight()) / 6.0f;
        canvas.drawRoundRect(0.0f, 0.0f, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), fMin, fMin, paint);
        holder.nr().rl.setImageBitmap(bitmapCreateBitmap);
        holder.nr().f9485t.setText(((gnv) this.rl.get(i2)).nr());
        holder.itemView.setActivated(this.f65803t == ((gnv) this.rl.get(i2)).n());
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: f0P.l4Z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mz.ty(this.f65752n, i2, view);
            }
        });
    }

    public final void ck(BlendingMode blendingMode) {
        if (this.f65803t != blendingMode) {
            this.f65803t = blendingMode;
            notifyDataSetChanged();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.rl.size();
    }
}
