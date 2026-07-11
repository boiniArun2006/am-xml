package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.metadata.mp4.SlowMotionData;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import t1.l3D;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class Dsr {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f57814n = new ArrayList();
    private int rl = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f57815t;
    private static final l3D nr = l3D.nr(':');

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final l3D f57813O = l3D.nr('*');

    private static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f57816n;
        public final long rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final int f57817t;

        public j(int i2, long j2, int i3) {
            this.f57816n = i2;
            this.rl = j2;
            this.f57817t = i3;
        }
    }

    private static SlowMotionData J2(ParsableByteArray parsableByteArray, int i2) throws ParserException {
        ArrayList arrayList = new ArrayList();
        List listJ2 = f57813O.J2(parsableByteArray.readString(i2));
        for (int i3 = 0; i3 < listJ2.size(); i3++) {
            List listJ22 = nr.J2((CharSequence) listJ2.get(i3));
            if (listJ22.size() != 3) {
                throw ParserException.createForMalformedContainer(null, null);
            }
            try {
                arrayList.add(new SlowMotionData.Segment(Long.parseLong((String) listJ22.get(0)), Long.parseLong((String) listJ22.get(1)), 1 << (Integer.parseInt((String) listJ22.get(2)) - 1)));
            } catch (NumberFormatException e2) {
                throw ParserException.createForMalformedContainer(null, e2);
            }
        }
        return new SlowMotionData(arrayList);
    }

    private void n(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        ParsableByteArray parsableByteArray = new ParsableByteArray(8);
        extractorInput.readFully(parsableByteArray.getData(), 0, 8);
        this.f57815t = parsableByteArray.readLittleEndianInt() + 8;
        if (parsableByteArray.readInt() != 1397048916) {
            positionHolder.position = 0L;
        } else {
            positionHolder.position = extractorInput.getPosition() - ((long) (this.f57815t - 12));
            this.rl = 2;
        }
    }

    public void Uo() {
        this.f57814n.clear();
        this.rl = 0;
    }

    public int t(ExtractorInput extractorInput, PositionHolder positionHolder, List list) throws IOException {
        int i2 = this.rl;
        long j2 = 0;
        if (i2 == 0) {
            long length = extractorInput.getLength();
            if (length != -1 && length >= 8) {
                j2 = length - 8;
            }
            positionHolder.position = j2;
            this.rl = 1;
        } else if (i2 == 1) {
            n(extractorInput, positionHolder);
        } else if (i2 == 2) {
            nr(extractorInput, positionHolder);
        } else {
            if (i2 != 3) {
                throw new IllegalStateException();
            }
            O(extractorInput, list);
            positionHolder.position = 0L;
        }
        return 1;
    }

    private void O(ExtractorInput extractorInput, List list) throws IOException {
        long position = extractorInput.getPosition();
        int length = (int) ((extractorInput.getLength() - extractorInput.getPosition()) - ((long) this.f57815t));
        ParsableByteArray parsableByteArray = new ParsableByteArray(length);
        extractorInput.readFully(parsableByteArray.getData(), 0, length);
        for (int i2 = 0; i2 < this.f57814n.size(); i2++) {
            j jVar = (j) this.f57814n.get(i2);
            parsableByteArray.setPosition((int) (jVar.rl - position));
            parsableByteArray.skipBytes(4);
            int littleEndianInt = parsableByteArray.readLittleEndianInt();
            int iRl = rl(parsableByteArray.readString(littleEndianInt));
            int i3 = jVar.f57817t - (littleEndianInt + 8);
            if (iRl != 2192) {
                if (iRl != 2816 && iRl != 2817 && iRl != 2819 && iRl != 2820) {
                    throw new IllegalStateException();
                }
            } else {
                list.add(J2(parsableByteArray, i3));
            }
        }
    }

    private void nr(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        long length = extractorInput.getLength();
        int i2 = this.f57815t - 20;
        ParsableByteArray parsableByteArray = new ParsableByteArray(i2);
        extractorInput.readFully(parsableByteArray.getData(), 0, i2);
        for (int i3 = 0; i3 < i2 / 12; i3++) {
            parsableByteArray.skipBytes(2);
            short littleEndianShort = parsableByteArray.readLittleEndianShort();
            if (littleEndianShort != 2192 && littleEndianShort != 2816 && littleEndianShort != 2817 && littleEndianShort != 2819 && littleEndianShort != 2820) {
                parsableByteArray.skipBytes(8);
            } else {
                this.f57814n.add(new j(littleEndianShort, (length - ((long) this.f57815t)) - ((long) parsableByteArray.readLittleEndianInt()), parsableByteArray.readLittleEndianInt()));
            }
        }
        if (this.f57814n.isEmpty()) {
            positionHolder.position = 0L;
        } else {
            this.rl = 3;
            positionHolder.position = ((j) this.f57814n.get(0)).rl;
        }
    }

    private static int rl(String str) throws ParserException {
        str.getClass();
        switch (str) {
            case "SlowMotion_Data":
                return 2192;
            case "Super_SlowMotion_Edit_Data":
                return 2819;
            case "Super_SlowMotion_Data":
                return 2816;
            case "Super_SlowMotion_Deflickering_On":
                return 2820;
            case "Super_SlowMotion_BGM":
                return 2817;
            default:
                throw ParserException.createForMalformedContainer("Invalid SEF name", null);
        }
    }
}
