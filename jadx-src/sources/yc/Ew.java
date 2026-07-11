package yc;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.alightcreative.app.motion.activities.E3;
import com.alightcreative.app.motion.scene.CompoundCubicBSpline;
import com.alightcreative.app.motion.scene.CubicBSpline;
import com.alightcreative.app.motion.scene.CubicBSplineKt;
import com.alightcreative.app.motion.scene.Vector2D;
import com.alightcreative.app.motion.scene.liveshape.LiveShape;
import com.alightcreative.app.motion.scene.liveshape.LiveShapeScriptKt;
import com.alightcreative.app.motion.scene.liveshape.PositionedShapeHandle;
import com.alightcreative.app.motion.scene.liveshape.ShapeHandleIcon;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Ew extends RecyclerView.Adapter {
    private final Paint J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Paint f75724O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f75725n;
    private final Paint nr;
    private final Function2 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Paint f75726t;

    public static final class j extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final ImageView f75727n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(SJ0.DAz itemBinding) {
            super(itemBinding.getRoot());
            Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
            ImageView shapeThumbnail = itemBinding.rl;
            Intrinsics.checkNotNullExpressionValue(shapeThumbnail, "shapeThumbnail");
            this.f75727n = shapeThumbnail;
        }

        public final ImageView nr() {
            return this.f75727n;
        }
    }

    public /* synthetic */ class n {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ShapeHandleIcon.values().length];
            try {
                iArr[ShapeHandleIcon.Dot.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShapeHandleIcon.HollowDot.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Ew(List shapes, Function2 onItemClick) {
        Intrinsics.checkNotNullParameter(shapes, "shapes");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        this.f75725n = shapes;
        this.rl = onItemClick;
        Paint paint = new Paint(1);
        paint.setColor(-1);
        paint.setAlpha(178);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        Paint.Join join = Paint.Join.ROUND;
        paint.setStrokeJoin(join);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setStrokeWidth(40.0f);
        this.f75726t = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(-1);
        paint2.setStyle(style);
        paint2.setStrokeJoin(join);
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(40.0f);
        this.nr = paint2;
        Paint paint3 = new Paint(1);
        paint3.setColor(-1);
        paint3.setAlpha(178);
        Paint.Style style2 = Paint.Style.STROKE;
        paint3.setStyle(style2);
        paint3.setStrokeJoin(join);
        paint3.setStrokeCap(cap);
        paint3.setStrokeWidth(40.0f);
        this.f75724O = paint3;
        Paint paint4 = new Paint(1);
        paint4.setColor(-16777216);
        paint4.setAlpha(178);
        paint4.setStyle(style2);
        paint4.setStrokeJoin(join);
        paint4.setStrokeCap(cap);
        paint4.setStrokeWidth(4.0f);
        this.J2 = paint4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ty(Ew ew, int i2, View view) {
        ew.rl.invoke(Integer.valueOf(i2), ew.f75725n.get(i2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: HI, reason: merged with bridge method [inline-methods] */
    public j onCreateViewHolder(ViewGroup parent, int i2) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        SJ0.DAz dAzT = SJ0.DAz.t(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(dAzT, "inflate(...)");
        return new j(dAzT);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: az, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(j holder, final int i2) {
        List<PositionedShapeHandle> listEmptyList;
        Intrinsics.checkNotNullParameter(holder, "holder");
        E3 e3 = (E3) this.f75725n.get(i2);
        LiveShape liveShapeT = e3.t();
        if (liveShapeT == null || (listEmptyList = LiveShapeScriptKt.getDefaultHandles(liveShapeT)) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        Vector2D center = CubicBSplineKt.knotBounds(e3.rl()).getCenter();
        CompoundCubicBSpline compoundCubicBSplineCenteredAtOrigin = CubicBSplineKt.centeredAtOrigin(e3.rl());
        float fFitInScale = CubicBSplineKt.fitInScale(compoundCubicBSplineCenteredAtOrigin, com.safedk.android.internal.d.f62986a, com.safedk.android.internal.d.f62986a);
        CompoundCubicBSpline compoundCubicBSplineTimes = CubicBSplineKt.times(compoundCubicBSplineCenteredAtOrigin, fFitInScale);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(340, 340, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        if (((CubicBSpline) CollectionsKt.first((List) compoundCubicBSplineTimes.getContours())).getClosed()) {
            canvas.drawPath(CubicBSplineKt.toPath(CubicBSplineKt.plus(compoundCubicBSplineTimes, new Vector2D(170.0f, 170.0f))).t(), this.f75726t);
            for (PositionedShapeHandle positionedShapeHandle : listEmptyList) {
                int i3 = n.$EnumSwitchMapping$0[positionedShapeHandle.getIcon().ordinal()];
                if (i3 == 1 || i3 == 2) {
                    canvas.drawCircle(((positionedShapeHandle.getX() - center.getX()) * fFitInScale) + 150.0f + 20.0f, ((positionedShapeHandle.getY() - center.getY()) * fFitInScale) + 150.0f + 20.0f, 18.0f, this.nr);
                }
            }
        } else {
            canvas.drawPath(CubicBSplineKt.toPath(CubicBSplineKt.plus(compoundCubicBSplineTimes, new Vector2D(170.0f, 170.0f))).t(), this.f75724O);
            canvas.drawPath(CubicBSplineKt.toPath(CubicBSplineKt.plus(compoundCubicBSplineTimes, new Vector2D(170.0f, 170.0f))).t(), this.J2);
        }
        holder.nr().setImageBitmap(bitmapCreateBitmap);
        holder.nr().setOnClickListener(new View.OnClickListener() { // from class: yc.Z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Ew.ty(this.f75905n, i2, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f75725n.size();
    }
}
