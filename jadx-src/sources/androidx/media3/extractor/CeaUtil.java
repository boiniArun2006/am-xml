package androidx.media3.extractor;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@UnstableApi
public final class CeaUtil {
    private static final int COUNTRY_CODE = 181;
    private static final int PAYLOAD_TYPE_CC = 4;
    private static final int PROVIDER_CODE_ATSC = 49;
    private static final int PROVIDER_CODE_DIRECTV = 47;
    private static final String TAG = "CeaUtil";
    public static final int USER_DATA_IDENTIFIER_GA94 = 1195456820;
    public static final int USER_DATA_TYPE_CODE_MPEG_CC = 3;

    private static int readNon255TerminatedValue(ParsableByteArray parsableByteArray) {
        int i2 = 0;
        while (parsableByteArray.bytesLeft() != 0) {
            int unsignedByte = parsableByteArray.readUnsignedByte();
            i2 += unsignedByte;
            if (unsignedByte != 255) {
                return i2;
            }
        }
        return -1;
    }

    private CeaUtil() {
    }

    public static void consume(long j2, ParsableByteArray parsableByteArray, TrackOutput[] trackOutputArr) {
        int i2;
        boolean z2;
        while (true) {
            boolean z3 = true;
            if (parsableByteArray.bytesLeft() > 1) {
                int non255TerminatedValue = readNon255TerminatedValue(parsableByteArray);
                int non255TerminatedValue2 = readNon255TerminatedValue(parsableByteArray);
                int position = parsableByteArray.getPosition() + non255TerminatedValue2;
                if (non255TerminatedValue2 != -1 && non255TerminatedValue2 <= parsableByteArray.bytesLeft()) {
                    if (non255TerminatedValue == 4 && non255TerminatedValue2 >= 8) {
                        int unsignedByte = parsableByteArray.readUnsignedByte();
                        int unsignedShort = parsableByteArray.readUnsignedShort();
                        if (unsignedShort == 49) {
                            i2 = parsableByteArray.readInt();
                        } else {
                            i2 = 0;
                        }
                        int unsignedByte2 = parsableByteArray.readUnsignedByte();
                        if (unsignedShort == 47) {
                            parsableByteArray.skipBytes(1);
                        }
                        if (unsignedByte == COUNTRY_CODE && ((unsignedShort == 49 || unsignedShort == 47) && unsignedByte2 == 3)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (unsignedShort == 49) {
                            if (i2 != 1195456820) {
                                z3 = false;
                            }
                            z2 &= z3;
                        }
                        if (z2) {
                            consumeCcData(j2, parsableByteArray, trackOutputArr);
                        }
                    }
                } else {
                    Log.w(TAG, "Skipping remainder of malformed SEI NAL unit.");
                    position = parsableByteArray.limit();
                }
                parsableByteArray.setPosition(position);
            } else {
                return;
            }
        }
    }

    public static void consumeCcData(long j2, ParsableByteArray parsableByteArray, TrackOutput[] trackOutputArr) {
        boolean z2;
        int unsignedByte = parsableByteArray.readUnsignedByte();
        if ((unsignedByte & 64) != 0) {
            parsableByteArray.skipBytes(1);
            int i2 = (unsignedByte & 31) * 3;
            int position = parsableByteArray.getPosition();
            for (TrackOutput trackOutput : trackOutputArr) {
                parsableByteArray.setPosition(position);
                trackOutput.sampleData(parsableByteArray, i2);
                if (j2 != -9223372036854775807L) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Assertions.checkState(z2);
                trackOutput.sampleMetadata(j2, 1, i2, 0, null);
            }
        }
    }
}
