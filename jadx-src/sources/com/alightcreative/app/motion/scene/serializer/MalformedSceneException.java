package com.alightcreative.app.motion.scene.serializer;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/alightcreative/app/motion/scene/serializer/MalformedSceneException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "cause", "", "hasPositionInfo", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;Z)V", "getHasPositionInfo", "()Z", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MalformedSceneException extends Exception {
    public static final int $stable = 0;
    private final boolean hasPositionInfo;

    public MalformedSceneException() {
        this(null, null, false, 7, null);
    }

    public MalformedSceneException(String str, Throwable th, boolean z2) {
        super(str, th);
        this.hasPositionInfo = z2;
    }

    public final boolean getHasPositionInfo() {
        return this.hasPositionInfo;
    }

    public /* synthetic */ MalformedSceneException(String str, Throwable th, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : th, (i2 & 4) != 0 ? false : z2);
    }
}
