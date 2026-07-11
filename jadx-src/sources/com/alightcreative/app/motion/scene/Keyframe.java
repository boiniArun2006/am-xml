package com.alightcreative.app.motion.scene;

import androidx.compose.runtime.internal.StabilityInferred;
import com.alightcreative.app.motion.easing.Easing;
import com.alightcreative.app.motion.easing.LinearEasing;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B-\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0015\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J<\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0013\u0010\u0003\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, d2 = {"Lcom/alightcreative/app/motion/scene/Keyframe;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "value", "time", "", "easing", "Lcom/alightcreative/app/motion/easing/Easing;", "smoothing", "Lcom/alightcreative/app/motion/scene/Smoothing;", "<init>", "(Ljava/lang/Object;FLcom/alightcreative/app/motion/easing/Easing;Lcom/alightcreative/app/motion/scene/Smoothing;)V", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getTime", "()F", "getEasing", "()Lcom/alightcreative/app/motion/easing/Easing;", "getSmoothing", "()Lcom/alightcreative/app/motion/scene/Smoothing;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Object;FLcom/alightcreative/app/motion/easing/Easing;Lcom/alightcreative/app/motion/scene/Smoothing;)Lcom/alightcreative/app/motion/scene/Keyframe;", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nKeyable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Keyable.kt\ncom/alightcreative/app/motion/scene/Keyframe\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,654:1\n1#2:655\n*E\n"})
public final /* data */ class Keyframe<T> {
    public static final int $stable = 0;
    private final Easing easing;
    private final Smoothing smoothing;
    private final float time;
    private final T value;

    public Keyframe(T t3, float f3, Easing easing, Smoothing smoothing) {
        Intrinsics.checkNotNullParameter(easing, "easing");
        Intrinsics.checkNotNullParameter(smoothing, "smoothing");
        this.value = t3;
        this.time = f3;
        this.easing = easing;
        this.smoothing = smoothing;
        if (Float.isInfinite(f3) || Float.isNaN(f3)) {
            throw new IllegalArgumentException(("Time for keyframe must be finite: " + f3).toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Keyframe copy$default(Keyframe keyframe, Object obj, float f3, Easing easing, Smoothing smoothing, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            obj = keyframe.value;
        }
        if ((i2 & 2) != 0) {
            f3 = keyframe.time;
        }
        if ((i2 & 4) != 0) {
            easing = keyframe.easing;
        }
        if ((i2 & 8) != 0) {
            smoothing = keyframe.smoothing;
        }
        return keyframe.copy(obj, f3, easing, smoothing);
    }

    public final T component1() {
        return this.value;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Easing getEasing() {
        return this.easing;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Smoothing getSmoothing() {
        return this.smoothing;
    }

    public final Keyframe<T> copy(T value, float time, Easing easing, Smoothing smoothing) {
        Intrinsics.checkNotNullParameter(easing, "easing");
        Intrinsics.checkNotNullParameter(smoothing, "smoothing");
        return new Keyframe<>(value, time, easing, smoothing);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Keyframe)) {
            return false;
        }
        Keyframe keyframe = (Keyframe) other;
        return Intrinsics.areEqual(this.value, keyframe.value) && Float.compare(this.time, keyframe.time) == 0 && Intrinsics.areEqual(this.easing, keyframe.easing) && this.smoothing == keyframe.smoothing;
    }

    public int hashCode() {
        T t3 = this.value;
        return ((((((t3 == null ? 0 : t3.hashCode()) * 31) + Float.hashCode(this.time)) * 31) + this.easing.hashCode()) * 31) + this.smoothing.hashCode();
    }

    public String toString() {
        return "Keyframe(value=" + this.value + ", time=" + this.time + ", easing=" + this.easing + ", smoothing=" + this.smoothing + ")";
    }

    public final Easing getEasing() {
        return this.easing;
    }

    public final Smoothing getSmoothing() {
        return this.smoothing;
    }

    public final float getTime() {
        return this.time;
    }

    public final T getValue() {
        return this.value;
    }

    public /* synthetic */ Keyframe(Object obj, float f3, Easing easing, Smoothing smoothing, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i2 & 2) != 0 ? 0.0f : f3, (i2 & 4) != 0 ? LinearEasing.INSTANCE : easing, (i2 & 8) != 0 ? Smoothing.None : smoothing);
    }
}
