package com.bendingspoons.fellini.audioprocessing.resampler.libresample;

import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/bendingspoons/fellini/audioprocessing/resampler/libresample/SRCErrBadMode;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "()V", "audioprocessing_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class SRCErrBadMode extends Exception {
    public SRCErrBadMode() {
        super("Calling mode differs from initialisation mode (ie process v callback).");
    }
}
