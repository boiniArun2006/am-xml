package com.alightcreative.app.motion.scene;

import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/alightcreative/app/motion/scene/StyledTextWithParams;", "", "text", "Lcom/alightcreative/app/motion/scene/StyledText;", "params", "Lcom/alightcreative/app/motion/scene/StyleParams;", "<init>", "(Lcom/alightcreative/app/motion/scene/StyledText;Lcom/alightcreative/app/motion/scene/StyleParams;)V", "getText", "()Lcom/alightcreative/app/motion/scene/StyledText;", "getParams", "()Lcom/alightcreative/app/motion/scene/StyleParams;", "component1", "component2", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StyledTextWithParams {
    public static final int $stable = 0;
    private final StyleParams params;
    private final StyledText text;

    public static /* synthetic */ StyledTextWithParams copy$default(StyledTextWithParams styledTextWithParams, StyledText styledText, StyleParams styleParams, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            styledText = styledTextWithParams.text;
        }
        if ((i2 & 2) != 0) {
            styleParams = styledTextWithParams.params;
        }
        return styledTextWithParams.copy(styledText, styleParams);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final StyledText getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final StyleParams getParams() {
        return this.params;
    }

    public final StyledTextWithParams copy(StyledText text, StyleParams params) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(params, "params");
        return new StyledTextWithParams(text, params);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StyledTextWithParams)) {
            return false;
        }
        StyledTextWithParams styledTextWithParams = (StyledTextWithParams) other;
        return Intrinsics.areEqual(this.text, styledTextWithParams.text) && Intrinsics.areEqual(this.params, styledTextWithParams.params);
    }

    public int hashCode() {
        return (this.text.hashCode() * 31) + this.params.hashCode();
    }

    public String toString() {
        return "StyledTextWithParams(text=" + this.text + ", params=" + this.params + ")";
    }

    public StyledTextWithParams(StyledText text, StyleParams params) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(params, "params");
        this.text = text;
        this.params = params;
    }

    public final StyleParams getParams() {
        return this.params;
    }

    public final StyledText getText() {
        return this.text;
    }
}
