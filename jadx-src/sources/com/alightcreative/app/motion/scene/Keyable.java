package com.alightcreative.app.motion.scene;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.alightcreative.app.motion.scene.animators.Animator;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J%\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u0013H&¢\u0006\u0002\u0010\u0014JD\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\b2\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0014\b\u0002\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\bH&R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/alightcreative/app/motion/scene/Keyable;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "keyed", "", "getKeyed", "()Z", "keyframes", "", "Lcom/alightcreative/app/motion/scene/Keyframe;", "getKeyframes", "()Ljava/util/List;", "animators", "Lcom/alightcreative/app/motion/scene/animators/Animator;", "getAnimators", "interp", "v1", "v2", TtmlNode.TAG_P, "", "(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;", "copyWith", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface Keyable<T> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Keyable copyWith$default(Keyable keyable, List list, boolean z2, List list2, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copyWith");
            }
            if ((i2 & 1) != 0) {
                list = keyable.getKeyframes();
            }
            if ((i2 & 2) != 0) {
                z2 = keyable.getKeyed();
            }
            if ((i2 & 4) != 0) {
                list2 = keyable.getAnimators();
            }
            return keyable.copyWith(list, z2, list2);
        }
    }

    Keyable<T> copyWith(List<Keyframe<T>> keyframes, boolean keyed, List<? extends Animator<T>> animators);

    List<Animator<T>> getAnimators();

    boolean getKeyed();

    List<Keyframe<T>> getKeyframes();

    T interp(T v1, T v2, float p2);
}
