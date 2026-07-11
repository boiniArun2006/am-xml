package f0P;

import LdY.Ml;
import QmE.j;
import android.content.Context;
import android.content.Intent;
import android.graphics.Matrix;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.SeekBar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.alightcreative.app.motion.activities.ColorPickerActivity;
import com.alightcreative.app.motion.activities.edit.widgets.ColorPickerWidget;
import com.alightcreative.app.motion.persist.j;
import com.alightcreative.app.motion.scene.CameraElementKt;
import com.alightcreative.app.motion.scene.ColorKt;
import com.alightcreative.app.motion.scene.Drawing;
import com.alightcreative.app.motion.scene.DrawingTool;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.SceneElementKt;
import com.alightcreative.app.motion.scene.SceneHolder;
import com.alightcreative.app.motion.scene.Stroke;
import com.alightcreative.app.motion.scene.StrokePoint;
import com.alightcreative.app.motion.scene.Transform;
import com.alightcreative.app.motion.scene.Vector2D;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.firebase.auth.FirebaseAuth;
import com.safedk.android.utils.Logger;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001e\u0010\u0006J\u000f\u0010\u001f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001f\u0010 J!\u0010\"\u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u001b¢\u0006\u0004\b$\u0010%J\u0017\u0010)\u001a\u00020(2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0012H\u0016¢\u0006\u0004\b+\u0010\u0006J)\u00100\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\t2\u0006\u0010-\u001a\u00020\t2\b\u0010/\u001a\u0004\u0018\u00010.H\u0017¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0012H\u0016¢\u0006\u0004\b2\u0010\u0006J\u0017\u00105\u001a\u00020\u00122\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0012H\u0016¢\u0006\u0004\b7\u0010\u0006R\u0018\u0010;\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\"\u0010C\u001a\u00020<8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010K\u001a\u00020D8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u0016\u0010N\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010P\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010MR\u0016\u0010T\u001a\u00020Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010W\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010[\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0018\u0010_\u001a\u0004\u0018\u00010\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0016\u0010b\u001a\u00020`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010aR\u0016\u0010f\u001a\u00020c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0018\u0010i\u001a\u0004\u0018\u00010g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010hR\u0014\u0010k\u001a\u0002088BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b]\u0010jR\u0016\u0010n\u001a\u0004\u0018\u00010g8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bl\u0010m¨\u0006o"}, d2 = {"Lf0P/J2L;", "Lyc/QhI;", "Lyc/H;", "Lyc/Buf;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "", "width", "", "P5", "(F)I", "progress", "jB", "(I)F", "Lcom/alightcreative/app/motion/scene/Vector2D;", "location", "pressure", "", "U", "(Lcom/alightcreative/app/motion/scene/Vector2D;F)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", TtmlNode.RUBY_CONTAINER, "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onDestroyView", "t", "()I", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "v", "(Landroid/view/View;)V", "Lyc/a;", "motionEvent", "", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Lyc/a;)Z", "nr", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "onStart", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "onStop", "LSJ0/Pp;", "o", "LSJ0/Pp;", "_binding", "LkgE/fuX;", "Z", "LkgE/fuX;", "wTp", "()LkgE/fuX;", "setIapManager", "(LkgE/fuX;)V", "iapManager", "LQmE/iF;", "S", "LQmE/iF;", "s7N", "()LQmE/iF;", "setEventLogger", "(LQmE/iF;)V", "eventLogger", "g", "I", "cts", "E2", "currentColor", "Lcom/alightcreative/app/motion/scene/DrawingTool;", "e", "Lcom/alightcreative/app/motion/scene/DrawingTool;", "drawingTool", "X", "F", "strokeWidth", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "[I", "progressToWidthTable", "LLdY/Ml$j;", "N", "LLdY/Ml$j;", "undoBatch", "Lcom/alightcreative/app/motion/scene/Drawing;", "Lcom/alightcreative/app/motion/scene/Drawing;", "baseDrawing", "Lcom/alightcreative/app/motion/scene/Stroke;", "Xw", "Lcom/alightcreative/app/motion/scene/Stroke;", "currentStroke", "Lcom/alightcreative/app/motion/scene/SceneElement;", "Lcom/alightcreative/app/motion/scene/SceneElement;", "updatedDrawingElement", "()LSJ0/Pp;", "binding", "nHg", "()Lcom/alightcreative/app/motion/scene/SceneElement;", "drawingElement", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDrawingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawingFragment.kt\ncom/alightcreative/app/motion/activities/edit/fragments/DrawingFragment\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,358:1\n216#2,2:359\n1826#3,6:361\n*S KotlinDebug\n*F\n+ 1 DrawingFragment.kt\ncom/alightcreative/app/motion/activities/edit/fragments/DrawingFragment\n*L\n146#1:359,2\n185#1:361,6\n*E\n"})
public final class J2L extends AbstractC2000Nb implements yc.QhI, yc.H, yc.Buf {

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private int currentColor;

    /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
    private Ml.j undoBatch;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    public QmE.iF eventLogger;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    private final int[] progressToWidthTable;

    /* JADX INFO: renamed from: X, reason: collision with root package name and from kotlin metadata */
    private float strokeWidth;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private Stroke currentStroke;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    public kgE.fuX iapManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private DrawingTool drawingTool;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int cts;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private SceneElement updatedDrawingElement;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private SJ0.Pp _binding;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private Drawing baseDrawing;

    public static final class I28 implements SeekBar.OnSeekBarChangeListener {
        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }

        I28() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i2, boolean z2) {
            J2L j2l = J2L.this;
            j2l.strokeWidth = j2l.jB(i2);
            J2L.this.N().f9270O.setText(String.valueOf((int) J2L.this.strokeWidth));
            com.alightcreative.app.motion.persist.j.INSTANCE.setDrawingStrokeWidth(J2L.this.strokeWidth);
        }
    }

    public static final class Ml implements ColorPickerWidget.w6 {
        Ml() {
        }

        @Override // com.alightcreative.app.motion.activities.edit.widgets.ColorPickerWidget.w6
        public void n() {
            SceneHolder sceneHolderE = HW.C.e(J2L.this);
            if (sceneHolderE != null) {
                sceneHolderE.setEditMode(2131362629);
            }
        }

        @Override // com.alightcreative.app.motion.activities.edit.widgets.ColorPickerWidget.w6
        public void nr() {
            KeyEventDispatcher.Component activity = J2L.this.getActivity();
            HW.I28 i28 = activity instanceof HW.I28 ? (HW.I28) activity : null;
            if (i28 != null) {
                i28.qie();
            }
        }

        @Override // com.alightcreative.app.motion.activities.edit.widgets.ColorPickerWidget.w6
        public void rl() {
            KeyEventDispatcher.Component activity = J2L.this.getActivity();
            HW.I28 i28 = activity instanceof HW.I28 ? (HW.I28) activity : null;
            if (i28 != null) {
                i28.qie();
            }
        }

        @Override // com.alightcreative.app.motion.activities.edit.widgets.ColorPickerWidget.w6
        public void t() {
            SceneHolder sceneHolderE = HW.C.e(J2L.this);
            if (sceneHolderE != null) {
                sceneHolderE.setEditMode(2131362630);
            }
        }
    }

    public static final class n implements ColorPickerWidget.j {
        n() {
        }

        @Override // com.alightcreative.app.motion.activities.edit.widgets.ColorPickerWidget.j
        public void n(int i2) {
            J2L.this.currentColor = i2;
            com.alightcreative.app.motion.persist.j.INSTANCE.setDrawingColor(HI0.qf.rl(J2L.this.currentColor));
        }
    }

    public static final class w6 implements ColorPickerWidget.n {
        public static void safedk_Fragment_startActivityForResult_6fd6bf7695baae8f1a141a4d4340bbe1(Fragment p0, Intent p1, int p2) {
            Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/fragment/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V");
            if (p1 == null) {
                return;
            }
            p0.startActivityForResult(p1, p2);
        }

        w6() {
        }

        @Override // com.alightcreative.app.motion.activities.edit.widgets.ColorPickerWidget.n
        public void n(int i2) {
            FragmentActivity activity = J2L.this.getActivity();
            if (activity == null) {
                return;
            }
            Intent intent = new Intent(activity, (Class<?>) ColorPickerActivity.class);
            intent.putExtra("CURRENT_COLOR", i2);
            safedk_Fragment_startActivityForResult_6fd6bf7695baae8f1a141a4d4340bbe1(J2L.this, intent, 100);
        }
    }

    private static final float[] bzg(Matrix matrix, float f3, float f4) {
        float[] fArr = {f3, f4};
        matrix.mapPoints(fArr);
        return fArr;
    }

    @Override // yc.H
    public void nr() {
    }

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[j.aC.values().length];
            try {
                iArr[j.aC.f45846n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j.aC.f45848t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j.aC.f45845O.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SJ0.Pp N() {
        SJ0.Pp pp = this._binding;
        Intrinsics.checkNotNull(pp);
        return pp;
    }

    private final int P5(float width) {
        int length = this.progressToWidthTable.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (r0[length] <= width) {
                    return length;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        return -1;
    }

    private final void U(Vector2D location, float pressure) {
        StrokePoint strokePoint = (StrokePoint) CollectionsKt.lastOrNull((List) this.currentStroke.getPoints());
        if (Intrinsics.areEqual(strokePoint != null ? strokePoint.getLocation() : null, location)) {
            return;
        }
        Stroke stroke = this.currentStroke;
        this.currentStroke = Stroke.copy$default(stroke, CollectionsKt.plus((Collection<? extends StrokePoint>) stroke.getPoints(), new StrokePoint(location, pressure)), null, null, 0.0f, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Xw(J2L j2l, DrawingTool drawingTool, Map map, ImageButton imageButton, View view) {
        DrawingTool drawingTool2 = j2l.drawingTool;
        if (drawingTool2 != drawingTool) {
            ImageButton imageButton2 = (ImageButton) map.get(drawingTool2);
            if (imageButton2 != null) {
                imageButton2.setActivated(false);
            }
            imageButton.setActivated(true);
            j2l.drawingTool = drawingTool;
            com.alightcreative.app.motion.persist.j.INSTANCE.setDrawingTool(drawingTool.name());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float jB(int progress) {
        int[] iArr = this.progressToWidthTable;
        return iArr[RangesKt.coerceIn(progress, 0, iArr.length - 1)];
    }

    @Override // yc.Buf
    public boolean n(yc.a motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        SceneHolder sceneHolderE = HW.C.e(this);
        if (sceneHolderE == null) {
            return false;
        }
        Scene scene = sceneHolderE.getScene();
        SceneElement sceneElementNHg = nHg();
        if (sceneElementNHg == null) {
            return false;
        }
        Vector2D vector2DRl = motionEvent.rl();
        float x2 = vector2DRl.getX();
        float y2 = vector2DRl.getY();
        Transform transformValueAtTime = CameraElementKt.applyCameraAndParenting(sceneElementNHg, scene, HW.C.aYN(this), sceneHolderE.getUserPreviewMode()).getTransform().valueAtTime(SceneElementKt.fractionalTime(sceneElementNHg, this.cts));
        Matrix matrix = new Matrix();
        transformValueAtTime.getMatrix().invert(matrix);
        float[] fArrBzg = bzg(matrix, x2, y2);
        float f3 = fArrBzg[0];
        float f4 = fArrBzg[1];
        int actionMasked = motionEvent.n().getActionMasked();
        if (actionMasked == 0) {
            this.undoBatch = HW.C.xMQ(this);
            this.baseDrawing = sceneElementNHg.getDrawing();
            this.currentStroke = new Stroke(CollectionsKt.emptyList(), HI0.qf.t(this.currentColor), this.drawingTool, this.strokeWidth);
            U(new Vector2D(f3, f4), motionEvent.n().getPressure());
            Drawing drawing = this.baseDrawing;
            SceneElement sceneElementCopy$default = SceneElement.copy$default(sceneElementNHg, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, drawing.copy(CollectionsKt.plus((Collection<? extends Stroke>) drawing.getStrokes(), this.currentStroke)), null, null, null, null, false, null, null, false, null, null, -268435457, 127, null);
            sceneHolderE.update(sceneElementCopy$default);
            this.updatedDrawingElement = sceneElementCopy$default;
            return true;
        }
        if (actionMasked == 1) {
            Ml.j jVar = this.undoBatch;
            if (jVar == null) {
                return true;
            }
            jVar.n();
            return true;
        }
        if (actionMasked != 2) {
            return true;
        }
        int historySize = motionEvent.n().getHistorySize();
        for (int i2 = 0; i2 < historySize; i2++) {
            Vector2D vector2DT = motionEvent.t(i2);
            float[] fArrBzg2 = bzg(matrix, vector2DT.getX(), vector2DT.getY());
            U(new Vector2D(fArrBzg2[0], fArrBzg2[1]), motionEvent.n().getHistoricalPressure(i2));
        }
        U(new Vector2D(f3, f4), motionEvent.n().getPressure());
        U(new Vector2D(f3, f4), motionEvent.n().getPressure());
        Drawing drawing2 = this.baseDrawing;
        SceneElement sceneElementCopy$default2 = SceneElement.copy$default(sceneElementNHg, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, drawing2.copy(CollectionsKt.plus((Collection<? extends Stroke>) drawing2.getStrokes(), this.currentStroke)), null, null, null, null, false, null, null, false, null, null, -268435457, 127, null);
        sceneHolderE.update(sceneElementCopy$default2);
        this.updatedDrawingElement = sceneElementCopy$default2;
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        int intExtra;
        if (requestCode != 100) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }
        if (resultCode != -1 || data == null || (intExtra = data.getIntExtra("NEW_COLOR", 0)) == 0 || intExtra == ColorKt.toInt(N().rl.getSelectedColor())) {
            return;
        }
        N().rl.setColor(intExtra);
        this.currentColor = intExtra;
        com.alightcreative.app.motion.persist.j.INSTANCE.setDrawingColor(HI0.qf.rl(intExtra));
    }

    @Override // f0P.AbstractC2000Nb, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        s7N().n(new j.fuX("edit_drawing", null, 2, null));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this._binding = SJ0.Pp.t(inflater, container, false);
        ConstraintLayout root = N().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        N().rl.setColor(this.currentColor);
        N().rl.setOnColorChangeListener(new n());
        N().rl.setPalletteClickListener(new w6());
        N().rl.setSceneHolder(HW.C.e(this));
        N().rl.setSpoidEventListener(new Ml());
        final Map mapMapOf = MapsKt.mapOf(TuplesKt.to(DrawingTool.PEN, N().mUb), TuplesKt.to(DrawingTool.BRUSH, N().Uo), TuplesKt.to(DrawingTool.FILL, N().xMQ), TuplesKt.to(DrawingTool.ERASER, N().KN));
        Iterator it = mapMapOf.entrySet().iterator();
        while (true) {
            boolean z2 = true;
            if (!it.hasNext()) {
                N().f9270O.setText(String.valueOf((int) this.strokeWidth));
                N().nr.setProgress(P5(this.strokeWidth));
                N().nr.setMax(this.progressToWidthTable.length - 1);
                N().nr.setOnSeekBarChangeListener(new I28());
                return;
            }
            Map.Entry entry = (Map.Entry) it.next();
            final DrawingTool drawingTool = (DrawingTool) entry.getKey();
            Object value = entry.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "component2(...)");
            final ImageButton imageButton = (ImageButton) value;
            if (drawingTool != this.drawingTool) {
                z2 = false;
            }
            imageButton.setActivated(z2);
            imageButton.setOnClickListener(new View.OnClickListener() { // from class: f0P.zO
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    J2L.Xw(this.f66403n, drawingTool, mapMapOf, imageButton, view2);
                }
            });
        }
    }

    public final QmE.iF s7N() {
        QmE.iF iFVar = this.eventLogger;
        if (iFVar != null) {
            return iFVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void v(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = getContext();
        if (context == null) {
            return;
        }
        com.alightcreative.widget.nKK nkk = new com.alightcreative.widget.nKK(context, wTp(), false, 4, null);
        com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
        nkk.aYN(2132019924, 2131361951, jVar.getDrawingPreview() == j.aC.f45846n);
        nkk.aYN(2132019922, 2131361949, jVar.getDrawingPreview() == j.aC.f45845O);
        nkk.aYN(2132019923, 2131361950, jVar.getDrawingPreview() == j.aC.f45848t);
        nkk.fD(new Function1() { // from class: f0P.qiB
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return J2L.rV9(this.f66074n, ((Integer) obj).intValue());
            }
        });
        nkk.X(getResources().getDimensionPixelSize(2131166272));
        com.alightcreative.widget.nKK.N(nkk, view, 0, 0, null, 14, null);
    }

    public final kgE.fuX wTp() {
        kgE.fuX fux = this.iapManager;
        if (fux != null) {
            return fux;
        }
        Intrinsics.throwUninitializedPropertyAccessException("iapManager");
        return null;
    }

    public J2L() {
        com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
        this.currentColor = HI0.gnv.Uo(jVar.getDrawingColor());
        DrawingTool drawingTool = (DrawingTool) HI0.Ew.n(DrawingTool.values(), jVar.getDrawingTool());
        this.drawingTool = drawingTool == null ? DrawingTool.PEN : drawingTool;
        this.strokeWidth = jVar.getDrawingStrokeWidth();
        this.progressToWidthTable = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 22, 24, 26, 28, 30, 33, 36, 40, 45, 50, 60, 70, 80, 90, 100, com.safedk.android.analytics.brandsafety.b.f61769v, 140, 160, 180, 200, 250, com.safedk.android.internal.d.f62986a};
        this.baseDrawing = Drawing.INSTANCE.getEMPTY();
        this.currentStroke = Stroke.INSTANCE.getEMPTY();
    }

    private final SceneElement nHg() {
        return HW.C.nHg(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit rV9(J2L j2l, int i2) {
        switch (i2) {
            case 2131361949:
                com.alightcreative.app.motion.persist.j.INSTANCE.setDrawingPreview(j.aC.f45845O);
                SceneHolder sceneHolderE = HW.C.e(j2l);
                if (sceneHolderE != null) {
                    sceneHolderE.setEditMode(2131362619);
                }
                break;
            case 2131361950:
                com.alightcreative.app.motion.persist.j.INSTANCE.setDrawingPreview(j.aC.f45848t);
                SceneHolder sceneHolderE2 = HW.C.e(j2l);
                if (sceneHolderE2 != null) {
                    sceneHolderE2.setEditMode(2131362622);
                }
                break;
            case 2131361951:
                com.alightcreative.app.motion.persist.j.INSTANCE.setDrawingPreview(j.aC.f45846n);
                SceneHolder sceneHolderE3 = HW.C.e(j2l);
                if (sceneHolderE3 != null) {
                    sceneHolderE3.setEditMode(2131362616);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        FirebaseAuth.getInstance().t(new com.alightcreative.app.motion.activities.Al(wTp()));
        super.onStart();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        FirebaseAuth.getInstance().ck(new com.alightcreative.app.motion.activities.Al(wTp()));
        super.onStop();
    }

    @Override // yc.QhI
    public int t() {
        if (N().rl.getBinding().mUb.isActivated()) {
            return 2131362629;
        }
        int i2 = j.$EnumSwitchMapping$0[com.alightcreative.app.motion.persist.j.INSTANCE.getDrawingPreview().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    return 2131362619;
                }
                throw new NoWhenBranchMatchedException();
            }
            return 2131362622;
        }
        return 2131362616;
    }
}
