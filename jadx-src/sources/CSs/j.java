package CSs;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.source.SampleStream;
import w9.fuX;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public interface j extends SampleStream, SeekMap, fuX {
    Format getFormat();

    void n(SeekPoint seekPoint);
}
