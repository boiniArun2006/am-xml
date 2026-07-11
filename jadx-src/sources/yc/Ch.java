package yc;

import SJ0.C1454b;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager;
import com.alightcreative.app.motion.scene.ColorKt;
import com.alightcreative.app.motion.scene.KeyableTransform;
import com.alightcreative.app.motion.scene.Rectangle;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.SceneElementKt;
import com.alightcreative.app.motion.scene.SceneElementType;
import com.alightcreative.app.motion.scene.SceneThumbnailMaker;
import com.alightcreative.app.motion.scene.SolidColor;
import com.alightcreative.app.motion.scene.Transform;
import com.alightcreative.app.motion.scene.TransformKt;
import com.alightcreative.app.motion.scene.visualeffect.KeyableVisualEffectRef;
import com.alightcreative.app.motion.scene.visualeffect.VisualEffect;
import com.alightcreative.app.motion.scene.visualeffect.VisualEffectKt;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class Ch extends AbstractC2448d {
    private final AppCompatImageView J2;
    private long KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final View f75712O;
    private final AppCompatImageView Uo;
    private SceneElement mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final C1454b f75713n;
    private AppCompatImageView nr;
    private final TimelineLayoutManager.j.EnumC0632j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f75714t;
    private final float xMQ;

    @Override // yc.AbstractC2448d
    public void nr(Scene scene, final SceneElement element, int i2, SceneThumbnailMaker sceneThumbnailMaker, List list, int i3, boolean z2) {
        Bitmap bitmap;
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(element, "element");
        this.f75714t = i2;
        View view = this.itemView;
        TimelineLayoutManager.j jVar = new TimelineLayoutManager.j(element.getStartTime(), element.getEndTime(), 0, null, 0, 0, 60, null);
        jVar.mUb(i2);
        jVar.gh(TimelineLayoutManager.j.EnumC0632j.f45182n);
        view.setLayoutParams(jVar);
        this.f75712O.setBackgroundColor(ColorKt.toInt(element.getTag().getColors().rl()));
        Integer numValueOf = null;
        if (this.KN != element.getId()) {
            this.nr.setImageBitmap(null);
        }
        this.KN = element.getId();
        this.nr.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.mUb = element;
        if (element.getClippingMask()) {
            this.J2.setTranslationX(-this.xMQ);
            this.nr.setTranslationX((-this.xMQ) / 2.0f);
            this.nr.setScaleX(0.83f);
            this.nr.setScaleY(0.83f);
            this.Uo.setVisibility(0);
        } else {
            this.J2.setTranslationX(0.0f);
            this.nr.setTranslationX(0.0f);
            this.nr.setScaleX(1.0f);
            this.nr.setScaleY(1.0f);
            this.Uo.setVisibility(8);
        }
        if (SceneElementKt.getMissingMedia(element)) {
            this.nr.setImageResource(2131231847);
            this.nr.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            return;
        }
        if (element.getType() == SceneElementType.Audio) {
            this.nr.setImageResource(2131231070);
            this.nr.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            return;
        }
        if (element.getType() == SceneElementType.NullObject) {
            this.nr.setImageResource(2131231850);
            this.nr.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            return;
        }
        if (element.getType() == SceneElementType.Camera) {
            this.nr.setImageResource(2131231569);
            this.nr.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            return;
        }
        synchronized (rCj.f76103n) {
            bitmap = (Bitmap) rCj.f76103n.get(element);
        }
        if (bitmap != null) {
            this.nr.setImageBitmap(bitmap);
            return;
        }
        if (!Intrinsics.areEqual(com.alightcreative.app.motion.persist.j.INSTANCE.getThumbBounds(), "element")) {
            if (sceneThumbnailMaker != null) {
                SceneThumbnailMaker.makeThumbnailAsync$default(sceneThumbnailMaker, scene, Long.valueOf(element.getId()), null, new Function1() { // from class: yc.OB3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Ch.gh(this.f75819n, element, (Bitmap) obj);
                    }
                }, 4, null);
                return;
            }
            return;
        }
        if (element.getType() == SceneElementType.Scene && element.getNestedScene().getThumbnailTime() >= 0) {
            numValueOf = Integer.valueOf(element.getNestedScene().getThumbnailTime());
        }
        int iIntValue = (numValueOf != null ? numValueOf.intValue() : 0) + 1000;
        KeyableTransform keyableTransformAsKeyable = TransformKt.asKeyable(Transform.copy$default(element.getTransform().valueAtTime(0.3f), null, null, null, 0.0f, 0.0f, 0.0f, 1.0f, null, null, 447, null));
        Map<Long, KeyableVisualEffectRef> visualEffects = element.getVisualEffects();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Long, KeyableVisualEffectRef> entry : visualEffects.entrySet()) {
            VisualEffect visualEffectVisualEffectById = VisualEffectKt.visualEffectById(entry.getValue().getId());
            if (visualEffectVisualEffectById != null && !visualEffectVisualEffectById.getShaderGroups().isEmpty() && visualEffectVisualEffectById.getScripts().isEmpty()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        SceneElement sceneElementCopy$default = SceneElement.copy$default(element, null, 0, iIntValue, 0L, null, null, keyableTransformAsKeyable, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, linkedHashMap, null, null, null, null, null, null, null, false, null, null, false, null, null, -33554503, 109, null);
        Rectangle rectangleBoundsAtTime = SceneElementKt.boundsAtTime(sceneElementCopy$default, scene, 0.5f, 15, 30);
        float f3 = 2;
        SceneElement sceneElementCopy$default2 = SceneElement.copy$default(sceneElementCopy$default, null, 0, 0, 0L, null, null, TransformKt.translatedBy(sceneElementCopy$default.getTransform(), (rectangleBoundsAtTime.getWidth() / f3) - rectangleBoundsAtTime.getCx(), (rectangleBoundsAtTime.getHeight() / f3) - rectangleBoundsAtTime.getCy()), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -65, 127, null);
        Rectangle rectangleBoundsAtTime2 = SceneElementKt.boundsAtTime(sceneElementCopy$default2, scene, 0.5f, 15, 30);
        Scene scene2 = new Scene(null, 0, MathKt.roundToInt(rectangleBoundsAtTime2.getWidth()), MathKt.roundToInt(rectangleBoundsAtTime2.getHeight()), MathKt.roundToInt(rectangleBoundsAtTime2.getWidth()), MathKt.roundToInt(rectangleBoundsAtTime2.getHeight()), CollectionsKt.listOf(SceneElement.copy$default(sceneElementCopy$default2, null, 0, 0, 0L, null, null, TransformKt.scaledBy$default(sceneElementCopy$default2.getTransform(), 0.8f, 0.8f, 0.0f, 0.0f, 12, null), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -65, 127, null)), 0, SolidColor.INSTANCE.getTRANSPARENT(), null, null, null, null, 0, 0, 0, false, 0L, null, null, 1048195, null);
        if (sceneThumbnailMaker != null) {
            SceneThumbnailMaker.makeThumbnailAsync$default(sceneThumbnailMaker, scene2, null, numValueOf, new Function1() { // from class: yc.dc
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Ch.mUb(this.f75951n, element, (Bitmap) obj);
                }
            }, 2, null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Ch(C1454b itemBinding) {
        Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
        FrameLayout root = itemBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        super(root);
        this.f75713n = itemBinding;
        this.rl = TimelineLayoutManager.j.EnumC0632j.f45182n;
        this.f75714t = -1;
        AppCompatImageView trackThumb = itemBinding.Uo;
        Intrinsics.checkNotNullExpressionValue(trackThumb, "trackThumb");
        this.nr = trackThumb;
        View trackTag = itemBinding.J2;
        Intrinsics.checkNotNullExpressionValue(trackTag, "trackTag");
        this.f75712O = trackTag;
        AppCompatImageView headerBg = itemBinding.f9415t;
        Intrinsics.checkNotNullExpressionValue(headerBg, "headerBg");
        this.J2 = headerBg;
        AppCompatImageView clippingMaskIndicator = itemBinding.rl;
        Intrinsics.checkNotNullExpressionValue(clippingMaskIndicator, "clippingMaskIndicator");
        this.Uo = clippingMaskIndicator;
        this.KN = -1L;
        this.xMQ = this.itemView.getContext().getResources().getDimension(2131165306);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit gh(Ch ch, SceneElement sceneElement, Bitmap bm) {
        Intrinsics.checkNotNullParameter(bm, "bm");
        if (ch.mUb == sceneElement) {
            synchronized (rCj.f76103n) {
            }
            ch.nr.setImageBitmap(bm);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mUb(Ch ch, SceneElement sceneElement, Bitmap bm) {
        Intrinsics.checkNotNullParameter(bm, "bm");
        if (ch.mUb == sceneElement) {
            synchronized (rCj.f76103n) {
            }
            ch.nr.setImageBitmap(bm);
        }
        return Unit.INSTANCE;
    }

    @Override // yc.AbstractC2448d
    public int J2() {
        return this.f75714t;
    }

    @Override // yc.AbstractC2448d
    public TimelineLayoutManager.j.EnumC0632j Uo() {
        return this.rl;
    }

    public final C1454b qie() {
        return this.f75713n;
    }
}
