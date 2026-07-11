package com.alightcreative.app.motion.project;

import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\t\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/alightcreative/app/motion/project/VideoResolutionTooHighException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "width", "height", "maxRes", "<init>", "(III)V", c.f62177j, "I", "t", "()I", "O", "rl", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class VideoResolutionTooHighException extends Exception {

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final int maxRes;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int width;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final int height;

    public VideoResolutionTooHighException(int i2, int i3, int i5) {
        super("The video resolution (" + i2 + "x" + i3 + ") is too high for this device (max " + i5 + ")");
        this.width = i2;
        this.height = i3;
        this.maxRes = i5;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final int getMaxRes() {
        return this.maxRes;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final int getWidth() {
        return this.width;
    }
}
