package com.alightcreative.widget;

import QmE.j;
import SJ0.W;
import SJ0.t6;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
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
import com.alightcreative.widget.V1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class V1 {
    private final SceneThumbnailMaker J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final QmE.iF f47311O;
    private int Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f47312n;
    private final String nr;
    private final boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Scene f47313t;

    /* JADX INFO: Access modifiers changed from: private */
    static final class j extends RecyclerView.Adapter {
        private final SceneThumbnailMaker J2;
        private final Function1 KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final QmE.iF f47314O;
        private final boolean Uo;
        private final WeakHashMap mUb;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final List f47315n;
        private final String nr;
        private final SceneElement rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Scene f47316t;
        private final Function0 xMQ;

        /* JADX INFO: renamed from: com.alightcreative.widget.V1$j$j, reason: collision with other inner class name */
        public static final class C0685j extends RecyclerView.ViewHolder {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final W f47317n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0685j(W itemBinding) {
                super(itemBinding.getRoot());
                Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
                this.f47317n = itemBinding;
            }

            public final W nr() {
                return this.f47317n;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i2) {
            return 2131558662;
        }

        public j(List layerList, SceneElement selectedElement, Scene scene, String str, QmE.iF eventLogger, SceneThumbnailMaker thumbnailMaker, boolean z2, Function1 actionListener, Function0 dismiss) {
            Intrinsics.checkNotNullParameter(layerList, "layerList");
            Intrinsics.checkNotNullParameter(selectedElement, "selectedElement");
            Intrinsics.checkNotNullParameter(scene, "scene");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(thumbnailMaker, "thumbnailMaker");
            Intrinsics.checkNotNullParameter(actionListener, "actionListener");
            Intrinsics.checkNotNullParameter(dismiss, "dismiss");
            this.f47315n = layerList;
            this.rl = selectedElement;
            this.f47316t = scene;
            this.nr = str;
            this.f47314O = eventLogger;
            this.J2 = thumbnailMaker;
            this.Uo = z2;
            this.KN = actionListener;
            this.xMQ = dismiss;
            this.mUb = new WeakHashMap();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void Ik(j jVar, SceneElement sceneElement, View view) {
            jVar.f47314O.n(new j.oXP(jVar.nr, rWZ.j.rl(sceneElement), rWZ.j.rl(jVar.rl)));
            jVar.KN.invoke(Long.valueOf(sceneElement.getId()));
            jVar.xMQ.invoke();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit o(j jVar, ImageView imageView, SceneElement sceneElement, Bitmap bm) {
            Intrinsics.checkNotNullParameter(bm, "bm");
            synchronized (jVar.mUb) {
            }
            imageView.setImageBitmap(bm);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit r(j jVar, ImageView imageView, SceneElement sceneElement, Bitmap bm) {
            Intrinsics.checkNotNullParameter(bm, "bm");
            synchronized (jVar.mUb) {
            }
            imageView.setImageBitmap(bm);
            return Unit.INSTANCE;
        }

        public final int HI(SceneElement el) {
            Intrinsics.checkNotNullParameter(el, "el");
            return this.f47315n.indexOf(el);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
        public C0685j onCreateViewHolder(ViewGroup parent, int i2) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            W wT = W.t(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(wT, "inflate(...)");
            return new C0685j(wT);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: ck, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(C0685j holder, int i2) throws Throwable {
            Bitmap bitmap;
            Intrinsics.checkNotNullParameter(holder, "holder");
            W wNr = holder.nr();
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            final SceneElement sceneElement = (SceneElement) this.f47315n.get(i2);
            itemView.setBackgroundTintList(this.Uo ? itemView.getResources().getColorStateList(2131100868, itemView.getContext().getTheme()) : itemView.getResources().getColorStateList(2131100871, itemView.getContext().getTheme()));
            itemView.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.widget.Ogx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    V1.j.Ik(this.f47174n, sceneElement, view);
                }
            });
            boolean zDirectParent = SceneElementKt.directParent(sceneElement, this.rl.getParent());
            boolean z2 = (sceneElement.getId() == this.rl.getId() || SceneElementKt.indirectParent(sceneElement, this.f47316t, this.rl.getId())) ? false : true;
            boolean zIsBlank = StringsKt.isBlank(StringsKt.trim((CharSequence) sceneElement.getLabel()).toString());
            wNr.J2.setText(zIsBlank ? itemView.getResources().getString(2132019383) : sceneElement.getLabel());
            Integer numValueOf = null;
            wNr.J2.setTextColor(zIsBlank ? itemView.getResources().getColor(2131099680, null) : itemView.getResources().getColor(2131099755, null));
            wNr.J2.setPaintFlags(Intrinsics.areEqual(sceneElement, this.rl) ? wNr.J2.getPaintFlags() | 8 : wNr.J2.getPaintFlags() & (-9));
            wNr.J2.setAlpha(z2 ? 1.0f : 0.25f);
            wNr.f9377O.setAlpha(z2 ? 1.0f : 0.25f);
            wNr.nr.setVisibility(zDirectParent ? 0 : 4);
            itemView.setEnabled(z2);
            wNr.f9379t.setVisibility(!z2 ? 0 : 4);
            wNr.xMQ.setVisibility(zDirectParent ? 0 : 4);
            wNr.gh.setBackgroundColor(ColorKt.toInt(sceneElement.getTag().getColors().rl()));
            final ImageView iconView = wNr.f9377O;
            Intrinsics.checkNotNullExpressionValue(iconView, "iconView");
            iconView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            if (SceneElementKt.getMissingMedia(sceneElement)) {
                iconView.setImageResource(2131231847);
                iconView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                return;
            }
            if (sceneElement.getType() == SceneElementType.Audio) {
                iconView.setImageResource(2131231070);
                iconView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                return;
            }
            if (sceneElement.getType() == SceneElementType.NullObject) {
                iconView.setImageResource(2131231850);
                iconView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                return;
            }
            if (sceneElement.getType() == SceneElementType.Camera) {
                iconView.setImageResource(2131231569);
                iconView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                return;
            }
            synchronized (this.mUb) {
                bitmap = (Bitmap) this.mUb.get(sceneElement);
            }
            if (bitmap != null) {
                iconView.setImageBitmap(bitmap);
                return;
            }
            if (!Intrinsics.areEqual(com.alightcreative.app.motion.persist.j.INSTANCE.getThumbBounds(), "element")) {
                SceneThumbnailMaker.makeThumbnailAsync$default(this.J2, this.f47316t, Long.valueOf(sceneElement.getId()), null, new Function1() { // from class: com.alightcreative.widget.T
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return V1.j.o(this.f47252n, iconView, sceneElement, (Bitmap) obj);
                    }
                }, 4, null);
                return;
            }
            if (sceneElement.getType() == SceneElementType.Scene && sceneElement.getNestedScene().getThumbnailTime() >= 0) {
                numValueOf = Integer.valueOf(sceneElement.getNestedScene().getThumbnailTime());
            }
            Integer num = numValueOf;
            int iIntValue = (num != null ? num.intValue() : 0) + 1000;
            KeyableTransform keyableTransformAsKeyable = TransformKt.asKeyable(Transform.copy$default(sceneElement.getTransform().valueAtTime(0.3f), null, null, null, 0.0f, 0.0f, 0.0f, 1.0f, null, null, 447, null));
            Map<Long, KeyableVisualEffectRef> visualEffects = sceneElement.getVisualEffects();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<Long, KeyableVisualEffectRef> entry : visualEffects.entrySet()) {
                VisualEffect visualEffectVisualEffectById = VisualEffectKt.visualEffectById(entry.getValue().getId());
                if (visualEffectVisualEffectById != null && !visualEffectVisualEffectById.getShaderGroups().isEmpty() && visualEffectVisualEffectById.getScripts().isEmpty()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            SceneElement sceneElementCopy$default = SceneElement.copy$default(sceneElement, null, 0, iIntValue, 0L, null, null, keyableTransformAsKeyable, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, linkedHashMap, null, null, null, null, null, null, null, false, null, null, false, null, null, -33554503, 109, null);
            Rectangle rectangleBoundsAtTime = SceneElementKt.boundsAtTime(sceneElementCopy$default, this.f47316t, 0.5f, 15, 30);
            float f3 = 2;
            SceneElement sceneElementCopy$default2 = SceneElement.copy$default(sceneElementCopy$default, null, 0, 0, 0L, null, null, TransformKt.translatedBy(sceneElementCopy$default.getTransform(), (rectangleBoundsAtTime.getWidth() / f3) - rectangleBoundsAtTime.getCx(), (rectangleBoundsAtTime.getHeight() / f3) - rectangleBoundsAtTime.getCy()), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -65, 127, null);
            Rectangle rectangleBoundsAtTime2 = SceneElementKt.boundsAtTime(sceneElementCopy$default2, this.f47316t, 0.5f, 15, 30);
            SceneThumbnailMaker.makeThumbnailAsync$default(this.J2, new Scene(null, 0, MathKt.roundToInt(rectangleBoundsAtTime2.getWidth()), MathKt.roundToInt(rectangleBoundsAtTime2.getHeight()), MathKt.roundToInt(rectangleBoundsAtTime2.getWidth()), MathKt.roundToInt(rectangleBoundsAtTime2.getHeight()), CollectionsKt.listOf(SceneElement.copy$default(sceneElementCopy$default2, null, 0, 0, 0L, null, null, TransformKt.scaledBy$default(sceneElementCopy$default2.getTransform(), 0.8f, 0.8f, 0.0f, 0.0f, 12, null), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -65, 127, null)), 0, SolidColor.INSTANCE.getTRANSPARENT(), null, null, null, null, 0, 0, 0, false, 0L, null, null, 1048195, null), null, num, new Function1() { // from class: com.alightcreative.widget.DC
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return V1.j.r(this.f47052n, iconView, sceneElement, (Bitmap) obj);
                }
            }, 2, null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f47315n.size();
        }
    }

    /* synthetic */ class n extends FunctionReferenceImpl implements Function0 {
        n(Object obj) {
            super(0, obj, PopupWindow.class, "dismiss", "dismiss()V", 0);
        }

        public final void n() {
            ((PopupWindow) this.receiver).dismiss();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            n();
            return Unit.INSTANCE;
        }
    }

    public V1(Context context, boolean z2, Scene scene, String str, QmE.iF eventLogger, SceneThumbnailMaker thumbnailMaker) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(thumbnailMaker, "thumbnailMaker");
        this.f47312n = context;
        this.rl = z2;
        this.f47313t = scene;
        this.nr = str;
        this.f47311O = eventLogger;
        this.J2 = thumbnailMaker;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J2(Function1 function1, PopupWindow popupWindow, View view) {
        function1.invoke(null);
        popupWindow.dismiss();
    }

    public final void nr(View anchor, final SceneElement selectedElement, final Function1 actionListener) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        Intrinsics.checkNotNullParameter(selectedElement, "selectedElement");
        Intrinsics.checkNotNullParameter(actionListener, "actionListener");
        List<SceneElement> elements = this.f47313t.getElements();
        ArrayList arrayList = new ArrayList();
        for (Object obj : elements) {
            if (((SceneElement) obj).getType() != SceneElementType.Audio) {
                arrayList.add(obj);
            }
        }
        final PopupWindow popupWindow = new PopupWindow(this.f47312n);
        int i2 = this.Uo;
        if (i2 > 0) {
            popupWindow.setWidth(i2);
        }
        popupWindow.setOutsideTouchable(true);
        popupWindow.setTouchable(true);
        popupWindow.setFocusable(true);
        popupWindow.setBackgroundDrawable(ResourcesCompat.J2(this.f47312n.getResources(), this.rl ? 2131232190 : 2131232189, this.f47312n.getTheme()));
        final t6 t6VarT = t6.t(LayoutInflater.from(this.f47312n));
        Intrinsics.checkNotNullExpressionValue(t6VarT, "inflate(...)");
        popupWindow.setContentView(t6VarT.getRoot());
        t6VarT.J2.setLayoutManager(new LinearLayoutManager(this.f47312n, 1, false));
        final j jVar = new j(CollectionsKt.asReversed(arrayList), selectedElement, this.f47313t, this.nr, this.f47311O, this.J2, false, actionListener, new n(popupWindow));
        t6VarT.J2.setAdapter(jVar);
        t6VarT.J2.post(new Runnable() { // from class: com.alightcreative.widget.CM
            @Override // java.lang.Runnable
            public final void run() {
                V1.O(jVar, selectedElement, t6VarT);
            }
        });
        t6VarT.f9642t.setBackgroundColor(selectedElement.getParent() == null ? this.f47312n.getResources().getColor(2131099654, null) : 0);
        t6VarT.f9642t.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.widget.crp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                V1.J2(actionListener, popupWindow, view);
            }
        });
        popupWindow.showAsDropDown(anchor);
    }

    public final void t(int i2) {
        this.Uo = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(j jVar, SceneElement sceneElement, t6 t6Var) {
        t6Var.J2.scrollToPosition(jVar.HI(sceneElement));
    }

    public /* synthetic */ V1(Context context, boolean z2, Scene scene, String str, QmE.iF iFVar, SceneThumbnailMaker sceneThumbnailMaker, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? true : z2, scene, str, iFVar, sceneThumbnailMaker);
    }
}
