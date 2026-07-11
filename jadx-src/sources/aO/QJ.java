package aO;

import android.media.MediaCodec;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class QJ implements Function0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ MediaCodec.CodecException f12853n;

    public QJ(MediaCodec.CodecException codecException) {
        this.f12853n = codecException;
    }

    @Override // kotlin.jvm.functions.Function0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final String invoke() {
        return "CodecException: " + this.f12853n;
    }
}
