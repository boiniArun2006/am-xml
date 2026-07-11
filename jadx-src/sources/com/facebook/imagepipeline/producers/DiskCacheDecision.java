package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.request.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class DiskCacheDecision {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final DiskCacheDecision f52463n = new DiskCacheDecision();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00060\u0002j\u0002`\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/facebook/imagepipeline/producers/DiskCacheDecision$DiskCacheDecisionNoDiskCacheChosenException;", "Lkotlin/Exception;", "Ljava/lang/Exception;", "message", "", "<init>", "(Ljava/lang/String;)V", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DiskCacheDecisionNoDiskCacheChosenException extends Exception {
        public DiskCacheDecisionNoDiskCacheChosenException(String str) {
            super(str);
        }
    }

    public static final FSZ.Dsr n(com.facebook.imagepipeline.request.j imageRequest, FSZ.Dsr dsr, FSZ.Dsr dsr2, Map map) {
        String strUo;
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        if (imageRequest.nr() == j.n.SMALL) {
            return dsr;
        }
        if (imageRequest.nr() == j.n.DEFAULT) {
            return dsr2;
        }
        if (imageRequest.nr() != j.n.DYNAMIC || map == null || (strUo = imageRequest.Uo()) == null) {
            return null;
        }
        return (FSZ.Dsr) map.get(strUo);
    }

    private DiskCacheDecision() {
    }
}
