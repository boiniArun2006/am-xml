package com.alightcreative.app.motion.scene.animators;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001d\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0006H&¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/alightcreative/app/motion/scene/animators/Animator;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "animate", "value", "env", "Lcom/alightcreative/app/motion/scene/animators/AnimatorEnvironment;", "(Ljava/lang/Object;Lcom/alightcreative/app/motion/scene/animators/AnimatorEnvironment;)Ljava/lang/Object;", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface Animator<T> {
    T animate(T value, AnimatorEnvironment env);
}
