package com.google.android.exoplayer2.mediacodec;

import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public interface MediaCodecSelector {
    public static final MediaCodecSelector DEFAULT = new MediaCodecSelector() { // from class: com.google.android.exoplayer2.mediacodec.aC
        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecSelector
        public final List getDecoderInfos(String str, boolean z2, boolean z3) {
            return MediaCodecUtil.getDecoderInfos(str, z2, z3);
        }
    };

    List<MediaCodecInfo> getDecoderInfos(String str, boolean z2, boolean z3) throws MediaCodecUtil.DecoderQueryException;
}
