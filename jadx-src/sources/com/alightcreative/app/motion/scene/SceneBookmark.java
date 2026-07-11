package com.alightcreative.app.motion.scene;

import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/alightcreative/app/motion/scene/SceneBookmark;", "", "appearance", "", "<init>", "(I)V", "getAppearance", "()I", "component1", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SceneBookmark {
    public static final int $stable = 0;
    private final int appearance;

    public static /* synthetic */ SceneBookmark copy$default(SceneBookmark sceneBookmark, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = sceneBookmark.appearance;
        }
        return sceneBookmark.copy(i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getAppearance() {
        return this.appearance;
    }

    public final SceneBookmark copy(int appearance) {
        return new SceneBookmark(appearance);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SceneBookmark) && this.appearance == ((SceneBookmark) other).appearance;
    }

    public int hashCode() {
        return Integer.hashCode(this.appearance);
    }

    public String toString() {
        return "SceneBookmark(appearance=" + this.appearance + ")";
    }

    public final int getAppearance() {
        return this.appearance;
    }

    public SceneBookmark(int i2) {
        this.appearance = i2;
    }
}
