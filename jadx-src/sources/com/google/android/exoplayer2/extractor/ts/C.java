package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.CeaUtil;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.ts.TsPayloadReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class C {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f57873n;
    private final TrackOutput[] rl;

    public void rl(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        for (int i2 = 0; i2 < this.rl.length; i2++) {
            trackIdGenerator.generateNewId();
            TrackOutput trackOutputTrack = extractorOutput.track(trackIdGenerator.getTrackId(), 3);
            Format format = (Format) this.f57873n.get(i2);
            String str = format.sampleMimeType;
            Assertions.checkArgument("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption mime type provided: " + str);
            trackOutputTrack.format(new Format.Builder().setId(trackIdGenerator.getFormatId()).setSampleMimeType(str).setSelectionFlags(format.selectionFlags).setLanguage(format.language).setAccessibilityChannel(format.accessibilityChannel).setInitializationData(format.initializationData).build());
            this.rl[i2] = trackOutputTrack;
        }
    }

    public C(List list) {
        this.f57873n = list;
        this.rl = new TrackOutput[list.size()];
    }

    public void n(long j2, ParsableByteArray parsableByteArray) {
        if (parsableByteArray.bytesLeft() >= 9) {
            int i2 = parsableByteArray.readInt();
            int i3 = parsableByteArray.readInt();
            int unsignedByte = parsableByteArray.readUnsignedByte();
            if (i2 == 434 && i3 == 1195456820 && unsignedByte == 3) {
                CeaUtil.consumeCcData(j2, parsableByteArray, this.rl);
            }
        }
    }
}
