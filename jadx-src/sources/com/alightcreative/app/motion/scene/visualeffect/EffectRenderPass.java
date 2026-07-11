package com.alightcreative.app.motion.scene.visualeffect;

import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/alightcreative/app/motion/scene/visualeffect/EffectRenderPass;", "", "target", "", "blend", "innerEffect", "src", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTarget", "()Ljava/lang/String;", "getBlend", "getInnerEffect", "getSrc", "component1", "component2", "component3", "component4", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EffectRenderPass {
    public static final int $stable = 0;
    private final String blend;
    private final String innerEffect;
    private final String src;
    private final String target;

    public static /* synthetic */ EffectRenderPass copy$default(EffectRenderPass effectRenderPass, String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = effectRenderPass.target;
        }
        if ((i2 & 2) != 0) {
            str2 = effectRenderPass.blend;
        }
        if ((i2 & 4) != 0) {
            str3 = effectRenderPass.innerEffect;
        }
        if ((i2 & 8) != 0) {
            str4 = effectRenderPass.src;
        }
        return effectRenderPass.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTarget() {
        return this.target;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBlend() {
        return this.blend;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getInnerEffect() {
        return this.innerEffect;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSrc() {
        return this.src;
    }

    public final EffectRenderPass copy(String target, String blend, String innerEffect, String src) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(blend, "blend");
        Intrinsics.checkNotNullParameter(innerEffect, "innerEffect");
        Intrinsics.checkNotNullParameter(src, "src");
        return new EffectRenderPass(target, blend, innerEffect, src);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EffectRenderPass)) {
            return false;
        }
        EffectRenderPass effectRenderPass = (EffectRenderPass) other;
        return Intrinsics.areEqual(this.target, effectRenderPass.target) && Intrinsics.areEqual(this.blend, effectRenderPass.blend) && Intrinsics.areEqual(this.innerEffect, effectRenderPass.innerEffect) && Intrinsics.areEqual(this.src, effectRenderPass.src);
    }

    public int hashCode() {
        return (((((this.target.hashCode() * 31) + this.blend.hashCode()) * 31) + this.innerEffect.hashCode()) * 31) + this.src.hashCode();
    }

    public String toString() {
        return "EffectRenderPass(target=" + this.target + ", blend=" + this.blend + ", innerEffect=" + this.innerEffect + ", src=" + this.src + ")";
    }

    public EffectRenderPass(String target, String blend, String innerEffect, String src) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(blend, "blend");
        Intrinsics.checkNotNullParameter(innerEffect, "innerEffect");
        Intrinsics.checkNotNullParameter(src, "src");
        this.target = target;
        this.blend = blend;
        this.innerEffect = innerEffect;
        this.src = src;
    }

    public final String getBlend() {
        return this.blend;
    }

    public final String getInnerEffect() {
        return this.innerEffect;
    }

    public final String getSrc() {
        return this.src;
    }

    public final String getTarget() {
        return this.target;
    }
}
