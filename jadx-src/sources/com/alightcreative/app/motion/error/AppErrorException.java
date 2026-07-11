package com.alightcreative.app.motion.error;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import neA.j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/alightcreative/app/motion/error/AppErrorException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "LneA/j;", "appError", "<init>", "(LneA/j;)V", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AppErrorException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppErrorException(j appError) {
        super(appError.rl() + ": " + appError.t());
        Intrinsics.checkNotNullParameter(appError, "appError");
    }
}
