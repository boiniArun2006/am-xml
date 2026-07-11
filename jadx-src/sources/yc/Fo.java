package yc;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager;
import com.alightcreative.app.motion.scene.FillType;
import com.alightcreative.app.motion.scene.Keyable;
import com.alightcreative.app.motion.scene.KeyableKt;
import com.alightcreative.app.motion.scene.Keyframe;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.SceneElementKt;
import com.alightcreative.app.motion.scene.SceneElementType;
import com.alightcreative.app.motion.scene.SceneThumbnailMaker;
import com.alightcreative.widget.AudioThumbnailView;
import com.alightcreative.widget.KeyframeView;
import com.alightcreative.widget.ThumbnailView;
import com.alightcreative.widget.TimelineBackgroundView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class Fo extends AbstractC2448d {
    private final TextView J2;
    private final ThumbnailView KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final KeyframeView f75738O;
    private final TextView Uo;
    private final int gh;
    private final TimelineBackgroundView mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final SJ0.rd f75739n;
    private final CardView nr;
    private final TimelineLayoutManager.j.EnumC0632j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f75740t;
    private final AudioThumbnailView xMQ;

    /* JADX WARN: Illegal instructions before constructor call */
    public Fo(SJ0.rd itemBinding) {
        Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
        ConstraintLayout root = itemBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        super(root);
        this.f75739n = itemBinding;
        this.rl = TimelineLayoutManager.j.EnumC0632j.f45185t;
        this.f75740t = -1;
        CardView elementFrame = itemBinding.nr;
        Intrinsics.checkNotNullExpressionValue(elementFrame, "elementFrame");
        this.nr = elementFrame;
        KeyframeView elementKeyframes = itemBinding.f9621O;
        Intrinsics.checkNotNullExpressionValue(elementKeyframes, "elementKeyframes");
        this.f75738O = elementKeyframes;
        TextView elementLabel = itemBinding.J2;
        Intrinsics.checkNotNullExpressionValue(elementLabel, "elementLabel");
        this.J2 = elementLabel;
        TextView clippingMaskIcon = itemBinding.f9623t;
        Intrinsics.checkNotNullExpressionValue(clippingMaskIcon, "clippingMaskIcon");
        this.Uo = clippingMaskIcon;
        ThumbnailView elementThumbnails = itemBinding.Uo;
        Intrinsics.checkNotNullExpressionValue(elementThumbnails, "elementThumbnails");
        this.KN = elementThumbnails;
        AudioThumbnailView audioThumbnails = itemBinding.rl;
        Intrinsics.checkNotNullExpressionValue(audioThumbnails, "audioThumbnails");
        this.xMQ = audioThumbnails;
        TimelineBackgroundView timelineItemBg = itemBinding.KN;
        Intrinsics.checkNotNullExpressionValue(timelineItemBg, "timelineItemBg");
        this.mUb = timelineItemBg;
        this.gh = itemBinding.getRoot().getResources().getDimensionPixelSize(2131166384);
    }

    @Override // yc.AbstractC2448d
    public int J2() {
        return this.f75740t;
    }

    @Override // yc.AbstractC2448d
    public TimelineLayoutManager.j.EnumC0632j Uo() {
        return this.rl;
    }

    public final SJ0.rd az() {
        return this.f75739n;
    }

    @Override // yc.AbstractC2448d
    public void nr(Scene scene, SceneElement element, int i2, SceneThumbnailMaker sceneThumbnailMaker, final List list, int i3, boolean z2) {
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(element, "element");
        this.f75740t = i2;
        this.mUb.setColors(oJ.rl(element));
        this.mUb.setTagColors(element.getTag().getColors());
        View view = this.itemView;
        TimelineLayoutManager.j jVar = new TimelineLayoutManager.j(element.getStartTime(), element.getEndTime(), 0, null, 0, 0, 60, null);
        int i5 = this.gh;
        ((ViewGroup.MarginLayoutParams) jVar).leftMargin = i5;
        ((ViewGroup.MarginLayoutParams) jVar).rightMargin = i5;
        jVar.mUb(i2);
        jVar.gh(TimelineLayoutManager.j.EnumC0632j.f45185t);
        view.setLayoutParams(jVar);
        List<Keyable<? extends Object>> keyableProperties = SceneElementKt.getKeyableProperties(element);
        final ArrayList arrayList = new ArrayList();
        Iterator<T> it = keyableProperties.iterator();
        while (it.hasNext()) {
            List keyframesIfKeyed = KeyableKt.getKeyframesIfKeyed((Keyable) it.next());
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(keyframesIfKeyed, 10));
            Iterator it2 = keyframesIfKeyed.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Float.valueOf(((Keyframe) it2.next()).getTime()));
            }
            CollectionsKt.addAll(arrayList, arrayList2);
        }
        if (element.getType().getHasFillImage() && element.getFillImage() != null && element.getFillType() == FillType.MEDIA) {
            this.KN.setVisibility(0);
            this.xMQ.setVisibility(4);
            this.KN.setInTime(0L);
            this.KN.setOutTime(element.getEndTime() - element.getStartTime());
            this.KN.setVideoUri(null);
            this.KN.setImageUri(element.getFillImage());
        } else if (element.getType().getHasFillVideo() && element.getFillVideo() != null && element.getFillType() == FillType.MEDIA) {
            this.KN.setVisibility(0);
            this.xMQ.setVisibility(4);
            this.KN.setInTime(element.getInTime());
            this.KN.setOutTime(Math.min(element.getOutTime(), element.getInTime() + (element.getEndTime() - element.getStartTime())));
            this.KN.setImageUri(null);
            this.KN.setVideoUri(element.getFillVideo());
        } else if (element.getType() == SceneElementType.Audio) {
            this.KN.setVisibility(4);
            this.KN.setImageUri(null);
            this.KN.setVideoUri(null);
            this.xMQ.setVisibility(0);
            this.xMQ.setAudioUri(element.getSrc());
            this.xMQ.setInTime(element.getInTime());
            this.xMQ.setOutTime(Math.min(element.getOutTime(), element.getInTime() + (element.getEndTime() - element.getStartTime())));
            this.xMQ.setLoop(element.getLoop());
        } else {
            this.KN.setVisibility(4);
            this.xMQ.setVisibility(4);
            this.KN.setImageUri(null);
            this.KN.setVideoUri(null);
        }
        this.f75738O.setKeyablePropertiesSelected(i3);
        if (list != null) {
            XoT.C.Uo(this, new Function0() { // from class: yc.ZhI
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Fo.mUb(list, arrayList);
                }
            });
            this.f75738O.setAltKeyframeTimes(CollectionsKt.toList(arrayList));
            this.f75738O.setKeyframeTimes(CollectionsKt.toList(list));
        } else {
            XoT.C.Uo(this, new Function0() { // from class: yc.yht
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Fo.gh(arrayList);
                }
            });
            this.f75738O.setKeyframeTimes(CollectionsKt.emptyList());
            this.f75738O.setAltKeyframeTimes(CollectionsKt.toList(arrayList));
        }
        this.f75738O.setTimeScaleFactor(1.0f);
        this.f75738O.setTimeOffset(0.0f);
        this.f75738O.invalidate();
        this.J2.setText(SceneElementKt.getDisplayLabel(element));
        this.Uo.setVisibility(8);
        this.J2.setTextColor(element.getType() == SceneElementType.Audio ? -1 : -16777216);
    }

    public final KeyframeView qie() {
        return this.f75738O;
    }

    public final int ty() {
        return this.gh;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String gh(List list) {
        return "rebind keyframes : edit=null key=" + list.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String mUb(List list, List list2) {
        return "rebind keyframes : edit=" + list.size() + " key=" + list2.size();
    }
}
